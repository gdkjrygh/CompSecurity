// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.vehicleinspection;

import cis;
import cun;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.vehicleinspection:
//            PointOfInterestSelectionActivity

final class a
    implements Runnable
{

    final PointOfInterestSelectionActivity a;

    public final void run()
    {
        PointOfInterestSelectionActivity.b(a).b(a);
        if ((cun)a.a(cun) == null)
        {
            a.a(a.a(a.g()), false);
        }
    }

    (PointOfInterestSelectionActivity pointofinterestselectionactivity)
    {
        a = pointofinterestselectionactivity;
        super();
    }
}
