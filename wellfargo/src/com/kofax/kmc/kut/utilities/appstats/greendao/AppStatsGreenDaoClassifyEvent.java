// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.greendao;

import a.a.a.a;
import a.a.a.d.c;
import a.a.a.d.e;
import a.a.a.d.g;
import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, ClassificationEvent, ClassificationEventDao, DaoSession

public class AppStatsGreenDaoClassifyEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoClassifyEvent";
    private static final String d = "ClassificationEvent";
    private static ClassificationEventDao e = null;

    public AppStatsGreenDaoClassifyEvent()
    {
    }

    protected ClassificationEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        ClassificationEvent classificationevent;
        int i;
        int j;
        classificationevent = new ClassificationEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L12:
        AppStatsDaoField appstatsdaofield;
        ClassificationEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = ClassificationEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 9: default 100
    //                   1 145
    //                   2 162
    //                   3 173
    //                   4 184
    //                   5 195
    //                   6 206
    //                   7 217
    //                   8 228
    //                   9 239;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L10:
        break MISSING_BLOCK_LABEL_239;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        classificationevent.setID(appstatsdaofield.getDsValueString());
_L13:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        classificationevent.setInstanceID(appstatsdaofield.getDsValueString());
          goto _L13
_L4:
        classificationevent.setStartTime(appstatsdaofield.getDsValueLong());
          goto _L13
_L5:
        classificationevent.setStopTime(appstatsdaofield.getDsValueLong());
          goto _L13
_L6:
        classificationevent.setClassificationResult(appstatsdaofield.getDsValueString());
          goto _L13
_L7:
        classificationevent.setClassificationConfidence(appstatsdaofield.getDsValueFloat());
          goto _L13
_L8:
        classificationevent.setImageID(appstatsdaofield.getDsValueString());
          goto _L13
_L9:
        classificationevent.setDocumentID(appstatsdaofield.getDsValueString());
          goto _L13
        classificationevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L13
        return classificationevent;
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
            Iterator iterator = s.a().c().iterator();
            while (iterator.hasNext()) 
            {
                ClassificationEvent classificationevent = (ClassificationEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, classificationevent.getID()));
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, classificationevent.getInstanceID()));
                if (classificationevent.getStartTime().longValue() == 0L)
                {
                    daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(0)));
                } else
                {
                    daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(classificationevent.getStartTime().longValue())));
                }
                Log.i("AppStatsGreenDaoClassifyEvent", (new StringBuilder()).append("STopTime = ").append(classificationevent.getStopTime()).append("  ").append(new Date(classificationevent.getStopTime().longValue())).toString());
                if (classificationevent.getStopTime().longValue() == 0L)
                {
                    daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(0)));
                } else
                {
                    daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(classificationevent.getStopTime().longValue())));
                }
                daoFields.add(new AppStatsDaoField("ClassificationResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, classificationevent.getClassificationResult()));
                daoFields.add(new AppStatsDaoField("ClassificationConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, classificationevent.getClassificationConfidence()));
                daoFields.add(new AppStatsDaoField("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, classificationevent.getImageID()));
                daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, classificationevent.getSessionKey()));
                appstatsdsexporthandler.onExportAppStatsRowEvent("ClassificationEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            }
        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: classifyEventDao cannot be null");
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
            throw new NullPointerException("dsUpdate: classifyEventDao cannot be null");
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
            e = a.getClassificationEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ClassificationEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[ClassificationEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEvent.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[ClassificationEvent.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEvent.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ClassificationEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ClassificationEvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ClassificationEvent.a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ClassificationEvent.a.i.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
