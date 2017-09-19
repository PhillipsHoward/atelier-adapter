package com.example.bastienwcs.southparkschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bastienwcs on 19/09/17.
 */

public class StudentAdapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<StudentModel> items; //data source of the list adapter

    //public constructor 
    public StudentAdapter(Context context, ArrayList<StudentModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return items.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.student_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // get current item to be displayed
        StudentModel currentItem = (StudentModel) getItem(position);

        viewHolder.studentFirstname.setText(currentItem.getFirstname());
        viewHolder.studentLastname.setText(currentItem.getLastname());

        // returns the view for the current row
        return convertView;
    }

    private class ViewHolder {
        TextView studentFirstname;
        TextView studentLastname;

        public ViewHolder(View view) {
            studentFirstname = (TextView)
                    view.findViewById(R.id.student_firstname);
            studentLastname = (TextView)
                    view.findViewById(R.id.student_lastname);
        }
    }
}