// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class kind extends Enum
{

    private static final TRUEVIEW_INDISPLAY $VALUES[];
    public static final TRUEVIEW_INDISPLAY INSTREAM;
    public static final TRUEVIEW_INDISPLAY TRUEVIEW_INDISPLAY;
    private final String kind;

    public static kind fromKindString(String s)
    {
        if (INSTREAM.getKindString().equals(s))
        {
            return INSTREAM;
        }
        if (TRUEVIEW_INDISPLAY.getKindString().equals(s))
        {
            return TRUEVIEW_INDISPLAY;
        } else
        {
            return null;
        }
    }

    public static TRUEVIEW_INDISPLAY valueOf(String s)
    {
        return (TRUEVIEW_INDISPLAY)Enum.valueOf(com/google/android/apps/youtube/core/client/AdStatsClient$AdStatsClientState$Kind, s);
    }

    public static TRUEVIEW_INDISPLAY[] values()
    {
        return (TRUEVIEW_INDISPLAY[])$VALUES.clone();
    }

    public final String getKindString()
    {
        return kind;
    }

    static 
    {
        INSTREAM = new <init>("INSTREAM", 0, "1");
        TRUEVIEW_INDISPLAY = new <init>("TRUEVIEW_INDISPLAY", 1, "2");
        $VALUES = (new .VALUES[] {
            INSTREAM, TRUEVIEW_INDISPLAY
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        kind = s1;
    }
}
