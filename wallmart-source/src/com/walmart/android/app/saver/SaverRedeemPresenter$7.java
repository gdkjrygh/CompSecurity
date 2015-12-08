// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.RedeemResponse;
import com.walmart.android.util.TextUtils;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemPresenter

class it> extends AsyncCallbackOnThread
{

    final SaverRedeemPresenter this$0;

    public void onFailureSameThread(Integer integer, RedeemResponse redeemresponse)
    {
        SaverRedeemPresenter.access$600(SaverRedeemPresenter.this, 1);
        SaverRedeemPresenter.access$700(SaverRedeemPresenter.this, 2);
        clearSingleClickFlag();
        integer = (new com.walmartlabs.anivia.er("pageView")).putString("name", "Not able to redeem funds").putString("section", "Saver").putString("subCategory", "Error");
        MessageBus.getBus().post(integer);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (RedeemResponse)obj1);
    }

    public void onSuccessSameThread(RedeemResponse redeemresponse)
    {
        SaverRedeemPresenter.access$800(SaverRedeemPresenter.this, 1);
        Object obj = SaverRedeemPresenter.access$500(SaverRedeemPresenter.this);
        int j = redeemresponse.redeemedTotalCents;
        boolean flag = redeemresponse.giftCardCreated;
        int i;
        if (SaverRedeemPresenter.access$900(SaverRedeemPresenter.this) != null)
        {
            i = SaverRedeemPresenter.access$900(SaverRedeemPresenter.this).redeemedCents;
        } else
        {
            i = -1;
        }
        ((tionCallbacks) (obj)).onRedeemed(j, flag, i, false);
        obj = (new com.walmartlabs.anivia.er("successGiftCardTransfer")).putString("amount", TextUtils.getFormattedAmount(redeemresponse.redeemedTotalCents));
        MessageBus.getBus().post(obj);
        if (redeemresponse.giftCardCreated)
        {
            MessageBus.getBus().post(new com.walmartlabs.anivia.er("eGiftCardCreation"));
        }
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
