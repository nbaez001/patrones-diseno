package com.empresa.proyecto.service;

public interface FileService {
    void readFile(String fileName);

    void writeFile(String fileName, String content);
}
