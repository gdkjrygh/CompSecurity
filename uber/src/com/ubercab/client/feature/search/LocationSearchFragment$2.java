// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.database.DataSetObserver;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a extends DataSetObserver
{

    final LocationSearchFragment a;

    public final void onChanged()
    {
        super.onChanged();
        LocationSearchFragment.b(a);
        LocationSearchFragment.c(a);
    }

    (LocationSearchFragment locationsearchfragment)
    {
        a = locationsearchfragment;
        super();
    }
}
