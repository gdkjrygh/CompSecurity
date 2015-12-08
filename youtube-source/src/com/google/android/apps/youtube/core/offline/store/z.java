// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            x

final class z
{

    final com.google.android.apps.youtube.core.offline.store.x a;
    private final Video b;
    private PlayerResponse c;
    private long d;
    private long e;
    private Transfer f;
    private OfflineMediaStatus g;
    private long h;
    private long i;
    private long j;
    private v k;
    private x l;
    private boolean m;

    private z(com.google.android.apps.youtube.core.offline.store.x x1, Video video)
    {
        a = x1;
        super();
        b = video;
        g = OfflineMediaStatus.ACTIVE;
        m = true;
    }

    z(com.google.android.apps.youtube.core.offline.store.x x1, Video video, byte byte0)
    {
        this(x1, video);
    }

    final Video a()
    {
        return b;
    }

    final void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        j = l1;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(long l1, long l2)
    {
        this;
        JVM INSTR monitorenter ;
        h = l1;
        i = l2;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(PlayerResponse playerresponse, long l1, long l2)
    {
        this;
        JVM INSTR monitorenter ;
        c = playerresponse;
        d = l1;
        e = l2;
        k = null;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        playerresponse;
        throw playerresponse;
    }

    final void a(OfflineMediaStatus offlinemediastatus)
    {
        this;
        JVM INSTR monitorenter ;
        g = offlinemediastatus;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        offlinemediastatus;
        throw offlinemediastatus;
    }

    final void a(Transfer transfer)
    {
        this;
        JVM INSTR monitorenter ;
        f = transfer;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        transfer;
        throw transfer;
    }

    public final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        m = flag;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final PlayerResponse b()
    {
        this;
        JVM INSTR monitorenter ;
        PlayerResponse playerresponse = c;
        this;
        JVM INSTR monitorexit ;
        return playerresponse;
        Exception exception;
        exception;
        throw exception;
    }

    final OfflineMediaStatus c()
    {
        this;
        JVM INSTR monitorenter ;
        OfflineMediaStatus offlinemediastatus = g;
        this;
        JVM INSTR monitorexit ;
        return offlinemediastatus;
        Exception exception;
        exception;
        throw exception;
    }

    final void d()
    {
        this;
        JVM INSTR monitorenter ;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final v e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (k != null || c == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = c.getOfflineState();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        k = new v(b.id, ((com.google.android.apps.youtube.datalib.innertube.model.v) (obj)), d, e);
        obj = k;
        this;
        JVM INSTR monitorexit ;
        return ((v) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    final x f()
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null) goto _L2; else goto _L1
_L1:
        v v1 = e();
        Object obj = null;
        if (c != null)
        {
            obj = c.getPlayabilityStatus();
        }
        com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status status = null;
        android.net.Uri uri;
        String s;
        String s1;
        if (f != null)
        {
            status = f.c;
        }
        s = b.id;
        s1 = b.title;
        if (b.mqThumbnailUri == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        uri = b.mqThumbnailUri;
_L3:
        l = new x(s, s1, uri, a.f(b.id), j, v1, ((com.google.android.apps.youtube.datalib.innertube.model.w) (obj)), g, status, h, i, m);
_L2:
        obj = l;
        this;
        JVM INSTR monitorexit ;
        return ((x) (obj));
        uri = b.defaultThumbnailUri;
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }
}
