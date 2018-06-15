package com.aungkoko.incomeexpendwallet;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class Income extends Fragment {

    TextView datepick;
    EditText moneyAmount;
    EditText detail;
    Spinner spinnerChoose;
    Spinner categorySP;
    Button Create;
    Button Cancel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_income, container, false);

        datepick = view.findViewById(R.id.date_pick);
        moneyAmount = view.findViewById(R.id.money_amount);
        detail = view.findViewById(R.id.detail);
        spinnerChoose = view.findViewById(R.id.type_spinner);
        categorySP = view.findViewById(R.id.category);

        Create = view.findViewById(R.id.save_to_db);
        Cancel = view.findViewById(R.id.back_to_main);

        return view;
    }
}
