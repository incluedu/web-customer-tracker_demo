package net.lustenauer.spring.webcustomertracker.dao

import net.lustenauer.spring.webcustomertracker.entity.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Int>{
    fun findAllByOrderByLastName():List<Customer>
}
