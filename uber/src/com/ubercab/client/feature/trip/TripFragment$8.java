// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import com.ubercab.rider.realtime.request.param.ShoppingCartItem;
import gjv;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

final class a
    implements gjv
{

    final TripFragment a;

    private static ShoppingCartItem a(Object obj)
    {
        return (ShoppingCartItem)obj;
    }

    public final Object apply(Object obj)
    {
        return a(obj);
    }

    ngCartItem(TripFragment tripfragment)
    {
        a = tripfragment;
        super();
    }
}
