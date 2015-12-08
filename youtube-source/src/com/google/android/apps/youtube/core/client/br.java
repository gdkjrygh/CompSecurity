// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.utils.o;
import com.google.android.apps.youtube.medialib.a.a;
import com.google.android.apps.youtube.medialib.a.b;

public final class br
    implements b
{

    private final String a;
    private final Context b;
    private final com.google.android.apps.youtube.common.e.b c;
    private final a d;
    private final o e;
    private long f;
    private long g;
    private int h;
    private long i;
    private boolean j;

    br(Context context, com.google.android.apps.youtube.common.e.b b1, a a1, o o1, String s)
    {
        i = -1L;
        j = false;
        b = context;
        c = b1;
        d = a1;
        e = o1;
        a = s;
        f = b1.a() + 30000L;
    }

    private void b(boolean flag)
    {
        long l = c.a();
        if (g > 0L && (flag || l > f))
        {
            if (h > 2000)
            {
                Bundle bundle = new Bundle();
                bundle.putString("cpn", a);
                bundle.putString("bytes_transferred", Long.toString(g));
                bundle.putString("time_window_millis", Long.toString(h));
                if (h == 0)
                {
                    L.c((new StringBuilder("bandwidthElapsed is zero.  bandwidthBytes is: ")).append(g).toString());
                } else
                {
                    long l1 = (g * 1000L) / (long)h;
                    e.a(b, null, Long.valueOf(l1), null, null, bundle);
                }
            }
            f = 30000L + l;
            g = 0L;
            h = 0;
        }
    }

    public final void a()
    {
        d.a(this);
    }

    public final void a(int k, long l)
    {
        g = g + l;
        h = h + k;
        b(false);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            i = c.a();
        } else
        if (!j)
        {
            if (i != -1L)
            {
                long l = c.a() - i;
                if (l < 0L)
                {
                    L.c((new StringBuilder("buffering ended before it began, buffer time: ")).append(l).toString());
                } else
                {
                    Bundle bundle = new Bundle();
                    bundle.putString("cpn", a);
                    bundle.putString("buffering_delay_millis", Long.toString(l));
                    e.a(b, null, null, null, null, bundle);
                }
            }
            j = true;
            return;
        }
    }

    public final void b()
    {
        b(true);
        i = -1L;
    }

    public final void c()
    {
        d.b(this);
        b(true);
    }
}
