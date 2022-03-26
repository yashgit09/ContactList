/**
 * Name:  Harshdeep Kaur Dhunna
 * Student number: A00246003 
 * Name:  Yash Kelkar
 * Student number: A00242148 
 * Program description: JAV-1001 - 11329 - App Development for Android - 202201 - 001
 */
package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //Define Variables
    private ListView contactListView;
    private ArrayList<String> contacts;
    ArrayList<Integer> contactIcons;
    CustomAdapter customAdapter;
    Button addButton;
    Button removeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intialize Variables
        contacts = new ArrayList(Arrays.asList("John Doe", "Emily Clark", "John Smith", "Paul", "Paulin", "rob"));
        contactIcons = new ArrayList(Arrays.asList(R.drawable.blue_male, R.drawable.blue_female, R.drawable.blue_female , R.drawable.red_male, R.drawable.red_female, R.drawable.blue_male ));
        addButton = findViewById(R.id.addContact);
        removeButton = findViewById(R.id.removeContact);
        contactListView  =  findViewById(R.id.contactListView);
        customAdapter = new CustomAdapter(this,contacts,contactIcons);
        contactListView.setAdapter(customAdapter);
        callButtonClick();
    }

    /** Method call on button click */
    public void callButtonClick() {
        addButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 customAdapter.addContact("New Contact",R.drawable.blue_profile_pic);
             }
        });

        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customAdapter.removeContact();
            }
        });
    }
}
