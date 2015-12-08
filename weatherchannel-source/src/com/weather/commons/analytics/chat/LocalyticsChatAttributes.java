// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.chat;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsChatAttributes extends Enum
    implements Attribute
{

    private static final LocalyticsChatAttributes $VALUES[];
    public static final LocalyticsChatAttributes ADD_MESSAGE;
    public static final LocalyticsChatAttributes CAMERA_FAILED;
    public static final LocalyticsChatAttributes MODULE;
    public static final LocalyticsChatAttributes PHOTO_TYPE;
    public static final LocalyticsChatAttributes PREVIOUS_SCREEN;
    public static final LocalyticsChatAttributes SHARE_ATTEMPT;
    public static final LocalyticsChatAttributes SOCIAL_PLATFORM;
    private final String attribute;

    private LocalyticsChatAttributes(String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }

    public static LocalyticsChatAttributes valueOf(String s)
    {
        return (LocalyticsChatAttributes)Enum.valueOf(com/weather/commons/analytics/chat/LocalyticsChatAttributes, s);
    }

    public static LocalyticsChatAttributes[] values()
    {
        return (LocalyticsChatAttributes[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        PREVIOUS_SCREEN = new LocalyticsChatAttributes("PREVIOUS_SCREEN", 0, "previous screen");
        MODULE = new LocalyticsChatAttributes("MODULE", 1, "module");
        SOCIAL_PLATFORM = new LocalyticsChatAttributes("SOCIAL_PLATFORM", 2, "social platform");
        PHOTO_TYPE = new LocalyticsChatAttributes("PHOTO_TYPE", 3, "photo type");
        SHARE_ATTEMPT = new LocalyticsChatAttributes("SHARE_ATTEMPT", 4, "share attempt");
        ADD_MESSAGE = new LocalyticsChatAttributes("ADD_MESSAGE", 5, "add message");
        CAMERA_FAILED = new LocalyticsChatAttributes("CAMERA_FAILED", 6, "camera failed");
        $VALUES = (new LocalyticsChatAttributes[] {
            PREVIOUS_SCREEN, MODULE, SOCIAL_PLATFORM, PHOTO_TYPE, SHARE_ATTEMPT, ADD_MESSAGE, CAMERA_FAILED
        });
    }
}
