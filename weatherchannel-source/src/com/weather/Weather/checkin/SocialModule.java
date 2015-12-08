// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.TreeMultimap;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.checkin.CheckinFetcher;
import com.weather.dal2.checkin.GetCheckinResponse;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.geometry.LatLng;
import com.weather.util.geometry.TwcGeohashUtils;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.maps.GoogleStaticMapsUrl;
import com.weather.util.maps.MapUtil;
import com.weather.util.time.SystemTimeProvider;
import com.weather.util.time.TimeProvider;
import com.weather.util.ui.Dimension;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import org.jgeohash.distance.MeasuringUnit;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinCache, CheckinCounts, CheckinIcon, CheckinIconProvider, 
//            SocialLocalyticsModuleHandler

public final class SocialModule extends Module
{

    private static final String TAG = "ChatModule";
    private final CheckinFetcher checkinFetcher;
    private final Receiver checkinReceiver;
    private final android.view.View.OnClickListener clickReport;
    private final android.view.View.OnClickListener clickShare;
    private SavedLocation currentLocation;
    private final LocationManager locationManager;
    private ImageView mapImage;
    private Dimension mapImageSize;
    private final int mapRadiusMiles;
    private boolean paused;
    private TextView peopleMessage;
    private final Picasso picasso;
    private final int scale;
    private boolean stale;
    private final TimeProvider timeProvider;
    private ImageView weatherIcon;
    private int zoomLevel;

    public SocialModule(Context context, ModuleConfig moduleconfig, Handler handler, SocialLocalyticsModuleHandler sociallocalyticsmodulehandler)
    {
        this(context, moduleconfig, handler, sociallocalyticsmodulehandler, Picasso.with(context), CheckinCache.NEAR_ME_CACHE, SystemTimeProvider.getInstance(), FlagshipApplication.getInstance().getLocationManager());
    }

    SocialModule(Context context, ModuleConfig moduleconfig, Handler handler, SocialLocalyticsModuleHandler sociallocalyticsmodulehandler, Picasso picasso1, CheckinFetcher checkinfetcher, TimeProvider timeprovider, 
            LocationManager locationmanager)
    {
        super(context, moduleconfig, handler, sociallocalyticsmodulehandler);
        checkinReceiver = new _cls2();
        timeProvider = timeprovider;
        checkinFetcher = checkinfetcher;
        locationManager = locationmanager;
        picasso = (Picasso)Preconditions.checkNotNull(picasso1);
    /* block-local class not found */
    class ReportOnClickListener {}

        clickReport = new ReportOnClickListener(sociallocalyticsmodulehandler, null);
    /* block-local class not found */
    class ShareOnClickListener {}

        clickShare = new ShareOnClickListener(sociallocalyticsmodulehandler, null);
        scale = context.getResources().getInteger(0x7f090005);
        mapRadiusMiles = context.getResources().getInteger(0x7f09000d);
    }

    private boolean initMapImageSize()
    {
        if (mapImageSize != null)
        {
            return true;
        }
        int i = mapImage.getWidth();
        int j = mapImage.getHeight();
        if (i == 0 || j == 0)
        {
            return false;
        } else
        {
            Dimension dimension = new Dimension(i / scale, j / scale);
            mapImageSize = MapUtil.clip(dimension, scale);
            i = mapRadiusMiles;
            zoomLevel = MapUtil.getZoomLevel(dimension.getWidth() * scale, scale, i * 2);
            LogUtil.d("ChatModule", LoggingMetaTags.TWC_SOCIAL, "desiredDimension=%s, mapImageSize=%s, scale=%s, zoomLevel=%s", new Object[] {
                dimension, mapImageSize, Integer.valueOf(scale), Integer.valueOf(zoomLevel)
            });
            return true;
        }
    }

    private void loadStaticMapTile()
    {
        Object obj = (Dimension)Preconditions.checkNotNull(mapImageSize);
        if (currentLocation == null)
        {
            return;
        } else
        {
            obj = GoogleStaticMapsUrl.createWithCenter(new com.weather.util.maps.GoogleStaticMapsUrl.MapLocation(Double.valueOf(currentLocation.getLat()), Double.valueOf(currentLocation.getLng())), zoomLevel, ((Dimension) (obj)).getWidth(), ((Dimension) (obj)).getHeight(), scale).get();
            LogUtil.d("ChatModule", LoggingMetaTags.TWC_SOCIAL, "map tile url=%s", new Object[] {
                obj
            });
            picasso.load(((String) (obj))).placeholder(mapImage.getDrawable()).skipMemoryCache().into(mapImage);
            return;
        }
    }

