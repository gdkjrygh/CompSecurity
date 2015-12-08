// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.home;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.AnalyticsHelper;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.MerchBannerTapEvent;
import com.walmart.android.app.main.BarcodeActionController;
import com.walmart.android.app.main.NavigationItemUtils;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.photo.WalmartIntegrationProvider;
import com.walmart.android.data.AppConfig;
import com.walmart.android.data.StoreInfo;
import com.walmart.android.events.BarcodeActionClickedEvent;
import com.walmart.android.events.CartActionClickedEvent;
import com.walmart.android.events.ShippingPassStatusEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.GooglePlay;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.ShippingPassUtil;
import com.walmart.android.util.UserVoiceUtils;
import com.walmart.android.util.VersionUtil;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmartlabs.android.photo.controller.MainActivity;
import com.walmartlabs.payment.service.mpay.MobilePayEvent;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.ui.PresenterFragment;
import com.walmartlabs.ui.merchandising.BannerData;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.home:
//            MerchandisingBannerController, InStoreModuleController, ShippingPassBanner, MerchandisingAdapter

public class HomePresenter extends Presenter
{

    private static final int DIALOG_SHIPPING_PASS = 1;
    private static final String TAG = com/walmart/android/app/home/HomePresenter.getSimpleName();
    private final Activity mActivity;
    private AppConfig mAppConfig;
    private MerchandisingBannerController mBannerController;
    private InStoreModuleController mInStoreModuleController;
    private boolean mIsVisible;
    private MerchandisingAdapter mMerchandisingAdapter;
    private boolean mShowUpdateEventSent;
    private ViewGroup mView;
    private ViewGroup mViewParent;

    public HomePresenter(PresenterFragment presenterfragment)
    {
        mActivity = presenterfragment.getActivity();
        mAppConfig = AppConfigManager.get().getAppConfig();
    }

    private void createBannerController()
    {
        View view = mView.findViewById(0x7f100165);
        if (mBannerController != null)
        {
            mBannerController.cleanUp();
        }
        mBannerController = new MerchandisingBannerController(mActivity, view, SharedPreferencesUtil.getInitialBannerAspectRatio(mActivity));
        mBannerController.setMerchandisingClickListener(new MerchandisingBannerController.OnMerchandisingClickedListener() {

            final HomePresenter this$0;

            public void onMerchandisingUriClicked(BannerData bannerdata)
            {
                if (!isSingleClickFlagSet())
                {
                    setSingleClickFlag(true);
                    Object obj = null;
                    if (bannerdata != null)
                    {
                        if ("webview".equals(bannerdata.type))
                        {
                            if (!TextUtils.isEmpty(bannerdata.action))
                            {
                                obj = WalmartUri.parse(bannerdata.action);
                                Object obj1;
                                if (obj != null && ((WalmartUri) (obj)).getType() == 19)
                                {
                                    obj = Uri.decode(((WalmartUri) (obj)).getParam(0));
                                } else
                                {
                                    obj = bannerdata.action;
                                }
                                NavigationItemUtils.launchWebView(((String) (obj)));
                            }
                        } else
                        if ("shippingPassPromotion".equals(bannerdata.type))
                        {
                            ShippingPassUtil.launchShippingPassSignup(mActivity);
                        } else
                        {
                            NavigationItemUtils.launchFromUri(mActivity, bannerdata.action);
                        }
                        obj = bannerdata.action;
                    }
                    obj1 = obj;
                    if (obj == null)
                    {
                        obj1 = "N/A";
                    }
                    GoogleAnalytics.trackEvent("Home", "Banner", ((String) (obj1)));
                    if (bannerdata != null && bannerdata.data != null && bannerdata.action != null)
                    {
                        MessageBus.getBus().post(new MerchBannerTapEvent(bannerdata.action));
                    }
                }
            }

            
            {
                this$0 = HomePresenter.this;
                super();
            }
        });
        initBannerController();
    }

