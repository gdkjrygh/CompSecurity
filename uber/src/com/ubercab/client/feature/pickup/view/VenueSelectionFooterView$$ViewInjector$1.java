// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            VenueSelectionFooterView

final class a extends DebouncingOnClickListener
{

    final VenueSelectionFooterView a;
    final ckupLocation b;

    public final void doClick(View view)
    {
        a.onClickConfirmPickupLocation();
    }

    ( , VenueSelectionFooterView venueselectionfooterview)
    {
        b = ;
        a = venueselectionfooterview;
        super();
    }
}
