// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;


public class x
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;

    public x()
    {
        a = -1;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = 0;
    }

    public static x a(String s)
    {
        x x1 = new x();
        if (s != null) goto _L2; else goto _L1
_L1:
        return x1;
_L2:
        Object obj = null;
        try
        {
            s = s.split("\\|\\|\\|");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = obj;
        }
        if (s == null || s.length != 7) goto _L1; else goto _L3
_L3:
        try
        {
            x1.a = Integer.parseInt(s[0]);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        x1.b = s[1];
        x1.c = s[2];
        x1.d = s[3];
        x1.e = s[4];
        x1.f = s[5];
        s = s[6].replaceAll("\n", "").trim();
        if (!"".equals(s))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        x1.g = 0;
        return x1;
        try
        {
            x1.g = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return x1;
        }
        return x1;
    }
}
