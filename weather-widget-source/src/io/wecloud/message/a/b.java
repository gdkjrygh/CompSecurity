// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.a;

import android.content.Context;

public class b
{

    private static int a;

    public static int a(Context context)
    {
        a++;
        if (a > 6)
        {
            return 0x124f80;
        } else
        {
            return a * 10000 * a;
        }
    }

    public static void a()
    {
        a = 0;
    }
}
