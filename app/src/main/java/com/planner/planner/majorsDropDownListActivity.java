package com.example.david.plannerpro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class majorsDropDownListActivity extends AppCompatActivity {
    //    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.majorsdropdownlist_main);

        Spinner s = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(majorsDropDownListActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Majors));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(myAdapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 1){
                    startActivity(new Intent(majorsDropDownListActivity.this, MainCSActivity.class));
                }
                if(i == 2){
                    startActivity(new Intent(majorsDropDownListActivity.this, MainCEActivity.class ));
                }
                ///And So onnnn....
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
