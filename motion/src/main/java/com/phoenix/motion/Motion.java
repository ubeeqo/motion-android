package com.phoenix.motion;

import android.content.Context;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by fran on 25/1/18.
 */

public class Motion {

    public static void initMotion(Context context) {

        CalligraphyContextWrapper.wrap(context);
    }
}
