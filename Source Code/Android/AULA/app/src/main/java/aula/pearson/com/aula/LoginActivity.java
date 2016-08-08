package aula.pearson.com.aula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button loginButton = (Button)findViewById(R.id.loginButton);
        final EditText userText = (EditText)findViewById(R.id.userNameText);
        final EditText passwordText = (EditText)findViewById(R.id.passwordText);
        final String userT = userText.getText().toString();
        final String passT = passwordText.getText().toString();

        loginButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
//                if(userT.equals("aula") && passT.equals("aula")){
                    Intent in = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(in);
//                }else{
//                    Toast.makeText(LoginActivity.this, "Please enter the following Credentials\n UserName is: aula\n" +
//                                    " Password is: aula",
//                            Toast.LENGTH_LONG).show();
//                }

                return false;
            }
        });
    }
}
