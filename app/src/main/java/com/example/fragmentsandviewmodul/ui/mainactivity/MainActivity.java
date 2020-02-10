package com.example.fragmentsandviewmodul.ui.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.fragmentsandviewmodul.R;
import com.example.fragmentsandviewmodul.ui.addapters.ViewPagerAddapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

            private TextView txtText;
            private MainNewModule mainViewModel;
            private TabLayout tabLayout;
            private ViewPager viewPager;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                //initialize MainViewModel
                mainViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainNewModule.class);
                tabLayout = findViewById(R.id.tabLayout);
                viewPager = findViewById(R.id.viewpager);
viewPager.setAdapter(new ViewPagerAddapter(getSupportFragmentManager()));
tabLayout.setupWithViewPager(viewPager);



    }


}


