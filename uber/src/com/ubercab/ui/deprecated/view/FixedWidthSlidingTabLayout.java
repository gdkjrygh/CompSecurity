// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.ubercab.ui.deprecated.view:
//            SlidingTabLayout

public class FixedWidthSlidingTabLayout extends SlidingTabLayout
{

    private LinearLayout b;

    public FixedWidthSlidingTabLayout(Context context)
    {
        this(context, null);
    }

    public FixedWidthSlidingTabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FixedWidthSlidingTabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new LinearLayout(context);
        addView(b);
    }

    protected final ViewGroup a()
    {
        return b;
    }

    protected final void a(TextView textview)
    {
        super.a(textview);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.weight = 1.0F;
        textview.setLayoutParams(layoutparams);
    }
}
