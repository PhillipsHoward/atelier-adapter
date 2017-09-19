package com.example.bastienwcs.southparkschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<StudentModel> studentModelList = new ArrayList<>();
        studentModelList.add(new StudentModel("Stan", "Marsh"));
        studentModelList.add(new StudentModel("Eric", "Cartman"));
        studentModelList.add(new StudentModel("Kenny", "Broflovski"));
        studentModelList.add(new StudentModel("Kyle", "McCormick"));
        studentModelList.add(new StudentModel("Wendy", "Testaburger"));

        StudentAdapter adapter = new StudentAdapter(this, studentModelList);

        final ListView studentsListView  = (ListView) findViewById(R.id.student_list);
        studentsListView.setAdapter(adapter);

        studentsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                StudentModel student = (StudentModel) studentsListView.getItemAtPosition(i);

                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                intent.putExtra("FIRSTNAME", student.getFirstname());
                intent.putExtra("LASTNAME", student.getLastname());
                startActivity(intent);
            }
        });
    }
}
