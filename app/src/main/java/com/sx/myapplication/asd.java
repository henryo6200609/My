package com.sx.myapplication;

/**
 * Created by SX on 2017/3/17.
 */

class asd {
    private static final asd ourInstance = new asd();

    static asd getInstance() {
        return ourInstance;
    }

    private asd() {
        int a = 0;
        a = 1;
    }
}
