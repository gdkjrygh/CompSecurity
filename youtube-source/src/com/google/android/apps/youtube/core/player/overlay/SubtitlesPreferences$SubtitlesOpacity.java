// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class opacityValue extends Enum
{

    private static final PERCENT_100 $VALUES[];
    public static final PERCENT_100 PERCENT_100;
    public static final PERCENT_100 PERCENT_25;
    public static final PERCENT_100 PERCENT_50;
    public static final PERCENT_100 PERCENT_75;
    private static String opacityEntryStrings[];
    private static String opacityValueStrings[];
    private int opacityValue;

    public static int getDefaultBackgroundOpacityValue()
    {
        return getHexAlphaValue(values()[3].opacityValue);
    }

    public static int getDefaultTextOpacityValue()
    {
        return getHexAlphaValue(values()[3].opacityValue);
    }

    public static int getDefaultWindowOpacityValue()
    {
        return getHexAlphaValue(values()[3].opacityValue);
    }

    private static int getHexAlphaValue(int i)
    {
        return (i * 255) / 100;
    }

    public static String[] getOpacityEntryStrings(Resources resources)
    {
        if (opacityEntryStrings == null)
        {
            opacityValue aopacityvalue[] = values();
            opacityEntryStrings = new String[aopacityvalue.length];
            for (int i = 0; i < aopacityvalue.length; i++)
            {
                opacityEntryStrings[i] = resources.getString(p.ep, new Object[] {
                    Integer.valueOf(aopacityvalue[i].opacityValue)
                });
            }

        }
        return opacityEntryStrings;
    }

    public static String[] getOpacityValueStrings()
    {
        if (opacityValueStrings == null)
        {
            opacityEntryStrings aopacityentrystrings[] = values();
            opacityValueStrings = new String[aopacityentrystrings.length];
            for (int i = 0; i < aopacityentrystrings.length; i++)
            {
                int j = (aopacityentrystrings[i].opacityValue * 255) / 100;
                opacityValueStrings[i] = Integer.toString(j);
            }

        }
        return opacityValueStrings;
    }

    public static opacityValueStrings valueOf(String s)
    {
        return (opacityValueStrings)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesOpacity, s);
    }

    public static opacityValueStrings[] values()
    {
        return (opacityValueStrings[])$VALUES.clone();
    }

    static 
    {
        PERCENT_25 = new <init>("PERCENT_25", 0, 25);
        PERCENT_50 = new <init>("PERCENT_50", 1, 50);
        PERCENT_75 = new <init>("PERCENT_75", 2, 75);
        PERCENT_100 = new <init>("PERCENT_100", 3, 100);
        $VALUES = (new .VALUES[] {
            PERCENT_25, PERCENT_50, PERCENT_75, PERCENT_100
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        opacityValue = j;
    }
}
