package com.sx.myapplication;

/**
 * Created by SX on 2017/3/17.
 */

class Wlokm {
    private static final Wlokm ourInstance = new Wlokm();

    static Wlokm getInstance() {
        return ourInstance;
    }

    private Wlokm() {
    }
}
