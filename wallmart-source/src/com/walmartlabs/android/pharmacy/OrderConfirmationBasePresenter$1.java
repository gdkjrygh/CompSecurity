// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            OrderConfirmationBasePresenter

class val.intent
    implements android.view.tionBasePresenter._cls1
{

    final OrderConfirmationBasePresenter this$0;
    final Intent val$intent;

    public void onClick(View view)
    {
        mActivity.startActivity(val$intent);
        MessageBus.getBus().post((new com.walmartlabs.anivia.esenter._cls1.val.intent("pageView")).ng("name", "Rx:AddToCalendar"));
    }

    ()
    {
        this$0 = final_orderconfirmationbasepresenter;
        val$intent = Intent.this;
        super();
    }
}
