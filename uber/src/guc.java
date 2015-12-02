// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class guc
    implements gud, hrt
{

    private static final String a[] = {
        "11", "12", "13", "14", "15", "21", "22", "23", "31", "32", 
        "33", "34", "35", "36", "37", "41", "42", "43", "44", "45", 
        "46", "50", "51", "52", "53", "54", "61", "62", "63", "64", 
        "65", "71", "81", "82", "91"
    };
    private static final HashSet b = new _cls1();
    private static final String c[] = {
        "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", 
        "2"
    };
    private static final int d[] = {
        7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 
        7, 9, 10, 5, 8, 4, 2
    };
    private Object e;

    public guc(Object obj)
    {
        e = obj;
    }

    private Object a(hsf hsf1)
    {
        hsf1 = (CharSequence)hsf1.b();
        if (hsf1 != null)
        {
            hsf1 = hsf1.toString();
            if (!d(hsf1))
            {
                return e;
            }
            String s = c(hsf1);
            if (e(s) && b(s) && f(s))
            {
                if (hsf1.length() == 18)
                {
                    if (hsf1.equals((new StringBuilder()).append(s).append(a(s)).toString()))
                    {
                        return null;
                    } else
                    {
                        return e;
                    }
                } else
                {
                    return null;
                }
            }
        }
        return e;
    }

    private static String a(String s)
    {
        int i = 0;
        s = s.toCharArray();
        int j = 0;
        for (; i < s.length; i++)
        {
            j += Character.getNumericValue(s[i]) * d[i];
        }

        return c[j % 11];
    }

    static String[] a()
    {
        return a;
    }

    private static boolean b(hsf hsf1)
    {
        hsf1 = (CharSequence)hsf1.b();
        return hsf1 != null && hsf1.length() >= 18;
    }

    private static boolean b(String s)
    {
        boolean flag1 = false;
        s = s.substring(6, 14);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd");
        simpledateformat.setLenient(false);
        long l;
        boolean flag;
        try
        {
            s = simpledateformat.parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        l = (new Date()).getTime() - s.getTime();
        flag = flag1;
        if (l <= 0x44a5d55e000L)
        {
            flag = flag1;
            if (l >= 0L)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static String c(String s)
    {
        if (s.length() == 15)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(s.substring(0, 6)).append("19").append(s.substring(6, 15));
            return stringbuilder.toString();
        } else
        {
            return s.substring(0, 17);
        }
    }

    private static boolean d(String s)
    {
        int i = s.length();
        return i == 15 || i == 18;
    }

    private static boolean e(String s)
    {
        return Pattern.compile("[0-9]*").matcher(s).matches();
    }

    private static boolean f(String s)
    {
        s = s.substring(0, 2);
        return b.contains(s);
    }

    public final volatile Object a(Object obj)
    {
        return a((hsf)obj);
    }

    public final volatile boolean b(Object obj)
    {
        return b((hsf)obj);
    }


    /* member class not found */
    class _cls1 {}

}
