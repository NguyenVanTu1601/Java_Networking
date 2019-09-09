package Server_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
/* Client_Socket kết nối vs java_Socket*/
public class Client_Socket {
    public static void main(String[] args) {
        try{
            System.out.println("Client ket noi");
            Socket socket = new Socket("localhost",6666);
            OutputStream out;
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello java");
            dataOutputStream.flush(); // đẩy dữ liệu lên server
            dataOutputStream.close();
            socket.close();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();

        }
    }
}
