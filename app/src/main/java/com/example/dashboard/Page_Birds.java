package com.example.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Page_Birds extends Fragment {

        //constructor default
        public Page_Birds(){ };

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View PageBrd = super.onCreateView(inflater, container, false);
            return PageBrd;
        }
    }

