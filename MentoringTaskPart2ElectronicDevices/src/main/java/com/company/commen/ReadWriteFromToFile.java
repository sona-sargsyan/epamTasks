package com.company.commen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sonasargsyan on 2/20/20.
 */
public class ReadWriteFromToFile {

    public String readFromFile(String path) throws IOException {

        try {
            File fileObj = new File(getClass().getClassLoader().getResource(path).getFile() 	);
            Scanner reader = new Scanner(fileObj);
            String text="";
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
                text=text + data;

            }
            reader.close();
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }

    }

    public void writeToFile(String text, String file) throws IOException {

        try {
            String path =  getClass().getClassLoader().getResource(file).getPath();
            FileWriter write = new FileWriter(path);
            write.write(text);
            write.close();
            //System.out.println("Success!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
