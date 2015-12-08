// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.lang.ref.WeakReference;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.util.concurrent:
//            ServiceManager, Service

private static final class state extends state
{

    final Service service;
    final WeakReference state;

    public void failed(state state1, Throwable throwable)
    {
        ate ate = (ate)state.get();
        if (ate != null)
        {
            if (!(service instanceof service))
            {
                Logger logger = ServiceManager.access$200();
                Level level = Level.SEVERE;
                String s = String.valueOf(String.valueOf(service));
                String s1 = String.valueOf(String.valueOf(state1));
                logger.log(level, (new StringBuilder(s.length() + 34 + s1.length())).append("Service ").append(s).append(" has failed in the ").append(s1).append(" state.").toString(), throwable);
            }
            ate.transitionService(service, state1, service);
        }
    }

    public void running()
    {
        ate ate = (ate)state.get();
        if (ate != null)
        {
            ate.transitionService(service, service, service);
        }
    }

    public void starting()
    {
        ate ate = (ate)state.get();
        if (ate != null)
        {
            ate.transitionService(service, service, service);
            if (!(service instanceof service))
            {
                ServiceManager.access$200().log(Level.FINE, "Starting {0}.", service);
            }
        }
    }

    public void stopping(service service1)
    {
        ate ate = (ate)state.get();
        if (ate != null)
        {
            ate.transitionService(service, service1, service);
        }
    }

    public void terminated(service service1)
    {
        ate ate = (ate)state.get();
        if (ate != null)
        {
            if (!(service instanceof service))
            {
                ServiceManager.access$200().log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[] {
                    service, service1
                });
            }
            ate.transitionService(service, service1, service);
        }
    }

    ate(Service service1, WeakReference weakreference)
    {
        service = service1;
        state = weakreference;
    }
}
