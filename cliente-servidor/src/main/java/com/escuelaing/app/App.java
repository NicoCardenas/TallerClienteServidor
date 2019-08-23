package com.escuelaing.app;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // =================================================================================================================
        // //
        URLReader url = new URLReader("https://www.youtube.com/?gl=CO&hl=es-419");
        url.PrintURL();
        url.Reader();
        // =================================================================================================================
        // //
        Sockets socket = new Sockets("www.youtube.com", 8080);
        socket.PrintSockets();
        socket.close();
    }
}
