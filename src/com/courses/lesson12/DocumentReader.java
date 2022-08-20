package com.courses.lesson12;

import java.io.*;

public class DocumentReader
{
    Integer numberOfValidDocumentNumbers;
    Integer numberOfInvalidDocumentNumbers;

    public Integer getNumberOfValidDocumentNumbers() {
        return numberOfValidDocumentNumbers;
    }

    public void setNumberOfValidDocumentNumbers(Integer numberOfValidDocumentNumbers) {
        this.numberOfValidDocumentNumbers = numberOfValidDocumentNumbers;
    }

    public Integer getNumberOfInvalidDocumentNumbers() {
        return numberOfInvalidDocumentNumbers;
    }

    public void setNumberOfInvalidDocumentNumbers(Integer numberOfInvalidDocumentNumbers) {
        this.numberOfInvalidDocumentNumbers = numberOfInvalidDocumentNumbers;
    }

    public File createFile()
    {
        try
        {
            File documentReader = new File("src/com/courses/lesson12/DocumentNumber.txt");
            documentReader.createNewFile();
            return documentReader;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public String[] getDocumentNumberFromFile(File file)
    {
        String[] documentNumber = new String[10];
        Integer i = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            String line;
            while ((line = reader.readLine()) != null)
            {
                documentNumber[i] = line;
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println("no file)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        file = this.createFile();

        return documentNumber;
    }

    public String checkDocumentNumberLength(String documentNumber)
    {
     return "";
    }

    public void checkNumberStart(String documentNumber)
    {
        documentNumber = String.valueOf(this.getDocumentNumberFromFile(createFile()));
        if (documentNumber.startsWith("docnum") || documentNumber.startsWith("contract"))
        {
            setNumberOfValidDocumentNumbers(+1);
        }
        else
        {
            setNumberOfInvalidDocumentNumbers(+1);
        }
    }
}
