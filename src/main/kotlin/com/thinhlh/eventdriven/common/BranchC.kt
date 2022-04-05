package com.thinhlh.eventdriven.common

import java.sql.Timestamp
import java.time.Instant

class BranchC : Actions {
    override fun sendReportToCompany() {
        System.out.println("Branch C sent! at ${Timestamp.from(Instant.now())}")
    }
}