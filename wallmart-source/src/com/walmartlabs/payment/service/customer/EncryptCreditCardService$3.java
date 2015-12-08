// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;


// Referenced classes of package com.walmartlabs.payment.service.customer:
//            EncryptCreditCardService

static class ate
{

    static final int $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[];

    static 
    {
        $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State = new int[ate.values().length];
        try
        {
            $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[ate.IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[ate.PAGE_LOADED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[ate.READY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$walmartlabs$payment$service$customer$EncryptCreditCardService$State[ate.DONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
