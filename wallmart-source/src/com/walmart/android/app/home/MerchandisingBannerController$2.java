// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController, MerchandisingAdapter

class this._cls0
    implements android.view.nerController._cls2
{

    final MerchandisingBannerController this$0;

    public void onClick(View view)
    {
        view = MerchandisingBannerController.access$200(MerchandisingBannerController.this).getBannerData(MerchandisingBannerController.access$100(MerchandisingBannerController.this).getCurrentItem());
        if (MerchandisingBannerController.access$300(MerchandisingBannerController.this) != null)
        {
            MerchandisingBannerController.access$300(MerchandisingBannerController.this).onMerchandisingUriClicked(view);
        }
    }

    MerchandisingClickedListener()
    {
        this$0 = MerchandisingBannerController.this;
        super();
    }
}
