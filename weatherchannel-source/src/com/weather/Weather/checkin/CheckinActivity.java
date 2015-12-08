// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.app.SessionMBaseActivity;
import com.weather.Weather.locations.LocationDisplayData;
import com.weather.Weather.locations.TypeAheadSearchViewUtil;
import com.weather.Weather.locations.WeatherLocationListAdapter;
import com.weather.Weather.ui.DropDownNavigationListenerClass;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.checkin.CheckInSocialWeatherSummaryRecorder;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.feed.MainFeedSummaryRecorder;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.locations.LocationReceiver;
import com.weather.commons.locations.LocationUtils;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.checkin.CheckinFetcher;
import com.weather.dal2.checkin.CheckinRequester;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.system.TwcBus;
import com.weather.facade.WeatherDataManager;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import dagger.ObjectGraph;
import flow.Backstack;
import flow.Flow;
import flow.Layouts;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapController, CheckinPrefs, Controller, CheckinReportController, 
//            CheckinTutorialController, CheckinCache, CheckinIconProvider

public class CheckinActivity extends SessionMBaseActivity
    implements flow.Flow.Listener
{
    private class CheckinImageCompletionTask extends AsyncTask
    {

        private final Intent data;
        private final int requestCode;
        private final int resultCode;
        final CheckinActivity this$0;

        protected transient CheckinHistoryRecord doInBackground(Void avoid[])
        {
            Cursor cursor = (new CheckinInjection()).provideCheckinHistoryManager().queryAllCheckins();
            if (cursor == null) goto _L2; else goto _L1
_L1:
            if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
            avoid = CheckinHistoryManager.extractRecord(cursor);
            CheckinHistoryRecord checkinhistoryrecord;
            checkinhistoryrecord = avoid;
            if (cursor != null)
            {
                cursor.close();
                checkinhistoryrecord = avoid;
            }
_L5:
            return checkinhistoryrecord;
_L2:
            checkinhistoryrecord = null;
            if (cursor == null) goto _L5; else goto _L4
_L4:
            cursor.close();
            return null;
            avoid;
            if (cursor != null)
            {
                cursor.close();
            }
            throw avoid;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(CheckinHistoryRecord checkinhistoryrecord)
        {
            super.onPostExecute(checkinhistoryrecord);
            if (checkinhistoryrecord == null)
            {
                return;
            } else
            {
                checkinhistoryrecord = new CheckinReportController(checkinhistoryrecord, new Handler());
                objectGraph.plus(new Object[] {
                    checkinhistoryrecord
                }).inject(checkinhistoryrecord);
        /* block-local class not found */
        class _cls1 {}

                checkinhistoryrecord.setView(new _cls1());
                checkinhistoryrecord.setupForImageRecovery();
                checkinhistoryrecord.handleActivityResult(requestCode, resultCode, data);
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((CheckinHistoryRecord)obj);
        }

        private CheckinImageCompletionTask(int i, int j, Intent intent)
        {
            this$0 = CheckinActivity.this;
            super();
            requestCode = i;
            resultCode = j;
            data = intent;
        }

    }

    class CheckinInjection
    {

        final CheckinActivity this$0;

        ActionBar provideActionBar()
        {
            return getActionBar();
        }

        Activity provideActivity()
        {
            return CheckinActivity.this;
        }

        CheckinHistoryManager provideCheckinHistoryManager()
        {
            return new CheckinHistoryManager(getContentResolver());
        }

        CheckinRequester provideCheckinRequester()
        {
            return new CheckinRequester(new CheckinCache.CheckinClusterItemFactory());
        }

        Executor provideExecutor()
        {
            return executorService;
        }

        Flow provideFlow()
        {
            return flow;
        }

        android.app.FragmentManager provideFragmentModule()
        {
            return getFragmentManager();
        }

        LoaderManager provideLoaderManager()
        {
            return getLoaderManager();
        }

        CheckinFetcher provideNearMeCache()
        {
            return CheckinCache.NEAR_ME_CACHE;
        }

        ObjectGraph provideObjectGraph()
        {
            return objectGraph;
        }

        CheckinIconProvider providePinProvider()
        {
            return CheckinIconProvider.PIN_PROVIDER;
        }

        CheckInSocialWeatherSummaryRecorder provideSocialWeatherRecorder()
        {
            return new CheckInSocialWeatherSummaryRecorder();
        }

        CheckinInjection()
        {
            this$0 = CheckinActivity.this;
            super();
        }
    }


    public static final int REQUEST_IMAGE_CAPTURE = 2;
    private static final String TAG = "CheckinActivity";
    private Controller checkinMapController;
    private ViewGroup container;
    private Controller currentController;
    private View currentView;
    private ExecutorService executorService;
    private Flow flow;
    private LocationManager locationManager;
    final CheckinMapController mapController = new CheckinMapController(new Handler());
    private final ObjectGraph objectGraph = FlagshipApplication.getInstance().getBaseObjectGraph().plus(new Object[] {
        new CheckinInjection()
    });
    private long resumeTime;
    private WeatherLocationListAdapter weatherLocationListAdapter;

    public CheckinActivity()
    {
    }

    private View getView(Object obj)
    {
        return Layouts.createView(this, obj);
    }

    private void handleIntent()
    {
        Object obj = getIntent();
        if (obj != null)
        {
            obj = LocationUtils.getViewIntentUri(((Intent) (obj)));
            if (obj == null || !LocationUtils.addLocationFromUri(((android.net.Uri) (obj))))
            {
                setActionBarToCurrentLocation();
            }
        }
    }

    private static boolean isFirstLaunch()
    {
        boolean flag = false;
        if (!CheckinPrefs.getInstance().getBoolean(CheckinPrefs.Keys.HAS_LAUNCHED, false))
        {
            flag = true;
        }
        if (flag)
        {
            CheckinPrefs.getInstance().putBoolean(CheckinPrefs.Keys.HAS_LAUNCHED, true);
        }
        return flag;
    }

    private void switchToNewController(Controller controller)
    {
        View view;
        boolean flag;
        if (currentView != null)
        {
            currentController.onViewInvisible();
            container.removeView(currentView);
            currentView = null;
        }
        flag = controller instanceof CheckinMapController;
        if (flag && checkinMapController != null)
        {
            currentController = null;
            currentView = null;
            controller = getActionBar();
            if (controller != null)
            {
                controller.setDisplayShowTitleEnabled(false);
                controller.setNavigationMode(1);
            }
            return;
        }
        view = getView(controller);
        ObjectGraph objectgraph = objectGraph.plus(new Object[] {
            controller
        });
        objectgraph.inject(controller);
        objectgraph.inject(view);
        controller.setView(view);
        if (!flag) goto _L2; else goto _L1
_L1:
        checkinMapController = controller;
_L4:
        LogUtil.d("CheckinActivity", LoggingMetaTags.TWC_SOCIAL, "Switching to view %s", new Object[] {
            view.getClass().getSimpleName()
        });
        container.addView(view);
        return;
_L2:
        currentView = view;
        currentController = controller;
        if (isThisActivityBeingDisplayed())
        {
            controller.onViewVisible();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        long l = motionevent.getEventTime();
        if (l < resumeTime)
        {
            LogUtil.v("CheckinActivity", LoggingMetaTags.TWC_SOCIAL, "Discarded touch event with time earlier than onResume().  eventTime=%s, resumeTime=%s", new Object[] {
                Long.valueOf(l), Long.valueOf(resumeTime)
            });
            return true;
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
    }

    public void go(Backstack backstack, flow.Flow.Direction direction)
    {
        Controller controller = (Controller)backstack.current().getScreen();
        LogUtil.v("CheckinActivity", LoggingMetaTags.TWC_SOCIAL, "go: entries=%s, direction=%s, controller=%s", new Object[] {
            backstack, direction, controller
        });
        switchToNewController(controller);
        invalidateOptionsMenu();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (LbsUtil.getInstance().isLbsAvailable())
            {
                FollowMe.getInstance().activateLbs(-1);
            }
        } else
        {
            Controller controller;
            if (currentController == null)
            {
                controller = checkinMapController;
            } else
            {
                controller = currentController;
            }
            if (controller != null)
            {
                controller.handleActivityResult(i, j, intent);
            }
            if (i == 2 && !(controller instanceof CheckinReportController))
            {
                (new CheckinImageCompletionTask(i, j, intent)).execute(new Void[0]);
                return;
            }
        }
    }

    public void onBackPressed()
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        if (fragmentmanager != null && fragmentmanager.getBackStackEntryCount() > 1)
        {
            fragmentmanager.popBackStack();
        } else
        if (!flow.goBack())
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        executorService = Executors.newSingleThreadExecutor();
        setContentView(0x7f03001d);
        container = (ViewGroup)findViewById(0x7f0d00a0);
        locationManager = FlagshipApplication.getInstance().getLocationManager();
        flow = new Flow(Backstack.single(mapController), this);
        go(flow.getBackstack(), flow.Flow.Direction.FORWARD);
        if (isFirstLaunch())
        {
            flow.goTo(new CheckinTutorialController(mapController));
        }
        weatherLocationListAdapter = new WeatherLocationListAdapter(this, FlagshipApplication.getInstance().getWeatherDataManager().getLocationDisplayData());
        bundle = getActionBar();
        if (bundle != null)
        {
            bundle.setDisplayShowTitleEnabled(false);
            bundle.setNavigationMode(1);
            bundle.setListNavigationCallbacks(weatherLocationListAdapter, new DropDownNavigationListenerClass(this, null, FlagshipApplication.getInstance().getLocationManager()));
            bundle.setDisplayHomeAsUpEnabled(true);
        }
        handleIntent();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        Controller controller;
        boolean flag;
        boolean flag1;
        if (currentController == null)
        {
            controller = checkinMapController;
        } else
        {
            controller = currentController;
        }
        flag1 = super.onCreateOptionsMenu(menu);
        if (controller != null && controller.createOptionsMenu(menu, getMenuInflater()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        (new TypeAheadSearchViewUtil(menu, 0x7f0d035b, new LocationReceiver(com.weather.dal2.locations.CurrentLocationChangeEvent.Cause.LOCATION_ADDED))).setupMainFeedSearchView(this, -1);
        addSessionMButton(menu);
        return flag1 && flag;
    }

    public void onCurrentLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        LogUtil.v("CheckinActivity", LoggingMetaTags.TWC_SOCIAL, "onCurrentLocationChange: change=%s", new Object[] {
            currentlocationchangeevent
        });
        runOnUiThread(new Runnable() {

            final CheckinActivity this$0;

            public void run()
            {
                com.weather.dal2.locations.SavedLocation savedlocation = FlagshipApplication.getInstance().getLocationManager().getCurrentLocation();
                if (savedlocation != null)
                {
                    mapController.moveToLocation(savedlocation);
                }
            }

            
            {
                this$0 = CheckinActivity.this;
                super();
            }
        });
    }

    protected void onDestroy()
    {
        executorService.shutdown();
        super.onDestroy();
    }

    public void onLocationDisplayChange(LocationDisplayData locationdisplaydata)
    {
        runOnUiThread(new Runnable() {

            final CheckinActivity this$0;

            public void run()
            {
                setActionBarToCurrentLocation();
            }

            
            {
                this$0 = CheckinActivity.this;
                super();
            }
        });
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        handleIntent();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 24
    //                   16908332 57;
           goto _L1 _L2
_L1:
        Controller controller;
        if (currentController == null)
        {
            controller = checkinMapController;
        } else
        {
            controller = currentController;
        }
        if (controller == null || !controller.handleOptionsMenuSelection(menuitem.getItemId())) goto _L4; else goto _L3
_L3:
        return true;
_L2:
        if (!flow.goBack())
        {
            onReturnToMainFeed();
            menuitem = NavUtils.getParentActivityIntent(this);
            menuitem.addFlags(0x4000000);
            menuitem.putExtra("com.weather.moduleId", "social");
            startActivity(menuitem);
            finish();
            return true;
        }
        if (true) goto _L3; else goto _L4
_L4:
        return super.onOptionsItemSelected(menuitem);
    }

    protected void onPause()
    {
        DataAccessLayer.BUS.unregister(this);
        if (currentController != null)
        {
            currentController.onViewInvisible();
        }
        if (checkinMapController != null)
        {
            checkinMapController.onViewInvisible();
        }
        if (weatherLocationListAdapter != null)
        {
            weatherLocationListAdapter.unregister();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        weatherLocationListAdapter.register();
        setActionBarToCurrentLocation();
        resumeTime = SystemClock.uptimeMillis() + 300L;
        if (currentController != null)
        {
            currentController.onViewVisible();
        }
        if (checkinMapController != null)
        {
            checkinMapController.onViewVisible();
        }
        LocalyticsHandler.getInstance().tagScreen(com.weather.commons.analytics.LocalyticsTags.ScreenName.CHECKIN_DETAILS);
        DataAccessLayer.BUS.register(this);
    }

    protected void onReturnToMainFeed()
    {
        LocalyticsHandler.getInstance().getMainFeedSummaryRecorder().putValue(LocalyticsMainFeedTag.PREVIOUS_SCREEN, com.weather.commons.analytics.LocalyticsTags.ScreenName.CHECKIN_DETAILS.getName());
    }

    public void setActionBarToCurrentLocation()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null && actionbar.getNavigationItemCount() > 1)
        {
            int i = locationManager.getNavigationIndex();
            LogUtil.d("CheckinActivity", LoggingMetaTags.TWC_SOCIAL, "setActionBarToCurrentLocation navigationIndex=%s", new Object[] {
                Integer.valueOf(i)
            });
            actionbar.setSelectedNavigationItem(i);
        }
    }



}
