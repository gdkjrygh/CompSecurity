// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.text.TextUtils;
import com.google.a.a.a.a.lq;
import com.google.a.a.a.a.ry;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

public class al
{

    private ry a;
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;

    public al(ry ry1)
    {
        a = (ry)com.google.android.apps.youtube.common.fromguava.c.a(ry1);
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
            com.google.a.a.a.a.fk afk[] = a.c;
            int j = afk.length;
            int i = 0;
            while (i < j) 
            {
                android.text.Spanned spanned = com.google.android.apps.youtube.datalib.innertube.a.b.a(afk[i]);
                if (TextUtils.isEmpty(c))
                {
                    c = spanned;
                } else
                {
                    c = TextUtils.concat(new CharSequence[] {
                        c, System.getProperty("line.separator"), spanned
                    });
                }
                i++;
            }
        }
        return c;
    }

    public final CharSequence c()
    {
        if (d == null && a.e != null && a.e.b != null)
        {
            d = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.e.b);
        }
        return d;
    }

    public final lq d()
    {
        return a.e;
    }
}