    private void createInStoreModuleController()
    {
        mInStoreModuleController = new InStoreModuleController(mActivity, mView);
        mInStoreModuleController.init();
    }

    private boolean hasBannerDataChanged(com.walmart.android.data.AppConfig.MerchandisingData merchandisingdata)
    {
        BannerData abannerdata[];
        abannerdata = mAppConfig.merchData.getHomescreenMerchandising();
        merchandisingdata = merchandisingdata.getHomescreenMerchandising();
        if (abannerdata.length != merchandisingdata.length) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i >= abannerdata.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (abannerdata[i].equals(merchandisingdata[i])) goto _L3; else goto _L2
_L2:
        return true;
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return false;
    }

    private void initBannerController()
    {
        if (mAppConfig != null && mAppConfig.merchData != null)
        {
            BannerData abannerdata1[] = mAppConfig.merchData.getHomescreenMerchandising();
            boolean flag = mAppConfig.merchData.autoMerchandisingModuleProgression;
            if (abannerdata1 != null && abannerdata1.length > 0)
            {
                String s = mAppConfig.getShippingPassBannerUrl();
                BannerData abannerdata[] = abannerdata1;
                if (ShippingPassUtil.isEligibleNonMember())
                {
                    abannerdata = abannerdata1;
                    if (!TextUtils.isEmpty(s))
                    {
                        abannerdata = new BannerData[abannerdata1.length + 1];
                        System.arraycopy(abannerdata1, 0, abannerdata, 1, abannerdata1.length);
                        abannerdata[0] = new ShippingPassBanner(s);
                    }
                }
                mMerchandisingAdapter = new MerchandisingAdapter(mActivity);
                mMerchandisingAdapter.setBanners(abannerdata);
                mMerchandisingAdapter.setBannerDimensionsListener(new MerchandisingAdapter.BannerDimensionsListener() {

                    final HomePresenter this$0;

                    public void onNewDimensions(int i, int j)
                    {
                        WLog.d(HomePresenter.TAG, (new StringBuilder()).append("onNewDimensions(): ").append(i).append(" x ").append(j).toString());
                        if (i > 0 && j > 0)
                        {
                            float f = (float)i / (float)j;
                            mBannerController.setAspectRatio(f, true);
                            SharedPreferencesUtil.setInitialBannerAspectRatio(f, mActivity);
                        }
                    }

            
            {
                this$0 = HomePresenter.this;
                super();
            }
                });
                mView.findViewById(0x7f100165).setVisibility(0);
            } else
            {
                mView.findViewById(0x7f100165).setVisibility(8);
            }
            mBannerController.init(mMerchandisingAdapter, flag);
        }
    }

