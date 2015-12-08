// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoCaptureEvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ImgCaptureEventDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "ImgCaptureEventDao";
    private static AppStatsGreenDaoCaptureEvent i = null;
    private static Integer j = null;
    private static Integer k = Integer.valueOf(0);
    private String b;
    private String c;
    private long d;
    private AppStatsEventIDType e;
    private int f;
    private String g;
    private String h;

    public ImgCaptureEventDao()
    {
        b = new String();
        c = new String();
        d = 0L;
        e = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        g = null;
        h = null;
        b = super.generateNewUniqueID();
    }

    public static long countRows()
    {
        return i.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        i.dsExport(s, appstatsdsexporthandler);
    }

    public volatile AppStatsDao clone()
    {
        return clone();
    }

    public ImgCaptureEventDao clone()
    {
        return (ImgCaptureEventDao)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ImgCaptureEventDao imgcaptureeventdao = new ImgCaptureEventDao();
        imgcaptureeventdao.b = UUID.randomUUID().toString();
        imgcaptureeventdao.c = UUID.randomUUID().toString();
        imgcaptureeventdao.d = d;
        imgcaptureeventdao.e = e;
        imgcaptureeventdao.g = UUID.randomUUID().toString();
        return imgcaptureeventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        return j;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
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

    public long getEventTime()
    {
        return d;
    }

    public AppStatsEventIDType getEventType()
    {
        return e;
    }

    public String getId()
    {
        return b;
    }

    public String getImageID()
    {
        return g;
    }

    public String getInstanceId()
    {
        return c;
    }

    public String getSessionKey()
    {
        return h;
    }

    public int getValue()
    {
        return f;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        j = integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
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

    public void setEventTime(long l)
    {
        d = l;
    }

    public void setEventType(AppStatsEventIDType appstatseventidtype)
    {
        e = appstatseventidtype;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setImageID(String s)
    {
        g = s;
    }

    public void setInstanceId(String s)
    {
        c = s;
    }

    public void setSessionKey(String s)
    {
        h = s;
    }

    public void setValue(int l)
    {
        f = l;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(d)));
        daoFields.add(new AppStatsDaoField("EventType", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(e.ordinal())));
        daoFields.add(new AppStatsDaoField("Value", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(getValue())));
        daoFields.add(new AppStatsDaoField("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, g));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, h));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            i.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            i.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        i = new AppStatsGreenDaoCaptureEvent();
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
