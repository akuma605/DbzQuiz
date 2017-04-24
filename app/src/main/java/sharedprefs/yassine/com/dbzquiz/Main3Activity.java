package sharedprefs.yassine.com.dbzquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mTextViewResult;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTextViewResult = (TextView) findViewById(R.id.resultId);
        mButton = (Button) findViewById(R.id.restart_buttonId);

        Bundle extras = getIntent().getExtras();

        if (extras != null){

            if (extras.getInt("score") == 0 || extras.getInt("score") == 1){

                mTextViewResult.setText("Vous avez " +extras.get("score")+ " bonne réponse");

            }else {

                mTextViewResult.setText("Vous avez " +extras.get("score")+ " bonnes réponses");

            }
        }

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent restartIntent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(restartIntent);
                finish();
            }
        });
    }
}
