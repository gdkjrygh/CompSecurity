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

private class <init> extends AsyncTask
{

    private final mCallback mCallback;
    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        as = as[0];
        if (as != null)
        {
            EReceiptManager.access$300(EReceiptManager.this).deleteAll(as);
        } else
        {
            EReceiptManager.access$300(EReceiptManager.this).clearAll();
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        MessageBus.getBus().post(new EReceiptsUpdatedEvent());
        if (mCallback != null)
        {
            mCallback.mCallback(Boolean.valueOf(true));
        }
    }

    private ( )
    {
        this$0 = EReceiptManager.this;
        super();
        mCallback = ;
    }

    mCallback(mCallback mcallback, mCallback mcallback1)
    {
        this(mcallback);
    }
}
