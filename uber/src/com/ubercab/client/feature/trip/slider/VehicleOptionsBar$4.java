// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import geg;
import gka;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionsBar, VehicleOptionGroup

final class a
    implements gka
{

    final String a;
    final VehicleOptionsBar b;

    private boolean a(VehicleOptionGroup vehicleoptiongroup)
    {
        return vehicleoptiongroup.a().a(a);
    }

    public final boolean apply(Object obj)
    {
        return a((VehicleOptionGroup)obj);
    }

    (VehicleOptionsBar vehicleoptionsbar, String s)
    {
        b = vehicleoptionsbar;
        a = s;
        super();
    }
}
