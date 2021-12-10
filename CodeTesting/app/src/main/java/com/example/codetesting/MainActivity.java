package com.example.codetesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_5, R.drawable.img_6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        //Code for clicking image in scroll view and navigating to stream screen

        ImageButton timage1 = findViewById(R.id.timage1);
        ImageButton timage2 = findViewById(R.id.timage2);
        ImageButton timage3 = findViewById(R.id.timage3);

        timage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, StreamScreenActivity.class);
                startActivity(intent);

            }
        });
        timage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, StreamScreenActivity.class);
                startActivity(intent);

            }
        });
        timage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, StreamScreenActivity.class);
                startActivity(intent);

            }
        });
        //Navigating from scroll view to stream screen ends here

        //Navigating from circularImage view to categories xml page icon by icon
        CircularImageView comedyCat = findViewById(R.id.comedyCat);
        comedyCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CategoriesScreenActivity.class);
                startActivity(intent);

            }
        });
        CircularImageView horrorCat = findViewById(R.id.horrorCat);
        horrorCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CategoriesScreenActivity.class);
                startActivity(intent);

            }
        });
        CircularImageView dramaCat = findViewById(R.id.dramaCat);
        dramaCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CategoriesScreenActivity.class);
                startActivity(intent);

            }
        });
        CircularImageView scifiCat = findViewById(R.id.scifiCat);
        scifiCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CategoriesScreenActivity.class);
                startActivity(intent);

            }
        });
        //Code For navigating from circular image view to categories page ends here




    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

}

