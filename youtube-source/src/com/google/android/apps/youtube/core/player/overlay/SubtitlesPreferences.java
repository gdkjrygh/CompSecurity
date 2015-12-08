// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitlesStyle;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            bi

public final class SubtitlesPreferences
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener
{

    private final Context a;
    private final SharedPreferences b;
    private bi c;

    public SubtitlesPreferences(Context context, SharedPreferences sharedpreferences)
    {
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        c();
        b.registerOnSharedPreferenceChangeListener(this);
    }

    public static float a(Context context, float f, int i, int j)
    {
        float f1 = 13F;
        i = Math.min(i, j);
        context = context.getResources().getDisplayMetrics();
        float f2 = ((float)i / ((DisplayMetrics) (context)).scaledDensity) * 0.0625F;
        if (f2 >= 13F)
        {
            f1 = f2;
        }
        return f1 * f;
    }

    private static int a(int i, int j)
    {
        int k = i;
        if (i != SubtitlesColor.NONE.colorValue)
        {
            k = 0xffffff & i | j << 24;
        }
        return k;
    }

    private static int a(SharedPreferences sharedpreferences, String s, int i)
    {
        sharedpreferences = sharedpreferences.getString(s, null);
        if (sharedpreferences == null)
        {
            return i;
        } else
        {
            return Integer.parseInt(sharedpreferences);
        }
    }

    public static SubtitlesStyle a(SharedPreferences sharedpreferences)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        String s = sharedpreferences.getString("subtitles_style", null);
        if (s == null)
        {
            i = SubtitlesPresetStyle.getDefaultStyleValue();
        } else
        {
            i = Integer.parseInt(s);
        }
        if (i != SubtitlesPresetStyle.CUSTOM.styleValue) goto _L2; else goto _L1
_L1:
        j = a(a(sharedpreferences, "subtitles_background_color", SubtitlesColor.getDefaultBackgroundColorValue()), a(sharedpreferences, "subtitles_background_opacity", SubtitlesOpacity.getDefaultBackgroundOpacityValue()));
        i = a(a(sharedpreferences, "subtitles_window_color", SubtitlesColor.getDefaultWindowColorValue()), a(sharedpreferences, "subtitles_window_opacity", SubtitlesOpacity.getDefaultWindowOpacityValue()));
        i1 = a(a(sharedpreferences, "subtitles_text_color", SubtitlesColor.getDefaultTextColorValue()), a(sharedpreferences, "subtitles_text_opacity", SubtitlesOpacity.getDefaultTextOpacityValue()));
        l = a(sharedpreferences, "subtitles_edge_type", SubtitlesEdgeType.getDefaultEdgeTypeValue());
        k = a(sharedpreferences, "subtitles_edge_color", SubtitlesColor.getDefaultEdgeColorValue());
        j1 = a(sharedpreferences, "subtitles_font", SubtitlesFont.getDefaultFontValue());
_L4:
        return new SubtitlesStyle(j, i, k, l, i1, j1);
_L2:
        if (i != SubtitlesPresetStyle.WHITE_ON_BLACK.styleValue)
        {
            break; /* Loop/switch isn't completed */
        }
        j = SubtitlesColor.BLACK.colorValue;
        i = SubtitlesColor.WHITE.colorValue;
_L5:
        int k1 = SubtitlesColor.getDefaultWindowColorValue();
        l = SubtitlesEdgeType.getDefaultEdgeTypeValue();
        k = SubtitlesColor.getDefaultEdgeColorValue();
        j1 = SubtitlesFont.getDefaultFontValue();
        i1 = i;
        i = k1;
        if (true) goto _L4; else goto _L3
_L3:
        if (i == SubtitlesPresetStyle.BLACK_ON_WHITE.styleValue)
        {
            j = SubtitlesColor.WHITE.colorValue;
            i = SubtitlesColor.BLACK.colorValue;
        } else
        if (i == SubtitlesPresetStyle.YELLOW_ON_BLACK.styleValue)
        {
            j = SubtitlesColor.BLACK.colorValue;
            i = SubtitlesColor.YELLOW.colorValue;
        } else
        {
            boolean flag;
            if (i == SubtitlesPresetStyle.YELLOW_ON_BLUE.styleValue)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.b(flag);
            j = SubtitlesColor.BLUE.colorValue;
            i = SubtitlesColor.YELLOW.colorValue;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static float b(SharedPreferences sharedpreferences)
    {
        sharedpreferences = sharedpreferences.getString("subtitles_scale", null);
        if (sharedpreferences == null)
        {
            return SubtitlesScale.getDefaultScaleValue();
        } else
        {
            return Float.parseFloat(sharedpreferences);
        }
    }

    private void c()
    {
        HashSet hashset;
        String as[];
        int j;
        try
        {
            hashset = new HashSet(Arrays.asList(a.getAssets().list("fonts")));
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Project is missing required fonts. Please copy font assets found at //depot/google3/java/com/google/android/apps/youtube/app/assets/fonts/ into ./assets/fonts in the root directory of your Android project.", ioexception);
        }
        as = new String[4];
        as[0] = "MonoSerif-Regular.ttf";
        as[1] = "ComingSoon-Regular.ttf";
        as[2] = "DancingScript-Regular.ttf";
        as[3] = "CarroisGothicSC-Regular.ttf";
        j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            com.google.android.apps.youtube.common.fromguava.c.b(hashset.contains(s), String.format("Project is missing required font %s. Please copy font assets found at //depot/google3/java/com/google/android/apps/youtube/app/assets/fonts/ into ./assets/fonts in the root directory of your Android project.", new Object[] {
                s
            }));
        }

    }

    public final float a()
    {
        String s = b.getString("subtitles_scale", null);
        if (s == null)
        {
            return SubtitlesScale.getDefaultScaleValue();
        } else
        {
            return Float.parseFloat(s);
        }
    }

    public final void a(bi bi1)
    {
        c = bi1;
    }

    public final SubtitlesStyle b()
    {
        return a(b);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if (c != null)
        {
            if ("subtitles_scale".equals(s))
            {
                c.a(b(sharedpreferences));
            } else
            if ("subtitles_style".equals(s) || "subtitles_font".equals(s) || "subtitles_text_color".equals(s) || "subtitles_text_opacity".equals(s) || "subtitles_edge_type".equals(s) || "subtitles_edge_color".equals(s) || "subtitles_background_color".equals(s) || "subtitles_background_opacity".equals(s) || "subtitles_window_color".equals(s) || "subtitles_window_opacity".equals(s))
            {
                c.a(a(sharedpreferences));
                return;
            }
        }
    }

    private class SubtitlesColor extends Enum
    {

        private static final SubtitlesColor $VALUES[];
        public static final SubtitlesColor BLACK;
        public static final SubtitlesColor BLUE;
        public static final SubtitlesColor CYAN;
        public static final SubtitlesColor GREEN;
        public static final SubtitlesColor MAGENTA;
        public static final SubtitlesColor NONE;
        public static final SubtitlesColor RED;
        public static final SubtitlesColor WHITE;
        public static final SubtitlesColor YELLOW;
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
                SubtitlesColor asubtitlescolor[] = values();
                backgroundColorEntryStrings = new String[asubtitlescolor.length];
                for (int i = 0; i < backgroundColorEntryStrings.length; i++)
                {
                    backgroundColorEntryStrings[i] = resources.getString(asubtitlescolor[i].colorStringId);
                }

            }
            return backgroundColorEntryStrings;
        }

        public static String[] getBackgroundColorValueStrings()
        {
            if (backgroundColorValueStrings == null)
            {
                SubtitlesColor asubtitlescolor[] = values();
                backgroundColorValueStrings = new String[asubtitlescolor.length];
                for (int i = 0; i < backgroundColorValueStrings.length; i++)
                {
                    backgroundColorValueStrings[i] = Integer.toString(asubtitlescolor[i].colorValue);
                }

            }
            return backgroundColorValueStrings;
        }

        public static int[] getBackgroundColorValues()
        {
            if (backgroundColorValues == null)
            {
                SubtitlesColor asubtitlescolor[] = values();
                backgroundColorValues = new int[asubtitlescolor.length];
                for (int i = 0; i < backgroundColorValues.length; i++)
                {
                    backgroundColorValues[i] = asubtitlescolor[i].colorValue;
                }

            }
            return backgroundColorValues;
        }

        public static String[] getColorEntryStrings(Resources resources)
        {
            if (colorEntryStrings == null)
            {
                SubtitlesColor asubtitlescolor[] = values();
                colorEntryStrings = new String[asubtitlescolor.length - 1];
                for (int i = 0; i < colorEntryStrings.length; i++)
                {
                    colorEntryStrings[i] = resources.getString(asubtitlescolor[i + 1].colorStringId);
                }

            }
            return colorEntryStrings;
        }

        public static String[] getColorValueStrings()
        {
            if (colorValueStrings == null)
            {
                SubtitlesColor asubtitlescolor[] = values();
                colorValueStrings = new String[asubtitlescolor.length - 1];
                for (int i = 0; i < colorValueStrings.length; i++)
                {
                    colorValueStrings[i] = Integer.toString(asubtitlescolor[i + 1].colorValue);
                }

            }
            return colorValueStrings;
        }

        public static int[] getColorValues()
        {
            if (colorValues == null)
            {
                SubtitlesColor asubtitlescolor[] = values();
                colorValues = new int[asubtitlescolor.length - 1];
                for (int i = 0; i < colorValues.length; i++)
                {
                    colorValues[i] = asubtitlescolor[i + 1].colorValue;
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

        public static SubtitlesColor valueOf(String s)
        {
            return (SubtitlesColor)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesColor, s);
        }

        public static SubtitlesColor[] values()
        {
            return (SubtitlesColor[])$VALUES.clone();
        }

        static 
        {
            NONE = new SubtitlesColor("NONE", 0, p.eo, 0);
            WHITE = new SubtitlesColor("WHITE", 1, p.eE, -1);
            BLACK = new SubtitlesColor("BLACK", 2, p.ea, 0xff000000);
            RED = new SubtitlesColor("RED", 3, p.es, 0xffff0000);
            YELLOW = new SubtitlesColor("YELLOW", 4, p.eF, -256);
            GREEN = new SubtitlesColor("GREEN", 5, p.em, 0xff00ff00);
            CYAN = new SubtitlesColor("CYAN", 6, p.ec, 0xff00ffff);
            BLUE = new SubtitlesColor("BLUE", 7, p.eb, 0xff0000ff);
            MAGENTA = new SubtitlesColor("MAGENTA", 8, p.en, -65281);
            $VALUES = (new SubtitlesColor[] {
                NONE, WHITE, BLACK, RED, YELLOW, GREEN, CYAN, BLUE, MAGENTA
            });
        }


        private SubtitlesColor(String s, int i, int j, int k)
        {
            super(s, i);
            colorStringId = j;
            colorValue = k;
        }
    }


    private class SubtitlesPresetStyle extends Enum
    {

        private static final SubtitlesPresetStyle $VALUES[];
        public static final SubtitlesPresetStyle BLACK_ON_WHITE;
        public static final SubtitlesPresetStyle CUSTOM;
        public static final SubtitlesPresetStyle WHITE_ON_BLACK;
        public static final SubtitlesPresetStyle YELLOW_ON_BLACK;
        public static final SubtitlesPresetStyle YELLOW_ON_BLUE;
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
                SubtitlesPresetStyle asubtitlespresetstyle[] = values();
                styleEntryStrings = new String[asubtitlespresetstyle.length];
                for (int i = 0; i < asubtitlespresetstyle.length; i++)
                {
                    styleEntryStrings[i] = resources.getString(asubtitlespresetstyle[i].styleStringId);
                }

            }
            return styleEntryStrings;
        }

        public static String[] getStyleValueStrings()
        {
            if (styleValueStrings == null)
            {
                SubtitlesPresetStyle asubtitlespresetstyle[] = values();
                styleValueStrings = new String[asubtitlespresetstyle.length];
                for (int i = 0; i < asubtitlespresetstyle.length; i++)
                {
                    styleValueStrings[i] = Integer.toString(asubtitlespresetstyle[i].styleValue);
                }

            }
            return styleValueStrings;
        }

        public static SubtitlesPresetStyle valueOf(String s)
        {
            return (SubtitlesPresetStyle)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesPresetStyle, s);
        }

        public static SubtitlesPresetStyle[] values()
        {
            return (SubtitlesPresetStyle[])$VALUES.clone();
        }

        static 
        {
            WHITE_ON_BLACK = new SubtitlesPresetStyle("WHITE_ON_BLACK", 0, p.eA, 0);
            BLACK_ON_WHITE = new SubtitlesPresetStyle("BLACK_ON_WHITE", 1, p.ey, 1);
            YELLOW_ON_BLACK = new SubtitlesPresetStyle("YELLOW_ON_BLACK", 2, p.eB, 2);
            YELLOW_ON_BLUE = new SubtitlesPresetStyle("YELLOW_ON_BLUE", 3, p.eC, 3);
            CUSTOM = new SubtitlesPresetStyle("CUSTOM", 4, p.ez, 4);
            $VALUES = (new SubtitlesPresetStyle[] {
                WHITE_ON_BLACK, BLACK_ON_WHITE, YELLOW_ON_BLACK, YELLOW_ON_BLUE, CUSTOM
            });
        }


        private SubtitlesPresetStyle(String s, int i, int j, int k)
        {
            super(s, i);
            styleStringId = j;
            styleValue = k;
        }
    }


    private class SubtitlesOpacity extends Enum
    {

        private static final SubtitlesOpacity $VALUES[];
        public static final SubtitlesOpacity PERCENT_100;
        public static final SubtitlesOpacity PERCENT_25;
        public static final SubtitlesOpacity PERCENT_50;
        public static final SubtitlesOpacity PERCENT_75;
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
                SubtitlesOpacity asubtitlesopacity[] = values();
                opacityEntryStrings = new String[asubtitlesopacity.length];
                for (int i = 0; i < asubtitlesopacity.length; i++)
                {
                    opacityEntryStrings[i] = resources.getString(p.ep, new Object[] {
                        Integer.valueOf(asubtitlesopacity[i].opacityValue)
                    });
                }

            }
            return opacityEntryStrings;
        }

        public static String[] getOpacityValueStrings()
        {
            if (opacityValueStrings == null)
            {
                SubtitlesOpacity asubtitlesopacity[] = values();
                opacityValueStrings = new String[asubtitlesopacity.length];
                for (int i = 0; i < asubtitlesopacity.length; i++)
                {
                    int j = (asubtitlesopacity[i].opacityValue * 255) / 100;
                    opacityValueStrings[i] = Integer.toString(j);
                }

            }
            return opacityValueStrings;
        }

        public static SubtitlesOpacity valueOf(String s)
        {
            return (SubtitlesOpacity)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesOpacity, s);
        }

        public static SubtitlesOpacity[] values()
        {
            return (SubtitlesOpacity[])$VALUES.clone();
        }

        static 
        {
            PERCENT_25 = new SubtitlesOpacity("PERCENT_25", 0, 25);
            PERCENT_50 = new SubtitlesOpacity("PERCENT_50", 1, 50);
            PERCENT_75 = new SubtitlesOpacity("PERCENT_75", 2, 75);
            PERCENT_100 = new SubtitlesOpacity("PERCENT_100", 3, 100);
            $VALUES = (new SubtitlesOpacity[] {
                PERCENT_25, PERCENT_50, PERCENT_75, PERCENT_100
            });
        }

        private SubtitlesOpacity(String s, int i, int j)
        {
            super(s, i);
            opacityValue = j;
        }
    }


    private class SubtitlesEdgeType extends Enum
    {

        private static final SubtitlesEdgeType $VALUES[];
        public static final SubtitlesEdgeType DEPRESSED;
        public static final SubtitlesEdgeType DROP_SHADOW;
        public static final SubtitlesEdgeType NONE;
        public static final SubtitlesEdgeType RAISED;
        public static final SubtitlesEdgeType UNIFORM;
        private static String edgeTypeEntryStrings[];
        private static String edgeTypeValueStrings[];
        private int edgeTypeStringId;
        private int edgeTypeValue;

        public static int getDefaultEdgeTypeValue()
        {
            return values()[0].edgeTypeValue;
        }

        public static String[] getEdgeTypeEntryStrings(Resources resources)
        {
            if (edgeTypeEntryStrings == null)
            {
                SubtitlesEdgeType asubtitlesedgetype[] = values();
                edgeTypeEntryStrings = new String[asubtitlesedgetype.length];
                for (int i = 0; i < asubtitlesedgetype.length; i++)
                {
                    edgeTypeEntryStrings[i] = resources.getString(asubtitlesedgetype[i].edgeTypeStringId);
                }

            }
            return edgeTypeEntryStrings;
        }

        public static String[] getEdgeTypeValueStrings()
        {
            if (edgeTypeValueStrings == null)
            {
                SubtitlesEdgeType asubtitlesedgetype[] = values();
                edgeTypeValueStrings = new String[asubtitlesedgetype.length];
                for (int i = 0; i < asubtitlesedgetype.length; i++)
                {
                    edgeTypeValueStrings[i] = Integer.toString(asubtitlesedgetype[i].edgeTypeValue);
                }

            }
            return edgeTypeValueStrings;
        }

        public static SubtitlesEdgeType valueOf(String s)
        {
            return (SubtitlesEdgeType)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesEdgeType, s);
        }

        public static SubtitlesEdgeType[] values()
        {
            return (SubtitlesEdgeType[])$VALUES.clone();
        }

        static 
        {
            NONE = new SubtitlesEdgeType("NONE", 0, p.eo, 0);
            UNIFORM = new SubtitlesEdgeType("UNIFORM", 1, p.eD, 1);
            DROP_SHADOW = new SubtitlesEdgeType("DROP_SHADOW", 2, p.ee, 2);
            RAISED = new SubtitlesEdgeType("RAISED", 3, p.er, 3);
            DEPRESSED = new SubtitlesEdgeType("DEPRESSED", 4, p.ed, 4);
            $VALUES = (new SubtitlesEdgeType[] {
                NONE, UNIFORM, DROP_SHADOW, RAISED, DEPRESSED
            });
        }

        private SubtitlesEdgeType(String s, int i, int j, int k)
        {
            super(s, i);
            edgeTypeStringId = j;
            edgeTypeValue = k;
        }
    }


    private class SubtitlesFont extends Enum
    {

        private static final SubtitlesFont $VALUES[];
        public static final SubtitlesFont CASUAL;
        public static final SubtitlesFont CURSIVE;
        public static final SubtitlesFont MONOSPACED_SANS_SERIF;
        public static final SubtitlesFont MONOSPACED_SERIF;
        public static final SubtitlesFont PROPORTIONAL_SANS_SERIF;
        public static final SubtitlesFont PROPORTIONAL_SERIF;
        public static final SubtitlesFont SMALL_CAPITALS;
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
                SubtitlesFont asubtitlesfont[] = values();
                fontEntryStrings = new String[asubtitlesfont.length];
                for (int i = 0; i < asubtitlesfont.length; i++)
                {
                    fontEntryStrings[i] = resources.getString(asubtitlesfont[i].fontStringId);
                }

            }
            return fontEntryStrings;
        }

        public static String[] getFontValueStrings()
        {
            if (fontValueStrings == null)
            {
                SubtitlesFont asubtitlesfont[] = values();
                fontValueStrings = new String[asubtitlesfont.length];
                for (int i = 0; i < asubtitlesfont.length; i++)
                {
                    fontValueStrings[i] = Integer.toString(asubtitlesfont[i].fontValue);
                }

            }
            return fontValueStrings;
        }

        public static Typeface getTypefaceFromFontValue(int i, AssetManager assetmanager)
        {
            SubtitlesFont asubtitlesfont[] = values();
            for (int j = 0; j < asubtitlesfont.length; j++)
            {
                if (asubtitlesfont[j].fontValue == i)
                {
                    if (asubtitlesfont[j].typeface == null)
                    {
                        asubtitlesfont[j].typeface = asubtitlesfont[j].typefaceFactory.a(assetmanager);
                    }
                    return asubtitlesfont[j].typeface;
                }
            }

            return null;
        }

        public static SubtitlesFont valueOf(String s)
        {
            return (SubtitlesFont)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesFont, s);
        }

        public static SubtitlesFont[] values()
        {
            return (SubtitlesFont[])$VALUES.clone();
        }

        static 
        {
            MONOSPACED_SERIF = new SubtitlesFont("MONOSPACED_SERIF", 0, p.ei, 0, createTypefaceFactory("fonts/MonoSerif-Regular.ttf"));
            PROPORTIONAL_SERIF = new SubtitlesFont("PROPORTIONAL_SERIF", 1, p.ek, 1, createTypefaceFactory(Typeface.SERIF));
            MONOSPACED_SANS_SERIF = new SubtitlesFont("MONOSPACED_SANS_SERIF", 2, p.eh, 2, createTypefaceFactory(Typeface.MONOSPACE));
            PROPORTIONAL_SANS_SERIF = new SubtitlesFont("PROPORTIONAL_SANS_SERIF", 3, p.ej, 3, createTypefaceFactory(Typeface.SANS_SERIF));
            CASUAL = new SubtitlesFont("CASUAL", 4, p.ef, 4, createTypefaceFactory("fonts/ComingSoon-Regular.ttf"));
            CURSIVE = new SubtitlesFont("CURSIVE", 5, p.eg, 5, createTypefaceFactory("fonts/DancingScript-Regular.ttf"));
            SMALL_CAPITALS = new SubtitlesFont("SMALL_CAPITALS", 6, p.el, 6, createTypefaceFactory("fonts/CarroisGothicSC-Regular.ttf"));
            $VALUES = (new SubtitlesFont[] {
                MONOSPACED_SERIF, PROPORTIONAL_SERIF, MONOSPACED_SANS_SERIF, PROPORTIONAL_SANS_SERIF, CASUAL, CURSIVE, SMALL_CAPITALS
            });
        }

        private SubtitlesFont(String s, int i, int j, int k, bl bl1)
        {
            super(s, i);
            fontStringId = j;
            fontValue = k;
            typefaceFactory = bl1;
        }
    }


    private class SubtitlesScale extends Enum
    {

        private static final SubtitlesScale $VALUES[];
        public static final SubtitlesScale LARGE;
        public static final SubtitlesScale NORMAL;
        public static final SubtitlesScale SMALL;
        public static final SubtitlesScale VERY_LARGE;
        public static final SubtitlesScale VERY_SMALL;
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
                SubtitlesScale asubtitlesscale[] = values();
                scaleEntryStrings = new String[asubtitlesscale.length];
                for (int i = 0; i < asubtitlesscale.length; i++)
                {
                    scaleEntryStrings[i] = resources.getString(asubtitlesscale[i].scaleStringId);
                }

            }
            return scaleEntryStrings;
        }

        public static String[] getScaleValueStrings()
        {
            if (scaleValueStrings == null)
            {
                SubtitlesScale asubtitlesscale[] = values();
                scaleValueStrings = new String[asubtitlesscale.length];
                for (int i = 0; i < asubtitlesscale.length; i++)
                {
                    scaleValueStrings[i] = Float.toString(asubtitlesscale[i].scaleValue);
                }

            }
            return scaleValueStrings;
        }

        public static SubtitlesScale valueOf(String s)
        {
            return (SubtitlesScale)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesScale, s);
        }

        public static SubtitlesScale[] values()
        {
            return (SubtitlesScale[])$VALUES.clone();
        }

        static 
        {
            VERY_SMALL = new SubtitlesScale("VERY_SMALL", 0, p.ex, 0.25F);
            SMALL = new SubtitlesScale("SMALL", 1, p.ev, 0.5F);
            NORMAL = new SubtitlesScale("NORMAL", 2, p.eu, 1.0F);
            LARGE = new SubtitlesScale("LARGE", 3, p.et, 1.5F);
            VERY_LARGE = new SubtitlesScale("VERY_LARGE", 4, p.ew, 2.0F);
            $VALUES = (new SubtitlesScale[] {
                VERY_SMALL, SMALL, NORMAL, LARGE, VERY_LARGE
            });
        }

        private SubtitlesScale(String s, int i, int j, float f)
        {
            super(s, i);
            scaleStringId = j;
            scaleValue = f;
        }
    }

}
