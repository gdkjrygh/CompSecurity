// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringUtil
{

    public StringUtil()
    {
    }

    public static int compareVersionStrings(String s, String s1)
    {
        return normalizeVersionString(s, ".", 4).compareTo(normalizeVersionString(s1, ".", 4));
    }

    public static String ensureString(Object obj)
    {
        if (obj instanceof Integer)
        {
            return Integer.toString(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            return Long.toString(((Long)obj).longValue());
        }
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return null;
        }
    }

    public static String extractEditTextValue(EditText edittext)
    {
        if (edittext == null)
        {
            return null;
        }
        EditText edittext1;
        if (edittext.getText() == null)
        {
            edittext = "";
        } else
        {
            edittext = edittext.getText().toString().trim();
        }
        edittext1 = edittext;
        if (edittext.equals(""))
        {
            edittext1 = null;
        }
        return edittext1;
    }

    public static String joinList(ArrayList arraylist, String s, boolean flag)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        while (i < arraylist.size()) 
        {
            stringbuffer.append((String)arraylist.get(i));
            if (i < arraylist.size() - 2)
            {
                stringbuffer.append(", ");
            } else
            if (i == arraylist.size() - 2)
            {
                if (flag)
                {
                    stringbuffer.append(String.format(" %s ", new Object[] {
                        s
                    }));
                } else
                {
                    stringbuffer.append(String.format("%s", new Object[] {
                        s
                    }));
                }
            }
            i++;
        }
        return stringbuffer.toString();
    }

    private static String normalizeVersionString(String s, String s1, int i)
    {
        s = Pattern.compile(s1, 16).split(s);
        s1 = new StringBuilder();
        int k = s.length;
        for (int j = 0; j < k; j++)
        {
            Object obj = s[j];
            s1.append(String.format((new StringBuilder()).append("%").append(i).append('s').toString(), new Object[] {
                obj
            }));
        }

        return s1.toString();
    }

    public static String toTitleCase(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag1 = true;
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            char c1 = s[i];
            char c;
            boolean flag;
            if (Character.isSpaceChar(c1))
            {
                flag = true;
                c = c1;
            } else
            {
                c = c1;
                flag = flag1;
                if (flag1)
                {
                    c = Character.toTitleCase(c1);
                    flag = false;
                }
            }
            stringbuilder.append(c);
            i++;
            flag1 = flag;
        }
        return stringbuilder.toString();
    }
}
