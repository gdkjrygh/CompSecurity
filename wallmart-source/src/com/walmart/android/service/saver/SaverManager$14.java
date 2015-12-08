// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.os.AsyncTask;
import android.util.Pair;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverReceipt, SaverProvider

class this._cls0 extends AsyncTask
{

    final SaverManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((SaverReceipt[])aobj);
    }

    protected transient Void doInBackground(SaverReceipt asaverreceipt[])
    {
        asaverreceipt = asaverreceipt[0];
        if (verState.isProcessed(((SaverReceipt) (asaverreceipt)).state))
        {
            SaverManager.access$600(SaverManager.this).updateSeenReceipt(true, new Pair[] {
                new Pair(((SaverReceipt) (asaverreceipt)).tcNumber, ((SaverReceipt) (asaverreceipt)).localDate)
            });
        }
        return null;
    }

    verState()
    {
        this$0 = SaverManager.this;
        super();
    }
}
