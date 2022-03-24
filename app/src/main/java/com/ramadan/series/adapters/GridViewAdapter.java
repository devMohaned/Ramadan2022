package com.ramadan.series.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ramadan.series.R;
import com.ramadan.series.models.RamadanItem;

import java.util.List;

public class GridViewAdapter  extends BaseAdapter {
    Context context;
    List<RamadanItem> ramadanList;
    public GridViewAdapter(Context applicationContext, List<RamadanItem> ramadanList) {

        this.context = applicationContext;
        this.ramadanList = ramadanList;
    }
    @Override
    public int getCount() {
        return ramadanList.size();
    }
    @Override
    public RamadanItem getItem(int i) {
        return ramadanList.get(i);
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.item_ramadan_series, null); // inflate the layout
        ImageView ramadanImageView = (ImageView) view.findViewById(R.id.itemRamadanImage); // get the reference of ImageView
        TextView ramadanTitleTextView = (TextView) view.findViewById(R.id.itemRamadanTitle);
        ramadanImageView.setImageResource(getItem(i).getImageResource()); // set logo images
        ramadanTitleTextView.setText(getItem(i).getTitle());

        return view;
    }
}
