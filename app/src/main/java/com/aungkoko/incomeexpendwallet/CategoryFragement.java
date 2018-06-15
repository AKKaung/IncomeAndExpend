package com.aungkoko.incomeexpendwallet;

import android.nfc.Tag;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Objects;

public class CategoryFragement extends Fragment {

    TextView NameCat;
    EditText NameFillCat;
    Button SaveBtn;

    RadioGroup Rgroup;
    RadioButton RBone,RBtwo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_category_fragement, container, false);

        NameCat = view.findViewById(R.id.name_category);
        NameFillCat = view.findViewById(R.id.edit_text_of_Category);
        SaveBtn = view.findViewById(R.id.Save_DB_button);

        Rgroup = view.findViewById(R.id.rgGROUP);
        RBone = view.findViewById(R.id.radio1);
        RBtwo = view.findViewById(R.id.radio2);

        SaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Objects.requireNonNull(getActivity()).setTitle("Category");
    }
}
