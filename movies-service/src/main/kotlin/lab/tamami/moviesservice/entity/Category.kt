package lab.tamami.moviesservice.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "category")
data class Category(
        @Id @Column(name = "category_id")
        var categoryId: Int,
        @Column(name = "name")
        var name: String,
        @Column(name = "last_update")
        var lastUpdate: Date
) {
    constructor(): this(0, "", Date())

    override fun toString(): String {
        return "[" + categoryId + " : " + name + " : " + lastUpdate.toString() + "]"
    }
}