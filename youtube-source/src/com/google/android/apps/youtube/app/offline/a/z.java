// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.app.offline.c;
import com.google.android.apps.youtube.core.offline.store.i;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            x, f, af, ag

final class z
    implements Runnable
{

    final Transfer a;
    final x b;

    z(x x1, Transfer transfer)
    {
        b = x1;
        a = transfer;
        super();
    }

    public final void run()
    {
        Object obj = p.c(a);
        if (f.a(b.a).a(((String) (obj)), a))
        {
            if (a.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED)
            {
                b.a.v(((String) (obj)));
            } else
            {
                if (a.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING)
                {
                    f.f(b.a).a(((String) (obj)));
                }
                b.a.u(((String) (obj)));
            }
            obj = com.google.android.apps.youtube.app.offline.a.af.c(f.d(b.a), ((String) (obj))).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ag ag1 = (ag)((Iterator) (obj)).next();
                ag.a(ag1, a);
                if (ag.b(ag1) == 0)
                {
                    af.b(f.d(b.a), com.google.android.apps.youtube.app.offline.a.ag.c(ag1).id);
                }
            } while (true);
        }
    }
}
