// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoInstance;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao

public class EventInstanceDao extends AppStatsDao
    implements Cloneable
{

    private static final String a = "EventInstanceDao";
    private static AppStatsGreenDaoInstance h = null;
    private static Integer i = null;
    private static Integer j = Integer.valueOf(0);
    private String b;
    private String c;
    private long d;
    private long e;
    private AppStatsInstanceType f;
    private String g;

    public EventInstanceDao()
    {
        b = new String();
        c = new String();
        d = 0L;
        e = 0L;
        f = AppStatsInstanceType.INST_TYPE_UNUSED;
        g = null;
    }

    public static long countRows()
    {
        return h.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        h.dsExport(s, appstatsdsexporthandler);
    }

    public volatile AppStatsDao clone()
    {
        return clone();
    }

    public EventInstanceDao clone()
    {
        EventInstanceDao eventinstancedao = (EventInstanceDao)super.clone();
        eventinstancedao.f = f;
        return eventinstancedao;
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        EventInstanceDao eventinstancedao = new EventInstanceDao();
        eventinstancedao.b = UUID.randomUUID().toString();
        eventinstancedao.c = UUID.randomUUID().toString();
        eventinstancedao.d = d;
        eventinstancedao.e = e;
        eventinstancedao.f = f;
        return eventinstancedao;
    }

    protected Integer getAppStatsDaoObjSize()
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

    protected Integer getAppStatsDaoObjSizeInstCnt()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = j;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public long getCreationTime()
    {
        return d;
    }

    public long getDismissalTime()
    {
        return e;
    }

    public String getEnvironmentId()
    {
        return c;
    }

    public String getInstanceId()
    {
        return b;
    }

    public AppStatsInstanceType getInstanceType()
    {
        return f;
    }

    public String getSessionKey()
    {
        return g;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
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

    protected void setAppStatsDaoObjSizeInstCnt(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        j = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setCreationTime(long l)
    {
        d = l;
    }

    public void setDismissalTime(long l)
    {
        e = l;
    }

    public void setEnvironmentId(String s)
    {
        c = s;
    }

    public void setInstanceId(String s)
    {
        b = s;
    }

    public void setInstanceType(AppStatsInstanceType appstatsinstancetype)
    {
        f = appstatsinstancetype;
    }

    public void setSessionKey(String s)
    {
        g = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, c));
        daoFields.add(new AppStatsDaoField("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(d)));
        daoFields.add(new AppStatsDaoField("DismissalTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(e)));
        daoFields.add(new AppStatsDaoField("InstanceType", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Integer.valueOf(f.ordinal())));
        daoFields.add(new AppStatsDaoField("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, g));
        switch (_cls1.a[getDsOperation().ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(getDsOperation().toString()).toString());

        case 1: // '\001'
            h.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            return;

        case 2: // '\002'
            h.dsUpdate((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        h = new AppStatsGreenDaoInstance();
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
