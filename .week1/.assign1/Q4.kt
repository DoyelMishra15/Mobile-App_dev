fun displayExoplanetsAndGalaxies() {
    val exoplanets = listOf("Kepler-186f", "TRAPPIST-1e", "Proxima Centauri b")
    val galaxies = listOf("Milky Way", "Andromeda", "Messier 81")

    println("Exoplanets discovered by NASA:")
    exoplanets.forEach { println(it) }

    println("\nGalaxies observed by NASA telescopes:")
    galaxies.forEach { println(it) }
}

fun main() {
    displayExoplanetsAndGalaxies()
}
