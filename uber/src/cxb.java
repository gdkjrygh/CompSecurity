// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class cxb
{

    public static double a(String s, double d)
    {
        if (TextUtils.isEmpty(s))
        {
            return d;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d;
        }
        return d1;
    }

    public static float a(String s)
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

    public static long b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0L;
        }
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return l;
    }

    public static int c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0;
        }
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            int j;
            try
            {
                j = Math.round(Float.parseFloat(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return 0;
            }
            return j;
        }
        return i;
    }
}
