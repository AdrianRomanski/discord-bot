import events.CategoryCreate;
import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;
import java.io.IOException;

public class Bot {

    public static void main(String[] args) throws LoginException, IOException {

        JDA jda = JDABuilder.createDefault(PropertiesLoader.getToken()).build();

        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new CategoryCreate());
    }
}
