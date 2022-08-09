package com.courses.lesson10.AdditionalTasks.FirstTask;

public class StringLengthFinder
{
    private String string;

    public StringLengthFinder()
    {

    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void findShortestWord(String string)
    {
        String[] words = string.split(" ");
        String shortestWord = words[0];

        for (int i = 0; i < words.length; i++)
        {
            if (shortestWord.length() > words[i].length())
            {
                shortestWord = words[i];
            }
            else if (shortestWord.length() == words[i].length())
            {
                shortestWord = words[i];
            }
        }
        System.out.println(shortestWord);
    }

    public void findLongestWord(String string)
    {
        String[] words = string.split(" ");
        String longestWord = words[0];

        for (int i = 0; i < words.length; i++)
        {
            if (longestWord.length() < words[i].length())
            {
                longestWord = words[i];
            }
            else if (longestWord.length() == words[i].length())
            {
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);
    }

}
