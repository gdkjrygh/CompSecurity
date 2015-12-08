// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter

class val.tcNumber
    implements android.content.er
{

    final SaverReceiptListPresenter this$0;
    final String val$tcNumber;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SaverReceiptListPresenter.access$400(SaverReceiptListPresenter.this).launchDetails(SaverReceiptListPresenter.this, val$tcNumber);
    }

    ionCallbacks()
    {
        this$0 = final_saverreceiptlistpresenter;
        val$tcNumber = String.this;
        super();
    }
}
