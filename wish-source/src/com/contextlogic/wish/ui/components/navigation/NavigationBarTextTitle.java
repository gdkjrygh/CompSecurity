// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NavigationBarTextTitle extends FrameLayout
{

    private TextView textView;

    public NavigationBarTextTitle(Context context)
    {
        this(context, null);
    }

    public NavigationBarTextTitle(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationBarTextTitle(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        textView = (TextView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300d2, this).findViewById(0x7f0d042e);
    }

    public void setTitle(String s)
    {
        textView.setText(s);
    }
}
