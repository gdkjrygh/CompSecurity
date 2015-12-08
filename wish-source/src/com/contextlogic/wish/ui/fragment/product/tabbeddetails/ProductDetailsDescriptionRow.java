// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductDetailsDescriptionRow extends LinearLayout
{

    private TextView descriptionTextView;
    private TextView subDescriptionTextView;
    private TextView titleTextView;

    public ProductDetailsDescriptionRow(Context context)
    {
        this(context, null);
    }

    public ProductDetailsDescriptionRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03007a, this);
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        titleTextView = (TextView)view.findViewById(0x7f0d0254);
        descriptionTextView = (TextView)view.findViewById(0x7f0d0255);
        subDescriptionTextView = (TextView)view.findViewById(0x7f0d0256);
    }

    public TextView getDescriptionTextView()
    {
        return descriptionTextView;
    }

    public TextView getSubDescriptionTextView()
    {
        return subDescriptionTextView;
    }

    public void setDescription(String s)
    {
        descriptionTextView.setText(s);
    }

    public void setSubDescription(String s)
    {
        subDescriptionTextView.setText(s);
        if (s == null || s.isEmpty())
        {
            subDescriptionTextView.setVisibility(8);
            return;
        } else
        {
            subDescriptionTextView.setVisibility(0);
            return;
        }
    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }

    public void setTitleColumnWidth(int i)
    {
        android.view.ViewGroup.LayoutParams layoutparams = titleTextView.getLayoutParams();
        layoutparams.width = (int)TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        titleTextView.setLayoutParams(layoutparams);
    }
}
