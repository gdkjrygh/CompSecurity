// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import com.ubercab.rider.realtime.model.VehicleView;
import gka;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionGroup, OptionRadioButton

final class a
    implements gka
{

    final OptionRadioButton a;
    final VehicleOptionGroup b;

    private boolean a(VehicleView vehicleview)
    {
        return a.a().equals(vehicleview.getId());
    }

    public final boolean apply(Object obj)
    {
        return a((VehicleView)obj);
    }

    A(VehicleOptionGroup vehicleoptiongroup, OptionRadioButton optionradiobutton)
    {
        b = vehicleoptiongroup;
        a = optionradiobutton;
        super();
    }
}
