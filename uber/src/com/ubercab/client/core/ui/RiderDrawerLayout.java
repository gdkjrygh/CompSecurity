// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;

public class RiderDrawerLayout extends DrawerLayout
{

    public RiderDrawerLayout(Context context)
    {
        this(context, null);
    }

    public RiderDrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RiderDrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setScrimColor(getResources().getColor(0x7f0d004d));
        setDrawerShadow(0x7f02012d, 0x800003);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }
}
