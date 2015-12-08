// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.walmartlabs.utils.LocationUtils;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreService, StoreData

public class StoreLocationManager
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, LocationListener
{
    public static interface LocationCallback
    {

        public static final int ERROR_CANCELLED = 2;
        public static final int ERROR_PROVIDER_NOT_ENABLED = 1;
        public static final int ERROR_TIMEOUT = 3;

        public abstract void onError(int i);

        public abstract void onError(ConnectionResult connectionresult);

        public abstract void onFoundLocation(LatLng latlng, Location location);

        public abstract void onStarted();
    }

    public static abstract class LocationCallbackAdapter
        implements LocationCallback
    {

        public void onError(int i)
        {
        }

        public void onError(ConnectionResult connectionresult)
        {
        }

        public void onFoundLocation(LatLng latlng, Location location)
        {
        }

        public void onStarted()
        {
        }

        public LocationCallbackAdapter()
        {
        }
    }

    private class NearbyStoresCallback
        implements StoreService.GetStoresCallback
    {

        private final StoreService.GetStoresCallback mClientCallback;
        final StoreLocationManager this$0;

        public void onFailure(int i)
        {
            WLog.v(StoreLocationManager.TAG, "NearbyStoresCallback onFailure");
            if (mClientCallback != null)
            {
                mClientCallback.onFailure(i);
            }
        }

        public void onStoresReceived(StoreData astoredata[])
        {
            WLog.v(StoreLocationManager.TAG, "NearbyStoresCallback onSuccess");
            if (astoredata != null && astoredata.length > 0)
            {
                mNearbyStores.clear();
                int j = astoredata.length;
                for (int i = 0; i < j; i++)
                {
                    astoredata[i].setSourceCoordinates(mCurrentLocation.latitude, mCurrentLocation.longitude);
                }

                mNearbyStores.addAll(Arrays.asList(astoredata));
                mNearbyStoreLocation = mCurrentLocation;
                WLog.v(StoreLocationManager.TAG, (new StringBuilder()).append(astoredata.length).append(" nearby stores added.").toString());
            }
            if (mClientCallback != null)
            {
                mClientCallback.onStoresReceived(astoredata);
            }
        }

        public NearbyStoresCallback(StoreService.GetStoresCallback getstorescallback)
        {
            this$0 = StoreLocationManager.this;
            super();
            mClientCallback = getstorescallback;
        }
    }

    private class OngoingRequest
    {

        private final ArrayList callbacks;
        private GoogleApiClient googleApiClient;
        final StoreLocationManager this$0;



/*
        static GoogleApiClient access$702(OngoingRequest ongoingrequest, GoogleApiClient googleapiclient)
        {
            ongoingrequest.googleApiClient = googleapiclient;
            return googleapiclient;
        }

*/


        private OngoingRequest()
        {
            this$0 = StoreLocationManager.this;
            super();
            callbacks = new ArrayList();
        }

    }

    private class StoreDistanceCallbackWrapper
        implements StoreService.GetStoresCallback
    {

        private final StoreService.GetStoresCallback mCallback;
        private final LatLng mCurrentLocation;
        final StoreLocationManager this$0;

        public void onFailure(int i)
        {
            mCallback.onFailure(i);
        }

        public void onStoresReceived(StoreData astoredata[])
        {
            if (astoredata != null && mCurrentLocation != null)
            {
                int j = astoredata.length;
                for (int i = 0; i < j; i++)
                {
                    astoredata[i].setSourceCoordinates(mCurrentLocation.latitude, mCurrentLocation.longitude);
                }

            }
            mCallback.onStoresReceived(astoredata);
        }

        public StoreDistanceCallbackWrapper(StoreService.GetStoresCallback getstorescallback, LatLng latlng)
        {
            this$0 = StoreLocationManager.this;
            super();
            mCallback = getstorescallback;
            mCurrentLocation = latlng;
        }
    }


    private static final int DEFAULT_RADIUS = 50;
    private static final int DEFAULT_STORE_COUNT = 10;
    private static final String LOCATION_HELPER_PREFS = null;
    private static final String PREF_NETWORK_DIALOG_SHOWN = "network_dialog";
    public static final String TAG = com/walmartlabs/storelocator/StoreLocationManager.getSimpleName();
    private static final long TIMEOUT = 15000L;
    private static StoreLocationManager sInstance;
    private final Context mContext;
    private LatLng mCurrentLocation;
    private final Handler mHandler = new Handler();
    private final Runnable mLocationTimeoutRunnable = new Runnable() {

        final StoreLocationManager this$0;

        public void run()
        {
            WLog.i(StoreLocationManager.TAG, "Location fix timed out.");
            if (mOngoingLocationRequest == null)
            {
                return;
            } else
            {
                getLastKnownLocation();
                finishOngoingLocationRequest();
                return;
            }
        }

            
            {
                this$0 = StoreLocationManager.this;
                super();
            }
    };
    private LatLng mNearbyStoreLocation;
    private final ArrayList mNearbyStores = new ArrayList();
    private OngoingRequest mOngoingLocationRequest;
    private final SharedPreferences mPrefs;

    private StoreLocationManager(Context context)
    {
        mContext = context.getApplicationContext();
        mPrefs = context.getSharedPreferences(LOCATION_HELPER_PREFS, 0);
    }

    private Dialog createDialog(final Context context, int i, final boolean requestOnCancel, final LocationCallback callback)
    {
        return (new com.walmart.android.ui.CustomAlertDialog.Builder(context)).setMessage(i).setCancelable(false).setPositiveButton(0x1040013, new android.content.DialogInterface.OnClickListener() {

            final StoreLocationManager this$0;
            final LocationCallback val$callback;
            final Context val$context;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                launchLocationSettings(context);
                if (callback != null)
                {
                    callback.onError(2);
                }
            }

            
            {
                this$0 = StoreLocationManager.this;
                context = context1;
                callback = locationcallback;
                super();
            }
        }).setNegativeButton(0x1040009, new android.content.DialogInterface.OnClickListener() {

            final StoreLocationManager this$0;
            final LocationCallback val$callback;
            final boolean val$requestOnCancel;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                if (requestOnCancel)
                {
                    requestLocation(callback);
                } else
                if (callback != null)
                {
                    callback.onError(1);
                    return;
                }
            }

            
            {
                this$0 = StoreLocationManager.this;
                requestOnCancel = flag;
                callback = locationcallback;
                super();
            }
        }).create();
    }

    private Dialog createDialog(Context context, LocationCallback locationcallback)
    {
        Object obj = null;
        boolean flag = isProviderEnabled("network");
        boolean flag1 = isProviderEnabled("gps");
        Dialog dialog;
        if (!flag && !flag1)
        {
            dialog = createDialog(context, com.walmart.lib.R.string.location_dialog_activate_source, false, locationcallback);
        } else
        {
            dialog = obj;
            if (!flag)
            {
                dialog = obj;
                if (!mPrefs.getBoolean("network_dialog", false))
                {
                    context = createDialog(context, com.walmart.lib.R.string.location_dialog_activate_wireless, true, locationcallback);
                    enablePref("network_dialog");
                    return context;
                }
            }
        }
        return dialog;
    }

    private void enablePref(String s)
    {
        android.content.SharedPreferences.Editor editor = mPrefs.edit();
        editor.putBoolean(s, true);
        editor.apply();
    }

    private void finishOngoingLocationRequest()
    {
        mHandler.removeCallbacks(mLocationTimeoutRunnable);
        if (mOngoingLocationRequest != null && mOngoingLocationRequest.googleApiClient != null && mOngoingLocationRequest.googleApiClient.isConnected())
        {
            try
            {
                mOngoingLocationRequest.googleApiClient.unregisterConnectionCallbacks(this);
                mOngoingLocationRequest.googleApiClient.unregisterConnectionFailedListener(this);
                LocationServices.FusedLocationApi.removeLocationUpdates(mOngoingLocationRequest.googleApiClient, this);
                mOngoingLocationRequest.googleApiClient.disconnect();
            }
            catch (IllegalStateException illegalstateexception)
            {
                WLog.e(TAG, "caught exception while finishing ongoing location request", illegalstateexception);
            }
        }
        mOngoingLocationRequest = null;
    }

    public static StoreLocationManager getInstance(Context context)
    {
        if (sInstance == null)
        {
            sInstance = new StoreLocationManager(context);
        }
        return sInstance;
    }

    private void getLastKnownLocation()
    {
        Iterator iterator1 = null;
        Object obj = iterator1;
        if (mOngoingLocationRequest.googleApiClient != null)
        {
            obj = iterator1;
            if (mOngoingLocationRequest.googleApiClient.isConnected())
            {
                try
                {
                    obj = LocationServices.FusedLocationApi.getLastLocation(mOngoingLocationRequest.googleApiClient);
                }
                catch (IllegalStateException illegalstateexception)
                {
                    WLog.e(TAG, "caught exception while trying to get last known location", illegalstateexception);
                    illegalstateexception = iterator1;
                }
            }
        }
        if (obj != null)
        {
            WLog.i(TAG, "initLocation(): Found a last known location.");
            setCurrentLocation(LocationUtils.locationToCoordinates(((Location) (obj))));
            for (iterator1 = mOngoingLocationRequest.callbacks.iterator(); iterator1.hasNext(); ((LocationCallback)iterator1.next()).onFoundLocation(mCurrentLocation, ((Location) (obj)))) { }
        } else
        {
            WLog.i(TAG, "initLocation(): No known last location.");
            for (Iterator iterator = mOngoingLocationRequest.callbacks.iterator(); iterator.hasNext(); ((LocationCallback)iterator.next()).onError(3)) { }
        }
    }

    private void internalLoadStores(LatLng latlng, int i, int j, int k, StoreService.GetStoresCallback getstorescallback)
    {
        StoreService.getStoreService().getStores(latlng.longitude, latlng.latitude, i, j, k, getstorescallback);
    }

    private boolean isProviderEnabled(String s)
    {
        boolean flag;
        try
        {
            flag = ((LocationManager)mContext.getSystemService("location")).isProviderEnabled(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    private void launchLocationSettings(Context context)
    {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(0x10000000);
        try
        {
            context.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            launchSettings(context);
        }
    }

    private void launchSettings(Context context)
    {
        try
        {
            Intent intent = new Intent("android.settings.SETTINGS");
            intent.setFlags(0x10000000);
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private void requestLocation()
    {
        LocationRequest locationrequest = new LocationRequest();
        locationrequest.setPriority(102);
        locationrequest.setNumUpdates(1);
        try
        {
            LocationServices.FusedLocationApi.requestLocationUpdates(mOngoingLocationRequest.googleApiClient, locationrequest, this);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            WLog.e(TAG, "failed to request location", illegalstateexception);
        }
        onConnectionFailed(new ConnectionResult(8, null));
    }

    private void requestLocation(LocationCallback locationcallback)
    {
        WLog.i(TAG, "requestLocation");
        if (isProviderEnabled("gps") || isProviderEnabled("network"))
        {
            if (mOngoingLocationRequest == null)
            {
                mOngoingLocationRequest = new OngoingRequest();
                mOngoingLocationRequest.googleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(mContext)).addApi(LocationServices.API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
                mOngoingLocationRequest.googleApiClient.connect();
                mHandler.postDelayed(mLocationTimeoutRunnable, 15000L);
            }
            locationcallback.onStarted();
            mOngoingLocationRequest.callbacks.add(locationcallback);
            return;
        } else
        {
            locationcallback.onError(1);
            return;
        }
    }

    private void setCurrentLocation(LatLng latlng)
    {
        mCurrentLocation = latlng;
    }

    public void destroy()
    {
        finishOngoingLocationRequest();
    }

    public LatLng getCurrentLocation()
    {
        return mCurrentLocation;
    }

    public List getNearbyByStores()
    {
        return new ArrayList(mNearbyStores);
    }

    public boolean loadNearbyStores(StoreService.GetStoresCallback getstorescallback)
    {
        if (mCurrentLocation == null)
        {
            return false;
        } else
        {
            internalLoadStores(mCurrentLocation, 50, 0, 10, new NearbyStoresCallback(getstorescallback));
            return true;
        }
    }

    public void loadStores(LatLng latlng, int i, int j, int k, StoreService.GetStoresCallback getstorescallback)
    {
        if (!latlng.equals(mCurrentLocation)) goto _L2; else goto _L1
_L1:
        Object obj = new NearbyStoresCallback(getstorescallback);
_L4:
        internalLoadStores(latlng, i, j, k, ((StoreService.GetStoresCallback) (obj)));
        return;
_L2:
        obj = getstorescallback;
        if (getstorescallback != null)
        {
            obj = new StoreDistanceCallbackWrapper(getstorescallback, mCurrentLocation);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onConnected(Bundle bundle)
    {
        mHandler.post(new Runnable() {

            final StoreLocationManager this$0;

            public void run()
            {
                WLog.d(StoreLocationManager.TAG, "onConnected");
                if (mOngoingLocationRequest == null)
                {
                    return;
                } else
                {
                    requestLocation();
                    return;
                }
            }

            
            {
                this$0 = StoreLocationManager.this;
                super();
            }
        });
    }

    public void onConnectionFailed(final ConnectionResult connectionResult)
    {
        mHandler.post(new Runnable() {

            final StoreLocationManager this$0;
            final ConnectionResult val$connectionResult;

            public void run()
            {
                WLog.d(StoreLocationManager.TAG, "onConnectionFailed");
                if (mOngoingLocationRequest == null)
                {
                    return;
                }
                for (Iterator iterator = mOngoingLocationRequest.callbacks.iterator(); iterator.hasNext(); ((LocationCallback)iterator.next()).onError(connectionResult)) { }
                finishOngoingLocationRequest();
            }

            
            {
                this$0 = StoreLocationManager.this;
                connectionResult = connectionresult;
                super();
            }
        });
    }

    public void onConnectionSuspended(int i)
    {
        mHandler.post(new Runnable() {

            final StoreLocationManager this$0;

            public void run()
            {
                WLog.d(StoreLocationManager.TAG, "onConnectionSuspended");
                if (mOngoingLocationRequest == null)
                {
                    return;
                }
                for (Iterator iterator = mOngoingLocationRequest.callbacks.iterator(); iterator.hasNext(); ((LocationCallback)iterator.next()).onError(1)) { }
                finishOngoingLocationRequest();
            }

            
            {
                this$0 = StoreLocationManager.this;
                super();
            }
        });
    }

    public void onLocationChanged(final Location location)
    {
        mHandler.post(new Runnable() {

            final StoreLocationManager this$0;
            final Location val$location;

            public void run()
            {
                WLog.i(StoreLocationManager.TAG, (new StringBuilder()).append("onLocationChanged: ").append(location).toString());
                if (mOngoingLocationRequest == null)
                {
                    return;
                }
                LatLng latlng = LocationUtils.locationToCoordinates(location);
                setCurrentLocation(latlng);
                for (Iterator iterator = mOngoingLocationRequest.callbacks.iterator(); iterator.hasNext(); ((LocationCallback)iterator.next()).onFoundLocation(latlng, location)) { }
                finishOngoingLocationRequest();
            }

            
            {
                this$0 = StoreLocationManager.this;
                location = location1;
                super();
            }
        });
    }

    public void pruneStores()
    {
        int i = mNearbyStores.size();
        if (i > 10)
        {
            mNearbyStores.subList(10, i).clear();
        }
    }

    public void requestLocation(boolean flag, Context context, LocationCallback locationcallback)
    {
        if (mOngoingLocationRequest == null && flag)
        {
            context = createDialog(context, locationcallback);
        } else
        {
            context = null;
        }
        if (context != null)
        {
            context.show();
            return;
        } else
        {
            requestLocation(locationcallback);
            return;
        }
    }

    public void requestLocationInBackground(LocationCallback locationcallback)
    {
        requestLocation(false, null, locationcallback);
    }

    public void requestLocationWithDialogs(Context context, LocationCallback locationcallback)
    {
        requestLocation(true, context, locationcallback);
    }











/*
    static LatLng access$502(StoreLocationManager storelocationmanager, LatLng latlng)
    {
        storelocationmanager.mNearbyStoreLocation = latlng;
        return latlng;
    }

*/

}
