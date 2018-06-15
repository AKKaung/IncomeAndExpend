package com.aungkoko.incomeexpendwallet;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class Total_Cash extends Fragment {

    SectionsPageAdapter mSectionsPagerAdapter;
    ViewPager mViewPager;
    TabLayout tabLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_total__cash, container, false);

        mSectionsPagerAdapter = new SectionsPageAdapter(getChildFragmentManager());
        mViewPager = view.findViewById(R.id.container);
        setUpViewPager(mViewPager);

        tabLayout = view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Objects.requireNonNull(getActivity()).setTitle("Total Cash");
    }

    private void setUpViewPager(ViewPager viewPager){
        mSectionsPagerAdapter = new SectionsPageAdapter(getChildFragmentManager());
        mSectionsPagerAdapter.addFragment(new Income(),"Income");
        mSectionsPagerAdapter.addFragment(new Expend(),"Expend");
        mSectionsPagerAdapter.addFragment(new Inventory(),"Inventory");
        viewPager.setAdapter(mSectionsPagerAdapter);
    }
}
