// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import geg;
import gka;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleSeekBar

final class a
    implements gka
{

    final String a;
    final VehicleSeekBar b;

    private boolean a(geg geg1)
    {
        return geg1.a(a);
    }

    public final boolean apply(Object obj)
    {
        return a((geg)obj);
    }

    (VehicleSeekBar vehicleseekbar, String s)
    {
        b = vehicleseekbar;
        a = s;
        super();
    }
}
