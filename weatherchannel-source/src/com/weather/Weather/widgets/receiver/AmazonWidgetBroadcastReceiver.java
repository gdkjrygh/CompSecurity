// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.app.WeatherController;
import com.weather.Weather.video.VideoActivity;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.ui.UIUtil;

public class AmazonWidgetBroadcastReceiver extends BroadcastReceiver
{

    public AmazonWidgetBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (UIUtil.isAmazonMobile(context))
            {
                if (intent.getStringExtra("com.amazon.device.home.extra.HERO_WIDGET_DATA").equalsIgnoreCase("Map"))
                {
                    break label0;
                }
                Intent intent1 = new Intent(context, com/weather/Weather/video/VideoActivity);
                intent1.putExtra("selectedPosition", Integer.parseInt(intent.getStringExtra("com.amazon.device.home.extra.HERO_WIDGET_DATA")));
                intent1.setFlags(0x10000000);
                context.startActivity(intent1);
            }
            return;
        }
        intent = new Intent(context, com/weather/Weather/app/WeatherController);
        SavedLocation savedlocation = FlagshipApplication.getInstance().getLocationManager().getFollowMeLocation();
        if (savedlocation != null)
        {
            Bundle bundle = new Bundle();
            bundle.putString("com.weather.Weather.ui.LOCATION_KEY", savedlocation.getKeyTypeCountry());
            intent.putExtras(bundle);
        }
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }
}
