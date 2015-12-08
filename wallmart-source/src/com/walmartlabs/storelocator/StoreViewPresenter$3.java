// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.view.animation.Animation;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter

class val.anim
    implements android.view.animation.stener
{

    final StoreViewPresenter this$0;
    final Animation val$anim;

    public void onAnimationEnd(Animation animation)
    {
        animation = StoreViewPresenter.this;
        boolean flag;
        if (val$anim == StoreViewPresenter.access$000(StoreViewPresenter.this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        StoreViewPresenter.access$100(animation, flag);
        StoreViewPresenter.access$202(StoreViewPresenter.this, false);
        onPageView();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = final_storeviewpresenter;
        val$anim = Animation.this;
        super();
    }
}
