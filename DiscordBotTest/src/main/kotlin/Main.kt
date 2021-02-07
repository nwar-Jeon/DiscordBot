import net.dv8tion.jda.api.JDABuilder

fun main() {
    val jda = JDABuilder.createDefault("ODA3MTI1NDI2MDMxNTU4Njk3.YBzcIQ.lfPpru2UJiU95CcUc2byALpAW9Y").build()

    jda.addEventListener(Starter())
}