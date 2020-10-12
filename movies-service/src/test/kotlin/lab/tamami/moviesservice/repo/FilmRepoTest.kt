package lab.tamami.moviesservice.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FilmRepoTest {

    @Autowired
    lateinit var repo: FilmRepo

    val logger = LoggerFactory.getLogger(FilmRepoTest::class.java)

    @Test
    fun getAllDataTest() {
        val result = repo.findAll()
        logger.info("data : " + result.size)
        Assertions.assertNotNull(result)
    }

}