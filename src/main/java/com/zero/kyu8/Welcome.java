package com.zero.kyu8;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language) {
        switch (language) {
            case "IP_ADDRESS_INVALID":
            case "IP_ADDRESS_NOT_FOUND":
            case "IP_ADDRESS_REQUIRED":
                return "Welcome";
        }
        Map<String, String> databaseLanguage = new HashMap<>();
        databaseLanguage.put("english", "Welcome");
        databaseLanguage.put("czech", "Vitejte");
        databaseLanguage.put("danish", "Velkomst");
        databaseLanguage.put("dutch", "Welkom");
        databaseLanguage.put("estonian", "Tere tulemast");
        databaseLanguage.put("finnish", "Tervetuloa");
        databaseLanguage.put("flemish", "Welgekomen");
        databaseLanguage.put("french", "Bienvenue");
        databaseLanguage.put("german", "Willkommen");
        databaseLanguage.put("irish", "Failte");
        databaseLanguage.put("italian", "Benvenuto");
        databaseLanguage.put("latvian", "Gaidits");
        databaseLanguage.put("lithuanian", "Laukiamas");
        databaseLanguage.put("polish", "Witamy");
        databaseLanguage.put("spanish", "Bienvenido");
        databaseLanguage.put("swedish", "Valkommen");
        databaseLanguage.put("welsh", "Croeso");

        return databaseLanguage.get(language);
    }
}
