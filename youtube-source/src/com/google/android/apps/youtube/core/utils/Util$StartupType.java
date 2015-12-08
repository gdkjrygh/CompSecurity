// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;


public final class A extends Enum
{

    private static final UPGRADE_STARTUP $VALUES[];
    public static final UPGRADE_STARTUP FIRST_STARTUP;
    public static final UPGRADE_STARTUP NORMAL_STARTUP;
    public static final UPGRADE_STARTUP UPGRADE_STARTUP;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/google/android/apps/youtube/core/utils/Util$StartupType, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        NORMAL_STARTUP = new <init>("NORMAL_STARTUP", 0);
        FIRST_STARTUP = new <init>("FIRST_STARTUP", 1);
        UPGRADE_STARTUP = new <init>("UPGRADE_STARTUP", 2);
        $VALUES = (new .VALUES[] {
            NORMAL_STARTUP, FIRST_STARTUP, UPGRADE_STARTUP
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
