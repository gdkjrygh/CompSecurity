// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.database.Cursor;
import android.os.AsyncTask;
import com.walmartlabs.ereceipt.service.EReceiptsContractUtil;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverProvider, SaverReceipt, SaverContractUtil

class sultCallback extends AsyncTask
{

    final SaverManager this$0;
    final sultCallback val$callback;

    protected transient SaverReceipt doInBackground(String as[])
    {
        SaverReceipt saverreceipt;
        Cursor cursor;
        cursor = null;
        Object obj = null;
        saverreceipt = cursor;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        saverreceipt = cursor;
        if (as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        cursor = SaverManager.access$600(SaverManager.this).getReceipt(as[0], as[1]);
        as = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        as = obj;
        if (cursor.moveToFirst())
        {
            as = SaverContractUtil.populateSaverReceipt(cursor, (SaverReceipt)EReceiptsContractUtil.populateEReceipt(cursor, new SaverReceipt()));
        }
        saverreceipt = as;
        if (cursor != null)
        {
            cursor.close();
            saverreceipt = as;
        }
        return saverreceipt;
        as;
        if (cursor != null)
        {
            cursor.close();
        }
        throw as;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(SaverReceipt saverreceipt)
    {
        val$callback.onResult(saverreceipt);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((SaverReceipt)obj);
    }

    sultCallback()
    {
        this$0 = final_savermanager;
        val$callback = sultCallback.this;
        super();
    }
}
