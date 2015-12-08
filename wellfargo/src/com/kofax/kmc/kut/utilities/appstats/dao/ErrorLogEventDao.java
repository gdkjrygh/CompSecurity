// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoErrorLog;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class ErrorLogEventDao extends AppStatsDao
{

    private static final String a = "ErrorLogEventDao";
    private static AppStatsGreenDaoErrorLog i = null;
    private static Integer j = null;
    private static Integer k = Integer.valueOf(0);
    private String b;
    private String c;
    private long d;
    private int e;
    private String f;
    private String g;
    private String h;

    public ErrorLogEventDao()
    {
        b = new String();
        c = new String();
        d = 0L;
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

    protected AppStatsDao createDaoSampleSizingObj()
    {
        ErrorLogEventDao errorlogeventdao = new ErrorLogEventDao();
        errorlogeventdao.b = UUID.randomUUID().toString();
        errorlogeventdao.c = UUID.randomUUID().toString();
        errorlogeventdao.d = d;
        errorlogeventdao.e = e;
        errorlogeventdao.f = new String(f.getBytes());
        errorlogeventdao.g = new String(g.getBytes());
        return errorlogeventdao;
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

    public String getEnvironmentId()
    {
        return c;
    }

    public int getErrorCode()
    {
        return e;
    }

    public String getErrorDescription()
    {
        return f;
    }

    public String getErrorRecommendation()
    {
        return g;
    }

    public long getErrorTime()
    {
        return d;
    }

    public String getId()
    {
        return b;
    }

    public String getSessionKey()
    {
        return h;
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

    public void setEnvironmentId(String s)
    {
        c = s;
    }

    public void setErrorCode(int l)
    {
        e = l;
    }

    public void setErrorDescription(String s)
    {
        f = s;
    }

    public void setErrorRecommendation(String s)
    {
        g = s;
    }

    public void setErrorTime(long l)
    {
        d = l;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setSessionKey(String s)
    {
        h = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("ErrorTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(d)));
        daoFields.add(new AppStatsDaoField("ErrorCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(e)));
        daoFields.add(new AppStatsDaoField("Description", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, f));
        daoFields.add(new AppStatsDaoField("Recommendation", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, g));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, h));
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
        i = new AppStatsGreenDaoErrorLog();
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
