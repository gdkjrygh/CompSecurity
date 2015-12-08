// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;

public final class CheckinIcon
{

    private static final IconProperties ICON_PROPERTIES[] = {
        new IconProperties(0x7f0700b1, 0x7f060010), new IconProperties(0x7f0700ac, 0x7f060011, 0x7f0700ad), new IconProperties(0x7f0700ac, 0x7f060011, 0x7f0700ad), new IconProperties(0x7f0700b0, 0x7f06001d), new IconProperties(0x7f0700b0, 0x7f06001d), new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700a8, 0x7f060022), 
        new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700a8, 0x7f060022), new IconProperties(0x7f0700a8, 0x7f060022), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a4, 0x7f060014), new IconProperties(0x7f0700aa, 0x7f060024, 0x7f0700ab), new IconProperties(0x7f0700a2, 0x7f060015, 0x7f0700a3), 
        new IconProperties(0x7f0700a2, 0x7f060015, 0x7f0700a3), new IconProperties(0x7f0700a2, 0x7f060015, 0x7f0700a3), new IconProperties(0x7f0700a2, 0x7f060015, 0x7f0700a3), new IconProperties(0x7f07009d, 0x7f060016, 0x7f07009e), new IconProperties(0x7f0700a5, 0x7f060017), new IconProperties(0x7f0700b2, 0x7f060028), new IconProperties(0x7f0700a1, 0x7f060019), new IconProperties(0x7f0700a6, 0x7f06001c, 0x7f0700a7), new IconProperties(0x7f0700a6, 0x7f06001e, 0x7f0700a7), new IconProperties(0x7f0700a6, 0x7f06001c, 0x7f0700a7), 
        new IconProperties(0x7f0700a6, 0x7f06001e, 0x7f0700a7), new IconProperties(0x7f07009f, 0x7f06001f, 0x7f0700a0), new IconProperties(0x7f0700ae, 0x7f060020, 0x7f0700af), new IconProperties(0x7f0700a6, 0x7f06001c, 0x7f0700a7), new IconProperties(0x7f0700a6, 0x7f06001e, 0x7f0700a7), new IconProperties(0x7f0700a4, 0x7f060014), new IconProperties(0x7f0700ae, 0x7f060020, 0x7f0700af), new IconProperties(0x7f0700b0, 0x7f06001d), new IconProperties(0x7f0700b0, 0x7f06001d), new IconProperties(0x7f0700a8, 0x7f060022), 
        new IconProperties(0x7f0700a8, 0x7f060022), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700b2, 0x7f060028), new IconProperties(0x7f0700a8, 0x7f060022), new IconProperties(0x7f0700a9, 0x7f060013), new IconProperties(0x7f0700b0, 0x7f06001d)
    };
    private static final IconProperties UNKNOWN_ICON = new IconProperties(0x7f0700b2, 0x7f060028);
    private final String iconPhrase;
    private final int iconResourceId;
    private final String shortIconPhrase;

    public CheckinIcon(int i, Context context)
    {
    /* block-local class not found */
    class IconProperties {}

        IconProperties iconproperties;
        if (i >= 0 && i < ICON_PROPERTIES.length)
        {
            iconproperties = ICON_PROPERTIES[i];
        } else
        {
            iconproperties = UNKNOWN_ICON;
        }
        iconPhrase = context.getString(IconProperties.access._mth000(iconproperties));
        shortIconPhrase = context.getString(IconProperties.access._mth100(iconproperties));
        iconResourceId = IconProperties.access._mth200(iconproperties);
    }

    public String getIconPhrase()
    {
        return iconPhrase;
    }

    public int getIconResourceId()
    {
        return iconResourceId;
    }

    public String getShortIconPhrase()
    {
        return shortIconPhrase;
    }

}
