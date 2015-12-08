// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsWriteFileListener, AppStatistics, b, AppStatsState, 
//            AppStatsWritetoFileEvent, AppStatsDataStore, AppStatsExportListener, AppStatsExportEvent

public class sDaoCalcObjSize
    implements StatusCallback, AppStatsWriteFileListener, com.kofax.kmc.kut.utilities.appstats.dao.CalcObjSize
{

    final AppStatistics a;

    public void addAppStatsExportListener(AppStatsExportListener appstatsexportlistener, int i)
    {
        if (appstatsexportlistener == null)
        {
            throw new NullPointerException("addAppStatsExportListener: listener parameter is null");
        }
        if (!AppStatistics.n(a).contains(appstatsexportlistener))
        {
            AppStatistics.n(a).add(i, appstatsexportlistener);
        }
    }

    public void addDataStoreInitializedListener(InitializedListener initializedlistener)
    {
        if (initializedlistener == null)
        {
            throw new NullPointerException("addDataStoreInitializedListener: listener parameter is null");
        }
        if (!AppStatistics.m(a).contains(initializedlistener))
        {
            AppStatistics.m(a).add(initializedlistener);
        }
    }

    public long currentEventTime()
    {
        return System.currentTimeMillis();
    }

    public void daoCalcObjSizeResult(int i, String s)
    {
        synchronized (a)
        {
            if (AppStatistics.e(a).equals(s))
            {
                AppStatistics.a(a, i);
            }
        }
        AppStatistics.a(a, Type.THRESH_TYPE_RAM);
        return;
        s;
        appstatistics;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void dataStoreExportComplete(ErrorInfo errorinfo)
    {
        AppStatistics appstatistics = a;
        appstatistics;
        JVM INSTR monitorenter ;
        AppStatistics.a(a, "DataStoreExportComplete()", true);
        AppStatistics.a(a, AppStatistics.f(a));
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a, AppStatistics.f(a).b(b.h, AppStatistics.g(a).a));
_L2:
        AppStatistics.c(a, AppStatistics.h(a));
        AppStatistics.a(a, "DataStoreExportComplete()", false);
        return;
        com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a, AppStatistics.f(a).c(b.h, AppStatistics.g(a).a));
        if (true) goto _L2; else goto _L1
_L1:
        errorinfo;
        appstatistics;
        JVM INSTR monitorexit ;
        throw errorinfo;
    }

    public void fireExportStatusEvent(AppStatsExportEvent appstatsexportevent)
    {
        AppStatistics.a(a, appstatsexportevent);
    }

    public AppStatsDataStore getAppStatsDataStore()
    {
        return AppStatistics.a(a);
    }

    public String getCategory()
    {
        return AppStatistics.c(a);
    }

    public String getSessionKey()
    {
        return com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a);
    }

    public void logAppStats(AppStatsDao aappstatsdao[])
    {
        int i;
        i = 0;
        if (aappstatsdao == null)
        {
            throw new NullPointerException("'appStatsDao' parameter is null");
        }
        AppStatistics appstatistics = a;
        appstatistics;
        JVM INSTR monitorenter ;
        int j = aappstatsdao.length;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj = aappstatsdao[i];
        AppStatistics.d(a).add(obj);
        obj = ((AppStatsDao) (obj)).calcObjSize(false, AppStatistics.e(a));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        AppStatistics.a(a, ((Integer) (obj)).intValue());
        break MISSING_BLOCK_LABEL_105;
        appstatistics;
        JVM INSTR monitorexit ;
        AppStatistics.a(a, Type.THRESH_TYPE_RAM);
        return;
        aappstatsdao;
        appstatistics;
        JVM INSTR monitorexit ;
        throw aappstatsdao;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void removeDataStoreInitializedListener(InitializedListener initializedlistener)
    {
        AppStatistics.m(a).remove(initializedlistener);
    }

    public void writeFileStatusEvent(AppStatsWritetoFileEvent appstatswritetofileevent)
    {
        if (appstatswritetofileevent.getWritetoFileStatus() != er.WriteFileStatus.WRITE_STATUS_WRITING)
        {
            synchronized (a)
            {
                AppStatistics.a(a, AppStatistics.i(a));
            }
        }
        if (appstatswritetofileevent.getWritetoFileStatus() != er.WriteFileStatus.WRITE_STATUS_COMPLETE)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        appstatswritetofileevent = AppStatsState.APP_STATS_EXPORTING.a(b.h, AppStatistics.f(a).a);
        if (appstatswritetofileevent != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(appstatswritetofileevent);
        }
        break MISSING_BLOCK_LABEL_85;
        appstatswritetofileevent;
        appstatistics;
        JVM INSTR monitorexit ;
        throw appstatswritetofileevent;
        AppStatistics.c(a, AppStatistics.f(a));
        com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a, AppStatsState.APP_STATS_EXPORTING);
        AppStatistics.a(a).export(AppStatistics.j(a), AppStatistics.k(a), AppStatistics.l(a));
    }

    public sDaoCalcObjSize(AppStatistics appstatistics, String s)
    {
        a = appstatistics;
        super();
        if (!b.c(s, "com.kofax"))
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        } else
        {
            AppStatsDao.addAppStatsDaoCalcObjSizeListener(this);
            return;
        }
    }
}
