// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.e.a;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            i, h, j

public final class q
    implements i
{

    private final i a;
    private final h b;

    public q(i j, h h1)
    {
        a = (i)com.google.android.exoplayer.e.a.a(j);
        b = (h)com.google.android.exoplayer.e.a.a(h1);
    }

    public final int a(byte abyte0[], int j, int k)
    {
        k = a.a(abyte0, j, k);
        if (k > 0)
        {
            b.a(abyte0, j, k);
        }
        return k;
    }

    public final long a(j j)
    {
        long l = a.a(j);
        b.a(j);
        return l;
    }

    public final void a()
    {
        a.a();
        b.a();
    }
}
