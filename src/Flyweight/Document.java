package Flyweight;


import java.util.Arrays;

public class Document {
    private String text;
    private Character[][] characters;

    public Document() {
    }

    public void create(String text, Character[][] characters){
        this.text = text;
        this.characters = characters;
        System.out.println("The document has been created;");
        System.out.println("It contains:" + this.text);
        for(int i = 0; i < characters.length; i++){
            for(int j = 0; j < characters[i].length; j++){
                System.out.println(characters[i][j]);
            }
        }

    }

    public void edit(String text, Character[][] characters){
        this.text = text;
        this.characters = characters;
        System.out.println("The document has been modified;");
        System.out.println("It contains:" + this.text);
        for(int i = 0; i < characters.length; i++){
            for(int j = 0; j < characters[i].length; j++){
                System.out.println(characters[i][j]);
            }
        }
    }


}
