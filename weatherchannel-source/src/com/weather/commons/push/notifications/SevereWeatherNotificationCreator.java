// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.push.alertmessages.AlertMessage;
import com.weather.commons.push.alertmessages.SevereWeatherAlertMessage;
import com.weather.commons.share.AlertShareableMessageWithDescription;
import com.weather.commons.share.ShareableMessage;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.push.notifications:
//            InBoxNotificationCreator

public class SevereWeatherNotificationCreator extends InBoxNotificationCreator
{
    private static final class AlertToInteger
        implements Function
    {

        public Integer apply(SevereWeatherAlertMessage severeweatheralertmessage)
        {
            int i;
            if (severeweatheralertmessage == null)
            {
                i = 0x7fffffff;
            } else
            {
                i = severeweatheralertmessage.getSeverityNum();
            }
            return Integer.valueOf(i);
        }

        public volatile Object apply(Object obj)
        {
            return apply((SevereWeatherAlertMessage)obj);
        }

        private AlertToInteger()
        {
        }

    }


    public SevereWeatherNotificationCreator(int i, int j, Class class1, int k, String s, final LocationManager locationManager)
    {
        super(i, j, class1, k, s, new Function() {

            final LocationManager val$locationManager;

            public ShareableMessage apply(Collection collection)
            {
                Object obj = collection;
                if (collection == null)
                {
                    obj = Collections.emptyList();
                }
                return new AlertShareableMessageWithDescription(((Collection) (obj)), locationManager, ConfigurationManagers.getInstance());
            }

            public volatile Object apply(Object obj)
            {
                return apply((Collection)obj);
            }

            
            {
                locationManager = locationmanager;
                super();
            }
        });
    }

    protected volatile void addContent(android.support.v4.app.NotificationCompat.Builder builder, Collection collection, Context context, AlertMessage alertmessage)
    {
        addContent(builder, collection, context, (SevereWeatherAlertMessage)alertmessage);
    }

    protected void addContent(android.support.v4.app.NotificationCompat.Builder builder, Collection collection, Context context, SevereWeatherAlertMessage severeweatheralertmessage)
    {
        super.addContent(builder, collection, context, severeweatheralertmessage);
        builder.setTicker(((SevereWeatherAlertMessage)collection.iterator().next()).getDescription());
    }

    protected Collection sortList(Collection collection)
    {
        return Ordering.natural().onResultOf(new AlertToInteger()).immutableSortedCopy(collection);
    }
}
