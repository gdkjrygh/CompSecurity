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
//            AppStatsGreenDao, OCREvent, OCREventDao, DaoSession

public class AppStatsGreenDaoOCREvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoOCREvent";
    private static final String d = "OcrEvent";
    private static OCREventDao e = null;

    public AppStatsGreenDaoOCREvent()
    {
    }

    protected OCREvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        OCREvent ocrevent;
        int i;
        int j;
        ocrevent = new OCREvent();
        j = aappstatsdaofield.length;
        i = 0;
_L11:
        AppStatsDaoField appstatsdaofield;
        OCREvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = OCREvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
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
        ocrevent.setId(appstatsdaofield.getDsValueString());
_L12:
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        ocrevent.setInstanceID(appstatsdaofield.getDsValueString());
          goto _L12
_L4:
        ocrevent.setStartTime(appstatsdaofield.getDsValueLong());
          goto _L12
_L5:
        ocrevent.setStopTime(appstatsdaofield.getDsValueLong());
          goto _L12
_L6:
        ocrevent.setEventType(appstatsdaofield.getDsValueString());
          goto _L12
_L7:
        ocrevent.setSourceImageID(appstatsdaofield.getDsValueString());
          goto _L12
_L8:
        ocrevent.setResultCode(appstatsdaofield.getDsValueInt());
          goto _L12
        ocrevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L12
        return ocrevent;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("OcrEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                OCREvent ocrevent = (OCREvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, ocrevent.getID()));
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, ocrevent.getInstanceID()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, ocrevent.getSessionKey()));
                daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(ocrevent.getStartTime().longValue())));
                daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(ocrevent.getStopTime().longValue())));
                daoFields.add(new AppStatsDaoField("SourceImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, ocrevent.getSourceImageID()));
                daoFields.add(new AppStatsDaoField("ResultCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ocrevent.getResultCode()));
                daoFields.add(new AppStatsDaoField("EventType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ocrevent.getEventType()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: captureEventDao cannot be null");
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
            throw new NullPointerException("dsUpdate: captureEventDao cannot be null");
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
            e = a.getOCREventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[OCREvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.OCREvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[OCREvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[OCREvent.a.d.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.OCREvent.a.e.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[OCREvent.a.h.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[OCREvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.OCREvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.OCREvent.a.c.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
