import com.baidu.aip.bodyanalysis.AipBodyAnalysis;
import org.json.JSONObject;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.Base64;
import java.util.HashMap;

public class test {
    /**
     * String appId, String apiKey, String secretKey
     */
    static String appId = "19983827";
    static String apiKey = "V436a6VhQfQgmTASjcIPD8Tk";
    static String secretKey = "Kj5KIhnqlGAz0Y85rcfMV0GG7vfHptVI";
    public static void main(String[] args) throws UnsupportedEncodingException {
        AipBodyAnalysis client = new AipBodyAnalysis(appId, apiKey, secretKey);
        HashMap<String,String> options = new HashMap<>();
        options.put("type", "foreground");
        String image = "F:/tlp.jpg";
        JSONObject res = client.bodySeg(image, options);
        System.out.println(res.toString(2));
        System.out.println(res.get("foreground").toString());
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            FileOutputStream write = new FileOutputStream(new File("F://abc.png"));
            byte[] decodeBytes = decoder.decodeBuffer(res.getString("foreground"));
            write.write(decodeBytes);
            write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
