package com.courses.lesson12;

import java.io.File;
import java.io.IOException;

public class DocumentExecutor
{
    public static void main(String[] args)
    {
        DocumentReader reader = new DocumentReader();

        reader.createFile();
        System.out.println(reader.getDocumentNumberFromFile(reader.createFile()));
        System.out.println(reader.getDocumentNumberFromFile(reader.createFile()));

    }
}


