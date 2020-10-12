package lab.tamami.customerservice.repo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CustomerRepoTest {

    @Autowired
    lateinit var repo: CustomerRepo

    val logger = LoggerFactory.getLogger(CustomerRepoTest::class.java)

    @Test
    fun findAllTest() {
        val result = repo.findAll()
        logger.info("data : " + result.size)
        Assertions.assertNotNull(result)
    }

}