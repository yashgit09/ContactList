package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView contactListView;
    private ArrayList<String> contacts;
    ArrayList<Integer> contactIcons;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList(Arrays.asList("John Doe","Emily Clark","John Smith", "Paul", "Paulin","rob"));
        contactIcons = new ArrayList(Arrays.asList(R.drawable.blue_male,R.drawable.blue_female,R.drawable.blue_profile_pic,R.drawable.red_male,R.drawable.red_female,R.drawable.red_profile_pic));
    }
}