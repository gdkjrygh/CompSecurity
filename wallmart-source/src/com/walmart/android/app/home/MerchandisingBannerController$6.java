// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.view.MotionEvent;
import android.view.View;
import com.walmartlabs.ui.merchandising.ViewPagerDragger;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController

class this._cls0
    implements android.view.nerController._cls6
{

    final MerchandisingBannerController this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (MerchandisingBannerController.access$700(MerchandisingBannerController.this) != null)
        {
            MerchandisingBannerController.access$700(MerchandisingBannerController.this).resetTimer();
        }
        return false;
    }

    ()
    {
        this$0 = MerchandisingBannerController.this;
        super();
    }
}
