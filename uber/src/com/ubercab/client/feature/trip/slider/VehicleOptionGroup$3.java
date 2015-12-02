// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.widget.HorizontalScrollView;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            VehicleOptionGroup

final class b
    implements Runnable
{

    final HorizontalScrollView a;
    final int b;
    final VehicleOptionGroup c;

    public final void run()
    {
        a.smoothScrollBy(b, 0);
    }

    A(VehicleOptionGroup vehicleoptiongroup, HorizontalScrollView horizontalscrollview, int i)
    {
        c = vehicleoptiongroup;
        a = horizontalscrollview;
        b = i;
        super();
    }
}
