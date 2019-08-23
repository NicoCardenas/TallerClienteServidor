package com.escuelaing.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sockets {

    private Socket mySocket;

    // =================================================================================================================
    // //
    public Sockets(String host, int port) {
        try {
            this.mySocket = new Socket(host, port);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    // =================================================================================================================
    // //
    public void PrintSockets() {
        try {
            PrintWriter out = new PrintWriter(mySocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(out);
            System.out.println(in);
            System.out.println(stdIn);
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                System.out.println(userInput);
                System.out.println("echo: " + in.readLine());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // =================================================================================================================
    // //
    public void close() {
        try {
            this.mySocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}