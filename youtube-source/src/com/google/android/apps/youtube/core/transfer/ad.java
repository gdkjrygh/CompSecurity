// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.io.FilterOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            aa, m

final class ad extends FilterOutputStream
{

    final aa a;
    private final OutputStream b;
    private long c;

    public ad(aa aa1, OutputStream outputstream, long l)
    {
        a = aa1;
        super(outputstream);
        b = (OutputStream)com.google.android.apps.youtube.common.fromguava.c.a(outputstream);
        c = l;
    }

    private void a(long l, long l1)
    {
        synchronized (aa.b(a))
        {
            aa.a(a, l1);
        }
        if (l1 / 0x19000L > l / 0x19000L || l1 == com.google.android.apps.youtube.core.transfer.aa.c(a) - 1L)
        {
            aa.e(a).b(aa.d(a).a, l1);
        }
    }

    public final void write(int i)
    {
        b.write(i);
        c = c + 1L;
        a(c - 1L, c);
    }

    public final void write(byte abyte0[], int i, int j)
    {
        b.write(abyte0, i, j);
        long l = c;
        c = c + (long)j;
        a(l, c);
    }
}
