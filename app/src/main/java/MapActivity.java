import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import jetstreams.jetstreamsproject.R;

/**
 * Created by Goemon on 11/11/2017.
 */

public class MapActivity extends AppCompatActivity {

    private static final String TAG = "MapActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
    }
}
