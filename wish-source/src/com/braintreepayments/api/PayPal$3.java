// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import com.paypal.android.sdk.onetouch.core.ResultType;

// Referenced classes of package com.braintreepayments.api:
//            PayPal

static class e.ResultType
{

    static final int $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[];

    static 
    {
        $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType = new int[ResultType.values().length];
        try
        {
            $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Error.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Cancel.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$paypal$android$sdk$onetouch$core$ResultType[ResultType.Success.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
