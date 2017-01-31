package com.android.sumita.costgrid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    static int Matrix[][] = new int[][] { {1, 2, 3,4,5 }, {4, 5, 6,2,5 }, {7, 8, 9,8,6 }, {7, 8, 9,8,6 }};
    // 2D integer array , input to b taken from user on screen


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get Data

        CalculatePath.FindshortPath(Matrix);
    }



    // print matrix





}

