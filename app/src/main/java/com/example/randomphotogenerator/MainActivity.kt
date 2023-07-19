package com.example.randomphotogenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter=0
        val shuffleButton = findViewById<Button>(R.id.shuffleButton)
        val imageView = findViewById<ImageView>(R.id.randomImageView)
        val url = listOf<String>(
            "https://image.shutterstock.com/image-photo/panoramic-view-empty-highway-through-260nw-2111339666.jpg",
            "https://image.shutterstock.com/image-photo/cannon-beach-dusk-solitude-evening-260nw-2101471654.jpg",
            "https://image.shutterstock.com/image-photo/nature-twilight-period-which-including-260nw-725423245.jpg",
            "https://image.shutterstock.com/image-photo/long-exposure-twilight-sky-people-260nw-256615498.jpg",
            "https://image.shutterstock.com/image-photo/silhouette-rear-view-adult-travel-260nw-2197820439.jpg",
            "https://image.shutterstock.com/image-photo/milky-way-above-mountains-fog-260nw-1290018820.jpg",
            "https://image.shutterstock.com/image-photo/background-wet-asphalt-neon-light-260nw-1159309036.jpg",
            "https://image.shutterstock.com/image-photo/this-photo-illustration-deep-blue-260nw-149078339.jpg",
            "https://image.shutterstock.com/image-photo/big-astronomical-telescope-under-twilight-260nw-2110222790.jpg",
            "https://image.shutterstock.com/image-illustration/boat-silhouette-floating-on-calm-260nw-2185278579.jpg",
            "https://image.shutterstock.com/image-photo/twilight-city-park-forest-thick-260nw-1924309826.jpg",
            "https://image.shutterstock.com/image-photo/silhouette-young-couple-hiker-were-260nw-2212276909.jpg"
            )


        shuffleButton.setOnClickListener() {
            var order = (0..11).random()
            Glide.with(this).load(url[order]).fitCenter().into(imageView)
        }

    }
}