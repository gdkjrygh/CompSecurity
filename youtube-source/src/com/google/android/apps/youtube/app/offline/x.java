// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.DialogInterface;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            w, r

final class x
    implements android.content.DialogInterface.OnClickListener
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        r.c(a.a).g(w.a(a));
    }
}
