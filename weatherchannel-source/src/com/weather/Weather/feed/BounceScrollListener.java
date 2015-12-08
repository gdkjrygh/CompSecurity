// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.view.View;
import android.widget.AbsListView;
import com.google.common.base.Preconditions;
import com.weather.Weather.ui.FrontPageView;

public class BounceScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private int currentScrollState;
    private final FrontPageView header;

    public BounceScrollListener(FrontPageView frontpageview)
    {
        header = (FrontPageView)Preconditions.checkNotNull(frontpageview);
    }

    private static boolean listIsAtTop(AbsListView abslistview)
    {
        while (abslistview.getChildCount() == 0 || abslistview.getChildAt(0).getTop() == 0) 
        {
            return true;
        }
        return false;
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (currentScrollState == 2 && i == 0 && listIsAtTop(abslistview))
        {
            header.overscrollBounce();
        }
        currentScrollState = i;
    }
}
