// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import android.os.Handler;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

private static class <init>
{

    private final EncryptCreditCardService mEncryptService;

    public void onError(String s)
    {
        WLog.e(EncryptCreditCardService.access$000(), "Encryption algorithm did not return the expected result format");
        EncryptCreditCardService.access$1600(mEncryptService).post(new Runnable() {

            final EncryptCreditCardService.EncryptBridge this$0;

            public void run()
            {
                EncryptCreditCardService.access$200(mEncryptService, com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE);
            }

            
            {
                this$0 = EncryptCreditCardService.EncryptBridge.this;
                super();
            }
        });
    }

    public void onResult(final String encryptedCC, final String encryptedCvv, final String integrityCheck, final String keyId, final String phase, final String uuid)
    {
        EncryptCreditCardService.access$1600(mEncryptService).post(new Runnable() {

            final EncryptCreditCardService.EncryptBridge this$0;
            final String val$encryptedCC;
            final String val$encryptedCvv;
            final String val$integrityCheck;
            final String val$keyId;
            final String val$phase;
            final String val$uuid;

            public void run()
            {
                EncryptCreditCardService.access$1300(mEncryptService, encryptedCC, encryptedCvv, integrityCheck, keyId, phase, uuid);
            }

            
            {
                this$0 = EncryptCreditCardService.EncryptBridge.this;
                encryptedCC = s;
                encryptedCvv = s1;
                integrityCheck = s2;
                keyId = s3;
                phase = s4;
                uuid = s5;
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
