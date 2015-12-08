// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoFieldChangedEvent;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class FieldEventDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "FieldEventDao";
    private static AppStatsGreenDaoFieldChangedEvent j = null;
    private static Integer k = null;
    private static Integer l = Integer.valueOf(0);
    private String b;
    private String c;
    private long d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;

    public FieldEventDao()
    {
        b = new String();
        d = 0L;
        g = new String();
        b = super.generateNewUniqueID();
    }

    private int c()
    {
        return h;
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

    public FieldEventDao clone()
    {
        return (FieldEventDao)super.clone();
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        FieldEventDao fieldeventdao = new FieldEventDao();
        fieldeventdao.b = UUID.randomUUID().toString();
        fieldeventdao.c = UUID.randomUUID().toString();
        fieldeventdao.d = d;
        fieldeventdao.e = "Here is an original value";
        fieldeventdao.f = "Here is a changed value";
        fieldeventdao.g = "Sample Fieldname";
        fieldeventdao.h = 1;
        fieldeventdao.i = "Sample error description";
        return fieldeventdao;
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

    public String getChangedValue()
    {
        return f;
    }

    public String getDocumentID()
    {
        return c;
    }

    public String getErrorDescription()
    {
        return i;
    }

    public long getEventTime()
    {
        return d;
    }

    public String getFieldname()
    {
        return g;
    }

    public String getId()
    {
        return b;
    }

    public String getOriginalValue()
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

    public void setChangedValue(String s)
    {
        f = s;
    }

    public void setDocumentID(String s)
    {
        c = s;
    }

    public void setErrorDescription(String s)
    {
        i = s;
    }

    public void setEventTime(long l1)
    {
        d = l1;
    }

    public void setFieldname(String s)
    {
        g = s;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setIsValid(int i1)
    {
        h = i1;
    }

    public void setOriginalValue(String s)
    {
        e = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, getId()));
        daoFields.add(new AppStatsDaoField("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, getDocumentID()));
        daoFields.add(new AppStatsDaoField("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(getEventTime())));
        daoFields.add(new AppStatsDaoField("OriginalValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getOriginalValue()));
        daoFields.add(new AppStatsDaoField("ChangedValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getChangedValue()));
        daoFields.add(new AppStatsDaoField("FieldName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getFieldname()));
        daoFields.add(new AppStatsDaoField("IsValid", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(c())));
        daoFields.add(new AppStatsDaoField("ErrorDescription", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, getErrorDescription()));
        daoFields.add(new AppStatsDaoField("SessionEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, (String)null));
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
        j = new AppStatsGreenDaoFieldChangedEvent();
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
