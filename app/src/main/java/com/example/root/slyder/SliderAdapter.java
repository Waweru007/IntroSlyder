package com.example.root.slyder;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter{
    LayoutInflater inflater;

    Context context;

    public int [] imageArray= {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4};
    public String [] tittleArray={"FACEBOOK", "TWITTER", "INSTAGRAM", "GOOGLE"};
    public String [] descriptionArray={"Facebook is a social media giant","Twitter is good for tweets",
    "Intagram is very nice", "Google makes life essier"};
    public int [] backgroundColorArray={Color.rgb(1,188,212), Color.rgb(239,85,85),   Color.rgb(1,188, 212),Color.rgb(1,188, 212)};


    public SliderAdapter (Context context)
    {


        this.context=context;

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return (view==object);
    }

    @Override
    public int getCount() {
        return tittleArray.length;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);


    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.slide,container, false);
        LinearLayout linearLayout= view.findViewById(R.id.linearLayout);
        ImageView imageView=view.findViewById(R.id.slideimg);
        TextView t1_title= view.findViewById(R.id.txtTitle);
        TextView t2_desc= view.findViewById(R.id.txtDescription);
        try {
            linearLayout.setBackgroundColor(backgroundColorArray[position]);
        }catch (Exception e){

        }

        imageView.setImageResource(imageArray[position]);
        t1_title.setText(tittleArray[position]);
        t2_desc.setText(descriptionArray[position]);
        container.addView(view);


        return view;


    }
}
