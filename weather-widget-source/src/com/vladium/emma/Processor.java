// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.emma;

import com.vladium.logging.Logger;
import com.vladium.util.IProperties;
import java.util.Properties;

// Referenced classes of package com.vladium.emma:
//            EMMAProperties, AppLoggers

public abstract class Processor
{

    protected String m_appName;
    protected Logger m_log;
    protected IProperties m_propertyOverrides;

    protected Processor()
    {
    }

    protected abstract void _run(IProperties iproperties);

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        IProperties iproperties;
        Logger logger;
        validateState();
        iproperties = EMMAProperties.getAppProperties();
        iproperties = com.vladium.util.IProperties.Factory.combine(m_propertyOverrides, iproperties);
        logger = Logger.getLogger();
        logger = AppLoggers.create(m_appName, iproperties, logger);
        if (logger.atTRACE1())
        {
            logger.trace1("run", "complete tool properties:");
            iproperties.list(logger.getWriter());
        }
        Logger.push(logger);
        m_log = logger;
        _run(iproperties);
        if (m_log != null)
        {
            Logger.pop(m_log);
            m_log = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        if (m_log != null)
        {
            Logger.pop(m_log);
            m_log = null;
        }
        throw exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void setAppName(String s)
    {
        this;
        JVM INSTR monitorenter ;
        m_appName = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void setPropertyOverrides(IProperties iproperties)
    {
        this;
        JVM INSTR monitorenter ;
        m_propertyOverrides = iproperties;
        this;
        JVM INSTR monitorexit ;
        return;
        iproperties;
        throw iproperties;
    }

    public final void setPropertyOverrides(Properties properties)
    {
        this;
        JVM INSTR monitorenter ;
        m_propertyOverrides = EMMAProperties.wrap(properties);
        this;
        JVM INSTR monitorexit ;
        return;
        properties;
        throw properties;
    }

    protected void validateState()
    {
    }
}
