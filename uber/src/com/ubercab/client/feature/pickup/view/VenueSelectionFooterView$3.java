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
    implements android.widget.istener
{

    final VenueSelectionFooterView a;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        com.ubercab.client.feature.pickup.model.re re = (com.ubercab.client.feature.pickup.model.re)VenueSelectionFooterView.d(a).a(i);
        boolean flag;
        if (re == null)
        {
            adapterview = null;
        } else
        {
            adapterview = re.getPickups();
        }
        if (adapterview != null && adapterview.size() == 1)
        {
            view = (com.ubercab.client.feature.pickup.model.ture)adapterview.get(0);
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
        a.mSpinnerPoint.post(new Runnable() {

            final VenueSelectionFooterView._cls3 a;

            public final void run()
            {
                a.a.mSpinnerPoint.setSelection(0, false);
                a.a.mSpinnerPoint.setOnItemSelectedListener(VenueSelectionFooterView.a(a.a));
            }

            
            {
                a = VenueSelectionFooterView._cls3.this;
                super();
            }
        });
        VenueSelectionFooterView.a(a, GuidedPickupVenueSelection.create(re, view));
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        VenueSelectionFooterView.a(a, null);
        VenueSelectionFooterView.b(a).a(null, true);
    }

    _cls1.a(VenueSelectionFooterView venueselectionfooterview)
    {
        a = venueselectionfooterview;
        super();
    }
}
