// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptIO, EReceiptProvider

private class <init> extends AsyncTask
{

    private ForDeletion.execute mSyncJob;
    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        avoid = new EReceiptIO(EReceiptManager.access$3100(EReceiptManager.this));
        Map map = avoid.readAll();
        if (map != null && !map.isEmpty())
        {
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
            {
                Object obj = (String)iterator.next();
                List list = (List)map.get(obj);
                EReceiptManager.access$300(EReceiptManager.this).insertReceipts(((String) (obj)), (this._cls0[])list.toArray(new this._cls0[list.size()]));
                obj = list.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    doInBackground doinbackground = (this._cls0)((Iterator) (obj)).next();
                    if (doinbackground._fld0)
                    {
                        EReceiptManager.access$300(EReceiptManager.this).markForDeletion(new String[] {
                            doinbackground._fld0
                        });
                    }
                }
            }

            avoid.clearAll();
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        EReceiptManager.access$3202(EReceiptManager.this, null);
        if (mSyncJob != null)
        {
            mSyncJob.mSyncJob();
        }
        (new ForDeletion(EReceiptManager.this, null)).execute(new Void[0]);
    }


/*
    static ForDeletion access$402(ForDeletion fordeletion, ForDeletion fordeletion1)
    {
        fordeletion.mSyncJob = fordeletion1;
        return fordeletion1;
    }

*/

    private mSyncJob()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
