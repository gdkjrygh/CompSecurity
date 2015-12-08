// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class colorValue extends Enum
{

    private static final MAGENTA $VALUES[];
    public static final MAGENTA BLACK;
    public static final MAGENTA BLUE;
    public static final MAGENTA CYAN;
    public static final MAGENTA GREEN;
    public static final MAGENTA MAGENTA;
    public static final MAGENTA NONE;
    public static final MAGENTA RED;
    public static final MAGENTA WHITE;
    public static final MAGENTA YELLOW;
    private static String backgroundColorEntryStrings[];
    private static String backgroundColorValueStrings[];
    private static int backgroundColorValues[];
    private static String colorEntryStrings[];
    private static String colorValueStrings[];
    private static int colorValues[];
    private int colorStringId;
    private int colorValue;

    public static String[] getBackgroundColorEntryStrings(Resources resources)
    {
        if (backgroundColorEntryStrings == null)
        {
            colorValue acolorvalue[] = values();
            backgroundColorEntryStrings = new String[acolorvalue.length];
            for (int i = 0; i < backgroundColorEntryStrings.length; i++)
            {
                backgroundColorEntryStrings[i] = resources.getString(acolorvalue[i].colorStringId);
            }

        }
        return backgroundColorEntryStrings;
    }

    public static String[] getBackgroundColorValueStrings()
    {
        if (backgroundColorValueStrings == null)
        {
            backgroundColorEntryStrings abackgroundcolorentrystrings[] = values();
            backgroundColorValueStrings = new String[abackgroundcolorentrystrings.length];
            for (int i = 0; i < backgroundColorValueStrings.length; i++)
            {
                backgroundColorValueStrings[i] = Integer.toString(abackgroundcolorentrystrings[i].colorValue);
            }

        }
        return backgroundColorValueStrings;
    }

    public static int[] getBackgroundColorValues()
    {
        if (backgroundColorValues == null)
        {
            backgroundColorValueStrings abackgroundcolorvaluestrings[] = values();
            backgroundColorValues = new int[abackgroundcolorvaluestrings.length];
            for (int i = 0; i < backgroundColorValues.length; i++)
            {
                backgroundColorValues[i] = abackgroundcolorvaluestrings[i].colorValue;
            }

        }
        return backgroundColorValues;
    }

    public static String[] getColorEntryStrings(Resources resources)
    {
        if (colorEntryStrings == null)
        {
            backgroundColorValues abackgroundcolorvalues[] = values();
            colorEntryStrings = new String[abackgroundcolorvalues.length - 1];
            for (int i = 0; i < colorEntryStrings.length; i++)
            {
                colorEntryStrings[i] = resources.getString(abackgroundcolorvalues[i + 1].colorStringId);
            }

        }
        return colorEntryStrings;
    }

    public static String[] getColorValueStrings()
    {
        if (colorValueStrings == null)
        {
            colorEntryStrings acolorentrystrings[] = values();
            colorValueStrings = new String[acolorentrystrings.length - 1];
            for (int i = 0; i < colorValueStrings.length; i++)
            {
                colorValueStrings[i] = Integer.toString(acolorentrystrings[i + 1].colorValue);
            }

        }
        return colorValueStrings;
    }

    public static int[] getColorValues()
    {
        if (colorValues == null)
        {
            colorValueStrings acolorvaluestrings[] = values();
            colorValues = new int[acolorvaluestrings.length - 1];
            for (int i = 0; i < colorValues.length; i++)
            {
                colorValues[i] = acolorvaluestrings[i + 1].colorValue;
            }

        }
        return colorValues;
    }

    public static int getDefaultBackgroundColorValue()
    {
        return values()[2].colorValue;
    }

    public static int getDefaultEdgeColorValue()
    {
        return values()[2].colorValue;
    }

    public static int getDefaultTextColorValue()
    {
        return values()[1].colorValue;
    }

    public static int getDefaultWindowColorValue()
    {
        return values()[0].colorValue;
    }

    public static colorValue valueOf(String s)
    {
        return (colorValue)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesColor, s);
    }

    public static colorValue[] values()
    {
        return (colorValue[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, p.eo, 0);
        WHITE = new <init>("WHITE", 1, p.eE, -1);
        BLACK = new <init>("BLACK", 2, p.ea, 0xff000000);
        RED = new <init>("RED", 3, p.es, 0xffff0000);
        YELLOW = new <init>("YELLOW", 4, p.eF, -256);
        GREEN = new <init>("GREEN", 5, p.em, 0xff00ff00);
        CYAN = new <init>("CYAN", 6, p.ec, 0xff00ffff);
        BLUE = new <init>("BLUE", 7, p.eb, 0xff0000ff);
        MAGENTA = new <init>("MAGENTA", 8, p.en, -65281);
        $VALUES = (new .VALUES[] {
            NONE, WHITE, BLACK, RED, YELLOW, GREEN, CYAN, BLUE, MAGENTA
        });
    }


    private (String s, int i, int j, int k)
    {
        super(s, i);
        colorStringId = j;
        colorValue = k;
    }
}
