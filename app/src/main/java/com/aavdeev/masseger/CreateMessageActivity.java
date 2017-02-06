package com.aavdeev.masseger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

    }


    public void onSendMessage(View view) {

       // EditText text = (EditText) findViewById(R.id.message);


        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//        intent.putExtra("text", text.getText().toString());
        startActivity(intent);

    }
}
