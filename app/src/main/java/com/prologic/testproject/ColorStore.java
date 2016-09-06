package com.prologic.testproject;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Ajeet on 9/5/2016.
 */
public class ColorStore {

    private String[] colors = {

            "#225378",
            "#EB7F00",
            "#BEDB39",
            "#FFE11A",
            "#004358"
    };

    public int getColor(){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);

        int color= Color.parseColor(colors[randomNumber]);
        return color;
    }
}
