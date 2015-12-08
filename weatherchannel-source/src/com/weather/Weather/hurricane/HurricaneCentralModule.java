// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.common.base.Preconditions;
import com.weather.Weather.feed.Module;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.StormTrackImageFetcher;
import com.weather.commons.tropical.Storms;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.geometry.LatLng;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.Dimension;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneCentralModuleLocalyticsHandler

public class HurricaneCentralModule extends Module
{

    private static final double HEIGHT_ASPECT = 0.54295532646048106D;
    private final AtomicReference currentLocation = new AtomicReference();
    private com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters imageParameters;
    private final HurricaneCentralModuleLocalyticsHandler localyticsModuleHandler;
    private final StormTrackImageFetcher stormTrackImageFetcher;
    private ImageView stormTrackView;
    private final AtomicReference storms = new AtomicReference();

    public HurricaneCentralModule(Context context, ModuleConfig moduleconfig, Handler handler, HurricaneCentralModuleLocalyticsHandler hurricanecentralmodulelocalyticshandler, StormTrackImageFetcher stormtrackimagefetcher)
    {
        super(context, moduleconfig, handler, hurricanecentralmodulelocalyticshandler);
        localyticsModuleHandler = hurricanecentralmodulelocalyticshandler;
        stormTrackImageFetcher = (StormTrackImageFetcher)Preconditions.checkNotNull(stormtrackimagefetcher, "stormTrackFetcher cannot be null");
    }

    protected View createView(ViewGroup viewgroup)
    {
        ViewGroup viewgroup1 = (ViewGroup)LayoutInflater.from(context).inflate(0x7f030063, viewgroup, false);
        stormTrackView = (ImageView)viewgroup1.findViewById(0x7f0d018f);
        int i = context.getResources().getDimensionPixelOffset(0x7f0a0164);
        i = viewgroup.getWidth() - i * 2;
        int j = (int)((double)i * 0.54295532646048106D);
        stormTrackView.getLayoutParams().height = j;
        if (imageParameters == null)
        {
            int k = context.getResources().getInteger(0x7f090006);
            imageParameters = new com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters(new Dimension(i / k, j / k), k);
        }
        viewgroup1.findViewById(0x7f0d018e).setOnClickListener(new _cls1());
        return viewgroup1;
    }

    void forceMapImageSize(Dimension dimension)
    {
        imageParameters = new com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters(dimension, context.getResources().getInteger(0x7f090006));
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "onLocationChange: %s", new Object[] {
            currentlocationchangeevent
        });
        currentLocation.set(currentlocationchangeevent.getSnapshot().getActiveLocation());
        currentlocationchangeevent = (Storms)storms.get();
        if (currentlocationchangeevent != null)
        {
            onStormUpdate(currentlocationchangeevent);
        }
    }

    public final void onStormUpdate(Storms storms1)
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "onStormUpdate: %s", new Object[] {
            storms1
        });
        storms.set(storms1);
        Object obj = (SavedLocation)currentLocation.get();
        if (obj == null)
        {
            obj = storms1.getStormIds();
        } else
        {
            obj = storms1.getStormIdsOrderedByNearest(new LatLng(Double.valueOf(((SavedLocation) (obj)).getLat()), Double.valueOf(((SavedLocation) (obj)).getLng())));
        }
        obj = ((Iterable) (obj)).iterator();
        if (((Iterator) (obj)).hasNext())
        {
            storms1 = storms1.getDataFor((String)((Iterator) (obj)).next());
        } else
        {
            storms1 = null;
        }
        setModuleData(storms1);
    }

    protected void updateUi(StormData stormdata)
    {
        com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters imagerequestparameters = (com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters)Preconditions.checkNotNull(imageParameters);
        if (stormdata == null)
        {
            stormTrackImageFetcher.fetchWithNoStorm(stormTrackView, imagerequestparameters);
            return;
        } else
        {
            stormTrackImageFetcher.fetch(stormTrackView, imagerequestparameters, stormdata);
            return;
        }
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((StormData)obj);
    }



    /* member class not found */
    class _cls1 {}

}
