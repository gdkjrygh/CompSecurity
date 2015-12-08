// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.feed.Module;
import com.weather.Weather.map.interactive.InteractiveMapActivity;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.CurrentLocationChangeEvent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.ui.Dimension;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.weather.Weather.map:
//            MapModuleHandler, DDIConditions, DDILocalyticsModuleHandler

public class DrivingDifficultyIndexModule extends Module
{

    private static final double HEIGHT_ASPECT = 0.54295532646048106D;
    private final AtomicReference currentLocation = new AtomicReference();
    private com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters imageParameters;
    private final DDILocalyticsModuleHandler localyticsModuleHandler;
    private final int mapHeight;
    private final MapModuleHandler mapModuleHandler;
    private final int mapScale;
    private final int mapWidth;
    private TextView roadCondition;
    private ImageView roadConditionIcon;

    public DrivingDifficultyIndexModule(Context context, ModuleConfig moduleconfig, Handler handler, DDILocalyticsModuleHandler ddilocalyticsmodulehandler, MapModuleHandler mapmodulehandler)
    {
        super(context, moduleconfig, handler, ddilocalyticsmodulehandler);
        localyticsModuleHandler = ddilocalyticsmodulehandler;
        mapModuleHandler = mapmodulehandler;
        context = context.getResources();
        mapWidth = context.getDimensionPixelOffset(0x7f0a0156);
        mapHeight = context.getDimensionPixelOffset(0x7f0a0155);
        mapScale = context.getInteger(0x7f090005);
    }

    private void startInteractiveMapActivity(boolean flag)
    {
        String s;
        Intent intent;
        try
        {
            s = getFeedId();
            intent = new Intent(context, com/weather/Weather/map/interactive/InteractiveMapActivity);
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            Log.i(TAG, noclassdeffounderror.toString());
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        intent.putExtra("com.weather.Weather.hurricane.DRIVING_DIFFICULTY_INDEX_ARG_KEY", true);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        intent.putExtra("com.weather.fromFeed", s);
        context.startActivity(intent);
        return;
    }

    protected View createView(ViewGroup viewgroup)
    {
        ViewGroup viewgroup1 = (ViewGroup)LayoutInflater.from(context).inflate(0x7f03003b, viewgroup, false);
        roadCondition = (TextView)viewgroup1.findViewById(0x7f0d0103);
        roadConditionIcon = (ImageView)viewgroup1.findViewById(0x7f0d0101);
        int i = context.getResources().getDimensionPixelOffset(0x7f0a0164);
        i = viewgroup.getWidth() - i * 2;
        int j = (int)((double)i * 0.54295532646048106D);
        if (imageParameters == null)
        {
            int k = context.getResources().getInteger(0x7f090006);
            imageParameters = new com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters(new Dimension(i / k, j / k), k);
        }
        viewgroup = (ImageView)viewgroup1.findViewById(0x7f0d00ff);
        mapModuleHandler.setImageView(viewgroup);
        viewgroup.getLayoutParams().height = j;
        viewgroup1.findViewById(0x7f0d00fe).setOnClickListener(new _cls1());
        viewgroup1.findViewById(0x7f0d0100).setOnClickListener(new _cls2());
        mapModuleHandler.getBitmap(FlagshipApplication.getInstance().getLocationManager().getCurrentLocation(), mapWidth, mapHeight, mapScale, false);
        return viewgroup1;
    }

    public void onLocationChange(CurrentLocationChangeEvent currentlocationchangeevent)
    {
        LogUtil.v(TAG, LoggingMetaTags.TWC_UI, "onLocationChange: %s", new Object[] {
            currentlocationchangeevent
        });
        currentLocation.set(currentlocationchangeevent.getSnapshot().getActiveLocation());
    }

    public void onReceiveData(CurrentWeatherFacade currentweatherfacade)
    {
        setModuleData(currentweatherfacade);
    }

    protected void updateUi(CurrentWeatherFacade currentweatherfacade)
    {
        if (currentweatherfacade == null || roadCondition == null) goto _L2; else goto _L1
_L1:
        DDIConditions.Conditions conditions;
        conditions = (new DDIConditions()).getRoadCondition(currentweatherfacade.getExtendedSkyCode());
        currentweatherfacade = "";
        _cls3..SwitchMap.com.weather.Weather.map.DDIConditions.Conditions[conditions.ordinal()];
        JVM INSTR tableswitch 1 8: default 84
    //                   1 126
    //                   2 153
    //                   3 180
    //                   4 207
    //                   5 234
    //                   6 261
    //                   7 288
    //                   8 315;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        roadCondition.setText(Html.fromHtml(currentweatherfacade));
_L2:
        mapModuleHandler.getBitmap((SavedLocation)currentLocation.get(), mapWidth, mapHeight, mapScale, true);
        return;
_L4:
        currentweatherfacade = context.getResources().getString(0x7f070505);
        roadConditionIcon.setImageResource(0x7f020075);
        continue; /* Loop/switch isn't completed */
_L5:
        currentweatherfacade = context.getResources().getString(0x7f070504);
        roadConditionIcon.setImageResource(0x7f020074);
        continue; /* Loop/switch isn't completed */
_L6:
        currentweatherfacade = context.getResources().getString(0x7f070506);
        roadConditionIcon.setImageResource(0x7f020076);
        continue; /* Loop/switch isn't completed */
_L7:
        currentweatherfacade = context.getResources().getString(0x7f07050a);
        roadConditionIcon.setImageResource(0x7f020078);
        continue; /* Loop/switch isn't completed */
_L8:
        currentweatherfacade = context.getResources().getString(0x7f07050c);
        roadConditionIcon.setImageResource(0x7f020079);
        continue; /* Loop/switch isn't completed */
_L9:
        currentweatherfacade = context.getResources().getString(0x7f07050e);
        roadConditionIcon.setImageResource(0x7f02007a);
        continue; /* Loop/switch isn't completed */
_L10:
        currentweatherfacade = context.getResources().getString(0x7f07050f);
        roadConditionIcon.setImageResource(0x7f02007b);
        continue; /* Loop/switch isn't completed */
_L11:
        currentweatherfacade = context.getResources().getString(0x7f070509);
        roadConditionIcon.setImageResource(0x7f020077);
        if (true) goto _L3; else goto _L12
_L12:
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((CurrentWeatherFacade)obj);
    }



    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
