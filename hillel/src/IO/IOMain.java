package IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by HillelStudent on 19.11.2015.
 */
public class IOMain {
    public static void main(String[] args) {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("e:/myData"))){
            long[] longs = new long[]{1,2,3,4};

            for (long aLong : longs){
                dataOutputStream.writeLong(aLong);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("e:/myData"))) {
            try {
                while (true) {
                    System.out.println(dataInputStream.readLong());
                }

            } catch (EOFException e) {
                System.out.println("end");
            }

        }catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void bufferedRead() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("e:/myFile.txt"), Charset.forName("windows-1251")))){

            String value = null;
            while ((value = bufferedReader.readLine()) != null){
                System.out.println(value);
            }
        }catch (IOException e){
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

    public static void charRead() {
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("e:/myFile.txt."), Charset.forName("windows-1251"))){
            int value;
            while ((value = inputStreamReader.read()) != -1){
                System.out.print((char) value);
            }
         }catch (IOException e){
              System.out.println(e);
          }
    }

    public static void copyBites() {
        try (InputStream inputStream = new FileInputStream("e:/myFile.txt");
                      OutputStream outputStream = new FileOutputStream("e:/copyOfMyFile.txt")
        ) {
            int value;
            while ((value = inputStream.read()) != -1){
                outputStream.write(value);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void readWithResources() {
        try (InputStream inputStream = new FileInputStream("e:/myFile.txt")){
            int value;
            while ((value = inputStream.read()) != -1){
                System.out.print((char) value);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void uglyRead() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("e:/myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println((char) value);
            }
            inputStream.close();
        } catch (IOException e){
            System.out.println(e);
        } finally {
            if(inputStream != null){
                try{
                    inputStream.close();
                }catch(IOException e){
                    System.out.println(e);

                }

            }
        }
    }

    public static void pathesAndFileCreation() throws IOException {
        System.out.println("yes\\no");
        System.out.println("c:\\program files\\myProgram");
        System.out.println("c:/program files/myProgram");
        String win = "c:\\HaxLogs.txt";
        String unix = "c:/HaxLogs.txt";

        File winFile = new File(win);
        System.out.println("win file exists: " + winFile.exists());

        File unixFile = new File(unix);
        System.out.println("win file exists: " + unixFile.exists());

        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("e:\\myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());

        if(!Files.exists(absolutePath)){
            Files.createFile(absolutePath);
            System.out.println("file created");

        } else {
            System.out.println("file already exists");
        }
    }
}
