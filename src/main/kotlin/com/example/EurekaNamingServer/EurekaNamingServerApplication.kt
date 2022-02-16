package com.example.EurekaNamingServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaNamingServerApplication

fun main(args: Array<String>) {
    runApplication<EurekaNamingServerApplication>(*args)
}
