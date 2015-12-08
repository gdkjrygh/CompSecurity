// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.view.ViewGroup;
import android.view.animation.Animation;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

class val.scanContainer
    implements android.view.animation.er
{

    final EReceiptListPresenter this$0;
    final ViewGroup val$scanContainer;

    public void onAnimationEnd(Animation animation)
    {
        val$scanContainer.setVisibility(8);
        EReceiptListPresenter.access$1902(EReceiptListPresenter.this, 1);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = final_ereceiptlistpresenter;
        val$scanContainer = ViewGroup.this;
        super();
    }
}
