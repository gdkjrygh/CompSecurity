// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.ViewTreeObserver;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.LocationMath;
import java.util.HashMap;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreFinderConfigurator, StoreManager, StoreData, StorePickerListener

public class StoreMapController
{

    public static final int DEFAULT_MAX_RADIUS = 500;
    public static final int DEFAULT_STORES_IN_VIEW = 6;
    public static final int MAX_STORES_TO_LOAD = 50;
    public static final int MIN_STORES_TO_LOAD = 10;
    private static final String TAG = com/walmartlabs/storelocator/StoreMapController.getSimpleName();
    private StoreFinderConfigurator mConfigurator;
    private Marker mCurrentMarker;
    private double mCurrentRadius;
    private LatLng mLastSetLocation;
    private final MapView mMapView;
    private final HashMap mMarkerMapping = new HashMap();
    private final StoreManager mStoreManager;
    private StorePickerListener mStorePickerListener;
    private final HashMap mStoreToMarkerMap = new HashMap();
    private Marker mUserLocationMarker;
    private final com.google.android.gms.maps.GoogleMap.InfoWindowAdapter mWindowAdapter;

    public StoreMapController(MapView mapview, StoreManager storemanager, StoreFinderConfigurator storefinderconfigurator, Context context)
    {
        mMapView = mapview;
        mStoreManager = storemanager;
        mConfigurator = storefinderconfigurator;
        mWindowAdapter = mConfigurator.createInfoWindowAdapter(context);
    }

    public void cleanUp()
    {
        GoogleMap googlemap = mMapView.getMap();
        if (googlemap != null)
        {
            googlemap.clear();
        }
        mStoreToMarkerMap.clear();
        mMarkerMapping.clear();
        mStorePickerListener = null;
    }

    public void clearFlag()
    {
        if (mCurrentMarker != null)
        {
            mCurrentMarker.hideInfoWindow();
            mCurrentMarker = null;
        }
    }

