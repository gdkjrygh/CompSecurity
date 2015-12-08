// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Bundle;
import android.os.Handler;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.service.saver.StatusResponse;
import com.walmartlabs.ereceipt.service.EReceipt;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter

private class mIsLastInList extends mIsLastInList
{

    private final boolean mIsLastInList;
    private final boolean mIsList;
    private final EReceipt mReceipt;
    final SaverReceiptListPresenter this$0;

    protected void dismissDialog(int i)
    {
        SaverReceiptListPresenter.access$2000(SaverReceiptListPresenter.this, i);
    }

    protected boolean isEReceipt()
    {
        return true;
    }

    protected boolean isTop()
    {
        return SaverReceiptListPresenter.this.isTop();
    }

    public void onFailureSameThread(Integer integer, StatusResponse statusresponse)
    {
        super.reSameThread(integer, statusresponse);
        SaverReceiptListPresenter.access$1800(SaverReceiptListPresenter.this);
        if (isTop())
        {
            SaverReceiptListPresenter.access$1000(SaverReceiptListPresenter.this, false, false);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StatusResponse)obj1);
    }

    public void onSuccessSameThread(StatusResponse statusresponse)
    {
label0:
        {
label1:
            {
                if (isTop())
                {
                    dismissDialog(1001);
                    if (mReceipt.store != null)
                    {
                        statusresponse = mReceipt.store.ceipt;
                    } else
                    {
                        statusresponse = null;
                    }
                    if (!mIsList)
                    {
                        break label0;
                    }
                    if (mIsLastInList)
                    {
                        break label1;
                    }
                    SaverReceiptListPresenter.access$1200(SaverReceiptListPresenter.this);
                }
                return;
            }
            SaverManager.get().syncAll(false);
            SaverReceiptListPresenter.access$1900(SaverReceiptListPresenter.this);
            return;
        }
        SaverReceiptListPresenter.access$1000(SaverReceiptListPresenter.this, false, false);
        SaverReceiptListPresenter.access$400(SaverReceiptListPresenter.this).onShowCompetitors(SaverReceiptListPresenter.this, mReceipt.uuid, mReceipt.tcNumber, mReceipt.localDate, statusresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StatusResponse)obj);
    }

    protected void showDialog(int i)
    {
        Bundle bundle = new Bundle();
        if (!mIsList && !mIsLastInList)
        {
            bundle.putString("DIALOG_ARG_TC_NUMBER", mReceipt.tcNumber);
        }
        SaverReceiptListPresenter.access$2100(SaverReceiptListPresenter.this, i, bundle);
    }

    protected void showDialog(int i, Bundle bundle)
    {
        if (!mIsList && !mIsLastInList)
        {
            bundle.putString("DIALOG_ARG_TC_NUMBER", mReceipt.tcNumber);
        }
        SaverReceiptListPresenter.access$2200(SaverReceiptListPresenter.this, i, bundle);
    }

    public s(Handler handler, EReceipt ereceipt, boolean flag, boolean flag1)
    {
        this$0 = SaverReceiptListPresenter.this;
        super(handler);
        mReceipt = ereceipt;
        mIsList = flag;
        mIsLastInList = flag1;
    }
}
