package controller

import model.Classification
import model.Movie
import model.MovieGender

class Movie {
    fun movieFactory(
        title: String,
        gender: MovieGender,
        duration: Short,
        classification: Classification,
        premiere: Boolean,
        yearOfRelease: Short,
        director: String,
        screenwrite: String
    ) = model.Movie(
        title = title,
        gender = gender,
        duration = duration,
        classification = classification,
        premiere = premiere,
        yearOfRelease = yearOfRelease,
        director = director,
        screenwriter = screenwrite
    )
}