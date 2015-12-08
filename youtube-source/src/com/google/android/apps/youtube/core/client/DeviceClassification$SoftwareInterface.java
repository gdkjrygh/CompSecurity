// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;


public final class param extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ANDROID;
    public static final UNKNOWN OTHERAPP;
    public static final UNKNOWN TVANDROID;
    public static final UNKNOWN UNKNOWN;
    public final String param;

    public static param valueOf(String s)
    {
        return (param)Enum.valueOf(com/google/android/apps/youtube/core/client/DeviceClassification$SoftwareInterface, s);
    }

    public static param[] values()
    {
        return (param[])$VALUES.clone();
    }

    static 
    {
        ANDROID = new <init>("ANDROID", 0, "android");
        TVANDROID = new <init>("TVANDROID", 1, "tvandroid");
        OTHERAPP = new <init>("OTHERAPP", 2, "otherapp");
        UNKNOWN = new <init>("UNKNOWN", 3, "unknown_interface");
        $VALUES = (new .VALUES[] {
            ANDROID, TVANDROID, OTHERAPP, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        param = s1;
    }
}
