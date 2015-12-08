// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;


public final class  extends Enum
{

    private static final CANNOT_ADD $VALUES[];
    public static final CANNOT_ADD ADDING;
    public static final CANNOT_ADD ALREADY_ADDED;
    public static final CANNOT_ADD CANNOT_ADD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/core/offline/store/OfflineStoreInterface$OfflineAddResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ADDING = new <init>("ADDING", 0);
        ALREADY_ADDED = new <init>("ALREADY_ADDED", 1);
        CANNOT_ADD = new <init>("CANNOT_ADD", 2);
        $VALUES = (new .VALUES[] {
            ADDING, ALREADY_ADDED, CANNOT_ADD
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
