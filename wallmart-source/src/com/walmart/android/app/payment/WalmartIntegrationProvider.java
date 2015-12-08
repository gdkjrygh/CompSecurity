// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.content.Context;
import com.walmartlabs.payment.integration.AppIntegration;
import com.walmartlabs.payment.integration.IntegrationProvider;

// Referenced classes of package com.walmart.android.app.payment:
//            WalmartAppIntegration

public class WalmartIntegrationProvider
    implements IntegrationProvider
{

    public WalmartIntegrationProvider()
    {
    }

    public AppIntegration getIntegration(Context context)
    {
        return new WalmartAppIntegration();
    }
}
