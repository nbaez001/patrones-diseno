package com.empresa.proyecto.service;

public class FileServiceImpl implements FileService {

    @Override
    public void readFile(String fileName) {
        System.out.println("Reading file: " + fileName);
    }

    @Override
    public void writeFile(String fileName, String content) {
        System.out.println("Writing to file: " + fileName);
    }
}
