package com.ramadan.series.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.ramadan.series.R;
import com.ramadan.series.models.ChannelItem;
import com.ramadan.series.utils.AppUtils;
import com.ramadan.series.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ViewHolder> {

    private Context context;
    private List<ChannelItem> channelItemList;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView channelTitleTextView;
        private final ImageView channelIcon;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            channelTitleTextView = (TextView) view.findViewById(R.id.itemChannelTextView);
            channelIcon = (ImageView) view.findViewById(R.id.itemChannelImageView);


        }

        public TextView getChannelTitleTextView() {
            return channelTitleTextView;
        }
        public ImageView getChannelIcon(){
            return channelIcon;
        }
    }


    public ChannelAdapter(Context context, List<ChannelItem> channelItemList) {
        this.context = context;
        this.channelItemList = channelItemList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_channel, viewGroup, false);



        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        ChannelItem channelItem = channelItemList.get(position);


        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        String seriesTime = "";
        for (String time : channelItem.getSeriesTime())
            seriesTime = seriesTime.length() == 0 ? AppUtils.convertTime(time) : seriesTime + "\n" + AppUtils.convertTime(time);

        viewHolder.getChannelTitleTextView().setText(seriesTime);
        viewHolder.getChannelIcon().setImageResource(channelItem.getChannelIcon());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return channelItemList.size();
    }
}