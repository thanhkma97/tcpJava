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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nhaha
 */
public class Tinhtongserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a;
        ServerSocket listen = null;
        String line,b;
        BufferedWriter os = null;
        BufferedReader is = null;
        Socket server = null;
        int port = 9999;
        try {
            listen = new ServerSocket(port);
        } catch (IOException ex) {
            Logger.getLogger(Tinhtongserver.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);

        }
        System.out.println("server dang doi....");
        try {
            server = listen.accept();
            System.out.println("chap nhan may khach");

            is = new BufferedReader(new InputStreamReader(server.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
            while ((line = is.readLine()) != null) {
                String arr[] = line.split("\\$");
                a = Float.parseFloat(arr[0]) + Float.parseFloat(arr[1]);
                b=""+a;
                os.write("tong = "+b);
                os.newLine();
                os.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(Tinhtongserver.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("dung lai");
    }

}
