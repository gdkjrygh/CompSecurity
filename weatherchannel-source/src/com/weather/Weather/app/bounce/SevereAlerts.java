// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app.bounce;

import com.weather.commons.push.ProductType;

// Referenced classes of package com.weather.Weather.app.bounce:
//            SettingsAlertsActivity

public class SevereAlerts extends SettingsAlertsActivity
{

    public SevereAlerts()
    {
    }

    String getAlertId()
    {
        return ProductType.PRODUCT_SEVERE.getProductName();
    }
}
