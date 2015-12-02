// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.capacity;

import fui;

// Referenced classes of package com.ubercab.client.feature.trip.capacity:
//            CapacityPopupWindow

final class a
    implements android.widget.istener
{

    final CapacityPopupWindow a;

    public final void onDismiss()
    {
        if (CapacityPopupWindow.a(a) != null)
        {
            CapacityPopupWindow.a(a).a();
        }
    }

    (CapacityPopupWindow capacitypopupwindow)
    {
        a = capacitypopupwindow;
        super();
    }
}
