// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.widget.Spinner;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            VenueSelectionFooterView

final class a
    implements Runnable
{

    final int a;
    final VenueSelectionFooterView b;

    public final void run()
    {
        b.mSpinnerPoint.setSelection(a, false);
        b.mSpinnerPoint.setOnItemSelectedListener(VenueSelectionFooterView.a(b));
    }

    (VenueSelectionFooterView venueselectionfooterview, int i)
    {
        b = venueselectionfooterview;
        a = i;
        super();
    }
}
