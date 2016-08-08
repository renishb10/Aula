package aula.pearson.com.aula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button play = (Button) findViewById(R.id.playButton);
        play.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent in = new Intent(DetailActivity.this, CardboardActivity.class);
                startActivity(in);
                return true;
            }

        });
    }
}