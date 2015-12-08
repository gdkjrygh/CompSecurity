// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api.ext;

import android.content.Context;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.sessionm.api.ext:
//            SessionM

public class SessionMDummy extends SessionM
{

    public SessionMDummy()
    {
    }

    public ExecutorService getExecutorService()
    {
        return null;
    }

    public int getFragmentFrameLayoutId()
    {
        return -1;
    }

    public boolean isExpandedPresentationMode()
    {
        return false;
    }

    public boolean isHardwareAccelerationDisabled()
    {
        return false;
    }

    public boolean isSessionAutoStartEnabled()
    {
        return false;
    }

    public void setExecutorService(ExecutorService executorservice)
    {
    }

    public void setExpandedPresentationMode(boolean flag)
    {
    }

    public void setFragmentFrameLayoutId(int i)
    {
    }

    public void setHardwareAccelerationDisabled(boolean flag)
    {
    }

    public void setSessionAutoStartEnabled(boolean flag)
    {
    }

    public void setSkipBlacklist(boolean flag)
    {
    }

    public void startSession(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
    }

    public void stopSession()
    {
    }
}
