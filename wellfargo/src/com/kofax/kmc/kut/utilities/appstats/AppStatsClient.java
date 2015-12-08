// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EventInstanceDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatistics, AppStatsEnvSettings, AppStatsClientEventLogger

public abstract class AppStatsClient
{

    private static final String a = "AppStatsClient";
    protected static a appStatsClientStaticHelper = new a();
    private static EnvironmentEventDao b = null;
    protected AppStatistics appStats;
    protected AppStatistics.FriendAS asFriend;
    private String c;
    private boolean d;
    private boolean e;
    private EventInstanceDao f;
    private boolean g;
    private boolean h;
    private Map i;
    protected String instanceId;
    protected AppStatsInstanceType instanceType;
    private Map j;
    private AppStatsEventIDType k;

    public AppStatsClient()
    {
        appStats = AppStatistics.getInstance();
        instanceId = "";
        AppStatistics appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        c = "";
        d = false;
        e = true;
        f = null;
        g = false;
        h = false;
        i = new HashMap();
        j = new HashMap();
        k = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
    }

    public AppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        appStats = AppStatistics.getInstance();
        instanceId = "";
        AppStatistics appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        c = "";
        d = false;
        e = true;
        f = null;
        g = false;
        h = false;
        i = new HashMap();
        j = new HashMap();
        k = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        instanceType = appstatsinstancetype;
        instanceId = genInstanceId();
        c = appStatsClientStaticHelper.a();
        logAppStatsInstanceCreate();
    }

    public AppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        appStats = AppStatistics.getInstance();
        instanceId = "";
        AppStatistics appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        c = "";
        d = false;
        e = true;
        f = null;
        g = false;
        h = false;
        i = new HashMap();
        j = new HashMap();
        k = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        instanceId = s;
        e = false;
        c = appStatsClientStaticHelper.a();
        instanceType = appstatsinstancetype;
        d = flag;
        if (flag)
        {
            logAppStatsInstanceCreate();
            return;
        } else
        {
            g = true;
            h = true;
            return;
        }
    }

    static EnvironmentEventDao a(EnvironmentEventDao environmenteventdao)
    {
        b = environmenteventdao;
        return environmenteventdao;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (appStats.isRecording())
        {
            AppStatsEnvSettings appstatsenvsettings = new AppStatsEnvSettings(true);
            String s = appStats.getDeviceId();
            if (!s.isEmpty())
            {
                appstatsenvsettings.setEnvDeviceID(s);
            }
            if (b == null)
            {
                List list = EnvironmentEventDao.listRows(Integer.valueOf(1));
                if (!list.isEmpty())
                {
                    b = (EnvironmentEventDao)list.get(0);
                }
            }
            if (b != null && appstatsenvsettings.getEnvDeviceID(false).isEmpty())
            {
                appstatsenvsettings.setEnvDeviceID(b.getDeviceID());
            }
            if (b == null || !appstatsenvsettings.equals(new AppStatsEnvSettings(b)))
            {
                if (appstatsenvsettings.getEnvDeviceID(false).isEmpty())
                {
                    appstatsenvsettings.getEnvDeviceID(true);
                }
                b = new EnvironmentEventDao(appstatsenvsettings, asFriend.currentEventTime());
                asFriend.logAppStats(new AppStatsDao[] {
                    b
                });
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String genInstanceId()
    {
        return UUID.randomUUID().toString();
    }

    public void appStatsSessionCreate()
    {
        if (g)
        {
            logAppStatsInstanceDismiss();
        }
        g = false;
        instanceId = genInstanceId();
        logAppStatsInstanceCreate();
    }

    public void appStatsSessionCreate(String s)
    {
        instanceId = s;
    }

    public void appStatsSessionDismiss()
    {
        h = false;
        logAppStatsInstanceDismiss();
    }

    protected void finalize()
    {
        logAppStatsInstanceDismiss();
    }

    protected AppStatsEventIDType getEventId()
    {
        return k;
    }

    public String getInstanceId()
    {
        return instanceId;
    }

    protected ErrorInfo logAppStats(AppStatsDao aappstatsdao[])
    {
        if (appStatsClientStaticHelper.a(c))
        {
            if (e)
            {
                g = false;
                f = null;
                instanceId = genInstanceId();
                int j1 = aappstatsdao.length;
                for (int l = 0; l < j1; l++)
                {
                    AppStatsDao appstatsdao = aappstatsdao[l];
                    if (appstatsdao.getInstanceId() != null)
                    {
                        appstatsdao.setInstanceId(instanceId);
                    }
                }

            }
            c = appStatsClientStaticHelper.a();
        }
        int k1 = aappstatsdao.length;
        int i1 = 0;
        while (i1 < k1) 
        {
            AppStatsDao appstatsdao1 = aappstatsdao[i1];
            if (appstatsdao1.getInstanceId() != null)
            {
                logAppStatsInstanceCreate();
            } else
            if (appstatsdao1.getEnvironmentId() != null)
            {
                a();
                appstatsdao1.setEnvironmentId(b.getId());
            }
            i1++;
        }
        AppStatsEventIDType appstatseventidtype = getEventId();
        if (i.containsKey(appstatseventidtype))
        {
            long l1 = TimeUnit.NANOSECONDS.convert(((Integer)i.get(appstatseventidtype)).intValue(), TimeUnit.MILLISECONDS);
            long l2 = System.nanoTime();
            long l3 = TimeUnit.MILLISECONDS.convert(l1, TimeUnit.NANOSECONDS);
            long l4 = TimeUnit.MILLISECONDS.convert(l2, TimeUnit.NANOSECONDS);
            Long long1 = (Long)j.get(appstatseventidtype);
            if (long1 != null)
            {
                long l5 = TimeUnit.MILLISECONDS.convert(long1.longValue(), TimeUnit.NANOSECONDS);
                long l6 = TimeUnit.MILLISECONDS.convert(l2 - long1.longValue(), TimeUnit.NANOSECONDS);
                if (l2 - long1.longValue() < l1)
                {
                    Log.d("AppStatsClient", (new StringBuilder()).append(appstatseventidtype).append(" not logged...").append(" eventThrottleMs(").append(l3).append(") not elpased. (").append(l6).append(").").toString());
                    return ErrorInfo.KMC_UT_STATS_EVENT_THROTTLED;
                }
                Log.d("AppStatsClient", (new StringBuilder()).append(appstatseventidtype).append(" logged... eventThrottleMs(").append(l3).append(")").append("  currentTimeMs=").append(l4).append(", eventLastTimeMs=").append(l5).append(" elpased=").append(l6).toString());
            }
            j.put(appstatseventidtype, Long.valueOf(l2));
        }
        asFriend.logAppStats(aappstatsdao);
        return ErrorInfo.KMC_SUCCESS;
    }

    protected void logAppStatsInstanceCreate()
    {
        this;
        JVM INSTR monitorenter ;
        if (!g && appStats.isRecording())
        {
            a();
            f = new EventInstanceDao();
            f.setInstanceId(instanceId);
            f.setEnvironmentId(b.getId());
            f.setCreationTime(asFriend.currentEventTime());
            f.setInstanceType(instanceType);
            f.setSessionKey(f.getAppStatsSessionKey());
            f.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
            asFriend.logAppStats(new AppStatsDao[] {
                f
            });
            g = true;
            h = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void logAppStatsInstanceDismiss()
    {
        this;
        JVM INSTR monitorenter ;
        if (f != null && !h && appStats.isRecording())
        {
            f = f.clone();
            f.setDismissalTime(asFriend.currentEventTime());
            f.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
            asFriend.logAppStats(new AppStatsDao[] {
                f
            });
            h = true;
            g = false;
            f = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void logEventIfAppsStatsRecordingOn(AppStatsEventIDType appstatseventidtype, AppStatsClientEventLogger appstatsclienteventlogger)
    {
        if (appStats.isRecording())
        {
            appstatsclienteventlogger.logEvent(appstatseventidtype);
        }
    }

    protected void mapEventThrottleTime(AppStatsEventIDType appstatseventidtype, int l)
    {
        i.put(appstatseventidtype, Integer.valueOf(l));
    }

    protected void setEventId(AppStatsEventIDType appstatseventidtype)
    {
        k = appstatseventidtype;
    }


    private class a
        implements AppStatistics.DataStoreInitializedListener
    {

        private AppStatistics a;
        private AppStatistics.FriendAS b;
        private String c;

        protected String a()
        {
            return c;
        }

        protected boolean a(String s)
        {
            return !c.equals(s);
        }

        public void dataStoreInitialized(String s)
        {
            c = s;
            AppStatsClient.a(null);
        }

        public a()
        {
            a = AppStatistics.getInstance();
            AppStatistics appstatistics = a;
            appstatistics.getClass();
            b = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
            c = "";
            b.addDataStoreInitializedListener(this);
        }
    }

}
