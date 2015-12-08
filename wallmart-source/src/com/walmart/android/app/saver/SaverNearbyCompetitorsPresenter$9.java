// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class val.next
    implements android.support.v4.view.ter._cls9
{

    final SaverNearbyCompetitorsPresenter this$0;
    final View val$next;
    final ViewPager val$pager;
    final View val$prev;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (i <= 0)
        {
            val$prev.setEnabled(false);
        } else
        {
            val$prev.setEnabled(true);
        }
        if (i >= val$pager.getAdapter().getCount() - 1)
        {
            val$next.setEnabled(false);
            return;
        } else
        {
            val$next.setEnabled(true);
            return;
        }
    }

    ()
    {
        this$0 = final_savernearbycompetitorspresenter;
        val$prev = view;
        val$pager = viewpager;
        val$next = View.this;
        super();
    }
}
