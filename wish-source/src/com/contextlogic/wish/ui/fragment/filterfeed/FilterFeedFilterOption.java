// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFilter;

public class FilterFeedFilterOption extends LinearLayout
{

    private WishFilter filter;
    private TextView name;

    public FilterFeedFilterOption(Context context)
    {
        this(context, null);
    }

    public FilterFeedFilterOption(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        name = (TextView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030053, this).findViewById(0x7f0d01d5);
    }

    public WishFilter getFilter()
    {
        return filter;
    }

    public void setFilter(WishFilter wishfilter)
    {
        filter = wishfilter;
        name.setText(wishfilter.getName().toUpperCase());
    }
}
