// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class val.iterator extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;
    final Iterator val$iterator;

    public void onFailureSameThread(Integer integer, val.iterator iterator1)
    {
        WLog.w(EReceiptManager.access$600(), "Failed to associate ereceipt.");
        onSuccessSameThread(((onSuccessSameThread) (null)));
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (onFailureSameThread)obj1);
    }

    public void onSuccessSameThread(onFailureSameThread onfailuresamethread)
    {
        if (onfailuresamethread != null)
        {
            (new sk(_fld0, null)).execute(new sk.execute[] {
                onfailuresamethread
            });
        }
        if (val$iterator.hasNext())
        {
            cess._mth2700(this._cls1.this, val$iterator);
            return;
        } else
        {
            cess._mth2800(this._cls1.this);
            return;
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((onSuccessSameThread)obj);
    }

    sk(Iterator iterator1)
    {
        this$1 = final_sk;
        val$iterator = iterator1;
        super(Handler.this);
    }
}
