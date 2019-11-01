package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class SampleList extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_list);

        ListView lv = findViewById(R.id.lvLoremIpsum);
        Spinner spnProg = findViewById(R.id.spinnerProgmob);
        //TextView selection;

        lv.setAdapter(new ArrayAdapter<String>(SampleList.this, android.R.layout.simple_list_item_1, items)); //List View nanti yang nampung Adapter terlebih dahulu
        ArrayAdapter<String> aa = new ArrayAdapter<String>(SampleList.this, android.R.layout.simple_list_item_1, items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnProg.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //int i untuk tau urutan item
                Toast.makeText(SampleList.this, "Anda memilih " + items[i], Toast.LENGTH_SHORT).show(); //length short durasi krg lbh 2 dtk
                //javascript:Alert, C#:MessageBox, JavaAndroid: Toast
            }
        });

        spnProg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SampleList.this, "Anda memilih " + items[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(SampleList.this, "Anda tidak memilih ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
