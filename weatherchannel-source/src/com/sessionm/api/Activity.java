// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


public class Activity
{

    private SessionM.ActivityType type;

    public Activity(SessionM.ActivityType activitytype)
    {
        type = activitytype;
    }

    public final SessionM.ActivityType getActivityType()
    {
        return type;
    }

    public boolean isAndroidActivity()
    {
        return type == SessionM.ActivityType.INTERSTITIAL || type == SessionM.ActivityType.PORTAL;
    }
}
