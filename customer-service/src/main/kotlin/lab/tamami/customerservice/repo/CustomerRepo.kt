package lab.tamami.customerservice.repo

import lab.tamami.customerservice.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepo: JpaRepository<Customer, Int> {
}