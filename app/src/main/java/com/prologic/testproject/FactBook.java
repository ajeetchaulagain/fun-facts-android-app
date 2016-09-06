package com.prologic.testproject;

import java.util.Random;

/**
 * Created by Ajeet on 9/5/2016.
 */
public class FactBook {

    private String[] facts = {
            "Rats and horses can't vomit",
            "The cigarette lighter was invented before the match.",
            "Like fingerprints, everyone's tongue print is different.",
            "Wearing headphones for just an hour will increase the bacteria in your ear by 700 times",
            "Sloths take two weeks to digest their food"
    };

    public String getFact(){

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);
        return facts[randomNumber];

    }
}
