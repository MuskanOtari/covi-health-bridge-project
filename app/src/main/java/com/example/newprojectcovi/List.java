package com.example.newprojectcovi;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List extends Activity {
    // Array of strings...
    String[] mobileArray = {"Tab.Azithrow Mycine 500","Tab.Vitamin C","Tab.Zinc","Tab.MultiVitamin",
            "FebiFlue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.newlistView);
        listView.setAdapter(adapter);
    }
}