// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.view.View;
import android.widget.AbsListView;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.Weather.feed:
//            ViewWithAlpha

public class AlphaSettingScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private final int alphaFactor;
    private final View header;
    private final AbsListView listView;
    private final int maxAlpha;
    private final Collection viewsToUpdate = new ArrayList();

    public AlphaSettingScrollListener(View view, AbsListView abslistview, int i, int j)
    {
        header = (View)Preconditions.checkNotNull(view);
        listView = (AbsListView)Preconditions.checkNotNull(abslistview);
        alphaFactor = ((Integer)Preconditions.checkNotNull(Integer.valueOf(j))).intValue();
        maxAlpha = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
    }

    public void addViewToUpdate(ViewWithAlpha viewwithalpha)
    {
        viewsToUpdate.add(Preconditions.checkNotNull(viewwithalpha));
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        updateAlphas();
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public void updateAlphas()
    {
        int j = listView.getFirstVisiblePosition();
        int i = Math.abs(header.getTop()) / alphaFactor;
        if (i >= maxAlpha || j > 0)
        {
            i = maxAlpha;
        }
        for (Iterator iterator = viewsToUpdate.iterator(); iterator.hasNext(); ((ViewWithAlpha)iterator.next()).setAlphaOfView(i)) { }
    }
}
