// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter

class this._cls0
    implements android.view.ewOrderPresenter._cls14
{

    final ReviewOrderPresenter this$0;

    public void onClick(View view)
    {
        ReviewOrderPresenter.access$1000(ReviewOrderPresenter.this);
        MessageBus.getBus().post((new com.walmartlabs.anivia.r("pageView")).putString("name", "Rx:OrderChangeStore"));
    }

    ()
    {
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
