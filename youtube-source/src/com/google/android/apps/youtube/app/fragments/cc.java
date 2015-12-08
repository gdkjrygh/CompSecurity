// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.ie;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            WatchHistoryFragment

final class cc
    implements b
{

    final WatchHistoryFragment a;

    cc(WatchHistoryFragment watchhistoryfragment)
    {
        a = watchhistoryfragment;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.fragments.WatchHistoryFragment.b(a).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        WatchHistoryFragment.c(a).f();
        ah.a(a.c, p.hi, 1);
    }
}
