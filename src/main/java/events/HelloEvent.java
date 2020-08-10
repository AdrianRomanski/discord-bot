package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Objects;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        var messageSent = event.getMessage().getContentRaw().split(" ");
        var name = event.getMember().getUser().getName();
        if(messageSent[0].equalsIgnoreCase("Hi")) {
            // Preventing from infinite loop
            if(!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("Hi " + name).queue();
            }
        }
    }
}
