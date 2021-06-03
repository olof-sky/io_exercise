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

    public void copyFile(File input, File output){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try{
            in = new BufferedInputStream(new FileInputStream(input));
            out = new BufferedOutputStream(new FileOutputStream(output));

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) > 0){
                out.write(buffer, 0, bytesRead);
                out.flush();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
