// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.walmart.android.data.AppConfig;
import com.walmart.android.wmservice.AppConfigManager;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter

private class this._cls0 extends this._cls0
{

    final SaverManualReceiptPresenter this$0;

    protected void dismissDialog(int i)
    {
        SaverManualReceiptPresenter.access$2000(SaverManualReceiptPresenter.this, i);
    }

    protected boolean isTop()
    {
        return SaverManualReceiptPresenter.this.isTop();
    }

    protected void onNotFoundFailure()
    {
        AppConfig appconfig = AppConfigManager.get().getAppConfig();
        if (appconfig == null || !appconfig.allowSaverWithoutEReceipt)
        {
            showDialog(1002);
            String s;
            if (SaverManualReceiptPresenter.access$1600(SaverManualReceiptPresenter.this))
            {
                s = "Error Handling - Text Entry Not Recognized";
            } else
            {
                s = "Error Handling - Scan Entry Not Recognized";
            }
            trackError(s);
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("DIALOG_ARG_TC", SaverManualReceiptPresenter.access$1900(SaverManualReceiptPresenter.this).getText());
            bundle.putCharSequence("DIALOG_ARG_DATE", SaverManualReceiptPresenter.access$000(SaverManualReceiptPresenter.this).getText());
            showDialog(103, bundle);
            return;
        }
    }

    protected void onReceipt(com.walmartlabs.ereceipt.service.wDialog wdialog)
    {
        SaverManualReceiptPresenter.access$502(SaverManualReceiptPresenter.this, wdialog._fld0);
        if (wdialog._fld0 != null)
        {
            SaverManualReceiptPresenter.access$802(SaverManualReceiptPresenter.this, wdialog._fld0._fld0);
        }
    }

    protected void showDialog(int i)
    {
        SaverManualReceiptPresenter.access$2100(SaverManualReceiptPresenter.this, i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverManualReceiptPresenter.access$2200(SaverManualReceiptPresenter.this, i, bundle);
    }

    public (Handler handler)
    {
        this$0 = SaverManualReceiptPresenter.this;
        super(handler);
    }
}
