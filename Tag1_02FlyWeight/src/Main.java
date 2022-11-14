import flyweight.AttributedCharacter;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
       StringBuilder s = new StringBuilder();
       var start = Instant.now();
       for(int i = 0 ; i < 1_000_000; i ++) {
           s.append('a');
       }
       String myString = s.toString();
        var end = Instant.now();
       var duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }
}