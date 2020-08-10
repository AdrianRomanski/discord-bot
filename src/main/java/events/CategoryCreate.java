package events;

import net.dv8tion.jda.api.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CategoryCreate extends ListenerAdapter {

    public void onCategoryCreate(CategoryCreateEvent event) {

        event.getCategory()
                .getGuild()
                .getDefaultChannel()
                .sendMessage("someone just created an category")
                .queue();

    }
}
