// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, FieldChangeEventDao, EnvironmentDao, Environment

public class FieldChangeEvent
{

    private String a;
    private String b;
    private Long c;
    private String d;
    private String e;
    private String f;
    private Integer g;
    private String h;
    private String i;
    private Float j;
    private Integer k;
    private transient DaoSession l;
    private transient FieldChangeEventDao m;
    private Environment n;
    private String o;

    public FieldChangeEvent()
    {
    }

    public FieldChangeEvent(String s)
    {
        a = s;
    }

    public FieldChangeEvent(String s, String s1, Long long1, String s2, String s3, String s4, Integer integer, 
            String s5, String s6, Float float1, Integer integer1)
    {
        a = s;
        b = s1;
        c = long1;
        d = s2;
        e = s3;
        f = s4;
        g = integer;
        h = s5;
        i = s6;
        j = float1;
        k = integer1;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        l = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFieldChangeEventDao();
        } else
        {
            daosession = null;
        }
        m = daosession;
    }

    public void delete()
    {
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            m.delete(this);
            return;
        }
    }

    public String getChangedValue()
    {
        return e;
    }

    public Float getConfidence()
    {
        return j;
    }

    public String getDocumentID()
    {
        return b;
    }

    public Environment getEnvironment()
    {
        String s = b;
        if (o != null && o == s) goto _L2; else goto _L1
_L1:
        if (l == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Environment environment = (Environment)l.getEnvironmentDao().load(s);
        this;
        JVM INSTR monitorenter ;
        n = environment;
        o = s;
        this;
        JVM INSTR monitorexit ;
_L2:
        return n;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getErrorDescription()
    {
        return h;
    }

    public Long getEventTime()
    {
        return c;
    }

    public String getFieldName()
    {
        return f;
    }

    public Integer getFormattingFailed()
    {
        return k;
    }

    public String getID()
    {
        return a;
    }

    public Integer getIsValid()
    {
        return g;
    }

    public String getOriginalValue()
    {
        return d;
    }

    public String getSessionEventID()
    {
        return i;
    }

    public void refresh()
    {
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            m.refresh(this);
            return;
        }
    }

    public void setChangedValue(String s)
    {
        e = s;
    }

    public void setConfidence(Float float1)
    {
        j = float1;
    }

    public void setDocumentID(String s)
    {
        b = s;
    }

    public void setEnvironment(Environment environment)
    {
        this;
        JVM INSTR monitorenter ;
        n = environment;
        if (environment != null) goto _L2; else goto _L1
_L1:
        environment = null;
_L4:
        b = environment;
        o = b;
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

    public void setErrorDescription(String s)
    {
        h = s;
    }

    public void setEventTime(Long long1)
    {
        c = long1;
    }

    public void setFieldName(String s)
    {
        f = s;
    }

    public void setFormattingFailed(Integer integer)
    {
        k = integer;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setIsValid(Integer integer)
    {
        g = integer;
    }

    public void setOriginalValue(String s)
    {
        d = s;
    }

    public void setSessionEventID(String s)
    {
        i = s;
    }

    public void update()
    {
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            m.update(this);
            return;
        }
    }
}
