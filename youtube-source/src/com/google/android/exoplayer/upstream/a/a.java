// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.a;

import com.google.android.exoplayer.upstream.h;
import com.google.android.exoplayer.upstream.j;

// Referenced classes of package com.google.android.exoplayer.upstream.a:
//            d, c

public final class a
    implements h
{

    private final h a;
    private final byte b[];
    private final byte c[];
    private c d;

    public a(byte abyte0[], byte abyte1[], h h1)
    {
        a = h1;
        b = abyte0;
        c = abyte1;
    }

    public final h a(j j1)
    {
        a.a(j1);
        long l = com.google.android.exoplayer.upstream.a.d.a(j1.f);
        d = new c(1, b, l, j1.c);
        return this;
    }

    public final void a()
    {
        d = null;
        a.a();
    }

    public final void a(byte abyte0[], int i, int k)
    {
        if (c == null)
        {
            d.a(abyte0, i, k);
            a.a(abyte0, i, k);
        } else
        {
            int l = 0;
            while (l < k) 
            {
                int i1 = Math.min(k - l, c.length);
                d.a(abyte0, i + l, i1, c, 0);
                a.a(c, 0, i1);
                l += i1;
            }
        }
    }
}
