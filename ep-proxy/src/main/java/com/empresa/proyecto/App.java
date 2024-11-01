package com.empresa.proyecto;

import com.empresa.proyecto.proxy.FileServiceProxy;
import com.empresa.proyecto.service.FileService;

public class App {
    public static void main(String[] args) {
        FileService fileServiceWithWrite = new FileServiceProxy(true);
        fileServiceWithWrite.readFile("document.txt");
        fileServiceWithWrite.writeFile("document.txt", "Some content");

        FileService fileServiceWithoutWrite = new FileServiceProxy(false);
        fileServiceWithoutWrite.readFile("document.txt");
        fileServiceWithoutWrite.writeFile("document.txt", "Attempt to write content");
    }
}
