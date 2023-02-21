package com.zero.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPapperTest {

    @Test
    void player1Wins() {
        assertEquals("Player 1 Won!", RockPapper.rpsls("rock", "lizard"));
        assertEquals("Player 1 Won!", RockPapper.rpsls("paper", "rock"));
        assertEquals("Player 1 Won!", RockPapper.rpsls("scissors", "lizard"));
        assertEquals("Player 1 Won!", RockPapper.rpsls("lizard", "paper"));
        assertEquals("Player 1 Won!", RockPapper.rpsls("spock", "rock"));
    }

    @Test void player2Wins() {
        assertEquals("Player 2 Won!", RockPapper.rpsls("lizard","scissors"));
        assertEquals("Player 2 Won!", RockPapper.rpsls("spock","lizard"));
        assertEquals("Player 2 Won!", RockPapper.rpsls("paper","lizard"));
        assertEquals("Player 2 Won!", RockPapper.rpsls("scissors","spock"));
        assertEquals("Player 2 Won!", RockPapper.rpsls("rock","spock"));
    }

    @Test void draws() {
        assertEquals("Draw!", RockPapper.rpsls("rock", "rock"));
        assertEquals("Draw!", RockPapper.rpsls("spock", "spock"));
    }
}
