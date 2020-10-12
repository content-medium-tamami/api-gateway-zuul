package lab.tamami.moviesservice.controller

import lab.tamami.moviesservice.repo.FilmRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movies")
class ApiController {

    @Autowired
    lateinit var repo: FilmRepo

    @RequestMapping("/get-all-data")
    fun getAllData() = repo.findAll()

}