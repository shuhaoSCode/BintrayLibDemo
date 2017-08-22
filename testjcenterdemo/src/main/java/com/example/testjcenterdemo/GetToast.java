package com.example.testjcenterdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by luke on 2017/8/22.
 */

public class GetToast {

    private Context context;

    public static GetToast instance;

    private GetToast(Context context) {
        this.context = context;
    }

    public static GetToast getInstance(Context context) {
        if (instance == null) {
            return new GetToast(context);
        } else {
            return instance;
        }
    }

    public void getToast(Object object) {
        Toast.makeText(context, object.toString(), Toast.LENGTH_SHORT).show();
    }

}
