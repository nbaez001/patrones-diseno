package com.empresa.proyecto.proxy;

import com.empresa.proyecto.service.FileService;
import com.empresa.proyecto.service.FileServiceImpl;

public class FileServiceProxy implements FileService {

    private final FileService fileService;
    private final boolean hasWritePermission;

    public FileServiceProxy(boolean hasWritePermission) {
        this.fileService = new FileServiceImpl();
        this.hasWritePermission = hasWritePermission;
    }

    @Override
    public void readFile(String fileName) {
        fileService.readFile(fileName);
    }

    @Override
    public void writeFile(String fileName, String content) {
        if (hasWritePermission) {
            fileService.writeFile(fileName, content);
        } else {
            System.out.println("Write access denied for file: " + fileName);
        }
    }
}
