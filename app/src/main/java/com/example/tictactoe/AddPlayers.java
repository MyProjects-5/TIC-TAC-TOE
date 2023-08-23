package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        EditText playerOne=findViewById(R.id.playerOne);
        EditText playerTwo=findViewById(R.id.playerTwo);
        Button startGameButton=findViewById(R.id.startGameButton);

        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPlayerOneName=playerOne.getText().toString();
                String getPlayerTwoName=playerTwo.getText().toString();

                if(getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty() )
                {
                    Toast.makeText(AddPlayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("Player One",getPlayerOneName);
                    intent.putExtra("Player Two",getPlayerTwoName);
                    startActivity(intent);
                }
            }
        });
    }
}