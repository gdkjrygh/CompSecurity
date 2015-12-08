// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.util.Log;

final class b
{

    private final String a;
    private final int b;

    static void a(b b1, String s)
    {
        Log.println(b1.b, b1.a, s);
    }

    static boolean a(b b1)
    {
        return Log.isLoggable(b1.a, b1.b);
    }
}
