package com.example.android.scorekeeper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.example.android.scorekeeper.R;
public class MainActivity extends AppCompatActivity {
    // Tracks the goal score for Team Australia
    int goalScoreAustralia = 0;
    // Tracks the score of fouls for Team Australia
    int foulAustralia = 0;
    // Tracks the score of cards for Team Australia
    int cardAustralia = 0;
    // Tracks the goal score for Team Honduras
    int goalScoreHonduras = 0;
    // Tracks the score of fouls for Team Honduras
    int foulHonduras = 0;
    // Tracks the score of cards for Team Honduras
    int cardHonduras = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        int action_settings = 0;
        if (id == action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    /**
     * Increase the score of goals for Team Australia by 1 point.
     */
    public void addOneForTeamAustralia(View v) {
        goalScoreAustralia = goalScoreAustralia + 1;
        displayForTeamAustralia(goalScoreAustralia);
    }
    /**
     * Increase the score of fouls for Team Australia by 1 point.
     */
    public void addOneFoulForTeamAustralia(View v) {
        foulAustralia = foulAustralia + 1;
        displayFoulForTeamAustralia(foulAustralia);
    }
    /**
     * Increase the score of cards for Team Australia by 1 point.
     */
    public void addOneCardForTeamAustralia(View v) {
        cardAustralia = cardAustralia + 1;
        displayCardForTeamAustralia(cardAustralia);
    }
    /**
     * Increase the score of goals for Team Honduras by 1 point.
     */
    public void addOneForTeamHonduras(View v) {
        goalScoreHonduras = goalScoreHonduras + 1;
        displayForTeamHonduras(goalScoreHonduras);
    }
    /**
     * Increase the score of fouls for Team Honduras by 1 point.
     */
    public void addOneFoulForTeamHonduras(View v) {
        foulHonduras = foulHonduras + 1;
        displayFoulForTeamHonduras(foulHonduras);
    }
    /**
     * Increase the score of cards for Team Honduras by 1 point.
     */
    public void addOneCardForTeamHonduras(View v) {
        cardHonduras = cardHonduras + 1;
        displayCardForTeamHonduras(cardHonduras);
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        goalScoreAustralia = 0;
        foulAustralia = 0;
        cardAustralia = 0;
        goalScoreHonduras = 0;
        foulHonduras = 0;
        cardHonduras = 0;
        displayForTeamAustralia(goalScoreAustralia) ;
        displayFoulForTeamAustralia(foulAustralia) ;
        displayCardForTeamAustralia(cardAustralia) ;
        displayForTeamHonduras(goalScoreHonduras) ;
        displayFoulForTeamHonduras(foulHonduras) ;
        displayCardForTeamHonduras(cardHonduras);
    }
    /**
     * Displays the given goal score for Team Australia.
     */
    public void displayForTeamAustralia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.australia_goal_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score of fouls for Team Australia.
     */
    public void displayFoulForTeamAustralia(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.australia_foul);
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * Displays the given score of cards for Team Australia.
     */
    public void displayCardForTeamAustralia(int card) {
        TextView scoreView = (TextView) findViewById(R.id.australia_card);
        scoreView.setText(String.valueOf(card));
    }
    /**
     * Displays the given score for Team Honduras.
     */
    public void displayForTeamHonduras(int score) {
        TextView scoreView = (TextView) findViewById(R.id.honduras_goal_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score of fouls for Team Honduras.
     */
    public void displayFoulForTeamHonduras(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.honduras_foul);
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * Displays the given score of cards for Team Honduras.
     */
    public void displayCardForTeamHonduras(int card) {
        TextView scoreView = (TextView) findViewById(R.id.honduras_card);
        scoreView.setText(String.valueOf(card));
    }
}