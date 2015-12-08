// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push.notifications;

import com.google.common.base.Function;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.share.AlertShareableMessage;
import com.weather.commons.share.ShareableMessage;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.weather.Weather.push.notifications:
//            NotificationCreatorFactory

static final class 
    implements Function
{

    public ShareableMessage apply(Collection collection)
    {
        Object obj = collection;
        if (collection == null)
        {
            obj = Collections.emptyList();
        }
        return new AlertShareableMessage(((Collection) (obj)), LocationManager.locationManager, ConfigurationManagers.getInstance());
    }

    public volatile Object apply(Object obj)
    {
        return apply((Collection)obj);
    }

    ()
    {
    }
}
