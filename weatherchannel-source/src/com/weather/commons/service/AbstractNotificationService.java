// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.weather.commons.facade.CurrentWeatherFacade;
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertsFacade;
import com.weather.commons.ui.NotificationUtil;
import com.weather.commons.ui.WeatherIntentSupport;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.dal2.locations.SavedLocation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractNotificationService extends IntentService
{

    public static final String ALERT_COUNT_KEY = "com.weather.Weather.ui.ALERT_COUNT_KEY";
    public static final String ALERT_MESSAGE_LIST = "com.weather.commons.service.ALERT_MESSAGE_LIST";
    public static final String ALERT_SEVERITY_KEY = "com.weather.Weather.ui.ALERT_SEVERITY_KEY";
    public static final String FROM_ON_GOING_TEMPERATURE = "com.weather.commons.service.ON_GOING_TEMPERATURE_NOTIFICATION";
    public static final String ICON_KEY = "com.weather.Weather.ui.ICON_KEY";
    public static final String LOCATION_KEY = "com.weather.Weather.ui.LOCATION_KEY";
    public static final String LOCATION_NAME_KEY = "com.weather.Weather.ui.LOCATION_NAME_KEY";
    private static final int MAX_NOTIFICATION_IMAGE_INDEX = 199;
    private static final int NOTIFICATION_ID = 1;
    public static final String PHRASE_KEY = "com.weather.Weather.ui.PHRASE_KEY";
    private static final int TEMPERATURE_ICON_OFFSET = 59;
    public static final String TEMPERATURE_KEY = "com.weather.Weather.ui.TEMPERATURE_KEY";
    private int iconBackgroundColor;
    private final String tag;

    public AbstractNotificationService(String s)
    {
        super((String)Preconditions.checkNotNull(s));
        tag = s;
    }

    public static void cancelNotification(Context context)
    {
        ((NotificationManager)context.getSystemService("notification")).cancel(1);
    }

    private Notification createNotification(Context context, Bundle bundle)
    {
        int i = bundle.getInt("com.weather.Weather.ui.ALERT_SEVERITY_KEY", 0);
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setContentTitle((new StringBuilder()).append(bundle.getString("com.weather.Weather.ui.PHRASE_KEY", "--")).append(' ').append(bundle.getInt("com.weather.Weather.ui.TEMPERATURE_KEY")).append("\260").toString());
        String s = bundle.getString("com.weather.Weather.ui.LOCATION_NAME_KEY", "--");
        builder.setContentText(s);
        builder.setLargeIcon(NotificationUtil.addSeverityBackground(context, WxIconBitmapCache.getBitmap((new WxIconItem(Integer.valueOf(bundle.getInt("com.weather.Weather.ui.ICON_KEY", 30)))).getSvgIconId()), i, iconBackgroundColor));
        builder.setSmallIcon(getTemperatureIcon(bundle), getDrawableLevel(i));
        builder.setOngoing(true);
        Object obj = bundle.getStringArrayList("com.weather.commons.service.ALERT_MESSAGE_LIST");
        if (obj != null && !((List) (obj)).isEmpty())
        {
            builder.setNumber(((List) (obj)).size());
            android.support.v4.app.NotificationCompat.InboxStyle inboxstyle = new android.support.v4.app.NotificationCompat.InboxStyle();
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); inboxstyle.addLine((String)((Iterator) (obj)).next())) { }
            builder.setStyle(inboxstyle);
            inboxstyle.setSummaryText(s);
        } else
        {
            builder.setNumber(1);
        }
        builder.setContentIntent(getContentIntent(context, bundle));
        customizeNotification(builder, context);
        return builder.build();
    }

    public static Intent createNotificationIntentWithWeather(Context context, CurrentWeatherFacade currentweatherfacade, SavedLocation savedlocation, Class class1)
    {
        class1 = new Intent(context, class1);
        savedlocation = WeatherIntentSupport.makeExtras(currentweatherfacade, savedlocation);
        savedlocation.putBoolean("com.weather.commons.service.ON_GOING_TEMPERATURE_NOTIFICATION", true);
        context = currentweatherfacade.getWeatherAlertsFacade();
        if (context == null)
        {
            context = ImmutableList.of();
        } else
        {
            context = context.getAlertsList();
        }
        if (!context.isEmpty())
        {
            class1.putStringArrayListExtra("com.weather.commons.service.ALERT_MESSAGE_LIST", getAlerts(context));
        }
        class1.putExtras(savedlocation);
        return class1;
    }

    private static ArrayList getAlerts(Collection collection)
    {
        ArrayList arraylist = new ArrayList(collection.size());
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            String s = ((WeatherAlert)collection.next()).getHeadline();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    private PendingIntent getContentIntent(Context context, Bundle bundle)
    {
        Class class1 = getRespondingActivity();
        Intent intent = new Intent(context, class1);
        intent.setFlags(0x4000000);
        intent.putExtras(bundle);
        context = TaskStackBuilder.create(context);
        context.addParentStack(class1);
        context.addNextIntent(intent);
        return context.getPendingIntent(1, 0x8000000);
    }

    private static int getDrawableLevel(int i)
    {
        if (i == 1)
        {
            return 1;
        }
        return i != 2 && i != 3 ? 3 : 2;
    }

    private static int getTemperatureIcon(Bundle bundle)
    {
        int j = com.weather.commons.R.drawable.new_notification_000;
        int i = j;
        if (bundle.containsKey("com.weather.Weather.ui.TEMPERATURE_KEY"))
        {
            int k = bundle.getInt("com.weather.Weather.ui.TEMPERATURE_KEY", 0) + 59;
            i = j;
            if (k >= 0)
            {
                i = j;
                if (k <= 199)
                {
                    i = com.weather.commons.R.drawable.new_notification_000 + k;
                }
            }
        }
        return i;
    }

    private void sendNotification(Context context, Bundle bundle)
    {
        bundle = createNotification(context, bundle);
        ((NotificationManager)context.getSystemService("notification")).notify(1, bundle);
    }

    protected abstract void customizeNotification(android.support.v4.app.NotificationCompat.Builder builder, Context context);

    protected abstract Class getRespondingActivity();

    public void onCreate()
    {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT > 19)
        {
            iconBackgroundColor = getResources().getColor(com.weather.commons.R.color.non_severe_notification_l_color);
            return;
        } else
        {
            iconBackgroundColor = 0;
            return;
        }
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null)
        {
            if ((intent = intent.getExtras()) != null && (intent.getInt("com.weather.Weather.ui.ALERT_COUNT_KEY") > 0 || intent.containsKey("com.weather.Weather.ui.PHRASE_KEY")))
            {
                sendNotification(getApplicationContext(), intent);
                return;
            }
        }
    }
}
