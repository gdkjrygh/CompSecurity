// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import android.content.DialogInterface;
import android.os.Bundle;
import fte;

// Referenced classes of package com.ubercab.client.feature.trip.estimate:
//            TripTimeEstimateDialogFragment, TripTimeEstimateDetailView

final class a
    implements android.content.EstimateDialogFragment._cls3
{

    final TripTimeEstimateDialogFragment a;

    public final void onShow(DialogInterface dialoginterface)
    {
        dialoginterface = a.getArguments();
        a.d.a(a.c.i(), dialoginterface.getString("estimate_arrival_time"), dialoginterface.getString("late_arrival_message"), dialoginterface.getString("trip_time_range_text"), a);
    }

    (TripTimeEstimateDialogFragment triptimeestimatedialogfragment)
    {
        a = triptimeestimatedialogfragment;
        super();
    }
}
