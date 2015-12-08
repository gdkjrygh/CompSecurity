// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.walmart.android.service.saver.StatusResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverAutomaticSubmitReceiptActivity

private class this._cls0 extends this._cls0
{

    final SaverAutomaticSubmitReceiptActivity this$0;

    protected void dismissDialog(int i)
    {
        SaverAutomaticSubmitReceiptActivity.this.dismissDialog(i);
    }

    protected boolean isEReceipt()
    {
        return SaverAutomaticSubmitReceiptActivity.access$100(SaverAutomaticSubmitReceiptActivity.this) != null;
    }

    protected boolean isTop()
    {
        return SaverAutomaticSubmitReceiptActivity.access$600(SaverAutomaticSubmitReceiptActivity.this);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        Toast.makeText(SaverAutomaticSubmitReceiptActivity.this, 0x7f090537, 0).show();
        if (isTop())
        {
            dismissDialog(1001);
            onShowCompetitors(SaverAutomaticSubmitReceiptActivity.access$100(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$200(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$300(SaverAutomaticSubmitReceiptActivity.this), SaverAutomaticSubmitReceiptActivity.access$400(SaverAutomaticSubmitReceiptActivity.this), false);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
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
