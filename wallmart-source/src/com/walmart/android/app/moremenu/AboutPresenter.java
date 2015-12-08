// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.WalmartLocationService;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;
import com.walmartlabs.msco.service.StoreModeEvent;
import com.walmartlabs.ui.recycler.BasicAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.ListRecyclerView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.moremenu:
//            TermsOfUsePresenter, MockSettingActivity

public class AboutPresenter extends Presenter
{
    private static class AboutAdapter extends BasicAdapter
    {

        private static final SparseArray OPTIONS;
        private final Activity mActivity;
        private final LayoutInflater mInflater;
        private SparseArray mOptions;

        private void initOptions()
        {
            mOptions = OPTIONS;
        }

        public int getItemCount()
        {
            return mOptions.size();
        }

        public long getItemId(int i)
        {
            return (long)((MoreMenuOption)mOptions.valueAt(i)).option;
        }

        public BasicViewHolder onConstructViewHolder(ViewGroup viewgroup, int i)
        {
            return new BasicViewHolder(mInflater.inflate(0x7f040020, viewgroup, false));
        }

        public void onPopulateViewHolder(BasicViewHolder basicviewholder, int i)
        {
            ViewUtil.setText(0x7f10004f, basicviewholder.itemView, ((MoreMenuOption)mOptions.valueAt(i)).title);
        }

        static 
        {
            OPTIONS = new SparseArray();
            OPTIONS.put(1, new MoreMenuOption(1, 0x7f09005c));
            OPTIONS.put(2, new MoreMenuOption(2, 0x7f09005b));
        }

        public AboutAdapter(Activity activity)
        {
            mOptions = new SparseArray();
            mActivity = activity;
            mInflater = (LayoutInflater)mActivity.getSystemService("layout_inflater");
            initOptions();
        }
    }

    private static class MoreMenuOption
    {

        private final int option;
        private final int title;



        public MoreMenuOption(int i, int j)
        {
            option = i;
            title = j;
        }
    }


    private static final String DEBUG_MENU_ANALYTICS_QA_SERVER = "Select Analytics Server";
    private static final String DEBUG_MENU_AUTH_INFO = "Show auth info";
    private static final String DEBUG_MENU_CLEAR_AUTH_TOKEN = "Clear auth token";
    private static final String DEBUG_MENU_DEVICE_ID = "Show device id";
    private static final String DEBUG_MENU_ERECEIPT_SETTINGS = "EReceipt Settings";
    private static final String DEBUG_MENU_FAST_PICKUP = "Fast pickup";
    private static final String DEBUG_MENU_HYBRID_SETTINGS = "Hybrid Settings";
    private static final String DEBUG_MENU_IN_STORE_SEARCH = "In-Store Search";
    private static final String DEBUG_MENU_IN_STORE_SEARCH_SERVER = "In-Store Search Server";
    private static final String DEBUG_MENU_MOBILE_PAY_SETTINGS = "Mobile pay settings";
    private static final String DEBUG_MENU_ONBOARDING = "Force Onboarding";
    private static final String DEBUG_MENU_OPEN_ITEM = "Open item";
    private static final String DEBUG_MENU_PHARMACY_SCREENSHOTS = "Allow Pharmacy Screenshots";
    private static final String DEBUG_MENU_PHOTO_SETTINGS = "Photo Settings";
    private static final String DEBUG_MENU_PRINT_GCM_REG_ID = "Print GCM registration id";
    private static final String DEBUG_MENU_PUSH_NOTIFICATIONS = "Push Notifications";
    private static final String DEBUG_MENU_REFRESH_APPCONFIG = "Refresh AppConfig";
    private static final String DEBUG_MENU_SAVER_SETTINGS = "Saver Settings";
    private static final String DEBUG_MENU_SELECT_HAPI_SERVER = "Select Hapi Server";
    private static final String DEBUG_MENU_SELECT_IRS_SERVER = "Select IRS server";
    private static final String DEBUG_MENU_SELECT_PHARMACY_SERVER = "Select Pharmacy Server";
    private static final String DEBUG_MENU_SELECT_SERVER = "Select Server";
    private static final String DEBUG_MENU_SELECT_WWW_SERVER = "Select WWW Server";
    private static final String DEBUG_MENU_SEND_SHIPPING_PASS_STATUS_EVENT = "Send ShippingPass refresh event";
    private static final String DEBUG_MENU_SEND_STORE_MODE_EVENT = "Send store mode event";
    private static final String DEBUG_MENU_SET_MOCK_RESPONSE = "Set Mock Response";
    private static final String DEBUG_MENU_SHIPPING_PASS = "Force ShippingPass Status";
    private static final String DEBUG_MENU_SHOW_FEEDBACK_DIALOG = "Feedback dialog";
    private static final String DEBUG_MENU_START_LOCATION_SERVICE = "Start Location Service";
    private static final String DEBUG_MENU_TIMEOUT = "Set Timeout";
    private static final String DEBUG_MENU_WEEKLY_AD_SETTINGS = "Weekly Ad Server";
    private static final String DEBUG_MENU_WISHLIST_CLEAR_PREFS = "Wish List Clear Prefs";
    private static final String EMPTY_STRING = "";
    public static final int MORE_MENU_DEBUG = 0;
    public static final int MORE_MENU_PRIVACY_POLICY = 2;
    public static final int MORE_MENU_TERMS = 1;
    private static final String PREF_FORCED_STORE = "forced_store";
    private static final String SHARED_PREFS = "pref_location_service";
    private static final String TAG = com/walmart/android/app/moremenu/AboutPresenter.getSimpleName();
    private final String debugOptions[] = {
        "Select Server", "Hybrid Settings", "Select Pharmacy Server", "Allow Pharmacy Screenshots", "Select Hapi Server", "Select WWW Server", "Select Analytics Server", "EReceipt Settings", "Saver Settings", "Photo Settings", 
        "Weekly Ad Server", "Set Mock Response", "Set Timeout", "Start Location Service", "Print GCM registration id", "Push Notifications", "Feedback dialog", "In-Store Search", "In-Store Search Server", "Clear auth token", 
        "Select IRS server", "Fast pickup", "Open item", "Force ShippingPass Status", "Force Onboarding", "Send ShippingPass refresh event", "Wish List Clear Prefs", "Refresh AppConfig", "Send store mode event", "Mobile pay settings", 
        "Show device id", "Show auth info"
    };
    private final Activity mActivity;
    private AboutAdapter mAdapter;
    private ViewGroup mViewGroup;

