// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.transfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.cache.b;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;
import com.google.android.apps.youtube.core.async.ak;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.core.transfer.TransferService;
import com.google.android.apps.youtube.core.transfer.TransfersExecutor;
import com.google.android.apps.youtube.core.transfer.m;
import com.google.android.apps.youtube.core.utils.h;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.core.utils.w;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.security.Key;

// Referenced classes of package com.google.android.apps.youtube.app.offline.transfer:
//            c, e, b

public class OfflineTransferService extends TransferService
{

    private Key b;
    private ag c;
    private com.google.android.apps.youtube.common.cache.a d;

    public OfflineTransferService()
    {
    }

    public static Intent a(Context context)
    {
        return TransferService.a(context, com/google/android/apps/youtube/app/offline/transfer/OfflineTransferService);
    }

    public static w a(Context context, com.google.android.apps.youtube.core.transfer.h h1)
    {
        return TransferService.a(context, com/google/android/apps/youtube/app/offline/transfer/OfflineTransferService, h1);
    }

    protected final int a()
    {
        l l1 = ((BaseApplication)getApplication()).y().aT();
        if (l1.b())
        {
            return a.a(l1.c());
        } else
        {
            return 0;
        }
    }

    public final com.google.android.apps.youtube.core.transfer.l a(Transfer transfer, m m)
    {
        ax ax1 = ((YouTubeApplication)getApplication()).d();
        Object obj = ax1.aT();
        com.google.android.apps.youtube.datalib.innertube.ah ah = ax1.o();
        n n1 = new n();
        Object obj1 = ax1.q();
        com.google.android.apps.youtube.core.async.af af;
        java.io.File file;
        int j;
        if (((l) (obj)).b())
        {
            obj = ((q) (obj1)).a(((l) (obj)).c()).d();
        } else
        {
            obj = null;
        }
        obj1 = new com.google.android.apps.youtube.app.offline.transfer.c(ax1.bb(), ax1.bl(), ax1.bm(), b, ax1.be().c(), ax1.aG());
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        j = transfer.g.b("stream_quality", 0);
        af = ak.a(ax1.aL(), ax1.aJ(), n1);
        file = ax1.bc();
        if (!p.a(transfer))
        {
            return new e(((com.google.android.apps.youtube.core.offline.store.i) (obj)), ah, ax1.aa(), c, d, n1, transfer, m, ((com.google.android.apps.youtube.app.offline.transfer.c) (obj1)), j, af, file);
        } else
        {
            return new com.google.android.apps.youtube.app.offline.transfer.b(((com.google.android.apps.youtube.core.offline.store.i) (obj)), ah, ax1.aa(), c, d, n1, transfer, m, ((com.google.android.apps.youtube.app.offline.transfer.c) (obj1)), j, af, file);
        }
    }

    public final Runnable a(Transfer transfer)
    {
        return null;
    }

    protected final int b()
    {
        return 5;
    }

    protected final boolean c()
    {
        return false;
    }

    protected final String d()
    {
        return "bgol_tasks.db";
    }

    protected final String e()
    {
        return "offline_policy_string";
    }

    protected final String f()
    {
        return null;
    }

    protected final String g()
    {
        return null;
    }

    protected final int h()
    {
        return 1;
    }

    protected final String i()
    {
        return null;
    }

    public void onCreate()
    {
        L.e("Creating OfflineService...");
        super.onCreate();
        BaseApplication baseapplication = (BaseApplication)getApplication();
        b = com.google.android.apps.youtube.core.utils.h.a(baseapplication.y().aP());
        c = baseapplication.x();
        d = com.google.android.apps.youtube.common.cache.n.a(new b(8), new n(), 0x36ee80L);
    }

    public void onDestroy()
    {
        L.e("Destroying OfflineService...");
        super.onDestroy();
    }
}
