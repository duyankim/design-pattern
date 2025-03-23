package com.github.templateMethod;

import java.util.List;

public abstract class FileParser {

    protected Object headerData;
    protected List<Object> dataLines;
    protected Object trailerData;

    public void parseFile(String path) {
        readFile(path);
        parseHeader();
        parseData();
        parseTrailer();
        insertFileData();
    }

    protected abstract void readFile(String path);
    protected abstract void parseHeader();
    protected abstract void parseData();
    protected abstract void parseTrailer();
    protected abstract void insertFileData();
}
