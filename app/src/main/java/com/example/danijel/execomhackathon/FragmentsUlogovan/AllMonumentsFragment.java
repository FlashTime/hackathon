package com.example.danijel.execomhackathon.FragmentsUlogovan;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danijel.execomhackathon.R;


public class AllMonumentsFragment extends Fragment {


    public AllMonumentsFragment() {
        // Required empty public constructor
    }

    public static AllMonumentsFragment newInstance() {
        return new AllMonumentsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_monuments, container, false);
    }
}

