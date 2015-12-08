// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.honeycomb.ui.ActionBarMenuHelper;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class bm
    implements Runnable
{

    final SearchFragment a;

    bm(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    public final void run()
    {
        a.c.O().a(SearchFragment.a(a), false);
    }
}
