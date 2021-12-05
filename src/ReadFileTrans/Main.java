package ReadFileTrans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/knoldus/Downloads/Lambda_1/src/ReadFileTrans/Read.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        HashMap<String,Integer> map=new HashMap<String,Integer>();

        String st;

        while ((st = br.readLine()) != null) {
            String[] arr=st.split("\\s");
            for (String s : arr) {
                if (!map.containsKey(s))
                    map.put(s, 1);
                else
                    map.put(s, map.get(s) + 1);
            }
        }

        System.out.println(map);

    }
}
