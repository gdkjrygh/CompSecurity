// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import com.google.common.collect.ImmutableList;
import com.weather.dal2.ConditionCode;

public class WxIconItem
{
    private static class IconProperties
    {

        private final String fileName;
        private final int notificationId;
        private final int svgIconId;




        IconProperties(int i, String s)
        {
            this(i, s, com.weather.commons.R.drawable.ic_sev_generic);
        }

        IconProperties(int i, String s, int j)
        {
            svgIconId = i;
            notificationId = j;
            fileName = s;
        }
    }


    private static final IconProperties ICON_PROPERTIES[];
    public static final int NA = 44;
    public static final ImmutableList SVG_IDS;
    private final Integer iconNumber;

    public WxIconItem(Integer integer)
    {
        int i;
        if (ConditionCode.isValidConditionCode(integer))
        {
            i = integer.intValue();
        } else
        {
            i = 44;
        }
        iconNumber = Integer.valueOf(i);
    }

    public String getAmazonIconId()
    {
        return ICON_PROPERTIES[iconNumber.intValue()].fileName;
    }

    public int getNotificationId()
    {
        return ICON_PROPERTIES[iconNumber.intValue()].notificationId;
    }

    public int getSvgIconId()
    {
        return ICON_PROPERTIES[iconNumber.intValue()].svgIconId;
    }

    static 
    {
        SVG_IDS = ImmutableList.of(Integer.valueOf(com.weather.commons.R.raw.i0), Integer.valueOf(com.weather.commons.R.raw.i1), Integer.valueOf(com.weather.commons.R.raw.i3), Integer.valueOf(com.weather.commons.R.raw.i5), Integer.valueOf(com.weather.commons.R.raw.i9), Integer.valueOf(com.weather.commons.R.raw.i12), Integer.valueOf(com.weather.commons.R.raw.i13), Integer.valueOf(com.weather.commons.R.raw.i17), Integer.valueOf(com.weather.commons.R.raw.i19), Integer.valueOf(com.weather.commons.R.raw.i23), Integer.valueOf(com.weather.commons.R.raw.i24), Integer.valueOf(com.weather.commons.R.raw.i26), new Integer[] {
            Integer.valueOf(com.weather.commons.R.raw.i27), Integer.valueOf(com.weather.commons.R.raw.i28), Integer.valueOf(com.weather.commons.R.raw.i29), Integer.valueOf(com.weather.commons.R.raw.i30), Integer.valueOf(com.weather.commons.R.raw.i31), Integer.valueOf(com.weather.commons.R.raw.i32), Integer.valueOf(com.weather.commons.R.raw.i35), Integer.valueOf(com.weather.commons.R.raw.i40)
        });
        ICON_PROPERTIES = (new IconProperties[] {
            new IconProperties(com.weather.commons.R.raw.i0, "i0.png", com.weather.commons.R.drawable.ic_sev_tornado_leveled), new IconProperties(com.weather.commons.R.raw.i1, "i1.png", com.weather.commons.R.drawable.ic_sev_hurricane_leveled), new IconProperties(com.weather.commons.R.raw.i1, "i1.png", com.weather.commons.R.drawable.ic_sev_hurricane_leveled), new IconProperties(com.weather.commons.R.raw.i3, "i3.png"), new IconProperties(com.weather.commons.R.raw.i3, "i3.png"), new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i9, "i9.png"), 
            new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i9, "i9.png"), new IconProperties(com.weather.commons.R.raw.i12, "i12.png"), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i17, "i17.png"), new IconProperties(com.weather.commons.R.raw.i5, "i5.png"), new IconProperties(com.weather.commons.R.raw.i19, "i19.png"), 
            new IconProperties(com.weather.commons.R.raw.i19, "i19.png"), new IconProperties(com.weather.commons.R.raw.i19, "i19.png"), new IconProperties(com.weather.commons.R.raw.i19, "i19.png"), new IconProperties(com.weather.commons.R.raw.i23, "i23.png"), new IconProperties(com.weather.commons.R.raw.i24, "i24.png"), new IconProperties(com.weather.commons.R.raw.ina, "ina.png"), new IconProperties(com.weather.commons.R.raw.i26, "i26.png"), new IconProperties(com.weather.commons.R.raw.i27, "i27.png"), new IconProperties(com.weather.commons.R.raw.i28, "i28.png"), new IconProperties(com.weather.commons.R.raw.i29, "i29.png"), 
            new IconProperties(com.weather.commons.R.raw.i30, "i30.png"), new IconProperties(com.weather.commons.R.raw.i31, "i31.png"), new IconProperties(com.weather.commons.R.raw.i32, "i32.png"), new IconProperties(com.weather.commons.R.raw.i29, "i29.png"), new IconProperties(com.weather.commons.R.raw.i30, "i30.png"), new IconProperties(com.weather.commons.R.raw.i35, "i35.png"), new IconProperties(com.weather.commons.R.raw.i32, "i32.png"), new IconProperties(com.weather.commons.R.raw.i3, "i3.png"), new IconProperties(com.weather.commons.R.raw.i3, "i3.png"), new IconProperties(com.weather.commons.R.raw.i9, "i9.png"), 
            new IconProperties(com.weather.commons.R.raw.i40, "i40.png"), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.ina, "ina.png"), new IconProperties(com.weather.commons.R.raw.i9, "i9.png"), new IconProperties(com.weather.commons.R.raw.i13, "i13.png", com.weather.commons.R.drawable.ic_sev_winter_leveled), new IconProperties(com.weather.commons.R.raw.i3, "i3.png")
        });
    }
}
