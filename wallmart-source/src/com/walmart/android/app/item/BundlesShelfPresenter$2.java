// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.walmartlabs.ui.PriceView;

// Referenced classes of package com.walmart.android.app.item:
//            BundlesShelfPresenter

class val.price
    implements android.view.animation.ner
{

    final BundlesShelfPresenter this$0;
    final String val$price;
    final PriceView val$priceView;

    public void onAnimationEnd(Animation animation)
    {
        val$priceView.setPrice(val$price);
        BundlesShelfPresenter.access$302(BundlesShelfPresenter.this, val$price);
        val$priceView.startAnimation(AnimationUtils.loadAnimation(BundlesShelfPresenter.access$400(BundlesShelfPresenter.this), 0x7f05000f));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        val$priceView.setVisibility(0);
    }

    ()
    {
        this$0 = final_bundlesshelfpresenter;
        val$priceView = priceview;
        val$price = String.this;
        super();
    }
}
