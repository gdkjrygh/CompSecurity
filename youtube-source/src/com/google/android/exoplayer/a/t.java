// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.a;

import com.google.android.exoplayer.ag;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import java.util.Map;

// Referenced classes of package com.google.android.exoplayer.a:
//            a, m

public abstract class t extends a
{

    public final long d;
    public final long e;
    public final int f;

    public t(i i, j j1, m m, int i1, long l1, long l2, int k1)
    {
        super(i, j1, m, i1);
        d = l1;
        e = l2;
        f = k1;
    }

    public abstract boolean a(long l1, boolean flag);

    public abstract boolean a(ah ah);

    public final boolean j()
    {
        return f == -1;
    }

    public abstract ag k();

    public abstract Map l();
}
