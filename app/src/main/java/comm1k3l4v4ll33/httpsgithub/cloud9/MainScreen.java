package comm1k3l4v4ll33.httpsgithub.cloud9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainScreen extends AppCompatActivity {

    private ListView hOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        hOptionsList = (ListView) findViewById(R.id.lv_options);

        String[] options = new String[]{"Artist", "Stages", "LiveSets"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options );
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent stageIntent;
                stageIntent = new Intent(MainScreen.this, StageCatergoryActivity.class);

            }

        };


        hOptionsList.setAdapter(arrayAdapter);
        hOptionsList.setOnItemClickListener(itemClickListener);
    }
}
