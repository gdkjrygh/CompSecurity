// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls0
    implements com.walmartlabs.payment.service.mpay.terface
{

    final SaverDashboardPresenter this$0;

    public void onGetUserInfo(boolean flag)
    {
        if (!flag && isTop())
        {
            com.walmart.android.ui.dialog.rInfoInterface rinfointerface = new com.walmart.android.ui.dialog.op(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this));
            rinfointerface.(ViewUtil.inflate(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this), 0x7f0400ae, SaverDashboardPresenter.access$700(SaverDashboardPresenter.this), false)).ralButton(0x7f0901ff, new android.content.DialogInterface.OnClickListener() {

                final SaverDashboardPresenter._cls15 this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    SaverDashboardPresenter.access$400(this$0).launchWalmartPay();
                }

            
            {
                this$1 = SaverDashboardPresenter._cls15.this;
                super();
            }
            });
            SaverDashboardPresenter.access$1200(SaverDashboardPresenter.this, rinfointerface._mth0());
            MobilePayPreferences.setAnnouncedInSaver(SaverDashboardPresenter.access$1100(SaverDashboardPresenter.this), true);
        }
    }

    _cls1.this._cls1()
    {
        this$0 = SaverDashboardPresenter.this;
        super();
    }
}
