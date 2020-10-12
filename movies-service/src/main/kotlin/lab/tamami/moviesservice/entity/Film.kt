package lab.tamami.moviesservice.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "film")
data class Film(
        @Id @Column(name = "film_id")
        var filmId: Int,
        var title: String,
        var description: String,
        var releaseYear: Int,
        var languageId: Int,
        var rentalDuration: Int,
        var rentalRate: Float,
        var length: Int,
        var replacementCost: Float,
        var rating: String,
        var lastUpdate: Date,
        var specialFeatures: String,
        var fulltext: String
) {
    constructor(): this(0, "", "", 0, 0, 0, 0.0f, 0, 0.0f,
    "", Date(), "", "")

    override fun toString(): String {
        return "[" + filmId + " : " + title + " : " + releaseYear + " : " + rating + "]"
    }
}