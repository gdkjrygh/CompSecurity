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
//            AppStatsGreenDao, FieldChangeEvent, FieldChangeEventDao, DaoSession

public class AppStatsGreenDaoFieldChangedEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoFieldChangedEvent";
    private static final String d = "FieldChangeEvent";
    private static FieldChangeEventDao e = null;

    public AppStatsGreenDaoFieldChangedEvent()
    {
    }

    protected FieldChangeEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        FieldChangeEvent fieldchangeevent;
        int i;
        int j;
        fieldchangeevent = new FieldChangeEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L14:
        AppStatsDaoField appstatsdaofield;
        FieldChangeEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = FieldChangeEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
        com.kofax.kmc.kut.utilities.appstats.greendao._cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 11: default 108
    //                   1 153
    //                   2 170
    //                   3 181
    //                   4 192
    //                   5 203
    //                   6 214
    //                   7 225
    //                   8 236
    //                   9 247
    //                   10 258
    //                   11 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_269;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new TypeNotPresentException("daoField: unknown field name", new Throwable((new StringBuilder()).append("dataMember: ").append(a.name()).append(" specified by daoField does not exist").toString()));
_L2:
        fieldchangeevent.setID(appstatsdaofield.getDsValueString());
_L15:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        fieldchangeevent.setDocumentID(appstatsdaofield.getDsValueString());
          goto _L15
_L4:
        fieldchangeevent.setEventTime(appstatsdaofield.getDsValueLong());
          goto _L15
_L5:
        fieldchangeevent.setChangedValue(appstatsdaofield.getDsValueString());
          goto _L15
_L6:
        fieldchangeevent.setOriginalValue(appstatsdaofield.getDsValueString());
          goto _L15
_L7:
        fieldchangeevent.setFieldName(appstatsdaofield.getDsValueString());
          goto _L15
_L8:
        fieldchangeevent.setIsValid(appstatsdaofield.getDsValueInt());
          goto _L15
_L9:
        fieldchangeevent.setErrorDescription(appstatsdaofield.getDsValueString());
          goto _L15
_L10:
        fieldchangeevent.setSessionEventID(appstatsdaofield.getDsValueString());
          goto _L15
_L11:
        fieldchangeevent.setConfidence(appstatsdaofield.getDsValueFloat());
          goto _L15
        fieldchangeevent.setFormattingFailed(appstatsdaofield.getDsValueInt());
          goto _L15
        return fieldchangeevent;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("FieldChangeEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                FieldChangeEvent fieldchangeevent = (FieldChangeEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, fieldchangeevent.getID()));
                daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, fieldchangeevent.getDocumentID()));
                daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(fieldchangeevent.getEventTime().longValue())));
                daoFields.add(new AppStatsDaoField("OriginalValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getOriginalValue()));
                daoFields.add(new AppStatsDaoField("ChangedValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getChangedValue()));
                daoFields.add(new AppStatsDaoField("FieldName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getFieldName()));
                daoFields.add(new AppStatsDaoField("IsValid", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getIsValid()));
                daoFields.add(new AppStatsDaoField("ErrorDescription", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getErrorDescription()));
                daoFields.add(new AppStatsDaoField("SessionEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
                daoFields.add(new AppStatsDaoField("Confidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getConfidence()));
                daoFields.add(new AppStatsDaoField("FormattingFailed", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, fieldchangeevent.getFormattingFailed()));
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
            e = a.getFieldChangeEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[FieldChangeEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.FieldChangeEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[FieldChangeEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.FieldChangeEvent.a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.FieldChangeEvent.a.e.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[FieldChangeEvent.a.d.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[FieldChangeEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.FieldChangeEvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[FieldChangeEvent.a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[FieldChangeEvent.a.i.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[FieldChangeEvent.a.j.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[FieldChangeEvent.a.k.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
