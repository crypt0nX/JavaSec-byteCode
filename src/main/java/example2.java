import java.lang.reflect.Method;
import java.util.Base64;

public class example2 {
    public static void main(String[] args) throws Exception {
        Method defineClass = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);

        defineClass.setAccessible(true);

        byte[] code = Base64.getDecoder().decode("yv66vgAAADQAHAoABgAOCQAPABAIABEKABIAEwcAFAcAFQEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBAAg8Y2xpbml0PgEAClNvdXJjZUZpbGUBAApIZWxsby5qYXZhDAAHAAgHABYMABcAGAEAC0hlbGxvIFdvcmxkBwAZDAAaABsBAAVIZWxsbwEAEGphdmEvbGFuZy9PYmplY3QBABBqYXZhL2xhbmcvU3lzdGVtAQADb3V0AQAVTGphdmEvaW8vUHJpbnRTdHJlYW07AQATamF2YS9pby9QcmludFN0cmVhbQEAB3ByaW50bG4BABUoTGphdmEvbGFuZy9TdHJpbmc7KVYAIQAFAAYAAAAAAAIAAQAHAAgAAQAJAAAAHQABAAEAAAAFKrcAAbEAAAABAAoAAAAGAAEAAAABAAgACwAIAAEACQAAACUAAgAAAAAACbIAAhIDtgAEsQAAAAEACgAAAAoAAgAAAAMACAAEAAEADAAAAAIADQ==");

        Class hello = (Class) defineClass.invoke(ClassLoader.getSystemClassLoader(), "Hello", code, 0, code.length);

        hello.newInstance();

    }
}