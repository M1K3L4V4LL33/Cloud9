package comm1k3l4v4ll33.httpsgithub.cloud9;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class StageActivity extends AppCompatActivity {
    public static final String EXTRA_STAGENO = "stageNo";

    private ImageView dStagePhoto;
    private TextView dStageName;
    private TextView dStageDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);

        int stageNo = (Integer) getIntent().getExtras().get(EXTRA_STAGENO);

        Stage stage = Stage.stages[stageNo];

        dStagePhoto = (ImageView) findViewById(R.id.iv_stage);
        dStageName = (TextView) findViewById(R.id.tv_name);
        dStageDescription = (TextView) findViewById(R.id.tv_description);

        dStagePhoto.setImageResource( stage.stageImageResourceId() );
        dStagePhoto.setContentDescription( stage.getName() );

        dStageName.setText( stage.getName() );

        dStageDescription.setText( stage.getDescription() );
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}

