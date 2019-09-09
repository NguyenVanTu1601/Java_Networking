/*
Giup  truy suất ip của 1 cái trang đưa vào
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet_Adress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("youtube.com");
        /*
        InetAddress address = InetAddress.getByName("https://google.com.vn");
        Sử dụng như vậy sẽ bị lỗi , để tìm hiểu thêm đọc về Kết nối bảo mật SSL

         */
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address.getAddress());

    }
}
