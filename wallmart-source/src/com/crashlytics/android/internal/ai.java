// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


public final class ai extends Enum
{

    private static ai a;
    private static ai b;
    private static ai c;
    private static ai d;
    private static final ai f[];
    private final int e;

    private ai(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static ai a(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return d;
        } else
        {
            return a;
        }
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(com/crashlytics/android/internal/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    public final String toString()
    {
        return Integer.toString(e);
    }

    static 
    {
        a = new ai("DEVELOPER", 0, 1);
        b = new ai("USER_SIDELOAD", 1, 2);
        c = new ai("TEST_DISTRIBUTION", 2, 3);
        d = new ai("APP_STORE", 3, 4);
        f = (new ai[] {
            a, b, c, d
        });
    }
}
