package com.example.basedlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] country_name;
    private int[] flag={R.drawable.afghanistan,R.drawable.armenia,R.drawable.azerbaijan,
            R.drawable.bahrain,R.drawable.bangladesh,
            R.drawable.bhutan,R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.nepal,
            R.drawable.pakistan,R.drawable.srilanka};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewId);
        country_name=getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter=new CustomAdapter(this,country_name,flag);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String value=country_name[position];
        Toast.makeText(MainActivity.this, "value", Toast.LENGTH_SHORT).show();


    }
});




    }
}