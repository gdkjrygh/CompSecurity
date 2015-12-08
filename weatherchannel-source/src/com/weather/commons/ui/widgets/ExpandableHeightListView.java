// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class ExpandableHeightListView extends ListView
{

    boolean expanded;

    public ExpandableHeightListView(Context context)
    {
        super(context);
    }

    public ExpandableHeightListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ExpandableHeightListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public boolean isExpanded()
    {
        return expanded;
    }

    public void onMeasure(int i, int j)
    {
        if (isExpanded())
        {
            super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(0x1fffffff, 0x80000000));
            getLayoutParams().height = getMeasuredHeight();
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setExpanded(boolean flag)
    {
        expanded = flag;
    }
}
