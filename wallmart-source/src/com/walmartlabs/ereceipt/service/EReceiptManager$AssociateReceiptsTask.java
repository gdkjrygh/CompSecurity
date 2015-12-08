// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.ereceipt.EReceiptsUpdatedEvent;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceipt, EReceiptService, EReceiptProvider, 
//            EReceiptsContractUtil

private class <init> extends AsyncTask
{

    final EReceiptManager this$0;

    private void associateNext(Iterator iterator)
    {
        EReceipt ereceipt = (EReceipt)iterator.next();
        EReceiptManager.access$2900(EReceiptManager.this).getReceipt(EReceiptManager.access$2400(EReceiptManager.this), ereceipt.uuid, EReceiptManager.access$2500(EReceiptManager.this), new AsyncCallbackOnThread(iterator) {

            final EReceiptManager.AssociateReceiptsTask this$1;
            final Iterator val$iterator;

            public void onFailureSameThread(Integer integer, EReceiptsResponse.Receipt receipt)
            {
                WLog.w(EReceiptManager.access$600(), "Failed to associate ereceipt.");
                onSuccessSameThread(((EReceiptsResponse.Receipt) (null)));
            }

            public volatile void onFailureSameThread(Object obj, Object obj1)
            {
                onFailureSameThread((Integer)obj, (EReceiptsResponse.Receipt)obj1);
            }

            public void onSuccessSameThread(EReceiptsResponse.Receipt receipt)
            {
                if (receipt != null)
                {
                    (new EReceiptManager.AssociateLocalEReceiptTask(this$0, null)).execute(new EReceiptsResponse.Receipt[] {
                        receipt
                    });
                }
                if (iterator.hasNext())
                {
                    associateNext(iterator);
                    return;
                } else
                {
                    postUpdate();
                    return;
                }
            }

            public volatile void onSuccessSameThread(Object obj)
            {
                onSuccessSameThread((EReceiptsResponse.Receipt)obj);
            }

            
            {
                this$1 = EReceiptManager.AssociateReceiptsTask.this;
                iterator = iterator1;
                super(final_handler);
            }
        });
    }

    private void postUpdate()
    {
        MessageBus.getBus().post(new EReceiptsUpdatedEvent());
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Iterator doInBackground(String as[])
    {
        Object obj;
        obj = new ArrayList();
        as = EReceiptManager.access$300(EReceiptManager.this).getAllReceipts(null);
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
        return ((List) (obj)).iterator();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Iterator)obj);
    }

    protected void onPostExecute(Iterator iterator)
    {
        if (iterator.hasNext())
        {
            associateNext(iterator);
            return;
        } else
        {
            postUpdate();
            return;
        }
    }



    private _cls1.val.iterator()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
