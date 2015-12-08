// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class OnboardingViewPager extends ViewPager
{

    public OnboardingViewPager(Context context)
    {
        super(context);
    }

    public OnboardingViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        return super.canScroll(view, flag, i, j, k);
    }
}
