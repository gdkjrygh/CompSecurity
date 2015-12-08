// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.internal.gi;
import com.google.android.gms.maps.model.a.d;

public final class b
{

    private static d a;

    public static void a(d d1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (d)gi.a(d1);
            return;
        }
    }
}
