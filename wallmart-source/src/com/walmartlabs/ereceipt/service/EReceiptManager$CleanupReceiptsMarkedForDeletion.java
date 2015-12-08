// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import android.os.AsyncTask;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider, EReceipt, EReceiptsContractUtil

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient HashMap doInBackground(Void avoid[])
    {
        Cursor cursor;
        HashMap hashmap;
        WLog.d(EReceiptManager.access$600(), "CleanupReceiptsMarkedForDeletion");
        cursor = EReceiptManager.access$300(EReceiptManager.this).getReceiptsMarkedForDeletion();
        hashmap = new HashMap();
_L2:
        if (cursor == null)
        {
            break; /* Loop/switch isn't completed */
        }
        List list;
        EReceipt ereceipt;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ereceipt = EReceiptsContractUtil.populateEReceipt(cursor, new EReceipt());
        list = (List)hashmap.get(ereceipt.customerId);
        avoid = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        avoid = new ArrayList();
        hashmap.put(ereceipt.customerId, avoid);
        avoid.add(ereceipt);
        if (true) goto _L2; else goto _L1
        avoid;
        if (cursor != null)
        {
            cursor.close();
        }
        throw avoid;
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
        return hashmap;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((HashMap)obj);
    }

    protected void onPostExecute(HashMap hashmap)
    {
        List list;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); EReceiptManager.access$3000(EReceiptManager.this, (EReceipt[])list.toArray(new EReceipt[list.size()])))
        {
            String s = (String)iterator.next();
            list = (List)hashmap.get(s);
            WLog.d(EReceiptManager.access$600(), String.format("need to delete %d receipts for customer %s", new Object[] {
                Integer.valueOf(list.size()), s
            }));
        }

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
