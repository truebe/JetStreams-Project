package jetstreams.jetstreamsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class DC extends AppCompatActivity {

public static final String MonthOfarray = "Month";
    public static final String Month  = "Month";
public static final String Price = "Price";
    public static final String JSON_ARRAY = "result";
    private JSONArray result;
    Spinner spinner;
    String  MonthOf;
    private ArrayList<String> arrayList;

    TextView month,price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dc);
        spinner= (Spinner) findViewById(R.id.Spinner);
        month= (TextView) findViewById(R.id.Month);
        price= (TextView) findViewById(R.id.Price);
        arrayList = new ArrayList<String>();
        getdata();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Setting the values to textviews for a selected item
                //month.setText(getMonth(position));
                price.setText(getPrice(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                month.setText("");
                price.setText("");
            }
        });
    }
    private void getdata() {
        StringRequest stringRequest = new StringRequest("http://cis444.cs.csusm.edu/trueb003/CS%20441/getdatadc.php",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        JSONObject j = null;
                        try {
                            j = new JSONObject(response);
                            result = j.getJSONArray(JSON_ARRAY);
                            details(result);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    private void details(JSONArray j) {
        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject json = j.getJSONObject(i);
                arrayList.add(json.getString(MonthOfarray));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        // arrayList.add(0,"Select Month");
        spinner.setAdapter(new ArrayAdapter<String>(DC.this, android.R.layout.simple_spinner_dropdown_item, arrayList));
    }
    //Method to get month of a particular position
    private String getMonth(int position){
        String month="";
        try {
            //Getting object of given index
            JSONObject json = result.getJSONObject(position);
            //Fetching month from that object
            month = json.getString(Month);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Returning the month
        return month;
    }
    //Doing the same with this method as we did with getPrice()
    private String getPrice(int position){
        String price="";
        try {
            JSONObject json = result.getJSONObject(position);
            price = json.getString(Price);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return price;
    }
}