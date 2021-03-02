package com.dbtechprojects.drawingapp;

import android.content.Intent;
import android.media.Image;
import android.media.Rating;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class TestActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("test", "clicked in java");
            }
        });
        Intent intent = new Intent(this, MainActivity.class);
        Button backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(intent);
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load("https://s3.eu-west-2.amazonaws.com/images.petlist.co.uk/2_428502.jpg").into(imageView);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if(rating > 3.5){
                    Log.d("rating", "4");
                    Glide.with(getBaseContext())
                            .load("https://i.pinimg.com/564x/9a/26/84/9a2684c4213171476e13732af3b26537.jpg")
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .into(imageView);
                }
                if(rating < 2) {
                    Log.d("rating", "2");
                    Glide.with(getBaseContext())
                            .load("https://dragonfly.org/wp-content/uploads/2014/07/sad-face.png")
                            .transition(DrawableTransitionOptions.withCrossFade())
                            .into(imageView);
                }
            }
        });
    }


}
