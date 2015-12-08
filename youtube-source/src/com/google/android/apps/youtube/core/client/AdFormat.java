// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class AdFormat extends Enum
{

    private static final AdFormat $VALUES[];
    public static final AdFormat DOUBLECLICK_VIDEO_MASTHEAD;
    private final String adFormatString;

    private AdFormat(String s, int i, String s1)
    {
        super(s, i);
        adFormatString = s1;
    }

    public static AdFormat fromAdFormatString(String s)
    {
        if (DOUBLECLICK_VIDEO_MASTHEAD.getAdFormatString().equals(s))
        {
            return DOUBLECLICK_VIDEO_MASTHEAD;
        } else
        {
            return null;
        }
    }

    public static AdFormat fromOrdinal(int i)
    {
        if (i < 0 || i >= values().length)
        {
            return null;
        } else
        {
            return values()[i];
        }
    }

    public static AdFormat valueOf(String s)
    {
        return (AdFormat)Enum.valueOf(com/google/android/apps/youtube/core/client/AdFormat, s);
    }

    public static AdFormat[] values()
    {
        return (AdFormat[])$VALUES.clone();
    }

    public final String getAdFormatString()
    {
        return adFormatString;
    }

    static 
    {
        DOUBLECLICK_VIDEO_MASTHEAD = new AdFormat("DOUBLECLICK_VIDEO_MASTHEAD", 0, "1_8");
        $VALUES = (new AdFormat[] {
            DOUBLECLICK_VIDEO_MASTHEAD
        });
    }
}
