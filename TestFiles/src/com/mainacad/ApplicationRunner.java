package com.mainacad;

import com.mainacad.service.FilesService;

public class ApplicationRunner {
    public static void main(String[] args) {

        String text = "dhjcfbds 1111 22222";
        FilesService.writeTextToFile(text, "file.txt");
        System.out.println(FilesService.readTextFromFile("file.txt"));

    }
}
