package jetstreams.jetstreamsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Goemon on 12/9/2017.
 */

public class aTrendIntro extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanctState){
        super.onCreate(savedInstanctState);
        setContentView(R.layout.activity_atrendintro);

        Button btnSeattle = (Button) findViewById(R.id.btnMarriott);
        btnSeattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Seattle.class);
                startActivity(i);
            }
        });

        Button btnChicago = (Button) findViewById(R.id.btnKimpton);
        btnChicago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Chicago.class);
                startActivity(i);
            }
        });

        Button btnNY = (Button) findViewById(R.id.btnDel);
        btnNY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),NY.class);
                startActivity(i);
            }
        });

        Button btnAustin = (Button) findViewById(R.id.btnHilton);
        btnAustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Austin.class);
                startActivity(i);
            }
        });

        Button btnDC = (Button) findViewById(R.id.btnDC);
        btnDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DC.class);
                startActivity(i);
            }
        });

        Button btnTampa = (Button) findViewById(R.id.btnTampa);
        btnTampa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Tampa.class);
                startActivity(i);
            }
        });



    }
}