    private void initUi()
    {
        mView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f040065, mViewParent);
        setupEntries();
        createBannerController();
        createInStoreModuleController();
        showUpdate(VersionUtil.isUpdateAvailable(mActivity, mAppConfig));
    }

    private void setupEntries()
    {
        OnSingleClickListener onsingleclicklistener = new OnSingleClickListener(this) {

            final HomePresenter this$0;

            public void onSingleClick(View view)
            {
                String s;
                Bundle bundle;
                Object obj;
                s = null;
                obj = null;
                bundle = null;
                view.getId();
                JVM INSTR tableswitch 2131755368 2131755378: default 68
            //                           2131755368 110
            //                           2131755369 145
            //                           2131755370 292
            //                           2131755371 161
            //                           2131755372 323
            //                           2131755373 338
            //                           2131755374 196
            //                           2131755375 243
            //                           2131755376 215
            //                           2131755377 273
            //                           2131755378 360;
                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
                clearSingleClickFlag();
                view = obj;
_L14:
                if (view != null)
                {
                    MessageBus.getBus().post(new SwitchFragmentEvent(view, bundle));
                }
                if (s != null)
                {
                    GoogleAnalytics.trackEvent("Home", s, "");
                }
                return;
_L2:
                view = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
                bundle = new Bundle();
                bundle.putString("start_mode", "root");
                s = "Shop by Dept";
                trackHomescreenSection("shop by department");
                continue; /* Loop/switch isn't completed */
_L3:
                view = com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY;
                trackHomescreenSection("mobile pay");
                continue; /* Loop/switch isn't completed */
_L5:
                view = com.walmart.android.config.FragmentConfig.FragmentName.SHOP;
                bundle = new Bundle();
                bundle.putString("start_mode", "savings_showcase");
                s = "Rollbacks";
                trackHomescreenSection("rollbacks");
                continue; /* Loop/switch isn't completed */
_L8:
                view = com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD;
                s = "Local Ad";
                trackHomescreenSection("weekly ad");
                continue; /* Loop/switch isn't completed */
_L10:
                PharmacyActivity.launch(mActivity);
                s = "Pharmacy";
                trackHomescreenSection("pharmacy");
                view = obj;
                continue; /* Loop/switch isn't completed */
_L9:
                MainActivity.launch(mActivity, com/walmart/android/app/photo/WalmartIntegrationProvider.getName());
                trackHomescreenSection("photo");
                view = obj;
                continue; /* Loop/switch isn't completed */
_L11:
                view = com.walmart.android.config.FragmentConfig.FragmentName.STORE_FINDER;
                s = "Find Store";
                trackHomescreenSection("find store");
                continue; /* Loop/switch isn't completed */
_L4:
                view = com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD;
                bundle = new Bundle();
                bundle.putBoolean("START_SYNC", true);
                trackHomescreenSection("savings catcher");
                continue; /* Loop/switch isn't completed */
_L6:
                view = com.walmart.android.config.FragmentConfig.FragmentName.WISHLIST;
                bundle = new Bundle();
                continue; /* Loop/switch isn't completed */
_L7:
                view = com.walmart.android.config.FragmentConfig.FragmentName.REGISTRY;
                bundle = new Bundle();
                bundle.putBoolean("reload", true);
                continue; /* Loop/switch isn't completed */
_L12:
                GooglePlay.launchIfAvailable(mActivity);
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "App Upgrade Message"));
                trackHomescreenSection("update");
                view = obj;
                if (true) goto _L14; else goto _L13
_L13:
            }

            
            {
                this$0 = HomePresenter.this;
                super(presenter);
            }
        };
        setupEntry(0x7f100168, onsingleclicklistener);
        setupEntry(0x7f100169, onsingleclicklistener);
        setupEntry(0x7f10016b, onsingleclicklistener);
        setupEntry(0x7f10016e, onsingleclicklistener);
        setupEntry(0x7f100171, onsingleclicklistener);
        setupEntry(0x7f100170, onsingleclicklistener);
        setupEntry(0x7f10016f, onsingleclicklistener);
        setupEntry(0x7f10016a, onsingleclicklistener);
        setupEntry(0x7f100172, onsingleclicklistener);
        setupEntry(0x7f10016c, onsingleclicklistener);
        setupEntry(0x7f10016d, onsingleclicklistener);
        updateLocalAdEntry();
    }

    private void setupEntry(int i, OnSingleClickListener onsingleclicklistener)
    {
        View view;
        int j;
        int k;
        int l;
        boolean flag;
        boolean flag1;
        l = 0;
        view = mView.findViewById(i);
        flag1 = false;
        k = 0;
        j = 0;
        flag = false;
        i;
        JVM INSTR tableswitch 2131755368 2131755378: default 84
    //                   2131755368 140
    //                   2131755369 162
    //                   2131755370 361
    //                   2131755371 207
    //                   2131755372 317
    //                   2131755373 339
    //                   2131755374 229
    //                   2131755375 273
    //                   2131755376 251
    //                   2131755377 295
    //                   2131755378 383;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        l = ((flag1) ? 1 : 0);
        i = ((flag) ? 1 : 0);
_L14:
        ImageView imageview = (ImageView)ViewUtil.findViewById(view, 0x7f100173);
        imageview.setBackgroundResource(i);
        imageview.setImageResource(j);
        ViewUtil.setText(0x7f100175, view, l);
        ViewUtil.setText(0x7f100176, view, k);
        view.setOnClickListener(onsingleclicklistener);
        return;
_L2:
        l = 0x7f090150;
        k = 0x7f09014f;
        j = 0x7f02012c;
        i = 0x7f02012f;
        continue; /* Loop/switch isn't completed */
_L3:
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            i = l;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        l = 0x7f090146;
        k = 0x7f090145;
        j = 0x7f02012e;
        i = 0x7f020135;
        continue; /* Loop/switch isn't completed */
_L5:
        l = 0x7f09014e;
        k = 0x7f09014d;
        j = 0x7f02012b;
        i = 0x7f020131;
        continue; /* Loop/switch isn't completed */
_L8:
        l = 0x7f090144;
        k = 0x7f0900ca;
        j = 0x7f020127;
        i = 0x7f020135;
        continue; /* Loop/switch isn't completed */
_L10:
        l = 0x7f09014a;
        k = 0x7f090149;
        j = 0x7f020129;
        i = 0x7f02012f;
        continue; /* Loop/switch isn't completed */
_L9:
        l = 0x7f0903a0;
        k = 0x7f09039f;
        j = 0x7f02026a;
        i = 0x7f020131;
        continue; /* Loop/switch isn't completed */
_L11:
        l = 0x7f090152;
        k = 0x7f090151;
        j = 0x7f02012d;
        i = 0x7f020130;
        continue; /* Loop/switch isn't completed */
_L6:
        l = 0x7f090154;
        k = 0x7f090153;
        j = 0x7f020126;
        i = 0x7f02012f;
        continue; /* Loop/switch isn't completed */
_L7:
        l = 0x7f090148;
        k = 0x7f090147;
        j = 0x7f020128;
        i = 0x7f020130;
        continue; /* Loop/switch isn't completed */
_L4:
        l = 0x7f09014c;
        k = 0x7f09014b;
        j = 0x7f02012a;
        i = 0x7f020130;
        continue; /* Loop/switch isn't completed */
_L12:
        l = 0x7f090157;
        k = 0x7f090156;
        j = 0x7f0202f0;
        i = 0x7f020134;
        ViewUtil.findViewById(view, 0x7f100174).setPadding(0, 0, 0, 0);
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void showUpdate(boolean flag)
    {
        int i = 0;
        if (mView != null)
        {
            Object obj = mView.findViewById(0x7f100172);
            if (!flag)
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
        }
        if (flag && !mShowUpdateEventSent)
        {
            obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("appVersionDiff");
            if (mAppConfig.merchData != null)
            {
                ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("appVerAvail", mAppConfig.merchData.version);
            }
            try
            {
                ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("appVer", Integer.toString(mActivity.getPackageManager().getPackageInfo(mActivity.getPackageName(), 0).versionCode));
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
            MessageBus.getBus().post(obj);
            mShowUpdateEventSent = true;
        }
    }

    private void trackHomescreenSection(String s)
    {
        s = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("section")).putString("sectionId", s);
        MessageBus.getBus().post(s);
    }

    private void trackPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Homepage").putString("section", "Home").putString("subCategory", "Homepage");
        MessageBus.getBus().post(builder);
    }

    private void updateLocalAdEntry()
    {
        Object obj = SharedPreferencesUtil.getSavedLocalAdStore(mActivity);
        View view = mView.findViewById(0x7f10016e);
        if (obj != null && !TextUtils.isEmpty(((StoreInfo) (obj)).storeID))
        {
            obj = ((StoreInfo) (obj)).addressLine2;
        } else
        {
            obj = mActivity.getString(0x7f090155);
        }
        ViewUtil.setText(0x7f100175, view, mActivity.getString(0x7f090144));
        ViewUtil.setText(0x7f100176, view, ((CharSequence) (obj)));
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f09026e);
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mBannerController != null)
        {
            mBannerController.cleanUp();
        }
        if (mInStoreModuleController != null)
        {
            mInStoreModuleController.destroy();
        }
        MessageBus.getBus().unregister(this);
    }

    public void onBarcodeActionClicked(BarcodeActionClickedEvent barcodeactionclickedevent)
    {
        if (mIsVisible)
        {
            trackHomescreenSection("barcode icon");
        }
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mIsVisible = true;
        if (mBannerController != null)
        {
            mBannerController.resetAutoPagingTimer();
        }
        if (mInStoreModuleController != null)
        {
            mInStoreModuleController.refresh();
        }
        AppConfigManager.get().requestDownload();
        trackPageView();
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    public void onCartActionClicked(CartActionClickedEvent cartactionclickedevent)
    {
        if (mIsVisible)
        {
            trackHomescreenSection("cart");
        }
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        MenuItem menuitem = menu.findItem(0x7f100693);
        if (menuitem != null)
        {
            BarcodeActionController barcodeactioncontroller = (BarcodeActionController)MenuItemCompat.getActionProvider(menuitem);
            if (barcodeactioncontroller != null && barcodeactioncontroller.isAvailable())
            {
                menuitem.setVisible(true);
            } else
            {
                menuitem.setVisible(false);
            }
        }
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        mViewParent = viewgroup;
        initUi();
    }

    public void onMobilePayEvent(MobilePayEvent mobilepayevent)
    {
        setupEntries();
    }

    public void onNewAppConfigReceived(AppConfig appconfig)
    {
        AppConfig appconfig1 = mAppConfig;
        if (appconfig.merchData == null)
        {
            appconfig = appconfig1;
        }
        mAppConfig = appconfig;
        if (appconfig1 == null || appconfig1.merchData == null || hasBannerDataChanged(appconfig1.merchData))
        {
            initBannerController();
        }
        showUpdate(VersionUtil.isUpdateAvailable(mActivity, mAppConfig));
    }

    public void onNewTop()
    {
        super.onNewTop();
        mIsVisible = false;
        if (mBannerController != null)
        {
            mBannerController.pauseAutoPaging();
        }
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        if (menuitem.getItemId() == 0x7f100691)
        {
            trackHomescreenSection("search icon");
        }
        return super.onOptionsMenuItemSelected(menuitem, activity);
    }

    public void onPop()
    {
        super.onPop();
        mIsVisible = false;
    }

    public void onPushed()
    {
        super.onPushed();
        mIsVisible = true;
        trackPageView();
    }

    public void onRestartAsTop()
    {
        super.onRestartAsTop();
        if (mBannerController != null)
        {
            mBannerController.resetAutoPagingTimer();
        }
        AppConfigManager.get().requestDownload();
        if (SharedPreferencesUtil.shouldShowRateAppDialog(mActivity))
        {
            UserVoiceUtils.showFeedbackDialog(mActivity);
            SharedPreferencesUtil.setShowRateAppDialog(mActivity, false);
            SharedPreferencesUtil.setHasShownRateAppDialog(mActivity);
            AnalyticsHelper.post(AnalyticsHelper.prepareFeedbackPageViewEvent());
        }
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mIsVisible = true;
        if (mInStoreModuleController != null)
        {
            mInStoreModuleController.refresh();
        }
        trackPageView();
    }

    public void onShippingPassStatusEvent(ShippingPassStatusEvent shippingpassstatusevent)
    {
        WLog.d(TAG, "onShippingPassStatusEvent(): Refreshing banners");
        initBannerController();
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        mIsVisible = false;
        if (mBannerController != null)
        {
            mBannerController.pauseAutoPaging();
        }
    }

    public void onStoreUpdateEvent(com.walmart.android.util.SharedPreferencesUtil.StoreUpdateEvent storeupdateevent)
    {
        updateLocalAdEntry();
    }







}
