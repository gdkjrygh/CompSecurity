// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import chm;
import com.ubercab.ui.TextView;

public class LegendLayout extends LinearLayout
{

    private TextView a;
    private View b;
    private View c;

    public LegendLayout(Context context)
    {
        this(context, null);
    }

    public LegendLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LegendLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setOrientation(0);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        attributeset = context.obtainStyledAttributes(attributeset, chm.LegendLayout);
        if (attributeset == null) goto _L2; else goto _L3
_L3:
        int j;
        int k;
        i = attributeset.getResourceId(0, -1);
        k = attributeset.getDimensionPixelSize(1, 0);
        j = attributeset.getResourceId(2, -1);
        context = attributeset.getString(3);
        attributeset.recycle();
_L5:
        int l = i;
        if (i == -1)
        {
            l = 0x7f0201f1;
        }
        b = a(l);
        c = a(l);
        a = new TextView(getContext());
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -2);
        attributeset.setMargins(k, 0, k, 0);
        a.setLayoutParams(attributeset);
        a.setText(context);
        a.setGravity(16);
        if (j != -1)
        {
            a.setTextAppearance(getContext(), j);
        }
        addView(b);
        addView(a);
        addView(c);
        return;
_L2:
        context = "";
        j = -1;
        k = 0;
        i = -1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private View a(int i)
    {
        View view = new View(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 1);
        layoutparams.weight = 1.0F;
        layoutparams.gravity = 17;
        view.setLayoutParams(layoutparams);
        view.setBackgroundResource(i);
        return view;
    }
}
