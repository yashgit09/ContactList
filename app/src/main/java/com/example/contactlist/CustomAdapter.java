/**
 * Name:  Harshdeep Kaur Dhunna
 * Student number: A00246003 
 * Name:  Yash Kelkar
 * Student number: A00242148 
 * Program description: JAV-1001 - 11329 - App Development for Android - 202201 - 001
 */
package com.example.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    
    Context context;
    ArrayList<String> contactList;
    ArrayList<Integer> iconList;
    LayoutInflater layoutInflater;

    /** Prmeterised Constructor called from MainActivity
     to pass list values and images for icon */
    public CustomAdapter(Context context, ArrayList<String> contactList, ArrayList<Integer> iconList) {
        this.context = context;
        this.contactList = contactList;
        this.iconList = iconList;
        this.layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return this.contactList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view  = layoutInflater.inflate(R.layout.layout, null);
        TextView contactText = view.findViewById(R.id.contactName);
        ImageView contactIcons  = view.findViewById(R.id.contactIcon);
        contactText.setText(contactList.get(i)); // add values to text list view 
        contactIcons.setImageResource(iconList.get(i)); //add values to images list
        return view;
    }

    /** Call on add contact button */
    public void addContact(String contact, int images){
        this.contactList.add(contact);
        this.iconList.add(images);
        notifyDataSetChanged();
    }
    
    /** Call on remove contact button */
    public void removeContact(){
        if(this.contactList.size() >0){
            this.contactList.remove(this.contactList.size()-1);
        }notifyDataSetChanged();
    }
}
