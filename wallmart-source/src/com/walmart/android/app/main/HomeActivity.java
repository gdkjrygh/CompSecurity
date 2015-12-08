// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.analytics.events.ShopSearchEvent;
import com.walmart.android.app.Debug;
import com.walmart.android.app.bridge.DrawerUpdateEvent;
import com.walmart.android.app.pharmacy.PharmacyActivity;
import com.walmart.android.app.shop.ShelfListPresenter;
import com.walmart.android.app.shop.search.ShopSearchData;
import com.walmart.android.config.FragmentConfig;
import com.walmart.android.data.AppConfig;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.events.ExtraFragmentSwitchedEvent;
import com.walmart.android.events.PresenterStackUpdatedEvent;
import com.walmart.android.events.ScreenStateEvent;
import com.walmart.android.events.StartupFinishedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.fragments.HybridCartFragment;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.ui.PresenterDisplayedEvent;
import com.walmart.android.util.TextUtils;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmartlabs.android.photo.controller.MainActivity;
import com.walmartlabs.payment.controller.mpay.MobilePayTransactionController;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.service.mpay.MobilePayPreferences;
import com.walmartlabs.ui.FragmentSwitchedEvent;
import com.walmartlabs.ui.FragmentSwitcher;
import com.walmartlabs.ui.PresenterFragment;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.main:
//            WalmartStartActivity, SearchContentProvider, NavigationItemUtils, BarcodeActionController, 
//            ActivityResultRouter, DrawerController, AppState, ScreenStateSyncManager, 
//            SearchActionController

public class HomeActivity extends WalmartStartActivity
{
    private static class ActivityResult
    {

        private final Intent data;
        private final int requestCode;
        private final int resultCode;




        private ActivityResult(int i, int j, Intent intent)
        {
            requestCode = i;
            resultCode = j;
            data = intent;
        }

    }


    public static final String EXTRA_ANALYTICS_ACTION = "analytics_action";
    public static final String EXTRA_ANALYTICS_CATEGORY = "analytics_category";
    public static final String EXTRA_ANALYTICS_LABEL = "analytics_label";
    public static final String EXTRA_REROUTE_TO = "reroute";
    public static final String EXTRA_SEND_ANALYTICS_EVENT = "send_analytics_event";
    public static final String EXTRA_START_SCANNER = "scanner";
    private static final long FRAGMENT_ANIMATION_TIME = 400L;
    public static final String GOOGLE_SEARCH_ACTION = "com.google.android.gms.actions.SEARCH_ACTION";
    public static final int PENDING_INTENT_REQUEST_CODE_SEARCH_WIDGET_SEARCH_HOME = 2;
    public static final int PENDING_INTENT_REQUEST_CODE_SEARCH_WIDGET_STORE_FINDER = 3;
    public static final int PENDING_INTENT_REQUEST_CODE_SEARCH_WIDGET_VIEW_HOME = 1;
    public static final int PENDING_INTENT_REQUEST_IN_STORE_MODE = 4;
    private static final String TAG = com/walmart/android/app/main/HomeActivity.getSimpleName();
    private BarcodeActionController mBarcodeActionController;
    private String mCurrentQuery;
    private DrawerController mDrawerController;
    private boolean mIsDestroyed;
    private boolean mIsPaused;
    private Menu mMenu;
    private ActivityResult mPendingActivityResult;
    private CloseFragmentEvent mPendingCloseFragmentEvent;
    private SwitchFragmentEvent mPendingSwitchFragmentEvent;
    HybridCartFragment mPreloadedCartFragment;
    private final Runnable mResetBackgroundRunnable = new Runnable() {

        final HomeActivity this$0;

        public void run()
        {
            findViewById(0x7f100209).setBackgroundDrawable(null);
        }

            
            {
                this$0 = HomeActivity.this;
                super();
            }
    };
    private long mResumeTime;
    private ScreenStateSyncManager mScreenStateSyncManager;
    private boolean mShowSearch;

    public HomeActivity()
    {
        mPreloadedCartFragment = null;
    }

    private void checkLastTransaction()
    {
        com.walmartlabs.payment.service.payment.Transaction transaction = MobilePayPreferences.getSavedTransaction(this);
        if (transaction != null)
        {
            MobilePayTransactionController.startConfirmation(this, transaction);
            MobilePayPreferences.clearSavedTransaction(this);
        }
    }

