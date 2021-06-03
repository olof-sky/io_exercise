package io;

import java.io.*;
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
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    public List<String> readLines(File namesFromTxt){
        List<String> names = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(namesFromTxt));
            String line;
            while((line = reader.readLine()) != null){
                names.add(line);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }return names;
    }

    public void writeStringFromCollection(List<String> source, File destination){
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(destination));
            for(int i=0; i<source.size();i++){
                writer.write(source.get(i));
                if(i != source.size() -1){
                    writer.newLine();
                }
            }writer.flush();
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
