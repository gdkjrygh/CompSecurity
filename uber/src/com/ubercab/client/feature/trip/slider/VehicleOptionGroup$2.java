// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import gka;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionGroup, OptionRadioButton

final class a
    implements gka
{

    final String a;
    final VehicleOptionGroup b;

    private boolean a(OptionRadioButton optionradiobutton)
    {
        return optionradiobutton.a().equals(a);
    }

    public final boolean apply(Object obj)
    {
        return a((OptionRadioButton)obj);
    }

    A(VehicleOptionGroup vehicleoptiongroup, String s)
    {
        b = vehicleoptiongroup;
        a = s;
        super();
    }
}
