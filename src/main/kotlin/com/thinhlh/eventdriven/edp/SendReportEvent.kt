package com.thinhlh.eventdriven.edp

import org.springframework.context.ApplicationEvent

class SendReportEvent(
    source: Any,
    val message: String
) : ApplicationEvent(source) {
}