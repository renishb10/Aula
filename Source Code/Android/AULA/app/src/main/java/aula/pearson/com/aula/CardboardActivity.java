package aula.pearson.com.aula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class CardboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardboard);
        LinearLayout ll = (LinearLayout)findViewById(R.id.cardboardLayout);
        ll.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent in = new Intent(CardboardActivity.this, Welcome.class);
                startActivity(in);
                return false;
            }
        });
    }
}
