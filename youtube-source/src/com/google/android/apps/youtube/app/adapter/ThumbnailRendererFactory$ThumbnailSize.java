// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;


public final class  extends Enum
{

    private static final LARGE $VALUES[];
    public static final LARGE LARGE;
    public static final LARGE SMALL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/app/adapter/ThumbnailRendererFactory$ThumbnailSize, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SMALL = new <init>("SMALL", 0);
        LARGE = new <init>("LARGE", 1);
        $VALUES = (new .VALUES[] {
            SMALL, LARGE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
