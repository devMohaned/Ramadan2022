package com.ramadan.series.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChannelItem implements Serializable {
    private int channelIcon;
    private List<String> seriesTime;

    public ChannelItem(int channelIcon, List<String> seriesTime) {
        this.channelIcon = channelIcon;
        this.seriesTime = seriesTime;
    }

    public int getChannelIcon() {
        return channelIcon;
    }

    public void setChannelIcon(int channelIcon) {
        this.channelIcon = channelIcon;
    }

    public List<String> getSeriesTime() {
        return seriesTime;
    }

    public void setSeriesTime(List<String> seriesTime) {
        this.seriesTime = seriesTime;
    }
}
