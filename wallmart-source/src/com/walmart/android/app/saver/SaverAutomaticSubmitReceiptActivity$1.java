// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.TextUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverAutomaticSubmitReceiptActivity

class this._cls0
    implements android.content.iptActivity._cls1
{

    final SaverAutomaticSubmitReceiptActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (new com.walmartlabs.anivia.vity._cls1("pageView"))._mth1("name", "Error")._mth1("section", "Saver")._mth1("subCategory", "Error")._mth1("errorMessage", TextUtils.truncate("Error Handling - Deny to Sign In", 60));
        MessageBus.getBus().post(dialoginterface);
        onForceClose();
    }

    I()
    {
        this$0 = SaverAutomaticSubmitReceiptActivity.this;
        super();
    }
}
