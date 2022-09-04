package com.courses.lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpIdentifier
{
    private static final String IPV4_PATTERN =
            "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";

    public static void main(String[] args)
    {
        String ipV4Good = "233.123.5.7";
        String ipV4Bad = "355.100.432.123";
        Pattern ipV4Pattern = Pattern.compile(IPV4_PATTERN);
        Matcher ipV4GoodMatcher = ipV4Pattern.matcher(ipV4Good);
        Matcher ipV4BadMatcher = ipV4Pattern.matcher(ipV4Bad);
        System.out.println(ipV4GoodMatcher.find());
        System.out.println(ipV4BadMatcher.find());
    }
}
