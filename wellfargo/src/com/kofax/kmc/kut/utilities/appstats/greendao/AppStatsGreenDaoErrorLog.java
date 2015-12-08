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
//            AppStatsGreenDao, ErrorLog, ErrorLogDao, DaoSession

public class AppStatsGreenDaoErrorLog extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoErrorLog";
    private static final String d = "ErrorLog";
    private static ErrorLogDao e = null;

    public AppStatsGreenDaoErrorLog()
    {
    }

    protected ErrorLog createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        ErrorLog errorlog;
        int i;
        int j;
        errorlog = new ErrorLog();
        j = aappstatsdaofield.length;
        i = 0;
_L10:
        AppStatsDaoField appstatsdaofield;
        ErrorLog.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = ErrorLog.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 7: default 92
    //                   1 137
    //                   2 154
    //                   3 165
    //                   4 176
    //                   5 187
    //                   6 198
    //                   7 209;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_209;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        errorlog.setID(appstatsdaofield.getDsValueString());
_L11:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        errorlog.setEnvironmentID(appstatsdaofield.getDsValueString());
          goto _L11
_L4:
        errorlog.setErrorTime(appstatsdaofield.getDsValueLong());
          goto _L11
_L5:
        errorlog.setErrorCode(appstatsdaofield.getDsValueInt());
          goto _L11
_L6:
        errorlog.setDescription(appstatsdaofield.getDsValueString());
          goto _L11
_L7:
        errorlog.setRecommendation(appstatsdaofield.getDsValueString());
          goto _L11
        errorlog.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L11
        return errorlog;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("ErrorLog", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                ErrorLog errorlog = (ErrorLog)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, errorlog.getID()));
                daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, errorlog.getEnvironmentID()));
                daoFields.add(new AppStatsDaoField("ErrorTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(errorlog.getErrorTime().longValue())));
                daoFields.add(new AppStatsDaoField("ErrorCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, errorlog.getErrorCode()));
                daoFields.add(new AppStatsDaoField("Description", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, errorlog.getDescription()));
                daoFields.add(new AppStatsDaoField("Recommendation", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, errorlog.getRecommendation()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, errorlog.getSessionKey()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: errorLogDao cannot be null");
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
            throw new NullPointerException("dsUpdate: errorLogDao cannot be null");
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
            e = a.getErrorLogDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ErrorLog.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ErrorLog.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[ErrorLog.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ErrorLog.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ErrorLog.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ErrorLog.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ErrorLog.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ErrorLog.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
