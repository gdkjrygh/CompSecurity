// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

class this._cls0
    implements Runnable
{

    final EncryptCreditCardService this$0;

    public void run()
    {
        WLog.e(EncryptCreditCardService.access$000(), (new StringBuilder()).append("Javascript loading timeout, current state:").append(EncryptCreditCardService.access$100(EncryptCreditCardService.this)).toString());
        EncryptCreditCardService.access$200(EncryptCreditCardService.this, com.walmartlabs.kangaroo.itCardService);
        destroy();
        EncryptCreditCardService.access$102(EncryptCreditCardService.this, ate.IDLE);
        EncryptCreditCardService.access$300(EncryptCreditCardService.this);
    }

    ate()
    {
        this$0 = EncryptCreditCardService.this;
        super();
    }
}
