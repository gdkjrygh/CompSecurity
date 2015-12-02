// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.view.View;
import android.widget.AdapterView;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import exe;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            VenueSelectionFooterView

final class a
    implements android.widget.istener
{

    final VenueSelectionFooterView a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (com.ubercab.client.feature.pickup.model.ture)VenueSelectionFooterView.b(a).a(i);
        VenueSelectionFooterView.a(a, GuidedPickupVenueSelection.create(VenueSelectionFooterView.c(a), adapterview));
        VenueSelectionFooterView.b(a).a(false);
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        VenueSelectionFooterView.a(a, null);
        VenueSelectionFooterView.b(a).a(true);
    }

    (VenueSelectionFooterView venueselectionfooterview)
    {
        a = venueselectionfooterview;
        super();
    }
}
