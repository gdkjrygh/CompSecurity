// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class duj
{

    public static String a(String s)
    {
        String s1;
        try
        {
            s1 = b(null);
            bmr bmr1 = bmr.a();
            s1 = bmr1.a(bmr1.a(s, s1), bms.b);
        }
        catch (bmp bmp1)
        {
            return s;
        }
        return s1;
    }

    public static String a(String s, String s1)
    {
        try
        {
            bmr bmr1 = bmr.a();
            s = bmr1.b(bmr1.a(s, s1).a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private static String b(String s)
    {
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = Locale.getDefault().getCountry();
        }
        return s1.toUpperCase(Locale.US);
    }

    public static String b(String s, String s1)
    {
        if (s == null)
        {
            return "";
        }
        try
        {
            String s2 = Locale.getDefault().getCountry().toUpperCase(Locale.US);
            s1 = b(s1);
            bmr bmr1 = bmr.a();
            bnb bnb1 = bmr1.a(s, s1);
            if (s1.equals(s2))
            {
                return bmr1.a(bnb1, bms.c);
            }
            s1 = bmr1.a(bnb1, bms.b);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return s1;
    }

    public static String c(String s, String s1)
    {
        try
        {
            s1 = b(s1);
            bmr bmr1 = bmr.a();
            s1 = bmr1.a(bmr1.a(s, s1), bms.a);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return s1;
    }

    public static String d(String s, String s1)
    {
        long l;
        try
        {
            s1 = b(s1);
            l = bmr.a().a(s, s1).b();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return s;
        }
        return String.valueOf(l);
    }

    public static boolean e(String s, String s1)
    {
        boolean flag;
        try
        {
            s1 = b(s1);
            bmr bmr1 = bmr.a();
            flag = bmr1.a(bmr1.a(s, s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }
}
