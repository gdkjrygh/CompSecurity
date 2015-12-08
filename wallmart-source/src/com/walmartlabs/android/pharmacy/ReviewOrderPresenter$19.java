// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            ReviewOrderPresenter

class this._cls0
    implements android.content.sListener
{

    final ReviewOrderPresenter this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        MessageBus.getBus().post((new com.walmartlabs.anivia.r("pageView")).putString("pageView", "errMsgCannotRefillAtPharm"));
    }

    ()
    {
        this$0 = ReviewOrderPresenter.this;
        super();
    }
}
