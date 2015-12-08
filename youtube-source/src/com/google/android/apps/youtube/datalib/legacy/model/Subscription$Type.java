// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CHANNEL;
    public static final UNKNOWN FAVORITES;
    public static final UNKNOWN PLAYLIST;
    public static final UNKNOWN QUERY;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN USER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/Subscription$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        USER = new <init>("USER", 0);
        FAVORITES = new <init>("FAVORITES", 1);
        PLAYLIST = new <init>("PLAYLIST", 2);
        QUERY = new <init>("QUERY", 3);
        CHANNEL = new <init>("CHANNEL", 4);
        UNKNOWN = new <init>("UNKNOWN", 5);
        $VALUES = (new .VALUES[] {
            USER, FAVORITES, PLAYLIST, QUERY, CHANNEL, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
