// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;


// Referenced classes of package com.ubercab.client.feature.trip.estimate:
//            TripTimeEstimateDialogFragment

final class a
    implements Runnable
{

    final TripTimeEstimateDialogFragment a;

    public final void run()
    {
        a.dismiss();
    }

    (TripTimeEstimateDialogFragment triptimeestimatedialogfragment)
    {
        a = triptimeestimatedialogfragment;
        super();
    }
}
