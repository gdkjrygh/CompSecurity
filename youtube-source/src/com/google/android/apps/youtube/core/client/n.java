// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.player.ad;
import com.google.android.apps.youtube.core.player.al;
import com.google.android.apps.youtube.core.utils.a;
import com.google.android.apps.youtube.datalib.innertube.ag;
import com.google.android.apps.youtube.datalib.innertube.ak;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            h, cf

public final class n
    implements ag
{

    private final com.google.android.apps.youtube.core.client.h a;

    public n(com.google.android.apps.youtube.core.client.h h1)
    {
        a = (com.google.android.apps.youtube.core.client.h)c.a(h1);
    }

    public final void a(ak ak1)
    {
        Object obj;
        obj = a.l();
        ak1.d(a.a().b()).g(a.a().d()).e(a.j()).c(a.i().i()).b(a.h());
        obj;
        JVM INSTR monitorenter ;
        if (((ad) (obj)).c())
        {
            ak1.e(((ad) (obj)).e()).h(((ad) (obj)).d()).f(((ad) (obj)).f());
            if (((ad) (obj)).g() != null)
            {
                ak1.d(((ad) (obj)).g().a());
            }
        }
        obj;
        JVM INSTR monitorexit ;
        obj = a.k();
        if (obj != null)
        {
            ak1.a(((cf) (obj)).b());
        }
        return;
        ak1;
        throw ak1;
    }
}
