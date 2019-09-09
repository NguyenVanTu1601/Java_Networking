import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.*;

public class Http_Url_Connection {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://trungtamjava.com/");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        for(int i = 0; i < httpURLConnection.getHeaderFields().size(); i++){
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + "=" + httpURLConnection.getHeaderField(i));
        }
    }
}
/*
Các giá trị trong header
 */