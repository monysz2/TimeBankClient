package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws IOException {

        Scanner toSend = new Scanner(System.in);
        Socket echoSocket = new Socket("localhost", 6666);
        Scanner sc = new Scanner(echoSocket.getInputStream());
        PrintWriter printer = new PrintWriter(echoSocket.getOutputStream(),true);
        while(true)
        {
            String out = sc.nextLine();
            System.out.println(out);
            if(out.equals("> "))
            {
                String send = toSend.nextLine();
                printer.println(send);

            }





        }



    }
}