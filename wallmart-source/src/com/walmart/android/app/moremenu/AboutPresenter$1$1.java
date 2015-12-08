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
//            AboutPresenter, MockSettingActivity, TermsOfUsePresenter

class this._cls1
    implements android.content.lickListener
{

    final is._cls0 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        if ("Select Server".equals(AboutPresenter.access$200(_fld0)[i]))
        {
            WalmartNetServiceSettings.showServerSelectDialog(AboutPresenter.access$100(_fld0));
        } else
        {
            if ("Hybrid Settings".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showHybridSettingsDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Select Pharmacy Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartPharmacyServiceSettings.showServerSelectDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Allow Pharmacy Screenshots".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showAllowPharmacyScreenshot(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Select Hapi Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartNetServiceSettings.showHapiServerSelectDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Select WWW Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartNetServiceSettings.showWwwServerSelectDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Select Analytics Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showAnalyticsQADialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Set Mock Response".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                dialoginterface = new Intent(AboutPresenter.access$100(_fld0), com/walmart/android/app/moremenu/MockSettingActivity);
                AboutPresenter.access$100(_fld0).startActivity(dialoginterface);
                return;
            }
            if ("Set Timeout".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                TimeoutSettings.createDialog(AboutPresenter.access$100(_fld0)).show();
                return;
            }
            if ("Start Location Service".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartLocationService.start(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("EReceipt Settings".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.buildEReceiptDialog(AboutPresenter.access$100(_fld0)).show();
                return;
            }
            if ("Saver Settings".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.buildSaverDialog(AboutPresenter.access$100(_fld0)).show();
                return;
            }
            if ("Photo Settings".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                PhotoDebugSettingsUtils.buildPhotoDialog(AboutPresenter.access$100(_fld0)).show();
                return;
            }
            if ("Weekly Ad Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showWeeklyAdDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Print GCM registration id".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                dialoginterface = UAirship.shared().getPushManager();
                WLog.i(AboutPresenter.access$300(), (new StringBuilder()).append("GCM registration id: ").append(dialoginterface.getGcmId()).toString());
                return;
            }
            if ("Push Notifications".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showPushDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Feedback dialog".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                UserVoiceUtils.showFeedbackDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("In-Store Search".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showInstoreSearch(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("In-Store Search Server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartNetServiceSettings.showStoreSearchServerDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Clear auth token".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Services.get().getAuthentication().clearToken();
                return;
            }
            if ("Select IRS server".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartNetServiceSettings.showIrsServerSelectDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Fast pickup".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                FastPickupUtil.buildDebugDialog(AboutPresenter.access$100(_fld0)).show();
                return;
            }
            if ("Open item".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showOpenItemDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Force ShippingPass Status".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showShippingPassDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Force Onboarding".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showOnboardingDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Send ShippingPass refresh event".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                MessageBus.getBus().post(new ShippingPassStatusEvent());
                return;
            }
            if ("Mobile pay settings".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showMobilePayDialog(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Wish List Clear Prefs".endsWith(AboutPresenter.access$200(_fld0)[i]))
            {
                SharedPreferencesUtil.setWishListIntroShown(AboutPresenter.access$100(_fld0), false);
                return;
            }
            if ("Refresh AppConfig".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                AppConfigManager.get().forceDownload();
                return;
            }
            if ("Send store mode event".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                dialoginterface = SharedPreferencesUtil.getSavedLocalAdJsonStore(AboutPresenter.access$100(_fld0));
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
            if ("Show device id".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                WalmartNetServiceSettings.showDeviceId(AboutPresenter.access$100(_fld0));
                return;
            }
            if ("Show auth info".equals(AboutPresenter.access$200(_fld0)[i]))
            {
                Debug.showAuthInfo(AboutPresenter.access$100(_fld0));
                return;
            }
        }
    }

    er()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/moremenu/AboutPresenter$1

/* anonymous class */
    class AboutPresenter._cls1 extends RecyclerItemSingleClickListener
    {

        final AboutPresenter this$0;

        public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
        {
            basicviewholder = null;
            (int)AboutPresenter.access$000(AboutPresenter.this).getItemId(i);
            JVM INSTR tableswitch 0 2: default 40
        //                       0 53
        //                       1 103
        //                       2 136;
               goto _L1 _L2 _L3 _L4
_L1:
            if (basicviewholder != null)
            {
                GoogleAnalytics.trackEvent("Global Nav", basicviewholder, "");
            }
            return;
_L2:
            com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(AboutPresenter.access$100(AboutPresenter.this));
            builder.setTitle("Debug");
            builder.setItems(AboutPresenter.access$200(AboutPresenter.this), new AboutPresenter._cls1._cls1());
            builder.show();
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

            
            {
                this$0 = AboutPresenter.this;
                super(presenter);
            }
    }

}
