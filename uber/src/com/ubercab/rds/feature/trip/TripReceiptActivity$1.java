// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.view.View;

// Referenced classes of package com.ubercab.rds.feature.trip:
//            TripReceiptActivity, TripProblemActivity

final class a
    implements android.view.ceiptActivity._cls1
{

    final TripReceiptActivity a;

    public final void onClick(View view)
    {
        a.startActivity(TripProblemActivity.a(a, TripReceiptActivity.a(a), TripReceiptActivity.b(a)));
    }

    (TripReceiptActivity tripreceiptactivity)
    {
        a = tripreceiptactivity;
        super();
    }
}
