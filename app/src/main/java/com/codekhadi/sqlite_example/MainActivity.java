package com.codekhadi.sqlite_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edt_name;
    Button btn_click;
    ListView list_name;
    Databasehandler db;
    ArrayAdapter adapter;
    ArrayList<String> mylist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new Databasehandler(this);
        edt_name = (EditText) findViewById(R.id.edt_name);
        btn_click = (Button) findViewById(R.id.btn_click);
        list_name = (ListView) findViewById(R.id.list_name);
        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_name != null) {
                    String Name = edt_name.getText().toString();
                    db.insertName(Name);
                    mylist = db.getAllNames();
                    setAdapter();
                }
            }

            private void setAdapter() {
                adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, mylist);
                list_name.setAdapter(adapter);
            }
        });

    }

}
