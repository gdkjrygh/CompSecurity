// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.service.saver:
//            SaverManager

class this._cls1
    implements com.walmartlabs.ereceipt.service.r
{

    final is._cls0 this$1;

    public void onDeletedReceipts(int ai[])
    {
    }

    public void onNewReceipts(EReceipt aereceipt[])
    {
    }

    public void onSyncFinished(Integer integer)
    {
        if (SaverManager.access$1400(_fld0) != null && !Cancelled())
        {
            iptsTask.access._mth1500(SaverManager.access$1400(_fld0), integer);
        }
    }

    iptsTask()
    {
        this$1 = this._cls1.this;
        super();
    }
}
