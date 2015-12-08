// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.ui.ab;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ba

final class bd
    implements ab
{

    final ba a;

    bd(ba ba1)
    {
        a = ba1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Video)obj;
        ba.a(a).e(((Video) (obj)).id);
    }
}
