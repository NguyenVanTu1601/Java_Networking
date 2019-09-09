
/*
 Kết nối và đọc thông tin 1 trang có địa chỉ url
 Bị lỗi
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL_Connection {
    public static void main(String[] args) throws IOException,MalformedURLException{
        URL url = new URL("https://trungtamjava.com/khoa-hoc-java-co-ban");
        URLConnection urlConnection = url.openConnection();
        try (InputStream inputStream = urlConnection.getInputStream()) {
            int i = inputStream.read();
            while(i != -1){
                System.out.print((char) i);
                i = inputStream.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
