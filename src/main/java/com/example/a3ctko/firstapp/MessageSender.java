package com.example.a3ctko.firstapp;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String,Void,Void> {

    Socket s;
   // DataOutputStream dos;
    PrintWriter pw;
    private String IP ;
    private int PORT;
    private String Message;
    public void SetIP(String ip)
    {
        IP = ip;
    }
    public void SetPort(int port)
    {
        PORT = port;
    }
   /* public void SetMessage(String message)
    {
        Message = message;
    }
    */
    @Override

    protected Void doInBackground(String... voids) {

        String Message = voids[0];

        try {
            s = new Socket(IP, PORT);
            pw = new PrintWriter(s.getOutputStream());
            pw.write(Message);
            pw.flush();
            // pw.close();
            //  s.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

}
