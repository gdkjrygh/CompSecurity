// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.SharedPreferences;
import com.squareup.otto.Bus;
import com.walmart.android.events.ShippingPassStatusEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.shippingpass.ShippingPassStatus;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            Authentication

class it> extends CallbackSameThread
{

    final Authentication this$0;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        if (result.successful() && result.hasData())
        {
            boolean flag = Authentication.access$1300(Authentication.this).getBoolean("shippingpass_eligible", false);
            Authentication.access$1300(Authentication.this).edit().putBoolean("shippingpass_eligible", ((ShippingPassStatus)result.getData()).isEligible()).apply();
            if (flag != ((ShippingPassStatus)result.getData()).isEligible())
            {
                WLog.d(Authentication.TAG, "setUserInformation(): ShippingPass eligibility changed, sending event");
                MessageBus.getBus().post(new ShippingPassStatusEvent());
            }
        }
    }

    ent()
    {
        this$0 = Authentication.this;
        super();
    }
}
