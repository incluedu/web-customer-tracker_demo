package net.lustenauer.spring.webcustomertracker.service

import net.lustenauer.spring.webcustomertracker.entity.Customer

interface CustomerService {
    fun getCustomers():List<Customer>
    fun saveCustomer(customer:Customer)
    fun getCustomer(id: Int): Customer
    fun deleteCustomer(id:Int)
}