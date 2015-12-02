// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.text.TextUtils;
import ffy;
import gka;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a
    implements gka
{

    final LocationSearchFragment a;

    private static boolean a(ffy ffy1)
    {
        return TextUtils.isEmpty(ffy1.b());
    }

    public final boolean apply(Object obj)
    {
        return a((ffy)obj);
    }

    (LocationSearchFragment locationsearchfragment)
    {
        a = locationsearchfragment;
        super();
    }
}
