package com.example.imagedatewise;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatePicker date;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        img = findViewById(R.id.img);

        // Set default image
       // img.setImageResource(R.drawable.default_image);

        // DatePicker listener
        date.init(date.getYear(), date.getMonth(), date.getDayOfMonth(), (view, year, month, dayOfMonth) -> {
            switch (dayOfMonth) {
                case 1:
                    img.setImageResource(R.drawable.image1);
                    break;
                case 2:
                    img.setImageResource(R.drawable.image2);
                    break;
                case 3:
                    img.setImageResource(R.drawable.image3);
                    break;
                case 4:
                    img.setImageResource(R.drawable.image4);
                    break;
                default:
                    img.setImageResource(R.drawable.default_img);
                    break;
            }
        });
    }
}
