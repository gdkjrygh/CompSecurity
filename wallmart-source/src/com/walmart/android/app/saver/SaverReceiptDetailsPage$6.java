// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.service.saver.SaverReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPage

class this._cls0
    implements android.view.iptDetailsPage._cls6
{

    final SaverReceiptDetailsPage this$0;

    public void onClick(View view)
    {
        if (SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this) == null || SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this).store == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        int i = Integer.parseInt(SaverReceiptDetailsPage.access$100(SaverReceiptDetailsPage.this).store._fld0);
        SaverReceiptDetailsPage.access$1100(SaverReceiptDetailsPage.this).onAddressClicked(i);
        return;
        view;
    }

    tionCallbacks()
    {
        this$0 = SaverReceiptDetailsPage.this;
        super();
    }
}
