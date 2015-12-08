// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.mr;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

public final class d
{

    private mr a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;
    private CharSequence e;

    public d(mr mr1)
    {
        a = (mr)com.google.android.apps.youtube.common.fromguava.c.a(mr1);
    }

    public d(CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2)
    {
        c = charsequence;
        e = charsequence1;
        d = charsequence2;
        a = new mr();
        a.e = true;
        b = null;
    }

    public final CharSequence a()
    {
        if (b == null && a.b != null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return b;
    }

    public final CharSequence b()
    {
        if (c == null && a.c != null)
        {
            c = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.c);
        }
        return c;
    }

    public final CharSequence c()
    {
        if (d == null && a.d != null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.d);
        }
        return d;
    }

    public final CharSequence d()
    {
        if (e == null && a.f != null)
        {
            e = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.f);
        }
        return e;
    }

    public final boolean e()
    {
        return a.e;
    }
}
