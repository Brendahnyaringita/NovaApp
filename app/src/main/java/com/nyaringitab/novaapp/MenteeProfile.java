package com.nyaringitab.novaapp;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.TabLayout;
import android.os.Bundle;

import com.nyaringitab.novaapp.adapters.ViewPagerAdapter;
import com.nyaringitab.novaapp.fragments.HomeFragment;
import com.nyaringitab.novaapp.fragments.InternshipsFragment;
import com.nyaringitab.novaapp.fragments.MessagesFragment;
import com.nyaringitab.novaapp.fragments.ProfileFragment;
import com.nyaringitab.novaapp.widgets.SlidingTabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenteeProfile extends AppCompatActivity implements
        HomeFragment.OnFragmentInteractionListener,
        ProfileFragment.OnFragmentInteractionListener,
        MessagesFragment.OnFragmentInteractionListener,
        InternshipsFragment.OnFragmentInteractionListener

{


    SlidingTabLayout tabs;
    ViewPager pager;

    ViewPagerAdapter adapter;

    List<Fragment> fragments= new ArrayList<>();
    List<String> titles = Arrays.asList("Home", "Profile","Messages","Internships");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentee_profile);

        tabs = findViewById(R.id.pane_tabs);
        pager = findViewById(R.id.pager);

        if (fragments.isEmpty()) {
            fragments.add(HomeFragment.newInstance("test param"));
            fragments.add(ProfileFragment.newInstance("test param"));
            fragments.add(MessagesFragment.newInstance("test param"));
            fragments.add(InternshipsFragment.newInstance("test param"));

            adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragments, titles);
            pager.setAdapter(adapter);
            tabs.setViewPager(pager);
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //
    }
}
