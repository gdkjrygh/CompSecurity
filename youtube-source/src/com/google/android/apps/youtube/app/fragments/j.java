// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.ui.cq;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            BrowseFragment

final class j
    implements b
{

    final String a;
    final BrowseFragment b;

    j(BrowseFragment browsefragment, String s)
    {
        b = browsefragment;
        a = s;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        BrowseFragment.d(b).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)com.google.android.apps.youtube.app.fragments.BrowseFragment.b(b).get();
        if (obj != null && ((Playlist) (obj)).id.equals(a))
        {
            com.google.android.apps.youtube.app.fragments.BrowseFragment.b(b).compareAndSet(obj, null);
        }
        BrowseFragment.c(b).c(new cq());
        b.c.d(false);
        ah.a(b.c, p.aM, 1);
    }
}
