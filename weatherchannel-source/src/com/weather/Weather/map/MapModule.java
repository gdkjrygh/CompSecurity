// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.Weather.map.interactive.InteractiveMapActivity;
import com.weather.commons.analytics.feed.ClickableLocalyticsModuleHandler;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.Weather.map:
//            MapModuleHandler

public final class MapModule extends Module
{

    private static final String TAG = "MapModule";
    private final MapModuleHandler handler = new MapModuleHandler();
    private final ClickableLocalyticsModuleHandler localyticsModuleHandler;

    public MapModule(Context context, ModuleConfig moduleconfig, Handler handler1, ClickableLocalyticsModuleHandler clickablelocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler1, clickablelocalyticsmodulehandler);
        localyticsModuleHandler = clickablelocalyticsmodulehandler;
    }

    private void fetchImage()
    {
        Resources resources = context.getResources();
        handler.getBitmap(FlagshipApplication.getInstance().getLocationManager().getCurrentLocation(), resources.getDimensionPixelOffset(0x7f0a0156), resources.getDimensionPixelOffset(0x7f0a0155), resources.getInteger(0x7f090005), true);
    }

    private void startInteractiveMapActivity()
    {
        try
        {
            startActivity(com/weather/Weather/map/interactive/InteractiveMapActivity);
            return;
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            Log.i("MapModule", noclassdeffounderror.toString());
        }
    }

    protected View createView(ViewGroup viewgroup)
    {
        LogUtil.d("MapModule", LoggingMetaTags.TWC_UI, "created MapModule", new Object[0]);
        viewgroup = LayoutInflater.from(context).inflate(0x7f03006e, viewgroup, false);
        ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0d00ff);
        View view = viewgroup.findViewById(0x7f0d01b7);
        _cls1 _lcls1 = new _cls1();
        imageview.setOnClickListener(_lcls1);
        view.setOnClickListener(_lcls1);
        handler.setImageView(imageview);
        return viewgroup;
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        LogUtil.d("MapModule", LoggingMetaTags.TWC_UI, "on receive: %s", new Object[] {
            currentlocationchangeevent
        });
        fetchImage();
    }

    protected void updateUi(Object obj)
    {
        fetchImage();
    }



    /* member class not found */
    class _cls1 {}

}
