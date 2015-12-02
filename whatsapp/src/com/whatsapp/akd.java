// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ServiceConnection;
import com.android.vending.billing.IInAppBillingService;

// Referenced classes of package com.whatsapp:
//            dc

class akd
{

    public IInAppBillingService a;
    final dc b;
    public ServiceConnection c;

    public akd(dc dc, IInAppBillingService iinappbillingservice, ServiceConnection serviceconnection)
    {
        b = dc;
        super();
        a = iinappbillingservice;
        c = serviceconnection;
    }
}
