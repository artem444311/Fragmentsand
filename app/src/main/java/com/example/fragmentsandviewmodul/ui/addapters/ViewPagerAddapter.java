package com.example.fragmentsandviewmodul.ui.addapters;

import com.example.fragmentsandviewmodul.ui.fragments.GreenFragment;
import com.example.fragmentsandviewmodul.ui.fragments.Main;
import com.example.fragmentsandviewmodul.ui.fragments.RedFragment;

import java.util.Arrays;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAddapter  extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public ViewPagerAddapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments = Arrays.asList(new RedFragment(), new Main(), new GreenFragment());

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Red";
            case 1:
                return "Blue";
            case 2:
                return "Green";
            default:
                return "";
        }

    }


    @Override
    public int getCount() {
        int size = fragments.size();
        return size;


    }
}










