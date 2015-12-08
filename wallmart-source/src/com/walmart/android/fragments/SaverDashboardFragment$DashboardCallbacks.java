// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.Intent;
import com.squareup.otto.Bus;
import com.walmart.android.app.saver.SaverFAQPresenter;
import com.walmart.android.app.saver.SaverReceiptActivity;
import com.walmart.android.app.saver.SaverRedeemActivity;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.fragments:
//            SaverDashboardFragment

protected class this._cls0
    implements com.walmart.android.app.saver.this._cls0
{

    final SaverDashboardFragment this$0;

    public void launchFaq()
    {
        SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity());
        SaverDashboardFragment.access$000(SaverDashboardFragment.this).pushPresenter(saverfaqpresenter, true);
    }

    public void launchReceipts()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptActivity);
        intent.addFlags(0x20000);
        startActivity(intent);
    }

    public void launchReward()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverRedeemActivity);
        startActivity(intent);
    }

    public void launchWalmartPay()
    {
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.ks));
    }

    public void submitUnconfirmedReceipts()
    {
        Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptActivity);
        intent.addFlags(0x20000);
        intent.putExtra("SUBMIT_NOW", true);
        startActivity(intent);
    }

    protected ()
    {
        this$0 = SaverDashboardFragment.this;
        super();
    }
}
