// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.TextUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter

class this._cls0
    implements android.content.r
{

    final SaverManualReceiptPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (new com.walmartlabs.anivia.t>("pageView")).tring("name", "Error").tring("section", "Saver").tring("subCategory", "Error").tring("errorMessage", TextUtils.truncate("Error Handling - Deny to Sign In", 60));
        MessageBus.getBus().post(dialoginterface);
        SaverManualReceiptPresenter.access$300(SaverManualReceiptPresenter.this).onForceClose();
    }

    tionCallbacks()
    {
        this$0 = SaverManualReceiptPresenter.this;
        super();
    }
}
