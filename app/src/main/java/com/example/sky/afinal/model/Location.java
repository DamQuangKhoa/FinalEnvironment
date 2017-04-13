package com.example.sky.afinal.model;

import static android.R.attr.x;

/**
 * Created by Sky on 13/04/2017.
 */

public class Location {
    private int latitude,longitude;

    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getlatitude() {
        return latitude;
    }

    public void setlatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getlongitude() {
        return longitude;
    }

    public void setlongitude(int longitude) {
        this.longitude = longitude;
    }
}
