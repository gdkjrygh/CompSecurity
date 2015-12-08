// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.maps.android.clustering.ClusterManager;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.SpannableUtils;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapView, CheckinIcon, CheckinIconProvider, CheckinClusterRenderer, 
//            CheckinMapController, CheckinClusterItem

public class CheckinMapViewLayout extends LinearLayout
    implements CheckinMapView
{
    private class CheckinButtonListener
        implements android.view.View.OnClickListener
    {

        private final int code;
        final CheckinMapViewLayout this$0;

        public void onClick(View view)
        {
            controller.checkin(code);
        }

        private CheckinButtonListener(int i)
        {
            this$0 = CheckinMapViewLayout.this;
            super();
            code = i;
        }

    }

    private class CheckinConnectionCallbacks
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        final CheckinMapViewLayout this$0;

        public void onConnected(Bundle bundle)
        {
            LocationServices.FusedLocationApi.requestLocationUpdates(locationClient, CheckinMapViewLayout.LOCATION_REQUEST, locationListener);
        }

        public void onConnectionSuspended(int i)
        {
        }

        private CheckinConnectionCallbacks()
        {
            this$0 = CheckinMapViewLayout.this;
            super();
        }

    }

    private class CheckinLocationListener
        implements LocationListener
    {

        final CheckinMapViewLayout this$0;

        public void onLocationChanged(Location location)
        {
            myLocationView.setText(String.format("My Location= %.3f, %.3f", new Object[] {
                Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())
            }));
        }

        private CheckinLocationListener()
        {
            this$0 = CheckinMapViewLayout.this;
            super();
        }

    }

    private static class CheckinOnConnectionFailedListener
        implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    {

        public void onConnectionFailed(ConnectionResult connectionresult)
        {
        }

        private CheckinOnConnectionFailedListener()
        {
        }

    }


    private static final LocationRequest LOCATION_REQUEST;
    private static final String TAG = "CheckinMapViewLayout";
    private final AtomicInteger cameraPositionChangeCounter;
    private TextView cameraView;
    private ClusterManager clusterManager;
    CheckinMapController controller;
    private final List dayButtons;
    private final List fogButtons;
    FragmentManager fragmentManager;
    private TextView fullGeohashView;
    private TextView geohashView;
    private final List hailButtons;
    private boolean isPreviousLocationFollowMe;
    private SavedLocation loc;
    private GoogleApiClient locationClient;
    private final LocationListener locationListener;
    private TextView lockoutView;
    private GoogleMap map;
    private TextView myLocationView;
    private final List nightButtons;
    private double pannedLatitude;
    private double pannedLongitude;
    private SavedLocation previousLocation;
    private View reportYourWeatherView;
    private final List thunderButtons;
    private TextView visibleView;
    private final List winterButtons;

    public CheckinMapViewLayout(Context context)
    {
        super(context);
        locationListener = new CheckinLocationListener();
        cameraPositionChangeCounter = new AtomicInteger(0);
        nightButtons = Lists.newArrayList();
        dayButtons = Lists.newArrayList();
        winterButtons = Lists.newArrayList();
        hailButtons = Lists.newArrayList();
        fogButtons = Lists.newArrayList();
        thunderButtons = Lists.newArrayList();
    }

    public CheckinMapViewLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        locationListener = new CheckinLocationListener();
        cameraPositionChangeCounter = new AtomicInteger(0);
        nightButtons = Lists.newArrayList();
        dayButtons = Lists.newArrayList();
        winterButtons = Lists.newArrayList();
        hailButtons = Lists.newArrayList();
        fogButtons = Lists.newArrayList();
        thunderButtons = Lists.newArrayList();
    }

    public CheckinMapViewLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        locationListener = new CheckinLocationListener();
        cameraPositionChangeCounter = new AtomicInteger(0);
        nightButtons = Lists.newArrayList();
        dayButtons = Lists.newArrayList();
        winterButtons = Lists.newArrayList();
        hailButtons = Lists.newArrayList();
        fogButtons = Lists.newArrayList();
        thunderButtons = Lists.newArrayList();
    }

    private ImageView initializeButton(ImageView imageview, int i)
    {
        CheckinIcon checkinicon = new CheckinIcon(i, getContext());
        imageview.setImageDrawable(CheckinIconProvider.BUTTON_PROVIDER.getDrawable(getContext(), checkinicon.getIconResourceId()));
        imageview.setOnClickListener(new CheckinButtonListener(i));
        return imageview;
    }

    private static void setButtonVisibility(boolean flag, Iterable iterable)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        for (iterable = iterable.iterator(); iterable.hasNext(); ((ImageView)iterable.next()).setVisibility(i)) { }
    }

    private void setUpMapIfNeeded()
    {
        Object obj = FlagshipApplication.getInstance().getLocationManager().getCurrentLocation();
        if (map != null && (obj == null || ((SavedLocation) (obj)).equals(loc)))
        {
            return;
        }
        MapFragment mapfragment = (MapFragment)fragmentManager.findFragmentById(0x7f0d00b6);
        if (mapfragment != null)
        {
            map = mapfragment.getMap();
        }
        if (map == null)
        {
            Log.w("CheckinMapViewLayout", "unable to create interactive weather checkin map");
            return;
        }
        MapsInitializer.initialize(getContext());
        loc = ((SavedLocation) (obj));
        map.setBuildingsEnabled(true);
        map.setIndoorEnabled(false);
        map.setMapType(1);
        map.setMyLocationEnabled(true);
        map.setTrafficEnabled(false);
        if (loc != null)
        {
            obj = CameraUpdateFactory.newLatLngZoom(new LatLng(loc.getLat(), loc.getLng()), 14F);
            map.moveCamera(((com.google.android.gms.maps.CameraUpdate) (obj)));
        }
        obj = map.getUiSettings();
        ((UiSettings) (obj)).setCompassEnabled(true);
        ((UiSettings) (obj)).setMyLocationButtonEnabled(true);
        ((UiSettings) (obj)).setRotateGesturesEnabled(true);
        ((UiSettings) (obj)).setScrollGesturesEnabled(true);
        ((UiSettings) (obj)).setTiltGesturesEnabled(true);
        ((UiSettings) (obj)).setZoomGesturesEnabled(true);
        ((UiSettings) (obj)).setZoomControlsEnabled(false);
        map.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener() {

            final CheckinMapViewLayout this$0;

            public boolean onMyLocationButtonClick()
            {
                SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
                if (savedlocation != null && LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
                {
                    moveMapToLocation(savedlocation);
                    controller.setActionBarToFollowMe();
                }
                return true;
            }

            
            {
                this$0 = CheckinMapViewLayout.this;
                super();
            }
        });
        clusterManager = new ClusterManager(getContext(), map);
        clusterManager.setRenderer(new CheckinClusterRenderer(getContext(), map, clusterManager));
        map.setOnCameraChangeListener(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {

            final CheckinMapViewLayout this$0;

            public void onCameraChange(CameraPosition cameraposition)
            {
                int i = cameraPositionChangeCounter.incrementAndGet();
                cameraView.setText(String.format("Camera Position: %.3f, %.3f, zoom=%.2f, (%d)", new Object[] {
                    Double.valueOf(cameraposition.target.latitude), Double.valueOf(cameraposition.target.longitude), Float.valueOf(cameraposition.zoom), Integer.valueOf(i)
                }));
                LatLngBounds latlngbounds = map.getProjection().getVisibleRegion().latLngBounds;
                visibleView.setText(String.format("Visible Bounds: sw=%.3f, %.3f, ne=%.3f, %.3f", new Object[] {
                    Double.valueOf(latlngbounds.southwest.latitude), Double.valueOf(latlngbounds.southwest.longitude), Double.valueOf(latlngbounds.northeast.latitude), Double.valueOf(latlngbounds.northeast.longitude)
                }));
                controller.updateCheckins();
                pannedLatitude = cameraposition.target.latitude;
                pannedLongitude = cameraposition.target.longitude;
            }

            
            {
                this$0 = CheckinMapViewLayout.this;
                super();
            }
        });
        LogUtil.v("CheckinMapViewLayout", LoggingMetaTags.TWC_SOCIAL, "interactive weather checkin map setup complete", new Object[0]);
    }

    public void addClusterItem(CheckinClusterItem checkinclusteritem)
    {
        if (clusterManager != null)
        {
            clusterManager.addItem(checkinclusteritem);
            clusterManager.cluster();
        }
    }

    public void animateButtonsSlidingIn()
    {
        View view = findViewById(0x7f0d00ba);
        view.setVisibility(0);
        view.startAnimation((Animation)Preconditions.checkNotNull(AnimationUtils.loadAnimation(getContext(), 0x7f040000)));
    }

    public void displayFullGeohashDebugText(String s)
    {
        fullGeohashView.setText((CharSequence)Preconditions.checkNotNull(s));
    }

    public void displayGeohashDebugText(String s)
    {
        geohashView.setText((CharSequence)Preconditions.checkNotNull(s));
    }

    public com.weather.util.geometry.LatLngBounds getLatLngBounds()
    {
        LatLngBounds latlngbounds;
        if (map != null)
        {
            if (Math.abs((latlngbounds = map.getProjection().getVisibleRegion().latLngBounds).northeast.longitude) >= 0.01D || Math.abs(latlngbounds.southwest.longitude) >= 0.01D || Math.abs(latlngbounds.northeast.latitude) >= 0.01D || Math.abs(latlngbounds.southwest.latitude) >= 0.01D)
            {
                return new com.weather.util.geometry.LatLngBounds(new com.weather.util.geometry.LatLng(Double.valueOf(latlngbounds.northeast.latitude), Double.valueOf(latlngbounds.northeast.longitude)), new com.weather.util.geometry.LatLng(Double.valueOf(latlngbounds.southwest.latitude), Double.valueOf(latlngbounds.southwest.longitude)));
            }
        }
        return null;
    }

    public void hideCheckinButtons()
    {
        findViewById(0x7f0d00ba).setVisibility(4);
    }

    public void moveMapToLocation(SavedLocation savedlocation)
    {
        Preconditions.checkNotNull(savedlocation);
        if (map != null)
        {
            Object obj = new LatLng(savedlocation.getLat(), savedlocation.getLng());
            LatLngBounds latlngbounds = map.getProjection().getVisibleRegion().latLngBounds;
            float f1 = map.getCameraPosition().zoom;
            if (!latlngbounds.contains(((LatLng) (obj))) || f1 < 10F)
            {
                float f = f1;
                if (f1 < 10F)
                {
                    f = 14F;
                }
                obj = CameraUpdateFactory.newCameraPosition(new CameraPosition(((LatLng) (obj)), f, 0.0F, 0.0F));
                map.animateCamera(((com.google.android.gms.maps.CameraUpdate) (obj)), 1200, null);
            }
            previousLocation = savedlocation;
        }
    }

    public void moveMapToLocationIfNotFollowmeUpdate(SavedLocation savedlocation, boolean flag)
    {
        Preconditions.checkNotNull(savedlocation);
        if (previousLocation != null && isPreviousLocationFollowMe && flag && (Double.compare(pannedLatitude, previousLocation.getLat()) != 0 || Double.compare(pannedLongitude, previousLocation.getLng()) != 0))
        {
            return;
        } else
        {
            moveMapToLocation(savedlocation);
            isPreviousLocationFollowMe = flag;
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        myLocationView = (TextView)findViewById(0x7f0d00b1);
        cameraView = (TextView)findViewById(0x7f0d00b2);
        visibleView = (TextView)findViewById(0x7f0d00b3);
        geohashView = (TextView)findViewById(0x7f0d00b4);
        fullGeohashView = (TextView)findViewById(0x7f0d00b5);
        thunderButtons.add(initializeButton((ImageView)findViewById(0x7f0d00bb), 4));
        dayButtons.add(initializeButton((ImageView)findViewById(0x7f0d00bf), 32));
        nightButtons.add(initializeButton((ImageView)findViewById(0x7f0d00c0), 31));
        initializeButton((ImageView)findViewById(0x7f0d00bc), 12);
        hailButtons.add(initializeButton((ImageView)findViewById(0x7f0d00bd), 17));
        fogButtons.add(initializeButton((ImageView)findViewById(0x7f0d00be), 19));
        dayButtons.add(initializeButton((ImageView)findViewById(0x7f0d00c1), 30));
        nightButtons.add(initializeButton((ImageView)findViewById(0x7f0d00c2), 29));
        initializeButton((ImageView)findViewById(0x7f0d00c3), 26);
        initializeButton((ImageView)findViewById(0x7f0d00c4), 23);
        winterButtons.add(initializeButton((ImageView)findViewById(0x7f0d00c5), 16));
        winterButtons.add(initializeButton((ImageView)findViewById(0x7f0d00c6), 5));
        reportYourWeatherView = findViewById(0x7f0d00b8);
        lockoutView = (TextView)findViewById(0x7f0d00b7);
    }

    public void pause()
    {
        if (locationClient != null)
        {
            locationClient.disconnect();
        }
    }

    public void resume()
    {
        setUpMapIfNeeded();
        if (map == null)
        {
            return;
        }
        if (locationClient == null)
        {
            locationClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(getContext())).addConnectionCallbacks(new CheckinConnectionCallbacks()).addOnConnectionFailedListener(new CheckinOnConnectionFailedListener()).addApi(LocationServices.API).build();
        }
        locationClient.connect();
    }

    public void setDay(boolean flag)
    {
        setButtonVisibility(flag, dayButtons);
    }

    public void setFog(boolean flag)
    {
        setButtonVisibility(flag, fogButtons);
    }

    public void setHail(boolean flag)
    {
        setButtonVisibility(flag, hailButtons);
    }

    public void setNight(boolean flag)
    {
        setButtonVisibility(flag, nightButtons);
    }

    public void setThunder(boolean flag)
    {
        setButtonVisibility(flag, thunderButtons);
    }

    public void setWinter(boolean flag)
    {
        setButtonVisibility(flag, winterButtons);
    }

    public void showButtons()
    {
        lockoutView.setVisibility(4);
        reportYourWeatherView.setVisibility(0);
    }

    public void showLockout(long l)
    {
        Resources resources = getContext().getResources();
        int i = (int)TimeUnit.MILLISECONDS.toMinutes(l);
        int j = (int)TimeUnit.MILLISECONDS.toSeconds(Math.max(0L, l - TimeUnit.MINUTES.toMillis(i)));
        Object obj = String.format(Locale.getDefault(), "%02d:%02d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        obj = SpannableUtils.insertSingleSpannedString(resources.getString(0x7f0700c4), ((String) (obj)));
        ((com.weather.util.SpannableUtils.StringWithSingleSpan) (obj)).theString.setSpan(new ForegroundColorSpan(resources.getColor(0x7f0b001c)), ((com.weather.util.SpannableUtils.StringWithSingleSpan) (obj)).spanStart, ((com.weather.util.SpannableUtils.StringWithSingleSpan) (obj)).spanEnd, 0);
        lockoutView.setText(((com.weather.util.SpannableUtils.StringWithSingleSpan) (obj)).theString);
        reportYourWeatherView.setVisibility(4);
        lockoutView.setVisibility(0);
    }

    public void updateClusterItems(Collection collection)
    {
        if (clusterManager != null)
        {
            clusterManager.clearItems();
            clusterManager.addItems(collection);
            clusterManager.cluster();
        }
    }

    static 
    {
        LOCATION_REQUEST = LocationRequest.create().setInterval(TimeUnit.SECONDS.toMillis(15L)).setFastestInterval(TimeUnit.SECONDS.toMillis(1L)).setPriority(104).setSmallestDisplacement(15F);
    }









/*
    static double access$702(CheckinMapViewLayout checkinmapviewlayout, double d)
    {
        checkinmapviewlayout.pannedLatitude = d;
        return d;
    }

*/


/*
    static double access$802(CheckinMapViewLayout checkinmapviewlayout, double d)
    {
        checkinmapviewlayout.pannedLongitude = d;
        return d;
    }

*/

}
