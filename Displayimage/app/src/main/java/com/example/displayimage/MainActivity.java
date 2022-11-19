package com.example.displayimage;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    String url ="https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/USAF_pilot.jpg/1024px-USAF_pilot.jpg";
    ImageSwitcher imageSwitcher;
    Button prev,next ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher =findViewById(R.id.imagesw);
        prev =findViewById(R.id.buttonpre);
        next =findViewById(R.id.buttonnext);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView= new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

                return imageView;
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSwitcher.setImageResource(R.drawable.img);


            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSwitcher.setImageResource(R.drawable.img_1);


            }
        });
    }
}