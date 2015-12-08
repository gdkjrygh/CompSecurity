// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, ErrorLogDao, EnvironmentDao, Environment

public class ErrorLog
{

    private String a;
    private String b;
    private Long c;
    private Integer d;
    private String e;
    private String f;
    private String g;
    private transient DaoSession h;
    private transient ErrorLogDao i;
    private Environment j;
    private String k;

    public ErrorLog()
    {
    }

    public ErrorLog(String s)
    {
        a = s;
    }

    public ErrorLog(String s, String s1, Long long1, Integer integer, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = long1;
        d = integer;
        e = s2;
        f = s3;
        g = s4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        h = daosession;
        if (daosession != null)
        {
            daosession = daosession.getErrorLogDao();
        } else
        {
            daosession = null;
        }
        i = daosession;
    }

    public void delete()
    {
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            i.delete(this);
            return;
        }
    }

    public String getDescription()
    {
        return e;
    }

    public Environment getEnvironment()
    {
        String s = b;
        if (k != null && k == s) goto _L2; else goto _L1
_L1:
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Environment environment = (Environment)h.getEnvironmentDao().load(s);
        this;
        JVM INSTR monitorenter ;
        j = environment;
        k = s;
        this;
        JVM INSTR monitorexit ;
_L2:
        return j;
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

    public Integer getErrorCode()
    {
        return d;
    }

    public Long getErrorTime()
    {
        return c;
    }

    public String getID()
    {
        return a;
    }

    public String getRecommendation()
    {
        return f;
    }

    public String getSessionKey()
    {
        return g;
    }

    public void refresh()
    {
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            i.refresh(this);
            return;
        }
    }

    public void setDescription(String s)
    {
        e = s;
    }

    public void setEnvironment(Environment environment)
    {
        this;
        JVM INSTR monitorenter ;
        j = environment;
        if (environment != null) goto _L2; else goto _L1
_L1:
        environment = null;
_L4:
        b = environment;
        k = b;
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

    public void setErrorCode(Integer integer)
    {
        d = integer;
    }

    public void setErrorTime(Long long1)
    {
        c = long1;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setRecommendation(String s)
    {
        f = s;
    }

    public void setSessionKey(String s)
    {
        g = s;
    }

    public void update()
    {
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            i.update(this);
            return;
        }
    }
}
