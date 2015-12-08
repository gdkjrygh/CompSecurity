// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import com.google.android.apps.ytremote.logic.e;
import com.google.android.apps.ytremote.model.PairingCode;

final class h
{

    public static final h a = new h(-1, null, null);
    private static final long e[] = {
        5000L, 2000L, 2000L, 2000L, 2000L, 2000L, 5000L, 10000L, 15000L, 20000L
    };
    final PairingCode b;
    final e c;
    final int d;

    private h(int i, PairingCode pairingcode, e e1)
    {
        d = i;
        b = pairingcode;
        c = e1;
    }

    public static h a(PairingCode pairingcode, e e1)
    {
        return new h(-1, pairingcode, e1);
    }

    public final h a()
    {
        if (d < e.length - 1)
        {
            return new h(d + 1, b, c);
        } else
        {
            return a;
        }
    }

    public final long b()
    {
        return e[d];
    }

}
