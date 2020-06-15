package net.lustenauer.spring.webcustomertracker.controller

import net.lustenauer.spring.webcustomertracker.entity.Customer
import net.lustenauer.spring.webcustomertracker.service.CustomerService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/customer")
class CustomerController(val customerService: CustomerService) {
    val logger: Logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/list")
    fun listCustomers(model: Model): String {
        // get the customers from the service
        val customers = customerService.getCustomers()

        // add the customers to the model
        model.addAttribute("customers", customers)

        return "list-customers"
    }

    @GetMapping("/showFormForAdd")
    fun showFormForAdd(model: Model): String {
        val customer = Customer()
        model.addAttribute(customer)

        return "customer-form"
    }

    @GetMapping("/showFormForUpdate")
    fun showFormForUpdate(@RequestParam("customerId") customerId: Int, model: Model): String {
        val customer = customerService.getCustomer(customerId)
        model.addAttribute(customer)
        return "customer-form"
    }


    @PostMapping("/saveCustomer")
    fun saveCustomer(@ModelAttribute("customer") customer: Customer): String {
        logger.trace("saveCustomer(customer:= ${customer})")
        customerService.saveCustomer(customer)
        return "redirect:/customer/list"
    }

    @GetMapping("/delete")
    fun delete(@RequestParam ("customerId") customerId:Int):String{
        logger.trace("delete(customerId:= ${customerId})")

        customerService.deleteCustomer(customerId)
        return "redirect:/customer/list"
    }
}