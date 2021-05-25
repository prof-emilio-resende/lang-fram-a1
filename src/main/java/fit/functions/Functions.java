package fit.functions;

import java.util.function.Function;

public class Functions {
    private static final String DEFAULT_SEPARATOR = "-->";

    private static Function<String, String> loggerBuilder(String prefix, String separator) {
        return str -> {
            var text = String.format("%s %s %s", prefix, separator, str);
            return text;
        };
    }

    private static Function<String, String> loggerBuilder(String prefix) {
        return loggerBuilder(prefix, DEFAULT_SEPARATOR);
    }

    public static void playFunctional() {
        var logger = loggerBuilder("[prefix]");
        var customLogger = loggerBuilder("[prefix]", "==>");
        System.out.println(logger.apply("a message"));
        System.out.println(customLogger.apply("in a bottle"));
    }
}
