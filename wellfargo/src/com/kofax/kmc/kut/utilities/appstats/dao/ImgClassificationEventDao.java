// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoClassifyEvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ImgClassificationEventDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "ImgClassificationEventDao";
    private static AppStatsGreenDaoClassifyEvent j = null;
    private static Integer k = null;
    private static Integer l = Integer.valueOf(0);
    private String b;
    private String c;
    private long d;
    private long e;
    private String f;
    private float g;
    private String h;
    private String i;

    public ImgClassificationEventDao()
    {
        b = new String();
        c = new String();
        d = 0L;
        e = 0L;
        f = new String();
        g = -5000F;
        h = null;
        i = null;
        b = super.generateNewUniqueID();
    }

    public static long countRows()
    {
        return j.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        j.dsExport(s, appstatsdsexporthandler);
    }

    public volatile AppStatsDao clone()
    {
        return clone();
    }

    public ImgClassificationEventDao clone()
    {
        return (ImgClassificationEventDao)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ImgClassificationEventDao imgclassificationeventdao = new ImgClassificationEventDao();
        imgclassificationeventdao.b = UUID.randomUUID().toString();
        imgclassificationeventdao.c = UUID.randomUUID().toString();
        imgclassificationeventdao.d = d;
        imgclassificationeventdao.e = e;
        imgclassificationeventdao.f = new String(f.getBytes());
        imgclassificationeventdao.g = g;
        imgclassificationeventdao.h = UUID.randomUUID().toString();
        return imgclassificationeventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = k;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = l;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public float getClassificationConfidence()
    {
        return g;
    }

    public String getClassificationResult()
    {
        return f;
    }

    public String getId()
    {
        return b;
    }

    public String getImageID()
    {
        return h;
    }

    public String getInstanceId()
    {
        return c;
    }

    public String getSessionKey()
    {
        return i;
    }

    public long getStartTime()
    {
        return d;
    }

    public long getStopTime()
    {
        return e;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        k = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        l = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setClassificationConfidence(float f1)
    {
        g = f1;
    }

    public void setClassificationResult(String s)
    {
        f = s;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setImageID(String s)
    {
        h = s;
    }

    public void setInstanceId(String s)
    {
        c = s;
    }

    public void setSessionKey(String s)
    {
        i = s;
    }

    public void setStartTime(long l1)
    {
        d = l1;
    }

    public void setStopTime(long l1)
    {
        e = l1;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(d)));
        daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(e)));
        daoFields.add(new AppStatsDaoField("ClassificationResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, f));
        daoFields.add(new AppStatsDaoField("ClassificationConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Float.valueOf(g)));
        daoFields.add(new AppStatsDaoField("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, h));
        daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
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
        j = new AppStatsGreenDaoClassifyEvent();
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
