// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, OCREventDao, ImageDao, Image, 
//            InstanceDao, Instance

public class OCREvent
{

    private String a;
    private String b;
    private String c;
    private Long d;
    private Long e;
    private String f;
    private Integer g;
    private String h;
    private transient DaoSession i;
    private transient OCREventDao j;
    private Instance k;
    private String l;
    private Image m;
    private String n;

    public OCREvent()
    {
    }

    public OCREvent(String s)
    {
        a = s;
    }

    public OCREvent(String s, String s1, String s2, Long long1, Long long2, String s3, Integer integer, 
            String s4)
    {
        a = s;
        b = s1;
        c = s2;
        d = long1;
        e = long2;
        f = s3;
        g = integer;
        h = s4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        i = daosession;
        if (daosession != null)
        {
            daosession = daosession.getOCREventDao();
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

    public String getEventType()
    {
        return h;
    }

    public String getID()
    {
        return null;
    }

    public String getId()
    {
        return a;
    }

    public Image getImage()
    {
        String s = a;
        if (n != null && n.equals(s)) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Image image = (Image)i.getImageDao().load(s);
        this;
        JVM INSTR monitorenter ;
        m = image;
        n = s;
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

    public Instance getInstance()
    {
        String s = a;
        if (l != null && l.equals(s)) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Instance instance = (Instance)i.getInstanceDao().load(s);
        this;
        JVM INSTR monitorenter ;
        k = instance;
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

    public String getInstanceID()
    {
        return b;
    }

    public Integer getResultCode()
    {
        return g;
    }

    public String getSessionKey()
    {
        return c;
    }

    public String getSourceImageID()
    {
        return f;
    }

    public Long getStartTime()
    {
        return d;
    }

    public Long getStopTime()
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

    public void setEventType(String s)
    {
        h = s;
    }

    public void setId(String s)
    {
        a = s;
    }

    public void setImage(Image image)
    {
        if (image == null)
        {
            throw new d("To-one property 'id' has not-null constraint; cannot set to-one to null");
        }
        this;
        JVM INSTR monitorenter ;
        m = image;
        a = image.getID();
        n = a;
        this;
        JVM INSTR monitorexit ;
        return;
        image;
        this;
        JVM INSTR monitorexit ;
        throw image;
    }

    public void setInstance(Instance instance)
    {
        if (instance == null)
        {
            throw new d("To-one property 'id' has not-null constraint; cannot set to-one to null");
        }
        this;
        JVM INSTR monitorenter ;
        k = instance;
        a = instance.getInstanceID();
        l = a;
        this;
        JVM INSTR monitorexit ;
        return;
        instance;
        this;
        JVM INSTR monitorexit ;
        throw instance;
    }

    public void setInstanceID(String s)
    {
        b = s;
    }

    public void setResultCode(Integer integer)
    {
        g = integer;
    }

    public void setSessionKey(String s)
    {
        c = s;
    }

    public void setSourceImageID(String s)
    {
        f = s;
    }

    public void setStartTime(Long long1)
    {
        d = long1;
    }

    public void setStopTime(Long long1)
    {
        e = long1;
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
