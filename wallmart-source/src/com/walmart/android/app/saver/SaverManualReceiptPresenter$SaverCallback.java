// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.walmart.android.service.saver.StatusResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverManualReceiptPresenter, SaverNotificationUtils

private class this._cls0 extends this._cls0
{

    final SaverManualReceiptPresenter this$0;

    protected void dismissDialog(int i)
    {
        SaverManualReceiptPresenter.access$2300(SaverManualReceiptPresenter.this, i);
    }

    protected boolean isEReceipt()
    {
        return SaverManualReceiptPresenter.access$500(SaverManualReceiptPresenter.this) != null;
    }

    protected boolean isTop()
    {
        return SaverManualReceiptPresenter.this.isTop();
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        Toast.makeText(SaverManualReceiptPresenter.access$100(SaverManualReceiptPresenter.this), 0x7f090537, 0).show();
        if (isTop())
        {
            dismissDialog(1001);
            SaverManualReceiptPresenter.access$300(SaverManualReceiptPresenter.this).onShowCompetitors(SaverManualReceiptPresenter.access$500(SaverManualReceiptPresenter.this), SaverManualReceiptPresenter.access$600(SaverManualReceiptPresenter.this), SaverNotificationUtils.getLocalDate(SaverManualReceiptPresenter.access$700(SaverManualReceiptPresenter.this)), SaverManualReceiptPresenter.access$800(SaverManualReceiptPresenter.this), true);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    protected void showDialog(int i)
    {
        SaverManualReceiptPresenter.access$2400(SaverManualReceiptPresenter.this, i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverManualReceiptPresenter.access$2500(SaverManualReceiptPresenter.this, i, bundle);
    }

    public s(Handler handler)
    {
        this$0 = SaverManualReceiptPresenter.this;
        super(handler);
    }
}