    public void init()
    {
        final GoogleMap map = mMapView.getMap();
        if (map != null)
        {
            boolean flag = mMapView.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
            UiSettings uisettings = map.getUiSettings();
            if (!flag || mConfigurator.forceShowZoomButtons())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uisettings.setZoomControlsEnabled(flag);
            map.getUiSettings().setMapToolbarEnabled(false);
            map.setInfoWindowAdapter(mWindowAdapter);
            map.setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {

                final StoreMapController this$0;

                public void onInfoWindowClick(Marker marker)
                {
                    if (mStorePickerListener != null)
                    {
                        marker = (StoreData)mMarkerMapping.get(marker.getId());
                        if (marker != null)
                        {
                            mStorePickerListener.onStoreClicked(marker);
                        }
                    }
                }

            
            {
                this$0 = StoreMapController.this;
                super();
            }
            });
            map.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

                final StoreMapController this$0;

                public boolean onMarkerClick(Marker marker)
                {
                    mCurrentMarker = marker;
                    return false;
                }

            
            {
                this$0 = StoreMapController.this;
                super();
            }
            });
            map = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final StoreMapController this$0;
                final GoogleMap val$map;

                public void onGlobalLayout()
                {
                    com.google.android.gms.maps.CameraUpdate cameraupdate = CameraUpdateFactory.newLatLngBounds(mConfigurator.getDefaultBounds(), 20);
                    map.moveCamera(cameraupdate);
                    mMapView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }

            
            {
                this$0 = StoreMapController.this;
                map = googlemap;
                super();
            }
            };
            mMapView.getViewTreeObserver().addOnGlobalLayoutListener(map);
        }
    }

    public boolean isInCircle(LatLng latlng)
    {
        return mLastSetLocation == null || LocationMath.computeDistance(latlng.latitude, latlng.longitude, mLastSetLocation.latitude, mLastSetLocation.longitude, 'M') <= mCurrentRadius;
    }

    public void reloadStoreData()
    {
        LatLng latlng = null;
        if (mUserLocationMarker != null)
        {
            latlng = mUserLocationMarker.getPosition();
            mUserLocationMarker = null;
        }
        GoogleMap googlemap = mMapView.getMap();
        if (googlemap != null)
        {
            googlemap.clear();
            if (latlng != null)
            {
                setUserLocation(latlng);
            }
            mCurrentMarker = null;
            mMarkerMapping.clear();
            mStoreToMarkerMap.clear();
            int j = mStoreManager.size();
            LatLng alatlng[] = new LatLng[j];
            for (int i = 0; i < j; i++)
            {
                StoreData storedata = mStoreManager.getStore(i);
                alatlng[i] = new LatLng(storedata.getLatitude(), storedata.getLongitude());
                Marker marker = googlemap.addMarker(mConfigurator.createMarkerOptions(storedata, alatlng[i]));
                mMarkerMapping.put(marker.getId(), storedata);
                mStoreToMarkerMap.put(storedata, marker);
            }

        }
    }

    public void setLocation(LatLng latlng, boolean flag)
    {
        mLastSetLocation = latlng;
        mCurrentRadius = 0.0D;
        int j = mStoreManager.size();
        for (int i = 0; i < j; i++)
        {
            StoreData storedata = mStoreManager.getStore(i);
            double d = LocationMath.computeDistance(latlng.latitude, latlng.longitude, storedata.getLatitude(), storedata.getLongitude(), 'M');
            if (d > mCurrentRadius)
            {
                mCurrentRadius = d;
            }
        }

        if (flag)
        {
            showLocationAndStoresAround(latlng);
        }
    }

    public void setStorePickerListener(StorePickerListener storepickerlistener)
    {
        mStorePickerListener = storepickerlistener;
    }

    public void setUserLocation(LatLng latlng)
    {
        GoogleMap googlemap = mMapView.getMap();
        if (mUserLocationMarker == null)
        {
            if (googlemap != null)
            {
                mUserLocationMarker = googlemap.addMarker((new MarkerOptions()).position(latlng).icon(BitmapDescriptorFactory.fromResource(com.walmart.lib.R.drawable.ic_maps_indicator_current_position)));
            }
            return;
        } else
        {
            mUserLocationMarker.setPosition(latlng);
            return;
        }
    }

    public void showFlagForStore(StoreData storedata)
    {
        mCurrentMarker = (Marker)mStoreToMarkerMap.get(storedata);
        if (mCurrentMarker != null)
        {
            mCurrentMarker.showInfoWindow();
        }
    }

    public void showLastLocationAndStoresAround()
    {
        if (mLastSetLocation != null)
        {
            showLocationAndStoresAround(mLastSetLocation);
        }
    }

    public void showLocationAndStoresAround(LatLng latlng)
    {
        com.google.android.gms.maps.model.LatLngBounds.Builder builder;
        int i1 = Math.min(6, mStoreManager.size());
        builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        builder.include(latlng);
        int k = 1;
        for (int i = 0; i < i1;)
        {
            StoreData storedata = mStoreManager.getStore(i);
            int l = k;
            if (LocationMath.computeDistance(latlng.latitude, latlng.longitude, storedata.getLatitude(), storedata.getLongitude(), 'M') < 500D)
            {
                l = k + 1;
                builder.include(new LatLng(storedata.getLatitude(), storedata.getLongitude()));
            }
            i++;
            k = l;
        }

        if (k < 3)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        int j = (int)(0.80000000000000004D * (double)(Math.min(mMapView.getWidth(), mMapView.getHeight()) / 2));
        j = Math.min(ViewUtil.dpToPixels(mConfigurator.getMarkerWidth() / 2, mMapView.getContext()), j);
        latlng = CameraUpdateFactory.newLatLngBounds(builder.build(), j);
_L1:
        mMapView.getMap().animateCamera(latlng);
        return;
        try
        {
            latlng = CameraUpdateFactory.newLatLngZoom(latlng, 10F);
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            Log.e(TAG, "failed to show requested location", latlng);
            return;
        }
          goto _L1
    }





/*
    static Marker access$202(StoreMapController storemapcontroller, Marker marker)
    {
        storemapcontroller.mCurrentMarker = marker;
        return marker;
    }

*/


}
