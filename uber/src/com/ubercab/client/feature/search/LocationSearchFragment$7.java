// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import com.ubercab.client.core.model.LocationSearchResult;
import ffy;
import gka;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a
    implements gka
{

    final String a;
    final LocationSearchFragment b;

    private boolean a(ffy ffy1)
    {
        String s = ffy1.c().getNickname();
        ffy1 = ffy1.c().getLongAddress();
        return s != null && s.toLowerCase().contains(a) || ffy1 != null && ffy1.toLowerCase().contains(a);
    }

    public final boolean apply(Object obj)
    {
        return a((ffy)obj);
    }

    (LocationSearchFragment locationsearchfragment, String s)
    {
        b = locationsearchfragment;
        a = s;
        super();
    }
}
