package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WhatisAnimal extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatis_animal);

        /*sekarang pasang adapter ke viewpager*/
        setupViewPager();
    }

    private void setupViewPager() {
        adapter = new Adapter(this);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }

    private class Adapter extends PagerAdapter {
        Context context;
        LayoutInflater inflater;

        public Adapter(Context context) {
            this.context = context;
        }

        // list image
        int[] list_img = {
                R.drawable.cat,
                R.drawable.chicken,
                R.drawable.crocodile
        };

        // list judul
        int[] list_judul = {
                R.string.judul_1,
                R.string.judul_2,
                R.string.judul_3
        };
        //list deskripsi
        int[] list_desk = {
                R.string.desk_1,
                R.string.desk_2,
                R.string.desk_3
        };

        //list color bg
        int[] list_bg = {
                getResources().getColor(R.color.merah),
                getResources().getColor(R.color.kuning),
                getResources().getColor(R.color.hijau)
        };

        public int getCount() {
            return list_judul.length;
        }

        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.item_layout, container, false);
            LinearLayout linearLayout = view.findViewById(R.id.item_layout);
            ImageView imageView = view.findViewById(R.id.img);
            TextView judul = view.findViewById(R.id.judul);
            TextView desk = view.findViewById(R.id.deskripsi);

            linearLayout.setBackgroundColor(list_bg[position]);
            imageView.setImageResource(list_img[position]);
            judul.setText(list_judul[position]);
            desk.setText(list_desk[position]);
            container.addView(view);
            return view;
        }

        public void destroyItem(ViewGroup container, int postion, Object object) {
            container.removeView((LinearLayout) object);
        }
    }
}