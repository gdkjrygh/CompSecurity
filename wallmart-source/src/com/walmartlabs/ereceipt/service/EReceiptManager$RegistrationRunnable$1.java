// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

class this._cls1
    implements llback
{

    final is._cls0 this$1;

    public void onResult(sult sult)
    {
        if (sult == sult.UNKNOWN)
        {
            long l1 = cess._mth2200(this._cls1.this);
            long l = l1;
            if (l1 > 0L)
            {
                l = l1;
                if (l1 < 0x3a9800L)
                {
                    l = l1 * 2L;
                }
            }
            l1 = l;
            if (l <= 0L)
            {
                l1 = 60000L;
            }
            WLog.d(EReceiptManager.access$600(), (new StringBuilder()).append("walletRegisteredStatus failed. Will try again in ").append(l1).append(" ms.").toString());
            EReceiptManager.access$2300(_fld0, l1);
        }
    }

    sult()
    {
        this$1 = this._cls1.this;
        super();
    }
}
