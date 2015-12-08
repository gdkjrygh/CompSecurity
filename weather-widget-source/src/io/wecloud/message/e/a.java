// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.e;

import io.wecloud.message.bean.c;
import io.wecloud.message.bean.d;

public class a
{

    public static d a()
    {
        return new d(1, 2, System.currentTimeMillis(), "");
    }

    public static d a(int i, String s)
    {
        return new d(2, i, System.currentTimeMillis(), s);
    }

    public static d a(long l)
    {
        return new d(1, 5, System.currentTimeMillis(), String.valueOf(l));
    }

    public static d a(String s)
    {
        return new d(1, 4, System.currentTimeMillis(), s);
    }

    public static d a(boolean flag, String s)
    {
        if (flag)
        {
            return new d(1, 10, System.currentTimeMillis(), s);
        } else
        {
            return new d(1, 11, System.currentTimeMillis(), s);
        }
    }

    public static c b(long l)
    {
        return new c(1, 8, System.currentTimeMillis(), String.valueOf(l));
    }

    public static d b()
    {
        return new d(1, 3, System.currentTimeMillis(), "");
    }

    public static d b(String s)
    {
        return new d(2, 6, System.currentTimeMillis(), s);
    }

    public static c c(long l)
    {
        return new c(1, 14, System.currentTimeMillis(), String.valueOf(l));
    }

    public static d c(String s)
    {
        return new d(1, 11, System.currentTimeMillis(), s);
    }

    public static c d(String s)
    {
        return new c(1, 15, System.currentTimeMillis(), s);
    }

    public static c e(String s)
    {
        return new c(1, 16, System.currentTimeMillis(), s);
    }
}
