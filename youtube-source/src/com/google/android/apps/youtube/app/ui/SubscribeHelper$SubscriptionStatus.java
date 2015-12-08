// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR NOT_SUBSCRIBED;
    public static final ERROR SUBSCRIBED;
    public static final ERROR WORKING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/SubscribeHelper$SubscriptionStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUBSCRIBED = new <init>("SUBSCRIBED", 0);
        NOT_SUBSCRIBED = new <init>("NOT_SUBSCRIBED", 1);
        WORKING = new <init>("WORKING", 2);
        ERROR = new <init>("ERROR", 3);
        $VALUES = (new .VALUES[] {
            SUBSCRIBED, NOT_SUBSCRIBED, WORKING, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
