// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.d;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            DaoSession, ClassificationEventAlternativeDao, ClassificationEventDao, ClassificationEvent

public class ClassificationEventAlternative
{

    private String a;
    private String b;
    private String c;
    private Float d;
    private transient DaoSession e;
    private transient ClassificationEventAlternativeDao f;
    private ClassificationEvent g;
    private String h;

    public ClassificationEventAlternative()
    {
    }

    public ClassificationEventAlternative(String s)
    {
        a = s;
    }

    public ClassificationEventAlternative(String s, String s1, String s2, Float float1)
    {
        a = s;
        b = s1;
        c = s2;
        d = float1;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        e = daosession;
        if (daosession != null)
        {
            daosession = daosession.getClassificationEventAlternativeDao();
        } else
        {
            daosession = null;
        }
        f = daosession;
    }

    public void delete()
    {
        if (f == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            f.delete(this);
            return;
        }
    }

    public Float getAlternativeConfidence()
    {
        return d;
    }

    public String getAlternativeResult()
    {
        return c;
    }

    public ClassificationEvent getClassificationEvent()
    {
        String s = b;
        if (h != null && h == s) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            throw new d("Entity is detached from DAO context");
        }
        ClassificationEvent classificationevent = (ClassificationEvent)e.getClassificationEventDao().load(s);
        this;
        JVM INSTR monitorenter ;
        g = classificationevent;
        h = s;
        this;
        JVM INSTR monitorexit ;
_L2:
        return g;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getClassificationEventID()
    {
        return b;
    }

    public String getID()
    {
        return a;
    }

    public void refresh()
    {
        if (f == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            f.refresh(this);
            return;
        }
    }

    public void setAlternativeConfidence(Float float1)
    {
        d = float1;
    }

    public void setAlternativeResult(String s)
    {
        c = s;
    }

    public void setClassificationEvent(ClassificationEvent classificationevent)
    {
        this;
        JVM INSTR monitorenter ;
        g = classificationevent;
        if (classificationevent != null) goto _L2; else goto _L1
_L1:
        classificationevent = null;
_L4:
        b = classificationevent;
        h = b;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        classificationevent = classificationevent.getID();
        if (true) goto _L4; else goto _L3
_L3:
        classificationevent;
        this;
        JVM INSTR monitorexit ;
        throw classificationevent;
    }

    public void setClassificationEventID(String s)
    {
        b = s;
    }

    public void setID(String s)
    {
        a = s;
    }

    public void update()
    {
        if (f == null)
        {
            throw new d("Entity is detached from DAO context");
        } else
        {
            f.update(this);
            return;
        }
    }
}
