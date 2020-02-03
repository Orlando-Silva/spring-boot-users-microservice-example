package com.poc.microservices.user.user

import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableDiscoveryClient
@SpringBootApplication
class UserApplication

fun main(args: Array<String>) {
	runApplication<UserApplication>(*args)
}
