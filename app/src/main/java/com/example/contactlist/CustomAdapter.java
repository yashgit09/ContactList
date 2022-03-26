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
        contactText.setText(contactList.get(i));
        contactIcons.setImageResource(iconList.get(i));
        return view;
    }

    public void addContact(String contact, int images){
        this.contactList.add(contact);
        this.iconList.add(images);
        notifyDataSetChanged();
    }

    public void removeContact(){
        if(this.contactList.size() >0){
            this.contactList.remove(this.contactList.size()-1);
        }notifyDataSetChanged();
    }
}
