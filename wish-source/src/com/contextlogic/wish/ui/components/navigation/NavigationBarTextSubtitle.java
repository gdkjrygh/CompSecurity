// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NavigationBarTextSubtitle extends LinearLayout
{

    private TextView subtitleTextView;
    private TextView textView;

    public NavigationBarTextSubtitle(Context context)
    {
        this(context, null);
    }

    public NavigationBarTextSubtitle(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300d1, this);
        textView = (TextView)view.findViewById(0x7f0d042e);
        subtitleTextView = (TextView)view.findViewById(0x7f0d042f);
        setOrientation(1);
    }

    public void setSubtitle(String s)
    {
        subtitleTextView.setText(s);
    }

    public void setTitle(String s)
    {
        textView.setText(s);
    }
}
