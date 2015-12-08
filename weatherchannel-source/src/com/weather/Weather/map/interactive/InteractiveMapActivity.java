// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ToggleButton;
import com.android.debug.hv.ViewServer;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.common.base.Objects;
import com.sessionm.api.SessionM;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.hurricane.HurricaneCentralActivity;
import com.weather.Weather.locations.LocationDisplayData;
import com.weather.Weather.locations.TypeAheadSearchViewUtil;
import com.weather.Weather.locations.WeatherLocationListAdapter;
import com.weather.Weather.map.interactive.fragments.TwcMapAuxiliaryFragment;
import com.weather.Weather.ui.DropDownNavigationListenerClass;
import com.weather.ads2.ui.AdHolder;
import com.weather.ads2.ui.DfpAd;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.analytics.LocalyticsEvent;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.MultiActivitySummaryManager;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.analytics.hurricane.HurricaneCentralSummaryRecorder;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.commons.config.ActivitiesConfig;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationReceiver;
import com.weather.commons.locations.LocationUtils;
import com.weather.commons.push.AlertList;
import com.weather.commons.push.AlertResponseField;
import com.weather.commons.push.ProductType;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.StormDataManager;
import com.weather.commons.tropical.Storms;
import com.weather.commons.ui.PortalButton;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.ExceptionUtil;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.LocaleUtil;
import com.weather.util.geometry.LatLng;
import com.weather.util.geometry.LatLngBounds;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import com.weather.util.sessionm.SessionMUtils;
import com.wsi.android.framework.settings.helpers.MapViewType;
import com.wsi.android.framework.settings.helpers.MeasurementUnits;
import com.wsi.android.framework.ui.map.GoogleGeoPoint;
import com.wsi.android.framework.ui.map.WSIMapView;
import com.wsi.android.framework.ui.utils.Navigator;
import com.wsi.android.framework.wxdata.utils.tessera.LayerDisplayMode;
import com.wsi.android.weather.ui.LayerItem;
import com.wsi.android.weather.ui.MapApplication;
import com.wsi.android.weather.ui.WSIMapActivity;
import com.wsi.android.weather.utils.WSIMapActivityNavigationManager;
import com.wsi.android.weather.utils.settings.GeoOverlayManager;
import com.wsi.android.weather.utils.settings.MapSettingsAccessor;
import com.wsi.android.weather.utils.settings.MapSkinSettings;
import com.wsi.android.weather.utils.settings.WSIMapAPI;
import dagger.ObjectGraph;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.weather.Weather.map.interactive:
//            TwcActivityNavigationManager, RouteUtil, Layers, BoundingBox

