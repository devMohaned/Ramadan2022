package com.ramadan.series;

import static com.ramadan.series.utils.Constants.ramadanList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.ramadan.series.adapters.GridViewAdapter;
import com.ramadan.series.models.ChannelItem;
import com.ramadan.series.models.RamadanItem;
import com.ramadan.series.utils.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView  ramadanGridView = (GridView) findViewById(R.id.gridview); // init GridView
        GridViewAdapter gridViewAdapter = new GridViewAdapter(this, ramadanList);
        ramadanGridView.setAdapter(gridViewAdapter);
        ramadanGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, RamadanSeriesActivity.class);
                intent.putExtra(Constants.RAMADAN_SERIES_KEY, (RamadanItem) ramadanList.get(position)); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}