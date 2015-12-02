// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.capacity;


// Referenced classes of package com.ubercab.client.feature.trip.capacity:
//            CapacityPopupWindow

final class a
    implements Runnable
{

    final CapacityPopupWindow a;

    public final void run()
    {
        if (a.isShowing())
        {
            a.dismiss();
        }
    }

    (CapacityPopupWindow capacitypopupwindow)
    {
        a = capacitypopupwindow;
        super();
    }
}
