import net.dv8tion.jda.api.JDABuilder

fun main() {
    print("토큰 입력 : ")
    val jda = JDABuilder.createDefault(readLine()).build()

    jda.addEventListener(Starter())
}