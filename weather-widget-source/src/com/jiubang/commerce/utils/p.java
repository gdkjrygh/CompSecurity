// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p
{

    public static Integer a(Object obj, Integer integer)
    {
        Integer integer1;
        integer1 = integer;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        integer1 = integer;
        if (!c(obj))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = obj.toString().replaceAll("(\\s)", "");
        integer1 = integer;
        try
        {
            if (((String) (obj)).length() > 0)
            {
                integer1 = Integer.valueOf(((String) (obj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return integer;
        }
        return integer1;
    }

    public static Long a(Object obj, Long long1)
    {
        if (obj != null)
        {
            try
            {
                if (c(obj))
                {
                    obj = obj.toString().replaceAll("(\\s)", "");
                    long l;
                    if (((String) (obj)).length() > 0)
                    {
                        l = Long.parseLong(((String) (obj)));
                    } else
                    {
                        l = long1.longValue();
                    }
                    return Long.valueOf(l);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        return long1;
    }

    public static String a(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return obj1.toString().trim().toUpperCase();
    }

    public static List a(Integer ainteger[])
    {
        if (ainteger != null && ainteger.length >= 1) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int j = ainteger.length;
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            arraylist.add(ainteger[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return obj1.toString().trim().toLowerCase();
    }

    public static boolean c(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            obj = obj.toString().replaceAll("(\\s)", "");
            return Pattern.compile("([-]?[\\d]+)").matcher(((CharSequence) (obj))).matches();
        }
    }

    public static String d(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        return obj1.toString().trim();
    }
}
