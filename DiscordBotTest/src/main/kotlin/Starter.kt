import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class Starter: ListenerAdapter() {

    override fun onMessageReceived(event: MessageReceivedEvent) {
        event.channel.sendMessage(event.message.contentRaw).queue()
    }
}