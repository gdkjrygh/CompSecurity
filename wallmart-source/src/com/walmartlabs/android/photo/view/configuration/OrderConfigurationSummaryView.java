// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.DecimalFormat;

public class OrderConfigurationSummaryView extends RelativeLayout
{

    private TextView mPrintsCountView;
    private TextView mTotalCostView;

    public OrderConfigurationSummaryView(Context context)
    {
        super(context);
    }

    public OrderConfigurationSummaryView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OrderConfigurationSummaryView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mPrintsCountView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.prints_count);
        mTotalCostView = (TextView)findViewById(com.walmartlabs.android.photo.R.id.total_cost_value);
    }

    public void setModel(int i, double d)
    {
        mPrintsCountView.setText(String.valueOf(i));
        mTotalCostView.setText((new StringBuilder()).append("$").append((new DecimalFormat("0.00")).format(d)).toString());
    }
}
