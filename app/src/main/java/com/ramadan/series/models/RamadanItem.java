package com.ramadan.series.models;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.List;

public class RamadanItem implements Serializable {
    private int imageResource;
    private String title;
    private String brief;
    private List<ChannelItem> channelList;

    public RamadanItem(int imageResource, String title, String brief, List<ChannelItem> channelList) {
        this.imageResource = imageResource;
        this.title = title;
        this.brief = brief;
        this.channelList = channelList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public List<ChannelItem> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<ChannelItem> channelList) {
        this.channelList = channelList;
    }
}
