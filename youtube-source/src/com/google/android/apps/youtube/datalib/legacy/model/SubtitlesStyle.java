// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            ap, ao

public class SubtitlesStyle
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ap((byte)0);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int EDGE_TYPE_UNIFORM = 1;
    public static final int FONT_CASUAL = 4;
    public static final int FONT_CURSIVE = 5;
    public static final int FONT_MONOSPACED_SANS_SERIF = 2;
    public static final int FONT_MONOSPACED_SERIF = 0;
    public static final int FONT_PROPORTIONAL_SANS_SERIF = 3;
    public static final int FONT_PROPORTIONAL_SERIF = 1;
    public static final int FONT_SMALL_CAPITALS = 6;
    private final int backgroundColor;
    private final int edgeColor;
    private final int edgeType;
    private final int foregroundColor;
    private final int typeface;
    private final int windowColor;

    public SubtitlesStyle(int i, int j, int k, int l, int i1, int j1)
    {
        backgroundColor = i;
        windowColor = j;
        edgeColor = k;
        edgeType = l;
        foregroundColor = i1;
        typeface = j1;
    }

    private SubtitlesStyle(Parcel parcel)
    {
        backgroundColor = parcel.readInt();
        windowColor = parcel.readInt();
        edgeColor = parcel.readInt();
        edgeType = parcel.readInt();
        foregroundColor = parcel.readInt();
        typeface = parcel.readInt();
    }

    SubtitlesStyle(Parcel parcel, ao ao)
    {
        this(parcel);
    }

    public SubtitlesStyle(android.view.accessibility.CaptioningManager.CaptionStyle captionstyle, int i)
    {
        backgroundColor = captionstyle.backgroundColor;
        edgeColor = captionstyle.edgeColor;
        edgeType = captionstyle.edgeType;
        foregroundColor = captionstyle.foregroundColor;
        windowColor = i;
        if (Typeface.MONOSPACE.equals(captionstyle.getTypeface()))
        {
            typeface = 2;
            return;
        }
        if (Typeface.SERIF.equals(captionstyle.getTypeface()))
        {
            typeface = 1;
            return;
        } else
        {
            Typeface.SANS_SERIF.equals(captionstyle.getTypeface());
            typeface = 3;
            return;
        }
    }

    private static final String getColorStringForColor(int i)
    {
        return String.format("#%06X", new Object[] {
            Integer.valueOf(0xffffff & i)
        });
    }

    private static final String getOpacityStringForColor(int i)
    {
        double d = (double)Color.alpha(i) / 255D;
        if (d < 0.0D)
        {
            return "0.0";
        } else
        {
            return String.format("%.2f", new Object[] {
                Double.valueOf(d)
            });
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getBackgroundColor()
    {
        return backgroundColor;
    }

    public int getEdgeColor()
    {
        return edgeColor;
    }

    public int getEdgeType()
    {
        return edgeType;
    }

    public int getForegroundColor()
    {
        return foregroundColor;
    }

    public HashMap getMdxFormat(float f)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("background", getColorStringForColor(backgroundColor));
        hashmap.put("backgroundOpacity", getOpacityStringForColor(backgroundColor));
        hashmap.put("color", getColorStringForColor(foregroundColor));
        hashmap.put("textOpacity", getOpacityStringForColor(foregroundColor));
        hashmap.put("fontSizeRelative", String.format("%.2f", new Object[] {
            Float.valueOf(f)
        }));
        hashmap.put("windowColor", getColorStringForColor(windowColor));
        hashmap.put("windowOpacity", getOpacityStringForColor(windowColor));
        edgeType;
        JVM INSTR tableswitch 1 4: default 148
    //                   1 218
    //                   2 224
    //                   3 236
    //                   4 230;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = "none";
_L14:
        hashmap.put("charEdgeStyle", s);
        s = "";
        typeface;
        JVM INSTR tableswitch 0 6: default 208
    //                   0 242
    //                   1 248
    //                   2 254
    //                   3 260
    //                   4 266
    //                   5 272
    //                   6 278;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L6:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_278;
_L15:
        hashmap.put("fontFamilyOption", s);
        return hashmap;
_L2:
        s = "uniform";
          goto _L14
_L3:
        s = "dropShadow";
          goto _L14
_L5:
        s = "depressed";
          goto _L14
_L4:
        s = "raised";
          goto _L14
_L7:
        s = "monoSerif";
          goto _L15
_L8:
        s = "propSerif";
          goto _L15
_L9:
        s = "monoSans";
          goto _L15
_L10:
        s = "propSans";
          goto _L15
_L11:
        s = "casual";
          goto _L15
_L12:
        s = "cursive";
          goto _L15
        s = "smallCaps";
          goto _L15
    }

    public int getTypeface()
    {
        return typeface;
    }

    public int getWindowColor()
    {
        return windowColor;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(backgroundColor);
        parcel.writeInt(windowColor);
        parcel.writeInt(edgeColor);
        parcel.writeInt(edgeType);
        parcel.writeInt(foregroundColor);
        parcel.writeInt(typeface);
    }

}
