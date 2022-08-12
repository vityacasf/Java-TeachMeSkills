package com.courses.lesson11;

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
        if (numberOfDocument.toLowerCase().contains(string))
        {
            return numberOfDocument.toLowerCase().contains(string);
        }
        else
        {
            throw new IllegalArgumentException("Не содержит последовательность" + string);
        }
    }

    public static Boolean startWith(String numberOfDocument)
    {
        String startString = "555";
        if (numberOfDocument.startsWith(startString))
        {
           return numberOfDocument.startsWith(startString);
        }
        else
        {
            throw new IllegalArgumentException("Номер документа не начинается " + startString);
        }
    }

    public static Boolean endWith(String numberOfDocument)
    {
        String endString = "1a2b";
        if (numberOfDocument.endsWith(endString) == true)
        {
            return numberOfDocument.endsWith(endString);
        }
        else
        {
            throw new IllegalArgumentException("Номер документа не заканчивается" + endString);
        }
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

        stringBuilder.delete(0, 5);
        stringBuilder.delete(3, 9);
        stringBuilder.delete(6, 8);
        stringBuilder.delete(7, 8);

        stringBuilder.insert(3, "/");
        stringBuilder.insert(7, "/");
        stringBuilder.insert(9, "/");

        return new StringBuilder("Letters:" + stringBuilder);
    }

    public String executeErrorsContains(String numberOfDocument)
    {
        setNumberOfDocument(numberOfDocument);
        try
        {
            checkIncludeString(numberOfDocument);
            return "в номере документа есть нужная последовательность";
        }
        catch (IllegalArgumentException e)
        {
            return "в номере документа нет нужной последовательности";
        }
    }

    public String executeErrorsStart(String numberOfDocument)
    {
        setNumberOfDocument(numberOfDocument);
        try
        {
            startWith(numberOfDocument);
            return "начинается как надо";
        }
        catch (IllegalArgumentException a)
        {
            return "не начинается как надо";
        }
    }

    public String executeErrorsEnd(String numberOfDocument)
    {
        setNumberOfDocument(numberOfDocument);

        try
        {
            endWith(numberOfDocument);
            return "всё классно";
        }
        catch (IllegalArgumentException b)
        {
            return "что-то не так";
        }
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
