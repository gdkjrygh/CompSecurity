// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverNearbyCompetitorsPresenter

class val.pager
    implements android.view.itorsPresenter._cls7
{

    final SaverNearbyCompetitorsPresenter this$0;
    final ViewPager val$pager;

    public void onClick(View view)
    {
        val$pager.setCurrentItem(val$pager.getCurrentItem() - 1);
    }

    ()
    {
        this$0 = final_savernearbycompetitorspresenter;
        val$pager = ViewPager.this;
        super();
    }
}
