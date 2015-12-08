// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoImageProcessorEvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ImageProcessEventDao extends AppStatsDao
    implements Cloneable
{

    private static AppStatsGreenDaoImageProcessorEvent j = null;
    private static Integer k = null;
    private static Integer l = Integer.valueOf(0);
    String a;
    int b;
    String c;
    String d;
    String e;
    private String f;
    private long g;
    private long h;
    private String i;

    public ImageProcessEventDao()
    {
        a = new String();
        f = new String();
        c = new String();
        d = new String();
        e = new String();
        i = null;
        a = super.generateNewUniqueID();
    }

    public static long countRows()
    {
        return j.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        j.dsExport(s, appstatsdsexporthandler);
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ImageProcessEventDao imageprocesseventdao = new ImageProcessEventDao();
        imageprocesseventdao.a = UUID.randomUUID().toString();
        imageprocesseventdao.f = UUID.randomUUID().toString();
        imageprocesseventdao.g = g;
        imageprocesseventdao.h = h;
        imageprocesseventdao.e = e;
        imageprocesseventdao.d = d;
        imageprocesseventdao.c = c;
        imageprocesseventdao.b = b;
        return imageprocesseventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        return k;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        return l;
    }

    public long getEndTime()
    {
        return h;
    }

    public String getId()
    {
        return a;
    }

    public String getInstanceId()
    {
        return f;
    }

    public String getProcessedImage()
    {
        return e;
    }

    public String getProcessingProfile()
    {
        return c;
    }

    public int getResultCode()
    {
        return b;
    }

    public String getSessionKey()
    {
        return i;
    }

    public String getSourceImage()
    {
        return d;
    }

    public long getStartTime()
    {
        return g;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        k = integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        l = integer;
    }

    public void setEndTime(long l1)
    {
        h = l1;
    }

    public void setId(String s)
    {
        a = s;
    }

    public void setInstanceId(String s)
    {
        f = s;
    }

    public void setProcessedImage(String s)
    {
        e = s;
    }

    public void setProcessingProfile(String s)
    {
        c = s;
    }

    public void setResultCode(int i1)
    {
        b = i1;
    }

    public void setSessionKey(String s)
    {
        i = s;
    }

    public void setSourceImage(String s)
    {
        d = s;
    }

    public void setStartTime(long l1)
    {
        g = l1;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, getId()));
        daoFields.add(new AppStatsDaoField("InstanceId", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, getInstanceId()));
        daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(getStartTime())));
        daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(getEndTime())));
        daoFields.add(new AppStatsDaoField("ResultCode", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(getResultCode())));
        daoFields.add(new AppStatsDaoField("ProcessingProfile", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getProcessingProfile()));
        daoFields.add(new AppStatsDaoField("SourceImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getSourceImage()));
        daoFields.add(new AppStatsDaoField("ProcessedImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getProcessedImage()));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, i));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            j.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            j.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        j = new AppStatsGreenDaoImageProcessorEvent();
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[AppStatsDsOpType.values().length];
            try
            {
                a[AppStatsDsOpType.APP_STATS_DS_INSERT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AppStatsDsOpType.APP_STATS_DS_UPDATE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
