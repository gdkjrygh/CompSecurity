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
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsPropertyType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, PropertyChangeEvent, PropertyChangeEventDao, DaoSession

public class AppStatsGreenDaoPropertyChangeEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoPropertyChangeEvent";
    private static final String d = "PropertyChangeEvent";
    private static PropertyChangeEventDao e = null;

    public AppStatsGreenDaoPropertyChangeEvent()
    {
    }

    protected PropertyChangeEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        PropertyChangeEvent propertychangeevent;
        int i;
        int j;
        propertychangeevent = new PropertyChangeEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L9:
        AppStatsDaoField appstatsdaofield;
        PropertyChangeEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = PropertyChangeEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
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
        propertychangeevent.setID(appstatsdaofield.getDsValueString());
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        propertychangeevent.setInstanceID(appstatsdaofield.getDsValueString());
          goto _L10
_L4:
        propertychangeevent.setEventTime(appstatsdaofield.getDsValueLong());
          goto _L10
_L5:
        propertychangeevent.setPropertyType(appstatsdaofield.getDsValueInt());
          goto _L10
_L6:
        propertychangeevent.setPropertyValue(appstatsdaofield.getDsValueString());
          goto _L10
        propertychangeevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L10
        return propertychangeevent;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("PropertyChangeEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                PropertyChangeEvent propertychangeevent = (PropertyChangeEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, propertychangeevent.getID()));
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, propertychangeevent.getInstanceID()));
                daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(propertychangeevent.getEventTime().longValue())));
                AppStatsPropertyType appstatspropertytype = AppStatsPropertyType.values()[propertychangeevent.getPropertyType().intValue()];
                daoFields.add(new AppStatsDaoField("PropertyType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, appstatspropertytype.getPropTypeDescrip()));
                daoFields.add(new AppStatsDaoField("PropertyValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, propertychangeevent.getPropertyValue()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, propertychangeevent.getSessionKey()));
            }

        }

    }

    public void dsInsert(AppStatsDaoField aappstatsdaofield[])
    {
        initializeGreenDaoObjects(e);
        if (e == null)
        {
            throw new NullPointerException("dsInsert: propertyChangeEventDao cannot be null");
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
            throw new NullPointerException("dsUpdate: propertyChangeEventDao cannot be null");
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
            e = a.getPropertyChangeEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[PropertyChangeEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.PropertyChangeEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[PropertyChangeEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.PropertyChangeEvent.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[PropertyChangeEvent.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.PropertyChangeEvent.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[PropertyChangeEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
