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
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.greendao:
//            AppStatsGreenDao, CaptureEvent, CaptureEventDao, DaoSession

public class AppStatsGreenDaoCaptureEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoImageCaptureEvent";
    private static final String d = "CaptureEvent";
    private static CaptureEventDao e = null;

    public AppStatsGreenDaoCaptureEvent()
    {
    }

    protected CaptureEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        CaptureEvent captureevent;
        int i;
        int j;
        captureevent = new CaptureEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L10:
        AppStatsDaoField appstatsdaofield;
        CaptureEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = CaptureEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
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
        captureevent.setID(appstatsdaofield.getDsValueString());
_L11:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
        captureevent.setInstanceID(appstatsdaofield.getDsValueString());
          goto _L11
_L4:
        captureevent.setEventTime(appstatsdaofield.getDsValueLong());
          goto _L11
_L5:
        captureevent.setEventType(appstatsdaofield.getDsValueInt());
          goto _L11
_L6:
        captureevent.setValue(appstatsdaofield.getDsValueInt());
          goto _L11
_L7:
        captureevent.setImageID(appstatsdaofield.getDsValueString());
          goto _L11
        captureevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L11
        return captureevent;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("CaptureEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                CaptureEvent captureevent = (CaptureEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, captureevent.getID()));
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, captureevent.getInstanceID()));
                daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(captureevent.getEventTime().longValue())));
                AppStatsEventIDType appstatseventidtype = AppStatsEventIDType.values()[captureevent.getEventType().intValue()];
                Log.i("AppStatsGreenDaoImageCaptureEvent", (new StringBuilder()).append("Event Type = ").append(appstatseventidtype.getEventTypeDescription()).toString());
                daoFields.add(new AppStatsDaoField("EventType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, appstatseventidtype.getEventTypeDescription()));
                daoFields.add(new AppStatsDaoField("Value", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, captureevent.getValue()));
                daoFields.add(new AppStatsDaoField("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, captureevent.getImageID()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, captureevent.getSessionKey()));
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
            e = a.getCaptureEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[CaptureEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.CaptureEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[CaptureEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.CaptureEvent.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[CaptureEvent.a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.CaptureEvent.a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[CaptureEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.CaptureEvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
