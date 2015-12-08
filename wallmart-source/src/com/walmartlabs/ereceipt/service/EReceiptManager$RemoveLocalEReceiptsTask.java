// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptsResponse, EReceiptProvider

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    protected transient EReceiptsResponse doInBackground(EReceiptsResponse aereceiptsresponse[])
    {
        aereceiptsresponse = aereceiptsresponse[0];
        EReceiptManager.access$300(EReceiptManager.this).delete(((EReceiptsResponse) (aereceiptsresponse)).deleteReceipts);
        return aereceiptsresponse;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((EReceiptsResponse[])aobj);
    }

    protected void onPostExecute(EReceiptsResponse ereceiptsresponse)
    {
        doInBackground(EReceiptManager.access$3600(EReceiptManager.this), ereceiptsresponse);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((EReceiptsResponse)obj);
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
