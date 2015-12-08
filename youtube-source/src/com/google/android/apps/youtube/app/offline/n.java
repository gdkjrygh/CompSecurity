// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.DialogInterface;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            m, f

final class n
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (f.b(a.a).a(m.a(a)))
        {
            ah.a(f.c(a.a), p.fX, 1);
        }
    }
}
