/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhantin;

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

    public static void main(String[] args) {

        final String serverhost = "localhost";
        Socket client = null;
        BufferedWriter os = null;
        BufferedReader is = null;
        try {
            client = new Socket(serverhost, 8888);
            os = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            is = new BufferedReader(new InputStreamReader(client.getInputStream()));

        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            for (;;) {
                String a;
                System.out.print("client: ");
                a = new Scanner(System.in).nextLine();
                os.write(a);
                os.newLine();
                os.flush();
                String responseLine;
                responseLine = is.readLine();
                System.out.println("Server: " + responseLine);
                if (responseLine.indexOf("bye") != -1) {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
