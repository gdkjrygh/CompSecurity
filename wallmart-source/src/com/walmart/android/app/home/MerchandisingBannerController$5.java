// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.support.v4.view.ViewPager;
import com.walmart.android.ui.PagerDotView;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController, MerchandisingAdapter

class this._cls0
    implements gedListener
{

    final MerchandisingBannerController this$0;

    public void onItemsChanged()
    {
        MerchandisingBannerController.access$000(MerchandisingBannerController.this).setNbrOfPages(MerchandisingBannerController.access$200(MerchandisingBannerController.this).getCount());
        if (MerchandisingBannerController.access$200(MerchandisingBannerController.this).getCount() > 1 && !MerchandisingBannerController.access$600(MerchandisingBannerController.this))
        {
            MerchandisingBannerController.access$000(MerchandisingBannerController.this).setVisibility(0);
            MerchandisingBannerController.access$000(MerchandisingBannerController.this).setPosition(MerchandisingBannerController.access$100(MerchandisingBannerController.this).getCurrentItem());
            return;
        } else
        {
            MerchandisingBannerController.access$000(MerchandisingBannerController.this).setVisibility(8);
            return;
        }
    }

    gedListener()
    {
        this$0 = MerchandisingBannerController.this;
        super();
    }
}
