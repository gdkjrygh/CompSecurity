// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.squareup.otto.Bus;
import com.walmart.android.app.main.RedLaserActivity;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterStack;
import com.walmart.android.util.ScannerUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.android.pharmacy.PharmacyHomePresenter;
import com.walmartlabs.android.pharmacy.ReviewOrderPresenter;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            PharmacyFourDollarPresenter, RxPrivacyNoticePresenter, PharmacyActivity

public class WalmartPharmacyHomePresenter extends PharmacyHomePresenter
{

    private com.walmart.android.data.AppConfig.MerchandisingData mMerchandisingData;

    public WalmartPharmacyHomePresenter(Activity activity)
    {
        super(activity);
        mMerchandisingData = AppConfigManager.get().getMerchandisingData();
    }

    protected Presenter createFourDollarPresenter()
    {
        return new PharmacyFourDollarPresenter(mActivity);
    }

    protected Presenter createPrivacyNoticePresenter()
    {
        return new RxPrivacyNoticePresenter(mActivity);
    }

    protected boolean isScannerAvailable()
    {
        boolean flag;
        if (mMerchandisingData != null && mMerchandisingData.rxRefillByScanEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && ScannerUtil.scannerAvailable(mActivity);
    }

    public void onActivityResultAsTop(int i, int j, Intent intent)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (i != 1)
                    {
                        break label0;
                    }
                    if (j != -1)
                    {
                        break label1;
                    }
                    if (intent != null)
                    {
                        if (!intent.getBooleanExtra("enter_manually", false))
                        {
                            break label2;
                        }
                        getPresenterStack().setDisplayEventsEnabled(false);
                        showManualEntry();
                        getPresenterStack().setDisplayEventsEnabled(true);
                    }
                    return;
                }
                if (intent.getBooleanExtra("refill", false))
                {
                    intent = new ReviewOrderPresenter(mActivity, new com.walmartlabs.android.pharmacy.OrderConfirmationRefillPresenter.RefillListener() {

                        final WalmartPharmacyHomePresenter this$0;

                        public void refill()
                        {
                            startEasyRefill();
                        }

            
            {
                this$0 = WalmartPharmacyHomePresenter.this;
                super();
            }
                    });
                    getPresenterStack().setDisplayEventsEnabled(false);
                    pushPresenter(intent, false);
                    getPresenterStack().setDisplayEventsEnabled(true);
                    return;
                } else
                {
                    super.onActivityResultAsTop(i, j, intent);
                    return;
                }
            }
            Log.w(TAG, (new StringBuilder()).append("ResultCode != OK: ").append(j).toString());
            super.onActivityResultAsTop(i, j, intent);
            return;
        }
        super.onActivityResultAsTop(i, j, intent);
    }

    public void onAppConfigUpdated(AppConfig appconfig)
    {
        boolean flag;
        boolean flag1;
        if (mMerchandisingData != null && mMerchandisingData.rxRefillByScanEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (appconfig.merchData != null && appconfig.merchData.rxRefillByScanEnabled)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mMerchandisingData = appconfig.merchData;
        if (flag != flag1)
        {
            setupEntries();
        }
    }

    protected void startEasyRefill()
    {
        if (isScannerAvailable())
        {
            Intent intent = new Intent(mActivity, com/walmart/android/app/main/RedLaserActivity);
            intent.addFlags(0x20000);
            intent.putExtra("mode", 3);
            mActivity.startActivityForResult(intent, 1);
            boolean flag = Services.get().getAuthentication().hasCredentials();
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pharmRefillAttemptMethod")).putBoolean("loggedIn", flag).putString("refillType", "scanRefill"));
            return;
        } else
        {
            showManualEntry();
            return;
        }
    }

    protected void startFindAPharmacy()
    {
        ((PharmacyActivity)mActivity).showPharmacyStoreLocator();
    }
}
