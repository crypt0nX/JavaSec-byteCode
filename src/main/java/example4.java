import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;

import java.util.*;



public class example4 {
    public static void main(String[] args) {
        byte[] code = Base64.getDecoder().decode("");
        TemplatesImpl obj = new TemplatesImpl();
        setFieldValue(obj, "_bytecodes", new byte[][] {code});
        setFieldValue(obj, "_name", "HelloTemplatesImpl");

        setFieldValue(obj, "_tfactory", new TransformerFactoryImpl());

        obj.newTransformer();
    }

}
