package flyweight;

import java.util.ArrayList;
import java.util.List;

public class AttributedCharacter {

    private static List<AttributedCharacter> characters = new ArrayList<>();
    private final char c;
    private final boolean bold;

    public char getC() {
        return c;
    }

    public boolean isBold() {
        return bold;
    }

    private AttributedCharacter(char c, boolean bold) {
        this.c = c;
        this.bold = bold;
        characters.add(this);
    }

    public static AttributedCharacter create(char c, boolean bold) {
        for (var attributedCharacter: characters) {
            if(c == attributedCharacter.c && bold == attributedCharacter.bold)
                return attributedCharacter;
        }
        return new AttributedCharacter(c, bold);
    }
}
