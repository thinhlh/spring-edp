package com.thinhlh.eventdriven.edp

import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.stereotype.Component

@EnableAsync
@Component
class BranchB {
    @Async
    @EventListener
    fun reportFromB(event: SendReportEvent) {
        System.out.println("Long task...")
        Thread.sleep(5000)
        System.out.println("Branch B sent report after receiving message: ${event.message}")
    }
}