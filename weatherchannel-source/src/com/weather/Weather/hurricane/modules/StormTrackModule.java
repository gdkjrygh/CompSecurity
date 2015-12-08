// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.squareup.picasso.Picasso;
import com.weather.Weather.feed.Module;
import com.weather.Weather.map.interactive.InteractiveMapActivity;
import com.weather.commons.config.ModuleConfig;
import com.weather.commons.tropical.StormData;
import com.weather.commons.tropical.StormTrackImageFetcher;
import com.weather.commons.tropical.Storms;
import com.weather.util.DataUnits;
import com.weather.util.ui.Dimension;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            StormTrackLocalyticsModuleHandler

public class StormTrackModule extends Module
{

    private static final double HEIGHT_ASPECT = 0.4098360655737705D;
    private Collection allRows;
    private InfoRow categoryRow;
    private final StormTrackLocalyticsModuleHandler localyticsModuleHandler;
    private InfoRow locationRow;
    private ImageView mapImage;
    private InfoRow movingRow;
    Picasso picasso;
    private InfoRow pressureRow;
    private final int scale;
    String stormId;
    private com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters stormTrackParameters;
    private TextView updateTimeView;
    private InfoRow windRow;

    public StormTrackModule(Context context, ModuleConfig moduleconfig, Handler handler, StormTrackLocalyticsModuleHandler stormtracklocalyticsmodulehandler)
    {
        super(context, moduleconfig, handler, stormtracklocalyticsmodulehandler);
        allRows = ImmutableList.of();
        scale = context.getResources().getInteger(0x7f090006);
        localyticsModuleHandler = stormtracklocalyticsmodulehandler;
    }

    private void loadStaticMapTile(StormData stormdata)
    {
        com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters imagerequestparameters = (com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters)Preconditions.checkNotNull(stormTrackParameters);
        if (stormdata == null)
        {
            (new StormTrackImageFetcher(picasso, context)).fetchWithNoStorm(mapImage, imagerequestparameters);
            return;
        } else
        {
            (new StormTrackImageFetcher(picasso, context)).fetch(mapImage, imagerequestparameters, stormdata);
            return;
        }
    }

    private void startInteractiveMap()
    {
        String s;
        Intent intent;
        try
        {
            s = getFeedId();
            intent = new Intent(context, com/weather/Weather/map/interactive/InteractiveMapActivity);
            intent.putExtra("com.weather.Weather.hurricane.STORM_ID_ARG_KEY", stormId);
            intent.putExtra("com.weather.Weather.hurricane.HURRICANE_CENTRAL_ARG_KEY", true);
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            Log.i(TAG, noclassdeffounderror.toString());
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        intent.putExtra("com.weather.fromFeed", s);
        localyticsModuleHandler.recordButtonClick();
        context.startActivity(intent);
        return;
    }

    protected View createView(ViewGroup viewgroup)
    {
        View view = LayoutInflater.from(context).inflate(0x7f0300a2, viewgroup, false);
        view.setOnClickListener(new _cls1());
        mapImage = (ImageView)view.findViewById(0x7f0d00ff);
        int i = context.getResources().getDimensionPixelOffset(0x7f0a0162);
        i = viewgroup.getWidth() - i * 2;
        int j = (int)((double)i * 0.4098360655737705D);
        mapImage.getLayoutParams().height = j;
        if (stormTrackParameters == null)
        {
            stormTrackParameters = new com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters(new Dimension(i / scale, j / scale), scale);
        }
    /* block-local class not found */
    class InfoRow {}

        categoryRow = new InfoRow(view, 0x7f0d0283, 0x7f0702e1);
        windRow = new InfoRow(view, 0x7f0d0284, 0x7f0702e6);
        pressureRow = new InfoRow(view, 0x7f0d0285, 0x7f0702e4);
        movingRow = new InfoRow(view, 0x7f0d0286, 0x7f0702e3);
        locationRow = new InfoRow(view, 0x7f0d0287, 0x7f0702e2);
        updateTimeView = (TextView)view.findViewById(0x7f0d0282);
        allRows = ImmutableList.of(categoryRow, windRow, pressureRow, movingRow, locationRow);
        return view;
    }

    void forceMapImageSize(Dimension dimension)
    {
        stormTrackParameters = new com.weather.commons.tropical.StormTrackImageFetcher.ImageRequestParameters(dimension, scale);
    }

    public void onStormUpdate(Storms storms)
    {
        if (stormId == null)
        {
            return;
        } else
        {
            setModuleData(storms.getDataFor(stormId));
            return;
        }
    }

    protected void updateUi(StormData stormdata)
    {
        loadStaticMapTile(stormdata);
        if (stormdata == null)
        {
            for (stormdata = allRows.iterator(); stormdata.hasNext(); ((InfoRow)stormdata.next()).hide()) { }
            updateTimeView.setVisibility(8);
            return;
        }
        for (Iterator iterator = allRows.iterator(); iterator.hasNext(); ((InfoRow)iterator.next()).show()) { }
        updateTimeView.setVisibility(0);
        if (stormdata.getStormType() == com.weather.commons.tropical.StormData.StormType.HURRICANE)
        {
            categoryRow.setValue(String.valueOf(stormdata.getHurricaneCategory()));
        } else
        {
            categoryRow.hide();
        }
        windRow.setValue(stormdata.getWindSpeedDescription(DataUnits.getCurrentUnitType()));
        pressureRow.setValue(stormdata.getPressure());
        movingRow.setValue(stormdata.getMovingDescription(DataUnits.getCurrentUnitType()));
        locationRow.setValue((new StringBuilder()).append(stormdata.getLatitudeDescription()).append(", ").append(stormdata.getLongitudeDescription()).toString());
        updateTimeView.setText(context.getString(0x7f0702e5, new Object[] {
            stormdata.getUpdatedTime()
        }));
    }

    protected volatile void updateUi(Object obj)
    {
        updateUi((StormData)obj);
    }


    /* member class not found */
    class _cls1 {}

}
