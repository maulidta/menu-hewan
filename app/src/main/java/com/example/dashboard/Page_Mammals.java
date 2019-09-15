package com.example.dashboard;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class Page_Mammals extends Fragment {

    //constructor default
    public Page_Mammals(){ };

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View PageMmls = super.onCreateView(inflater, container, false);
        return PageMmls;
    }
}
