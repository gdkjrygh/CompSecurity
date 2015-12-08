// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bk, bj, bl

public final class typefaceFactory extends Enum
{

    private static final SMALL_CAPITALS $VALUES[];
    public static final SMALL_CAPITALS CASUAL;
    public static final SMALL_CAPITALS CURSIVE;
    public static final SMALL_CAPITALS MONOSPACED_SANS_SERIF;
    public static final SMALL_CAPITALS MONOSPACED_SERIF;
    public static final SMALL_CAPITALS PROPORTIONAL_SANS_SERIF;
    public static final SMALL_CAPITALS PROPORTIONAL_SERIF;
    public static final SMALL_CAPITALS SMALL_CAPITALS;
    private static String fontEntryStrings[];
    private static String fontValueStrings[];
    private final int fontStringId;
    private final int fontValue;
    private Typeface typeface;
    private final bl typefaceFactory;

    private static bl createTypefaceFactory(Typeface typeface1)
    {
        return new bk(typeface1);
    }

    private static bl createTypefaceFactory(String s)
    {
        return new bj(s);
    }

    public static int getDefaultFontValue()
    {
        return values()[3].fontValue;
    }

    public static String[] getFontEntryStrings(Resources resources)
    {
        if (fontEntryStrings == null)
        {
            fontValue afontvalue[] = values();
            fontEntryStrings = new String[afontvalue.length];
            for (int i = 0; i < afontvalue.length; i++)
            {
                fontEntryStrings[i] = resources.getString(afontvalue[i].fontStringId);
            }

        }
        return fontEntryStrings;
    }

    public static String[] getFontValueStrings()
    {
        if (fontValueStrings == null)
        {
            fontEntryStrings afontentrystrings[] = values();
            fontValueStrings = new String[afontentrystrings.length];
            for (int i = 0; i < afontentrystrings.length; i++)
            {
                fontValueStrings[i] = Integer.toString(afontentrystrings[i].fontValue);
            }

        }
        return fontValueStrings;
    }

    public static Typeface getTypefaceFromFontValue(int i, AssetManager assetmanager)
    {
        fontValueStrings afontvaluestrings[] = values();
        for (int j = 0; j < afontvaluestrings.length; j++)
        {
            if (afontvaluestrings[j].fontValue == i)
            {
                if (afontvaluestrings[j].typeface == null)
                {
                    afontvaluestrings[j].typeface = afontvaluestrings[j].typefaceFactory.a(assetmanager);
                }
                return afontvaluestrings[j].typeface;
            }
        }

        return null;
    }

    public static typeface valueOf(String s)
    {
        return (typeface)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesFont, s);
    }

    public static typeface[] values()
    {
        return (typeface[])$VALUES.clone();
    }

    static 
    {
        MONOSPACED_SERIF = new <init>("MONOSPACED_SERIF", 0, p.ei, 0, createTypefaceFactory("fonts/MonoSerif-Regular.ttf"));
        PROPORTIONAL_SERIF = new <init>("PROPORTIONAL_SERIF", 1, p.ek, 1, createTypefaceFactory(Typeface.SERIF));
        MONOSPACED_SANS_SERIF = new <init>("MONOSPACED_SANS_SERIF", 2, p.eh, 2, createTypefaceFactory(Typeface.MONOSPACE));
        PROPORTIONAL_SANS_SERIF = new <init>("PROPORTIONAL_SANS_SERIF", 3, p.ej, 3, createTypefaceFactory(Typeface.SANS_SERIF));
        CASUAL = new <init>("CASUAL", 4, p.ef, 4, createTypefaceFactory("fonts/ComingSoon-Regular.ttf"));
        CURSIVE = new <init>("CURSIVE", 5, p.eg, 5, createTypefaceFactory("fonts/DancingScript-Regular.ttf"));
        SMALL_CAPITALS = new <init>("SMALL_CAPITALS", 6, p.el, 6, createTypefaceFactory("fonts/CarroisGothicSC-Regular.ttf"));
        $VALUES = (new .VALUES[] {
            MONOSPACED_SERIF, PROPORTIONAL_SERIF, MONOSPACED_SANS_SERIF, PROPORTIONAL_SANS_SERIF, CASUAL, CURSIVE, SMALL_CAPITALS
        });
    }

    private (String s, int i, int j, int k, bl bl1)
    {
        super(s, i);
        fontStringId = j;
        fontValue = k;
        typefaceFactory = bl1;
    }
}
