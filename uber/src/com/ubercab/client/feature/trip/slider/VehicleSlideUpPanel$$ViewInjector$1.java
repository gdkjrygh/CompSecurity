// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleSlideUpPanel

final class a extends DebouncingOnClickListener
{

    final VehicleSlideUpPanel a;
    final  b;

    public final void doClick(View view)
    {
        a.onClickBannerBar();
    }

    ( , VehicleSlideUpPanel vehicleslideuppanel)
    {
        b = ;
        a = vehicleslideuppanel;
        super();
    }
}
