// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.os.Handler;
import com.google.android.apps.youtube.app.honeycomb.ui.f;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            SearchFragment

final class bq
    implements f
{

    final SearchFragment a;

    private bq(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }

    bq(SearchFragment searchfragment, byte byte0)
    {
        this(searchfragment);
    }

    public final void A()
    {
        SearchFragment.i(a).removeCallbacks(SearchFragment.h(a));
    }

    public final void z()
    {
        SearchFragment.i(a).post(SearchFragment.h(a));
    }
}
