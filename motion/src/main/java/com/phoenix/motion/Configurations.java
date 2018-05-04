package com.phoenix.motion;

public class Configurations {

    public static int MILLISECONDS_IN_SUCCESS_SCREENS = 2000;

    private static Configurations mInstance;

    private Configurations() {}

    public static Configurations getInstance() {

        if (mInstance == null) {

            mInstance = new Configurations();
        }

        return mInstance;
    }
}
