package com.thinhlh.eventdriven.edp

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.stereotype.Component
import java.sql.Timestamp
import java.time.Instant

@EnableAsync
@Component
class BranchA {
    @EventListener
    @Async
    fun reportFromA(event: SendReportEvent) {
        System.out.println("Long task...")
        Thread.sleep(5000)
        System.out.println("Branch A sent report after receiving message: ${event.message}")
    }
}



