package net.lustenauer.spring.webcustomertracker.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class WelcomeController {

    @RequestMapping("/")
    fun index():String = "index"
}