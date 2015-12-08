// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.locations.FindMeUtil;
import com.weather.beacons.analytics.Analytics;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.checkin.CheckInSocialWeatherSummaryRecorder;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.FollowMeCurrentWeatherFacade;
import com.weather.dal2.checkin.CheckinFetcher;
import com.weather.dal2.checkin.CheckinRequester;
import com.weather.dal2.checkin.GetCheckinResponse;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.dal2.system.TwcBus;
import com.weather.util.geometry.LatLngBounds;
import com.weather.util.geometry.TwcGeohashUtils;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import flow.Flow;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.Weather.checkin:
//            Controller, CheckinClusterItem, CheckinCache, CheckinMapView, 
//            CheckinIcon, CheckinReportController, CheckinHistoryListController

public class CheckinMapController
    implements Controller
{

    private static final String TAG = "CheckinMapController";
    private static final Object checkinRequestDebounceLock = new Object();
    private static final Set codesThatAllowFog = ImmutableSet.of(Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(22), Integer.valueOf(44));
    private static final Set codesThatExcludeHail = ImmutableSet.of(Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(21), new Integer[] {
        Integer.valueOf(22), Integer.valueOf(23), Integer.valueOf(24), Integer.valueOf(29), Integer.valueOf(30), Integer.valueOf(31), Integer.valueOf(32), Integer.valueOf(36), Integer.valueOf(41), Integer.valueOf(42), 
        Integer.valueOf(43), Integer.valueOf(46)
    });
    private static final Set codesThatExcludeThunder = ImmutableSet.of(Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(19), Integer.valueOf(20), new Integer[] {
        Integer.valueOf(21), Integer.valueOf(22), Integer.valueOf(25), Integer.valueOf(31), Integer.valueOf(32), Integer.valueOf(36), Integer.valueOf(41), Integer.valueOf(42), Integer.valueOf(43), Integer.valueOf(46)
    });
    Activity activity;
    TwcBus bus;
    CheckinFetcher checkinCache;
    CheckinHistoryManager checkinHistoryManager;
    CheckinRequester checkinRequester;
    private CurrentWeatherFacade currentWeather;
    Executor executor;
    Flow flow;
    private final AtomicInteger fullGeohashCounter;
    private final AtomicInteger geohashRequestCounter;
    private final Handler handler;
    private long latestCheckinRequestTime;
    LocalyticsHandler localyticsHandler;
    CheckInSocialWeatherSummaryRecorder localyticsRecorder;
    private CheckinMapView mapView;
    FixedLocations savedLocations;
    private final TimeProvider timeProvider;
    private final AtomicInteger weatherFacadeEventCounter;

    public CheckinMapController(Handler handler1)
    {
        this(handler1, SystemTimeProvider.getInstance());
    }

    CheckinMapController(Handler handler1, TimeProvider timeprovider)
    {
        weatherFacadeEventCounter = new AtomicInteger(0);
        geohashRequestCounter = new AtomicInteger(0);
        fullGeohashCounter = new AtomicInteger(0);
        timeProvider = (TimeProvider)Preconditions.checkNotNull(timeprovider);
        handler = (Handler)Preconditions.checkNotNull(handler1);
    }

    private static boolean canFog(int i, BigDecimal bigdecimal)
    {
        boolean flag = codesThatAllowFog.contains(Integer.valueOf(i));
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "It can fog for skyCode %s: ", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        });
        BigDecimal bigdecimal1 = BigDecimal.valueOf(2D);
        if (bigdecimal != null)
        {
            if (bigdecimal.compareTo(bigdecimal1) > 0);
        }
        return true;
    }

    private static boolean canHail(int i)
    {
        boolean flag;
        if (!codesThatExcludeHail.contains(Integer.valueOf(i)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "It can hail for skyCode %s:", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        });
        return flag;
    }

    private static boolean canThunder(int i)
    {
        boolean flag;
        if (!codesThatExcludeThunder.contains(Integer.valueOf(i)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "It can thunder for skyCode %s:", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        });
        return flag;
    }

    private static boolean isCold(Integer integer)
    {
        return integer == null || integer.intValue() < 43;
    }

    private CheckinHistoryRecord sendCheckin(final SavedLocation followMeLocation, final String checkinId, final CheckinIcon icon, final CheckinClusterItem myCheckin)
    {
        final Object historyRecord;
        Integer integer;
        String s;
        final int wxIconCode;
        final int temperature;
        if (currentWeather == null)
        {
            wxIconCode = 44;
        } else
        {
            wxIconCode = currentWeather.getSkyCode();
        }
        if (currentWeather == null || currentWeather.getCurrentTempFahrenheit() == null)
        {
            temperature = 0;
        } else
        {
            temperature = currentWeather.getCurrentTempFahrenheit().intValue();
        }
        if (currentWeather == null)
        {
            historyRecord = null;
        } else
        {
            historyRecord = currentWeather.getCurrentTempFahrenheit();
        }
        if (currentWeather == null)
        {
            integer = null;
        } else
        {
            integer = currentWeather.getCurrentTempCelsius();
        }
        s = followMeLocation.getNickname();
        historyRecord = new CheckinHistoryRecord(checkinId, myCheckin.getUserIconCode(), myCheckin.getLatitude(), myCheckin.getLongitude(), s, ((Integer) (historyRecord)), integer, CheckinCache.getMyCheckinTime(), null);
        executor.execute(new Runnable() {

            final CheckinMapController this$0;
            final String val$checkinId;
            final SavedLocation val$followMeLocation;
            final CheckinHistoryRecord val$historyRecord;
            final CheckinIcon val$icon;
            final CheckinClusterItem val$myCheckin;
            final int val$temperature;
            final int val$wxIconCode;

            public void run()
            {
                checkinHistoryManager.insertCheckin(historyRecord);
                if (!checkinRequester.postCheckin(myCheckin, followMeLocation, icon.getIconPhrase(), wxIconCode, temperature, checkinId))
                {
                    Log.i("CheckinMapController", "Checkin creation failed");
                    localyticsRecorder.incrementWeatherCheckinFailed();
                    return;
                }
                try
                {
                    localyticsRecorder.submittedWeatherCheckin();
                    return;
                }
                catch (Exception exception)
                {
                    Log.e("CheckinMapController", "Creating checkin failed", exception);
                }
                return;
            }

            
            {
                this$0 = CheckinMapController.this;
                historyRecord = checkinhistoryrecord;
                myCheckin = checkinclusteritem;
                followMeLocation = savedlocation;
                icon = checkinicon;
                wxIconCode = i;
                temperature = j;
                checkinId = s;
                super();
            }
        });
        return ((CheckinHistoryRecord) (historyRecord));
    }

    private void updateLockout()
    {
        long l = timeProvider.currentTimeMillis();
        long l1 = CheckinCache.getLocalCheckinExpirationTime();
        if (l > l1)
        {
            mapView.showButtons();
            return;
        } else
        {
            mapView.showLockout(l1 - l);
            handler.postDelayed(new Runnable() {

                final CheckinMapController this$0;

                public void run()
                {
                    updateLockout();
                }

            
            {
                this$0 = CheckinMapController.this;
                super();
            }
            }, 100L);
            return;
        }
    }

    public void checkin(int i)
    {
        Object obj = (new FollowMeSnapshot()).getLocation();
        if (obj != null && LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            setActionBarToFollowMe();
            mapView.moveMapToLocation(((SavedLocation) (obj)));
            double d = ((SavedLocation) (obj)).getLat();
            double d1 = ((SavedLocation) (obj)).getLng();
            String s = UUID.randomUUID().toString();
            CheckinIcon checkinicon = new CheckinIcon(i, activity);
            CheckinClusterItem checkinclusteritem = CheckinCache.checkMeIn(d, d1, (byte)i, s, timeProvider);
            Analytics.trackState(FlagshipApplication.getRootContext().getResources().getString(0x7f07049d), null);
            obj = sendCheckin(((SavedLocation) (obj)), s, checkinicon, checkinclusteritem);
            localyticsHandler.getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_CHECKIN_SUBMITTED, com.weather.commons.analytics.LocalyticsAttributeValues.AttributeValue.BOOLEAN_YES.getAttributeValue());
            localyticsRecorder.clickedWeatherCheckin();
            mapView.addClusterItem(checkinclusteritem);
            updateLockout();
            flow.goTo(new CheckinReportController(((CheckinHistoryRecord) (obj)), handler));
            return;
        } else
        {
            FindMeUtil.showLBSDisabledDialogFragment(activity, 0x7f070099).show();
            return;
        }
    }

    public boolean createOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        Preconditions.checkNotNull(menu);
        Preconditions.checkNotNull(menuinflater);
        menuinflater.inflate(0x7f100000, menu);
        return true;
    }

    public void handleActivityResult(int i, int j, Intent intent)
    {
    }

    public boolean handleOptionsMenuSelection(int i)
    {
        if (i == 0x7f0d035c)
        {
            localyticsRecorder.userViewedWeatherHistory();
            localyticsRecorder.tagEventIfHaveAttributesAndClearData();
            flow.goTo(new CheckinHistoryListController());
            return true;
        } else
        {
            return false;
        }
    }

    public void moveToLocation(SavedLocation savedlocation)
    {
        boolean flag = savedlocation.equals((new FollowMeSnapshot()).getLocation());
        mapView.moveMapToLocationIfNotFollowmeUpdate(savedlocation, flag);
    }

    public void onReceiveData(CurrentWeatherFacade currentweatherfacade)
    {
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "onReceiveData CurrentWeatherFacade: %s", new Object[] {
            Integer.valueOf(weatherFacadeEventCounter.incrementAndGet())
        });
        handler.post(new Runnable() {

            final CheckinMapController this$0;

            public void run()
            {
                updateCheckins();
            }

            
            {
                this$0 = CheckinMapController.this;
                super();
            }
        });
    }

    public void onReceiveData(final FollowMeCurrentWeatherFacade change)
    {
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "onReceiveData FollowMeCurrentWeatherFacade: %s", new Object[] {
            Integer.valueOf(weatherFacadeEventCounter.incrementAndGet())
        });
        handler.post(new Runnable() {

            final CheckinMapController this$0;
            final FollowMeCurrentWeatherFacade val$change;

            public void run()
            {
                currentWeather = change.currentWeatherFacade;
                if (currentWeather.isEmpty())
                {
                    mapView.setThunder(true);
                    mapView.setDay(true);
                    mapView.setNight(true);
                    mapView.setWinter(true);
                    mapView.setHail(true);
                    mapView.setFog(true);
                    return;
                } else
                {
                    mapView.setThunder(CheckinMapController.canThunder(currentWeather.getSkyCode()));
                    mapView.setDay(currentWeather.isDay());
                    mapView.setNight(currentWeather.isNight());
                    mapView.setWinter(CheckinMapController.isCold(currentWeather.getCurrentTempFahrenheit()));
                    mapView.setHail(CheckinMapController.canHail(currentWeather.getSkyCode()));
                    mapView.setFog(CheckinMapController.canFog(currentWeather.getSkyCode(), currentWeather.getVisibilityInMiles()));
                    return;
                }
            }

            
            {
                this$0 = CheckinMapController.this;
                change = followmecurrentweatherfacade;
                super();
            }
        });
    }

    public void onTutorialBegin()
    {
        mapView.hideCheckinButtons();
    }

    public void onTutorialEnd()
    {
        mapView.animateButtonsSlidingIn();
    }

    public void onViewInvisible()
    {
        StringWriter stringwriter = new StringWriter();
        (new Throwable()).printStackTrace(new PrintWriter(stringwriter));
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "onViewInvisible, called from %s", new Object[] {
            stringwriter.toString()
        });
        bus.unregister(this);
        handler.removeCallbacksAndMessages(null);
        mapView.pause();
    }

    public void onViewVisible()
    {
        StringWriter stringwriter = new StringWriter();
        (new Throwable()).printStackTrace(new PrintWriter(stringwriter));
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "onViewVisible, called from %s", new Object[] {
            stringwriter.toString()
        });
        mapView.resume();
        updateLockout();
        bus.register(this);
    }

    CheckinMapController providesController()
    {
        return this;
    }

    public void setActionBarToFollowMe()
    {
        final ActionBar actionBar = activity.getActionBar();
        if (actionBar != null)
        {
            activity.runOnUiThread(new Runnable() {

                final CheckinMapController this$0;
                final ActionBar val$actionBar;

                public void run()
                {
                    actionBar.setSelectedNavigationItem(0);
                }

            
            {
                this$0 = CheckinMapController.this;
                actionBar = actionbar;
                super();
            }
            });
        }
    }

    public void setView(Object obj)
    {
        mapView = (CheckinMapView)Preconditions.checkNotNull(obj);
    }

    public void updateCheckins()
    {
label0:
        {
            Object obj = mapView.getLatLngBounds();
            if (obj == null)
            {
                LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "null visibleBounds on the map, request suppressed", new Object[0]);
                return;
            }
            synchronized (checkinRequestDebounceLock)
            {
                long l = timeProvider.currentTimeMillis();
                if (l <= latestCheckinRequestTime + 100L)
                {
                    break label0;
                }
                latestCheckinRequestTime = l;
            }
            latestRequest = geohashRequestCounter;
            final int reqId = ((AtomicInteger) (latestRequest)).incrementAndGet();
            obj = TwcGeohashUtils.getAdjacentGeohashes(((LatLngBounds) (obj)).scale(0.65000000000000002D), 7);
            String s = (new StringBuilder()).append("get checkins: reqId=").append(reqId).append(", hashes=").append(obj).toString();
            LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, s, new Object[0]);
            mapView.displayGeohashDebugText(s);
            checkinCache.asyncFetch(obj, new Receiver() {

                final CheckinMapController this$0;
                final AtomicInteger val$latestRequest;
                final int val$reqId;

                public volatile void onCompletion(Object obj1, Object obj2)
                {
                    onCompletion((Map)obj1, (Void)obj2);
                }

                public void onCompletion(Map map, Void void1)
                {
                    int i = latestRequest.get();
                    if (i != reqId)
                    {
                        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "ignoring response for stale request: reqId=%s, latestId=%s", new Object[] {
                            Integer.valueOf(reqId), Integer.valueOf(i)
                        });
                        return;
                    }
                    ArrayList arraylist = new ArrayList();
                    void1 = null;
                    Object obj1 = map.entrySet().iterator();
                    map = void1;
                    for (; ((Iterator) (obj1)).hasNext(); arraylist.addAll(void1))
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                        void1 = ((GetCheckinResponse)entry.getValue()).checkins;
                        int j = void1.size();
                        if (j >= 200)
                        {
                            map = (String)entry.getKey();
                            LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "full geohash: %s checkins, geohash=%s, reqId=%s", new Object[] {
                                Integer.valueOf(j), map, Integer.valueOf(reqId)
                            });
                            map = String.format(Locale.getDefault(), "full geohash %s, count=%d", new Object[] {
                                map, Integer.valueOf(fullGeohashCounter.incrementAndGet())
                            });
                        }
                    }

                    CheckinClusterItem checkinclusteritem = CheckinCache.getMyCheckin(timeProvider);
                    boolean flag1 = false;
                    int k = 0;
                    boolean flag = k;
                    if (checkinclusteritem != null)
                    {
                        boolean flag2 = arraylist.contains(checkinclusteritem);
                        flag = k;
                        flag1 = flag2;
                        if (!flag2)
                        {
                            arraylist.add(checkinclusteritem);
                            flag = true;
                            flag1 = flag2;
                        }
                    }
                    obj1 = LoggingMetaTags.TWC_SOCIAL;
                    k = arraylist.size();
                    int i1 = reqId;
                    Object obj2 = new StringBuilder();
                /* block-local class not found */
                class _cls1 {}

                    if (flag1)
                    {
                        void1 = "got";
                    } else
                    {
                        void1 = "did not get";
                    }
                    obj2 = ((StringBuilder) (obj2)).append(void1).append(" my checkin from server").toString();
                    if (flag)
                    {
                        void1 = (new StringBuilder()).append(", added my checkin from local:").append(checkinclusteritem).toString();
                    } else
                    {
                        void1 = "";
                    }
                    LogUtil.d("CheckinMapController", ((Iterable) (obj1)), "%s checkins, reqId=%s, %s%s", new Object[] {
                        Integer.valueOf(k), Integer.valueOf(i1), obj2, void1
                    });
                    handler.post(new _cls1(map, arraylist));
                }

                public volatile void onError(Throwable throwable, Object obj1)
                {
                    onError(throwable, (Void)obj1);
                }

                public void onError(Throwable throwable, Void void1)
                {
                    LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "error fetching checkins: reqId=%s, %s:%s", new Object[] {
                        Integer.valueOf(reqId), throwable.getClass().getSimpleName(), throwable.getMessage()
                    });
                }

            
            {
                this$0 = CheckinMapController.this;
                reqId = i;
                latestRequest = atomicinteger;
                super();
            }
            }, null);
            return;
        }
        LogUtil.d("CheckinMapController", LoggingMetaTags.TWC_SOCIAL, "too soon, request suppressed until %s", new Object[] {
            Long.valueOf(latestCheckinRequestTime + 100L)
        });
        latestRequest;
        JVM INSTR monitorexit ;
        return;
        exception;
        latestRequest;
        JVM INSTR monitorexit ;
        throw exception;
    }




/*
    static CurrentWeatherFacade access$002(CheckinMapController checkinmapcontroller, CurrentWeatherFacade currentweatherfacade)
    {
        checkinmapcontroller.currentWeather = currentweatherfacade;
        return currentweatherfacade;
    }

*/









}
