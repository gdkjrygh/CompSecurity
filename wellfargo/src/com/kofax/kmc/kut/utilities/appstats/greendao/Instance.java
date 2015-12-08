// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, InstanceDao, CaptureEventDao, ClassificationEventDao, 
//            EnvironmentDao, Environment, PropertyChangeEventDao

public class Instance
{

    private String a;
    private String b;
    private Long c;
    private Long d;
    private Integer e;
    private String f;
    private transient DaoSession g;
    private transient InstanceDao h;
    private Environment i;
    private String j;
    private List k;
    private List l;
    private List m;

    public Instance()
    {
    }

    public Instance(String s)
    {
        a = s;
    }

    public Instance(String s, String s1, Long long1, Long long2, Integer integer, String s2)
    {
        a = s;
        b = s1;
        c = long1;
        d = long2;
        e = integer;
        f = s2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        g = daosession;
        if (daosession != null)
        {
            daosession = daosession.getInstanceDao();
        } else
        {
            daosession = null;
        }
        h = daosession;
    }

    public void delete()
    {
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            h.delete(this);
            return;
        }
    }

    public List getCaptureEventList()
    {
        if (l != null) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = g.getCaptureEventDao()._queryInstance_CaptureEventList(a);
        this;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return l;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getClassificationEventList()
    {
        if (k != null) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = g.getClassificationEventDao()._queryInstance_ClassificationEventList(a);
        this;
        JVM INSTR monitorenter ;
        if (k == null)
        {
            k = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return k;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getCreationTime()
    {
        return c;
    }

    public Long getDismissalTime()
    {
        return d;
    }

    public Environment getEnvironment()
    {
        String s = b;
        if (j != null && j == s) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Environment environment = (Environment)g.getEnvironmentDao().load(s);
        this;
        JVM INSTR monitorenter ;
        i = environment;
        j = s;
        this;
        JVM INSTR monitorexit ;
_L2:
        return i;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getEnvironmentID()
    {
        return b;
    }

    public String getInstanceID()
    {
        return a;
    }

    public Integer getInstanceType()
    {
        return e;
    }

    public List getPropertyChangeEventList()
    {
        if (m != null) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = g.getPropertyChangeEventDao()._queryInstance_PropertyChangeEventList(a);
        this;
        JVM INSTR monitorenter ;
        if (m == null)
        {
            m = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return m;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getSessionKey()
    {
        return f;
    }

    public void refresh()
    {
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            h.refresh(this);
            return;
        }
    }

    public void resetCaptureEventList()
    {
        this;
        JVM INSTR monitorenter ;
        l = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetClassificationEventList()
    {
        this;
        JVM INSTR monitorenter ;
        k = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetPropertyChangeEventList()
    {
        this;
        JVM INSTR monitorenter ;
        m = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCreationTime(Long long1)
    {
        c = long1;
    }

    public void setDismissalTime(Long long1)
    {
        d = long1;
    }

    public void setEnvironment(Environment environment)
    {
        this;
        JVM INSTR monitorenter ;
        i = environment;
        if (environment != null) goto _L2; else goto _L1
_L1:
        environment = null;
_L4:
        b = environment;
        j = b;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        environment = environment.getID();
        if (true) goto _L4; else goto _L3
_L3:
        environment;
        this;
        JVM INSTR monitorexit ;
        throw environment;
    }

    public void setEnvironmentID(String s)
    {
        b = s;
    }

    public void setInstanceID(String s)
    {
        a = s;
    }

    public void setInstanceType(Integer integer)
    {
        e = integer;
    }

    public void setSessionKey(String s)
    {
        f = s;
    }

    public void update()
    {
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            h.update(this);
            return;
        }
    }
}
