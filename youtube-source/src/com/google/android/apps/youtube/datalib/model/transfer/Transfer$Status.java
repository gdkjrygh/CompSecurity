// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.transfer;


public final class  extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED COMPLETED;
    public static final FAILED FAILED;
    public static final FAILED PENDING;
    public static final FAILED RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/datalib/model/transfer/Transfer$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        RUNNING = new <init>("RUNNING", 1);
        COMPLETED = new <init>("COMPLETED", 2);
        FAILED = new <init>("FAILED", 3);
        $VALUES = (new .VALUES[] {
            PENDING, RUNNING, COMPLETED, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
