package com.courses.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
    public static void main(String[] args)
    {
        String a = "1asdasd\"";
        Pattern stringPattern = Pattern.compile("^\\d[a-zA-Z]{5,10}|\\$");
        Matcher stringMatcher = stringPattern.matcher(a);
        System.out.println(stringMatcher.find());

        String mail = "neustup.2001@tms.com";
        Pattern mailPattern = Pattern.compile("[a-zA-Z]{5,10}\\.\\d{3,5}@(mail|tms)\\.com$");
        Matcher mailMatcher = mailPattern.matcher(mail);
        System.out.println(mailMatcher.find());

        String phoneNumber = "+375445838842";
        Pattern phonePattern = Pattern.compile("^\\+[0-9]{12}$");
        Matcher phoneMatcher = phonePattern.matcher(phoneNumber);
        System.out.println(phoneMatcher.find());

        String password = "123456Vit \"\"";
        Pattern passwordPattern = Pattern.compile("[\\d[a-z][A-Z]\\s\"]*");
        Matcher passwordMatcher = passwordPattern.matcher(password);
        System.out.println(passwordMatcher.find());


    }

}

