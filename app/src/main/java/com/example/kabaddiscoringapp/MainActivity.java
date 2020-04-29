package com.example.kabaddiscoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
int score_a=0,fouls_a=0,score_b=0,fouls_b=0;
TextView score_A,fouls_A,score_B,fouls_B;

Button one,two,three,four,five,six,seven,teamWipeOut,bonus,foul_A,
        one_B,two_B,three_B,four_B,five_B,six_B,seven_B,teamWipeOutB,bonus_B,foul_B,Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score_A=(TextView)findViewById(R.id.ScoreA);
        score_B=(TextView)findViewById((R.id.ScoreB));
        fouls_A=(TextView)findViewById(R.id.FoulsA);
        fouls_B=(TextView)findViewById(R.id.FoulsB);

        one=(Button)findViewById(R.id.incOn);
        one_B=(Button)findViewById(R.id.incOnB);
        two=(Button)findViewById(R.id.inTw);
        two_B=(Button)findViewById(R.id.incTwB);
        three=(Button)findViewById(R.id.incTh);
        three_B=(Button)findViewById(R.id.incThB);
        four=(Button)findViewById(R.id.increaseFour);
        four_B=(Button)findViewById(R.id.incFoB);
        five=(Button)findViewById(R.id.increaseFive);
        five_B=(Button)findViewById(R.id.incFiveB);
        six=(Button)findViewById(R.id.incSi);
        six_B=(Button)findViewById(R.id.incSiB);
        seven=(Button)findViewById(R.id.incSe);
        seven_B=(Button)findViewById(R.id.incSeB);
        teamWipeOut=(Button)findViewById(R.id.teamWipe);
        teamWipeOutB=(Button)findViewById(R.id.teamBwipe);
        bonus=(Button)findViewById(R.id.bonusone);
        bonus_B=(Button)findViewById(R.id.bonusB);
        foul_A=(Button)findViewById(R.id.foul_A);
        foul_B=(Button)findViewById(R.id.foulB);
        Reset=(Button)findViewById(R.id.Reset);


        one.setOnClickListener(this);
        one_B.setOnClickListener(this);
        two.setOnClickListener(this);
        two_B.setOnClickListener(this);
        three.setOnClickListener(this);
        three_B.setOnClickListener(this);
        four.setOnClickListener(this);
        four_B.setOnClickListener(this);
        five.setOnClickListener(this);
        five_B.setOnClickListener(this);
        six.setOnClickListener(this);
        six_B.setOnClickListener(this);
        seven.setOnClickListener(this);
        seven_B.setOnClickListener(this);
        teamWipeOut.setOnClickListener(this);
        teamWipeOutB.setOnClickListener(this);
        bonus.setOnClickListener(this);
        bonus_B.setOnClickListener(this);
        foul_A.setOnClickListener(this);
        foul_B.setOnClickListener(this);
        Reset.setOnClickListener(this);
    }

    @Override
    public void onClick( View v) {
        switch (v.getId()) {
            case R.id.incOn:
            case R.id.bonusone:
                score_a=score_a+1;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.inTw:
            case R.id.teamWipe:
                score_a=score_a+2;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.incTh:
                score_a=score_a+3;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.increaseFour:
                score_a=score_a+4;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.increaseFive:
                score_a=score_a+5;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.incSi:
                score_a=score_a+6;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.incSe:
                score_a=score_a+7;
                score_A.setText(String.valueOf(score_a));
                break;
            case R.id.incOnB:
            case R.id.bonusB:
                score_b=score_b+1;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incTwB:
            case R.id.teamBwipe:
                score_b=score_b+2;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incThB:
                score_b=score_b+3;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incFoB:
                score_b=score_b+4;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incFiveB:
                score_b=score_b+5;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incSiB:
                score_b=score_b+6;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.incSeB:
                score_b=score_b+7;
                score_B.setText(String.valueOf(score_b));
                break;
            case R.id.foulB:
                fouls_b=fouls_b+1;
                fouls_B.setText(String.valueOf(fouls_b));
                break;
            case R.id.foul_A:
                fouls_a=fouls_a+1;
                fouls_A.setText(String.valueOf(fouls_a));
                break;
            case R.id.Reset:
                score_a=0;
                score_b=0;
                fouls_a=0;
                fouls_b=0;
                score_A.setText(String.valueOf(score_a));
                score_B.setText(String.valueOf(score_b));
                fouls_A.setText(String.valueOf(fouls_a));
                fouls_B.setText(String.valueOf(fouls_b));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}
