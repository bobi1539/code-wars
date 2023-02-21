package com.zero.kyu7;

import java.util.HashMap;
import java.util.Map;

public class RockPapper {
    public static String rpsls(String player1, String player2){
        String player1Won = "Player 1 Won!";
        String player2Won = "Player 2 Won!";
        String draw = "Draw!";

        if(player1.equals(player2)){
            return draw;
        }

        Map<String, String> rules = new HashMap<>();
        rules.put("scissorspaper", player1Won);
        rules.put("paperscissors", player2Won);
        rules.put("paperrock", player1Won);
        rules.put("rockpaper", player2Won);
        rules.put("rocklizard", player1Won);
        rules.put("lizardrock", player2Won);
        rules.put("lizardspock", player1Won);
        rules.put("spocklizard", player2Won);
        rules.put("spockscissors", player1Won);
        rules.put("scissorsspock", player2Won);
        rules.put("scissorslizard", player1Won);
        rules.put("lizardscissors", player2Won);
        rules.put("lizardpaper", player1Won);
        rules.put("paperlizard", player2Won);
        rules.put("paperspock", player1Won);
        rules.put("spockpaper", player2Won);
        rules.put("spockrock", player1Won);
        rules.put("rockspock", player2Won);
        rules.put("rockscissors", player1Won);
        rules.put("scissorsrock", player2Won);

        String concat = player1.concat(player2);
        return rules.get(concat);
    }
}
