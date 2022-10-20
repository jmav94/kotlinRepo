data class YoutubePlayer(val playPercentage: Int)

fun logYoutube(player: YoutubePlayer?) {
    if (player == null) {
        return
    }
    // playPercentage es una propiedad de YoutubePlayer
    val percentComplete: Int = player.playPercentage
    val quartile: Int
    val percentQuartile: Float
    if (percentComplete >= 0 && percentComplete < 25) {
        quartile = 0
        percentQuartile = 0f
    } else if (percentComplete >= 25 && percentComplete < 50) {
        quartile = 1
        percentQuartile = .25f
    } else if (percentComplete >= 50 && percentComplete < 75) {
        quartile = 2
        percentQuartile = .50f
    } else if (percentComplete >= 75 && percentComplete < 95) {
        quartile = 3
        percentQuartile = .75f
    } else if (percentComplete >= 95 && percentComplete < 97) {
        quartile = 3
        percentQuartile = .95f
    } else if (percentComplete >= 97 && percentComplete < 100) {
        quartile = 3
        percentQuartile = .97f
    } else if (percentComplete == 100) {
        quartile = 4
        percentQuartile = 1f
    } else {
        quartile = -1
        percentQuartile = -1f
    }
    println(" Quartile is $quartile and percent quartile is $percentQuartile")
}