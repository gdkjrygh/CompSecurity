// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.location;

import gka;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.location:
//            RiderLocation, RiderAddressComponent

final class a
    implements gka
{

    final String a;
    final RiderLocation b;

    private boolean a(RiderAddressComponent rideraddresscomponent)
    {
        return rideraddresscomponent.getTypes() != null && rideraddresscomponent.getTypes().contains(a);
    }

    public final boolean apply(Object obj)
    {
        return a((RiderAddressComponent)obj);
    }

    onent(RiderLocation riderlocation, String s)
    {
        b = riderlocation;
        a = s;
        super();
    }
}
