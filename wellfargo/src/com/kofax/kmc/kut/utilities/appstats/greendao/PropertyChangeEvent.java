// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, PropertyChangeEventDao, InstanceDao, Instance

public class PropertyChangeEvent
{

    private String a;
    private String b;
    private Long c;
    private Integer d;
    private String e;
    private String f;
    private transient DaoSession g;
    private transient PropertyChangeEventDao h;
    private Instance i;
    private String j;

    public PropertyChangeEvent()
    {
    }

    public PropertyChangeEvent(String s)
    {
        a = s;
    }

    public PropertyChangeEvent(String s, String s1, Long long1, Integer integer, String s2, String s3)
    {
        a = s;
        b = s1;
        c = long1;
        d = integer;
        e = s2;
        f = s3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        g = daosession;
        if (daosession != null)
        {
            daosession = daosession.getPropertyChangeEventDao();
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

    public Long getEventTime()
    {
        return c;
    }

    public String getID()
    {
        return a;
    }

    public Instance getInstance()
    {
        String s = b;
        if (j != null && j == s) goto _L2; else goto _L1
_L1:
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Instance instance = (Instance)g.getInstanceDao().load(s);
        this;
        JVM INSTR monitorenter ;
        i = instance;
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

    public String getInstanceID()
    {
        return b;
    }

    public Integer getPropertyType()
    {
        return d;
    }

    public String getPropertyValue()
    {
        return e;
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

    public void setEventTime(Long long1)
    {
        c = long1;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setInstance(Instance instance)
    {
        this;
        JVM INSTR monitorenter ;
        i = instance;
        if (instance != null) goto _L2; else goto _L1
_L1:
        instance = null;
_L4:
        b = instance;
        j = b;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        instance = instance.getInstanceID();
        if (true) goto _L4; else goto _L3
_L3:
        instance;
        this;
        JVM INSTR monitorexit ;
        throw instance;
    }

    public void setInstanceID(String s)
    {
        b = s;
    }

    public void setPropertyType(Integer integer)
    {
        d = integer;
    }

    public void setPropertyValue(String s)
    {
        e = s;
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
