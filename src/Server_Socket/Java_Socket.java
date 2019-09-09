package Server_Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
Sử dụng giao thức ccp truyền tải nội dung qua mạng
 */
public class Java_Socket {
    public static void main(String[] args) {
        try{
            System.out.println("Start server!");
            ServerSocket serverSocket = new ServerSocket(6666);
            /*
            Tim hiểu thêm về các cổng port
             */
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String str = dataInputStream.readUTF();
            System.out.println(str);
            dataInputStream.close();
            socket.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
