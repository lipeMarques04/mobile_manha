package view

fun main(args: Array<String>) {
    val musicController = controller.Music()
    val music = musicController.musicFactory(
        duration = 120,
        title = "Baton de cereja",
        composer = "Israel e Rodolfo",
        gender = "Sertanejo",
        yearOfRelease = 2021,
        record = "Globo Records",
        album = "Israel e Rodolfo Ao Vivo"
    )
    print(music)
}