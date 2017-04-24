package sharedprefs.yassine.com.dbzquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    private QuestionBank mQuestionBank = new QuestionBank();
    private TextView mTextViewQuestion;
    private TextView mTextViewQuestionNum;
    private TextView mTextViewScore;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private int currentIndex = 0;
    private int numQuestion = 1;
    private int score = 0;
    private String mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        setup();
        updateQuestion();

    }

    public void setup(){

        mTextViewQuestion = (TextView) findViewById(R.id.textViewQuestionId);
        mTextViewQuestionNum = (TextView) findViewById(R.id.textViewQuestionNumId);
        mTextViewScore = (TextView) findViewById(R.id.textViewScoreId);

        mButton1 = (Button) findViewById(R.id.button1Id);
        mButton2 = (Button) findViewById(R.id.button2Id);
        mButton3 = (Button) findViewById(R.id.button3Id);
        mButton4 = (Button) findViewById(R.id.button4Id);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
    }

    public void showResult(){

        if (currentIndex == 5){

            Intent resultIntent = new Intent(Main2Activity.this, Main3Activity.class);
            resultIntent.putExtra("score", score);
            startActivity(resultIntent);
            finish();
        }else {

            updateQuestion();
        }
    }


    public void updateQuestion(){

        mTextViewQuestion.setText(mQuestionBank.getQuestions(currentIndex));
        mButton1.setText(mQuestionBank.getChoices1(currentIndex));
        mButton2.setText(mQuestionBank.getChoices2(currentIndex));
        mButton3.setText(mQuestionBank.getChoices3(currentIndex));
        mButton4.setText(mQuestionBank.getChoices4(currentIndex));
        mAnswer = mQuestionBank.getCorrectAnswer(currentIndex);
        mTextViewQuestionNum.setText("Question : " +numQuestion);
        mTextViewScore.setText("Correct : " +score);

        numQuestion++;
        currentIndex++;

    }

    public void updateScore(){

        score++;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button1Id:

                if (mButton1.getText().toString() == mAnswer){

                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    updateScore();
                    showResult();

                }else {

                    Toast.makeText(getApplicationContext(), "Faux", Toast.LENGTH_LONG).show();
                    showResult();
                }

                break;

            case R.id.button2Id:

                if (mButton2.getText().toString() == mAnswer){

                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    updateScore();
                    showResult();

                }else {

                    Toast.makeText(getApplicationContext(), "Faux", Toast.LENGTH_LONG).show();
                    showResult();
                }

                break;

            case R.id.button3Id:

                if (mButton3.getText().toString() == mAnswer){

                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    updateScore();
                    showResult();

                }else {

                    Toast.makeText(getApplicationContext(), "Faux", Toast.LENGTH_LONG).show();
                    showResult();
                }

                break;

            case R.id.button4Id:

                if (mButton4.getText().toString() == mAnswer){

                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                    updateScore();
                    showResult();

                }else {

                    Toast.makeText(getApplicationContext(), "Faux", Toast.LENGTH_LONG).show();
                    showResult();
                }

                break;
        }

    }
}
