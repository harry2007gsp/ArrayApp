package com.harry;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class OrderedArrayApp extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        OrderedArray oArr;
        oArr = new OrderedArray(100);

        oArr.insert(77);
        oArr.insert(99);
        oArr.insert(44);
//        oArr.insert(55);
//        oArr.insert(22);
//        oArr.insert(88);
//        oArr.insert(11);
//        oArr.insert(00);
//        oArr.insert(66);
//        oArr.insert(33);

        //display
        oArr.display();

        //searching
//        Log.d("test", String.valueOf(oArr.find(44)) + " 66 found");
//        oArr.find(66);

        //deleting
//        Log.d("test",String.valueOf(oArr.delete(66))+" 66 deleted");

//        oArr.display();
    }
}
