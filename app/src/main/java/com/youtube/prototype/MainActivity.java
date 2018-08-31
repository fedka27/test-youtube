package com.youtube.prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * From layout
     */
    public void youtubeApiDemosClicked(View view) {
        startActivity(YouTubeAPIDemoActivity.class);
    }

    private void startActivity(Class<?> clazz) {
        startActivity(new Intent(this, clazz));
    }
}
