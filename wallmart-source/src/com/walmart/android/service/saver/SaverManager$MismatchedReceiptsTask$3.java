// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmart.android.service.AsyncCallbackOnThread;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager, SaverReceipt

class val.callback
    implements val.callback
{

    final onResult this$1;
    final AsyncCallbackOnThread val$callback;
    final SaverReceipt val$receipt;

    public void onResult(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            SaverManager.access$900(_fld0, val$receipt, val$receipt.localDate, "existing", false, val$receipt.submitConfirmed, val$callback);
            return;
        } else
        {
            val$callback.onFailure(Integer.valueOf(1), null);
            return;
        }
    }

    public volatile void onResult(Object obj)
    {
        onResult((Boolean)obj);
    }

    ()
    {
        this$1 = final_;
        val$receipt = saverreceipt;
        val$callback = AsyncCallbackOnThread.this;
        super();
    }
}
