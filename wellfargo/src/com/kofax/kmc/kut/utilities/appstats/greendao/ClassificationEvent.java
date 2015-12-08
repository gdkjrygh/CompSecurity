// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, ClassificationEventDao, ClassificationEventAlternativeDao, ImageDao, 
//            Image, InstanceDao, Instance

public class ClassificationEvent
{

    private String a;
    private String b;
    private Long c;
    private Long d;
    private String e;
    private Float f;
    private String g;
    private String h;
    private String i;
    private transient DaoSession j;
    private transient ClassificationEventDao k;
    private Image l;
    private String m;
    private Instance n;
    private String o;
    private List p;

    public ClassificationEvent()
    {
    }

    public ClassificationEvent(String s)
    {
        a = s;
    }

    public ClassificationEvent(String s, String s1, Long long1, Long long2, String s2, Float float1, String s3, 
            String s4, String s5)
    {
        a = s;
        b = s1;
        c = long1;
        d = long2;
        e = s2;
        f = float1;
        g = s3;
        h = s4;
        i = s5;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        j = daosession;
        if (daosession != null)
        {
            daosession = daosession.getClassificationEventDao();
        } else
        {
            daosession = null;
        }
        k = daosession;
    }

    public void delete()
    {
        if (k == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            k.delete(this);
            return;
        }
    }

    public Float getClassificationConfidence()
    {
        return f;
    }

    public List getClassificationEventAlternativeList()
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        List list = j.getClassificationEventAlternativeDao()._queryClassificationEvent_ClassificationEventAlternativeList(a);
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

    public String getClassificationResult()
    {
        return e;
    }

    public String getDocumentID()
    {
        return h;
    }

    public String getID()
    {
        return a;
    }

    public Image getImage()
    {
        String s = g;
        if (m != null && m == s) goto _L2; else goto _L1
_L1:
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Image image = (Image)j.getImageDao().load(s);
        this;
        JVM INSTR monitorenter ;
        l = image;
        m = s;
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

    public String getImageID()
    {
        return g;
    }

    public Instance getInstance()
    {
        String s = b;
        if (o != null && o == s) goto _L2; else goto _L1
_L1:
        if (j == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Instance instance = (Instance)j.getInstanceDao().load(s);
        this;
        JVM INSTR monitorenter ;
        n = instance;
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

    public String getInstanceID()
    {
        return b;
    }

    public String getSessionKey()
    {
        return i;
    }

    public Long getStartTime()
    {
        return c;
    }

    public Long getStopTime()
    {
        return d;
    }

    public void refresh()
    {
        if (k == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            k.refresh(this);
            return;
        }
    }

    public void resetClassificationEventAlternativeList()
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

    public void setClassificationConfidence(Float float1)
    {
        f = float1;
    }

    public void setClassificationResult(String s)
    {
        e = s;
    }

    public void setDocumentID(String s)
    {
        h = s;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setImage(Image image)
    {
        this;
        JVM INSTR monitorenter ;
        l = image;
        if (image != null) goto _L2; else goto _L1
_L1:
        image = null;
_L4:
        g = image;
        m = g;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        image = image.getID();
        if (true) goto _L4; else goto _L3
_L3:
        image;
        this;
        JVM INSTR monitorexit ;
        throw image;
    }

    public void setImageID(String s)
    {
        g = s;
    }

    public void setInstance(Instance instance)
    {
        this;
        JVM INSTR monitorenter ;
        n = instance;
        if (instance != null) goto _L2; else goto _L1
_L1:
        instance = null;
_L4:
        b = instance;
        o = b;
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

    public void setSessionKey(String s)
    {
        i = s;
    }

    public void setStartTime(Long long1)
    {
        c = long1;
    }

    public void setStopTime(Long long1)
    {
        d = long1;
    }

    public void update()
    {
        if (k == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            k.update(this);
            return;
        }
    }
}
