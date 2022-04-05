package com.thinhlh.eventdriven.common

import java.sql.Timestamp
import java.time.Instant

class BranchB : Actions {
    override fun sendReportToCompany() {
        System.out.println("Long task...")
        System.out.println("Branch B sent! at ${Timestamp.from(Instant.now())}")
    }

}