// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;


// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

final class a
    implements Runnable
{

    final LocationSearchFragment a;

    public final void run()
    {
        if (a.isResumed())
        {
            LocationSearchFragment.a(a);
        }
    }

    (LocationSearchFragment locationsearchfragment)
    {
        a = locationsearchfragment;
        super();
    }
}
