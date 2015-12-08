// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.saver.SaverDashboardPresenter;
import com.walmart.android.app.saver.SaverFAQPresenter;
import com.walmart.android.app.saver.SaverFragment;
import com.walmart.android.app.saver.SaverNotificationUtils;
import com.walmart.android.app.saver.SaverReceiptActivity;
import com.walmart.android.app.saver.SaverRedeemActivity;
import com.walmart.android.app.saver.SaverSubmitReceiptActivity;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.saver.SaverManager;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.ereceipt.EReceiptNotificationUtils;

public class SaverDashboardFragment extends SaverFragment
{
    protected class DashboardCallbacks
        implements com.walmart.android.app.saver.SaverDashboardPresenter.ActionCallbacks
    {

        final SaverDashboardFragment this$0;

        public void launchFaq()
        {
            SaverFAQPresenter saverfaqpresenter = new SaverFAQPresenter(getActivity());
            SaverDashboardFragment.this.SaverFAQPresenter.pushPresenter(saverfaqpresenter, true);
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
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY));
        }

        public void submitUnconfirmedReceipts()
        {
            Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptActivity);
            intent.addFlags(0x20000);
            intent.putExtra("SUBMIT_NOW", true);
            startActivity(intent);
        }

        protected DashboardCallbacks()
        {
            this$0 = SaverDashboardFragment.this;
            super();
        }
    }


    private static final String TAG = com/walmart/android/fragments/SaverDashboardFragment.getSimpleName();

    public SaverDashboardFragment()
    {
    }

    protected void handleDynamicArguments(Bundle bundle)
    {
        Object obj;
        SaverDashboardPresenter saverdashboardpresenter;
        String s1;
        String s2;
        String s3;
        super.handleDynamicArguments(bundle);
        com.walmart.android.app.saver.SaverFragment.EReceiptScannerImpl ereceiptscannerimpl = new com.walmart.android.app.saver.SaverFragment.EReceiptScannerImpl(getActivity(), this);
        DashboardCallbacks dashboardcallbacks = new DashboardCallbacks();
        s1 = EReceiptNotificationUtils.getStoreId(bundle);
        s2 = EReceiptNotificationUtils.getEReceiptId(bundle);
        s3 = SaverNotificationUtils.getReceiptId(bundle);
        obj = null;
        if (bundle != null)
        {
            String s = bundle.getString("saver_bluebird_result");
            obj = s;
            if (bundle.getBoolean("START_SYNC", false))
            {
                SaverManager.get().syncReceipts();
                obj = s;
            }
        }
        saverdashboardpresenter = new SaverDashboardPresenter(getActivity(), ereceiptscannerimpl, dashboardcallbacks);
        if (TextUtils.isEmpty(s1) || bundle == null || !bundle.getBoolean("EXTRA_ERECEIPT_SUBMITTED_SAVER", false)) goto _L2; else goto _L1
_L1:
        obj = new Intent(getActivity(), com/walmart/android/app/saver/SaverSubmitReceiptActivity);
        ((Intent) (obj)).putExtra("EXTRA_RECEIPT_SUBMITTED", true);
        ((Intent) (obj)).addFlags(0x20000);
        ((Intent) (obj)).putExtras(bundle);
        startActivityForResult(((Intent) (obj)), 2);
        saverdashboardpresenter.suppressNextUnconfirmedReceiptsCheck();
_L4:
        mPresenterStack.pushPresenter(saverdashboardpresenter, false);
        return;
_L2:
        if (!TextUtils.isEmpty(s2) || !TextUtils.isEmpty(s3))
        {
            obj = new Intent(getActivity(), com/walmart/android/app/saver/SaverReceiptActivity);
            ((Intent) (obj)).addFlags(0x20000);
            ((Intent) (obj)).putExtras(bundle);
            startActivity(((Intent) (obj)));
            saverdashboardpresenter.suppressNextUnconfirmedReceiptsCheck();
        } else
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Intent intent = new Intent(getActivity(), com/walmart/android/app/saver/SaverRedeemActivity);
            intent.addFlags(0x20000);
            intent.putExtra("EXTRA_SHOW_REDEEM", true);
            intent.putExtra("EXTRA_BLUEBIRD_LINK_RESULT", ((String) (obj)));
            intent.putExtra("EXTRA_BLUEBIRD_LINK_RESULT_TEXT", bundle.getString("saver_bluebird_result_text"));
            startActivity(intent);
            saverdashboardpresenter.suppressNextUnconfirmedReceiptsCheck();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        if (j != 1)
        {
            mPresenterStack.popToRoot();
        }
_L4:
        super.onActivityResult(i, j, intent);
        return;
_L2:
        if (i == 2 && j == 11)
        {
            intent.setComponent(new ComponentName(getActivity(), com/walmart/android/app/saver/SaverReceiptActivity));
            intent.addFlags(0x20000);
            startActivity(intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }


}
