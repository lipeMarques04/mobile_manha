package model

class Movie{
    var title: String
    var gender: MovieGender
    var duration: Short
    var classification:Classification
    var premiere: Boolean
    var yearOfRelease: Short
    var director:String
    var screenwriter: String

    constructor(
        title: String,
        gender:MovieGender,
        duration: Short,
        classification: Classification,
        premiere: Boolean,
        yearOfRelease: Short,
        director: String,
        screenwriter: String
    ){
        this.title = title
        this.gender = gender
        this.duration = duration
        this.classification = classification
        this.premiere = premiere
        this.yearOfRelease = yearOfRelease
        this.director = director
        this.screenwriter = screenwriter
    }
}
