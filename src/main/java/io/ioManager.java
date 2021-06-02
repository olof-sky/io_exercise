package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ioManager{
    public List<String> readFromTxt(File source){
        BufferedReader reader = null;
        List<String> result = new ArrayList<>();
        try{
            reader = new BufferedReader(new FileReader(source));

            String text;
            while ((text = reader.readLine()) != null){
                result.add(text);
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
