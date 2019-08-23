package com.escuelaing.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {

    private String myUrl;

    // =================================================================================================================
    // //
    public URLReader(String url) {
        this.myUrl = url;
    }

    // =================================================================================================================
    // //
    public void PrintURL() {
        try {
            URL Url = new URL(myUrl);
            System.out.println("protocol = " + Url.getProtocol());
            System.out.println("authority = " + Url.getAuthority());
            System.out.println("host = " + Url.getHost());
            System.out.println("port = " + Url.getPort());
            System.out.println("path = " + Url.getPath());
            System.out.println("query = " + Url.getQuery());
            System.out.println("filename = " + Url.getFile());
            System.out.println("ref = " + Url.getRef());
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
    }

    // =================================================================================================================
    // //
    public void Reader() {
        try {
            URL url = new URL(myUrl);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter out = new BufferedWriter(new FileWriter("resultado.html"));
            String input;
            while ((input = in.readLine()) != null)
                out.write(input); // System.out.println(input);
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}