package justynachrustna.thousandcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = (Button) findViewById(R.id.start_button);
        final EditText player1 = (EditText) findViewById(R.id.player1_et);
        final EditText player2 = (EditText) findViewById(R.id.player2_et);
        final EditText player3 = (EditText) findViewById(R.id.player3_et);
        final EditText player4 = (EditText) findViewById(R.id.player4_et);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Counter.class);
                intent.putExtra("namePlayer1", player1.getText().toString());
                intent.putExtra("namePlayer2", player2.getText().toString());
                intent.putExtra("namePlayer3", player3.getText().toString());
                intent.putExtra("namePlayer4", player4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
