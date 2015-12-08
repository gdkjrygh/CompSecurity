// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.amazon.device.home.GroupedListHeroWidget;
import com.amazon.device.home.HeroWidgetIntent;
import com.amazon.device.home.HomeManager;
import com.weather.Weather.app.FlagshipApplication;
import com.weather.Weather.widgets.receiver.AmazonWidgetBroadcastReceiver;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.Temperature;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.commons.video.VideoMessage;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.facade.WeatherDataManager;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.LocaleUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class AmazonWidget
{

    private static final String TAG = "AmazonWidget";
    public static final Receiver videoReceiver = new _cls1();

    private AmazonWidget()
    {
    }

    public static com.amazon.device.home.GroupedListHeroWidget.Group createAmazonWidgetGroup(String s, int i, List list)
    {
        Context context = FlagshipApplication.getInstance().getApplicationContext();
        com.amazon.device.home.GroupedListHeroWidget.Group group = new com.amazon.device.home.GroupedListHeroWidget.Group();
        if (i < 0)
        {
            return group;
        }
        ArrayList arraylist = new ArrayList();
        group.setGroupName(s);
        int j = 0;
        while (j < i) 
        {
            Object obj = new HeroWidgetIntent(com/weather/Weather/widgets/receiver/AmazonWidgetBroadcastReceiver.getName());
            if (list != null)
            {
                ((HeroWidgetIntent) (obj)).setData(String.valueOf(j));
                Log.i("AmazonWidget", (new StringBuilder()).append("Added video in Widget :").append(((VideoMessage)list.get(j)).getTitle()).toString());
                s = getAmazonList(context, ((HeroWidgetIntent) (obj)), Uri.parse(((VideoMessage)list.get(j)).getThumbnailLink()), ((VideoMessage)list.get(j)).getTitle(), null);
                Log.i("AmazonWidget", (new StringBuilder()).append("widget icon url :").append(((VideoMessage)list.get(j)).getThumbnailLink()).toString());
            } else
            {
                ((HeroWidgetIntent) (obj)).setData("Map");
                Log.i("AmazonWidget", "Added Map in Widget :");
                s = FlagshipApplication.getInstance().getLocationManager().getFollowMeLocation();
                Object obj1 = FlagshipApplication.getInstance().getWeatherDataManager().getCurrentWeatherFacade(s);
                if (s != null)
                {
                    s = s.getNickname();
                } else
                {
                    s = "";
                }
                if (!((CurrentWeatherFacade) (obj1)).isEmpty())
                {
                    s = getAmazonList(context, ((HeroWidgetIntent) (obj)), Uri.fromFile(new File("sdcard/Android/data/com.weather.Weather/", (new WxIconItem(Integer.valueOf(((CurrentWeatherFacade) (obj1)).getSkyCode()))).getAmazonIconId())), (new StringBuilder()).append(s).append(' ').append(((CurrentWeatherFacade) (obj1)).getCurrentTemp().formatAbsValue()).append(((CurrentWeatherFacade) (obj1)).getCurrentTemp().getUnit()).toString(), ((CurrentWeatherFacade) (obj1)).getPhrase());
                    obj = ((CurrentWeatherFacade) (obj1)).getWeatherAlertsFacade();
                    obj1 = HomeManager.getInstance(FlagshipApplication.getInstance());
                    int k;
                    if (obj != null)
                    {
                        k = ((WeatherAlertsFacade) (obj)).getAlertsList().size();
                    } else
                    {
                        k = 0;
                    }
                    ((HomeManager) (obj1)).updateNumericBadge(k);
                    obj1 = (new StringBuilder()).append("Amazon Severe alert number ");
                    if (obj != null)
                    {
                        k = ((WeatherAlertsFacade) (obj)).getAlertsList().size();
                    } else
                    {
                        k = 0;
                    }
                    Log.i("AmazonWidget", ((StringBuilder) (obj1)).append(k).toString());
                } else
                {
                    File file = new File("sdcard/Android/data/com.weather.Weather/", (new WxIconItem(Integer.valueOf(44))).getAmazonIconId());
                    Log.i("AmazonWidget", "Current Weather Facade is empty");
                    s = getAmazonList(context, ((HeroWidgetIntent) (obj)), Uri.fromFile(file), (new StringBuilder()).append(s).append(" -- / --").toString(), context.getString(0x7f0701f3));
                }
            }
            arraylist.add(s);
            j++;
        }
        group.setListEntries(arraylist);
        return group;
    }

    public static com.amazon.device.home.GroupedListHeroWidget.ListEntry getAmazonList(Context context, HeroWidgetIntent herowidgetintent, Uri uri, String s, String s1)
    {
        context = new com.amazon.device.home.GroupedListHeroWidget.ListEntry(context);
        context.setVisualStyle(com.amazon.device.home.GroupedListHeroWidget.VisualStyle.DEFAULT).setContentIntent(herowidgetintent).setPrimaryIcon(uri).setPrimaryText(s).setSecondaryText(s1);
        return context;
    }

    public static com.weather.commons.video.VideoMessage.VideoType getVideoType()
    {
        if (LocaleUtil.isDeviceInUS())
        {
            return com.weather.commons.video.VideoMessage.VideoType.MUST_SEE;
        } else
        {
            return com.weather.commons.video.VideoMessage.VideoType.MUST_SEE_INTL;
        }
    }

    public static void updateAmazonWidget(List list)
    {
        Context context = AbstractTwcApplication.getRootContext();
        GroupedListHeroWidget groupedlistherowidget = new GroupedListHeroWidget();
        ArrayList arraylist = new ArrayList();
        try
        {
            arraylist.add(createAmazonWidgetGroup(FlagshipApplication.getInstance().getApplicationContext().getString(0x7f07025e), context.getResources().getInteger(0x7f09002c), null));
            arraylist.add(createAmazonWidgetGroup("", context.getResources().getInteger(0x7f090028), list));
            groupedlistherowidget.setGroups(arraylist);
            HomeManager.getInstance(FlagshipApplication.getInstance()).updateWidget(groupedlistherowidget);
            Log.i("AmazonWidget", "Amazon Widget is updation done ");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Log.e("AmazonWidget", "updateAmazonWidget function having error : ", list);
        }
    }


    /* member class not found */
    class _cls1 {}

}
