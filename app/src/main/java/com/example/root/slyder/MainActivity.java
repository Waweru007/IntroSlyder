package com.example.root.slyder;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewpager;
    SliderAdapter sliderAdapter;

    LinearLayout mDotLayout;
    TextView[] mDots;
    Button previousButton;
    Button nextButton;
    int mCurrentPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = findViewById(R.id.ViewPager);
        sliderAdapter= new SliderAdapter(this);
        viewpager.setAdapter(sliderAdapter);
        mDotLayout=findViewById(R.id.dotsLayout);
        previousButton=findViewById(R.id.previousButton);
        nextButton=findViewById(R.id.nextButton);


        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }

    public void addDotsIndicator(){

        mDots=new TextView[4];
        for (int i=0; i<mDots.length; i++){
            mDots[i]= new TextView(this);
            mDots[i].setText(Html.fromHtml("&#9226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentwhite));
            mDotLayout.addView(mDots[i]);
        }


    }
}
