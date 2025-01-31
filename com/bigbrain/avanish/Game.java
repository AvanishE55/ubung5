package com.bigbrain.avanish;

import com.bigbrain.avanish.officers.Officer;

import java.util.HashMap;

public class Game {
    final String[] officerPrintOrder = {"X1R", "A1R", "A2R", "S1R", "S2R", "E1R", "E2R", "E3R", "I1R", "I2R", "I3R",
            "X1V", "A1V", "A2V", "S1V", "S2V", "E1V", "E2V", "E3V", "I1V", "I2V", "I3V"};
    HashMap officerList = new HashMap<String, Officer>(22);
    boolean isVTurn;

    Game(String startOfficer) {
        isVTurn = startOfficer.endsWith("V");


    }

    public void turn() {
        isVTurn = !isVTurn;
    }

    public void print() {
    }
}
