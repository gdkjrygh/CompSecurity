// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.TextUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

class this._cls0
    implements android.content.Listener
{

    final SaverScannerActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
        SaverScannerActivity.access$600(SaverScannerActivity.this, "abort");
        dialoginterface = (new com.walmartlabs.anivia.er("pageView")).putString("name", "Error").putString("section", "Saver").putString("subCategory", "Error").putString("errorMessage", TextUtils.truncate("Error Handling - Deny to Sign In", 60));
        MessageBus.getBus().post(dialoginterface);
    }

    ()
    {
        this$0 = SaverScannerActivity.this;
        super();
    }
}
