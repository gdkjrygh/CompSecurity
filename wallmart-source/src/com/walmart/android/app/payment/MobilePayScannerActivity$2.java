// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.payment;

import android.view.MenuItem;
import com.walmartlabs.payment.controller.mpay.MobilePayController;
import com.walmartlabs.payment.controller.settings.MobilePaySettingsActivity;

// Referenced classes of package com.walmart.android.app.payment:
//            MobilePayScannerActivity

class this._cls0
    implements android.support.v7.widget.ener
{

    final MobilePayScannerActivity this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f100696)
        {
            MobilePaySettingsActivity.show(MobilePayScannerActivity.this, 100);
            return true;
        }
        if (menuitem.getItemId() == 0x7f100697)
        {
            MobilePayController.startMoreInfo(MobilePayScannerActivity.this);
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = MobilePayScannerActivity.this;
        super();
    }
}
