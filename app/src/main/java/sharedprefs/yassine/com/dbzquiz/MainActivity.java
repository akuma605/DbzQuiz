package sharedprefs.yassine.com.dbzquiz;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button mButtonStart;
    private MediaPlayer mMediaPlayer;
    private Runnable mRunnable;
    private RelativeLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonStart = (Button) findViewById(R.id.start_buttonId);
        mMediaPlayer = new MediaPlayer();
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aura2);
        main = (RelativeLayout) findViewById(R.id.activity_main);

        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mMediaPlayer.start();
                main.setBackgroundResource(R.drawable.gohan_scream_bg);
                mButtonStart.setVisibility(View.INVISIBLE);
                startQuizzDelayed();
            }
        });
    }


    public void startQuizzDelayed(){

        mRunnable = new Runnable() {
            @Override
            public void run() {

                Intent intentStart = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intentStart);

            }
        };

        Handler mHandler = new Handler();
        mHandler.postDelayed(mRunnable, 2500);
    }
}
