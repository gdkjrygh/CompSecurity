// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.os.Binder;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransferService, TransfersExecutor, h

public final class k extends Binder
{

    final TransferService a;

    public k(TransferService transferservice)
    {
        a = transferservice;
        super();
    }

    public final Map a()
    {
        return a.j();
    }

    public final void a(String s)
    {
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.a(s, 0));
    }

    public final void a(String s, int i)
    {
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.a(s, i));
    }

    public final void a(String s, String s1, a a1)
    {
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.a(s, s1, a1));
    }

    public final void a(String s, String s1, String s2, a a1)
    {
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.a(s, s1, s2, a1));
    }

    public final boolean a(h h)
    {
        return a.a(h);
    }

    public final void b()
    {
        L.e("Transfer binder: pause all transfers");
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.c());
    }

    public final void b(String s)
    {
        L.e((new StringBuilder("Transfer binder: restore transfers for account [")).append(s).append("]").toString());
        a.startService(com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.getClass()));
        com.google.android.apps.youtube.core.transfer.TransferService.a(a, a.a.a(s));
    }

    public final boolean b(h h)
    {
        return a.b(h);
    }

    public final String c()
    {
        return a.k();
    }

    public final Set d()
    {
        return a.a.b();
    }
}
