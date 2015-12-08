// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.SharedPreferencesUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFragment, SaverRewardPresenter, SaverRedeemConfirmationPresenter, SaverRedeemPresenter, 
//            SaverFAQPresenter, SaverRedeemBluebirdPresenter

public class SaverRedeemFragment extends SaverFragment
{
    private class BluebirdPresenterCallbacks
        implements SaverRedeemBluebirdPresenter.ActionCallbacks
    {

        final SaverRedeemFragment this$0;

        public void onBrowserLink(Uri uri)
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                if (intent.resolveActivity(getActivity().getPackageManager()) != null)
                {
                    getActivity().startActivity(intent);
                }
            }
        }

        public void onForceClose()
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                access$1400.popPresenter();
            }
        }

        private BluebirdPresenterCallbacks()
        {
            this$0 = SaverRedeemFragment.this;
            super();
        }

    }

    private class RedeemConfirmationCallbacks
        implements SaverRedeemConfirmationPresenter.ActionCallbacks
    {

        private final boolean mSuppressReward;
        final SaverRedeemFragment this$0;

        public void launchPayment()
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.PAYMENT));
            getActivity().finish();
        }

        public void launchWalmartPay()
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY));
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
                    
// JavaClassFileOutputException: get_constant: invalid tag

        public void onShowMerchandise(String s)
        {
            showMerchandise(s);
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
                    
// JavaClassFileOutputException: get_constant: invalid tag

        public RedeemConfirmationCallbacks(boolean flag)
        {
            this$0 = SaverRedeemFragment.this;
            super();
            mSuppressReward = flag;
        }
    }

    private class RedeemPresenterCallback
        implements SaverRedeemPresenter.ActionCallbacks
    {

        private final boolean mSuppressReward;
        final SaverRedeemFragment this$0;

        public void onCorrectEmail()
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity(), "faq", "updateEmail");
                finish.pushPresenter(saverfaqpresenter, true);
            }
        }

        public void onForceClose()
        {
label0:
            {
                if (getActivity() != null && !getActivity().isFinishing())
                {
                    if (mIsShowingError)
                    {
                        break label0;
                    }
                    getActivity().finish();
                }
                return;
            }
            finish.clear();
        }

        public void onRedeemed(int i, boolean flag, int j, boolean flag1)
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                SaverRedeemConfirmationPresenter saverredeemconfirmationpresenter = new SaverRedeemConfirmationPresenter(getActivity(), flag, i, j, flag1);
                saverredeemconfirmationpresenter.setActionCallbacks(new RedeemConfirmationCallbacks(mSuppressReward));
                finish.pushAndReplacePresenter(saverredeemconfirmationpresenter, true);
            }
        }

        public void onRegisterBluebird()
        {
            if (getActivity() != null && !getActivity().isFinishing())
            {
                SaverRedeemBluebirdPresenter saverredeembluebirdpresenter = new SaverRedeemBluebirdPresenter(getActivity());
                saverredeembluebirdpresenter.setActionCallbacks(new BluebirdPresenterCallbacks());
                finish.pushPresenter(saverredeembluebirdpresenter, true);
            }
        }

        public RedeemPresenterCallback(boolean flag)
        {
            this$0 = SaverRedeemFragment.this;
            super();
            mSuppressReward = flag;
        }
    }

    private class RewardPresenterCallbacks
        implements SaverRewardPresenter.ActionCallbacks
    {

        final SaverRedeemFragment this$0;

        public void onShowMerchandise(String s)
        {
            showMerchandise(s);
        }

        private RewardPresenterCallbacks()
        {
            this$0 = SaverRedeemFragment.this;
            super();
        }

    }


    private static final String BLUEBIRD_LINK_RESULT_FAILURE = "failed";
    private static final String BLUEBIRD_LINK_RESULT_SUCCESS = "success";
    public static final String EXTRA_BLUEBIRD_LINK_RESULT = "EXTRA_BLUEBIRD_LINK_RESULT";
    public static final String EXTRA_BLUEBIRD_LINK_RESULT_TEXT = "EXTRA_BLUEBIRD_LINK_RESULT_TEXT";
    public static final String EXTRA_SHOW_REDEEM = "EXTRA_SHOW_REDEEM";
    private static final String SAVER_FAQ_LINK_UPDATE_EMAIL = "updateEmail";
    private static final String TAG = com/walmart/android/app/saver/SaverRedeemFragment.getSimpleName();
    private boolean mIsShowingError;

    public SaverRedeemFragment()
    {
    }

    private void checkAndPresentError(Bundle bundle)
    {
        if (bundle != null)
        {
            String s1 = bundle.getString("EXTRA_BLUEBIRD_LINK_RESULT");
            String s = bundle.getString("EXTRA_BLUEBIRD_LINK_RESULT_TEXT");
            if ("failed".equalsIgnoreCase(s1))
            {
                bundle = s;
                if (TextUtils.isEmpty(s))
                {
                    bundle = getString(0x7f090517);
                }
                bundle = DialogFactory.createAlertDialog(bundle, getActivity());
                bundle.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() );
                mIsShowingError = true;
                bundle.show();
            }
        }
    }

    private void showMerchandise(String s)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && !fragmentactivity.isFinishing())
        {
            NavigationItemUtils.launchFromUri(fragmentactivity, s);
            fragmentactivity.finish();
        }
    }

    protected void handleDynamicArguments(Bundle bundle)
    {
        handleDynamicArguments(bundle);
        String s = null;
        if (bundle != null)
        {
            s = bundle.getString("EXTRA_BLUEBIRD_LINK_RESULT");
        }
        com.walmart.android.util.SharedPreferencesUtil.SaverBluebirdRedeemed saverbluebirdredeemed = SharedPreferencesUtil.getSaverAmountRedeemed(getActivity());
        if (bundle == null || !bundle.getBoolean("EXTRA_SHOW_REDEEM", false))
        {
            mPresenterStack.pushPresenter(new SaverRewardPresenter(getActivity(), new RewardPresenterCallbacks()), false);
            return;
        }
        if ("success".equalsIgnoreCase(s) && saverbluebirdredeemed != null)
        {
            bundle = new SaverRedeemConfirmationPresenter(getActivity(), false, saverbluebirdredeemed.redeemedTotal, saverbluebirdredeemed.previousTotal, true);
            bundle.setActionCallbacks(new RedeemConfirmationCallbacks(false));
            mPresenterStack.pushAndReplacePresenter(bundle, true);
            MessageBus.getBus().post(new Builder("successBbcardLink"));
            return;
        } else
        {
            SaverRedeemPresenter saverredeempresenter = new SaverRedeemPresenter(getActivity(), new RedeemPresenterCallback(false));
            checkAndPresentError(bundle);
            mPresenterStack.pushPresenter(saverredeempresenter, false);
            return;
        }
    }

    protected void launchRedeem()
    {
        mPresenterStack.popToRoot();
        boolean flag = false;
        if (mPresenterStack.peek() != null)
        {
            flag = mPresenterStack.peek().getClass().equals(com/walmart/android/app/saver/SaverRewardPresenter);
        }
        if (mPresenterStack.peek() == null || !mPresenterStack.peek().getClass().equals(com/walmart/android/app/saver/SaverRedeemPresenter))
        {
            SaverRedeemPresenter saverredeempresenter = new SaverRedeemPresenter(getActivity(), new RedeemPresenterCallback(flag));
            mPresenterStack.pushPresenter(saverredeempresenter, true);
        }
    }





/*
    static boolean access$102(SaverRedeemFragment saverredeemfragment, boolean flag)
    {
        saverredeemfragment.mIsShowingError = flag;
        return flag;
    }

*/











}
