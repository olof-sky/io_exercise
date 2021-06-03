package org.skylan;


import io.ioManager;

import javax.sound.sampled.Line;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<String> stringList = new ArrayList<>(Arrays.asList("Hej", "Då", "Re", "Mi"));

        ioManager ioManager = new ioManager();
        File text = new File("src/source/text.txt");
        File names = new File("src/source/names.txt");
        File namesDest = new File("src/destination/namesDest.txt");
        File copyDest = new File("src/destination/copyDest.txt");
        ioManager.writeStringFromCollection(stringList, namesDest);
        ioManager.copyFile(names, copyDest);
        System.out.println(ioManager.readFromTxt(text));
        System.out.print(ioManager.readLines(names));
    }
}
