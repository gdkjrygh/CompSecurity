// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN END;
    public static final UNKNOWN ERROR;
    public static final UNKNOWN START;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak$TrackingEventType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        START = new <init>("START", 0);
        END = new <init>("END", 1);
        ERROR = new <init>("ERROR", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            START, END, ERROR, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
