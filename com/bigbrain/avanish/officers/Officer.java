package com.bigbrain.avanish.officers;

public interface Officer {

    Character type = null;
    int no = 0;
    Character color = null;
    Officer[] edges = new Officer[7]; //Array of surrounding officers
    int[] coords = new int[3]; //Coordinates of the officer in cube coordinates

    public boolean move();

}
