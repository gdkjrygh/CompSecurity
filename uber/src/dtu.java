// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Color;
import android.text.TextUtils;

public final class dtu
{

    public static int a(int i, float f)
    {
        return Color.argb(Math.round(255F * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int a(String s)
    {
        String s1 = s;
        int i;
        try
        {
            if (s.charAt(0) != '#')
            {
                s1 = (new StringBuilder("#")).append(s).toString();
            }
            i = Color.parseColor(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ijg.d(s, "Attempted to parse an invalid vehicle color", new Object[0]);
            return 0xff000000;
        }
        return i;
    }

    public static String a(int i)
    {
        String s = Integer.toHexString(i);
        if (TextUtils.isEmpty(s) || s.length() <= 2)
        {
            ijg.c((new StringBuilder("Failed to convert color into hex string, color = ")).append(i).toString(), new Object[0]);
            return null;
        } else
        {
            return (new StringBuilder("#")).append(s.substring(2).toUpperCase()).toString();
        }
    }
}
