package org.example.logdesign.v3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileSystemResource implements Resource {
    private String path;
    private File file;
    private InputStream inputStream;

    public void loadFile(String path) throws IOException {
        this.path = path;
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        this.inputStream = inputStream;
    }

    @Override
    public InputStream getInputStream() {
        return this.inputStream;
    }
}
