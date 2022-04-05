package com.thinhlh.eventdriven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EventDrivenApplication

fun main(args: Array<String>) {
    val context = runApplication<EventDrivenApplication>(*args)
    val company = context.getBean(com.thinhlh.eventdriven.edp.CompanyWithEDP::class.java)
    company.requireReport()
//    System.out.println("==============================")
//    val company2 = Company().requireReport()
}
