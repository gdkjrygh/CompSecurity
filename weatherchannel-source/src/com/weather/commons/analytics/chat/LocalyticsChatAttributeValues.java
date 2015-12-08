// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics.chat;

import com.weather.commons.analytics.Attribute;

public final class LocalyticsChatAttributeValues extends Enum
    implements Attribute
{

    private static final LocalyticsChatAttributeValues $VALUES[];
    public static final LocalyticsChatAttributeValues CAMERA_BACK;
    public static final LocalyticsChatAttributeValues CAMERA_FRONT;
    public static final LocalyticsChatAttributeValues CAMERA_UNKNOWN;
    public static final LocalyticsChatAttributeValues PICTURE_CANCELLED;
    public static final LocalyticsChatAttributeValues PICTURE_ERROR;
    public static final LocalyticsChatAttributeValues PICTURE_FILE_ERROR;
    public static final LocalyticsChatAttributeValues PLATFORM_FACEBOOK;
    public static final LocalyticsChatAttributeValues PLATFORM_FACEBOOK_MESSAGER;
    public static final LocalyticsChatAttributeValues PLATFORM_GENERAL;
    public static final LocalyticsChatAttributeValues SOCIAL;
    private final String attribute;

    private LocalyticsChatAttributeValues(String s, int i, String s1)
    {
        super(s, i);
        attribute = s1;
    }

    public static LocalyticsChatAttributeValues valueOf(String s)
    {
        return (LocalyticsChatAttributeValues)Enum.valueOf(com/weather/commons/analytics/chat/LocalyticsChatAttributeValues, s);
    }

    public static LocalyticsChatAttributeValues[] values()
    {
        return (LocalyticsChatAttributeValues[])$VALUES.clone();
    }

    public String getName()
    {
        return attribute;
    }

    static 
    {
        SOCIAL = new LocalyticsChatAttributeValues("SOCIAL", 0, "social");
        PICTURE_CANCELLED = new LocalyticsChatAttributeValues("PICTURE_CANCELLED", 1, "picture cancelled");
        PICTURE_FILE_ERROR = new LocalyticsChatAttributeValues("PICTURE_FILE_ERROR", 2, "picture file error");
        PICTURE_ERROR = new LocalyticsChatAttributeValues("PICTURE_ERROR", 3, "picture error");
        PLATFORM_FACEBOOK = new LocalyticsChatAttributeValues("PLATFORM_FACEBOOK", 4, "facebook");
        PLATFORM_FACEBOOK_MESSAGER = new LocalyticsChatAttributeValues("PLATFORM_FACEBOOK_MESSAGER", 5, "facebook messager");
        PLATFORM_GENERAL = new LocalyticsChatAttributeValues("PLATFORM_GENERAL", 6, "general");
        CAMERA_UNKNOWN = new LocalyticsChatAttributeValues("CAMERA_UNKNOWN", 7, "unknown");
        CAMERA_BACK = new LocalyticsChatAttributeValues("CAMERA_BACK", 8, "back");
        CAMERA_FRONT = new LocalyticsChatAttributeValues("CAMERA_FRONT", 9, "front");
        $VALUES = (new LocalyticsChatAttributeValues[] {
            SOCIAL, PICTURE_CANCELLED, PICTURE_FILE_ERROR, PICTURE_ERROR, PLATFORM_FACEBOOK, PLATFORM_FACEBOOK_MESSAGER, PLATFORM_GENERAL, CAMERA_UNKNOWN, CAMERA_BACK, CAMERA_FRONT
        });
    }
}
