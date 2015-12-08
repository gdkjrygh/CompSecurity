// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;


final class  extends Enum
{

    private static final UNSUBSCRIBED $VALUES[];
    public static final UNSUBSCRIBED SUBSCRIBED;
    public static final UNSUBSCRIBED UNSUBSCRIBED;
    public static final UNSUBSCRIBED WORKING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/adapter/ChannelStoreItemRendererFactory$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        WORKING = new <init>("WORKING", 0);
        SUBSCRIBED = new <init>("SUBSCRIBED", 1);
        UNSUBSCRIBED = new <init>("UNSUBSCRIBED", 2);
        $VALUES = (new .VALUES[] {
            WORKING, SUBSCRIBED, UNSUBSCRIBED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
