// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import java.util.Locale;

public final class  extends Enum
{

    private static final NOTEWORTHY $VALUES[];
    public static final NOTEWORTHY MOST_SUBSCRIBED;
    public static final NOTEWORTHY MOST_VIEWED;
    public static final NOTEWORTHY NOTEWORTHY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$ChannelFeed, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase(Locale.US);
    }

    static 
    {
        MOST_SUBSCRIBED = new <init>("MOST_SUBSCRIBED", 0);
        MOST_VIEWED = new <init>("MOST_VIEWED", 1);
        NOTEWORTHY = new <init>("NOTEWORTHY", 2);
        $VALUES = (new .VALUES[] {
            MOST_SUBSCRIBED, MOST_VIEWED, NOTEWORTHY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
