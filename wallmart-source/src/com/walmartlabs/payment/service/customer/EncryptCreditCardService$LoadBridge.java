// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import android.os.Handler;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

private static class <init>
{

    private final EncryptCreditCardService mEncryptService;

    public void onAlgorithm()
    {
        EncryptCreditCardService.access$1600(mEncryptService).post(new Runnable() {

            final EncryptCreditCardService.LoadBridge this$0;

            public void run()
            {
                EncryptCreditCardService.access$1900(mEncryptService);
            }

            
            {
                this$0 = EncryptCreditCardService.LoadBridge.this;
                super();
            }
        });
    }

    public void onKeys()
    {
        EncryptCreditCardService.access$1600(mEncryptService).post(new Runnable() {

            final EncryptCreditCardService.LoadBridge this$0;

            public void run()
            {
                EncryptCreditCardService.access$1800(mEncryptService);
            }

            
            {
                this$0 = EncryptCreditCardService.LoadBridge.this;
                super();
            }
        });
    }


    private _cls2.this._cls0(EncryptCreditCardService encryptcreditcardservice)
    {
        mEncryptService = encryptcreditcardservice;
    }

    mEncryptService(EncryptCreditCardService encryptcreditcardservice, mEncryptService mencryptservice)
    {
        this(encryptcreditcardservice);
    }
}
