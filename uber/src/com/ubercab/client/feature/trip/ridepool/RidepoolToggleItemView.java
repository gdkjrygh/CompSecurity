// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;

public class RidepoolToggleItemView extends LinearLayout
{

    TextView mCapacityTaglineTextView;
    TextView mFareTextView;
    TextView mSharingTaglineTextView;

    public RidepoolToggleItemView(Context context)
    {
        this(context, null, 0);
    }

    public RidepoolToggleItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RidepoolToggleItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    final void a(String s)
    {
        mCapacityTaglineTextView.setText(s);
    }

    final void b(String s)
    {
        mFareTextView.setText(s);
    }

    final void c(String s)
    {
        mSharingTaglineTextView.setText(s);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
    }
}
