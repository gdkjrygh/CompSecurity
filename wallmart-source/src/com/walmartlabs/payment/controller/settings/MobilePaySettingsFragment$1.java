// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.settings;

import android.view.View;
import com.walmartlabs.payment.controller.pin.MobilePayPinController;
import com.walmartlabs.payment.view.OnSingleClickListener;

// Referenced classes of package com.walmartlabs.payment.controller.settings:
//            MobilePaySettingsFragment

class this._cls0 extends OnSingleClickListener
{

    final MobilePaySettingsFragment this$0;

    public void onSingleClick(View view)
    {
        MobilePayPinController.launchPin(getActivity(), true);
    }

    ()
    {
        this$0 = MobilePaySettingsFragment.this;
        super();
    }
}
