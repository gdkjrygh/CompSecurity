// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;


public final class type extends Enum
{

    private static final RESULT_TYPE_PLAYLIST $VALUES[];
    public static final RESULT_TYPE_PLAYLIST RESULT_TYPE_ANY;
    public static final RESULT_TYPE_PLAYLIST RESULT_TYPE_CHANNEL;
    public static final RESULT_TYPE_PLAYLIST RESULT_TYPE_PLAYLIST;
    private final int type;

    public static type valueOf(String s)
    {
        return (type)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/SearchService$ResultTypeRestrictType, s);
    }

    public static type[] values()
    {
        return (type[])$VALUES.clone();
    }

    public final int getType()
    {
        return type;
    }

    static 
    {
        RESULT_TYPE_ANY = new <init>("RESULT_TYPE_ANY", 0, 0);
        RESULT_TYPE_CHANNEL = new <init>("RESULT_TYPE_CHANNEL", 1, 2);
        RESULT_TYPE_PLAYLIST = new <init>("RESULT_TYPE_PLAYLIST", 2, 3);
        $VALUES = (new .VALUES[] {
            RESULT_TYPE_ANY, RESULT_TYPE_CHANNEL, RESULT_TYPE_PLAYLIST
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        type = j;
    }
}
