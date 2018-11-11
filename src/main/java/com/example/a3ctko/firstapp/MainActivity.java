package com.example.a3ctko.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    MessageSender s = new MessageSender();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void Connect(View view)
    {

        EditText editText_ip = findViewById(R.id.IP_txt);
        String Ip = editText_ip.getText().toString();
        EditText editText_port = findViewById(R.id.Port_txt);
        int port = Integer.parseInt(editText_port.getText().toString());
        s.SetIP(Ip);
        s.SetPort(port);
    }
    public void SendMessage(View view)
    {
        EditText editText_message = findViewById(R.id.Send_txt);
        String Message = editText_message.getText().toString();
        s.execute(Message);
      //  s.SetMessage(Message);
     //   s.doInBackground();

    }
}
