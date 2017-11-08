package justynachrustna.thousandcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Counter extends AppCompatActivity {
    public int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int scorePlayer3 = 0;
    int scorePlayer4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        String p1 = getIntent().getExtras().getString("namePlayer1");
        TextView namePlayer1 = (TextView) findViewById(R.id.name_player_1);
        namePlayer1.setText(p1);
        String p2 = getIntent().getExtras().getString("namePlayer2");
        TextView namePlayer2 = (TextView) findViewById(R.id.name_player_2);
        namePlayer2.setText(p2);
        String p3 = getIntent().getExtras().getString("namePlayer3");
        TextView namePlayer3 = (TextView) findViewById(R.id.name_player_3);
        namePlayer3.setText(p3);
        String p4 = getIntent().getExtras().getString("namePlayer4");
        TextView namePlayer4 = (TextView) findViewById(R.id.name_player_4);
        namePlayer4.setText(p4);


        final EditText scoreET1 = (EditText) findViewById(R.id.score_et_1);
        final EditText scoreET2 = (EditText) findViewById(R.id.score_et_2);
        final EditText scoreET3 = (EditText) findViewById(R.id.score_et_3);
        final EditText scoreET4 = (EditText) findViewById(R.id.score_et_4);

        final TextView totalScore1 = (TextView) findViewById(R.id.total_score_1);
        final TextView totalScore2 = (TextView) findViewById(R.id.total_score_2);
        final TextView totalScore3 = (TextView) findViewById(R.id.total_score_3);
        final TextView totalScore4 = (TextView) findViewById(R.id.total_score_4);

        Button minusButton1 = (Button) findViewById(R.id.minus_button_1);
        Button minusButton2 = (Button) findViewById(R.id.minus_button_2);
        Button minusButton3 = (Button) findViewById(R.id.minus_button_3);
        Button minusButton4 = (Button) findViewById(R.id.minus_button_4);

        Button plusButton1 = (Button) findViewById(R.id.plus_button_1);
        Button plusButton2 = (Button) findViewById(R.id.plus_button_2);
        Button plusButton3 = (Button) findViewById(R.id.plus_button_3);
        Button plusButton4 = (Button) findViewById(R.id.plus_button_4);
        minusButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePlayer1 = minus(scoreET1, scorePlayer1, totalScore1);
            }
        });
        minusButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePlayer2 = minus(scoreET2, scorePlayer2, totalScore2);
            }
        });
        minusButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePlayer3 = minus(scoreET3, scorePlayer3, totalScore3);
            }
        });
        minusButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePlayer4 = minus(scoreET4, scorePlayer4, totalScore4);
            }
        });

        plusButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scorePlayer1 = plus(scoreET1, scorePlayer1, totalScore1);
            }
        });
        plusButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scorePlayer2 = plus(scoreET2, scorePlayer2, totalScore2);
            }
        });
        plusButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scorePlayer3 = plus(scoreET3, scorePlayer3, totalScore3);
            }
        });
        plusButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scorePlayer4 = plus(scoreET4, scorePlayer4, totalScore4);
            }
        });
    }

    public int minus(EditText et, int scorePlayer, TextView ts) {
        try {
            int score = Integer.parseInt(String.valueOf(et.getText()));


            scorePlayer = scorePlayer - score;
            String totalScore = String.valueOf(scorePlayer);
            ts.setText(totalScore);
            et.getText().clear();
            et.setHint("0");
        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.toast_text, Toast.LENGTH_LONG).show();
        }


        return scorePlayer;
    }

    public int plus(EditText et, int scorePlayer, TextView ts) {
        try {
            int score = Integer.parseInt(String.valueOf(et.getText()));
            scorePlayer = scorePlayer + score;
            String totalScore = String.valueOf(scorePlayer);
            ts.setText(totalScore);
            et.getText().clear();

            et.setHint("0");
        } catch (NumberFormatException e) {
            Toast.makeText(this, R.string.toast_text, Toast.LENGTH_LONG).show();
        }
        return scorePlayer;
    }


}
