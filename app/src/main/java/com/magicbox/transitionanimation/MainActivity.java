package com.magicbox.transitionanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.btn);

        setUpTransition();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getWindow().setReenterTransition(new Fade());
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    private void setUpTransition()
    {
        getWindow().setEnterTransition(TransitionInflater.from(this).inflateTransition(
                R.transition.slide_from_bottom));
    }
}
