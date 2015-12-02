// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import ezh;
import ezi;
import gka;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            TroyProfilePreferencesAdapter

final class a
    implements gka
{

    final ezi a;
    final TroyProfilePreferencesAdapter b;

    private boolean a(ezh ezh1)
    {
        return ezh1.a() == a;
    }

    public final boolean apply(Object obj)
    {
        return a((ezh)obj);
    }

    I(TroyProfilePreferencesAdapter troyprofilepreferencesadapter, ezi ezi)
    {
        b = troyprofilepreferencesadapter;
        a = ezi;
        super();
    }
}
