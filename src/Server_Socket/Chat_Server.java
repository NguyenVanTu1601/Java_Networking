package Server_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3333);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while(true){
            //Doc du lieu tu client
            String str = dataInputStream.readUTF();
            if(str.equals("close")){
                break;
            }
            System.out.println("Client say : " + str );
            // Truyen du lieu tu server ve
            String str2 = scanner.nextLine();
            dataOutputStream.writeUTF(str2);
            dataOutputStream.flush();

        }
        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        serverSocket.close();

    }
}
