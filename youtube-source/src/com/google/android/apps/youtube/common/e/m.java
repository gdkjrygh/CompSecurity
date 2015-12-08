// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.e;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class m
{

    public static float a(String s, float f)
    {
        float f1 = f;
        if (s != null)
        {
            try
            {
                f1 = Float.valueOf(s).floatValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return f;
            }
        }
        return f1;
    }

    public static long a(String s, long l)
    {
        l = 0L;
        if (s != null)
        {
            try
            {
                l = Long.valueOf(s).longValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 0L;
            }
        }
        return l;
    }

    public static String a(int i, int j)
    {
        int i1 = i / 60;
        int j1 = i1 / 60;
        int l = i1;
        int k = j;
        if (j1 > 0)
        {
            l = i1 % 60;
            k = Math.max(j, 5);
        }
        String s1 = Integer.toString(i % 60);
        String s = s1;
        if (s1.length() == 1)
        {
            s = (new StringBuilder("0")).append(s1).toString();
        }
        String s2 = Integer.toString(l);
        s1 = s2;
        if (s2.length() == 1)
        {
            s1 = s2;
            if (k > 3)
            {
                s1 = (new StringBuilder("0")).append(s2).toString();
            }
        }
        if (k > 4)
        {
            return (new StringBuilder()).append(j1).append(":").append(s1).append(":").append(s).toString();
        } else
        {
            return (new StringBuilder()).append(s1).append(":").append(s).toString();
        }
    }

    public static String a(long l)
    {
        if (l < 1024L)
        {
            return (new StringBuilder()).append(l).append("MB").toString();
        } else
        {
            float f = (float)l / 1024F;
            return (new StringBuilder()).append((new DecimalFormat("#.##")).format(f)).append("GB").toString();
        }
    }

    public static List a(String s, int i)
    {
        ArrayList arraylist = new ArrayList();
        int l = s.length() / 2048;
        for (i = 0; i < l + 1; i++)
        {
            int k = (i + 1) * 2048;
            int j = k;
            if (k >= s.length())
            {
                j = s.length();
            }
            arraylist.add(s.substring(i * 2048, j));
        }

        return arraylist;
    }

    public static Set a(Set set)
    {
        HashSet hashset = new HashSet(set.size());
        for (set = set.iterator(); set.hasNext(); hashset.add(((String)set.next()).toLowerCase(Locale.US))) { }
        return hashset;
    }

    public static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("utf8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static int b(String s, int i)
    {
        int j = i;
        if (s != null)
        {
            try
            {
                j = Integer.valueOf(s).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return i;
            }
        }
        return j;
    }
}
