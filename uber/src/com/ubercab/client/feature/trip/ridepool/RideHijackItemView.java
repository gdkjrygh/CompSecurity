// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.ridepool;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class RideHijackItemView extends LinearLayout
{

    TextView mSavingTaglineTextView;
    TextView mTitleTextView;

    public RideHijackItemView(Context context)
    {
        this(context, null, 0);
    }

    public RideHijackItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RideHijackItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    final void a(String s)
    {
        mTitleTextView.setText(s);
    }

    final void b(String s)
    {
        mSavingTaglineTextView.setText(s);
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
