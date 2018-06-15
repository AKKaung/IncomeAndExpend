package com.aungkoko.incomeexpendwallet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Objects;

public class Home extends Fragment {

    TextView income,expend;
    Fragment fragment1,fragment2;

    ConstraintLayout constraintLayout;
    FrameLayout frameLayout;
    FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);

        constraintLayout = view.findViewById(R.id.ConsLayout);
        frameLayout = view.findViewById(R.id.flContent);
        fab = view.findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Objects.requireNonNull(getActivity()));
                @SuppressLint("InflateParams") View sheetView = getActivity().getLayoutInflater().inflate(R.layout.dialog_at_botton, null);
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.setCancelable(true);
                bottomSheetDialog.show();

                income = sheetView.findViewById(R.id.edit_text);
                expend = sheetView.findViewById(R.id.delete_text);

                income.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(v.equals(income)){
                            fragment1 = new FirstFragment();
                            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                            ft.addToBackStack(null);
                            ft.replace(R.id.flFrag, fragment1);
                            ft.commit();
                            bottomSheetDialog.hide();
                        }
                    }
                });

                expend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (v.equals(expend)){
                            fragment2 = new SecondFragment();
                            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                            ft.addToBackStack(null);
                            ft.replace(R.id.flFrag, fragment2);
                            ft.commit();
                            bottomSheetDialog.hide();
                        }
                    }
                });
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Objects.requireNonNull(getActivity()).setTitle("Home");
    }
}
