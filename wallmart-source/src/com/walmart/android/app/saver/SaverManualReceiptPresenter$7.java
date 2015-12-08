// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter, SaverNotificationUtils

class this._cls0
    implements android.content.r
{

    final SaverManualReceiptPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SaverManualReceiptPresenter.access$300(SaverManualReceiptPresenter.this).onShowReceipt(SaverManualReceiptPresenter.access$500(SaverManualReceiptPresenter.this), SaverManualReceiptPresenter.access$600(SaverManualReceiptPresenter.this), SaverNotificationUtils.getLocalDate(SaverManualReceiptPresenter.access$700(SaverManualReceiptPresenter.this)), SaverManualReceiptPresenter.access$800(SaverManualReceiptPresenter.this), true);
    }

    tionCallbacks()
    {
        this$0 = SaverManualReceiptPresenter.this;
        super();
    }
}
