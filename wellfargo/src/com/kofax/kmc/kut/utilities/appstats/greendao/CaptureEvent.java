// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, CaptureEventDao, ImageDao, Image, 
//            InstanceDao, Instance

public class CaptureEvent
{

    private String a;
    private String b;
    private Long c;
    private Integer d;
    private Integer e;
    private String f;
    private String g;
    private transient DaoSession h;
    private transient CaptureEventDao i;
    private Image j;
    private String k;
    private Instance l;
    private String m;

    public CaptureEvent()
    {
    }

    public CaptureEvent(String s)
    {
        a = s;
    }

    public CaptureEvent(String s, String s1, Long long1, Integer integer, Integer integer1, String s2, String s3)
    {
        a = s;
        b = s1;
        c = long1;
        d = integer;
        e = integer1;
        f = s2;
        g = s3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        h = daosession;
        if (daosession != null)
        {
            daosession = daosession.getCaptureEventDao();
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

    public Long getEventTime()
    {
        return c;
    }

    public Integer getEventType()
    {
        return d;
    }

    public String getID()
    {
        return a;
    }

    public Image getImage()
    {
        String s = f;
        if (k != null && k == s) goto _L2; else goto _L1
_L1:
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Image image = (Image)h.getImageDao().load(s);
        this;
        JVM INSTR monitorenter ;
        j = image;
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

    public String getImageID()
    {
        return f;
    }

    public Instance getInstance()
    {
        String s = b;
        if (m != null && m == s) goto _L2; else goto _L1
_L1:
        if (h == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        Instance instance = (Instance)h.getInstanceDao().load(s);
        this;
        JVM INSTR monitorenter ;
        l = instance;
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

    public String getInstanceID()
    {
        return b;
    }

    public String getSessionKey()
    {
        return g;
    }

    public Integer getValue()
    {
        return e;
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

    public void setEventTime(Long long1)
    {
        c = long1;
    }

    public void setEventType(Integer integer)
    {
        d = integer;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void setImage(Image image)
    {
        this;
        JVM INSTR monitorenter ;
        j = image;
        if (image != null) goto _L2; else goto _L1
_L1:
        image = null;
_L4:
        f = image;
        k = f;
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
        f = s;
    }

    public void setInstance(Instance instance)
    {
        this;
        JVM INSTR monitorenter ;
        l = instance;
        if (instance != null) goto _L2; else goto _L1
_L1:
        instance = null;
_L4:
        b = instance;
        m = b;
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
        g = s;
    }

    public void setValue(Integer integer)
    {
        e = integer;
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
