package jetstreams.jetstreamsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Goemon on 12/9/2017.
 */

public class hTrendsIntro extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanctState){
        super.onCreate(savedInstanctState);
        setContentView(R.layout.activity_htrendintro);

        Button btnMarriott = (Button) findViewById(R.id.btnMarriott);
        btnMarriott.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Marriott.class);
                startActivity(i);
            }
        });

        Button btnKimpton = (Button) findViewById(R.id.btnKimpton);
        btnKimpton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Kimpton.class);
                startActivity(i);
            }
        });

        Button btnDel = (Button) findViewById(R.id.btnDel);
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Del.class);
                startActivity(i);
            }
        });

        Button btnHilton = (Button) findViewById(R.id.btnHilton);
        btnHilton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Hilton.class);
                startActivity(i);
            }
        });


    }
}