    public AboutPresenter(Activity activity)
    {
        mActivity = activity;
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("About");
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09005e);
    }

    public View getView()
    {
        return mViewGroup;
    }

    public void onBeforePoppedTo()
    {
        trackPageView();
        reloadData();
    }

    public void onBeforePush()
    {
        reloadData();
        trackPageView();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mViewGroup == null)
        {
            mViewGroup = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f04001f, viewgroup);
            viewgroup = (ListRecyclerView)mViewGroup.findViewById(0x7f10007f);
            mAdapter = new AboutAdapter(mActivity);
            viewgroup.setAdapter(mAdapter);
            viewgroup.setOnItemClickListener(new RecyclerItemSingleClickListener(this) {

                final AboutPresenter this$0;

                public void onItemSingleClick(BasicViewHolder basicviewholder, int i)
                {
                    basicviewholder = null;
                    (int)mAdapter.getItemId(i);
                    JVM INSTR tableswitch 0 2: default 40
                //                               0 53
                //                               1 103
                //                               2 136;
                       goto _L1 _L2 _L3 _L4
_L1:
                    if (basicviewholder != null)
                    {
                        GoogleAnalytics.trackEvent("Global Nav", basicviewholder, "");
                    }
                    return;
_L2:
                    com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity);
                    builder.setTitle("Debug");
                    builder.setItems(debugOptions, new android.content.DialogInterface.OnClickListener() {

                        final _cls1 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface.dismiss();
                            if ("Select Server".equals(debugOptions[i]))
                            {
                                WalmartNetServiceSettings.showServerSelectDialog(mActivity);
                            } else
                            {
                                if ("Hybrid Settings".equals(debugOptions[i]))
                                {
                                    Debug.showHybridSettingsDialog(mActivity);
                                    return;
                                }
                                if ("Select Pharmacy Server".equals(debugOptions[i]))
                                {
                                    WalmartPharmacyServiceSettings.showServerSelectDialog(mActivity);
                                    return;
                                }
                                if ("Allow Pharmacy Screenshots".equals(debugOptions[i]))
                                {
                                    Debug.showAllowPharmacyScreenshot(mActivity);
                                    return;
                                }
                                if ("Select Hapi Server".equals(debugOptions[i]))
                                {
                                    WalmartNetServiceSettings.showHapiServerSelectDialog(mActivity);
                                    return;
                                }
                                if ("Select WWW Server".equals(debugOptions[i]))
                                {
                                    WalmartNetServiceSettings.showWwwServerSelectDialog(mActivity);
                                    return;
                                }
                                if ("Select Analytics Server".equals(debugOptions[i]))
                                {
                                    Debug.showAnalyticsQADialog(mActivity);
                                    return;
                                }
                                if ("Set Mock Response".equals(debugOptions[i]))
                                {
                                    dialoginterface = new Intent(mActivity, com/walmart/android/app/moremenu/MockSettingActivity);
                                    mActivity.startActivity(dialoginterface);
                                    return;
                                }
                                if ("Set Timeout".equals(debugOptions[i]))
                                {
                                    TimeoutSettings.createDialog(mActivity).show();
                                    return;
                                }
                                if ("Start Location Service".equals(debugOptions[i]))
                                {
                                    WalmartLocationService.start(mActivity);
                                    return;
                                }
                                if ("EReceipt Settings".equals(debugOptions[i]))
                                {
                                    Debug.buildEReceiptDialog(mActivity).show();
                                    return;
                                }
                                if ("Saver Settings".equals(debugOptions[i]))
                                {
                                    Debug.buildSaverDialog(mActivity).show();
                                    return;
                                }
                                if ("Photo Settings".equals(debugOptions[i]))
                                {
                                    PhotoDebugSettingsUtils.buildPhotoDialog(mActivity).show();
                                    return;
                                }
                                if ("Weekly Ad Server".equals(debugOptions[i]))
                                {
                                    Debug.showWeeklyAdDialog(mActivity);
                                    return;
                                }
                                if ("Print GCM registration id".equals(debugOptions[i]))
                                {
                                    dialoginterface = UAirship.shared().getPushManager();
                                    WLog.i(AboutPresenter.TAG, (new StringBuilder()).append("GCM registration id: ").append(dialoginterface.getGcmId()).toString());
                                    return;
                                }
                                if ("Push Notifications".equals(debugOptions[i]))
                                {
                                    Debug.showPushDialog(mActivity);
                                    return;
                                }
                                if ("Feedback dialog".equals(debugOptions[i]))
                                {
                                    UserVoiceUtils.showFeedbackDialog(mActivity);
                                    return;
                                }
                                if ("In-Store Search".equals(debugOptions[i]))
                                {
                                    Debug.showInstoreSearch(mActivity);
                                    return;
                                }
                                if ("In-Store Search Server".equals(debugOptions[i]))
                                {
                                    WalmartNetServiceSettings.showStoreSearchServerDialog(mActivity);
                                    return;
                                }
                                if ("Clear auth token".equals(debugOptions[i]))
                                {
                                    Services.get().getAuthentication().clearToken();
                                    return;
                                }
                                if ("Select IRS server".equals(debugOptions[i]))
                                {
                                    WalmartNetServiceSettings.showIrsServerSelectDialog(mActivity);
                                    return;
                                }
                                if ("Fast pickup".equals(debugOptions[i]))
                                {
                                    FastPickupUtil.buildDebugDialog(mActivity).show();
                                    return;
                                }
                                if ("Open item".equals(debugOptions[i]))
                                {
                                    Debug.showOpenItemDialog(mActivity);
                                    return;
                                }
                                if ("Force ShippingPass Status".equals(debugOptions[i]))
                                {
                                    Debug.showShippingPassDialog(mActivity);
                                    return;
                                }
                                if ("Force Onboarding".equals(debugOptions[i]))
                                {
                                    Debug.showOnboardingDialog(mActivity);
                                    return;
                                }
                                if ("Send ShippingPass refresh event".equals(debugOptions[i]))
                                {
                                    MessageBus.getBus().post(new ShippingPassStatusEvent());
                                    return;
                                }
                                if ("Mobile pay settings".equals(debugOptions[i]))
                                {
                                    Debug.showMobilePayDialog(mActivity);
                                    return;
                                }
                                if ("Wish List Clear Prefs".endsWith(debugOptions[i]))
                                {
                                    SharedPreferencesUtil.setWishListIntroShown(mActivity, false);
                                    return;
                                }
                                if ("Refresh AppConfig".equals(debugOptions[i]))
                                {
                                    AppConfigManager.get().forceDownload();
                                    return;
                                }
                                if ("Send store mode event".equals(debugOptions[i]))
                                {
                                    dialoginterface = SharedPreferencesUtil.getSavedLocalAdJsonStore(mActivity);
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
                                if ("Show device id".equals(debugOptions[i]))
                                {
                                    WalmartNetServiceSettings.showDeviceId(mActivity);
                                    return;
                                }
                                if ("Show auth info".equals(debugOptions[i]))
                                {
                                    Debug.showAuthInfo(mActivity);
                                    return;
                                }
                            }
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                    builder.show();
                    continue; /* Loop/switch isn't completed */
_L3:
                    pushPresenter(new TermsOfUsePresenter(mActivity), true);
                    GoogleAnalytics.trackPageView("Terms of Use");
                    basicviewholder = "TOU";
                    continue; /* Loop/switch isn't completed */
_L4:
                    pushPresenter(new PrivacyPolicyPresenter(mActivity), true);
                    basicviewholder = "Privacy";
                    if (true) goto _L1; else goto _L5
_L5:
                }

            
            {
                this$0 = AboutPresenter.this;
                super(presenter);
            }
            });
            try
            {
                viewgroup = mActivity.getPackageManager().getPackageInfo(mActivity.getPackageName(), 0).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (ViewGroup viewgroup)
            {
                viewgroup = "?";
            }
            ViewUtil.setText(0x7f100072, mViewGroup, 0x7f09005f, new Object[] {
                viewgroup
            });
        }
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        trackPageView();
    }

    public void reloadData()
    {
        mAdapter.notifyDataSetChanged();
    }







}
