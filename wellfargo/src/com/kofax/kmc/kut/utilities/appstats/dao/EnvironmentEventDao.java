// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsEnvSettings;
import com.kofax.kmc.kut.utilities.appstats.greendao.AppStatsGreenDaoEnvironment;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats.dao:
//            AppStatsDao, EnvironmentOrmCommon

public class EnvironmentEventDao extends AppStatsDao
{

    private static final String a = "EnvironmentChangedEventDao";
    private static AppStatsGreenDaoEnvironment n = null;
    private static Integer o = null;
    private static Integer p = Integer.valueOf(0);
    private String b;
    private long c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;

    public EnvironmentEventDao()
    {
        b = "";
        c = 0L;
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        b = super.generateNewUniqueID();
    }

    public EnvironmentEventDao(AppStatsEnvSettings appstatsenvsettings, long l1)
    {
        b = "";
        c = 0L;
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        b = super.generateNewUniqueID();
        c = l1;
        d = appstatsenvsettings.getEnvDeviceID(false);
        e = appstatsenvsettings.getEnvManufacturer(false);
        f = appstatsenvsettings.getEnvModel(false);
        g = appstatsenvsettings.getEnvMemorySize(false);
        h = appstatsenvsettings.getEnvOsVersion(false);
        i = appstatsenvsettings.getEnvLanguage(false);
        j = appstatsenvsettings.getEnvSdkVersion(false);
        k = appstatsenvsettings.getEnvTimeZone(false);
        l = appstatsenvsettings.getEnvCarrier(false);
        m = appstatsenvsettings.getEnvOsName(false);
    }

    public static long countRows()
    {
        return n.dsCountRows();
    }

    public static void export(String s, AppStatsDsExportHandler appstatsdsexporthandler)
    {
        n.dsExport(s, appstatsdsexporthandler);
    }

    public static List listRows(Integer integer)
    {
        Object obj = n.dsList(integer);
        integer = new ArrayList();
        EnvironmentEventDao environmenteventdao;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); integer.add(environmenteventdao))
        {
            EnvironmentOrmCommon environmentormcommon = (EnvironmentOrmCommon)((Iterator) (obj)).next();
            environmenteventdao = new EnvironmentEventDao();
            environmenteventdao.setEnvTime(environmentormcommon.getEnvTime().longValue());
            environmenteventdao.setId(environmentormcommon.getID());
            environmenteventdao.setDeviceID(environmentormcommon.getDeviceID());
            environmenteventdao.setManufacturer(environmentormcommon.getManufacturer());
            environmenteventdao.setModel(environmentormcommon.getModel());
            environmenteventdao.setMemory(environmentormcommon.getMemory());
            environmenteventdao.setOsVersion(environmentormcommon.getOSVersion());
            environmenteventdao.setLanguage(environmentormcommon.getLanguage());
            environmenteventdao.setSdkVersion(environmentormcommon.getSDKVersion());
            environmenteventdao.setTimeZone(environmentormcommon.getTimeZone());
            environmenteventdao.setCarrier(environmentormcommon.getCarrier());
            environmenteventdao.setOsName(environmentormcommon.getOSName());
        }

        return integer;
    }

    protected AppStatsDao createDaoSampleSizingObj()
    {
        EnvironmentEventDao environmenteventdao = new EnvironmentEventDao();
        environmenteventdao.b = UUID.randomUUID().toString();
        environmenteventdao.c = c;
        environmenteventdao.d = UUID.randomUUID().toString();
        environmenteventdao.e = new String(e.getBytes());
        environmenteventdao.f = new String(f.getBytes());
        environmenteventdao.g = new String(g.getBytes());
        environmenteventdao.h = new String(h.getBytes());
        environmenteventdao.i = new String(i.getBytes());
        environmenteventdao.j = new String(j.getBytes());
        environmenteventdao.k = new String(k.getBytes());
        environmenteventdao.l = new String(l.getBytes());
        environmenteventdao.m = new String(m.getBytes());
        return environmenteventdao;
    }

    protected Integer getAppStatsDaoObjSize()
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = o;
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
        Integer integer = p;
        this;
        JVM INSTR monitorexit ;
        return integer;
        Exception exception;
        exception;
        throw exception;
    }

    public String getCarrier()
    {
        return l;
    }

    public String getDeviceID()
    {
        return d;
    }

    public long getEnvTime()
    {
        return c;
    }

    public String getId()
    {
        return b;
    }

    public String getLanguage()
    {
        return i;
    }

    public String getManufacturer()
    {
        return e;
    }

    public String getMemory()
    {
        return g;
    }

    public String getModel()
    {
        return f;
    }

    public String getOsName()
    {
        return m;
    }

    public String getOsVersion()
    {
        return h;
    }

    public String getSdkVersion()
    {
        return j;
    }

    public String getTimeZone()
    {
        return k;
    }

    protected void setAppStatsDaoObjSize(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        o = integer;
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
        p = integer;
        this;
        JVM INSTR monitorexit ;
        return;
        integer;
        throw integer;
    }

    public void setCarrier(String s)
    {
        l = s;
    }

    public void setDeviceID(String s)
    {
        d = s;
    }

    public void setEnvTime(long l1)
    {
        c = l1;
    }

    public void setId(String s)
    {
        b = s;
    }

    public void setLanguage(String s)
    {
        i = s;
    }

    public void setManufacturer(String s)
    {
        e = s;
    }

    public void setMemory(String s)
    {
        g = s;
    }

    public void setModel(String s)
    {
        f = s;
    }

    public void setOsName(String s)
    {
        m = s;
    }

    public void setOsVersion(String s)
    {
        h = s;
    }

    public void setSdkVersion(String s)
    {
        j = s;
    }

    public void setTimeZone(String s)
    {
        k = s;
    }

    public void writeToDb()
    {
        daoFields.add(new AppStatsDaoField("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY, b));
        daoFields.add(new AppStatsDaoField("EnvTime", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_NONE, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, Long.valueOf(c)));
        daoFields.add(new AppStatsDaoField("DeviceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY, d));
        daoFields.add(new AppStatsDaoField("Manufacturer", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, e));
        daoFields.add(new AppStatsDaoField("Model", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, f));
        daoFields.add(new AppStatsDaoField("Memory", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, g));
        daoFields.add(new AppStatsDaoField("OSVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, h));
        daoFields.add(new AppStatsDaoField("Language", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, i));
        daoFields.add(new AppStatsDaoField("SDKVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, j));
        daoFields.add(new AppStatsDaoField("TimeZone", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, k));
        daoFields.add(new AppStatsDaoField("Carrier", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, l));
        daoFields.add(new AppStatsDaoField("OSName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY, m));
        switch (_cls1.a[dsOperation.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("writeToDb(): unsupported db operation type - ").append(dsOperation.toString()).toString());

        case 1: // '\001'
            n.dsInsert((AppStatsDaoField[])daoFields.toArray(new AppStatsDaoField[daoFields.size()]));
            break;
        }
    }

    static 
    {
        n = new AppStatsGreenDaoEnvironment();
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
