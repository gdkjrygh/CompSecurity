// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController

class this._cls0
    implements android.animation.ener
{

    final MerchandisingBannerController this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        MerchandisingBannerController.access$400(MerchandisingBannerController.this).getLayoutParams().nerController = ((Integer)valueanimator.getAnimatedValue()).intValue();
        MerchandisingBannerController.access$400(MerchandisingBannerController.this).requestLayout();
    }

    ()
    {
        this$0 = MerchandisingBannerController.this;
        super();
    }
}
