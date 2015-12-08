// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmartlabs.ereceipt.service.GcmRegistration;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice:
//            Services

class this._cls0
    implements GcmRegistration
{

    final this._cls0 this$0;

    public String getGcmRegistrationId()
    {
        String s;
        try
        {
            s = UAirship.shared().getPushManager().getGcmId();
        }
        catch (Exception exception)
        {
            WLog.e("ServicesImpl", "Failed to get gcm id", exception);
            return "";
        }
        return s;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
