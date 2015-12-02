// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.DialogInterface;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import n;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a
    implements android.content.stener
{

    final LocationSearchFragment a;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.c.a(AnalyticsEvent.create("tap").setName(n.dj).setValue("try_again"));
        LocationSearchFragment.j(a);
    }

    (LocationSearchFragment locationsearchfragment)
    {
        a = locationsearchfragment;
        super();
    }
}
