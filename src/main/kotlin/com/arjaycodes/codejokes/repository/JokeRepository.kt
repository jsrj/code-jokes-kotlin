package com.arjaycodes.codejokes.repository

import com.arjaycodes.codejokes.entity.Joke
import org.springframework.data.repository.CrudRepository

interface JokeRepository : CrudRepository<Joke, Long> {
}