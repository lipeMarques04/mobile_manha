package controller

import model.Music

class Music {
     fun musicFactory(
        title :String,
        duration: Short,
        gender: String,
        yearOfRelease: Short,
        album: String,
        composer: String,
        record: String
    ):Music = model.Music(
        musicGender = gender,
        record = record,
        yearOfRelease = yearOfRelease,
        composer = composer,
        album = album,
        duration = duration,
        title = title
    )
}