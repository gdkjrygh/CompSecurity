// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.measurement;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Label
{

    public Boolean aggregate;
    public String name;
    public String value;

    public Label(String s, String s1, Boolean boolean1)
    {
        name = s;
        value = s1;
        aggregate = boolean1;
    }

    private String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = s.length(); i < j; i++)
        {
            char c = Character.toLowerCase(s.charAt(i));
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9' || c == '_' || c == '-' || c == '.')
            {
                stringbuilder.append(c);
            }
        }

        return stringbuilder.toString();
    }

    public String pack()
    {
        Object obj;
        String s;
        obj = new StringBuilder();
        if (name == null || value == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = a(name);
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        ((StringBuilder) (obj)).append("&").append(s).append("=").append(URLEncoder.encode(value, "UTF-8").replace("+", "%20"));
        obj = ((StringBuilder) (obj)).toString();
        return ((String) (obj));
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        return "";
    }
}
