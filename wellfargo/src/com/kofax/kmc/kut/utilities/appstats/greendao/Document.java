// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, DocumentDao, EnvironmentDao, Environment, 
//            FieldChangeEventDao

public class Document
{

    private String a;
    private String b;
    private Long c;
    private String d;
    private String e;
    private transient DaoSession f;
    private transient DocumentDao g;
    private Environment h;
    private String i;
    private List j;

    public Document()
    {
    }

    public Document(String s)
    {
        a = s;
    }

    public Document(String s, String s1, Long long1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = long1;
        d = s2;
        e = s3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        f = daosession;
        if (daosession != null)
        {
            daosession = daosession.getDocumentDao();
        } else
        {
            daosession = null;
        }
        g = daosession;
    }

    public void delete()
    {
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            g.delete(this);
            return;
        }
    }

    public Long getCreationTime()
    {
        return c;
    }

    public String getDocumentType()
    {
        return e;
    }

    public Environment getEnvironment()
    {
        String s = b;
        if (i != null && i == s) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Environment environment = (Environment)f.getEnvironmentDao().load(s);
        this;
        JVM INSTR monitorenter ;
        h = environment;
        i = s;
        this;
        JVM INSTR monitorexit ;
_L2:
        return h;
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

    public List getFieldChangeEventList()
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        if (f == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = f.getFieldChangeEventDao()._queryDocument_FieldChangeEventList(a);
        this;
        JVM INSTR monitorenter ;
        if (j == null)
        {
            j = list;
        }
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

    public String getID()
    {
        return a;
    }

    public String getSessionKey()
    {
        return d;
    }

    public void refresh()
    {
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            g.refresh(this);
            return;
        }
    }

    public void resetFieldChangeEventList()
    {
        this;
        JVM INSTR monitorenter ;
        j = null;
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

    public void setDocumentType(String s)
    {
        e = s;
    }

    public void setEnvironment(Environment environment)
    {
        this;
        JVM INSTR monitorenter ;
        h = environment;
        if (environment != null) goto _L2; else goto _L1
_L1:
        environment = null;
_L4:
        b = environment;
        i = b;
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

    public void setID(String s)
    {
        a = s;
    }

    public void setSessionKey(String s)
    {
        d = s;
    }

    public void update()
    {
        if (g == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            g.update(this);
            return;
        }
    }
}
