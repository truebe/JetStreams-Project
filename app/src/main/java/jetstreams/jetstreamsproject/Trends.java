package jetstreams.jetstreamsproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Trends extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trends);

        Button hotelTrends = (Button) findViewById(R.id.hotelTrends);
        hotelTrends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),hTrendsIntro.class);
                startActivity(i);

            }
        });

        Button airTrends = (Button) findViewById(R.id.airTrends);
        airTrends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),aTrendIntro.class);
                startActivity(i);
            }
        });

    }
}
