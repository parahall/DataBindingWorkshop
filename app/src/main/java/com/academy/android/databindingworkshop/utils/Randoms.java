package com.academy.android.databindingworkshop.utils;

import java.util.Random;

public class Randoms {
    private static final Random sRandom = new Random();

    private static final String[] IMG_URLS = new String[]{
            "http://img.lum.dolimg.com/v1/images/Darth-Vader_6bda9114.jpeg",
            "http://www.theforceawakensblog.com/wp-content/uploads/2015/02/Luke-Skywalker-The-Force-Awakens.jpg",
            "http://www2.pictures.zimbio.com/mp/oHGHV7BhCfvl.jpg",
            "http://www.flickeringmyth.com/wp-content/uploads/2014/06/Harrison-Ford-Han-Solo.jpg"
    };

    public static String nextImgUrl() {
        return IMG_URLS[sRandom.nextInt(IMG_URLS.length)];
    }

    /*****************************/

    public static final String[] FIRST_NAMES = {"Darth", "Luke", "Princess", "Han", "Obi-Wan", "Chewbacca"};
    public static final String[] LAST_NAMES = {" Vader", " Skywalker", " Leia", " Solo", " Kenobi"};

    private static final Random sRandomGenerator = new Random();

    public static String nextFirstName() {
        return FIRST_NAMES[sRandomGenerator.nextInt(FIRST_NAMES.length)];
    }

    public static String nextLastName() {
        return LAST_NAMES[sRandomGenerator.nextInt(LAST_NAMES.length)];
    }
}
