// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentOrmCommon;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, EnvironmentDao, DocumentDao, ErrorLogDao, 
//            InstanceDao, SessionEventDao

public class Environment extends EnvironmentOrmCommon
{

    private String a;
    private Long b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private transient DaoSession m;
    private transient EnvironmentDao n;
    private List o;
    private List p;
    private List q;
    private List r;

    public Environment()
    {
    }

    public Environment(String s)
    {
        a = s;
    }

    public Environment(String s, Long long1, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10)
    {
        a = s;
        b = long1;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        i = s7;
        j = s8;
        k = s9;
        l = s10;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        m = daosession;
        if (daosession != null)
        {
            daosession = daosession.getEnvironmentDao();
        } else
        {
            daosession = null;
        }
        n = daosession;
    }

    public void delete()
    {
        if (n == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            n.delete(this);
            return;
        }
    }

    public String getCarrier()
    {
        return k;
    }

    public String getDeviceID()
    {
        return c;
    }

    public List getDocumentList()
    {
        if (q != null) goto _L2; else goto _L1
_L1:
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = m.getDocumentDao()._queryEnvironment_DocumentList(a);
        this;
        JVM INSTR monitorenter ;
        if (q == null)
        {
            q = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return q;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getEnvTime()
    {
        return b;
    }

    public List getErrorLogList()
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = m.getErrorLogDao()._queryEnvironment_ErrorLogList(a);
        this;
        JVM INSTR monitorenter ;
        if (o == null)
        {
            o = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return o;
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

    public List getInstanceList()
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = m.getInstanceDao()._queryEnvironment_InstanceList(a);
        this;
        JVM INSTR monitorenter ;
        if (p == null)
        {
            p = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return p;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getLanguage()
    {
        return h;
    }

    public String getManufacturer()
    {
        return d;
    }

    public String getMemory()
    {
        return f;
    }

    public String getModel()
    {
        return e;
    }

    public String getOSName()
    {
        return l;
    }

    public String getOSVersion()
    {
        return g;
    }

    public String getSDKVersion()
    {
        return i;
    }

    public List getSessionEventList()
    {
        if (r != null) goto _L2; else goto _L1
_L1:
        if (m == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = m.getSessionEventDao()._queryEnvironment_SessionEventList(a);
        this;
        JVM INSTR monitorenter ;
        if (r == null)
        {
            r = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return r;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getTimeZone()
    {
        return j;
    }

    public void refresh()
    {
        if (n == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            n.refresh(this);
            return;
        }
    }

    public void resetDocumentList()
    {
        this;
        JVM INSTR monitorenter ;
        q = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetErrorLogList()
    {
        this;
        JVM INSTR monitorenter ;
        o = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetInstanceList()
    {
        this;
        JVM INSTR monitorenter ;
        p = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetSessionEventList()
    {
        this;
        JVM INSTR monitorenter ;
        r = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCarrier(String s)
    {
        k = s;
    }

    public void setDeviceID(String s)
    {
        c = s;
    }

    public void setEnvTime(Long long1)
    {
        b = long1;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setLanguage(String s)
    {
        h = s;
    }

    public void setManufacturer(String s)
    {
        d = s;
    }

    public void setMemory(String s)
    {
        f = s;
    }

    public void setModel(String s)
    {
        e = s;
    }

    public void setOSName(String s)
    {
        l = s;
    }

    public void setOSVersion(String s)
    {
        g = s;
    }

    public void setSDKVersion(String s)
    {
        i = s;
    }

    public void setTimeZone(String s)
    {
        j = s;
    }

    public void update()
    {
        if (n == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            n.update(this);
            return;
        }
    }
}
