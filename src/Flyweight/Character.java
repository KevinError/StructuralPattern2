package Flyweight;

public class Character {
    private final char c;
    private final CharacterProperties properties;

    public Character(char c, CharacterProperties properties) {
        this.c = c;
        this.properties = properties;
    }

    @Override
    public String toString(){
        return c + ", font:" + properties.getFont() + ", size:" + properties.getSize() + ", color:" + properties.getColor();
    }
}
