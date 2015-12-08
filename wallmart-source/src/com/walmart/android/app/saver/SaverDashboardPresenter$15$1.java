// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls1
    implements android.content.er
{

    final nCallbacks.launchWalmartPay this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SaverDashboardPresenter.access$400(_fld0).launchWalmartPay();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverDashboardPresenter$15

/* anonymous class */
    class SaverDashboardPresenter._cls15
        implements com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface
    {

        final SaverDashboardPresenter this$0;

        public void onGetUserInfo(boolean flag)
        {
            if (!flag && isTop())
            {
                com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this));
                builder.setView(ViewUtil.inflate(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this), 0x7f0400ae, SaverDashboardPresenter.access$700(SaverDashboardPresenter.this), false)).setNeutralButton(0x7f0901ff, new SaverDashboardPresenter._cls15._cls1());
                SaverDashboardPresenter.access$1200(SaverDashboardPresenter.this, builder.create());
                MobilePayPreferences.setAnnouncedInSaver(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this), true);
            }
        }

            
            {
                this$0 = SaverDashboardPresenter.this;
                super();
            }
    }

}
