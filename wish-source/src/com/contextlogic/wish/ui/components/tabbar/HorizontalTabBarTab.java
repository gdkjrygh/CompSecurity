// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HorizontalTabBarTab extends LinearLayout
{

    private TextView tagText;

    public HorizontalTabBarTab(Context context)
    {
        this(context, null);
    }

    public HorizontalTabBarTab(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300c9, this);
        setOrientation(0);
        tagText = (TextView)view.findViewById(0x7f0d041c);
        setBackgroundResource(0x7f0200e0);
    }

    public void setTitle(String s)
    {
        tagText.setText(s);
    }
}
