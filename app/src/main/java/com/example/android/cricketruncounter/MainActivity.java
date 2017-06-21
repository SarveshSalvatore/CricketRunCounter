package com.example.android.cricketruncounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *Increase the score by 6 runs
     */
    public void AddSixForTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     *Increase the score by 4 runs
     */
    public void AddFourForTeamA(View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    /**
     *Increase the score by 1 run
     */
    public void AddOneForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     *Increase the score by 6 runs
     */
    public void AddSixForTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     *Increase the score by 4 runs
     */
    public void AddFourForTeamB(View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    /**
     *Increase the score by 1 run
     */
    public void AddOneForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
