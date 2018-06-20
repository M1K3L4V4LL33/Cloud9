package comm1k3l4v4ll33.httpsgithub.cloud9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.layout.simple_list_item_1;

public class StageCatergoryActivity extends AppCompatActivity {

    private ListView cStageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_catergory);

        cStageList = (ListView) findViewById(R.id.lv_stage);

        ArrayAdapter<Stage> arrayAdapter = new ArrayAdapter<Stage>(this, simple_list_item_1, Stage.stages);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent stageIntent = new Intent(StageCatergoryActivity.this, StageActivity.class );

                stageIntent.putExtra( StageActivity.EXTRA_STAGENO, position);

                startActivity( stageIntent );
                overridePendingTransition( R.anim.slide_in_left, R.anim.slide_out_left);
            }
        };


        cStageList.setAdapter(arrayAdapter);
        cStageList.setOnItemClickListener( itemClickListener );
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();


        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}

