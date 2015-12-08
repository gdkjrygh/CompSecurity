// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.SaverReceipt;
import com.walmart.android.service.saver.StatusResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptDetailsPresenter

private class mReceipt extends mReceipt
{

    private final SaverReceipt mReceipt;
    final SaverReceiptDetailsPresenter this$0;

    protected void dismissDialog(int i)
    {
        SaverReceiptDetailsPresenter.this.dismissDialog(i);
    }

    protected boolean isEReceipt()
    {
        return true;
    }

    protected boolean isTop()
    {
        return SaverReceiptDetailsPresenter.this.isTop();
    }

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
        super.ameThread(integer, statusresponse);
        if (isTop())
        {
            SaverReceiptDetailsPresenter.access$600(SaverReceiptDetailsPresenter.this);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
        if (isTop())
        {
            if (SaverReceiptDetailsPresenter.access$1700(SaverReceiptDetailsPresenter.this) != null && (SaverReceiptDetailsPresenter.access$1700(SaverReceiptDetailsPresenter.this).equals(mReceipt.uuid) || SaverReceiptDetailsPresenter.access$1700(SaverReceiptDetailsPresenter.this).equals(mReceipt.tcNumber)))
            {
                if (mReceipt.store != null)
                {
                    statusresponse = mReceipt.store.ceipt;
                } else
                {
                    statusresponse = null;
                }
                SaverReceiptDetailsPresenter.access$400(SaverReceiptDetailsPresenter.this).onShowCompetitors(mReceipt.uuid, mReceipt.tcNumber, mReceipt.localDate, statusresponse);
            } else
            {
                SaverManager.get().syncAll(false);
                SaverReceiptDetailsPresenter.access$600(SaverReceiptDetailsPresenter.this);
            }
            dismissDialog(1001);
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    protected void showDialog(int i)
    {
        SaverReceiptDetailsPresenter.access$2900(SaverReceiptDetailsPresenter.this, i);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        SaverReceiptDetailsPresenter.access$3000(SaverReceiptDetailsPresenter.this, i, bundle);
    }

    public s(Handler handler, SaverReceipt saverreceipt)
    {
        this$0 = SaverReceiptDetailsPresenter.this;
        super(handler);
        mReceipt = saverreceipt;
    }
}
