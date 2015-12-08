// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.transfer;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.player.w;
import com.google.android.apps.youtube.core.transfer.TransferException;
import com.google.android.apps.youtube.core.transfer.m;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ah;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.OfflineMediaStatus;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app.offline.transfer:
//            AbstractOfflineTransferTask, c

public final class e extends AbstractOfflineTransferTask
{

    private final m i;

    public e(i j, ah ah, w w, ag ag, com.google.android.apps.youtube.common.cache.a a1, b b1, Transfer transfer, 
            m m1, com.google.android.apps.youtube.app.offline.transfer.c c1, int k, af af, File file)
    {
        super(j, ah, w, ag, a1, b1, transfer, c1, k, af, file);
        i = (m)c.a(m1);
    }

    protected final void a(long l)
    {
        i.a(f, l);
    }

    protected final void a(long l, long l1)
    {
        a.a(g, OfflineMediaStatus.ACTIVE);
        a.a(g, l, l1);
        i.b(f, l);
    }

    protected final void a(PlayerResponse playerresponse)
    {
        long l = h.a();
        if (!a.a(g, playerresponse, l))
        {
            throw new AbstractOfflineTransferTask.PlayerResponseSaveException();
        } else
        {
            return;
        }
    }

    protected final void a(String s, Exception exception, OfflineMediaStatus offlinemediastatus)
    {
        TransferException transferexception;
        if (exception == null)
        {
            transferexception = new TransferException(s, offlinemediastatus.isFatal());
        } else
        {
            transferexception = new TransferException(s, exception, offlinemediastatus.isFatal());
        }
        if (offlinemediastatus.isFatal())
        {
            L.a((new StringBuilder("pudl task[")).append(f).append("] failed: ").append(s).toString(), exception);
        } else
        {
            L.c((new StringBuilder("pudl task[")).append(f).append("]: ").append(s).toString());
        }
        a.a(g, offlinemediastatus);
        i.a(f, transferexception);
    }

    protected final boolean a()
    {
        return a.g(g) != null;
    }

    protected final void b()
    {
        L.d((new StringBuilder("pudl task[")).append(f).append("] success").toString());
        a.a(g, OfflineMediaStatus.COMPLETE);
        i.a(f, new a());
    }
}