public final class InteractiveMapActivity extends WSIMapActivity
    implements com.weather.Weather.map.interactive.fragments.TwcMapPastFutureFragment.TwcPastFutureListener, android.view.View.OnClickListener
{

    private static final String AD_LAYER_TARGET_PARAM = "mlayer";
    private static final String AD_TARGET_ROAD_WEATHER_INDEX_LAYER = "driving";
    public static final String DRIVING_DIFFICULTY_INDEX_EXTRA_KEY = "com.weather.Weather.hurricane.DRIVING_DIFFICULTY_INDEX_ARG_KEY";
    public static final String HURRICANE_CENTRAL_EXTRA_KEY = "com.weather.Weather.hurricane.HURRICANE_CENTRAL_ARG_KEY";
    private static final int MAPS_OFF = 0;
    private static final int MAPS_ON = 1;
    public static final String MAP_ALERTS_FRAGMENT_TAG = "map_alerts_fragment";
    public static final String MAP_PAST_FUTURE_FRAGMENT_TAG = "map_past_future_fragment";
    public static final String MAP_SETTINGS_FRAGMENT_TAG = "map_settings_fragment";
    private static final int ROAD_WEATHER_INDEX = 52;
    private static final String ROAD_WEATHER_INDEX_LAYER_ID = "0052";
    public static final String STORM_ID_EXTRA_KEY = "com.weather.Weather.hurricane.STORM_ID_ARG_KEY";
    private static final int STORM_TRACKS_ID = 2;
    private static final String TAG = "InteractiveMapActivity";
    private static final int TROPICAL_TRACKS_ID = 7;
    private static final int WORLD_CLOUDS = 105;
    private final AdHolder adHolder;
    private SavedLocation currentLocation;
    private final DfpAd dfpAd = DfpAd.builder().build();
    private boolean isActive;
    private boolean isLaunchFromBackground;
    private LocationManager locationManager;
    private WSIMapAPI mapApi;
    private WSIMapView mapView;
    private Menu menu;
    private MyLocationOverlay myLocationOverlay;
    private com.wsi.android.weather.utils.settings.MapSettingsAccessor.SettingsChangeListener settingsListener;
    private boolean skipAdRefreshOnLayerSelection;
    private StormDataManager stormDataManager;
    private WeatherLocationListAdapter weatherLocationListAdapter;

    public InteractiveMapActivity()
    {
        adHolder = new AdHolder(dfpAd);
    }

    private GeoOverlayManager getGeoOverlay(int i)
    {
        if (mapApi.getAvailableGeoOverlays() != null)
        {
            GeoOverlayManager ageooverlaymanager[] = mapApi.getAvailableGeoOverlays();
            int k = ageooverlaymanager.length;
            for (int j = 0; j < k; j++)
            {
                GeoOverlayManager geooverlaymanager = ageooverlaymanager[j];
                if (geooverlaymanager.getTypeId() == i)
                {
                    return geooverlaymanager;
                }
            }

        }
        return null;
    }

    private String getOriginatingFeed()
    {
        Intent intent = getIntent();
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("com.weather.fromFeed");
        }
    }

    private String getStormid()
    {
        Intent intent = getIntent();
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getStringExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY");
        }
    }

    private void handleIntent()
    {
        Object obj = getIntent();
        if (obj != null)
        {
            Bundle bundle = ((Intent) (obj)).getExtras();
            TWCBaseActivity.addInitialTargetingToAd(dfpAd, ((Intent) (obj)));
            if (bundle != null && bundle.containsKey(AlertResponseField.PRODUCT.getName()))
            {
                if (bundle.getString(AlertResponseField.PRODUCT.getName()).equalsIgnoreCase(ProductType.PRODUCT_REAL_TIME_RAIN.getProductName()))
                {
                    AlertList.realTimeRainAlertMessageAlertList.clearList();
                }
                if (bundle.getString(AlertResponseField.PRODUCT.getName()).equalsIgnoreCase(ProductType.PRODUCT_LIGHTNING_STRIKES.getProductName()))
                {
                    AlertList.lightningStrikeAlertMessageList.clearList();
                }
                if (LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
                {
                    locationManager.setFollowMeAsCurrent("InteractiveMap.handleIntent()", com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.CLICK_THRU);
                }
            } else
            {
                obj = LocationUtils.getViewIntentUri(((Intent) (obj)));
                if (obj == null || !LocationUtils.addLocationFromUri(((android.net.Uri) (obj))))
                {
                    setActionBarToCurrentLocation();
                    return;
                }
            }
        }
    }

    private void initAdsControls()
    {
        Object obj = (MapApplication)getApplicationContext();
        settingsListener = new com.wsi.android.weather.utils.settings.MapSettingsAccessor.SettingsChangeListener() {

            final InteractiveMapActivity this$0;
            final String val$layerTypeKey;

            public boolean onSettingsChanged(String s2, SharedPreferences sharedpreferences)
            {
                if (s2.startsWith("overlay_cat_") || s2.equals(layerTypeKey))
                {
                    String s4 = sharedpreferences.getString(s2, "");
                    if (!skipAdRefreshOnLayerSelection)
                    {
                        HashMap hashmap1 = new HashMap();
                        String s3;
                        if (s4.equals("0052"))
                        {
                            s3 = "driving";
                        } else
                        {
                            s3 = "nl";
                        }
                        hashmap1.put("mlayer", s3);
                        adHolder.setExtraTargetingParameters(hashmap1, false);
                        adHolder.refresh();
                    }
                    skipAdRefreshOnLayerSelection = false;
                    Log.d("SessionTracker", (new StringBuilder()).append("settings changed ").append(s2).append(' ').append(sharedpreferences.getString(s2, null)).toString());
                    if (!"NONE".equals(s4))
                    {
                        LocalyticsHandler.getInstance().getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.MAP_LAYERS_VIEWED);
                    }
                }
                return false;
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                layerTypeKey = s;
                super();
            }
        };
        ((MapApplication) (obj)).getSettingsAccessor().addSettingsChangeListener(settingsListener);
        obj = findViewById(0x7f0d0196);
        dfpAd.init(((View) (obj)));
        adHolder.init(getAdSlotName());
        HashMap hashmap = new HashMap();
        if (mapApi == null)
        {
            String s;
            if (isDrivingDifficultyIndex())
            {
                s = "driving";
            } else
            {
                s = "nl";
            }
            hashmap.put("mlayer", s);
        } else
        {
            String s1;
            if (mapApi.getActiveLayer().getId() == 52)
            {
                s1 = "driving";
            } else
            {
                s1 = "nl";
            }
            hashmap.put("mlayer", s1);
        }
        adHolder.setExtraTargetingParameters(hashmap, false);
    }

    private void initControls()
    {
        int j = 0;
        myLocationOverlay = new MyLocationOverlay(this, mapView) {

            final InteractiveMapActivity this$0;

            public void onLocationChanged(Location location)
            {
                this;
                JVM INSTR monitorenter ;
                super.onLocationChanged(location);
_L2:
                this;
                JVM INSTR monitorexit ;
                return;
                location;
                Log.w("InteractiveMapActivity", "MyLocation error!");
                if (true) goto _L2; else goto _L1
_L1:
                location;
                throw location;
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                super(context, mapview);
            }
        };
        mapView.getOverlays().add(myLocationOverlay);
        myLocationOverlay.runOnFirstFix(new Runnable() {

            final InteractiveMapActivity this$0;

            public void run()
            {
                mapView.animateTo(myLocationOverlay.getMyLocation());
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                super();
            }
        });
        ((ImageView)findViewById(0x7f0d0124)).setOnClickListener(new android.view.View.OnClickListener() {

            final InteractiveMapActivity this$0;

            public void onClick(View view)
            {
                view = getActionBar();
                if (myLocationOverlay.isMyLocationEnabled())
                {
                    if (myLocationOverlay.getMyLocation() != null)
                    {
                        mapView.animateTo(myLocationOverlay.getMyLocation());
                    }
                } else
                {
                    myLocationOverlay.enableMyLocation();
                }
                if (myLocationOverlay.isMyLocationEnabled() && view != null)
                {
                    view.setSelectedNavigationItem(0);
                }
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                super();
            }
        });
        ((ImageView)findViewById(0x7f0d0129)).setOnClickListener(new android.view.View.OnClickListener() );
        ((ImageView)findViewById(0x7f0d012c)).setOnClickListener(new android.view.View.OnClickListener() );
        boolean flag = isHurricaneCentral();
        Object obj = (ImageView)findViewById(0x7f0d012a);
        ((ImageView) (obj)).setOnClickListener(this);
        int i;
        if (flag)
        {
            turnOnQuickOverlay(((ImageView) (obj)), 7);
        } else
        {
            turnOffQuickOverlay(((ImageView) (obj)), 7);
        }
        obj = (ImageView)findViewById(0x7f0d012b);
        if (LocaleUtil.isDeviceInUS() && obj != null)
        {
            ((ImageView) (obj)).setVisibility(0);
            ((ImageView) (obj)).setOnClickListener(this);
            GeoOverlayManager geooverlaymanager;
            int k;
            if (flag)
            {
                turnOffQuickOverlay(((ImageView) (obj)), 2);
            } else
            {
                turnOnQuickOverlay(((ImageView) (obj)), 2);
            }
        }
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mapApi.getAvailableGeoOverlays() != null)
        {
            obj = mapApi.getAvailableGeoOverlays();
            k = obj.length;
            while (j < k) 
            {
                geooverlaymanager = obj[j];
                MapSkinSettings mapskinsettings;
                if (geooverlaymanager.isCategoryBased())
                {
                    try
                    {
                        geooverlaymanager.setActiveCategory(geooverlaymanager.getCategories()[i]);
                    }
                    catch (Exception exception) { }
                }
                j++;
            }
        }
        if (isDrivingDifficultyIndex())
        {
            mapApp.getSettingsAccessor().getSkinSettings().setMapViewType(null);
            mapView.setTraffic(true);
            return;
        }
        mapskinsettings = mapApp.getSettingsAccessor().getSkinSettings();
        if (flag)
        {
            obj = MapViewType.HYBRID;
        } else
        {
            obj = MapViewType.STANDARD;
        }
        mapskinsettings.setMapViewType(((MapViewType) (obj)));
    }

    private int invertMapLevel(int i)
    {
        return i != 0 ? 0 : 1;
    }

    private boolean isDDIFirstTimeLaunch()
    {
        boolean flag = false;
        if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.DDI_MAP_FIRST_LAUNCH, false))
        {
            flag = true;
        }
        return flag;
    }

    private boolean isDrivingDifficultyIndex()
    {
        boolean flag = false;
        Intent intent = getIntent();
        if (intent != null)
        {
            flag = intent.getBooleanExtra("com.weather.Weather.hurricane.DRIVING_DIFFICULTY_INDEX_ARG_KEY", false);
        }
        return flag;
    }

    private boolean isHurricaneCentral()
    {
        boolean flag = false;
        Intent intent = getIntent();
        if (intent != null)
        {
            flag = intent.getBooleanExtra("com.weather.Weather.hurricane.HURRICANE_CENTRAL_ARG_KEY", false);
        }
        return flag;
    }

    private void logSessionM()
    {
        if (getIntent().hasExtra(AlertResponseField.PRODUCT.getName()))
        {
            SessionMUtils.logAction("launch_app_from_push_notification");
        }
    }

    private void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_DETAILS.getName());
    }

    private void recordButtonPress(LocalyticsFeedButton localyticsfeedbutton)
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(localyticsfeedbutton, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
    }

    private void setUnitsBasedOnLocale()
    {
        WSIMapAPI wsimapapi = mapApi;
        MeasurementUnits measurementunits;
        if (LocaleUtil.isDeviceInUS())
        {
            measurementunits = MeasurementUnits.ENGLISH;
        } else
        {
            measurementunits = MeasurementUnits.METRIC;
        }
        wsimapapi.setMeasurementUnits(measurementunits);
    }

    private void showDDITutorial()
    {
        ImageView imageview = new ImageView(this);
        imageview.setImageResource(0x7f02007c);
        imageview.setAdjustViewBounds(true);
        final AlertDialog tutorialDialog = new Builder(this);
        tutorialDialog.setView(imageview);
        tutorialDialog = tutorialDialog.create();
        tutorialDialog.show();
        imageview.setOnClickListener(new android.view.View.OnClickListener() {

            final InteractiveMapActivity this$0;
            final AlertDialog val$tutorialDialog;

            public void onClick(View view)
            {
                tutorialDialog.cancel();
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                tutorialDialog = alertdialog;
                super();
            }
        });
        TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.TwcPrefs.Keys.DDI_MAP_FIRST_LAUNCH, true);
    }

    private void turnOffQuickOverlay(ImageView imageview, int i)
    {
        imageview = imageview.getDrawable();
        if (imageview instanceof LevelListDrawable)
        {
            imageview.setLevel(0);
            imageview = getGeoOverlay(i);
            if (imageview != null)
            {
                imageview.turnOffOverlay();
            }
        }
    }

    private void turnOnQuickOverlay(ImageView imageview, int i)
    {
        imageview = imageview.getDrawable();
        if (imageview instanceof LevelListDrawable)
        {
            imageview.setLevel(1);
            imageview = getGeoOverlay(i);
            if (imageview != null)
            {
                imageview.turnOnOverlay();
            }
        }
    }

    private boolean wasCreatedFromFeed(String s)
    {
        Intent intent = getIntent();
        if (intent == null)
        {
            return false;
        } else
        {
            return s.equals(intent.getStringExtra("com.weather.fromFeed"));
        }
    }

    private boolean wasCreatedFromMainFeed()
    {
        return wasCreatedFromFeed("mainFeed");
    }

    protected WSIMapActivityNavigationManager createNavigator()
    {
        return new TwcActivityNavigationManager(this);
    }

    public String getAdSlotName()
    {
        if (isHurricaneCentral())
        {
            return "weather.hurricane.details";
        } else
        {
            return ConfigurationManagers.getInstance().getActivitiesConfig().getAdSlot("map");
        }
    }

    protected int getContentViewLayoutId()
    {
        return 0x7f030066;
    }

    public void navigateToOrClose(int i)
    {
        ((TwcActivityNavigationManager)navigator).navigateToOrClose(i);
    }

    public void onBackPressed()
    {
        try
        {
            FragmentManager fragmentmanager = getFragmentManager();
            if (fragmentmanager.getBackStackEntryCount() > 1)
            {
                fragmentmanager.popBackStack();
                return;
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
        if (wasCreatedFromMainFeed())
        {
            onReturnToMainFeed();
        }
        onBackPressed();
        return;
    }

    public void onBaseMapToggleClicked(View view)
    {
        if (view instanceof ToggleButton)
        {
            view = (ToggleButton)view;
            WSIMapView wsimapview = mapView;
            if (view.isChecked())
            {
                view = MapViewType.STANDARD;
            } else
            {
                view = MapViewType.HYBRID;
            }
            wsimapview.setViewMode(view);
        }
    }

    public void onClick(View view)
    {
        byte byte0 = -1;
        if (view.getId() != 0x7f0d012b) goto _L2; else goto _L1
_L1:
        byte0 = 2;
_L4:
        if (byte0 > 0 && (view instanceof ImageView))
        {
            view = ((ImageView)view).getDrawable();
            if (view instanceof LevelListDrawable)
            {
                int i = invertMapLevel(view.getLevel());
                view.setLevel(i);
                view = getGeoOverlay(byte0);
                if (view != null)
                {
                    if (i != 0)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    view.turnOffOverlay();
                }
            }
        }
        return;
_L2:
        if (view.getId() == 0x7f0d012a)
        {
            byte0 = 7;
        }
        if (true) goto _L4; else goto _L3
_L3:
        view.turnOnOverlay();
        return;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        setUnitsBasedOnLocale();
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        stormDataManager = (StormDataManager)FlagshipApplication.getInstance().getBaseObjectGraph().get(com/weather/commons/tropical/StormDataManager);
        logSessionM();
        locationManager = FlagshipApplication.getInstance().getLocationManager();
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            ViewServer.get(this).addWindow(this);
        }
        if (bundle == null)
        {
            navigator.navigateTo(1);
        }
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(false);
            bundle.setDisplayHomeAsUpEnabled(true);
            bundle.setNavigationMode(1);
            weatherLocationListAdapter = new WeatherLocationListAdapter(this, FlagshipApplication.getInstance().getWeatherDataManager().getLocationDisplayData());
            bundle.setListNavigationCallbacks(weatherLocationListAdapter, new DropDownNavigationListenerClass(this, getOriginatingFeed(), FlagshipApplication.getInstance().getLocationManager()));
        }
        initAdsControls();
        handleIntent();
        stormDataManager.refresh();
        mapApi = getMapAPI();
        setUnitsBasedOnLocale();
        mapView = (WSIMapView)findViewById(0x7f0d011f);
        initControls();
        isLaunchFromBackground = true;
        isActive = LocaleUtil.isDeviceInUS();
    }

    public boolean onCreateOptionsMenu(Menu menu1)
    {
        boolean flag = false;
        onCreateOptionsMenu(menu1);
        getMenuInflater().inflate(0x7f100005, menu1);
        menu = menu1;
        (new TypeAheadSearchViewUtil(menu1, 0x7f0d035b, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED))).setupMainFeedSearchView(this, -1);
        if (!TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT, false))
        {
            flag = true;
        }
        if (SessionMUtils.isActive() && flag)
        {
            SessionM.getInstance();
            if (!TwcPrefs.getInstance().contains(com.weather.util.prefs.TwcPrefs.Keys.SESSIONM_OPTED_OUT))
            {
                SessionMUtils.syncOptOut();
            }
            String s = getString(0x7f070574);
            PortalButton portalbutton = new PortalButton(this);
            portalbutton.setOnClickListener(new android.view.View.OnClickListener() {

                final InteractiveMapActivity this$0;

                public void onClick(View view)
                {
                    recordButtonPress(LocalyticsFeedButton.SESSION_M);
                    SessionM.getInstance().presentActivity(com.sessionm.api.SessionM.ActivityType.PORTAL);
                }

            
            {
                this$0 = InteractiveMapActivity.this;
                super();
            }
            });
            FrameLayout framelayout = new FrameLayout(this);
            (new android.widget.FrameLayout.LayoutParams(-2, -2)).gravity = 17;
            framelayout.addView(portalbutton);
            menu1.add(s).setActionView(framelayout).setShowAsAction(2);
            portalbutton.setBackgroundDrawable(getResources().getDrawable(0x7f02036c));
            portalbutton.updateButton();
            return true;
        } else
        {
            LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValueIfAbsent(LocalyticsFeedButton.SESSION_M, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
            return true;
        }
    }

    public void onCurrentLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        LogUtil.v("InteractiveMapActivity", LoggingMetaTags.TWC_UI, "onCurrentLocationChange: change=%s", new Object[] {
            currentlocationchangeevent
        });
        runOnUiThread(new Runnable() {

            final InteractiveMapActivity this$0;

            public void run()
            {
                SavedLocation savedlocation;
                savedlocation = FlagshipApplication.getInstance().getLocationManager().getCurrentLocation();
                if (Objects.equal(savedlocation, currentLocation))
                {
                    return;
                }
                if (mapView == null) goto _L2; else goto _L1
_L1:
                if (savedlocation == null) goto _L4; else goto _L3
_L3:
                GoogleGeoPoint googlegeopoint = new GoogleGeoPoint(savedlocation.getLatE6(), savedlocation.getLngE6());
                if (currentLocation != null || !isHurricaneCentral()) goto _L6; else goto _L5
_L5:
                Object obj = getStormid();
                Object obj3;
                List list;
                Iterator iterator1;
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = stormDataManager.getActiveStorms().getDataFor(((String) (obj)));
                }
                if (obj != null)
                {
                    Object obj2 = ((StormData) (obj)).getStormBounds();
                    obj = RouteUtil.calculateGeoPoint(((LatLngBounds) (obj2)).getCenter().latitude, ((LatLngBounds) (obj2)).getCenter().longitude);
                    obj2 = RouteUtil.getLatLongBoundsBoundingBox(((LatLngBounds) (obj2)));
                    RouteUtil.centerOnMapView(mapView, ((BoundingBox) (obj2)), 1.0F);
                } else
                {
                    BoundingBox boundingbox = RouteUtil.getNoActiveStormRegion();
                    obj = boundingbox.getCenterPoint();
                    RouteUtil.centerOnMapView(mapView, boundingbox, 1.0F);
                }
                googlegeopoint = new GoogleGeoPoint(((GeoPoint) (obj)).getLatitudeE6(), ((GeoPoint) (obj)).getLongitudeE6());
                list = mapApi.getAvailableLayers();
                obj3 = null;
                iterator1 = list.iterator();
                do
                {
                    obj = obj3;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = (LayerItem)iterator1.next();
                    if (((LayerItem) (obj)).getId() != 105)
                    {
                        continue;
                    }
                    obj = ((LayerItem) (obj)).getName();
                    break;
                } while (true);
                obj3 = obj;
                if (obj == null)
                {
                    obj3 = Layers.getLayerForPoint(Layers.CLOUDS, googlegeopoint, list);
                }
                obj = obj3;
                if (obj3 == null)
                {
                    obj = Layers.getDefaultLayer(googlegeopoint, list);
                }
                mapApi.setActiveLayer(((String) (obj)));
_L8:
                mapView.cleanUp();
_L4:
                ((TwcActivityNavigationManager)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = InteractiveMapActivity.this;
                super();
            }
        });
    }

    public void onDestroy()
    {
        myLocationOverlay = null;
        adHolder.destroy();
        if (settingsListener != null)
        {
            ((MapApplication)AbstractTwcApplication.getRootContext()).getSettingsAccessor().removeSettingsChangeListener(settingsListener);
        }
        onDestroy();
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            ViewServer.get(this).removeWindow(this);
        }
        Field field1;
        Object aobj[];
        int i;
        try
        {
            Field field = com/google/android/maps/MapActivity.getDeclaredField("mMap");
            AccessibleObject.setAccessible(new AccessibleObject[] {
                field
            }, true);
            field.set(this, null);
            field = com/google/android/maps/MapView.getDeclaredField("mMap");
            AccessibleObject.setAccessible(new AccessibleObject[] {
                field
            }, true);
            field.set(mapView, null);
            field = com/google/android/maps/MapView.getDeclaredField("mConverter");
            AccessibleObject.setAccessible(new AccessibleObject[] {
                field
            }, true);
            field.set(mapView, null);
            field = com/google/android/maps/MapView.getDeclaredField("mController");
            AccessibleObject.setAccessible(new AccessibleObject[] {
                field
            }, true);
            field.set(mapView, null);
            field = com/google/android/maps/MapView.getDeclaredField("mZoomHelper");
            AccessibleObject.setAccessible(new AccessibleObject[] {
                field
            }, true);
            field.set(mapView, null);
        }
        catch (Throwable throwable)
        {
            ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(1)", throwable);
        }
        field1 = Class.forName("com.google.googlenav.map.Tile").getDeclaredField("tileObjectCache");
        field1.setAccessible(true);
        aobj = (Object[])(Object[])field1.get(null);
        i = 0;
        while (i < aobj.length) 
        {
            aobj[i] = null;
            i++;
        }
        break MISSING_BLOCK_LABEL_277;
        Throwable throwable1;
        throwable1;
        ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(2)", throwable1);
        Object aobj1[];
        Field field2 = Class.forName("android_maps_conflict_avoidance.com.google.googlenav.map.Tile").getDeclaredField("tileObjectCache");
        field2.setAccessible(true);
        aobj1 = (Object[])(Object[])field2.get(null);
        int j = 0;
        while (j < aobj1.length) 
        {
            aobj1[j] = null;
            j++;
        }
        break MISSING_BLOCK_LABEL_336;
        aobj1;
        ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(3)", ((Throwable) (aobj1)));
        try
        {
            Object obj = Class.forName("android_maps_conflict_avoidance.com.google.googlenav.map.MapTile");
            Field field5 = ((Class) (obj)).getDeclaredField("loadingImage");
            field5.setAccessible(true);
            field5.set(null, null);
            obj = ((Class) (obj)).getDeclaredField("notLoadingImage");
            ((Field) (obj)).setAccessible(true);
            ((Field) (obj)).set(null, null);
        }
        catch (Throwable throwable2)
        {
            ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(4)", throwable2);
        }
        try
        {
            Field field3 = Class.forName("android_maps_conflict_avoidance.com.google.googlenav.StartupHelper").getDeclaredField("startupCallbacksForBgThread");
            field3.setAccessible(true);
            ((Collection)field3.get(null)).clear();
        }
        catch (Throwable throwable3)
        {
            ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(5)", throwable3);
        }
        try
        {
            Field field4 = Class.forName("android_maps_conflict_avoidance.com.google.common.Log").getDeclaredField("logSaver");
            field4.setAccessible(true);
            field4.set(null, null);
        }
        catch (Throwable throwable4)
        {
            ExceptionUtil.logExceptionWarning("InteractiveMapActivity", "Trying to clean up map leaks(6)", throwable4);
        }
        mapView.cleanUp();
        mapView = null;
        mapApi = null;
        return;
    }

    public void onFinish(LayerDisplayMode layerdisplaymode)
    {
        TwcMapAuxiliaryFragment twcmapauxiliaryfragment = ((TwcActivityNavigationManager)navigator).getMapAuxiliaryFragment();
        if (twcmapauxiliaryfragment != null)
        {
            twcmapauxiliaryfragment.startLooping(layerdisplaymode);
        }
    }

    public void onLocationDisplayChange(LocationDisplayData locationdisplaydata)
    {
        runOnUiThread(new Runnable() {

            final InteractiveMapActivity this$0;

            public void run()
            {
                setActionBarToCurrentLocation();
            }

            
            {
                this$0 = InteractiveMapActivity.this;
                super();
            }
        });
    }

    public void onNewIntent(Intent intent)
    {
        setIntent(intent);
        logSessionM();
        handleIntent();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return onOptionsItemSelected(menuitem);

        case 16908332: 
            break;
        }
        if (isHurricaneCentral())
        {
            menuitem = new Intent(this, com/weather/Weather/hurricane/HurricaneCentralActivity);
        } else
        {
            onReturnToMainFeed();
            menuitem = NavUtils.getParentActivityIntent(this);
        }
        menuitem.addFlags(0x4000000);
        menuitem.putExtra("com.weather.moduleId", "map");
        startActivity(menuitem);
        finish();
        return true;
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        if (weatherLocationListAdapter != null)
        {
            weatherLocationListAdapter.unregister();
        }
        if (isHurricaneCentral())
        {
            LocalyticsHandler.getInstance().tagSummaryEvent(LocalyticsEvent.HC_MAP);
        }
        if (isActive)
        {
            SessionM.getInstance().onActivityPause(this);
        }
        isLaunchFromBackground = false;
        adHolder.pause();
        onPause();
    }

    protected void onResume()
    {
        onResume();
        Log.d("InteractiveMapActivity", "onResume1");
        if (AbstractTwcApplication.isBuildServerDebug())
        {
            ViewServer.get(this).setFocusedWindow(this);
        }
        weatherLocationListAdapter.register();
        setActionBarToCurrentLocation();
        LayerItem layeritem;
        if (isHurricaneCentral())
        {
            LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_MAP);
            LocalyticsHandler.getInstance().getHurricaneCentralSummaryRecorder().recordResumeOnScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.HURRICANE_CENTRAL_MAP);
            MultiActivitySummaryManager.getInstance().registerSummary(LocalyticsEvent.HURRICANE_CENTRAL_SUMMARY);
        } else
        {
            LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.MAP_DETAILS);
        }
        invalidateOptionsMenu();
        if (!isLaunchFromBackground)
        {
            isLaunchFromBackground = true;
        }
        if (isActive)
        {
            SessionM.getInstance().setAutopresentMode(false);
            SessionM.getInstance().onActivityResume(this);
        }
        layeritem = mapApi.getActiveLayer();
        if (layeritem != null && !"NONE".equals(layeritem.getEnglishName()))
        {
            KahunaEvents.getInstance().viewMaps(new Date(), layeritem.getName());
            LocalyticsHandler.getInstance().getSessionSummaryRecorder().incrementValue(LocalyticsSessionAttribute.MAP_LAYERS_VIEWED);
        } else
        {
            skipAdRefreshOnLayerSelection = true;
        }
        stormDataManager.refresh();
        adHolder.resume();
        DataAccessLayer.BUS.register(this);
    }

    public boolean onSearchRequested()
    {
        menu.performIdentifierAction(0x7f0d035b, 0);
        return true;
    }

    protected void onStart()
    {
        onStart();
        Runtime.getRuntime().gc();
        if (isActive)
        {
            SessionM.getInstance().onActivityStart(this);
        }
    }

    protected void onStop()
    {
        onStop();
        if (isActive)
        {
            SessionM.getInstance().onActivityStop(this);
        }
    }

    public void onTrafficToggleClicked(View view)
    {
        if (view instanceof ToggleButton)
        {
            view = (ToggleButton)view;
            mapView.setTraffic(view.isChecked());
        }
    }

    void setActionBarToCurrentLocation()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null && actionbar.getNavigationItemCount() > 1)
        {
            int i = locationManager.getNavigationIndex();
            LogUtil.d("InteractiveMapActivity", LoggingMetaTags.TWC_UI, "setActionBarToCurrentLocation navigationIndex=%s", new Object[] {
                Integer.valueOf(i)
            });
            actionbar.setSelectedNavigationItem(i);
        }
    }



/*
    static boolean access$002(InteractiveMapActivity interactivemapactivity, boolean flag)
    {
        interactivemapactivity.skipAdRefreshOnLayerSelection = flag;
        return flag;
    }

*/















/*
    static SavedLocation access$702(InteractiveMapActivity interactivemapactivity, SavedLocation savedlocation)
    {
        interactivemapactivity.currentLocation = savedlocation;
        return savedlocation;
    }

*/


}
