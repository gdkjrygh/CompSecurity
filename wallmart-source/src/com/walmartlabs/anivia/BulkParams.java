// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.anivia;


public class BulkParams
{

    public static final String ANDROID = "android";
    public static final String APPLICATION_ID = "aid";
    public static final String APPLICATION_VERSION = "aVer";
    public static final String MESSAGE_TIME_STAMP = "mts";
    public static final String PLATFORM_ID = "pid";
    public static final String SESSION_ID = "sid";
    public static final String TARGET_PLATFORM_ID = "tpid";
    public static final String VISITOR_ID = "vid";
    private volatile String mApplicationId;
    private volatile String mApplicationVersion;
    private volatile String mSessionId;
    private volatile String mVisitorId;

    public BulkParams()
    {
    }

    public String getApplicationId()
    {
        return mApplicationId;
    }

    public String getApplicationVersion()
    {
        return mApplicationVersion;
    }

    public String getSessionId()
    {
        return mSessionId;
    }

    public String getVisitorId()
    {
        return mVisitorId;
    }

    public void setApplicationId(String s)
    {
        mApplicationId = s;
    }

    public void setApplicationVersion(String s)
    {
        mApplicationVersion = s;
    }

    public void setSessionId(String s)
    {
        mSessionId = s;
    }

    public void setVisitorId(String s)
    {
        mVisitorId = s;
    }
}
