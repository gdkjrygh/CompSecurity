// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.b;

import android.util.Log;
import com.google.android.exoplayer.MalformedMediaDataException;
import com.google.android.exoplayer.a.a;
import com.google.android.exoplayer.d.a.f;
import com.google.android.exoplayer.d.a.h;
import com.google.android.exoplayer.upstream.i;
import com.google.android.exoplayer.upstream.j;
import com.google.android.exoplayer.upstream.p;

// Referenced classes of package com.google.android.exoplayer.b:
//            a

final class b extends a
{

    private final com.google.android.exoplayer.b.a.a d;
    private final f e;

    public b(i i, j j, int k, f f1, com.google.android.exoplayer.b.a.a a1)
    {
        super(i, j, a1.c, k);
        e = f1;
        d = a1;
    }

    protected final void a(p p)
    {
        if (e.a(p, null) != 50)
        {
            throw new MalformedMediaDataException("Invalid initialization data");
        }
        p = e.a();
        long l = (d.h - d.g) + 1L;
        if ((long)((h) (p)).a != l)
        {
            Log.w(com.google.android.exoplayer.b.a.d(), (new StringBuilder("Sidx length mismatch: sidxLen = ")).append(((h) (p)).a).append(", ExpectedLen = ").append(l).toString());
        }
        l = ((h) (p)).d[((h) (p)).b - 1] + (long)((h) (p)).c[((h) (p)).b - 1] + d.h + 1L;
        if (l != d.d)
        {
            Log.w(com.google.android.exoplayer.b.a.d(), (new StringBuilder("ContentLength mismatch: Actual = ")).append(l).append(", Expected = ").append(d.d).toString());
        }
    }
}
