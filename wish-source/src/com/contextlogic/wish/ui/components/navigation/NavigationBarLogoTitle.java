// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class NavigationBarLogoTitle extends FrameLayout
{

    public NavigationBarLogoTitle(Context context)
    {
        this(context, null);
    }

    public NavigationBarLogoTitle(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationBarLogoTitle(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300cd, this);
    }
}
