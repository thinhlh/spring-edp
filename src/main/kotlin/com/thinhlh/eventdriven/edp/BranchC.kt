package com.thinhlh.eventdriven.edp

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.stereotype.Component

@EnableAsync
@Component
class BranchC {
    @Async
    @EventListener
    fun reportFromC(event: SendReportEvent) {
        System.out.println("Long task...")
        Thread.sleep(5000)
        System.out.println("Branch C sent report after receiving message: ${event.message}")
    }
}