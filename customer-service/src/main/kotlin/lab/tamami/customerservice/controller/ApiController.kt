package lab.tamami.customerservice.controller

import lab.tamami.customerservice.repo.CustomerRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class ApiController {

    @Autowired
    lateinit var repo: CustomerRepo

    @RequestMapping("/get-all-data")
    fun getAllData() = repo.findAll()

}