// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import cjg;
import cjq;
import com.ubercab.android.map.MapView;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            EnhancedReceiptDialogFragment

final class a
    implements cjq
{

    final EnhancedReceiptDialogFragment a;

    public final void a(cjg cjg)
    {
        if (a.mMapView.getVisibility() == 4)
        {
            a.mMapView.setVisibility(0);
        }
    }

    (EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        a = enhancedreceiptdialogfragment;
        super();
    }
}
