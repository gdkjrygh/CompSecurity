// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.messagecenter.a;

import java.text.SimpleDateFormat;

public class a
{

    public static String a(String s)
    {
        String s1 = s;
        java.util.Date date;
        try
        {
            s = s.replace(" +0800", "");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        s1 = s;
        date = (new SimpleDateFormat("yyyy/MM/dd HH:mm")).parse(s);
        s1 = s;
        s = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
        return s;
    }
}
