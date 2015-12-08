// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoDocument;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class DocumentEventDao extends AppStatsDao
{

    private static final String a = "DocumentEventDao";
    private static AppStatsGreenDaoDocument g = null;
    private static Integer h = null;
    private static Integer i = Integer.valueOf(0);
    private String b;
    private String c;
    private Long d;
    private String e;
    private String f;

    public DocumentEventDao()
    {
        b = new String();
        c = new String();
        d = null;
        e = null;
        f = null;
    }

    public static long countRows()
    {
        return g.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        g.dsExport(s, appstatsdsexporthandler);
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        DocumentEventDao documenteventdao = new DocumentEventDao();
        documenteventdao.b = UUID.randomUUID().toString();
        documenteventdao.c = UUID.randomUUID().toString();
        documenteventdao.e = new String(e.getBytes());
        documenteventdao.f = new String(f.getBytes());
        documenteventdao.d = d;
        return documenteventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        return h;
    }

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = i;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public Long getCreationTime()
    {
        return d;
    }

    public String getDocumentType()
    {
        return f;
    }

    public String getEnvironmentId()
    {
        return c;
    }

    public String getId()
    {
        return b;
    }

    public String getSessionKey()
    {
        return e;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        h = integer;
    }

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        i = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setCreationTime(Long long1)
    {
        d = long1;
    }

    public void setDocumentType(String s)
    {
        f = s;
    }

    public void setEnvironmentId(String s)
    {
        c = s;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setSessionKey(String s)
    {
        e = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, d));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, e));
        daoFields.add(new AppStatsDaoField("DocumentType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, f));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            g.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        g = new AppStatsGreenDaoDocument();
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
