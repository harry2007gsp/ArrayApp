//package com.harry;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//
///**
// * Created by hsingh on 8/19/15.
// */
//public class HighArrayApp extends Activity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void click(View view) {
//        HighArray arr;
//        arr = new HighArray(100);
//
//        arr.insert(77);
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);
//
//        //display
//        arr.display();
//
//        //searching
//        Log.d("test",String.valueOf(arr.find(66))+" 66 found");
//
//
//        //deleting
//        Log.d("test",String.valueOf(arr.delete(66))+" 66 deleted");
//
//        arr.display();
//    }
//}
