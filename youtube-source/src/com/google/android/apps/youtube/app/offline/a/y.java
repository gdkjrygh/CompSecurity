// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            x, f, af, ag

final class y
    implements Runnable
{

    final Transfer a;
    final x b;

    y(x x1, Transfer transfer)
    {
        b = x1;
        a = transfer;
        super();
    }

    public final void run()
    {
        Object obj = p.c(a);
        b.a.u(((String) (obj)));
        for (obj = af.c(f.d(b.a), ((String) (obj))).iterator(); ((Iterator) (obj)).hasNext(); ag.a((ag)((Iterator) (obj)).next(), a)) { }
    }
}
