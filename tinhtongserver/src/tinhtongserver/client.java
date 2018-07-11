/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtongserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nhaha
 */
public class client {

    public client() {
        float a, b;
        final String serverhost = "localhost";
        Socket socketOfClient = null;
        BufferedWriter os = null;
        BufferedReader is = null;
        try {
            socketOfClient = new Socket(serverhost, 9999);
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));

            is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));

        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(" nhap so a: ");
            a = new Scanner(System.in).nextFloat();
            System.out.println(" nhap so b: ");
            b = new Scanner(System.in).nextFloat();
            os.write(a + "$" + b);
            os.newLine();
            os.flush();

            String Line;
           while ((Line = is.readLine()) != null) {
               System.out.println("Server: " + Line);
                   break;
           }
            os.close();
            is.close();
            socketOfClient.close();
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new  client(); 
    }
}
