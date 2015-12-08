// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.c;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            aa

final class ab
    implements Runnable
{

    final String a;
    final b b;
    final aa c;

    ab(aa aa1, String s, b b1)
    {
        c = aa1;
        a = s;
        b = b1;
        super();
    }

    public final void run()
    {
        Object obj;
        if (!aa.a(c).b())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = com.google.android.apps.youtube.app.offline.aa.b(c).a(aa.a(c).c());
_L1:
        c c1 = com.google.android.apps.youtube.common.a.c.a();
        ((OfflineStoreInterface) (obj)).c(a, c1);
        obj = (List)c1.get();
        if (obj != null)
        {
            try
            {
                b.a(a, obj);
                return;
            }
            catch (Exception exception)
            {
                b.a(a, exception);
            }
            break MISSING_BLOCK_LABEL_130;
        }
        break MISSING_BLOCK_LABEL_94;
        obj = com.google.android.apps.youtube.app.offline.aa.b(c).a();
          goto _L1
        b.a(a, new IOException());
        return;
    }
}
