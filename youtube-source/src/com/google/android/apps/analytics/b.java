// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import java.util.Random;

public final class b
{

    private static final b a = new b();
    private int b;
    private Random c;

    private b()
    {
        c = new Random();
    }

    public static b a()
    {
        return a;
    }

    public final int b()
    {
        b = c.nextInt();
        return b;
    }

}
