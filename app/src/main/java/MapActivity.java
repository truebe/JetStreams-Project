import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import jetstreams.jetstreamsproject.R;

/**
 * Created by Kevin on 11/11/2017.
 * Commented by Ashwin.
 * Purpose: To create a map activity.
 */

public class MapActivity extends AppCompatActivity {

    private static final String TAG = "MapActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }
}
