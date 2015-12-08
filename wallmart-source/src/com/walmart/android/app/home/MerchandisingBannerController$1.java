// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import com.walmart.android.ui.PagerDotView;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController

class this._cls0
    implements android.support.v4.view.er._cls1
{

    final MerchandisingBannerController this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        MerchandisingBannerController.access$000(MerchandisingBannerController.this).setPosition(i);
    }

    ()
    {
        this$0 = MerchandisingBannerController.this;
        super();
    }
}
