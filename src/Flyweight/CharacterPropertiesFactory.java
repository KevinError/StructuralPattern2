package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterPropertiesFactory {
    private static final Map<CharacterProperties, CharacterProperties> characters = new HashMap<>();

    public static CharacterProperties getCharacterProperties(String font, String color, int size) {
        CharacterProperties properties = new CharacterProperties(font, color, size);
        if (!characters.containsKey(properties)) {
            characters.put(properties, properties);
        }
        return characters.get(properties);
    }
}
