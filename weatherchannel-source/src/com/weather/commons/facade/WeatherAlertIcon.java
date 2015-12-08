// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.commons.ui.SevereCondition;
import com.weather.commons.ups.ui.WxIconItem;

public final class WeatherAlertIcon
{

    public static final WeatherAlertIcon GENERIC;
    public static final WeatherAlertIcon TROPICAL = createFromSkyCode(1);
    private final int iconId;
    private final int notificationId;

    private WeatherAlertIcon(int i, int j)
    {
        iconId = i;
        notificationId = j;
    }

    static WeatherAlertIcon createFromSevereCondition(SevereCondition severecondition)
    {
        return new WeatherAlertIcon(severecondition.getWhiteSvgIconId(), severecondition.getNotificationId());
    }

    static WeatherAlertIcon createFromSkyCode(int i)
    {
        WxIconItem wxiconitem = new WxIconItem(Integer.valueOf(i));
        return new WeatherAlertIcon(wxiconitem.getSvgIconId(), wxiconitem.getNotificationId());
    }

    public int getIconId()
    {
        return iconId;
    }

    public int getNotificationId()
    {
        return notificationId;
    }

    static 
    {
        GENERIC = new WeatherAlertIcon(com.weather.commons.R.raw.igeneric_alert, com.weather.commons.R.drawable.ic_sev_generic_leveled);
    }
}
