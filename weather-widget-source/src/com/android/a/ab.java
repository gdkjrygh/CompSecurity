// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;

import android.util.Log;
import java.util.Locale;

public class ab
{

    public static String a;
    public static boolean b;

    public ab()
    {
    }

    public static transient void a(String s, Object aobj[])
    {
        if (b)
        {
            Log.v(a, e(s, aobj));
        }
    }

    public static transient void a(Throwable throwable, String s, Object aobj[])
    {
        Log.e(a, e(s, aobj), throwable);
    }

    public static transient void b(String s, Object aobj[])
    {
        Log.d(a, e(s, aobj));
    }

    public static transient void c(String s, Object aobj[])
    {
        Log.e(a, e(s, aobj));
    }

    public static transient void d(String s, Object aobj[])
    {
        Log.wtf(a, e(s, aobj));
    }

    private static transient String e(String s, Object aobj[])
    {
        int i;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L6:
        if (i < aobj.length) goto _L2; else goto _L1
_L1:
        aobj = "<unknown>";
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
        });
_L2:
        if (aobj[i].getClass().equals(com/android/a/ab))
        {
            break; /* Loop/switch isn't completed */
        }
        String s1 = ((StackTraceElement) (aobj[i])).getClassName();
        s1 = s1.substring(s1.lastIndexOf('.') + 1);
        aobj = (new StringBuilder(String.valueOf(s1.substring(s1.lastIndexOf('$') + 1)))).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
        if (true) goto _L4; else goto _L3
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        a = "Volley";
        b = Log.isLoggable(a, 2);
    }
}
