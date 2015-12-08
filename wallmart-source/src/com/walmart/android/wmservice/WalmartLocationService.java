// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.app.storelocator.LocationCompletedEvent;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.JsonMapper;
import com.walmart.android.service.MessageBus;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.utils.LocationMath;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class WalmartLocationService extends Service
{
    public static class AlarmReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            WLog.d(WalmartLocationService.TAG, "AlarmReceiver.onReceive()");
            WalmartLocationService.start(context);
        }

        public AlarmReceiver()
        {
        }
    }

    private static class LoadStoresFromFileTask extends AsyncTask
    {

        private final OnStoresLoadedCallback mCallback;
        private final Context mContext;

        protected transient StoreResult doInBackground(LatLng alatlng[])
        {
            LatLng latlng;
            latlng = alatlng[0];
            alatlng = null;
            Object obj;
            obj = new File(mContext.getCacheDir(), "last_store_result.json");
            obj = (StoreResult)WalmartLocationService.sJsonMapper.readValue(((File) (obj)), com/walmart/android/wmservice/WalmartLocationService$StoreResult);
            alatlng = ((LatLng []) (obj));
_L2:
            StoreResult storeresult = alatlng;
            if (alatlng != null)
            {
                if (System.currentTimeMillis() - ((StoreResult) (alatlng)).timestamp <= 0x5265c00L)
                {
                    break; /* Loop/switch isn't completed */
                }
                WLog.d(WalmartLocationService.TAG, "cached response no longer valid");
                storeresult = null;
            }
            return storeresult;
            IOException ioexception;
            ioexception;
            ioexception.printStackTrace();
            if (true) goto _L2; else goto _L1
_L1:
            if (LocationMath.computeDistance(latlng, alatlng.getLocation(), 'M') < 75D)
            {
                WalmartStore awalmartstore[] = ((StoreResult) (alatlng)).stores;
                int j = awalmartstore.length;
                for (int i = 0; i < j; i++)
                {
                    awalmartstore[i].setSourceCoordinates(latlng.latitude, latlng.longitude);
                }

                Arrays.sort(((StoreResult) (alatlng)).stores, new Comparator() {

                    final LoadStoresFromFileTask this$0;

                    public int compare(WalmartStore walmartstore, WalmartStore walmartstore1)
                    {
                        if (walmartstore.distanceFromSource < walmartstore1.distanceFromSource)
                        {
                            return -1;
                        }
                        return walmartstore.distanceFromSource <= walmartstore1.distanceFromSource ? 0 : 1;
                    }

                    public volatile int compare(Object obj, Object obj1)
                    {
                        return compare((WalmartStore)obj, (WalmartStore)obj1);
                    }

            
            {
                this$0 = LoadStoresFromFileTask.this;
                super();
            }
                });
                return alatlng;
            } else
            {
                return null;
            }
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((LatLng[])aobj);
        }

        protected void onPostExecute(StoreResult storeresult)
        {
            mCallback.onStoresLoaded(storeresult);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((StoreResult)obj);
        }

        public LoadStoresFromFileTask(Context context, OnStoresLoadedCallback onstoresloadedcallback)
        {
            mContext = context;
            mCallback = onstoresloadedcallback;
        }
    }

    private static class LocationData
    {

        public LatLng coordinates;
        public Location location;

        public LocationData(LatLng latlng, Location location1)
        {
            coordinates = latlng;
            location = location1;
        }
    }

    public static class NetworkConnectivtyChangeReceiver extends BroadcastReceiver
    {

        private static void enable(Context context, boolean flag)
        {
            Object obj = context.getPackageManager();
            context = new ComponentName(context, com/walmart/android/wmservice/WalmartLocationService$NetworkConnectivtyChangeReceiver);
            StringBuilder stringbuilder;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            ((PackageManager) (obj)).setComponentEnabledSetting(context, i, 1);
            obj = WalmartLocationService.TAG;
            stringbuilder = new StringBuilder();
            if (flag)
            {
                context = "Enabling";
            } else
            {
                context = "Disabling";
            }
            WLog.d(((String) (obj)), stringbuilder.append(context).append(" NetworkConnectivtyChangeReceiver").toString());
        }

        public void onReceive(Context context, Intent intent)
        {
            WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("NetworkConnectivtyChangeReceiver.onReceive(): ").append(intent.toString()).append(", extras=").append(intent.getExtras()).toString());
            enable(context, false);
            WalmartLocationService.start(context);
        }


        public NetworkConnectivtyChangeReceiver()
        {
        }
    }

    private static interface OnStoresLoadedCallback
    {

        public abstract void onStoresLoaded(StoreResult storeresult);
    }

    private static interface OnStoresSavedCallback
    {

        public abstract void onStoresSaved();
    }

    public static class ProvidersChangedReceiver extends BroadcastReceiver
    {

        private static void enable(Context context, boolean flag)
        {
            Object obj = context.getPackageManager();
            context = new ComponentName(context, com/walmart/android/wmservice/WalmartLocationService$ProvidersChangedReceiver);
            StringBuilder stringbuilder;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 2;
            }
            ((PackageManager) (obj)).setComponentEnabledSetting(context, i, 1);
            obj = WalmartLocationService.TAG;
            stringbuilder = new StringBuilder();
            if (flag)
            {
                context = "Enabling";
            } else
            {
                context = "Disabling";
            }
            WLog.d(((String) (obj)), stringbuilder.append(context).append(" ProvidersChangedReceiver").toString());
        }

        public void onReceive(Context context, Intent intent)
        {
            WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("ProvidersChangedReceiver.onReceive(): ").append(intent.toString()).append(", extras=").append(intent.getExtras()).toString());
            enable(context, false);
            WalmartLocationService.start(context);
        }


        public ProvidersChangedReceiver()
        {
        }
    }

    private static class SaveStoresToFileTask extends AsyncTask
    {

        private final OnStoresSavedCallback mCallback;
        private final Context mContext;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((StoreResult[])aobj);
        }

        protected transient Void doInBackground(StoreResult astoreresult[])
        {
            astoreresult = astoreresult[0];
            try
            {
                File file = new File(mContext.getCacheDir(), "last_store_result.json");
                WalmartLocationService.sJsonMapper.writeValue(file, astoreresult);
            }
            // Misplaced declaration of an exception variable
            catch (StoreResult astoreresult[])
            {
                astoreresult.printStackTrace();
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            mCallback.onStoresSaved();
        }

        public SaveStoresToFileTask(Context context, OnStoresSavedCallback onstoressavedcallback)
        {
            mContext = context;
            mCallback = onstoressavedcallback;
        }
    }

    public static class ShutdownReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            boolean flag = SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(context);
            WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("ShutdownReceiver.onReceive(): ").append(intent).append(", extras=").append(intent.getExtras()).append(", enable=").append(flag).toString());
            NetworkConnectivtyChangeReceiver.enable(context, flag);
        }

        public ShutdownReceiver()
        {
        }
    }

    private static class StoreResult
    {

        private double latitude;
        private double longitude;
        private WalmartStore stores[];
        private long timestamp;

        public LatLng getLocation()
        {
            return new LatLng(latitude, longitude);
        }



        public StoreResult()
        {
        }

        public StoreResult(LatLng latlng, WalmartStore awalmartstore[])
        {
            latitude = latlng.latitude;
            longitude = latlng.longitude;
            stores = awalmartstore;
            timestamp = System.currentTimeMillis();
        }
    }


    private static final int MAX_SPEED_METER_PER_SECOND = 25;
    private static final long NEXT_START_MAX_TIME = 0x36ee80L;
    private static final long NEXT_START_MIN_TIME = 0x493e0L;
    private static final String PREF_FORCED_STORE = "forced_store2";
    private static final String PREF_FORCED_STORE_OBSOLETE = "forced_store";
    private static final int RADIUS = 100;
    private static final long RESULT_VALIDITY_TIME = 0x5265c00L;
    private static final String SHARED_PREFS = "pref_location_service";
    private static final String STORE_RESULT_FILE = "last_store_result.json";
    public static final String TAG = com/walmart/android/wmservice/WalmartLocationService.getSimpleName();
    private static final JsonMapper sJsonMapper = new JsonMapper();
    private static final Object sLock = com/walmart/android/wmservice/WalmartLocationService;
    private static android.os.PowerManager.WakeLock sWakeLock;
    private final Handler mHandler = new Handler();
    private boolean mIsRunning;
    private boolean mProviderDisabled;
    private LocationCompletedEvent mServiceResult;

    public WalmartLocationService()
    {
    }

    private static void acquireWakeLock(Context context)
    {
        synchronized (sLock)
        {
            if (sWakeLock == null)
            {
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, TAG);
                sWakeLock.acquire();
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private LocationCompletedEvent createEvent(WalmartStore walmartstore, Location location)
    {
        LocationCompletedEvent locationcompletedevent = new LocationCompletedEvent();
        if (walmartstore != null)
        {
            locationcompletedevent.mClosestStoreData = walmartstore;
        }
        boolean flag;
        if (location != null)
        {
            locationcompletedevent.mAccuracy = location.getAccuracy();
            float af[] = new float[1];
            Location.distanceBetween(location.getLatitude(), location.getLongitude(), walmartstore.getLatitude(), walmartstore.getLongitude(), af);
            locationcompletedevent.mDistanceFromStore = af[0];
        } else
        {
            locationcompletedevent.mForced = true;
        }
        if (!mProviderDisabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        locationcompletedevent.mLocationEnabled = flag;
        return locationcompletedevent;
    }

    private void fetchNearbyStores(final LocationData locationData)
    {
        com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final WalmartLocationService this$0;
            final LocationData val$locationData;

            public void onFailure(int i)
            {
                WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onFailureSameThread: ").append(i).toString());
                if (!mIsRunning)
                {
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            public void onStoresReceived(WalmartStore awalmartstore[])
            {
                String s = WalmartLocationService.TAG;
                StringBuilder stringbuilder = (new StringBuilder()).append("onSuccessSameThread: ");
                Object obj;
                if (awalmartstore != null)
                {
                    obj = Integer.valueOf(awalmartstore.length);
                } else
                {
                    obj = "null";
                }
                WLog.d(s, stringbuilder.append(obj).toString());
                if (!mIsRunning)
                {
                    return;
                } else
                {
                    handleNearbyStores(awalmartstore, locationData);
                    (new SaveStoresToFileTask(WalmartLocationService.this, new OnStoresSavedCallback() {

                        final _cls3 this$1;

                        public void onStoresSaved()
                        {
                            if (!mIsRunning)
                            {
                                return;
                            } else
                            {
                                finish();
                                return;
                            }
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    })).execute(new StoreResult[] {
                        new StoreResult(locationData.coordinates, awalmartstore)
                    });
                    return;
                }
            }

            public volatile void onStoresReceived(StoreData astoredata[])
            {
                onStoresReceived((WalmartStore[])astoredata);
            }

            
            {
                this$0 = WalmartLocationService.this;
                locationData = locationdata;
                super();
            }
        };
        StoreLocationManager.getInstance(this).loadStores(locationData.coordinates, 100, 0, 1000, getstorescallback);
    }

    private void finish()
    {
        stopSelf();
        if (mServiceResult == null)
        {
            mServiceResult = new LocationCompletedEvent();
            LocationCompletedEvent locationcompletedevent = mServiceResult;
            boolean flag;
            if (!mProviderDisabled)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            locationcompletedevent.mLocationEnabled = flag;
        }
        MessageBus.getBus().post(mServiceResult);
    }

    private WalmartStore getForcedStore(Context context)
    {
        return storeFromJson(context.getSharedPreferences("pref_location_service", 0).getString("forced_store2", ""));
    }

    private void getLocation()
    {
        StoreLocationManager.getInstance(this).requestLocationInBackground(new com.walmartlabs.storelocator.StoreLocationManager.LocationCallback() {

            final WalmartLocationService this$0;

            public void onError(int i)
            {
                WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onError: ").append(i).toString());
                if (!mIsRunning)
                {
                    return;
                }
                i;
                JVM INSTR tableswitch 1 2: default 60
            //                           1 68
            //                           2 60;
                   goto _L1 _L2 _L1
_L1:
                finish();
                return;
_L2:
                mProviderDisabled = true;
                if (true) goto _L1; else goto _L3
_L3:
            }

            public void onError(ConnectionResult connectionresult)
            {
                WLog.d(WalmartLocationService.TAG, (new StringBuilder()).append("onError: ").append(connectionresult.toString()).toString());
                if (!mIsRunning)
                {
                    return;
                } else
                {
                    finish();
                    return;
                }
            }

            public void onFoundLocation(LatLng latlng, Location location)
            {
                WLog.d(WalmartLocationService.TAG, "found location");
                if (!mIsRunning)
                {
                    return;
                } else
                {
                    getNearbyStores(new LocationData(latlng, location));
                    return;
                }
            }

            public void onStarted()
            {
                WLog.d(WalmartLocationService.TAG, "getting location");
            }

            
            {
                this$0 = WalmartLocationService.this;
                super();
            }
        });
    }

    private void getNearbyStores(final LocationData locationData)
    {
        WLog.d(TAG, "getNearbyStores()");
        (new LoadStoresFromFileTask(this, new OnStoresLoadedCallback() {

            final WalmartLocationService this$0;
            final LocationData val$locationData;

            public void onStoresLoaded(StoreResult storeresult)
            {
                if (!mIsRunning)
                {
                    return;
                }
                if (storeresult != null)
                {
                    WLog.d(WalmartLocationService.TAG, "using cached stores");
                    handleNearbyStores(storeresult.stores, locationData);
                    finish();
                    return;
                } else
                {
                    fetchNearbyStores(locationData);
                    return;
                }
            }

            
            {
                this$0 = WalmartLocationService.this;
                locationData = locationdata;
                super();
            }
        })).execute(new LatLng[] {
            locationData.coordinates
        });
    }

    private void handleNearbyStores(WalmartStore awalmartstore[], LocationData locationdata)
    {
        if (awalmartstore != null && awalmartstore.length > 0)
        {
            setClosestStore(awalmartstore[0], locationdata.location);
        }
    }

    private static void releaseWakeLock()
    {
        synchronized (sLock)
        {
            if (sWakeLock != null)
            {
                sWakeLock.release();
                sWakeLock = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void saveForcedStore(Context context, WalmartStore walmartstore)
    {
        context.getSharedPreferences("pref_location_service", 0).edit().putString("forced_store2", storeAsJson(walmartstore)).apply();
    }

    private void scheduleNextStart()
    {
        AlarmManager alarmmanager = (AlarmManager)getSystemService("alarm");
        PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(this, com/walmart/android/wmservice/WalmartLocationService$AlarmReceiver), 0x10000000);
        if (getForcedStore(this) != null || !SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(this))
        {
            alarmmanager.cancel(pendingintent);
            return;
        }
        if (mProviderDisabled)
        {
            ProvidersChangedReceiver.enable(this, true);
            return;
        }
        long l = 0x36ee80L;
        if (mServiceResult != null)
        {
            l = Math.min(Math.max(((long)mServiceResult.mDistanceFromStore / 25L) * 1000L, 0x493e0L), 0x36ee80L);
        }
        alarmmanager.set(2, SystemClock.elapsedRealtime() + l, pendingintent);
        WLog.d(TAG, (new StringBuilder()).append("next start in ").append(l).append("ms").toString());
    }

    private void setClosestStore(WalmartStore walmartstore, Location location)
    {
        mServiceResult = createEvent(walmartstore, location);
    }

    public static void setForcedStore(Context context, WalmartStore walmartstore)
    {
        WLog.d(TAG, (new StringBuilder()).append("setForcedStore: ").append(walmartstore).toString());
        saveForcedStore(context, walmartstore);
        walmartstore = new Intent(context, com/walmart/android/wmservice/WalmartLocationService);
        context.stopService(walmartstore);
        start(context, walmartstore);
    }

    private void start()
    {
        WalmartStore walmartstore = getForcedStore(this);
        String s = TAG;
        StringBuilder stringbuilder = (new StringBuilder()).append("start(): ");
        boolean flag;
        if (walmartstore != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(s, stringbuilder.append(flag).toString());
        mIsRunning = true;
        if (walmartstore != null)
        {
            setClosestStore(walmartstore, null);
            finish();
            return;
        } else
        {
            getLocation();
            return;
        }
    }

    public static void start(Context context)
    {
        start(context, new Intent(context, com/walmart/android/wmservice/WalmartLocationService));
    }

    private static void start(Context context, Intent intent)
    {
        acquireWakeLock(context);
        context.startService(intent);
    }

    private static String storeAsJson(WalmartStore walmartstore)
    {
        try
        {
            walmartstore = sJsonMapper.writeValueAsString(walmartstore);
        }
        // Misplaced declaration of an exception variable
        catch (WalmartStore walmartstore)
        {
            return "";
        }
        return walmartstore;
    }

    private static WalmartStore storeFromJson(String s)
    {
        try
        {
            s = (WalmartStore)sJsonMapper.readValue(s, com/walmart/android/data/WalmartStore);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        WLog.d(TAG, (new StringBuilder()).append("onCreate(): ").append(this).toString());
    }

    public void onDestroy()
    {
        super.onDestroy();
        WLog.d(TAG, (new StringBuilder()).append("onDestroy(): ").append(this).toString());
        scheduleNextStart();
        releaseWakeLock();
        mIsRunning = false;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        WLog.d(TAG, "onStartCommand()");
        if (!mIsRunning)
        {
            acquireWakeLock(this);
            start();
        }
        return 3;
    }






/*
    static boolean access$402(WalmartLocationService walmartlocationservice, boolean flag)
    {
        walmartlocationservice.mProviderDisabled = flag;
        return flag;
    }

*/



}
