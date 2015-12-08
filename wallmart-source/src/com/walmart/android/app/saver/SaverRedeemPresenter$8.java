// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.saver.RedeemResponse;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemPresenter

class it> extends AsyncCallbackOnThread
{

    final SaverRedeemPresenter this$0;

    public void onFailureSameThread(Integer integer, RedeemResponse redeemresponse)
    {
        SaverRedeemPresenter.access$1000(SaverRedeemPresenter.this, 1);
        SaverRedeemPresenter.access$1100(SaverRedeemPresenter.this, 2);
        clearSingleClickFlag();
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (RedeemResponse)obj1);
    }

    public void onSuccessSameThread(RedeemResponse redeemresponse)
    {
        SaverRedeemPresenter.access$1200(SaverRedeemPresenter.this, 1);
        tionCallbacks tioncallbacks = SaverRedeemPresenter.access$500(SaverRedeemPresenter.this);
        int j = redeemresponse.redeemedTotalCents;
        int i;
        if (SaverRedeemPresenter.access$900(SaverRedeemPresenter.this) != null)
        {
            i = SaverRedeemPresenter.access$900(SaverRedeemPresenter.this).redeemedCents;
        } else
        {
            i = -1;
        }
        tioncallbacks.onRedeemed(j, false, i, true);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((RedeemResponse)obj);
    }

    tionCallbacks(Handler handler)
    {
        this$0 = SaverRedeemPresenter.this;
        super(handler);
    }
}
