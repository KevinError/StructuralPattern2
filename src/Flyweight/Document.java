package Flyweight;

import java.io.IOException;


public class Document {
    private StringBuilder characters = new StringBuilder();
    private CharacterPropertiesFactory propertiesFactory = new CharacterPropertiesFactory();

    public void addCharacter(char c, String font, String color, int size) {
        CharacterProperties properties = propertiesFactory.getProperties(font, color, size);
        characters.append(c);
        characters.append(",");
        characters.append(font);
        characters.append(",");
        characters.append(color);
        characters.append(",");
        characters.append(size);
        characters.append(";");
    }

    public void save(String filename) throws IOException {
        JSONArray jsonArray = new JSONArray();
        String[] characterProps = characters.toString().split(";");
        for (String prop : characterProps) {
            String[] propValues = prop.split(",");
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("char", propValues[0]);
            jsonObj.put("font", propValues[1]);
            jsonObj.put("color", propValues[2]);
            jsonObj.put("size", Integer.parseInt(propValues[3]));
            jsonArray.add(jsonObj);
        }
        try (FileWriter file = new FileWriter(filename)) {
            file.write(jsonArray.toJSONString());
        }
    }
}
