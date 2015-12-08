// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.c;
import a.a.a.d.e;
import a.a.a.d.g;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, SessionEvent, SessionEventDao, DaoSession

public class AppStatsGreenDaoSessionEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoSessionEvent";
    private static final String d = "SessionEvent";
    private static SessionEventDao e = null;

    public AppStatsGreenDaoSessionEvent()
    {
    }

    protected SessionEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        SessionEvent sessionevent;
        int i;
        int j;
        sessionevent = new SessionEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L11:
        AppStatsDaoField appstatsdaofield;
        SessionEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = SessionEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 8: default 96
    //                   1 141
    //                   2 158
    //                   3 169
    //                   4 180
    //                   5 191
    //                   6 202
    //                   7 213
    //                   8 224;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_224;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        sessionevent.setID(appstatsdaofield.getDsValueString());
_L12:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        sessionevent.setEnvironmentID(appstatsdaofield.getDsValueString());
          goto _L12
_L4:
        sessionevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L12
_L5:
        sessionevent.setCategory(appstatsdaofield.getDsValueString());
          goto _L12
_L6:
        sessionevent.setType(appstatsdaofield.getDsValueString());
          goto _L12
_L7:
        sessionevent.setEventTime(appstatsdaofield.getDsValueLong());
          goto _L12
_L8:
        sessionevent.setResponse(appstatsdaofield.getDsValueString());
          goto _L12
        sessionevent.setDocumentID(appstatsdaofield.getDsValueString());
          goto _L12
        return sessionevent;
    }

    protected volatile Object createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        return createGreenDaoOrmTblObject(aappstatsdaofield);
    }

    public void dsExport(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        initializeGreenDaoObjects(e);
        s = e.queryBuilder();
        s.a(50);
        s.a().a(50);
        for (int i = 0; (long)i < countQuery.b().c(); i += 50)
        {
            s.b(i);
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("SessionEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                SessionEvent sessionevent = (SessionEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, sessionevent.getID()));
                daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, sessionevent.getEnvironmentID()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, sessionevent.getSessionKey()));
                daoFields.add(new AppStatsDaoField("Category", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, sessionevent.getCategory()));
                daoFields.add(new AppStatsDaoField("Type", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, sessionevent.getType()));
                daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(sessionevent.getEventTime().longValue())));
                daoFields.add(new AppStatsDaoField("Response", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, sessionevent.getResponse()));
                daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: sessionEventDao cannot be null");
        } else
        {
            aappstatsdaofield = createGreenDaoOrmTblObject(aappstatsdaofield);
            e.insert(aappstatsdaofield);
            return;
        }
    }

    public void dsUpdate(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsUpdate: sessionEventDao cannot be null");
        } else
        {
            aappstatsdaofield = createGreenDaoOrmTblObject(aappstatsdaofield);
            e.update(aappstatsdaofield);
            return;
        }
    }

    protected boolean initializeGreenDaoObjects(a a)
    {
        Object obj = a;
        if (a == null)
        {
            obj = e;
        }
        boolean flag = super.initializeGreenDaoObjects(((a) (obj)));
        if (flag)
        {
            e = a.getSessionEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[SessionEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.SessionEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[SessionEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.SessionEvent.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[SessionEvent.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.SessionEvent.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[SessionEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.SessionEvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[SessionEvent.a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
