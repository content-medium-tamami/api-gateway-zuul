package lab.tamami.moviesservice.repo

import lab.tamami.moviesservice.entity.Film
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FilmRepo: JpaRepository<Film, Int> {
}