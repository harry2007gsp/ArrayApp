package com.harry.com.harry.person;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.harry.R;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        PersonArray pArr;
        pArr = new PersonArray(100);
        pArr.insert("Evans", "Patty", 24);
        pArr.insert("Smith", "Lorraine", 37);
        pArr.insert("Yee", "Tom", 43);
        pArr.insert("Adams", "Henry", 63);
        pArr.insert("Hashimoto", "Sato", 21);
        pArr.insert("Stimson", "Henry", 29);
        pArr.insert("Velasquez", "Jose", 72);
        pArr.insert("Lamarque", "Henry", 54);
        pArr.insert("Vang", "Minh", 22);
        pArr.insert("Creswell", "Lucinda", 18);

        //display
//        pArr.display();

        //searching
//        Log.d("test", String.valueOf(pArr.find(44)) + " 66 found");
//        pArr.find("Adams").displayPerson();

        //deleting
//        Log.d("test",String.valueOf(pArr.delete(66))+" 66 deleted");
//        Log.d("test",String.valueOf(pArr.delete("Hashimoto")));
        pArr.display();

    }
}
