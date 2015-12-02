// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import cis;
import com.ubercab.android.location.service.model.UberLocationRequest;
import cqi;
import csb;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.vehicleinspection:
//            PointOfInterestSelectionActivity

final class a
    implements Runnable
{

    final PointOfInterestSelectionActivity a;

    public final void run()
    {
        PointOfInterestSelectionActivity.a(a, csb.a(a.getApplication(), PointOfInterestSelectionActivity.a(a)));
        PointOfInterestSelectionActivity.b(a).a(UberLocationRequest.create().setPriority(2).setFastestInterval(cqi.a).setInterval(cqi.a));
        PointOfInterestSelectionActivity.b(a).a(a);
        PointOfInterestSelectionActivity.b(a).c();
    }

    (PointOfInterestSelectionActivity pointofinterestselectionactivity)
    {
        a = pointofinterestselectionactivity;
        super();
    }
}
