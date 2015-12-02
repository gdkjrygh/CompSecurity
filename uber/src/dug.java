// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class dug
{

    public static double a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0.0D;
        }
        double d;
        try
        {
            d = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0D;
        }
        return d;
    }

    public static int a(String s, int i)
    {
        if (TextUtils.isEmpty(s))
        {
            return i;
        }
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public static long a(String s, long l)
    {
        if (TextUtils.isEmpty(s))
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public static float b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0.0F;
        }
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0.0F;
        }
        return f;
    }
}
