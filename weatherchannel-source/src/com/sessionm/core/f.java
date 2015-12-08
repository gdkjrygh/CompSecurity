// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.os.Handler;
import com.sessionm.api.AchievementData;
import com.sessionm.api.Activity;
import com.sessionm.api.ActivityListener;
import com.sessionm.api.SessionListener;
import com.sessionm.api.User;
import com.sessionm.api.ext.SessionM;
import java.util.Map;

public class f extends SessionM
{

    public f()
    {
    }

    public boolean collectsLocation()
    {
        return false;
    }

    public void dismissActivity()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public ActivityListener getActivityListener()
    {
        return null;
    }

    public Activity getCurrentActivity()
    {
        this;
        JVM INSTR monitorenter ;
        return null;
    }

    public Handler getListenerHandler()
    {
        return null;
    }

    public SessionListener getSessionListener()
    {
        return null;
    }

    public com.sessionm.api.SessionM.State getSessionState()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.State state = com.sessionm.api.SessionM.State.STOPPED;
        this;
        JVM INSTR monitorexit ;
        return state;
        Exception exception;
        exception;
        throw exception;
    }

    public AchievementData getUnclaimedAchievement()
    {
        return null;
    }

    public User getUser()
    {
        return null;
    }

    public boolean isActivityPresented()
    {
        return false;
    }

    public boolean isAutopresentMode()
    {
        return false;
    }

    public void logAction(String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void logAction(String s, int i)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void onActivityPause(android.app.Activity activity)
    {
    }

    public void onActivityResume(android.app.Activity activity)
    {
    }

    public void onActivityStart(android.app.Activity activity)
    {
    }

    public void onActivityStop(android.app.Activity activity)
    {
    }

    public boolean presentActivity(com.sessionm.api.SessionM.ActivityType activitytype)
    {
        this;
        JVM INSTR monitorenter ;
        return false;
    }

    public transient boolean presentActivity(com.sessionm.api.SessionM.ActivityType activitytype, Object aobj[])
    {
        this;
        JVM INSTR monitorenter ;
        return false;
    }

    public void setActivityListener(ActivityListener activitylistener)
    {
    }

    public void setAutopresentMode(boolean flag)
    {
    }

    public void setCollectionLocation(boolean flag)
    {
    }

    public void setListenerHandler(Handler handler)
    {
    }

    public void setMetaData(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setMetaData(Map map)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void setSessionListener(SessionListener sessionlistener)
    {
    }

    public void startSession(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
    }
}
