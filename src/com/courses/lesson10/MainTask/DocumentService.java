package com.courses.lesson10.MainTask;

import java.util.Locale;

public class DocumentService
{
    private static String numberOfDocument;

    public static String printFirstEightNumbers(String numberOfDocument) {
        String numbers;
        numbers = numberOfDocument.substring(0, 4) + "-" + numberOfDocument.substring(9, 13);
        return numbers;
    }

    public static String printOnlyLetters(String numberOfDocument)
    {
        String onlyLetters;
        onlyLetters = numberOfDocument.substring(5, 8) + "/" + numberOfDocument.substring(14, 17) + "/" +
                        numberOfDocument.substring(19, 20) + "/" + numberOfDocument.substring(21);
        return onlyLetters;
    }

    public static Boolean checkIncludeString(String numberOfDocument)
    {
        String string = "abc";

        return numberOfDocument.toLowerCase().contains(string);
    }

    public static Boolean startWith(String numberOfDocument)
    {
        return numberOfDocument.startsWith("555");
    }

    public static Boolean endWith(String numberOfDocument)
    {
        return numberOfDocument.endsWith("1a2b");
    }

    public static StringBuilder changeLetter(String numberOfDocument)
    {
        StringBuilder stringBuilder = new StringBuilder(numberOfDocument);
        stringBuilder.replace(5, 8, "***");
        stringBuilder.replace(14, 17, "***");
        return stringBuilder;
    }

    public static StringBuilder printOnlyLettersBuilder(String numberOfDocument)
    {
        numberOfDocument = numberOfDocument.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(numberOfDocument);

        stringBuilder = stringBuilder.delete(0, 5);
        stringBuilder = stringBuilder.delete(3, 9);
        stringBuilder = stringBuilder.delete(6, 8);
        stringBuilder = stringBuilder.delete(7, 8);

        stringBuilder.insert(3, "/");
        stringBuilder.insert(7, "/");
        stringBuilder.insert(9, "/");

        return new StringBuilder("Letters:" + stringBuilder);
    }

    public String getNumberOfDocument()
    {
        return numberOfDocument;
    }

    public void setNumberOfDocument(String numberOfDocument)
    {
        this.numberOfDocument = numberOfDocument;
    }
}
