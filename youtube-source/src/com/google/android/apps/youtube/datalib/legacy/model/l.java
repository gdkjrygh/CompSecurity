// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;

public class l
{

    private String a;
    private String b;
    private boolean c;
    private float d;
    private int e;
    private Uri f;
    private Uri g;

    public l(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final InfoCard.InfoCardApp a()
    {
        return new InfoCard.InfoCardApp(a, f, b, c, d, g, e);
    }

    public final l a(float f1)
    {
        c = true;
        d = f1;
        return this;
    }

    public final l a(int i)
    {
        e = i;
        return this;
    }

    public final l a(Uri uri)
    {
        g = uri;
        return this;
    }

    public final l b(Uri uri)
    {
        f = uri;
        return this;
    }
}
