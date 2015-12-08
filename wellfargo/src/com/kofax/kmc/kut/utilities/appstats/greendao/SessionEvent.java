// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, SessionEventDao, EnvironmentDao, Environment

public class SessionEvent
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Long f;
    private String g;
    private String h;
    private transient DaoSession i;
    private transient SessionEventDao j;
    private Environment k;
    private String l;

    public SessionEvent()
    {
    }

    public SessionEvent(String s)
    {
        a = s;
    }

    public SessionEvent(String s, String s1, String s2, String s3, String s4, Long long1, String s5, 
            String s6)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = long1;
        g = s5;
        h = s6;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        i = daosession;
        if (daosession != null)
        {
            daosession = daosession.getSessionEventDao();
        } else
        {
            daosession = null;
        }
        j = daosession;
    }

    public void delete()
    {
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            j.delete(this);
            return;
        }
    }

    public String getCategory()
    {
        return d;
    }

    public String getDocumentID()
    {
        return h;
    }

    public Environment getEnvironment()
    {
        String s = b;
        if (l != null && l == s) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Environment environment = (Environment)i.getEnvironmentDao().load(s);
        this;
        JVM INSTR monitorenter ;
        k = environment;
        l = s;
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

    public String getEnvironmentID()
    {
        return b;
    }

    public Long getEventTime()
    {
        return f;
    }

    public String getID()
    {
        return a;
    }

    public String getResponse()
    {
        return g;
    }

    public String getSessionKey()
    {
        return c;
    }

    public String getType()
    {
        return e;
    }

    public void refresh()
    {
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            j.refresh(this);
            return;
        }
    }

    public void setCategory(String s)
    {
        d = s;
    }

    public void setDocumentID(String s)
    {
        h = s;
    }

    public void setEnvironment(Environment environment)
    {
        this;
        JVM INSTR monitorenter ;
        k = environment;
        if (environment != null) goto _L2; else goto _L1
_L1:
        environment = null;
_L4:
        b = environment;
        l = b;
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

    public void setEventTime(Long long1)
    {
        f = long1;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setResponse(String s)
    {
        g = s;
    }

    public void setSessionKey(String s)
    {
        c = s;
    }

    public void setType(String s)
    {
        e = s;
    }

    public void update()
    {
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            j.update(this);
            return;
        }
    }
}
