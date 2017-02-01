package com.example.sky.afinal.view.main;

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
        return MainActivity.PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}