// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmartlabs.payment.controller.mpay.MobilePayController;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;

// Referenced classes of package com.walmart.android.fragments:
//            MobilePayFragment

class this._cls0
    implements com.walmartlabs.payment.service.mpay.rInfoInterface
{

    final MobilePayFragment this$0;

    public void onGetUserInfo(boolean flag)
    {
        if (flag)
        {
            MobilePayPinController.launchPin(MobilePayFragment.this, 2);
            return;
        } else
        {
            MobilePayController.startSetup(MobilePayFragment.this, 3);
            return;
        }
    }

    ontroller()
    {
        this$0 = MobilePayFragment.this;
        super();
    }
}
