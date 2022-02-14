package view

import model.Classification
import model.MovieGender
import model.MusicGender

fun main(args: Array<String>) {
    val musicController = controller.Music()
    val music = musicController.musicFactory(
        duration = 120,
        title = "Baton de cereja",
        composer = "Israel e Rodolfo",
        gender = MusicGender.SERTANEJO,
        yearOfRelease = 2021,
        record = "Globo Records",
        album = "Israel e Rodolfo Ao Vivo"
    )
    println(music)

    val movieController = controller.Movie()
    val movie = movieController.movieFactory(
        title = "Jurassic Park - Domain",
        yearOfRelease = 2022,
        gender = MovieGender.ADVENTURE,
        duration = 120,
        classification = Classification.TEENAGE,
        premiere = true,
        director = "Steven Spielberg",
        screenwrite = "David Koepp, Michael Crichton"
    )

    print(movie)
}