// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.ac;
import com.google.android.gms.internal.dn;

public final class c
{

    public static final c a = new c(320, 50, "320x50_mb");
    public static final c b = new c(468, 60, "468x60_as");
    public static final c c = new c(728, 90, "728x90_as");
    public static final c d = new c(300, 250, "300x250_as");
    public static final c e = new c(160, 600, "160x600_as");
    public static final c f = new c(-1, -2, "smart_banner");
    private final int g;
    private final int h;
    private final String i;

    public c(int j, int k)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (j == -1)
        {
            s = "FULL";
        } else
        {
            s = String.valueOf(j);
        }
        stringbuilder = stringbuilder.append(s).append("x");
        if (k == -2)
        {
            s = "AUTO";
        } else
        {
            s = String.valueOf(k);
        }
        this(j, k, stringbuilder.append(s).append("_as").toString());
    }

    c(int j, int k, String s)
    {
        if (j < 0 && j != -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid width for AdSize: ")).append(j).toString());
        }
        if (k < 0 && k != -2)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid height for AdSize: ")).append(k).toString());
        } else
        {
            g = j;
            h = k;
            i = s;
            return;
        }
    }

    public final int a()
    {
        return h;
    }

    public final int a(Context context)
    {
        if (h == -2)
        {
            return ac.b(context.getResources().getDisplayMetrics());
        } else
        {
            return dn.a(context, h);
        }
    }

    public final int b()
    {
        return g;
    }

    public final int b(Context context)
    {
        if (g == -1)
        {
            return ac.a(context.getResources().getDisplayMetrics());
        } else
        {
            return dn.a(context, g);
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (g != ((c) (obj)).g || h != ((c) (obj)).h || !i.equals(((c) (obj)).i))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return i.hashCode();
    }

    public final String toString()
    {
        return i;
    }

}
