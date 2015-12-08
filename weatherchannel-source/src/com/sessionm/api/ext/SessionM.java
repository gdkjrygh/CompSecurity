// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api.ext;

import android.content.Context;
import android.util.Log;
import com.sessionm.api.Activity;
import com.sessionm.core.Config;
import com.sessionm.core.Session;
import com.sessionm.core.f;
import com.sessionm.core.h;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

public class SessionM extends com.sessionm.api.SessionM
{

    public SessionM()
    {
    }

    public static SessionM getInstance()
    {
        com/sessionm/api/ext/SessionM;
        JVM INSTR monitorenter ;
        if (instance != null) goto _L2; else goto _L1
_L1:
        if (!h.isSupportedPlatform()) goto _L4; else goto _L3
_L3:
        instance = new SessionM();
_L5:
        Object obj = (SessionM)instance;
_L7:
        com/sessionm/api/ext/SessionM;
        JVM INSTR monitorexit ;
        return ((SessionM) (obj));
_L4:
        instance = new f();
          goto _L5
        obj;
        throw obj;
_L2:
        if (instance instanceof SessionM) goto _L5; else goto _L6
_L6:
        Log.e("SessionM", "Cannot use both public and extended SessionM accessors interchangeably. Ensure that your app is calling either com.sessionm.api.SessionM or com.sessionm.api.ext.SessionM getInstance()");
        obj = null;
          goto _L7
    }

    public Config getConfig()
    {
        return Config.f();
    }

    public ExecutorService getExecutorService()
    {
        return Session.D().getExecutorService();
    }

    public int getFragmentFrameLayoutId()
    {
        return Session.D().getFragmentFrameLayoutId();
    }

    public boolean isHardwareAccelerationDisabled()
    {
        return Session.D().isHardwareAccelerationDisabled();
    }

    public boolean isSessionAutoStartEnabled()
    {
        return Session.D().isSessionAutoStartEnabled();
    }

    public void logCutsomAction(String s)
    {
        Session.D().i(s);
    }

    public void logPaymentTransaction(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("logPaymentTransaction called with amount: %f", new Object[] {
                Float.valueOf(f1)
            }), new Throwable());
        }
        Session.D().logPaymentTransaction(f1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public transient boolean presentActivity(com.sessionm.api.ActivityType activitytype, Object aobj[])
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Session session;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("present activity called with activityType %s %s", new Object[] {
                activitytype, Arrays.toString(aobj)
            }), new Throwable());
        }
        session = Session.D();
        if (session.K() != null || session.isExpandedPresentationMode()) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!Log.isLoggable("SessionM", 6))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        Log.e("SessionM", "SessionM activities must be presented on resumed (non-paused) activities. Activity cannot be presented because currently running Android activity is unknown. Ensure your activity properly calls SessionM.onActivityXXX() notification methods or extends com.sessionm.api.BaseActivity.");
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = session.b(new Activity(activitytype), aobj);
        if (true) goto _L4; else goto _L3
_L3:
        activitytype;
        throw activitytype;
    }

    public void setAppKey(String s)
    {
        Session.D().setAppKey(s);
    }

    public void setExecutorService(ExecutorService executorservice)
    {
        Session.D().setExecutorService(executorservice);
    }

    public void setFragmentFrameLayoutId(int i)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set fragment layout id called with id: %d", new Object[] {
                Integer.valueOf(i)
            }), new Throwable());
        }
        Session.D().setFragmentFrameLayoutId(i);
    }

    public void setHardwareAccelerationDisabled(boolean flag)
    {
        Session.D().d(flag);
    }

    public void setSessionAutoStartEnabled(boolean flag)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set session auto start enabled called with value: %b", new Object[] {
                Boolean.valueOf(flag)
            }), new Throwable());
        }
        Session.D().setSessionAutoStartEnabled(flag);
    }

    public void setSkipBlacklist(boolean flag)
    {
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("set skip blacklist called with value: %b", new Object[] {
                Boolean.valueOf(flag)
            }), new Throwable());
        }
        Session.D().setSkipBlacklist(flag);
    }

    public void startSession(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM", 2))
        {
            Log.v("SessionM", String.format("Explicit start session called. appKey: %s", new Object[] {
                s
            }), new Throwable());
        }
        super.startSession(context, s);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void stopSession()
    {
        Session.D().stopSession();
    }
}
