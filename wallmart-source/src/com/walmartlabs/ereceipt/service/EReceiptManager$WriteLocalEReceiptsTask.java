// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider

private class mUpdateStoreItems extends AsyncTask
{

    private final boolean mPostUpdate;
    private final boolean mUpdateStoreItems;
    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected transient doInBackground[] doInBackground(doInBackground adoinbackground[])
    {
        EReceiptManager.access$300(EReceiptManager.this).insertReceipts(EReceiptManager.access$200(EReceiptManager.this), adoinbackground);
        return adoinbackground;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((onPostExecute[])obj);
    }

    protected transient void onPostExecute(onPostExecute aonpostexecute[])
    {
        if (mUpdateStoreItems)
        {
            EReceiptManager.access$3500(EReceiptManager.this, aonpostexecute);
        }
        if (mPostUpdate)
        {
            MessageBus.getBus().post(new EReceiptsUpdatedEvent());
        }
    }

    public (boolean flag, boolean flag1)
    {
        this$0 = EReceiptManager.this;
        super();
        mPostUpdate = flag;
        mUpdateStoreItems = flag1;
    }
}
