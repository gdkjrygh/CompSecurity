// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider, EReceipt, EReceiptsContractUtil

private class mSyncJob extends AsyncTask
{

    private final mSyncJob mSyncJob;
    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient List doInBackground(String as[])
    {
        Object obj;
        obj = new ArrayList();
        as = EReceiptManager.access$300(EReceiptManager.this).getAllReceipts(as[0]);
_L2:
        if (as == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!as.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ((List) (obj)).add(EReceiptsContractUtil.populateEReceipt(as, new EReceipt()));
        if (true) goto _L2; else goto _L1
        obj;
        if (as != null)
        {
            as.close();
        }
        throw obj;
_L1:
        if (as != null)
        {
            as.close();
        }
        return ((List) (obj));
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        onPostExecute(mSyncJob, list.iterator());
    }

    public ( )
    {
        this$0 = EReceiptManager.this;
        super();
        mSyncJob = ;
    }
}
