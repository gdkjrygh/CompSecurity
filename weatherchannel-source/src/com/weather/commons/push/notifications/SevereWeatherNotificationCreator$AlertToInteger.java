// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.notifications;

import com.google.common.base.Function;
import com.weather.commons.push.alertmessages.SevereWeatherAlertMessage;

// Referenced classes of package com.weather.commons.push.notifications:
//            SevereWeatherNotificationCreator

private static final class <init>
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

    private ()
    {
    }

    ( )
    {
        this();
    }
}
