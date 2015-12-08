// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

public class FeatureDisabledView extends LinearLayout
{

    private TextView mButton;
    private TextView mText;
    private TextView mTitle;

    public FeatureDisabledView(Context context)
    {
        super(context);
    }

    public FeatureDisabledView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FeatureDisabledView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public FeatureDisabledView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mTitle = (TextView)ViewUtil.findViewById(this, 0x7f100136);
        mText = (TextView)ViewUtil.findViewById(this, 0x7f100137);
        mButton = (TextView)ViewUtil.findViewById(this, 0x7f100138);
    }

    public void setButtonTextAndAction(int i, android.view.View.OnClickListener onclicklistener)
    {
        mButton.setText(i);
        mButton.setOnClickListener(onclicklistener);
    }

    public void setText(int i)
    {
        mText.setText(i);
    }

    public void setTitle(int i)
    {
        mTitle.setText(i);
    }
}
