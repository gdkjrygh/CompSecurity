// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import android.os.AsyncTask;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider

class sultCallback extends AsyncTask
{

    final EReceiptManager this$0;
    final sultCallback val$callback;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient String doInBackground(String as[])
    {
        String s;
        Cursor cursor;
        cursor = null;
        Object obj = null;
        s = cursor;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = cursor;
        if (as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        cursor = EReceiptManager.access$300(EReceiptManager.this).getReceiptImage(as[0]);
        as = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        as = obj;
        if (cursor.moveToNext())
        {
            as = cursor.getString(0);
        }
        s = as;
        if (cursor != null)
        {
            cursor.close();
            s = as;
        }
        return s;
        as;
        if (cursor != null)
        {
            cursor.close();
        }
        throw as;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        val$callback.onResult(s);
    }

    sultCallback()
    {
        this$0 = final_ereceiptmanager;
        val$callback = sultCallback.this;
        super();
    }
}
