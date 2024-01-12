package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;
import com.example.myapplication.fragment.sinopsis.SinopsisAction1;
import com.example.myapplication.fragment.sinopsis.SinopsisAction2;

public class Tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        ImageView imageView = view.findViewById(R.id.spiderman);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction1.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = view.findViewById(R.id.extraction);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisAction2.class);
                startActivity(intent);

            }
        });

        return view;
    }
    private void OnToggleClicked() {
    }
}

