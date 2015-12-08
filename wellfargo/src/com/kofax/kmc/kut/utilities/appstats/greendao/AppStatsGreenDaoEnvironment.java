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
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, Environment, EnvironmentDao, DaoSession

public class AppStatsGreenDaoEnvironment extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoEnvironment";
    private static final String d = "Environment";
    private static EnvironmentDao e = null;

    public AppStatsGreenDaoEnvironment()
    {
    }

    protected Environment createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        Environment environment;
        int i;
        int j;
        environment = new Environment();
        j = aappstatsdaofield.length;
        i = 0;
_L15:
        AppStatsDaoField appstatsdaofield;
        Environment.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = Environment.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 12: default 112
    //                   1 157
    //                   2 174
    //                   3 185
    //                   4 196
    //                   5 207
    //                   6 218
    //                   7 229
    //                   8 240
    //                   9 251
    //                   10 262
    //                   11 273
    //                   12 284;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L13:
        break MISSING_BLOCK_LABEL_284;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        environment.setID(appstatsdaofield.getDsValueString());
_L16:
        i++;
        if (true) goto _L15; else goto _L14
_L14:
        environment.setEnvTime(appstatsdaofield.getDsValueLong());
          goto _L16
_L4:
        environment.setDeviceID(appstatsdaofield.getDsValueString());
          goto _L16
_L5:
        environment.setManufacturer(appstatsdaofield.getDsValueString());
          goto _L16
_L6:
        environment.setModel(appstatsdaofield.getDsValueString());
          goto _L16
_L7:
        environment.setMemory(appstatsdaofield.getDsValueString());
          goto _L16
_L8:
        environment.setOSVersion(appstatsdaofield.getDsValueString());
          goto _L16
_L9:
        environment.setLanguage(appstatsdaofield.getDsValueString());
          goto _L16
_L10:
        environment.setSDKVersion(appstatsdaofield.getDsValueString());
          goto _L16
_L11:
        environment.setTimeZone(appstatsdaofield.getDsValueString());
          goto _L16
_L12:
        environment.setCarrier(appstatsdaofield.getDsValueString());
          goto _L16
        environment.setOSName(appstatsdaofield.getDsValueString());
          goto _L16
        return environment;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("Environment", (AppStatsDaoField[])(AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                Environment environment = (Environment)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, environment.getID()));
                daoFields.add(new AppStatsDaoField("DeviceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getDeviceID()));
                daoFields.add(new AppStatsDaoField("Manufacturer", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getManufacturer()));
                daoFields.add(new AppStatsDaoField("Model", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getModel()));
                daoFields.add(new AppStatsDaoField("Memory", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getMemory()));
                daoFields.add(new AppStatsDaoField("OSVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getOSVersion()));
                daoFields.add(new AppStatsDaoField("Language", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getLanguage()));
                daoFields.add(new AppStatsDaoField("SDKVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getSDKVersion()));
                daoFields.add(new AppStatsDaoField("TimeZone", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getTimeZone()));
                daoFields.add(new AppStatsDaoField("Carrier", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getCarrier()));
                daoFields.add(new AppStatsDaoField("OSName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, environment.getOSName()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: environmentDao cannot be null");
        } else
        {
            aappstatsdaofield = createGreenDaoOrmTblObject(aappstatsdaofield);
            e.insert(aappstatsdaofield);
            return;
        }
    }

    public List dsList(Integer integer)
    {
        initializeGreenDaoObjects(e);
        g g1 = e.queryBuilder();
        if (integer != null)
        {
            g1.a(integer.intValue());
        }
        return g1.a(new a.a.a.g[] {
            EnvironmentDao.Properties.EnvTime
        }).c();
    }

    public void dsUpdate(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsUpdate: environmentDao cannot be null");
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
            e = a.getEnvironmentDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Environment.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Environment.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                a[Environment.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Environment.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[Environment.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Environment.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[Environment.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Environment.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Environment.a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[Environment.a.i.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Environment.a.j.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[Environment.a.k.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Environment.a.l.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
