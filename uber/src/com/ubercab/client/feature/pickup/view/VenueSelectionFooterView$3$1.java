// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import exe;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            VenueSelectionFooterView

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        a.a.mSpinnerPoint.setSelection(0, false);
        a.a.mSpinnerPoint.setOnItemSelectedListener(VenueSelectionFooterView.a(a.a));
    }

    ure(ure ure)
    {
        a = ure;
        super();
    }

    // Unreferenced inner class com/ubercab/client/feature/pickup/view/VenueSelectionFooterView$3

/* anonymous class */
    final class VenueSelectionFooterView._cls3
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final VenueSelectionFooterView a;

        public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature zonefeature = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature)VenueSelectionFooterView.d(a).a(i);
            boolean flag;
            if (zonefeature == null)
            {
                adapterview = null;
            } else
            {
                adapterview = zonefeature.getPickups();
            }
            if (adapterview != null && adapterview.size() == 1)
            {
                view = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature)adapterview.get(0);
            } else
            {
                view = null;
            }
            if (view == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.mSpinnerPoint.setOnItemSelectedListener(null);
            VenueSelectionFooterView.b(a).a(adapterview, flag);
            a.mSpinnerPoint.post(new VenueSelectionFooterView._cls3._cls1(this));
            VenueSelectionFooterView.a(a, GuidedPickupVenueSelection.create(zonefeature, view));
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
            VenueSelectionFooterView.a(a, null);
            VenueSelectionFooterView.b(a).a(null, true);
        }

            
            {
                a = venueselectionfooterview;
                super();
            }
    }

}
