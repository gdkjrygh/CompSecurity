// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            c, d, a

public final class e
    implements c, Comparator
{

    private final long a = 0x4000000L;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public e(long l)
    {
    }

    private void b(a a1, long l)
    {
        while (c + l > a) 
        {
            a1.b((d)b.first());
        }
    }

    public final void a(a a1, long l)
    {
        b(a1, l);
    }

    public final void a(a a1, d d1)
    {
        b.add(d1);
        c = c + d1.c;
        b(a1, 0L);
    }

    public final void a(d d1)
    {
        b.remove(d1);
        c = c - d1.c;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (d)obj;
        obj1 = (d)obj1;
        if (((d) (obj)).f - ((d) (obj1)).f == 0L)
        {
            return ((d) (obj)).a(((d) (obj1)));
        }
        return ((d) (obj)).f >= ((d) (obj1)).f ? 1 : -1;
    }
}
