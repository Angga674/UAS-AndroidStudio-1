package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.example.myapplication.R;
import com.example.myapplication.fragment.sinopsis.SinopsisRomance1;
import com.example.myapplication.fragment.sinopsis.SinopsisRomance2;

public class Tab3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3, container, false);

        ImageView imageView = view.findViewById(R.id.dillan);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisRomance1.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = view.findViewById(R.id.yourname);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SinopsisRomance2.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void OnToggleClicked() {
    }
}