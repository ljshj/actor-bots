package im.actor.bots.util;

import java.util.Random;

public class Strings {
    public static final String CANCEL_MESSAGE = "Operation cancelled. Anything else I can do for you?\n" +
            "\n" +
            "Send /help for a list of commands.";
    public static final String NO_INPUT = "If you want to ask me about something, use special command." +
            "If you don't know which one just type */help*";

    public static final String[] UNKNOWN_MESSAGES = {
            "Command is invalid. Say what?",
            "Command is invalid. I really didn't get it...",
            "Command is invalid. What do you mean?",
            "Command is invalid. Please, say it again in a good way.",
    };

    private static Random random = new Random();

    public static String unknown() {
        return UNKNOWN_MESSAGES[random.nextInt(UNKNOWN_MESSAGES.length)];
    }
}
