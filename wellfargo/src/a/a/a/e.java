// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import android.util.Log;

public class e
{

    public static int a(String s)
    {
        return Log.d("greenDAO", s);
    }

    public static int a(String s, Throwable throwable)
    {
        return Log.w("greenDAO", s, throwable);
    }

    public static int b(String s)
    {
        return Log.i("greenDAO", s);
    }

    public static int b(String s, Throwable throwable)
    {
        return Log.e("greenDAO", s, throwable);
    }

    public static int c(String s)
    {
        return Log.w("greenDAO", s);
    }
}
