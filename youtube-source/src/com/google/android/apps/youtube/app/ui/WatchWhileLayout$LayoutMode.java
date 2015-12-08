// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;


final class  extends Enum
{

    private static final PHONE $VALUES[];
    public static final PHONE PHONE;
    public static final PHONE TABLET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/ui/WatchWhileLayout$LayoutMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TABLET = new <init>("TABLET", 0);
        PHONE = new <init>("PHONE", 1);
        $VALUES = (new .VALUES[] {
            TABLET, PHONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
