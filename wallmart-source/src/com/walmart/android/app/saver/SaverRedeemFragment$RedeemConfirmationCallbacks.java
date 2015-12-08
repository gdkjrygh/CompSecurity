// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.app.FragmentActivity;
import com.squareup.otto.Bus;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemFragment, SaverFAQPresenter, SaverRewardPresenter

private class mSuppressReward
    implements 
{

    private final boolean mSuppressReward;
    final SaverRedeemFragment this$0;

    public void launchPayment()
    {
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.ks));
        getActivity().finish();
    }

    public void launchWalmartPay()
    {
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.ks));
        getActivity().finish();
    }

    public void onCorrectEmail()
    {
        SaverFAQPresenter saverfaqpresenter;
label0:
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                saverfaqpresenter = new SaverFAQPresenter(getActivity(), "faq", "updateEmail");
                if (!mSuppressReward)
                {
                    break label0;
                }
                SaverRedeemFragment.access$1000(SaverRedeemFragment.this).popToRoot();
                SaverRedeemFragment.access$1100(SaverRedeemFragment.this).pushPresenter(saverfaqpresenter, true);
            }
            return;
        }
        SaverRedeemFragment.access$1200(SaverRedeemFragment.this).pushAndReplacePresenter(saverfaqpresenter, true);
    }

    public void onShowMerchandise(String s)
    {
        SaverRedeemFragment.access$1300(SaverRedeemFragment.this, s);
    }

    public void onViewReward()
    {
label0:
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                if (!mSuppressReward)
                {
                    break label0;
                }
                SaverRedeemFragment.access$800(SaverRedeemFragment.this).popToRoot();
            }
            return;
        }
        SaverRedeemFragment.access$900(SaverRedeemFragment.this).pushAndReplacePresenter(new SaverRewardPresenter(getActivity(), new it>(SaverRedeemFragment.this, null)), true);
    }

    public (boolean flag)
    {
        this$0 = SaverRedeemFragment.this;
        super();
        mSuppressReward = flag;
    }
}
