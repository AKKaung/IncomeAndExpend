package com.aungkoko.incomeexpendwallet;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home_Fragment extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__fragment);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
