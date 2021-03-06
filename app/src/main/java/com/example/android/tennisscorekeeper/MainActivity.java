package com.example.android.tennisscorekeeper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String scorePlayer1 = "0";
    String scorePlayer2 = "0";
    int setPlayer1 = 0;
    int setPlayer2 = 0;
    int set2Player1= 0;
    int set2Player2 = 0;
    int set3Player1 = 0;
    int set3Player2 = 0;
    int tieBreakPlayer1 = 0;
    int tieBreakPlayer2 = 0;

    private TextView gameScorePlayer1View;
    private TextView gameScorePlayer2View;
    private TextView set1ScorePlayer1View;
    private TextView set1ScorePlayer2View;
    private TextView set2ScorePlayer1View;
    private TextView set2ScorePlayer2View;
    private TextView set3ScorePlayer1View;
    private TextView set3ScorePlayer2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameScorePlayer1View = findViewById(R.id.game_score_player1);
        gameScorePlayer2View = findViewById(R.id.game_score_player2);
        set1ScorePlayer1View = findViewById(R.id.set1_player1);
        set1ScorePlayer2View = findViewById(R.id.set1_player2);
        set2ScorePlayer1View = findViewById(R.id.set2_player1);
        set2ScorePlayer2View = findViewById(R.id.set2_player2);
        set3ScorePlayer1View = findViewById(R.id.set3_player1);
        set3ScorePlayer2View = findViewById(R.id.set3_player2);
    }

    private static final String KEY_SCORE_PLAYER_1 = "SavedStateOfScorePlayer1";
    private static final String KEY_SCORE_PLAYER_2 = "SavedStateOfScorePlayer2";
    private static final String KEY_SET1_PLAYER_1 = "SavedStateOfSet1Player1";
    private static final String KEY_SET1_PLAYER_2 = "SavedStateOfSet1Player2";
    private static final String KEY_SET2_PLAYER_1 = "SavedStateOfSet2Player1";
    private static final String KEY_SET2_PLAYER_2 = "SavedStateOfSet2Player2";
    private static final String KEY_SET3_PLAYER_1 = "SavedStateOfSet3Player1";
    private static final String KEY_SET3_PLAYER_2 = "SavedStateOfSet3Player2";
    private static final String KEY_TIE_PLAYER_1 = "SavedStateOfTiePlayer1";
    private static final String KEY_TIE_PLAYER_2 = "SavedStateOfTiePlayer2";


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Passing the saved state value to the variable
        scorePlayer1 = savedInstanceState.getString(KEY_SCORE_PLAYER_1);
        scorePlayer2 = savedInstanceState.getString(KEY_SCORE_PLAYER_2);
        setPlayer1 = savedInstanceState.getInt(KEY_SET1_PLAYER_1);
        setPlayer2 = savedInstanceState.getInt(KEY_SET1_PLAYER_2);
        set2Player1 = savedInstanceState.getInt(KEY_SET2_PLAYER_1);
        set2Player2 = savedInstanceState.getInt(KEY_SET2_PLAYER_2);
        set3Player1 = savedInstanceState.getInt(KEY_SET3_PLAYER_1);
        set3Player2 = savedInstanceState.getInt(KEY_SET3_PLAYER_2);
        tieBreakPlayer1 = savedInstanceState.getInt(KEY_TIE_PLAYER_1);
        tieBreakPlayer2 = savedInstanceState.getInt(KEY_TIE_PLAYER_2);
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displaySetForPlayer1(setPlayer1);
        displaySetForPlayer2(setPlayer2);
        displaySet2ForPlayer1(set2Player1);
        displaySet2ForPlayer2(set2Player2);
        displaySet3ForPlayer1(set3Player1);
        displaySet3ForPlayer2(set3Player2);
        if (setPlayer1== 6 && setPlayer2== 6) {
            displayTieBreakPlayer1(tieBreakPlayer1);
            displayTieBreakPlayer2(tieBreakPlayer2);}
        if (set2Player1== 6 && set2Player2== 6) {
            displayTieBreakPlayer1(tieBreakPlayer1);
            displayTieBreakPlayer2(tieBreakPlayer2);}
        if (set3Player1== 6 && set3Player2== 6) {
            displayTieBreakPlayer1(tieBreakPlayer1);
            displayTieBreakPlayer2(tieBreakPlayer2);}
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        // Save the current value of the variable.
        savedInstanceState.putString(KEY_SCORE_PLAYER_1, scorePlayer1);
        savedInstanceState.putString(KEY_SCORE_PLAYER_2, scorePlayer2);
        savedInstanceState.putInt(KEY_SET1_PLAYER_1, setPlayer1);
        savedInstanceState.putInt(KEY_SET1_PLAYER_2, setPlayer2);
        savedInstanceState.putInt(KEY_SET2_PLAYER_1, set2Player1);
        savedInstanceState.putInt(KEY_SET2_PLAYER_2, set2Player2);
        savedInstanceState.putInt(KEY_SET3_PLAYER_1, set3Player1);
        savedInstanceState.putInt(KEY_SET3_PLAYER_2, set3Player2);
        savedInstanceState.putInt(KEY_TIE_PLAYER_1, tieBreakPlayer1);
        savedInstanceState.putInt(KEY_TIE_PLAYER_2, tieBreakPlayer2);
        // Always call the super class so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    /**
     * Displays the given scores for Player 1.
     */
    public void displayForPlayer1(String scorePlayer1) {
        TextView scoreView = gameScorePlayer1View;
        scoreView.setText(String.valueOf(scorePlayer1));
    }

    public void displayTieBreakPlayer1(int tieBreakPlayer1) {
        TextView scoreView = gameScorePlayer1View;
        scoreView.setText(String.valueOf(tieBreakPlayer1));
    }

    public void displaySetForPlayer1(int setPlayer1) {
        TextView scoreView = set1ScorePlayer1View;
        scoreView.setText(String.valueOf(setPlayer1));
    }
    public void displaySet2ForPlayer1(int set2Player1) {
        TextView scoreView = set2ScorePlayer1View;
        scoreView.setText(String.valueOf(set2Player1));
    }
    public void displaySet3ForPlayer1(int set3Player1) {
        TextView scoreView = set3ScorePlayer1View;
        scoreView.setText(String.valueOf(set3Player1));
    }


    /**
     * Display the given scores for Player 2.
     */
    public void displayForPlayer2(String scorePlayer2) {
        TextView scoreView = gameScorePlayer2View;
        scoreView.setText(String.valueOf(scorePlayer2));
    }

    public void displaySetForPlayer2(int setPlayer2) {
        TextView scoreView = set1ScorePlayer2View;
        scoreView.setText(String.valueOf(setPlayer2));
    }

    public void displaySet2ForPlayer2(int set2Player2) {
        TextView scoreView = set2ScorePlayer2View;
        scoreView.setText(String.valueOf(set2Player2));
    }

    public void displaySet3ForPlayer2(int set3Player2) {
        TextView scoreView = set3ScorePlayer2View;
        scoreView.setText(String.valueOf(set3Player2));
    }

    public void displayTieBreakPlayer2(int tieBreakPlayer2) {
        TextView scoreView = gameScorePlayer2View;
        scoreView.setText(String.valueOf(tieBreakPlayer2));
    }

    /**
     * Increment Score for Player 1.
     */
    public void incrementPlayer1 (View view) {
        if ((setPlayer1 <= 5 || (setPlayer1 - setPlayer2 <= 1 )&& setPlayer1 != 7) && (setPlayer2 <= 5 || (setPlayer2 - setPlayer1 <= 1) && setPlayer2 != 7 ))
        {                                                                   //***** Set 1
        if (setPlayer1 == 6 && setPlayer2 == 6) //***Tiebreak
        {
            if (tieBreakPlayer1 >= 6 && (tieBreakPlayer1 - tieBreakPlayer2 >= 1)) {
                tieBreakPlayer1 = 0;
                tieBreakPlayer2 = 0;
                setPlayer1++;
                displaySetForPlayer1(setPlayer1);
                displayTieBreakPlayer1(tieBreakPlayer1);
                displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player1);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
            }
            else
                tieBreakPlayer1++;
            displayTieBreakPlayer1(tieBreakPlayer1);
            }
            else{
        switch (scorePlayer1) { //*** Game Score
            case "0":
                scorePlayer1 = "15";
                break;
            case "15":
                scorePlayer1 = "30";
                break;
            case "30":
                scorePlayer1 = "40";
                break;
            case "40":
                if (scorePlayer2 == "40"){
                    scorePlayer1 = "A";
                    scorePlayer2 = "-";}
                else
                {scorePlayer1 = "0";
                scorePlayer2 = "0";
                setPlayer1++;}
                break;
            case "-":
                    scorePlayer2 = "40";
                    scorePlayer1 = "40";
                break;
            case "A":
                scorePlayer2 = "0";
                scorePlayer1 = "0";
                setPlayer1++;
                break;
        }
        displayForPlayer2(scorePlayer2);
        displayForPlayer1(scorePlayer1);
            //scoreView;
        displaySetForPlayer1(setPlayer1);
       if (setPlayer1 == 6 && setPlayer2 ==6){
            Context context = getApplicationContext();
           CharSequence text =  getString (R.string.tie);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.TOP, 0, 300);
           toast.show();
        }}}
        else if ((set2Player1 <= 5 || (set2Player1 - set2Player2 <= 1 )&& set2Player1 != 7) && (set2Player2 <= 5 || (set2Player2 - set2Player1 <= 1) && set2Player2 != 7 ))
        {                                                                   //***** Set 2
            if (set2Player1 == 6 && set2Player2 == 6) //***Tiebreak
            {
                if (tieBreakPlayer1 >= 6 && (tieBreakPlayer1 - tieBreakPlayer2 >= 1)) {
                    tieBreakPlayer1 = 0;
                    tieBreakPlayer2 = 0;
                    set2Player1++;
                    displaySet2ForPlayer1(set2Player1);
                    displayTieBreakPlayer1(tieBreakPlayer1);
                    displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player1);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }
                else
                    tieBreakPlayer1++;
                displayTieBreakPlayer1(tieBreakPlayer1);
            }
            else{
                switch (scorePlayer1) { //*** Game Score
                    case "0":
                        scorePlayer1 = "15";

                        break;
                    case "15":
                        scorePlayer1 = "30";
                        break;
                    case "30":
                        scorePlayer1 = "40";
                        break;
                    case "40":
                        if (scorePlayer2 == "40"){
                            scorePlayer1 = "A";
                            scorePlayer2 = "-";}
                        else
                        {scorePlayer1 = "0";
                            scorePlayer2 = "0";
                            set2Player1++;}
                        break;
                    case "-":
                        scorePlayer2 = "40";
                        scorePlayer1 = "40";
                        break;
                    case "A":
                        scorePlayer2 = "0";
                        scorePlayer1 = "0";
                        set2Player1++;
                        break;
                }
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
                displaySet2ForPlayer1(set2Player1);
                if (set2Player1 == 6 && set2Player2 ==6){
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }}}
        else if ((set3Player1 <= 5 || (set3Player1 - set3Player2 <= 1 )&& set3Player1 != 7) && (set3Player2 <= 5 || (set3Player2 - set3Player1 <= 1) && set3Player2 != 7 ))
        {                                                                   //***** Set 3
            if (set3Player1 == 6 && set3Player2 == 6) //***Tiebreak
            {
                if (tieBreakPlayer1 >= 6 && (tieBreakPlayer1 - tieBreakPlayer2 >= 1)) {
                    tieBreakPlayer1 = 0;
                    tieBreakPlayer2 = 0;
                    set3Player1++;
                    displaySet3ForPlayer1(set3Player1);
                    displayTieBreakPlayer1(tieBreakPlayer1);
                    displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player1);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }
                else
                    tieBreakPlayer1++;
                displayTieBreakPlayer1(tieBreakPlayer1);
            }
            else{
                switch (scorePlayer1) { //*** Game Score
                    case "0":
                        scorePlayer1 = "15";
                        break;
                    case "15":
                        scorePlayer1 = "30";
                        break;
                    case "30":
                        scorePlayer1 = "40";
                        break;
                    case "40":
                        if (scorePlayer2 == "40"){
                            scorePlayer1 = "A";
                            scorePlayer2 = "-";}
                        else
                        {scorePlayer1 = "0";
                            scorePlayer2 = "0";
                            set3Player1++;}
                        break;
                    case "-":
                        scorePlayer2 = "40";
                        scorePlayer1 = "40";
                        break;
                    case "A":
                        scorePlayer2 = "0";
                        scorePlayer1 = "0";
                        set3Player1++;
                        break;
                }
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
                displaySet3ForPlayer1(set3Player1);
                if (set3Player1 == 6 && set3Player2 ==6){
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }}}}


    /**
     * Increment Score for Player 2.
     */
    public void incrementPlayer2 (View view) {

        if ((setPlayer1 <= 5 || (setPlayer1 - setPlayer2 <= 1 )&& setPlayer1 != 7) && (setPlayer2 <= 5 || (setPlayer2 - setPlayer1 <= 1) && setPlayer2 != 7 ))
        {
        if (setPlayer1 == 6 && setPlayer2 == 6)
        {
            if (tieBreakPlayer2 >= 6 && (tieBreakPlayer2 - tieBreakPlayer1 >= 1)) {
                tieBreakPlayer1 = 0;
                tieBreakPlayer2 = 0;
                setPlayer2++;
                displaySetForPlayer2(setPlayer2);
                displayTieBreakPlayer1(tieBreakPlayer1);
                displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player2);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
            }
            else
                tieBreakPlayer2++;
            displayTieBreakPlayer2(tieBreakPlayer2);}
        else{
        switch (scorePlayer2) {
            case "0":
                scorePlayer2 = "15";
                break;
            case "15":
                scorePlayer2 = "30";
                break;
            case "30":
                scorePlayer2 = "40";
                break;
            case "40":
                if (scorePlayer1 == "40"){
                scorePlayer1 = "-";
                scorePlayer2 = "A";}
                else
                {scorePlayer2 = "0";
                scorePlayer1 = "0";
                setPlayer2++;}
                break;
            case "-":
                scorePlayer2 = "40";
                scorePlayer1 = "40";
                break;
            case  "A":
                scorePlayer2 = "0";
                scorePlayer1 = "0";
                setPlayer2++;
                break;
        }
        displayForPlayer2(scorePlayer2);
        displayForPlayer1(scorePlayer1);
        displaySetForPlayer2(setPlayer2);
            if (setPlayer1 == 6 && setPlayer2 ==6){
                Context context = getApplicationContext();
                CharSequence text =  getString (R.string.tie);
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.TOP, 0, 300);
                toast.show();
    }}}        else if ((set2Player1 <= 5 || (set2Player1 - set2Player2 <= 1 )&& set2Player1 != 7) && (set2Player2 <= 5 || (set2Player2 - set2Player1 <= 1) && set2Player2 != 7 ))
        {                                                                   //***** Set 2
            if (set2Player1 == 6 && set2Player2 == 6) //***Tiebreak
            {
                if (tieBreakPlayer2 >= 6 && (tieBreakPlayer2 - tieBreakPlayer1 >= 1)) {
                    tieBreakPlayer1 = 0;
                    tieBreakPlayer2 = 0;
                    set2Player2++;
                    displaySet2ForPlayer2(set2Player2);
                    displayTieBreakPlayer1(tieBreakPlayer1);
                    displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player2);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }
                else
                    tieBreakPlayer2++;
                displayTieBreakPlayer2(tieBreakPlayer2);
            }
            else{
                switch (scorePlayer2) { //*** Game Score
                    case "0":
                        scorePlayer2 = "15";
                        break;
                    case "15":
                        scorePlayer2 = "30";
                        break;
                    case "30":
                        scorePlayer2 = "40";
                        break;
                    case "40":
                        if (scorePlayer1 == "40"){
                            scorePlayer2 = "A";
                            scorePlayer1 = "-";}
                        else
                        {scorePlayer1 = "0";
                            scorePlayer2 = "0";
                            set2Player2++;}
                        break;
                    case "-":
                        scorePlayer2 = "40";
                        scorePlayer1 = "40";
                        break;
                    case "A":
                        scorePlayer2 = "0";
                        scorePlayer1 = "0";
                        set2Player2++;
                        break;
                }
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
                displaySet2ForPlayer2(set2Player2);
                if (set2Player1 == 6 && set2Player2 ==6){
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }}}
        else if ((set3Player1 <= 5 || (set3Player1 - set3Player2 <= 1 )&& set3Player1 != 7) && (set3Player2 <= 5 || (set3Player2 - set3Player1 <= 1) && set3Player2 != 7 ))
        {                                                                   //***** Set 3
            if (set3Player1 == 6 && set3Player2 == 6) //***Tiebreak
            {
                if (tieBreakPlayer2 >= 6 && (tieBreakPlayer2 - tieBreakPlayer1 >= 1)) {
                    tieBreakPlayer1 = 0;
                    tieBreakPlayer2 = 0;
                    set3Player2++;
                    displaySet3ForPlayer2(set3Player2);
                    displayTieBreakPlayer1(tieBreakPlayer1);
                    displayTieBreakPlayer2(tieBreakPlayer2);
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie_player2);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }
                else
                    tieBreakPlayer2++;
                displayTieBreakPlayer2(tieBreakPlayer2);
            }
            else{
                    switch (scorePlayer2) {     //*** Game Score
                        case "0":
                            scorePlayer2 = "15";
                            break;
                        case "15":
                            scorePlayer2 = "30";
                            break;
                        case "30":
                            scorePlayer2 = "40";
                            break;
                        case "40":
                            if (scorePlayer1 == "40"){
                                scorePlayer1 = "-";
                                scorePlayer2 = "A";}
                            else
                            {scorePlayer2 = "0";
                                scorePlayer1 = "0";
                                set3Player2++;}
                            break;
                        case "-":
                            scorePlayer2 = "40";
                            scorePlayer1 = "40";
                            break;
                        case  "A":
                            scorePlayer2 = "0";
                            scorePlayer1 = "0";
                            set3Player2++;
                            break;
                }
                displayForPlayer2(scorePlayer2);
                displayForPlayer1(scorePlayer1);
                displaySet3ForPlayer2(set3Player2);
                if (set3Player1 == 6 && set3Player2 ==6){
                    Context context = getApplicationContext();
                    CharSequence text =  getString (R.string.tie);
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.TOP, 0, 300);
                    toast.show();
                }}}}

    /**
     * Reset Button
     */
    public void resetAll (View view){
        scorePlayer1 = "0";
        scorePlayer2 = "0";
        setPlayer1 = 0;
        setPlayer2 = 0;
        set2Player1= 0;
        set2Player2 = 0;
        set3Player1 = 0;
        set3Player2 = 0;
        tieBreakPlayer1 = 0;
        tieBreakPlayer2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displaySetForPlayer1(setPlayer1);
        displaySetForPlayer2(setPlayer2);
        displaySet2ForPlayer2 (set2Player2);
        displaySet2ForPlayer1(set2Player2);
        displaySet3ForPlayer1(set3Player1);
        displaySet3ForPlayer2(set3Player2);
    }
}


