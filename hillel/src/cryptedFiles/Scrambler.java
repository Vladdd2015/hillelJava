package cryptedFiles;

/**
 * Created by Влад on 15.10.2015.
 */
public class Scrambler {
    private String key;
    private String message;
    Scrambler(String message,String key){
        this.message = message;
        this.key = key;

    }

    public  String crypt() {
        char[] chars = message.toCharArray();
        char[] chars2 = key.toCharArray();


        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= chars2[i % chars2.length];
        }


        message = String.copyValueOf(chars);


        return message;


    }
}
