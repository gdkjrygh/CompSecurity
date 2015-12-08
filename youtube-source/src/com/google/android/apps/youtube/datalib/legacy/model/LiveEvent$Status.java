// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class  extends Enum
{

    private static final REJECTED $VALUES[];
    public static final REJECTED ACTIVE;
    public static final REJECTED CANCELLED;
    public static final REJECTED COMPLETED;
    public static final REJECTED DELAYED;
    public static final REJECTED PENDING;
    public static final REJECTED REJECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/LiveEvent$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        ACTIVE = new <init>("ACTIVE", 1);
        DELAYED = new <init>("DELAYED", 2);
        COMPLETED = new <init>("COMPLETED", 3);
        CANCELLED = new <init>("CANCELLED", 4);
        REJECTED = new <init>("REJECTED", 5);
        $VALUES = (new .VALUES[] {
            PENDING, ACTIVE, DELAYED, COMPLETED, CANCELLED, REJECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
