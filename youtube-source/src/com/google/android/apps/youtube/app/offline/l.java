// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.DialogInterface;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            k, f

final class l
    implements android.content.DialogInterface.OnClickListener
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        f.b(a.a).h(k.a(a));
    }
}
