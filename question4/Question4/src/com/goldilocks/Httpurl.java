package com.goldilocks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Httpurl {
   
    public static void main(String[] args) {
    	
        String url = "http://127.0.0.1:8999/test?value=p";

        try {
            String rs = callHTTPUrl(url);
            
            System.out.println("HTTP Response:-");
            System.out.println(rs);
        } catch (IOException e) {
            System.out.println("something went wrong" + e.getMessage());
        }
    }

    public static String callHTTPUrl(String url) throws IOException {
        URL ur = new URL(url);

        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ur.openStream()))) {
            StringBuilder response = new StringBuilder();
            String inputLine;

            
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }

            return response.toString();
        }
    }
}