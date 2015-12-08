// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.transfer;

import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;

// Referenced classes of package com.google.android.apps.youtube.app.offline.transfer:
//            d, AbstractOfflineTransferTask

final class a
    implements d
{

    final AbstractOfflineTransferTask a;
    private long b;
    private long c;
    private int d;
    private long e;

    private a(AbstractOfflineTransferTask abstractofflinetransfertask)
    {
        a = abstractofflinetransfertask;
        super();
        d = -1;
    }

    a(AbstractOfflineTransferTask abstractofflinetransfertask, byte byte0)
    {
        this(abstractofflinetransfertask);
    }

    static long a(a a1, long l)
    {
        a1.c = l;
        return l;
    }

    static long b(a a1, long l)
    {
        a1.b = l;
        return l;
    }

    public final void a(FormatStream formatstream, long l)
    {
        long l1 = b + l;
        int j = (int)Math.round((double)l1 / ((double)c / 100D));
        if (d < 0 || j - d > 0 || l1 - e >= 0x400000L || l == formatstream.getContentLength())
        {
            a.a.a(a.g, formatstream.getItag(), l);
            a.a(b + l, c);
            d = j;
            e = l1;
        }
    }
}
