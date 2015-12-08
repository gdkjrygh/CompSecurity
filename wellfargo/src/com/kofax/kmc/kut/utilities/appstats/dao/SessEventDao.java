// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoSessionEvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class SessEventDao extends AppStatsDao
{

    private static final String a = "SessEventDao";
    private static AppStatsGreenDaoSessionEvent i = null;
    private static Integer j = null;
    private static Integer k = Integer.valueOf(0);
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Long g;
    private String h;

    public SessEventDao()
    {
        b = new String();
        c = new String();
        d = null;
        e = "";
        g = null;
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

    protected AppStatsDao createDaoSampleSizingObj()
    {
        SessEventDao sesseventdao = new SessEventDao();
        sesseventdao.b = UUID.randomUUID().toString();
        sesseventdao.c = UUID.randomUUID().toString();
        sesseventdao.d = new String(d.getBytes());
        sesseventdao.g = g;
        sesseventdao.f = new String(f.getBytes());
        sesseventdao.h = new String(h.getBytes());
        return sesseventdao;
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

    public String getCategory()
    {
        return e;
    }

    public String getEnvironmentId()
    {
        return c;
    }

    public Long getEventTime()
    {
        return g;
    }

    public String getId()
    {
        return b;
    }

    public String getResponse()
    {
        return h;
    }

    public String getSessionKey()
    {
        return d;
    }

    public String getType()
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

    public void setCategory(String s)
    {
        e = s;
    }

    public void setEnvironmentId(String s)
    {
        c = s;
    }

    public void setEventTime(Long long1)
    {
        g = long1;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setResponse(String s)
    {
        h = s;
    }

    public void setSessionKey(String s)
    {
        d = s;
    }

    public void setType(String s)
    {
        f = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, d));
        daoFields.add(new AppStatsDaoField("Category", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, e));
        daoFields.add(new AppStatsDaoField("Type", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, f));
        daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, g));
        daoFields.add(new AppStatsDaoField("Response", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, h));
        daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            i.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        i = new AppStatsGreenDaoSessionEvent();
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
            catch (NoSuchFieldError nosuchfielderror) { }
        }
    }

}
