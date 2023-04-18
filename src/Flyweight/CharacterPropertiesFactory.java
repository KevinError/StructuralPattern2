package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> propertiesCache = new HashMap<>();

    public CharacterProperties getProperties(String font, String color, int size) {
        String key = font + "_" + color + "_" + size;
        if (!propertiesCache.containsKey(key)) {
            propertiesCache.put(key, new CharacterProperties(font, color, size));
        }
        return propertiesCache.get(key);
    }
}
