// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.support.v4.app.FragmentActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemFragment, SaverFAQPresenter, SaverRedeemConfirmationPresenter, SaverRedeemBluebirdPresenter

private class mSuppressReward
    implements mSuppressReward
{

    private final boolean mSuppressReward;
    final SaverRedeemFragment this$0;

    public void onCorrectEmail()
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity(), "faq", "updateEmail");
            SaverRedeemFragment.access$600(SaverRedeemFragment.this).pushPresenter(saverfaqpresenter, true);
        }
    }

    public void onForceClose()
    {
label0:
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                if (SaverRedeemFragment.access$100(SaverRedeemFragment.this))
                {
                    break label0;
                }
                getActivity().finish();
            }
            return;
        }
        SaverRedeemFragment.access$700(SaverRedeemFragment.this).clear();
    }

    public void onRedeemed(int i, boolean flag, int j, boolean flag1)
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            SaverRedeemConfirmationPresenter saverredeemconfirmationpresenter = new SaverRedeemConfirmationPresenter(getActivity(), flag, i, j, flag1);
            saverredeemconfirmationpresenter.setActionCallbacks(new cks(SaverRedeemFragment.this, mSuppressReward));
            SaverRedeemFragment.access$300(SaverRedeemFragment.this).pushAndReplacePresenter(saverredeemconfirmationpresenter, true);
        }
    }

    public void onRegisterBluebird()
    {
        if (getActivity() != null && !getActivity().isFinishing())
        {
            SaverRedeemBluebirdPresenter saverredeembluebirdpresenter = new SaverRedeemBluebirdPresenter(getActivity());
            saverredeembluebirdpresenter.setActionCallbacks(new ks(SaverRedeemFragment.this, null));
            SaverRedeemFragment.access$500(SaverRedeemFragment.this).pushPresenter(saverredeembluebirdpresenter, true);
        }
    }

    public ks(boolean flag)
    {
        this$0 = SaverRedeemFragment.this;
        super();
        mSuppressReward = flag;
    }
}
