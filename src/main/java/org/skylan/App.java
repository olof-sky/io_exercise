package org.skylan;


import io.ioManager;

import java.io.File;

public class App
{
    public static void main( String[] args )
    {
        ioManager ioManager = new ioManager();
        File file = new File("src/source/text.txt");
        System.out.println(ioManager.readFromTxt(file));
    }
}
