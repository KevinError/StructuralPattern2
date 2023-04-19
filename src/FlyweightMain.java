import Flyweight.*;
import Flyweight.Character;

public class FlyweightMain {
    public static void main(String[] args) {

        CharacterProperties arial12Red = CharacterPropertiesFactory.getCharacterProperties("Arial", "Red", 12);
        CharacterProperties calibri14Blue = CharacterPropertiesFactory.getCharacterProperties("Calibri", "Blue", 14);
        CharacterProperties verdana16Black = CharacterPropertiesFactory.getCharacterProperties("Verdana", "Black", 16);
        CharacterProperties arial16Blue = CharacterPropertiesFactory.getCharacterProperties("Arial", "Blue", 16);

        Character[][] characters = {
                { new Character('H', arial12Red), new Character('e', arial12Red), new Character('l', arial12Red), new Character('l', arial12Red), new Character('o', arial12Red) },
                { new Character('W', calibri14Blue), new Character('o', calibri14Blue), new Character('r', calibri14Blue), new Character('l', calibri14Blue), new Character('d', calibri14Blue) },
                { new Character('C', verdana16Black), new Character('S', verdana16Black), new Character('5', arial16Blue), new Character('8', arial16Blue), new Character('0', arial16Blue), new Character('0', arial16Blue) }
        };
        Document document = new Document();
        document.create("HelloWorldCS5800", characters);

        Character[][] characters2 = {
                { new Character('H', verdana16Black), new Character('e', verdana16Black), new Character('l', arial12Red), new Character('l', arial12Red), new Character('o', arial12Red) },
                { new Character('W', verdana16Black), new Character('o', verdana16Black), new Character('r', calibri14Blue), new Character('l', calibri14Blue), new Character('d', calibri14Blue) },
                { new Character('C', verdana16Black), new Character('S', verdana16Black), new Character('5', arial16Blue), new Character('8', arial16Blue), new Character('0', arial16Blue), new Character('0', arial16Blue) }
        };
        document.edit("HelloWorldCS5800", characters2);

    }
}