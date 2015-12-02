// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import gka;

// Referenced classes of package com.ubercab.client.feature.about:
//            AboutFragment

public final class a
    implements gka
{

    final AboutFragment a;

    private static boolean a(String s)
    {
        return s.endsWith("@uber.com");
    }

    public final boolean apply(Object obj)
    {
        return a((String)obj);
    }

    (AboutFragment aboutfragment)
    {
        a = aboutfragment;
        super();
    }
}
