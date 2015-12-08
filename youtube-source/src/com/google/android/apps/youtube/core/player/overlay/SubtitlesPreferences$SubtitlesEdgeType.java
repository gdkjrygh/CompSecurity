// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.res.Resources;
import com.google.android.youtube.p;

public final class edgeTypeValue extends Enum
{

    private static final DEPRESSED $VALUES[];
    public static final DEPRESSED DEPRESSED;
    public static final DEPRESSED DROP_SHADOW;
    public static final DEPRESSED NONE;
    public static final DEPRESSED RAISED;
    public static final DEPRESSED UNIFORM;
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
            edgeTypeValue aedgetypevalue[] = values();
            edgeTypeEntryStrings = new String[aedgetypevalue.length];
            for (int i = 0; i < aedgetypevalue.length; i++)
            {
                edgeTypeEntryStrings[i] = resources.getString(aedgetypevalue[i].edgeTypeStringId);
            }

        }
        return edgeTypeEntryStrings;
    }

    public static String[] getEdgeTypeValueStrings()
    {
        if (edgeTypeValueStrings == null)
        {
            edgeTypeEntryStrings aedgetypeentrystrings[] = values();
            edgeTypeValueStrings = new String[aedgetypeentrystrings.length];
            for (int i = 0; i < aedgetypeentrystrings.length; i++)
            {
                edgeTypeValueStrings[i] = Integer.toString(aedgetypeentrystrings[i].edgeTypeValue);
            }

        }
        return edgeTypeValueStrings;
    }

    public static edgeTypeValueStrings valueOf(String s)
    {
        return (edgeTypeValueStrings)Enum.valueOf(com/google/android/apps/youtube/core/player/overlay/SubtitlesPreferences$SubtitlesEdgeType, s);
    }

    public static edgeTypeValueStrings[] values()
    {
        return (edgeTypeValueStrings[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, p.eo, 0);
        UNIFORM = new <init>("UNIFORM", 1, p.eD, 1);
        DROP_SHADOW = new <init>("DROP_SHADOW", 2, p.ee, 2);
        RAISED = new <init>("RAISED", 3, p.er, 3);
        DEPRESSED = new <init>("DEPRESSED", 4, p.ed, 4);
        $VALUES = (new .VALUES[] {
            NONE, UNIFORM, DROP_SHADOW, RAISED, DEPRESSED
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        edgeTypeStringId = j;
        edgeTypeValue = k;
    }
}
