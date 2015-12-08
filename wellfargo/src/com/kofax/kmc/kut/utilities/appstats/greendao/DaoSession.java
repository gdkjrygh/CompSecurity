// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.b.d;
import a.a.a.c;
import a.a.a.c.a;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            EnvironmentDao, ErrorLogDao, InstanceDao, DocumentDao, 
//            ImageDao, ClassificationEventDao, ClassificationEventAlternativeDao, CaptureEventDao, 
//            PropertyChangeEventDao, ImageProcessorEventDao, FieldChangeEventDao, SessionEventDao, 
//            OCREventDao, Environment, ErrorLog, Instance, 
//            Document, Image, ClassificationEvent, ClassificationEventAlternative, 
//            CaptureEvent, PropertyChangeEvent, ImageProcessorEvent, FieldChangeEvent, 
//            SessionEvent

public class DaoSession extends c
{

    private final a a;
    private final a b;
    private final a c;
    private final a d;
    private final a e;
    private final a f;
    private final a g;
    private final a h;
    private final a i;
    private final a j;
    private final a k;
    private final a l;
    private final a m;
    private final EnvironmentDao n;
    private final ErrorLogDao o;
    private final InstanceDao p;
    private final DocumentDao q;
    private final ImageDao r;
    private final ClassificationEventDao s;
    private final ClassificationEventAlternativeDao t;
    private final CaptureEventDao u;
    private final PropertyChangeEventDao v;
    private final ImageProcessorEventDao w;
    private final FieldChangeEventDao x;
    private final SessionEventDao y;
    private final OCREventDao z;

    public DaoSession(SQLiteDatabase sqlitedatabase, d d1, Map map)
    {
        super(sqlitedatabase);
        a = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/EnvironmentDao)).a();
        a.a(d1);
        b = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/ErrorLogDao)).a();
        b.a(d1);
        c = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/InstanceDao)).a();
        c.a(d1);
        d = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/DocumentDao)).a();
        d.a(d1);
        e = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/ImageDao)).a();
        e.a(d1);
        f = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEventDao)).a();
        f.a(d1);
        g = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEventAlternativeDao)).a();
        g.a(d1);
        h = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/CaptureEventDao)).a();
        h.a(d1);
        i = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/PropertyChangeEventDao)).a();
        i.a(d1);
        j = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/ImageProcessorEventDao)).a();
        j.a(d1);
        k = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/FieldChangeEventDao)).a();
        k.a(d1);
        l = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/SessionEventDao)).a();
        l.a(d1);
        m = ((a)map.get(com/kofax/kmc/kut/utilities/appstats/greendao/OCREventDao)).a();
        m.a(d1);
        n = new EnvironmentDao(a, this);
        o = new ErrorLogDao(b, this);
        p = new InstanceDao(c, this);
        q = new DocumentDao(d, this);
        r = new ImageDao(e, this);
        s = new ClassificationEventDao(f, this);
        t = new ClassificationEventAlternativeDao(g, this);
        u = new CaptureEventDao(h, this);
        v = new PropertyChangeEventDao(i, this);
        w = new ImageProcessorEventDao(j, this);
        x = new FieldChangeEventDao(k, this);
        y = new SessionEventDao(l, this);
        z = new OCREventDao(m, this);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/Environment, n);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/ErrorLog, o);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/Instance, p);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/Document, q);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/Image, r);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEvent, s);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/ClassificationEventAlternative, t);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/CaptureEvent, u);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/PropertyChangeEvent, v);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/ImageProcessorEvent, w);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/FieldChangeEvent, x);
        registerDao(com/kofax/kmc/kut/utilities/appstats/greendao/SessionEvent, y);
    }

    public void clear()
    {
        a.b().a();
        b.b().a();
        c.b().a();
        d.b().a();
        e.b().a();
        f.b().a();
        g.b().a();
        h.b().a();
        i.b().a();
        j.b().a();
        k.b().a();
        l.b().a();
        m.b().a();
    }

    public CaptureEventDao getCaptureEventDao()
    {
        return u;
    }

    public ClassificationEventAlternativeDao getClassificationEventAlternativeDao()
    {
        return t;
    }

    public ClassificationEventDao getClassificationEventDao()
    {
        return s;
    }

    public DocumentDao getDocumentDao()
    {
        return q;
    }

    public EnvironmentDao getEnvironmentDao()
    {
        return n;
    }

    public ErrorLogDao getErrorLogDao()
    {
        return o;
    }

    public FieldChangeEventDao getFieldChangeEventDao()
    {
        return x;
    }

    public ImageDao getImageDao()
    {
        return r;
    }

    public ImageProcessorEventDao getImageProcessorEventDao()
    {
        return w;
    }

    public InstanceDao getInstanceDao()
    {
        return p;
    }

    public OCREventDao getOCREventDao()
    {
        return z;
    }

    public PropertyChangeEventDao getPropertyChangeEventDao()
    {
        return v;
    }

    public SessionEventDao getSessionEventDao()
    {
        return y;
    }
}
