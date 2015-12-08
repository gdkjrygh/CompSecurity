// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;


public final class DeviceType extends Enum
{

    private static final DeviceType $VALUES[];
    public static final DeviceType LOUNGE_SCREEN;
    public static final DeviceType REMOTE_CONTROL;

    private DeviceType(String s, int i)
    {
        super(s, i);
    }

    public static DeviceType valueOf(String s)
    {
        return (DeviceType)Enum.valueOf(com/google/android/apps/ytremote/backend/model/DeviceType, s);
    }

    public static DeviceType[] values()
    {
        return (DeviceType[])$VALUES.clone();
    }

    static 
    {
        REMOTE_CONTROL = new DeviceType("REMOTE_CONTROL", 0);
        LOUNGE_SCREEN = new DeviceType("LOUNGE_SCREEN", 1);
        $VALUES = (new DeviceType[] {
            REMOTE_CONTROL, LOUNGE_SCREEN
        });
    }
}
