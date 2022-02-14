package controller

import model.Music
import model.MusicGender

class Music {
     fun musicFactory(
        title :String,
        duration: Short,
        gender: MusicGender,
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