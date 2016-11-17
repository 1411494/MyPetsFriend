package utp.edu.pe.mypetsfriend.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import utp.edu.pe.mypetsfriend.R;

public class MainActivity extends AppCompatActivity {


    private Button startButton_Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startButton_Click = (Button) findViewById(R.id.startButton) ;
        startButton_Click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

}
