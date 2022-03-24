package com.ramadan.series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ramadan.series.adapters.ChannelAdapter;
import com.ramadan.series.models.RamadanItem;
import com.ramadan.series.utils.Constants;

public class RamadanSeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        RamadanItem ramadanItem = (RamadanItem) getIntent().getSerializableExtra(Constants.RAMADAN_SERIES_KEY);

        setupViews(ramadanItem);
    }

    private void setupViews(RamadanItem ramadanItem){
        ImageView seriesImage = findViewById(R.id.seriesImageView);
        seriesImage.setImageResource(ramadanItem.getImageResource());


        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.RamadanSeriesCollapsingToolbar);
        collapsingToolbarLayout.setTitle(ramadanItem.getTitle());
        setSupportActionBar(collapsingToolbarLayout.findViewById(R.id.seriesToolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        TextView briefTextView = findViewById(R.id.seriesBriefTextView);
        briefTextView.setText(ramadanItem.getBrief());

        RecyclerView seriesChannelRecyclerView = findViewById(R.id.seriesChannelRecyclerView);
        seriesChannelRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        seriesChannelRecyclerView.setHasFixedSize(true);

        ChannelAdapter channelAdapter = new ChannelAdapter(this, ramadanItem.getChannelList());
        seriesChannelRecyclerView.setAdapter(channelAdapter);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}