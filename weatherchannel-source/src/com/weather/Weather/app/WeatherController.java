// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.comscore.analytics.comScore;
import com.facebook.Session;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.sessionm.api.AchievementData;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.api.User;
import com.weather.Weather.feed.ActionBarAlphaSetter;
import com.weather.Weather.feed.AlphaSettingScrollListener;
import com.weather.Weather.feed.BannerFadeScrollListener;
import com.weather.Weather.feed.BounceScrollListener;
import com.weather.Weather.feed.FeedJumpController;
import com.weather.Weather.feed.ListAutoScroller;
import com.weather.Weather.feed.Module;
import com.weather.Weather.feed.ModuleListAdapter;
import com.weather.Weather.feed.ModuleVisibilityScrollListener;
import com.weather.Weather.feed.ModulesManager;
import com.weather.Weather.feed.ScrollToTopScrollListener;
import com.weather.Weather.feed.StandardFeedAdConfigSupplier;
import com.weather.Weather.feed.SwipeTutorialController;
import com.weather.Weather.feed.TutorialScrollListener;
import com.weather.Weather.feedback.NpsAppRater;
import com.weather.Weather.lastupdate.LastUpdatedUtil;
import com.weather.Weather.locations.LocationDisplayData;
import com.weather.Weather.locations.TypeAheadSearchViewUtil;
import com.weather.Weather.locations.WeatherLocationListAdapter;
import com.weather.Weather.metric.MetricUtil;
import com.weather.Weather.settings.SettingsActivity;
import com.weather.Weather.ui.DropDownNavigationListenerClass;
import com.weather.Weather.ui.FrontPageView;
import com.weather.Weather.ui.PullToRefreshListView;
import com.weather.Weather.ui.Refreshable;
import com.weather.ads2.config.AdConfigManager;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.config.ModulesConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationReceiver;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.news.provider.BreakingNewsService;
import com.weather.commons.news.provider.NewsDownloadService;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.tropical.StormDataManager;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.location.LocationSyncScheduler;
import com.weather.commons.ups.backend.location.UserPresentIntentReceiver;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.commons.video2.VideoManager;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.CurrentLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.dal2.weatherconnections.RequestManager;
import com.weather.dal2.weatherconnections.WeatherDataError;
import com.weather.facade.WeatherDataManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import com.weather.util.device.DeviceUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.metric.MetricRegistry;
import com.weather.util.metric.TimerMetric;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import com.weather.util.ui.CompositeOnScrollListener;
import com.weather.util.ui.Dimension;
import dagger.ObjectGraph;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.app:
//            FeedAnalyticsManager, HomeScreenUI, FlagshipApplication, HomeScreen, 
//            MainFeedModulesFactory, ViewSizeUtils, NoLocationActivity

