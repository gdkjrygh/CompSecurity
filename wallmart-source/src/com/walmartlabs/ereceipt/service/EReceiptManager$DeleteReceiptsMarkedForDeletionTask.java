// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider, EReceipt

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((EReceipt[])aobj);
    }

    protected transient Void doInBackground(EReceipt aereceipt[])
    {
        EReceiptManager.access$300(EReceiptManager.this).delete(aereceipt);
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        MessageBus.getBus().post(new EReceiptsUpdatedEvent());
    }

    private ()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
