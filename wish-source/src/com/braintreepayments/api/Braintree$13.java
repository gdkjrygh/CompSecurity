// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;


// Referenced classes of package com.braintreepayments.api:
//            Braintree, BraintreeApi

class val.integrationType
    implements Runnable
{

    final Braintree this$0;
    final String val$event;
    final String val$integrationType;

    public void run()
    {
        Braintree.access$300(Braintree.this).sendAnalyticsEvent(val$event, val$integrationType);
    }

    ()
    {
        this$0 = final_braintree;
        val$event = s;
        val$integrationType = String.this;
        super();
    }
}
