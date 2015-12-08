// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager

private class <init>
    implements Runnable
{

    private long mDelayMillis;
    final EReceiptManager this$0;

    private void setDelayMillis(long l)
    {
        mDelayMillis = l;
    }

    public void run()
    {
        walletRegisteredStatus(new EReceiptManager.RegisteredPhoneNumberCallback() {

            final EReceiptManager.RegistrationRunnable this$1;

            public void onResult(EReceiptManager.RegisteredPhoneNumberResult registeredphonenumberresult)
            {
                if (registeredphonenumberresult == EReceiptManager.RegisteredPhoneNumberResult.UNKNOWN)
                {
                    long l1 = mDelayMillis;
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
                    EReceiptManager.access$2300(this$0, l1);
                }
            }

            
            {
                this$1 = EReceiptManager.RegistrationRunnable.this;
                super();
            }
        });
    }



    private _cls1.this._cls1()
    {
        this$0 = EReceiptManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
