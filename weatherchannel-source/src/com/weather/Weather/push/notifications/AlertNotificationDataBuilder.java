// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push.notifications;

import com.weather.commons.push.ProductType;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.push.notifications:
//            AlertNotificationData

public interface AlertNotificationDataBuilder
{

    public abstract AlertNotificationData buildNotificationData(String s)
        throws JSONException;

    public abstract ProductType getProductType();
}
