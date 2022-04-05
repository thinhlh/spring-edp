package com.thinhlh.eventdriven.edp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.context.ApplicationEventPublisherAware
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class CompanyWithEDP : ApplicationEventPublisherAware {

    private lateinit var publisher: ApplicationEventPublisher

    override fun setApplicationEventPublisher(applicationEventPublisher: ApplicationEventPublisher) {
        this.publisher = applicationEventPublisher
    }

    fun requireReport() {
        System.out.println("Requiring reports...")
        publisher.publishEvent(SendReportEvent(this, "Require report in 5 minutes!"))
    }
}