    private void updateCheckinData(Map map, SavedLocation savedlocation)
    {
        if (!savedlocation.equals(currentLocation))
        {
            return;
        }
        LogUtil.d("ChatModule", LoggingMetaTags.TWC_SOCIAL, "updateCheckinData result=%s, location=%s", new Object[] {
            map, savedlocation
        });
        CheckinClusterItem checkinclusteritem = CheckinCache.getMyCheckin(timeProvider);
        boolean flag = false;
    /* block-local class not found */
    class RadiusPredicate {}

        RadiusPredicate radiuspredicate = new RadiusPredicate(mapRadiusMiles, currentLocation.getLat(), currentLocation.getLng(), null);
        savedlocation = CheckinCounts.empty();
        Iterator iterator = map.values().iterator();
        map = savedlocation;
        while (iterator.hasNext()) 
        {
            savedlocation = (GetCheckinResponse)iterator.next();
            if (flag || ((GetCheckinResponse) (savedlocation)).checkins.contains(checkinclusteritem))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            map = map.sum(Collections2.filter(((GetCheckinResponse) (savedlocation)).checkins, radiuspredicate));
        }
        savedlocation = map;
        if (!flag)
        {
            savedlocation = map;
            if (checkinclusteritem != null)
            {
                savedlocation = map;
                if (radiuspredicate.apply(checkinclusteritem))
                {
                    savedlocation = map.sum(ImmutableList.of(checkinclusteritem));
                }
            }
        }
        map = (java.util.Map.Entry)savedlocation.consolidate(CheckinCounts.groups).getSortedCounts(CheckinCounts.checkinPriority).asMap().entrySet().iterator().next();
        boolean flag1 = locationManager.isFollowMeAsCurrent();
        if (((Integer)map.getKey()).intValue() == 0)
        {
            map = peopleMessage;
            int i;
            if (flag1)
            {
                i = 0x7f0700b5;
            } else
            {
                i = 0x7f0700b6;
            }
            map.setText(i);
            weatherIcon.setImageDrawable(context.getResources().getDrawable(0x7f020019));
            return;
        }
        savedlocation = new CheckinIcon(((Integer)((Collection)map.getValue()).iterator().next()).intValue(), context);
        map = savedlocation.getIconPhrase().toLowerCase(Locale.getDefault());
        if (flag1)
        {
            map = context.getString(0x7f0700b8, new Object[] {
                map
            });
        } else
        {
            map = context.getString(0x7f0700ba, new Object[] {
                map
            });
        }
        peopleMessage.setText(map);
        weatherIcon.setImageDrawable(CheckinIconProvider.PIN_PROVIDER.getDrawable(context, savedlocation.getIconResourceId()));
    }

    protected View createView(ViewGroup viewgroup)
    {
        viewgroup = (View)Preconditions.checkNotNull(((LayoutInflater)Preconditions.checkNotNull((LayoutInflater)context.getSystemService("layout_inflater"))).inflate(0x7f03009f, viewgroup, false));
        ((View)Preconditions.checkNotNull((FrameLayout)viewgroup.findViewById(0x7f0d0278))).setOnClickListener(clickReport);
        ((View)Preconditions.checkNotNull((RelativeLayout)viewgroup.findViewById(0x7f0d027a))).setOnClickListener(clickShare);
        weatherIcon = (ImageView)Preconditions.checkNotNull((ImageView)viewgroup.findViewById(0x7f0d00c9));
        peopleMessage = (TextView)Preconditions.checkNotNull((TextView)viewgroup.findViewById(0x7f0d00cd));
        mapImage = (ImageView)Preconditions.checkNotNull((ImageView)viewgroup.findViewById(0x7f0d00ca));
        ((TextView)viewgroup.findViewById(0x7f0d0279)).setTextSize(0, (int)((TextView)viewgroup.findViewById(0x7f0d027b)).getTextSize());
        return viewgroup;
    }

    public void onCurrentWeatherFacade(CurrentWeatherFacade currentweatherfacade)
    {
        LogUtil.v("ChatModule", LoggingMetaTags.TWC_SOCIAL, "onCurrentWeatherFacade change=%s", new Object[] {
            currentweatherfacade
        });
        setModuleData(null);
    }

    public void pause()
    {
        paused = true;
    }

    public void resume()
    {
        paused = false;
        if (stale)
        {
            setModuleData(null);
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((Void)obj);
    }

    protected void updateUi(Void void1)
    {
        int j = -1;
        LogUtil.v("ChatModule", LoggingMetaTags.TWC_UI, "updateUi paused=%s", new Object[] {
            Boolean.valueOf(paused)
        });
        stale = paused;
        if (paused)
        {
            return;
        }
        currentLocation = locationManager.getCurrentLocation();
        if (currentLocation == null)
        {
            mapImage.setImageBitmap(null);
            peopleMessage.setText(0x7f0700b6);
            weatherIcon.setImageDrawable(context.getResources().getDrawable(0x7f020019));
            return;
        }
        if (LogUtil.isLoggable(LoggingMetaTags.TWC_SOCIAL, 3))
        {
            LogUtil.d("ChatModule", LoggingMetaTags.TWC_SOCIAL, (new StringBuilder()).append("updateUi location=").append(new LatLng(Double.valueOf(currentLocation.getLat()), Double.valueOf(currentLocation.getLng()))).toString(), new Object[0]);
            void1 = LoggingMetaTags.TWC_SOCIAL;
            int i;
            if (mapImageSize == null)
            {
                i = -1;
            } else
            {
                i = mapImageSize.getWidth();
            }
            if (mapImageSize != null)
            {
                j = mapImageSize.getHeight();
            }
            LogUtil.d("ChatModule", void1, "mapImageWidth=%d; mapImageHeight=%d; zoomLevel=%d; scale=%d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(zoomLevel), Integer.valueOf(scale)
            });
        }
        if (initMapImageSize())
        {
            loadStaticMapTile();
        } else
        {
            mapImage.addOnLayoutChangeListener(new _cls1());
        }
        void1 = TwcGeohashUtils.getAdjacentGeohashes(new LatLng(Double.valueOf(currentLocation.getLat()), Double.valueOf(currentLocation.getLng())), mapRadiusMiles, mapRadiusMiles, MeasuringUnit.MILE, 7);
        checkinFetcher.asyncFetch(void1, checkinReceiver, currentLocation);
    }








    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
