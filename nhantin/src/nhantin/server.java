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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nhaha
 */
public class server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServerSocket listener =null;
        String line=null;
        BufferedReader is=null;
        BufferedWriter os =null;
        Socket server = null;
        try {
            listener = new ServerSocket(8888);
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(0);
        }
        System.out.println("server dang doi");
        try {
            server=listener.accept();
            System.out.println("ket noi thanh cong may khach! bat dau nhan tin\n\n");
            is=new BufferedReader(new InputStreamReader(server.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
            for(;;){
                String a;
                line=is.readLine();
                System.out.println("clinet: "+line);
                System.out.print("server: ");
                a = new Scanner(System.in).nextLine();
                os.write(a);
                os.newLine();
                os.flush();
                if (line.equals("bye")) {
                   os.write("bye");
                   os.newLine();
                   os.flush();
                   break;
               
            }
            }
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
