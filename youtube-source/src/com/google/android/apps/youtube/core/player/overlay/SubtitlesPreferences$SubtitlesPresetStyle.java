// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class styleValue extends Enum
{

    private static final CUSTOM $VALUES[];
    public static final CUSTOM BLACK_ON_WHITE;
    public static final CUSTOM CUSTOM;
    public static final CUSTOM WHITE_ON_BLACK;
    public static final CUSTOM YELLOW_ON_BLACK;
    public static final CUSTOM YELLOW_ON_BLUE;
    private static String styleEntryStrings[];
    private static String styleValueStrings[];
    private int styleStringId;
    private int styleValue;

    public static int getCustomStyleValue()
    {
        return values()[4].styleValue;
    }

    public static int getDefaultStyleValue()
    {
        return values()[0].styleValue;
    }

    public static String[] getStyleEntryStrings(Resources resources)
    {
        if (styleEntryStrings == null)
        {
            styleValue astylevalue[] = values();
            styleEntryStrings = new String[astylevalue.length];
            for (int i = 0; i < astylevalue.length; i++)
            {
                styleEntryStrings[i] = resources.getString(astylevalue[i].styleStringId);
            }

        }
        return styleEntryStrings;
    }

    public static String[] getStyleValueStrings()
    {
        if (styleValueStrings == null)
        {
            styleEntryStrings astyleentrystrings[] = values();
            styleValueStrings = new String[astyleentrystrings.length];
            for (int i = 0; i < astyleentrystrings.length; i++)
            {
                styleValueStrings[i] = Integer.toString(astyleentrystrings[i].styleValue);
            }

        }
        return styleValueStrings;
    }

    public static styleValueStrings valueOf(String s)
    {
        return (styleValueStrings)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesPresetStyle, s);
    }

    public static styleValueStrings[] values()
    {
        return (styleValueStrings[])$VALUES.clone();
    }

    static 
    {
        WHITE_ON_BLACK = new <init>("WHITE_ON_BLACK", 0, p.eA, 0);
        BLACK_ON_WHITE = new <init>("BLACK_ON_WHITE", 1, p.ey, 1);
        YELLOW_ON_BLACK = new <init>("YELLOW_ON_BLACK", 2, p.eB, 2);
        YELLOW_ON_BLUE = new <init>("YELLOW_ON_BLUE", 3, p.eC, 3);
        CUSTOM = new <init>("CUSTOM", 4, p.ez, 4);
        $VALUES = (new .VALUES[] {
            WHITE_ON_BLACK, BLACK_ON_WHITE, YELLOW_ON_BLACK, YELLOW_ON_BLUE, CUSTOM
        });
    }


    private (String s, int i, int j, int k)
    {
        super(s, i);
        styleStringId = j;
        styleValue = k;
    }
}
