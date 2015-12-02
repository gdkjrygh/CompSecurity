// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.view.View;
import android.widget.ListView;
import chp;
import eyy;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripActivity

final class a
    implements android.support.v4.widget.awerListener
{

    final TripActivity a;

    public final void onDrawerClosed(View view)
    {
        a.i.a(n.aT);
        if (a.u.f() && a.mListViewDrawerProfilesList.getVisibility() == 0)
        {
            TripActivity.a(a, false);
            TripActivity.b(a, false);
            TripActivity.c(a);
        }
    }

    public final void onDrawerOpened(View view)
    {
        a.i.a(l.cK);
        a.i.a(n.aU);
        if (a.u.g())
        {
            a.u.d();
        }
    }

    public final void onDrawerSlide(View view, float f)
    {
    }

    public final void onDrawerStateChanged(int i)
    {
    }

    stener(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }
}
