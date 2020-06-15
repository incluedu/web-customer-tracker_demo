package net.lustenauer.spring.webcustomertracker.service

import net.lustenauer.spring.webcustomertracker.dao.CustomerRepository
import net.lustenauer.spring.webcustomertracker.entity.Customer
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CustomerServiceImpl(private val repository: CustomerRepository) : CustomerService {
    @Transactional
    override fun getCustomers(): List<Customer> = repository.findAllByOrderByLastName()

    @Transactional
    override fun saveCustomer(customer: Customer) {
        repository.save(customer)
    }

    @Transactional
    override fun getCustomer(id: Int): Customer {
        return repository.findById(id).get()
    }

    override fun deleteCustomer(id: Int) {
        repository.deleteById(id)
    }
}