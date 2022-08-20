import java.net.*;
public class example1 {
    public static void main(String[] args) throws Exception {
        URL[] urls = {new URL("http://127.0.0.1:7777/")};
        URLClassLoader loader = URLClassLoader.newInstance(urls);
        Class c = loader.loadClass("Hello");
        c.newInstance();
    }
}
