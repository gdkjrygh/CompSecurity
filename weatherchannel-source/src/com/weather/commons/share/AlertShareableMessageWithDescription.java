// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.content.Context;
import android.content.res.Resources;
import com.google.common.base.Preconditions;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.push.alertmessages.AlertMessage;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.share:
//            ShareableMessage

public class AlertShareableMessageWithDescription
    implements ShareableMessage
{

    private final ConfigurationManagers configManagers;
    private final LocationManager locationManager;
    private final Collection messages;

    public AlertShareableMessageWithDescription(Collection collection, LocationManager locationmanager, ConfigurationManagers configurationmanagers)
    {
        messages = (Collection)Preconditions.checkNotNull(collection);
        locationManager = (LocationManager)Preconditions.checkNotNull(locationmanager);
        configManagers = (ConfigurationManagers)Preconditions.checkNotNull(configurationmanagers);
    }

    public String getHTMLMessageBody()
    {
        StringBuilder stringbuilder = new StringBuilder();
        AlertMessage alertmessage;
        for (Iterator iterator = messages.iterator(); iterator.hasNext(); stringbuilder.append(alertmessage.getPresentationName()).append("<br/>").append(alertmessage.getDescription()).append("<br/>").append(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.R.string.share_post_text, new Object[] {
    alertmessage.getSharedUrl(locationManager, configManagers)
})).append("<br/>"))
        {
            alertmessage = (AlertMessage)iterator.next();
        }

        return stringbuilder.toString();
    }

    public String getMessageBody()
    {
        StringBuilder stringbuilder = new StringBuilder();
        AlertMessage alertmessage;
        for (Iterator iterator = messages.iterator(); iterator.hasNext(); stringbuilder.append(alertmessage.getPresentationName()).append('\n').append(alertmessage.getDescription()).append('\n').append(AbstractTwcApplication.getRootContext().getResources().getString(com.weather.commons.R.string.share_post_text, new Object[] {
    alertmessage.getSharedUrl(locationManager, configManagers)
})).append('\n'))
        {
            alertmessage = (AlertMessage)iterator.next();
        }

        return stringbuilder.toString();
    }
}
