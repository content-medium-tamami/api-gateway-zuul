package lab.tamami.customerservice.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(
        @Id
        var customerId: Int,
        @Column
        var storeId: Int,
        @Column
        var firstName: String,
        @Column
        var lastName: String,
        @Column
        var email: String,
        @Column
        var addressId: Int,
        @Column
        var activebool: Boolean,
        @Column
        var createDate: Date,
        @Column
        var lastUpdate: Date,
        @Column
        var active: Int
) {
    constructor(): this(0, 0, "", "", "", 0, false,
    Date(), Date(), 0)

    override fun toString(): String {
        return "[" + customerId + " : " + storeId + " : " + firstName + " " + lastName + "]"
    }
}