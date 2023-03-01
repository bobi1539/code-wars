package com.zero.kyu6.decodewoof;

public class SmartDogOwner {

    public static String woofDecoder(String str) {
        System.out.println("original str : " + str);

        // check if not contain w,o,f
        if(!str.contains("w") && !str.contains("o") && !str.contains("f")){
            return "nothing to decode!";
        }

        StringBuilder word = new StringBuilder();
        String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        // create string array of input string
        String[] letters = str.replaceAll(" ", "").toLowerCase().split("\\!");
        for(String letter : letters){
            System.out.println(letter);
            System.out.println(alphabet.length);

            // create array string of letter
            String[] woofs = letter.split("\\-");
            // check if is just barking
            if(woofs.length > alphabet.length){
                return "just barking!";
            }
            if(letter.contains("w") && letter.contains("o") && letter.contains("f")) {
                int indexOfAlphabet = woofs.length - 1;
                word.append(alphabet[indexOfAlphabet]);
            }
        }
        System.out.println("word : " + word.toString());

        return word.toString();
    }
}
