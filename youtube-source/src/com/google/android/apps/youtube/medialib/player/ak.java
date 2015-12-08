// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import com.google.android.exoplayer.a.m;
import com.google.android.exoplayer.a.p;
import com.google.android.exoplayer.d;
import com.google.android.exoplayer.e;
import com.google.android.exoplayer.upstream.c;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            al

public final class ak extends p
    implements e
{

    private int a;
    private int b;

    public ak(c c, int i, int j, int k, int l, float f)
    {
        super(c, i, j, k, l, f);
        a = -1;
        b = -1;
    }

    protected final m a(m am[], long l)
    {
        long l1 = l;
        if (l == -1L)
        {
            l1 = 0x16378L;
        }
        m m1;
        boolean flag;
        for (int i = 0; i < am.length; i++)
        {
            m1 = am[i];
            if (a == -1 || b == -1)
            {
                flag = true;
            } else
            if ((double)m1.c * 0.84999999999999998D <= (double)a || (double)m1.d * 0.84999999999999998D <= (double)b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && (l1 == -1L || (long)m1.g < l1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return m1;
            }
        }

        return am[am.length - 1];
    }

    public final void a(int i, Object obj)
    {
        if (i == 0 && (obj instanceof al))
        {
            obj = (al)obj;
            a = ((al) (obj)).a;
            b = ((al) (obj)).b;
        }
    }

    public final void a(d d1, int i, int j)
    {
        d1.a(this, 0, new al(i, j));
    }
}
