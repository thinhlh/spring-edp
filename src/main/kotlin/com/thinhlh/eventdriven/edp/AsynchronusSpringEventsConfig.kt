package com.thinhlh.eventdriven.edp

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.ApplicationEventMulticaster
import org.springframework.context.event.SimpleApplicationEventMulticaster
import org.springframework.core.task.SimpleAsyncTaskExecutor


//@Configuration
//class AsynchronousSpringEventsConfig {
//    @Bean(name = arrayOf("applicationEventMulticaster"))
//    fun simpleApplicationEventMulticaster(): ApplicationEventMulticaster {
//        val eventMulticaster = SimpleApplicationEventMulticaster()
//        eventMulticaster.setTaskExecutor(SimpleAsyncTaskExecutor())
//        return eventMulticaster
//    }
//}