package ru.javarush.island.bityutskih.config;

import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonSimpleParser {
    public Root parse() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("settings.yaml")) {

            parser.parse(reader);
            String name = (String) rootJsonObject.get("name")

        } catch (Exception e) {
            System.out.println("Parse ERROR" + e.toString());
        }
    return null;
    }
}


