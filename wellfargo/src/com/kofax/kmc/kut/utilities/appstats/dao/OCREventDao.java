// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoOCREvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsOCRType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class OCREventDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "OCREventDao";
    private static AppStatsGreenDaoOCREvent k = null;
    private static Integer l = null;
    private static Integer m = Integer.valueOf(0);
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;
    private AppStatsOCRType g;
    private int h;
    private String i;
    private int j;

    public OCREventDao()
    {
        b = new String();
        c = new String();
        d = null;
        e = 0L;
        f = 0L;
        g = AppStatsOCRType.OCR_FULLPAGE;
        i = null;
        j = 0;
        b = super.generateNewUniqueID();
    }

    public static long countRows()
    {
        return k.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        k.dsExport(s, appstatsdsexporthandler);
    }

    public volatile AppStatsDao clone()
    {
        return clone();
    }

    public OCREventDao clone()
    {
        return (OCREventDao)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        OCREventDao ocreventdao = new OCREventDao();
        ocreventdao.b = UUID.randomUUID().toString();
        ocreventdao.c = UUID.randomUUID().toString();
        ocreventdao.d = UUID.randomUUID().toString();
        ocreventdao.e = e;
        ocreventdao.f = f;
        ocreventdao.i = UUID.randomUUID().toString();
        ocreventdao.j = j;
        ocreventdao.g = g;
        return ocreventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        return l;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = m;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public AppStatsOCRType getEventType()
    {
        return g;
    }

    public String getId()
    {
        return b;
    }

    public String getImageID()
    {
        return i;
    }

    public String getInstanceId()
    {
        return c;
    }

    public int getResultCode()
    {
        return j;
    }

    public String getSessionKey()
    {
        return d;
    }

    public long getStartTime()
    {
        return e;
    }

    public long getStopTime()
    {
        return f;
    }

    public int getValue()
    {
        return h;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        l = integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        m = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setEventType(AppStatsOCRType appstatsocrtype)
    {
        g = appstatsocrtype;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setImageID(String s)
    {
        i = s;
    }

    public void setInstanceId(String s)
    {
        c = s;
    }

    public void setResultCode(int i1)
    {
        j = i1;
    }

    public void setSessionKey(String s)
    {
        d = s;
    }

    public void setStartTime(long l1)
    {
        e = l1;
    }

    public void setStopTime(long l1)
    {
        f = l1;
    }

    public void setValue(int i1)
    {
        h = i1;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(e)));
        daoFields.add(new AppStatsDaoField("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(f)));
        daoFields.add(new AppStatsDaoField("SourceImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, i));
        daoFields.add(new AppStatsDaoField("EventType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, g.getOCRDescription()));
        daoFields.add(new AppStatsDaoField("ResultCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(getResultCode())));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, d));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            k.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            k.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        k = new AppStatsGreenDaoOCREvent();
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
