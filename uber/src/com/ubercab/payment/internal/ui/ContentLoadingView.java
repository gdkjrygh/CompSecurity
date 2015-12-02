// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import gsd;

public class ContentLoadingView extends FrameLayout
{

    private View a;
    private ProgressBar b;

    public ContentLoadingView(Context context)
    {
        this(context, null);
    }

    public ContentLoadingView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentLoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setLayoutTransition(new LayoutTransition());
        b = new ProgressBar(context, attributeset, 0x1010077);
        b.setId(gsd.ub__payment_progressbar);
        b.setIndeterminate(true);
        b.setVisibility(8);
        addView(b, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.setVisibility(0);
            b.setVisibility(8);
            return;
        } else
        {
            b.setVisibility(0);
            a.setVisibility(8);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = getChildAt(1);
    }
}
