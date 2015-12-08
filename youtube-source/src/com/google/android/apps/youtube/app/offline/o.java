// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.DialogInterface;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            m, f

final class o
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        f.b(a.a).h(m.a(a).id);
    }
}
