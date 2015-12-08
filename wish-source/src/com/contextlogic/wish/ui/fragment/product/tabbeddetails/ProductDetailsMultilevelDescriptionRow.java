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
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProductDetailsMultilevelDescriptionRow extends LinearLayout
{

    private ViewGroup contentContainer;
    private TextView titleTextView;

    public ProductDetailsMultilevelDescriptionRow(Context context)
    {
        this(context, null);
    }

    public ProductDetailsMultilevelDescriptionRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private View createBottomBorder()
    {
        View view = new View(getContext());
        view.setBackgroundColor(getResources().getColor(0x7f0c00d6));
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 1.0F, getResources().getDisplayMetrics())));
        return view;
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03007f, this);
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        titleTextView = (TextView)view.findViewById(0x7f0d025d);
        contentContainer = (ViewGroup)view.findViewById(0x7f0d025e);
    }

    public void setContentsFromAdapter(ArrayAdapter arrayadapter)
    {
        contentContainer.removeAllViews();
        int j = arrayadapter.getCount();
        for (int i = 0; i < j; i++)
        {
            View view = arrayadapter.getView(i, null, null);
            contentContainer.addView(view);
            if (j > 1 && i < j - 1)
            {
                contentContainer.addView(createBottomBorder());
            }
        }

    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }
}