    private Intent createRouteIntentFromIntent(Intent intent)
    {
        Intent intent1 = new Intent(intent);
        if (!"android.intent.action.VIEW".equals(intent1.getAction()) || intent1.getData() == null) goto _L2; else goto _L1
_L1:
        Object obj = WalmartUri.parse(intent1.getData());
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((WalmartUri) (obj)).getType();
        JVM INSTR tableswitch 2 28: default 172
    //                   2 330
    //                   3 453
    //                   4 172
    //                   5 396
    //                   6 363
    //                   7 241
    //                   8 172
    //                   9 172
    //                   10 172
    //                   11 172
    //                   12 172
    //                   13 172
    //                   14 172
    //                   15 172
    //                   16 172
    //                   17 282
    //                   18 175
    //                   19 569
    //                   20 614
    //                   21 172
    //                   22 172
    //                   23 486
    //                   24 536
    //                   25 172
    //                   26 674
    //                   27 634
    //                   28 423;
           goto _L4 _L5 _L6 _L4 _L7 _L8 _L9 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L4 _L10 _L11 _L12 _L13 _L4 _L4 _L14 _L15 _L4 _L16 _L17 _L18
_L4:
        return intent1;
_L11:
        if (((WalmartUri) (obj)).getParam(0) != null)
        {
            intent1.putExtra("saver_bluebird_result", ((WalmartUri) (obj)).getParam(0));
            intent1.putExtra("saver_bluebird_result_text", TextUtils.urlDecode(((WalmartUri) (obj)).getParam(1)));
            intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD).getName());
            intent1.putExtra("START_SYNC", true);
            return intent1;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (((WalmartUri) (obj)).getParam(1) != null)
        {
            intent1.putExtra("item_id", ((WalmartUri) (obj)).getParam(1));
            intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.PRODUCT_DETAILS).getName());
            return intent1;
        }
        if (true) goto _L4; else goto _L10
_L10:
        intent = ((WalmartUri) (obj)).getParam(0);
        if (intent != null)
        {
            intent1.putExtra("EXTRA_TC_NUMBER", intent);
        }
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD).getName());
        intent1.putExtra("START_SYNC", true);
        return intent1;
_L5:
        intent1.putExtra("browse_token", ((WalmartUri) (obj)).getParam(0));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName());
        return intent1;
_L8:
        intent1.putExtra("shelf_id", ((WalmartUri) (obj)).getParam(0));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName());
        return intent1;
_L7:
        intent1.putExtra("start_mode", "rollbacks");
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName());
_L18:
        intent1.putExtra("start_mode", "savings_showcase");
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName());
        return intent1;
_L6:
        intent1.putExtra("promotion", ((WalmartUri) (obj)).getParam(0));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD).getName());
        return intent1;
_L14:
        intent = ((WalmartUri) (obj)).getParam(0);
        obj = ((WalmartUri) (obj)).getParam(1);
        intent1.putExtra("flyer_type", intent);
        intent1.putExtra("flyer_id", ((String) (obj)));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD).getName());
        return intent1;
_L15:
        intent1.putExtra("preview_code", ((WalmartUri) (obj)).getParam(0));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.LOCAL_AD).getName());
        return intent1;
_L12:
        intent = Uri.decode(((WalmartUri) (obj)).getParam(0));
        if (!android.text.TextUtils.isEmpty(intent))
        {
            intent1.putExtra("webview_url", intent);
            intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.WEB_FRAGMENT).getName());
            return intent1;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L13:
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.HOME).getName());
        return intent1;
_L17:
        intent1.putExtra("wishlist_id", Uri.parse(((WalmartUri) (obj)).getOriginalUri()).getQueryParameter("id"));
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.WISHLIST).getName());
        return intent1;
_L16:
        MobilePayManager.get().setManuallyEnabled(true);
        if (MobilePayManager.get().isMobilePayAvailable())
        {
            intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.MOBILE_PAY).getName());
            return intent1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!"android.intent.action.SEARCH".equals(intent1.getAction()) && !"com.google.android.gms.actions.SEARCH_ACTION".equals(intent1.getAction()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!intent1.hasExtra("query")) goto _L20; else goto _L19
_L19:
        Object obj1;
        Object obj2;
        String s;
        String s1;
        obj1 = "Exact";
        s = intent1.getStringExtra("query");
        mCurrentQuery = s;
        obj2 = null;
        s1 = intent1.getStringExtra("intent_extra_data_key");
        obj = obj1;
        intent = obj2;
        if (android.text.TextUtils.isEmpty(s1)) goto _L22; else goto _L21
_L21:
        if (!s1.equals(com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT.toString())) goto _L24; else goto _L23
_L23:
        obj = "History";
        intent = new ShopSearchData(s, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT);
