package com.thinhlh.eventdriven.common

class CompanyWithOutEDP {
    val branchA: BranchA = BranchA()
    val branchB: BranchB = BranchB()
    val branchC: BranchC = BranchC()

    fun requireReport() {
        branchA.sendReportToCompany()
        branchB.sendReportToCompany()
        branchC.sendReportToCompany()
    }
}