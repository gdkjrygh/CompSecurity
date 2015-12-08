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
//            AppStatsGreenDao, ImageProcessorEvent, ImageProcessorEventDao, DaoSession

public class AppStatsGreenDaoImageProcessorEvent extends AppStatsGreenDao
{

    private static final String c = "AppStatsGreenDaoImageProcessor";
    private static final String d = "ImageProcessorEvent";
    private static ImageProcessorEventDao e = null;

    public AppStatsGreenDaoImageProcessorEvent()
    {
    }

    protected ImageProcessorEvent createGreenDaoOrmTblObject(AppStatsDaoField aappstatsdaofield[])
    {
        ImageProcessorEvent imageprocessorevent;
        int i;
        int j;
        imageprocessorevent = new ImageProcessorEvent();
        j = aappstatsdaofield.length;
        i = 0;
_L12:
        AppStatsDaoField appstatsdaofield;
        ImageProcessorEvent.a a;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        appstatsdaofield = aappstatsdaofield[i];
        a = ImageProcessorEvent.a.valueOf(appstatsdaofield.getDsFieldName().toUpperCase());
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
        imageprocessorevent.setID(appstatsdaofield.getDsValueString());
_L13:
        i++;
        if (true) goto _L12; else goto _L11
_L11:
        imageprocessorevent.setInstanceID(appstatsdaofield.getDsValueString());
          goto _L13
_L4:
        imageprocessorevent.setProcessedImageID(appstatsdaofield.getDsValueString());
          goto _L13
_L5:
        imageprocessorevent.setStartTime(appstatsdaofield.getDsValueLong());
          goto _L13
_L6:
        imageprocessorevent.setStopTime(appstatsdaofield.getDsValueLong());
          goto _L13
_L7:
        imageprocessorevent.setProcessingProfile(appstatsdaofield.getDsValueString());
          goto _L13
_L8:
        imageprocessorevent.setSourceImageID(appstatsdaofield.getDsValueString());
          goto _L13
_L9:
        imageprocessorevent.setResultCode(appstatsdaofield.getDsValueInt());
          goto _L13
        imageprocessorevent.setSessionKey(appstatsdaofield.getDsValueString());
          goto _L13
        return imageprocessorevent;
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
            for (Iterator iterator = s.a().c().iterator(); iterator.hasNext(); appstatsdsexporthandler.onExportAppStatsRowEvent("ImageProcessorEvent", (AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()])))
            {
                ImageProcessorEvent imageprocessorevent = (ImageProcessorEvent)iterator.next();
                daoFields.clear();
                daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, imageprocessorevent.getID()));
                daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, imageprocessorevent.getInstanceID()));
                daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(imageprocessorevent.getStopTime().longValue())));
                daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, new Date(imageprocessorevent.getStartTime().longValue())));
                daoFields.add(new AppStatsDaoField("ResultCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, imageprocessorevent.getResultCode()));
                daoFields.add(new AppStatsDaoField("ProcessingProfile", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, imageprocessorevent.getProcessingProfile()));
                daoFields.add(new AppStatsDaoField("SourceImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, imageprocessorevent.getSourceImageID()));
                daoFields.add(new AppStatsDaoField("ProcessedImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, imageprocessorevent.getProcessedImageID()));
                daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, imageprocessorevent.getSessionKey()));
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
            throw new NullPointerException("dsUpdate: imageProcessorEventDao cannot be null");
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
            e = a.getImageProcessorEventDao();
            countQuery = e.queryBuilder().b();
        }
        return flag;
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ImageProcessorEvent.a.values().length];
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ImageProcessorEvent.a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[ImageProcessorEvent.a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[ImageProcessorEvent.a.h.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ImageProcessorEvent.a.c.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[ImageProcessorEvent.a.d.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ImageProcessorEvent.a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ImageProcessorEvent.a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[com.kofax.kmc.kut.utilities.appstats.greendao.ImageProcessorEvent.a.e.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ImageProcessorEvent.a.i.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
