package com.mainacad.service;

import java.io.*;

public class FilesService {
    public static final String MAIN_DIR = System.getProperty("user.dir");
    public static final String SEP = System.getProperty("file.separator");
    public static final String FILES_DIR = MAIN_DIR + SEP + "files";

    public static void writeTextToFile(String text, String fileName){
        checkAndCreateDir(FILES_DIR);
        try (FileWriter file = new FileWriter(FILES_DIR + SEP + fileName)){
            file.write(text);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void checkAndCreateDir(String dir){
        File file = new File(dir);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    public static String readTextFromFile(String fileName){
        String out = "";
        try (FileReader fileReader = new FileReader(FILES_DIR + SEP + fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                out += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }


}
