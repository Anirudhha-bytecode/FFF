package com.example.mygridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int[] flags={R.drawable.india,R.drawable.australia_flag,R.drawable.bd,R.drawable.england_flag,R.drawable.germany_flag
    ,R.drawable.iran_flag,R.drawable.japan_flag,R.drawable.usa_flag,R.drawable.vietnam_flag};
    String[] state_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridviewid);
        state_name=getResources().getStringArray(R.array.state_name);
        CustomAdapter adapter=new CustomAdapter(this,state_name,flags);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=state_name[position];
                Toast.makeText(MainActivity.this,"You have clicked "+value,Toast.LENGTH_SHORT).show();
            }
        });
    }
}