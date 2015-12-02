// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.estimate;

import android.app.Dialog;
import android.content.Context;
import com.ubercab.client.feature.mobilemessage.MobileMessageDraggableLayout;

// Referenced classes of package com.ubercab.client.feature.trip.estimate:
//            TripTimeEstimateDialogFragment

final class a extends Dialog
{

    final TripTimeEstimateDialogFragment a;

    public final void onBackPressed()
    {
        a.mLayoutModules.b();
    }

    (TripTimeEstimateDialogFragment triptimeestimatedialogfragment, Context context, int i)
    {
        a = triptimeestimatedialogfragment;
        super(context, i);
    }
}
