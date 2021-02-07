import net.dv8tion.jda.api.JDABuilder

fun main() {
    val jda = JDABuilder.createDefault("").build()

    jda.addEventListener(Starter())
}
