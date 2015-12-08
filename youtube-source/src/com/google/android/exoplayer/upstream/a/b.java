// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.a;

import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;

// Referenced classes of package com.google.android.exoplayer.upstream.a:
//            c, d

public final class b
    implements i
{

    private final i a;
    private final byte b[];
    private c c;

    public b(byte abyte0[], i k)
    {
        a = k;
        b = abyte0;
    }

    public final int a(byte abyte0[], int k, int l)
    {
        l = a.a(abyte0, k, l);
        if (l < 0)
        {
            return -1;
        } else
        {
            c.a(abyte0, k, l);
            return l;
        }
    }

    public final long a(j j1)
    {
        long l = a.a(j1);
        long l1 = d.a(j1.f);
        c = new c(2, b, l1, j1.c);
        return l;
    }

    public final void a()
    {
        c = null;
        a.a();
    }
}
