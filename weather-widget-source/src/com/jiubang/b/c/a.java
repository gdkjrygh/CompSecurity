// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.b.c;

import java.text.SimpleDateFormat;
import java.util.Date;

public class a
{

    private static SimpleDateFormat a = new SimpleDateFormat();

    public static String a(long l, String s)
    {
        synchronized (a)
        {
            a.applyPattern(s);
            s = a.format(new Date(l));
        }
        return s;
        s;
        simpledateformat;
        JVM INSTR monitorexit ;
        throw s;
    }

}
