package com.example.suvratjain.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EnterRoom extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_room);
    }



    public void enterRoom(View view) {

        Intent i = getIntent();
        Bundle b = i.getExtras();

        String displayName = (String)b.get("display name");
        EditText roomNumber = findViewById(R.id.roomNum);
        String room_number = roomNumber.getText().toString();

        if(!roomNumber.getText().toString().equals(""))
        {
            EnterRoomWorker enterSession = new EnterRoomWorker(this);
            enterSession.execute(room_number, displayName);
        }



// String toastText = "Entering room #" + room_number;
////        Toast.makeText(EnterRoom.this, toastText, Toast.LENGTH_LONG).show();
//
////        Intent i = new Intent(this, Game.class);
//////        i.putExtra("Room Number", roomNumber);
////        startActivity(i);
////
////        finish();
//
    }


}
