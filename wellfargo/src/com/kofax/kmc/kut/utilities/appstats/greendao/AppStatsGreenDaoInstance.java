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
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, Instance, InstanceDao, DaoSession

public class AppStatsGreenDaoInstance extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoInstance";
    private static final String d = "Instance";
    private static InstanceDao e = null;

    public AppStatsGreenDaoInstance()
    {
    }

    protected Instance createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        Instance instance;
        int i;
        int j;
        instance = new Instance();
        j = aappstatsdaofield.length;
        i = 0;
_L9:
        AppStatsDaoField appstatsdaofield;
        Instance.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = Instance.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 6: default 88
    //                   1 133
    //                   2 150
    //                   3 161
    //                   4 172
    //                   5 183
    //                   6 194;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        instance.setInstanceID(appstatsdaofield.getDsValueString());
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        instance.setEnvironmentID(appstatsdaofield.getDsValueString());
          goto _L10
_L4:
        instance.setCreationTime(appstatsdaofield.getDsValueLong());
          goto _L10
_L5:
        instance.setDismissalTime(appstatsdaofield.getDsValueLong());
          goto _L10
_L6:
        instance.setInstanceType(appstatsdaofield.getDsValueInt());
          goto _L10
        instance.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L10
        return instance;
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
                Instance instance = (Instance)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, instance.getInstanceID()));
                daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, instance.getEnvironmentID()));
                AppStatsInstanceType appstatsinstancetype;
                if (instance.getCreationTime().longValue() == 0L)
                {
                    daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ""));
                } else
                {
                    daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(instance.getCreationTime().longValue())));
                }
                if (instance.getDismissalTime().longValue() == 0L)
                {
                    daoFields.add(new AppStatsDaoField("DismissalTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, ""));
                } else
                {
                    daoFields.add(new AppStatsDaoField("DismissalTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(instance.getDismissalTime().longValue())));
                }
                appstatsinstancetype = AppStatsInstanceType.values()[instance.getInstanceType().intValue()];
                daoFields.add(new AppStatsDaoField("InstanceType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, appstatsinstancetype.getInstTypeDescrip()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, instance.getSessionKey()));
                appstatsdsexporthandler.onExportAppStatsRowEvent("Instance", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            }
        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: instanceDao cannot be null");
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
            throw new NullPointerException("dsUpdate: instanceDao cannot be null");
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
            e = a.getInstanceDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[Instance.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Instance.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[Instance.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Instance.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[Instance.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.Instance.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Instance.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
