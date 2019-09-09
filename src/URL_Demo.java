import java.net.MalformedURLException;
import java.net.URL;

public class URL_Demo {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://trungtamjava.con/khoa-hoc-java-co-ban");
            System.out.println(url.getHost()); // host
            System.out.println(url.getProtocol()); // giao thuc
            System.out.println(url.getFile());
        } catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}
