// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import android.os.Handler;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.transfer.h;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            f, y, z, af, 
//            ag

final class x
    implements h
{

    final f a;

    private x(f f1)
    {
        a = f1;
        super();
    }

    x(f f1, byte byte0)
    {
        this(f1);
    }

    public final void a(Transfer transfer)
    {
        L.e((new StringBuilder("pudl transfer: ")).append(transfer.a).append(" added").toString());
    }

    public final void b()
    {
    }

    public final void b(Transfer transfer)
    {
    }

    public final void c(Transfer transfer)
    {
        L.e((new StringBuilder("pudl transfer: ")).append(transfer.a).append(" progress ").append(transfer.e).append(" / ").append(transfer.f).toString());
        if (!p.a(transfer))
        {
            f.e(a).execute(new y(this, transfer));
        }
    }

    public final void d(Transfer transfer)
    {
        L.e((new StringBuilder("pudl transfer: ")).append(transfer.a).append(" status ").append(transfer.c).toString());
        if (!p.a(transfer))
        {
            f.e(a).execute(new z(this, transfer));
        }
    }

    public final void e(Transfer transfer)
    {
        L.e((new StringBuilder("pudl transfer: ")).append(transfer.a).append(" removed").toString());
        if (!p.a(transfer))
        {
            Object obj = p.c(transfer);
            obj = af.c(f.d(a), ((String) (obj))).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ag ag1 = (ag)((Iterator) (obj)).next();
                ag.b(ag1, transfer);
                if (ag.b(ag1) == 0)
                {
                    af.b(f.d(a), ag.c(ag1).id);
                }
            } while (true);
        }
    }

    public final void m_()
    {
        f.c(a).sendEmptyMessage(1);
    }
}
