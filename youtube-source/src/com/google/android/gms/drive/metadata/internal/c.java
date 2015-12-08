// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.he;
import java.util.HashMap;
import java.util.Map;

public final class c
{

    private static Map a = new HashMap();

    public static b a(String s)
    {
        return (b)a.get(s);
    }

    private static void a(b b1)
    {
        if (a.containsKey(b1.a()))
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate field name registered: ")).append(b1.a()).toString());
        } else
        {
            a.put(b1.a(), b1);
            return;
        }
    }

    static 
    {
        a(hc.a);
        a(hc.b);
        a(hc.c);
        a(hc.d);
        a(hc.e);
        a(hc.f);
        a(hc.g);
        a(hc.h);
        a(he.c);
        a(he.a);
        a(he.b);
        a(he.d);
    }
}
