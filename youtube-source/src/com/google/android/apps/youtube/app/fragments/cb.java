// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            WatchHistoryFragment

final class cb
    implements b
{

    final Video a;
    final WatchHistoryFragment b;

    cb(WatchHistoryFragment watchhistoryfragment, Video video)
    {
        b = watchhistoryfragment;
        a = video;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.fragments.WatchHistoryFragment.b(b).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.app.fragments.WatchHistoryFragment.a(b).b(a);
        ah.a(b.c, p.eW, 1);
    }
}
