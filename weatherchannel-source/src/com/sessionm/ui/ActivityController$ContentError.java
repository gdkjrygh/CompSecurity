// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController

public static final class message extends Enum
{

    private static final MISSING_URL $VALUES[];
    public static final MISSING_URL ANDROID_VIDEO_ERROR;
    public static final MISSING_URL BROWSER_LOAD_FAILED;
    public static final MISSING_URL CALENDAR_ACTIVITY_UNAVAILABLE_ERROR;
    public static final MISSING_URL IMAGE_SAVE_CANCELLED_ERROR;
    public static final MISSING_URL IMAGE_SAVE_ERROR;
    public static final MISSING_URL MAKE_REQUEST_ERROR;
    public static final MISSING_URL MISSING_EVENT_DATA;
    public static final MISSING_URL MISSING_URL;
    public static final MISSING_URL WEBVIEW_LOAD_ERROR;
    private int code;
    private String message;

    public static message valueOf(String s)
    {
        return (message)Enum.valueOf(com/sessionm/ui/ActivityController$ContentError, s);
    }

    public static message[] values()
    {
        return (message[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    static 
    {
        WEBVIEW_LOAD_ERROR = new <init>("WEBVIEW_LOAD_ERROR", 0, 1, "Content Unavailable");
        MAKE_REQUEST_ERROR = new <init>("MAKE_REQUEST_ERROR", 1, 2, "Cannot Connect");
        IMAGE_SAVE_ERROR = new <init>("IMAGE_SAVE_ERROR", 2, 3, "Image Not Saved");
        IMAGE_SAVE_CANCELLED_ERROR = new <init>("IMAGE_SAVE_CANCELLED_ERROR", 3, 4, "Image Save Cancelled");
        BROWSER_LOAD_FAILED = new <init>("BROWSER_LOAD_FAILED", 4, 8, "URL failed to load in embedded browser.");
        ANDROID_VIDEO_ERROR = new <init>("ANDROID_VIDEO_ERROR", 5, 9, "Video error occurred.");
        CALENDAR_ACTIVITY_UNAVAILABLE_ERROR = new <init>("CALENDAR_ACTIVITY_UNAVAILABLE_ERROR", 6, 10, "Unable to spawn calendar activity.");
        MISSING_EVENT_DATA = new <init>("MISSING_EVENT_DATA", 7, 11, "Missing data for calendar event.");
        MISSING_URL = new <init>("MISSING_URL", 8, 12, "Expected URL not provided for command.");
        $VALUES = (new .VALUES[] {
            WEBVIEW_LOAD_ERROR, MAKE_REQUEST_ERROR, IMAGE_SAVE_ERROR, IMAGE_SAVE_CANCELLED_ERROR, BROWSER_LOAD_FAILED, ANDROID_VIDEO_ERROR, CALENDAR_ACTIVITY_UNAVAILABLE_ERROR, MISSING_EVENT_DATA, MISSING_URL
        });
    }

    private (String s, int i, int j, String s1)
    {
        super(s, i);
        code = j;
        message = s1;
    }
}
