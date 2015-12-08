// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, ImageDao, CaptureEventDao, ClassificationEventDao

public class Image
{

    private String a;
    private String b;
    private Long c;
    private Long d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private transient DaoSession i;
    private transient ImageDao j;
    private List k;
    private List l;

    public Image()
    {
    }

    public Image(String s)
    {
        a = s;
    }

    public Image(String s, String s1, Long long1, Long long2, Integer integer, String s2, String s3, 
            String s4)
    {
        a = s;
        b = s1;
        c = long1;
        d = long2;
        e = integer;
        f = s2;
        g = s3;
        h = s4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        i = daosession;
        if (daosession != null)
        {
            daosession = daosession.getImageDao();
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

    public List getCaptureEventList()
    {
        if (l != null) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = i.getCaptureEventDao()._queryImage_CaptureEventList(a);
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
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = i.getClassificationEventDao()._queryImage_ClassificationEventList(a);
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

    public String getDocumentID()
    {
        return f;
    }

    public String getEnvironmentID()
    {
        return b;
    }

    public Long getFileSize()
    {
        return d;
    }

    public String getID()
    {
        return a;
    }

    public String getSessionKey()
    {
        return h;
    }

    public Integer getSource()
    {
        return e;
    }

    public String getStoragePath()
    {
        return g;
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

    public void setCreationTime(Long long1)
    {
        c = long1;
    }

    public void setDocumentID(String s)
    {
        f = s;
    }

    public void setEnvironmentID(String s)
    {
        b = s;
    }

    public void setFileSize(Long long1)
    {
        d = long1;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setSessionKey(String s)
    {
        h = s;
    }

    public void setSource(Integer integer)
    {
        e = integer;
    }

    public void setStoragePath(String s)
    {
        g = s;
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
