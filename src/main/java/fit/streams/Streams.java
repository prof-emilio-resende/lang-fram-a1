package fit.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void playStreams() {
        System.out.println("Playing with streams ...");

        List.of("oNe", "Two", "thrEe")
            .stream()
            .map(x -> {
                System.out.println("processing the map...");
                return x.toUpperCase();
            })
            .forEach(System.out::println);

        List.of("oNe", "Two", "thrEe")
            .parallelStream()
            .map(x -> {
                System.out.println("processing parallel map...");
                return x.toUpperCase();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}
