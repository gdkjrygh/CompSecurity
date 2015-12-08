// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import android.content.Intent;
import com.ebay.redlasersdk.RedLaserExtras;
import com.walmart.android.app.account.AccountListener;
import com.walmart.android.app.main.RedLaserActivity;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmartlabs.android.pharmacy.PharmacyLinkAccountPresenter;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            RxPrivacyNoticePresenter

public class WalmartPharmacyLinkAccountPresenter extends PharmacyLinkAccountPresenter
{

    private static final int REQUEST_RX_CODE128 = 1;
    private AccountListener mAccountListener;

    public WalmartPharmacyLinkAccountPresenter(Activity activity)
    {
        super(activity);
    }

    public String getScreenName()
    {
        return "Rx:WalmartPharmacyAccount";
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (j == -1)
            {
                onScanResult(intent.getStringExtra("code128"));
                return;
            } else
            {
                showManualEntry();
                postScanAnalyticsEvent("abort");
                return;
            }
        } else
        {
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
    }

    protected void onSuccess()
    {
        pop();
        if (mAccountListener != null)
        {
            mAccountListener.onLoginCompleted(false, false, false);
        }
    }

    protected boolean scannerAvailable()
    {
        com.walmart.android.data.AppConfig.MerchandisingData merchandisingdata = AppConfigManager.get().getMerchandisingData();
        boolean flag;
        if (merchandisingdata != null && merchandisingdata.rxRefillByScanEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && RedLaserExtras.checkReadyStatus(mActivity).equals(com.ebay.redlasersdk.RedLaserExtras.RLScannerReadyState.LicensedModeReady);
    }

    public void setAccountListener(AccountListener accountlistener)
    {
        mAccountListener = accountlistener;
    }

    protected void showPrivacyNotice()
    {
        if (!isSingleClickFlagSet())
        {
            pushPresenter(new RxPrivacyNoticePresenter(mActivity));
            setSingleClickFlag(true);
        }
    }

    protected void startCode128Scanner()
    {
        Intent intent = new Intent(mActivity, com/walmart/android/app/main/RedLaserActivity);
        intent.putExtra("mode", 2);
        mActivity.startActivityForResult(intent, 1);
    }
}