public final class WeatherController extends TWCBaseActivity
    implements Refreshable, SessionListener
{
    private final class RunnableRandomIcon
        implements Runnable
    {

        private final Random generator = new Random();
        private int lastIdIndex;
        private final TextView lastUpdatedText;
        private final View overlay;
        private final ImageView refreshIconView;
        private final TextView refreshText;
        final WeatherController this$0;

        public void run()
        {
            Resources resources = AbstractTwcApplication.getRootContext().getResources();
            lastUpdatedText.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, recordCreationTime, System.currentTimeMillis()));
            refreshText.setText(resources.getString(0x7f070220));
            if (WeatherController.showRandomIcon)
            {
                int j = generator.nextInt(WxIconItem.SVG_IDS.size());
                int i = j;
                if (j == lastIdIndex)
                {
                    i = (j + 1) % WxIconItem.SVG_IDS.size();
                }
                lastIdIndex = i;
                android.graphics.Bitmap bitmap = WxIconBitmapCache.getBitmap(((Integer)WxIconItem.SVG_IDS.get(i)).intValue());
                refreshIconView.setImageBitmap(bitmap);
                overlay.postDelayed(this, 600L);
            }
        }

        RunnableRandomIcon(View view)
        {
            this$0 = WeatherController.this;
            super();
            overlay = view;
            refreshIconView = (ImageView)view.findViewById(0x7f0d01eb);
            refreshText = (TextView)view.findViewById(0x7f0d01ec);
            lastUpdatedText = (TextView)view.findViewById(0x7f0d01ed);
        }
    }

    private class ScrollCurrentConditionsOnClickListener
        implements android.view.View.OnClickListener
    {

        final WeatherController this$0;

        public void onClick(View view)
        {
            recordButtonPress(LocalyticsFeedButton.COIN);
            scrollToModule("current-conditions");
        }

        private ScrollCurrentConditionsOnClickListener()
        {
            this$0 = WeatherController.this;
            super();
        }

    }


    private static final String FEED_AD_PREFIX = "weather.feed";
    private static final long ICON_SWAPPING_DELAY = 600L;
    private static final int NO_LOCATION_REQUEST = 661;
    private static final String PREF_SHOW_TUTORIAL_FIRST_LAUNCH = "show_tutorial_first_launch";
    private static final int REFRESH_DURATION = 2000;
    private static final String RESTARTING_KEY_EXTRA = "com.weather.restart";
    private static final String TAG = "WeatherController";
    private static boolean showRandomIcon;
    private int actionBarHeight;
    private AlphaSettingScrollListener alphaSettingScrollListener;
    ImageView backTopView;
    private RelativeLayout circleLayout;
    private final FeedAnalyticsManager feedAnalyticsManager;
    private FeedJumpController feedJumpController;
    FrontPageView header;
    HomeScreen homeScreen;
    private final Handler homeScreenHandler = new Handler();
    private Map jumpToTargetingParams;
    private long lastTimeUserRefreshed;
    private ListAutoScroller listAutoScroller;
    private LocationManager locationManager;
    PullToRefreshListView moduleListView;
    private ModulesManager modulesManager;
    LinearLayout nowTutorialContainer;
    private RunnableRandomIcon randomIconRunnable;
    private long recordCreationTime;
    private TypeAheadSearchViewUtil typeAheadSearchViewUtil;
    private WeatherLocationListAdapter weatherLocationListAdapter;

    public WeatherController()
    {
        lastTimeUserRefreshed = System.currentTimeMillis();
        jumpToTargetingParams = ImmutableMap.of();
        feedAnalyticsManager = new FeedAnalyticsManager(DataAccessLayer.BUS, LocalyticsHandler.getInstance(), LocationManager.getLocationManager());
    }

    private android.widget.AbsListView.OnScrollListener buildScrollListener()
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        builder.add(new ScrollToTopScrollListener(backTopView));
        builder.add(new BounceScrollListener(header));
        alphaSettingScrollListener = new AlphaSettingScrollListener(header, moduleListView, 248, header.getContext().getResources().getInteger(0x7f090003));
        alphaSettingScrollListener.addViewToUpdate(new ActionBarAlphaSetter(this, moduleListView));
        alphaSettingScrollListener.addViewToUpdate(homeScreen);
        builder.add(alphaSettingScrollListener);
        builder.add(new BannerFadeScrollListener(getUiFields().nowSevereAlerts, header, new Predicate() {

            final WeatherController this$0;

            public volatile boolean apply(Object obj)
            {
                return apply((Void)obj);
            }

            public boolean apply(Void void1)
            {
                return desiredSevereAlertVisibility() == 0;
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        }));
        builder.add(new TutorialScrollListener(nowTutorialContainer));
        ModuleVisibilityScrollListener modulevisibilityscrolllistener = new ModuleVisibilityScrollListener(moduleListView);
        listAutoScroller.addListener(modulevisibilityscrolllistener);
        builder.add(modulevisibilityscrolllistener);
        builder.add(new android.widget.AbsListView.OnScrollListener() {

            final WeatherController this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if (i != 0)
                {
                    LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.SCROLLED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                }
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
        return new CompositeOnScrollListener(builder.build());
    }

    private void checkAccountLoginStatus()
    {
        (new Thread(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                AccountManager.getInstance().fixLoggedAccountId();
                doCheckAccountLoginStatus();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        }, "CheckUserLoginStatus")).start();
    }

    private void doCheckAccountLoginStatus()
    {
        Object obj;
        com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus loginstatus;
        obj = AccountManager.getInstance();
        loginstatus = ((AccountManager) (obj)).getLoginStatus();
        static class _cls15
        {

            static final int $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[];

            static 
            {
                $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus = new int[com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.values().length];
                try
                {
                    $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_OUT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$commons$ups$backend$UpsCommonUtil$LoginStatus[com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.TOKEN_EXPIRED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls15..SwitchMap.com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus[loginstatus.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 83
    //                   2 204
    //                   3 245
    //                   4 286;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        LogUtil.w("WeatherController", LoggingMetaTags.TWC_UPS, "User login status unknown: %s", new Object[] {
            loginstatus
        });
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.UNKNOWN.getValue());
        return;
_L2:
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UPS, "User logged out, logging in to ANON", new Object[0]);
        if (Session.getActiveSession() != null)
        {
            Session.getActiveSession().closeAndClearTokenInformation();
        }
        ((AccountManager) (obj)).createAnonAccount();
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT.getValue());
_L6:
        KahunaEvents.getInstance().setLoggedInAttribute(false, "5.12.0");
        return;
        obj;
_L7:
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.UNKNOWN.getValue());
        Log.e("WeatherController", (new StringBuilder()).append("unexpected: ").append(obj.getClass().getSimpleName()).append(':').append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
          goto _L6
_L3:
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UPS, "User logged out, already logged into ANON", new Object[0]);
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_ANON_ACCOUNT.getValue());
        KahunaEvents.getInstance().setLoggedInAttribute(false, "5.12.0");
        return;
