// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment.promo;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.TripBalance;

class Y
{

    TextView mDetails;
    TextView mLabel;

    public final void a(TripBalance tripbalance)
    {
        mLabel.setText(tripbalance.getLabel());
        mDetails.setText(tripbalance.getDetail());
    }

    public Y(View view)
    {
        ButterKnife.inject(this, view);
    }
}
