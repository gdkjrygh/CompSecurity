// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.android.gms.ads.c;

public final class a
{

    public static final a a = new a(-1, -2);
    public static final a b = new a(320, 50);
    public static final a c = new a(300, 250);
    public static final a d = new a(468, 60);
    public static final a e = new a(728, 90);
    public static final a f = new a(160, 600);
    private final c g;

    private a(int i, int j)
    {
        this(new c(i, j));
    }

    public a(c c1)
    {
        g = c1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof a))
        {
            return false;
        } else
        {
            obj = (a)obj;
            return g.equals(((a) (obj)).g);
        }
    }

    public final int hashCode()
    {
        return g.hashCode();
    }

    public final String toString()
    {
        return g.toString();
    }

}
