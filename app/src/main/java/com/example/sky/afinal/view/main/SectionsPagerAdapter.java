package com.example.sky.afinal.view.main;

import com.example.sky.afinal.view.pollution.ManHinhONhiem;
import com.example.sky.afinal.view.traffics.ManHinhKetXe;

/**
 * Created by Sky on 26/01/2017.
 */

public class SectionsPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    public SectionsPagerAdapter(android.support.v4.app.FragmentManager fm) {

        super(fm);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                return new ManHinhKetXe();
            case 1:
                return new ManHinhONhiem();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Kẹt Xe";
            case 1:
                return "Ô Nhiễm";
        }
        return null;
    }
}