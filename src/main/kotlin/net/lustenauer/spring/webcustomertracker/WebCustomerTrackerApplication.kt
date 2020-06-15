package net.lustenauer.spring.webcustomertracker

import net.lustenauer.spring.webcustomertracker.dao.CustomerRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.repository.CrudRepository

@SpringBootApplication
class WebCustomerTrackerApplication

fun main(args: Array<String>) {
    runApplication<WebCustomerTrackerApplication>(*args)
}
