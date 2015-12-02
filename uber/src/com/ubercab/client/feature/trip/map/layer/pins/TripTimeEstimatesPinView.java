// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.pins;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class TripTimeEstimatesPinView extends LinearLayout
{

    View mPinFoot;
    ViewGroup mPopup;
    TextView mTimeEstimate;

    public TripTimeEstimatesPinView(Context context)
    {
        this(context, null);
    }

    public TripTimeEstimatesPinView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripTimeEstimatesPinView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