_L22:
        if ("com.google.android.gms.actions.SEARCH_ACTION".equals(intent1.getAction()))
        {
            obj = "Google";
        }
        obj1 = intent;
        if (intent == null)
        {
            obj1 = new ShopSearchData(s);
        }
        intent = new ContentValues();
        intent.put("suggest_text_1", s);
        getContentResolver().insert(SearchContentProvider.CONTENT_URI, intent);
        intent1.putExtra("reroute", FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName());
        intent1.putExtras(((ShopSearchData) (obj1)).toBundle());
        MessageBus.getBus().post(new ShopSearchEvent(mCurrentQuery, ((String) (obj))));
        return intent1;
_L24:
        obj = obj1;
        intent = obj2;
        if (s1.equals(com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION.toString()))
        {
            obj = "Type Ahead";
            intent = new ShopSearchData(s, com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION);
        }
        if (true) goto _L22; else goto _L20
_L20:
        if (intent1.getData() != null)
        {
            intent = intent1.getData().toString();
            if ("reroute".equals(intent))
            {
                NavigationItemUtils.launch(this, Integer.parseInt(intent1.getStringExtra("intent_extra_data_key")));
                return intent1;
            }
            if ("scanner".equals(intent))
            {
                mBarcodeActionController.startScanner(true);
                return intent1;
            }
        } else
        {
            onSearchRequested();
            return intent1;
        }
        if (true) goto _L4; else goto _L25
_L25:
        if (!"com.walmart.android.action.SCAN".equals(intent1.getAction())) goto _L4; else goto _L26
_L26:
        boolean flag = false;
        if (!"receipt".equals(intent1.getStringExtra("type"))) goto _L28; else goto _L27
_L27:
        flag = true;
_L30:
        mBarcodeActionController.startScanner(true, flag);
        return intent1;
_L28:
        if ("barcode".equals(intent1.getStringExtra("type")))
        {
            flag = false;
        }
        if (true) goto _L30; else goto _L29
