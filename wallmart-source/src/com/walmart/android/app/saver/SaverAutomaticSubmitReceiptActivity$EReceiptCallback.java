// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import com.walmart.android.data.AppConfig;
import com.walmart.android.wmservice.AppConfigManager;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverAutomaticSubmitReceiptActivity

private class this._cls0 extends this._cls0
{

    final SaverAutomaticSubmitReceiptActivity this$0;

    protected void dismissDialog(int i)
    {
        SaverAutomaticSubmitReceiptActivity.this.dismissDialog(i);
    }

    protected boolean isTop()
    {
        return SaverAutomaticSubmitReceiptActivity.access$600(SaverAutomaticSubmitReceiptActivity.this);
    }

    protected void onNotFoundFailure()
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig == null || !appconfig.allowSaverWithoutEReceipt)
        {
            showDialog(1002);
            return;
        } else
        {
            SaverAutomaticSubmitReceiptActivity.access$900(SaverAutomaticSubmitReceiptActivity.this);
            return;
        }
    }

    protected void onReceipt(com.walmartlabs.ereceipt.service.s._cls0 _pcls0)
    {
        SaverAutomaticSubmitReceiptActivity.access$102(SaverAutomaticSubmitReceiptActivity.this, _pcls0._fld0);
        if (_pcls0._fld0 != null)
        {
            SaverAutomaticSubmitReceiptActivity.access$402(SaverAutomaticSubmitReceiptActivity.this, _pcls0._fld0._fld0);
        }
    }

    protected void showDialog(int i)
    {
        SaverAutomaticSubmitReceiptActivity.this.showDialog(i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverAutomaticSubmitReceiptActivity.this.showDialog(i, bundle);
    }

    public (Handler handler)
    {
        this$0 = SaverAutomaticSubmitReceiptActivity.this;
        super(handler);
    }
}
