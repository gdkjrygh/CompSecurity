// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class scaleValue extends Enum
{

    private static final VERY_LARGE $VALUES[];
    public static final VERY_LARGE LARGE;
    public static final VERY_LARGE NORMAL;
    public static final VERY_LARGE SMALL;
    public static final VERY_LARGE VERY_LARGE;
    public static final VERY_LARGE VERY_SMALL;
    private static String scaleEntryStrings[];
    private static String scaleValueStrings[];
    private int scaleStringId;
    private float scaleValue;

    public static float getDefaultScaleValue()
    {
        return values()[2].scaleValue;
    }

    public static String[] getScaleEntryStrings(Resources resources)
    {
        if (scaleEntryStrings == null)
        {
            scaleValue ascalevalue[] = values();
            scaleEntryStrings = new String[ascalevalue.length];
            for (int i = 0; i < ascalevalue.length; i++)
            {
                scaleEntryStrings[i] = resources.getString(ascalevalue[i].scaleStringId);
            }

        }
        return scaleEntryStrings;
    }

    public static String[] getScaleValueStrings()
    {
        if (scaleValueStrings == null)
        {
            scaleEntryStrings ascaleentrystrings[] = values();
            scaleValueStrings = new String[ascaleentrystrings.length];
            for (int i = 0; i < ascaleentrystrings.length; i++)
            {
                scaleValueStrings[i] = Float.toString(ascaleentrystrings[i].scaleValue);
            }

        }
        return scaleValueStrings;
    }

    public static scaleValueStrings valueOf(String s)
    {
        return (scaleValueStrings)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesScale, s);
    }

    public static scaleValueStrings[] values()
    {
        return (scaleValueStrings[])$VALUES.clone();
    }

    static 
    {
        VERY_SMALL = new <init>("VERY_SMALL", 0, p.ex, 0.25F);
        SMALL = new <init>("SMALL", 1, p.ev, 0.5F);
        NORMAL = new <init>("NORMAL", 2, p.eu, 1.0F);
        LARGE = new <init>("LARGE", 3, p.et, 1.5F);
        VERY_LARGE = new <init>("VERY_LARGE", 4, p.ew, 2.0F);
        $VALUES = (new .VALUES[] {
            VERY_SMALL, SMALL, NORMAL, LARGE, VERY_LARGE
        });
    }

    private (String s, int i, int j, float f)
    {
        super(s, i);
        scaleStringId = j;
        scaleValue = f;
    }
}