_L29:
    }

    private boolean expandSearchView()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mShowSearch)
        {
            flag = flag1;
            if (mMenu != null)
            {
                MenuItem menuitem = mMenu.findItem(0x7f100691);
                flag = flag1;
                if (menuitem != null)
                {
                    MenuItemCompat.expandActionView(menuitem);
                    flag = true;
                }
            }
        }
        return flag;
    }

    private com.walmart.android.config.FragmentConfig.FragmentName getFragmentName(Fragment fragment)
    {
        com.walmart.android.config.FragmentConfig.FragmentName fragmentname = null;
        if (fragment != null)
        {
            fragmentname = FragmentConfig.getFragmentName(fragment.getClass().getName());
        }
        return fragmentname;
    }

    private void handleAnalyticsExtra(Intent intent)
    {
        if (intent.getBooleanExtra("send_analytics_event", false))
        {
            String s = intent.getStringExtra("analytics_category");
            String s1 = intent.getStringExtra("analytics_action");
            intent = intent.getStringExtra("analytics_label");
            if (!android.text.TextUtils.isEmpty(s) && !android.text.TextUtils.isEmpty(s1))
            {
                if (intent == null)
                {
                    intent = "";
                }
                GoogleAnalytics.trackEvent(s, s1, intent);
            }
        }
    }

    private void rerouteIfRequested(Intent intent)
    {
        String s;
        Debug.logIntent(TAG, "rerouteIfRequested()", intent);
        s = intent.getStringExtra("reroute");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        switchToFragment(Class.forName(s), intent.getExtras(), false);
        return;
        intent;
        WLog.e(TAG, (new StringBuilder()).append("Could not re-route to ").append(s).toString(), intent);
        return;
    }

    private void updateSearchVisibility(String s)
    {
        String s1 = s;
        if (android.text.TextUtils.isEmpty(s))
        {
            PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
            s1 = s;
            if (presenterfragment != null)
            {
                s1 = presenterfragment.getTag();
            }
        }
        if (!FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.REGISTRY).getName().equals(s1))
        {
            boolean flag;
            if (!android.text.TextUtils.isEmpty(s1) && (s1.equals(FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.HOME).getName()) || s1.equals(FragmentConfig.getFragmentClass(com.walmart.android.config.FragmentConfig.FragmentName.SHOP).getName())))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mShowSearch = flag;
            if (mMenu != null)
            {
                s = mMenu.findItem(0x7f100691);
                if (s != null)
                {
                    s.setVisible(mShowSearch);
                }
                onPrepareOptionsMenu(mMenu);
                return;
            }
        }
    }

    protected void close()
    {
        if (System.currentTimeMillis() - mResumeTime > 700L)
        {
            PharmacyActivity.close(this);
            MainActivity.close(this);
            finish();
        }
    }

    protected PresenterFragment getFragment(Class class1)
        throws Exception
    {
        if (fragmentNameToClass(com.walmart.android.config.FragmentConfig.FragmentName.HYBRID_CART).equals(class1) && mPreloadedCartFragment != null)
        {
            class1 = mPreloadedCartFragment;
            mPreloadedCartFragment = null;
            return class1;
        } else
        {
            return super.getFragment(class1);
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (ActivityResultRouter.handleActivityResult(this, i, j, intent))
        {
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            mPendingActivityResult = new ActivityResult(i, j, intent);
            return;
        }
    }

    public void onBackPressed()
    {
        while (mIsPaused || mDrawerController != null && mDrawerController.onBackPressed()) 
        {
            return;
        }
        super.onBackPressed();
    }

    public void onCloseFragmentEvent(CloseFragmentEvent closefragmentevent)
    {
        if (mIsPaused)
        {
            mPendingCloseFragmentEvent = closefragmentevent;
        } else
        if (!mFragmentSwitcher.onBackPressed())
        {
            close();
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (mDrawerController != null)
        {
            mDrawerController.onConfigurationChanged(configuration);
        }
    }

    protected void onCreate(final Bundle routeIntent)
    {
        WLog.v(TAG, "onCreate()");
        super.onCreate(routeIntent);
        AppState.rerouteOnAppStart(this);
        ActivityResultRouter.register(this);
        mDrawerController = new DrawerController(this);
        mDrawerController.init();
        mBarcodeActionController = new BarcodeActionController(this);
        mScreenStateSyncManager = new ScreenStateSyncManager(mDrawerController);
        mScreenStateSyncManager.init();
        switchToFragment(fragmentNameToClass(com.walmart.android.config.FragmentConfig.FragmentName.HOME), null, false);
        if (getIntent() != null && (getIntent().getFlags() & 0x100000) != 0)
        {
            setIntent(new Intent());
        }
        Debug.logIntent(TAG, "onCreate()", getIntent());
        routeIntent = createRouteIntentFromIntent(getIntent());
        (new Handler()).post(new Runnable() {

            final HomeActivity this$0;
            final Intent val$routeIntent;

            public void run()
            {
                rerouteIfRequested(routeIntent);
            }

            
            {
                this$0 = HomeActivity.this;
                routeIntent = intent;
                super();
            }
        });
        if (!routeIntent.hasExtra("reroute"))
        {
            checkLastTransaction();
        }
        handleAnalyticsExtra(getIntent());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        mMenu = menu;
        MenuItemCompat.setActionProvider(menu.findItem(0x7f100693), mBarcodeActionController);
        MenuItem menuitem = menu.findItem(0x7f100691);
        menuitem.setVisible(mShowSearch);
        ((SearchActionController)MenuItemCompat.getActionProvider(menuitem)).setLoaderManager(getSupportLoaderManager());
        menu = new SearchActionController.ExpandHandler(menu, mCurrentQuery, 0x7f100691, new Integer[0]);
        mCurrentQuery = null;
        MenuItemCompat.setOnActionExpandListener(menuitem, menu);
        mScreenStateSyncManager.setSearchExpandHandler(menu);
        return flag;
    }

    protected void onDestroy()
    {
        WLog.v(TAG, "onDestroy()");
        mIsDestroyed = true;
        super.onDestroy();
        if (mScreenStateSyncManager != null)
        {
            mScreenStateSyncManager.destroy();
        }
        if (mDrawerController != null)
        {
            mDrawerController.destroy();
            mDrawerController = null;
        }
        ActivityResultRouter.unregister(this);
    }

    public void onDrawerUpdateEvent(DrawerUpdateEvent drawerupdateevent)
    {
label0:
        {
            WLog.d(TAG, (new StringBuilder()).append("onDrawerUpdateEvent(): Enable drawer = ").append(drawerupdateevent.enable).toString());
            if (mDrawerController != null)
            {
                if (drawerupdateevent.customIndicatorResId == 0)
                {
                    break label0;
                }
                mDrawerController.update(drawerupdateevent.enable, drawerupdateevent.customIndicatorResId);
            }
            return;
        }
        mDrawerController.enable(drawerupdateevent.enable, drawerupdateevent.showIndicator);
    }

    public void onFragmentSwitchedEvent(FragmentSwitchedEvent fragmentswitchedevent)
    {
        if (!mIsPaused && (!(fragmentswitchedevent instanceof ExtraFragmentSwitchedEvent) || ((ExtraFragmentSwitchedEvent)fragmentswitchedevent).getTag().equals(TAG)))
        {
            int i = getResources().getColor(0x7f0f0006);
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(0x7f02003c);
            updateSearchVisibility(fragmentswitchedevent.getTag());
            mSystemBarTintManager.setStatusBarTintColor(i);
            getSupportActionBar().setBackgroundDrawable(drawable);
            if (mDrawerController != null)
            {
                mDrawerController.closeDrawer();
                return;
            }
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        WLog.v(TAG, "onNewIntent()");
        Debug.logIntent(TAG, "onNewIntent()", intent);
        setIntent(intent);
        Intent intent1 = createRouteIntentFromIntent(intent);
        rerouteIfRequested(intent1);
        if (!intent1.hasExtra("reroute"))
        {
            checkLastTransaction();
        }
        handleAnalyticsExtra(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (mDrawerController != null && mDrawerController.onOptionsItemSelected(menuitem))
        {
            return true;
        } else
        {
            MessageBus.getBus().post(new ScreenStateEvent(1));
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        WLog.v(TAG, "onPause()");
        super.onPause();
        mIsPaused = true;
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        if (mDrawerController != null)
        {
            mDrawerController.syncState();
        }
    }

    public void onPresenterDisplayed(PresenterDisplayedEvent presenterdisplayedevent)
    {
        if (presenterdisplayedevent.presenter != null)
        {
            presenterdisplayedevent = presenterdisplayedevent.presenter.getScreenName();
            if (!android.text.TextUtils.isEmpty(presenterdisplayedevent))
            {
                MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", presenterdisplayedevent));
            }
        }
    }

    public void onPresenterStackUpdatedEvent(PresenterStackUpdatedEvent presenterstackupdatedevent)
    {
        PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
        if (presenterfragment != null && presenterstackupdatedevent.fragmentName != null && presenterstackupdatedevent.fragmentName.equals(getFragmentName(presenterfragment)))
        {
            if (mDrawerController != null)
            {
                mDrawerController.enable(true);
            }
            if (mCurrentQuery != null && !(presenterstackupdatedevent.onTop instanceof ShelfListPresenter))
            {
                mCurrentQuery = null;
            }
            getSupportActionBar().setTitle(presenterstackupdatedevent.onTop.getTitleText());
        }
        supportInvalidateOptionsMenu();
    }

    protected void onResume()
    {
        WLog.v(TAG, "onResume()");
        super.onResume();
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        mIsPaused = false;
        updateSearchVisibility(null);
        mResumeTime = System.currentTimeMillis();
        if (mPendingActivityResult == null) goto _L2; else goto _L1
_L1:
        if (mPendingActivityResult.requestCode != 1001) goto _L4; else goto _L3
_L3:
        mBarcodeActionController.onScanResult(mPendingActivityResult.resultCode, mPendingActivityResult.data);
_L6:
        mPendingActivityResult = null;
_L2:
        if (mPendingSwitchFragmentEvent != null)
        {
            onSwitchFragmentEvent(mPendingSwitchFragmentEvent);
            mPendingSwitchFragmentEvent = null;
        }
        if (mPendingCloseFragmentEvent != null)
        {
            onCloseFragmentEvent(mPendingCloseFragmentEvent);
            mPendingCloseFragmentEvent = null;
        }
        return;
_L4:
        PresenterFragment presenterfragment = mFragmentSwitcher.getTopFragment();
        if (presenterfragment != null)
        {
            presenterfragment.onActivityResult(mPendingActivityResult.requestCode, mPendingActivityResult.resultCode, mPendingActivityResult.data);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onSearchRequested()
    {
        if (expandSearchView())
        {
            return true;
        } else
        {
            return super.onSearchRequested();
        }
    }

    public void onStartupFinished(StartupFinishedEvent startupfinishedevent)
    {
        startupfinishedevent = AppConfigManager.get().getAppConfig();
        if (startupfinishedevent != null && !((AppConfig) (startupfinishedevent)).mitigateStartupRequests && mPreloadedCartFragment == null)
        {
            mPreloadedCartFragment = new HybridCartFragment();
            mPreloadedCartFragment.preload(this);
        }
    }

    public void onSwitchFragmentEvent(SwitchFragmentEvent switchfragmentevent)
    {
        if (mIsPaused)
        {
            mPendingSwitchFragmentEvent = switchfragmentevent;
            return;
        } else
        {
            switchToFragment(fragmentNameToClass(switchfragmentevent.fragmentName), switchfragmentevent.arguments, switchfragmentevent.backToCurrentFragment);
            return;
        }
    }


}