_L4:
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UPS, "User logged in", new Object[0]);
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.LOGGED_IN_TO_NAMED_ACCOUNT.getValue());
        KahunaEvents.getInstance().setLoggedInAttribute(true, "5.12.0");
        return;
_L5:
        LogUtil.w("WeatherController", LoggingMetaTags.TWC_UPS, "User token expired", new Object[0]);
        TwcPrefs.getInstance().putInt(com.weather.util.prefs.TwcPrefs.Keys.USER_LOGIN_STATUS, com.weather.commons.ups.backend.UpsCommonUtil.LoginStatus.TOKEN_EXPIRED.getValue());
        ((AccountManager) (obj)).logout(false);
        return;
        obj;
          goto _L7
        obj;
          goto _L7
    }

    private int getActionBarHeight()
    {
        if (actionBarHeight == 0)
        {
            TypedValue typedvalue = new TypedValue();
            int i = 145;
            if (getTheme().resolveAttribute(0x10102eb, typedvalue, true))
            {
                i = TypedValue.complexToDimensionPixelSize(typedvalue.data, getResources().getDisplayMetrics());
                if (i <= 0)
                {
                    i = 143;
                    LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "getActionBarHeight: using guess 2, resource in theme was 0. newActionBarHeight=%s", new Object[] {
                        Integer.valueOf(143)
                    });
                } else
                {
                    LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "getActionBarHeight: using action bar height from theme. newActionBarHeight=%s", new Object[] {
                        Integer.valueOf(i)
                    });
                }
            } else
            {
                LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "getActionBarHeight: using guess 1, no resource in theme. newActionBarHeight=%s", new Object[] {
                    Integer.valueOf(145)
                });
            }
            actionBarHeight = i;
        }
        return actionBarHeight;
    }

    private int getOffset(int i, int j)
    {
        if (i < j - 1)
        {
            return getActionBarHeight();
        } else
        {
            return 0;
        }
    }

    static Dimension getScreenDimension()
    {
        Prefs prefs = TwcPrefs.getInstance();
        if (prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_WIDTH) && prefs.contains(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_HEIGHT))
        {
            return new Dimension(prefs.getInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_WIDTH, 0), prefs.getInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_HEIGHT, 0));
        } else
        {
            return null;
        }
    }

    private void handleIntent()
    {
        int i = 0;
        Intent intent = getIntent();
        if (intent != null)
        {
            Object obj = intent.getExtras();
            Iterable iterable = LoggingMetaTags.TWC_UI;
            if (obj != null)
            {
                i = ((Bundle) (obj)).size();
            }
            LogUtil.d("WeatherController", iterable, "handleIntent intent=%s, extras size=%s, extras=%s", new Object[] {
                intent, Integer.valueOf(i), obj
            });
            if (obj != null)
            {
                if ("android.intent.action.SEARCH".equals(intent.getAction()))
                {
                    String s = ((Bundle) (obj)).getString("query");
                    typeAheadSearchViewUtil.doSearch(s);
                }
                if (((Bundle) (obj)).containsKey(AlertResponseField.PRODUCT.getName()))
                {
                    obj = ((Bundle) (obj)).getString(AlertResponseField.PRODUCT.getName());
                    if (ProductType.PRODUCT_POLLEN.getProductName().equals(obj))
                    {
                        AlertList.pollenList.clearList();
                        return;
                    }
                }
            }
        }
    }

    private void initSync()
    {
        if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.APP_FIRST_LAUNCH, false))
        {
            Intent intent = new Intent();
            intent.setAction(getString(0x7f07048f));
            sendBroadcast(intent);
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.APP_FIRST_LAUNCH, true);
        }
        if (DeviceUtils.isNetworkAvailable(AbstractTwcApplication.getRootContext()))
        {
            UserPresentIntentReceiver.registerUserPresentReceiver(AbstractTwcApplication.getRootContext());
        }
    }

    private void scrollToPosition(int i)
    {
        if (i >= 0)
        {
            int j = getOffset(i, moduleListView.getCount());
            LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "scrollToPosition: position=%s, offset=%s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            listAutoScroller.smoothScrollToPositionFromTop(i, j);
        }
    }

    private void setCurrentLocation(Bundle bundle)
    {
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "setCurrentLocation: bundle=%s", new Object[] {
            bundle
        });
        if (bundle == null)
        {
            locationManager.setCurrentLocation();
        } else
        if (!bundle.getBoolean("com.weather.restart"))
        {
            String s = bundle.getString("com.weather.Weather.ui.LOCATION_KEY");
            if (s == null)
            {
                s = bundle.getString(AlertResponseField.PRODUCT.getName());
                if (ProductType.PRODUCT_POLLEN.getProductName().equals(s))
                {
                    bundle = bundle.getString(AlertResponseField.LOCATION_CODE.getName());
                    if (bundle != null)
                    {
                        locationManager.setCurrentLocation(bundle, "WeatherController.setCurrentLocation(extras)");
                        return;
                    }
                }
            } else
            {
                SessionMUtils.logAction("widget_app_launch");
                locationManager.setToWidgetLocation(s);
                return;
            }
        }
    }

    private void setLocationAndJumpVariables()
    {
        int i = 0;
        Object obj = getIntent();
        if (obj != null)
        {
            Bundle bundle = ((Intent) (obj)).getExtras();
            Iterable iterable = LoggingMetaTags.TWC_UI;
            if (bundle != null)
            {
                i = bundle.size();
            }
            LogUtil.d("WeatherController", iterable, "setLocationAndJumpPosition intent=%s, extras size=%s, extras=%s", new Object[] {
                obj, Integer.valueOf(i), bundle
            });
            obj = LocationUtils.getViewIntentUri(((Intent) (obj)));
            if (obj != null)
            {
                LocationUtils.addLocationFromUri(((android.net.Uri) (obj)));
            } else
            {
                setCurrentLocation(bundle);
            }
            feedJumpController.setJumpVariables(bundle);
        }
    }

    private boolean setModules()
    {
        boolean flag = modulesManager.refreshModulesList(feedJumpController.getConfigOverride());
        if (flag)
        {
            ModuleListAdapter modulelistadapter = new ModuleListAdapter(modulesManager.getModules());
            moduleListView.setAdapter(modulelistadapter);
            modulesManager.createAdViews(moduleListView, modulelistadapter);
        }
        return flag;
    }

    public static void setShowRandomIcon(boolean flag)
    {
        showRandomIcon = flag;
    }

    private void setupActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setNavigationMode(1);
            actionbar.setListNavigationCallbacks(weatherLocationListAdapter, new DropDownNavigationListenerClass(this, "mainFeed", FlagshipApplication.getInstance().getLocationManager()));
            actionbar.setDisplayShowTitleEnabled(false);
        }
    }

    private void startRefreshAnimation()
    {
        circleLayout.removeCallbacks(randomIconRunnable);
        circleLayout.post(randomIconRunnable);
    }

    private void stopRefreshAnimation()
    {
        circleLayout.removeCallbacks(randomIconRunnable);
    }

    public int desiredSevereAlertVisibility()
    {
        return !homeScreen.getUiFields().doAlertsExistForLocation() || moduleListView.getFirstVisiblePosition() != 0 ? 8 : 0;
    }

    public HomeScreenUI getUiFields()
    {
        return homeScreen.getUiFields();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 661 && j == 0)
        {
            finish();
        }
    }

    public void onBreakingNewsRefresh(com.weather.commons.news.provider.BreakingNewsService.BreakingNewsFeedRefresh breakingnewsfeedrefresh)
    {
        runOnUiThread(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                setModules();
                stopRefreshAnimation();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
    }

    protected void onCreate(Bundle bundle)
    {
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "onCreate: savedInstanceState=%s", new Object[] {
            bundle
        });
        super.onCreate(bundle);
        FlagshipApplication flagshipapplication = FlagshipApplication.getInstance();
        locationManager = flagshipapplication.getLocationManager();
        boolean flag;
        try
        {
            flag = ConfigurationManagers.getInstance().getFlagshipConfig().hurricaneCentralEnabled;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new IllegalStateException("Unable to get flagship config", bundle);
        }
        modulesManager = new ModulesManager(this, new Supplier() {

            final WeatherController this$0;

            public ModulesConfig get()
            {
                ModulesConfig modulesconfig;
                try
                {
                    modulesconfig = ConfigurationManagers.getInstance().getModulesConfig();
                }
                catch (ConfigException configexception)
                {
                    throw new IllegalStateException("Module configuration is invalid", configexception);
                }
                return modulesconfig;
            }

            public volatile Object get()
            {
                return get();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        }, new StandardFeedAdConfigSupplier(AdConfigManager.INSTANCE, "weather.feed"), new MainFeedModulesFactory(flag));
        setContentView(0x7f030002);
        moduleListView = (PullToRefreshListView)findViewById(0x7f0d0028);
        listAutoScroller = new ListAutoScroller(moduleListView);
        feedJumpController = new FeedJumpController(modulesManager, listAutoScroller, moduleListView);
        if (bundle != null)
        {
            setCurrentLocation(bundle);
            feedJumpController.setJumpVariables(bundle);
        } else
        {
            setLocationAndJumpVariables();
            jumpToTargetingParams = getInitialTargetingParameters(getIntent());
        }
        header = (FrontPageView)LayoutInflater.from(this).inflate(0x7f03007d, moduleListView, false);
        moduleListView.setActivity(this, header);
        randomIconRunnable = new RunnableRandomIcon(header);
        circleLayout = (RelativeLayout)header.findViewById(0x7f0d01e4);
        circleLayout.setDrawingCacheEnabled(false);
        nowTutorialContainer = (LinearLayout)header.findViewById(0x7f0d01e7);
        backTopView = (ImageView)findViewById(0x7f0d002a);
        weatherLocationListAdapter = new WeatherLocationListAdapter(this, flagshipapplication.getWeatherDataManager().getLocationDisplayData());
        setupActionBar();
        (new Thread(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                try
                {
                    (new NpsAppRater()).showPopUps(WeatherController.this);
                    return;
                }
                catch (Throwable throwable)
                {
                    Log.e("WeatherController", "Ignoring NpsAppRater exception", throwable);
                }
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        }, "app-rater")).start();
        bundle = getScreenDimension();
        if (bundle != null)
        {
            header.setHeightWidth(bundle.getWidth(), bundle.getHeight());
        } else
        {
            ViewSizeUtils.registerToCalculateViewDimensions(this, 0x7f0d0027, new ViewSizeUtils.OnDimensionsFoundListener() {

                final WeatherController this$0;

                public void onDimensionsFound(int i, int j)
                {
                    Prefs prefs = TwcPrefs.getInstance();
                    prefs.putInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_WIDTH, i);
                    prefs.putInt(com.weather.util.prefs.TwcPrefs.Keys.SCREEN_HEIGHT, j);
                    header.setHeightWidth(i, j);
                }

            
            {
                this$0 = WeatherController.this;
                super();
            }
            });
        }
        moduleListView.addHeaderView(header);
        initSync();
        homeScreen = new HomeScreen(this);
        moduleListView.setOnScrollListener(buildScrollListener());
        backTopView.setOnClickListener(new android.view.View.OnClickListener() {

            final WeatherController this$0;

            public void onClick(View view)
            {
                boolean flag1;
                if (moduleListView != null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsFeedButton.BACK_TO_TOP, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                    listAutoScroller.smoothScrollToTop();
                }
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
        (new SwipeTutorialController(nowTutorialContainer, "show_tutorial_first_launch")).firstTimeLaunchTutorial();
        bundle = new ScrollCurrentConditionsOnClickListener();
        circleLayout.setOnClickListener(bundle);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f100003, menu);
        TypeAheadSearchViewUtil typeaheadsearchviewutil = new TypeAheadSearchViewUtil(menu, 0x7f0d035b, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED));
        typeaheadsearchviewutil.setupMainFeedSearchView(this, -1);
        typeAheadSearchViewUtil = typeaheadsearchviewutil;
        addSessionMButton(menu);
        return true;
    }

    public void onCurrentWeatherFacade(final CurrentWeatherFacade cwf)
    {
        runOnUiThread(new Runnable() {

            final WeatherController this$0;
            final CurrentWeatherFacade val$cwf;

            public void run()
            {
                stopRefreshAnimation();
                if (homeScreen.getUiFields() != null)
                {
                    if (cwf.isEmpty())
                    {
                        homeScreen.getUiFields().setNoCurrentWeather();
                        recordCreationTime = 0L;
                    } else
                    {
                        homeScreen.getUiFields().setCurrentWeather(cwf);
                        recordCreationTime = cwf.getRecordCreationTime();
                        MetricUtil.recordAppLaunchMetrics(MetricRegistry.getInstance(), cwf);
                        if (cwf.getRecordSetsSource() == com.weather.dal2.dsx.RecordSets.RecordSetsSource.NETWORK)
                        {
                            MetricRegistry.getInstance().timer(com.weather.util.metric.Metric.MetricTag.TIMER_PULL_TO_REFRESH_DISPLAY.getMetricName()).stop();
                            return;
                        }
                    }
                }
            }

            
            {
                this$0 = WeatherController.this;
                cwf = currentweatherfacade;
                super();
            }
        });
    }

    public void onDestroy()
    {
        modulesManager.destroyModules();
        homeScreen.onActivityDestroy();
        super.onDestroy();
    }

    public void onLocationDisplayChange(LocationDisplayData locationdisplaydata)
    {
        runOnUiThread(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                setActionBarToCurrentLocation();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
    }

    public void onNewIntent(Intent intent)
    {
        int i = 0;
        Bundle bundle = intent.getExtras();
        Iterable iterable = LoggingMetaTags.TWC_UI;
        if (bundle != null)
        {
            i = bundle.size();
        }
        LogUtil.d("WeatherController", iterable, "onNewIntent intent=%s, extras size=%s, extras=%s", new Object[] {
            intent, Integer.valueOf(i), bundle
        });
        super.onNewIntent(intent);
        setIntent(intent);
        setLocationAndJumpVariables();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131559259 2131559264: default 44
    //                   2131559259 80
    //                   2131559260 44
    //                   2131559261 56
    //                   2131559262 44
    //                   2131559263 44
    //                   2131559264 50;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L4
_L1:
        return super.onOptionsItemSelected(menuitem);
_L4:
        runRefresh();
        return true;
_L3:
        recordButtonPress(LocalyticsFeedButton.MENU);
        startActivity(new Intent(this, com/weather/Weather/settings/SettingsActivity));
        return true;
_L2:
        recordButtonPress(LocalyticsFeedButton.PLUS);
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        if (weatherLocationListAdapter != null)
        {
            weatherLocationListAdapter.unregister();
        }
        feedAnalyticsManager.onFeedPause();
        modulesManager.pauseModules();
        comScore.onExitForeground();
        homeScreenHandler.post(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                homeScreen.onActivityPaused();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
        setIntent(new Intent());
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        ((StormDataManager)FlagshipApplication.getInstance().getBaseObjectGraph().get(com/weather/commons/tropical/StormDataManager)).refresh();
        if (!locationManager.hasLocation())
        {
            startActivityForResult(new Intent(this, com/weather/Weather/app/NoLocationActivity), 661);
            return;
        }
        weatherLocationListAdapter.register();
        locationManager.enableLbs();
        if (SessionMUtils.isActive() && !TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
        {
            SessionMUtils.syncOptOut();
            SessionM.getInstance().onActivityResume(this);
        }
        invalidateOptionsMenu();
        handleIntent();
        if (!setModules())
        {
            modulesManager.resumeModules();
        }
        for (Iterator iterator = modulesManager.getModules().iterator(); iterator.hasNext(); ((Module)iterator.next()).markModuleInFeed()) { }
        setActionBarToCurrentLocation();
        checkAccountLoginStatus();
        startService(NewsDownloadService.getTopStoriesIntent(this, false));
        startService(BreakingNewsService.getBreakingNewsIntent(this, false));
        LocalyticsHandler.getInstance().tagEvent(LocalyticsEvent.FEED_RESUMED);
        feedJumpController.jump(jumpToTargetingParams, getActionBarHeight());
        feedJumpController.resetJumpVariables();
        jumpToTargetingParams = ImmutableMap.of();
        homeScreenHandler.post(new Runnable() {

            final WeatherController this$0;

            public void run()
            {
                alphaSettingScrollListener.updateAlphas();
                homeScreen.onActivityResumed();
            }

            
            {
                this$0 = WeatherController.this;
                super();
            }
        });
        feedAnalyticsManager.onFeedResume();
        DataAccessLayer.BUS.register(this);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("com.weather.restart", true);
        if (feedJumpController != null)
        {
            feedJumpController.saveInstanceState(bundle);
        }
        super.onSaveInstanceState(bundle);
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("onSaveInstanceState outState=").append(bundle).toString(), new Object[0]);
    }

    public void onSessionFailed(SessionM sessionm, int i)
    {
    }

    public void onSessionStateChanged(SessionM sessionm, com.sessionm.api.SessionM.State state)
    {
        invalidateOptionsMenu();
    }

    protected void onStart()
    {
        super.onStart();
        LocationSyncScheduler.reScheduleSync(this, 1L, false, true);
        LocationSyncScheduler.cancelAlarm();
    }

    public void onUnclaimedAchievement(SessionM sessionm, AchievementData achievementdata)
    {
    }

    public void onUserClickedNewLocationEvent(com.weather.commons.locations.LocationReceiver.UserClickedNewLocationEvent userclickednewlocationevent)
    {
        boolean flag;
        if (moduleListView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            runOnUiThread(new Runnable() {

                final WeatherController this$0;

                public void run()
                {
                    listAutoScroller.smoothScrollToTop();
                }

            
            {
                this$0 = WeatherController.this;
                super();
            }
            });
        }
    }

    public void onUserUpdated(SessionM sessionm, User user)
    {
        invalidateOptionsMenu();
    }

    public void onWeatherDataError(final WeatherDataError event)
    {
        if (CurrentLocation.getInstance().isCurrentLocation(event.getLocation()))
        {
            runOnUiThread(new Runnable() {

                final WeatherController this$0;
                final WeatherDataError val$event;

                public void run()
                {
                    if (event.postedStaleData())
                    {
                        String s = getResources().getString(0x7f0700e3);
                        Toast.makeText(WeatherController.this, s, 0).show();
                    }
                    stopRefreshAnimation();
                    if (homeScreen != null)
                    {
                        homeScreen.getUiFields().setFrontCircleVisible();
                    }
                }

            
            {
                this$0 = WeatherController.this;
                event = weatherdataerror;
                super();
            }
            });
        }
    }

    public void runRefresh()
    {
        if (System.currentTimeMillis() - lastTimeUserRefreshed > 2000L)
        {
            lastTimeUserRefreshed = System.currentTimeMillis();
            Analytics.trackAction(getString(0x7f0704c7), null);
            FlagshipApplication.getInstance().getVideoManager().invalidateAll();
            RequestManager.getInstance().doForcedRefresh();
            header.findViewById(0x7f0d01e5).setVisibility(0);
            ((ProgressBar)header.findViewById(0x7f0d01ea)).setVisibility(0);
            setShowRandomIcon(true);
            startRefreshAnimation();
            startService(NewsDownloadService.getTopStoriesIntent(this, true));
            startService(BreakingNewsService.getBreakingNewsIntent(this, true));
            modulesManager.runRefresh();
        }
    }

    void scrollToModule(String s)
    {
        int i = modulesManager.getModulePosition(s);
        LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "scrollToModule: moduleName=%s, modulePosition=%s", new Object[] {
            s, Integer.valueOf(i)
        });
        scrollToPosition(i);
    }

    public void setActionBarToCurrentLocation()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null && actionbar.getNavigationItemCount() > 1)
        {
            int i = locationManager.getNavigationIndex();
            LogUtil.d("WeatherController", LoggingMetaTags.TWC_UI, "setActionBarToCurrentLocation navigationIndex=%s", new Object[] {
                Integer.valueOf(i)
            });
            actionbar.setSelectedNavigationItem(i);
        }
    }






/*
    static long access$402(WeatherController weathercontroller, long l)
    {
        weathercontroller.recordCreationTime = l;
        return l;
    }

*/




}
