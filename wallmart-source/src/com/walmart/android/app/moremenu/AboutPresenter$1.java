// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.squareup.otto.Bus;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.Debug;
import com.walmart.android.app.PrivacyPolicyPresenter;
import com.walmart.android.app.fastpickup.FastPickupUtil;
import com.walmart.android.config.WalmartNetServiceSettings;
import com.walmart.android.config.WalmartPharmacyServiceSettings;
import com.walmart.android.events.ShippingPassStatusEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.RecyclerItemSingleClickListener;
import com.walmart.android.ui.dialog.AlertDialog;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.UserVoiceUtils;
import com.walmart.android.utils.TimeoutSettings;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartLocationService;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.moremenu:
//            AboutPresenter, TermsOfUsePresenter, MockSettingActivity

class ener extends RecyclerItemSingleClickListener
{

    final AboutPresenter this$0;

    public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = null;
        (int)AboutPresenter.access$000(AboutPresenter.this).getItemId(i);
        JVM INSTR tableswitch 0 2: default 40
    //                   0 53
    //                   1 103
    //                   2 136;
           goto _L1 _L2 _L3 _L4
_L1:
        if (basicviewholder != null)
        {
            GoogleAnalytics.trackEvent("Global Nav", basicviewholder, "");
        }
        return;
_L2:
        com.walmart.android.ui.dialog.er er = new com.walmart.android.ui.dialog.er(AboutPresenter.access$100(AboutPresenter.this));
        er.setTitle("Debug");
        er.setItems(AboutPresenter.access$200(AboutPresenter.this), new android.content.DialogInterface.OnClickListener() {

            final AboutPresenter._cls1 this$1;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                dialoginterface.dismiss();
                if ("Select Server".equals(AboutPresenter.access$200(this$0)[j]))
                {
                    WalmartNetServiceSettings.showServerSelectDialog(AboutPresenter.access$100(this$0));
                } else
                {
                    if ("Hybrid Settings".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showHybridSettingsDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Select Pharmacy Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartPharmacyServiceSettings.showServerSelectDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Allow Pharmacy Screenshots".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showAllowPharmacyScreenshot(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Select Hapi Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartNetServiceSettings.showHapiServerSelectDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Select WWW Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartNetServiceSettings.showWwwServerSelectDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Select Analytics Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showAnalyticsQADialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Set Mock Response".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        dialoginterface = new Intent(AboutPresenter.access$100(this$0), com/walmart/android/app/moremenu/MockSettingActivity);
                        AboutPresenter.access$100(this$0).startActivity(dialoginterface);
                        return;
                    }
                    if ("Set Timeout".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        TimeoutSettings.createDialog(AboutPresenter.access$100(this$0)).show();
                        return;
                    }
                    if ("Start Location Service".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartLocationService.start(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("EReceipt Settings".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.buildEReceiptDialog(AboutPresenter.access$100(this$0)).show();
                        return;
                    }
                    if ("Saver Settings".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.buildSaverDialog(AboutPresenter.access$100(this$0)).show();
                        return;
                    }
                    if ("Photo Settings".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        PhotoDebugSettingsUtils.buildPhotoDialog(AboutPresenter.access$100(this$0)).show();
                        return;
                    }
                    if ("Weekly Ad Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showWeeklyAdDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Print GCM registration id".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        dialoginterface = UAirship.shared().getPushManager();
                        WLog.i(AboutPresenter.access$300(), (new StringBuilder()).append("GCM registration id: ").append(dialoginterface.getGcmId()).toString());
                        return;
                    }
                    if ("Push Notifications".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showPushDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Feedback dialog".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        UserVoiceUtils.showFeedbackDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("In-Store Search".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showInstoreSearch(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("In-Store Search Server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartNetServiceSettings.showStoreSearchServerDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Clear auth token".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Services.get().getAuthentication().clearToken();
                        return;
                    }
                    if ("Select IRS server".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartNetServiceSettings.showIrsServerSelectDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Fast pickup".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        FastPickupUtil.buildDebugDialog(AboutPresenter.access$100(this$0)).show();
                        return;
                    }
                    if ("Open item".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showOpenItemDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Force ShippingPass Status".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showShippingPassDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Force Onboarding".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showOnboardingDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Send ShippingPass refresh event".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        MessageBus.getBus().post(new ShippingPassStatusEvent());
                        return;
                    }
                    if ("Mobile pay settings".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showMobilePayDialog(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Wish List Clear Prefs".endsWith(AboutPresenter.access$200(this$0)[j]))
                    {
                        SharedPreferencesUtil.setWishListIntroShown(AboutPresenter.access$100(this$0), false);
                        return;
                    }
                    if ("Refresh AppConfig".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        AppConfigManager.get().forceDownload();
                        return;
                    }
                    if ("Send store mode event".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        dialoginterface = SharedPreferencesUtil.getSavedLocalAdJsonStore(AboutPresenter.access$100(this$0));
                        Bus bus = MessageBus.getBus();
                        if (dialoginterface != null)
                        {
                            dialoginterface = new StoreModeEvent(dialoginterface);
                        } else
                        {
                            dialoginterface = new StoreModeEvent();
                        }
                        bus.post(dialoginterface);
                        return;
                    }
                    if ("Show device id".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        WalmartNetServiceSettings.showDeviceId(AboutPresenter.access$100(this$0));
                        return;
                    }
                    if ("Show auth info".equals(AboutPresenter.access$200(this$0)[j]))
                    {
                        Debug.showAuthInfo(AboutPresenter.access$100(this$0));
                        return;
                    }
                }
            }

            
            {
                this$1 = AboutPresenter._cls1.this;
                super();
            }
        });
        er.show();
        continue; /* Loop/switch isn't completed */
_L3:
        AboutPresenter.access$400(AboutPresenter.this, new TermsOfUsePresenter(AboutPresenter.access$100(AboutPresenter.this)), true);
        GoogleAnalytics.trackPageView("Terms of Use");
        basicviewholder = "TOU";
        continue; /* Loop/switch isn't completed */
_L4:
        AboutPresenter.access$500(AboutPresenter.this, new PrivacyPolicyPresenter(AboutPresenter.access$100(AboutPresenter.this)), true);
        basicviewholder = "Privacy";
        if (true) goto _L1; else goto _L5
_L5:
    }

    _cls1.this._cls1(Presenter presenter)
    {
        this$0 = AboutPresenter.this;
        super(presenter);
    }
}
