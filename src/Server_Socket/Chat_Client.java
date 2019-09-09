package Server_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3333);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        while(true){
            // truyen du lieu len server
            String str = scanner.nextLine();
            dataOutputStream.writeUTF(str);
            dataOutputStream.flush();
            if(str.equals("close")){
                break;
            }
            // Doc du lieu tu server ve
            String str2 = dataInputStream.readUTF();
            System.out.println("Server say : " + str2);
        }
        socket.close();
        dataInputStream.close();
        dataOutputStream.close();

    }

}
