// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsDataStore, AppStatsExportEvent, AppStatsDsExportHandler

class d
    implements Runnable
{

    final AppStatsDataStore a;
    private String b;
    private AppStatsDsExportHandler c;
    private oreStatusCallback d;
    private ErrorInfo e;

    private void a(er.ExportStatus exportstatus, int i, ErrorInfo errorinfo)
    {
        a.asFriend.fireExportStatusEvent(new AppStatsExportEvent(a.appStats, exportstatus, i, errorinfo));
    }

    public void run()
    {
        Iterator iterator;
        int i;
        boolean flag = false;
        Log.d("AppStatsDataStore", "AppStatsExportRunnable: run() start");
        AppStatsDataStore.a(a).clear();
        AppStatsDataStore.b(a).clear();
        AppStatsDataStore.a(a, 0L);
        AppStatsDataStore.b(a, 0L);
        c.configDsExpFilePath(b);
        a(er.ExportStatus.EXPORTING, 0, e);
        er.ExportStatus aexportstatus[] = values();
        int k = aexportstatus.length;
        i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            er.ExportStatus exportstatus = aexportstatus[i];
            try
            {
                Class class1 = Class.forName(exportstatus.a());
                Long long1 = (Long)class1.getMethod("countRows", (Class[])null).invoke(null, new Object[0]);
                if (long1.longValue() > 0L)
                {
                    AppStatsDataStore.a(a).add(class1);
                    AppStatsDataStore.b(a).add(long1);
                    AppStatsDataStore.c(a, long1.longValue());
                }
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                classnotfoundexception.printStackTrace();
                throw new TypeNotPresentException(exportstatus.a(), new Throwable(classnotfoundexception));
            }
            catch (IllegalAccessException illegalaccessexception1)
            {
                illegalaccessexception1.printStackTrace();
                throw new TypeNotPresentException(exportstatus.a(), new Throwable(illegalaccessexception1));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                illegalargumentexception.printStackTrace();
                throw illegalargumentexception;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                invocationtargetexception.printStackTrace();
                throw new IllegalArgumentException(invocationtargetexception.getMessage(), invocationtargetexception);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                nosuchmethodexception.printStackTrace();
                throw new IllegalArgumentException(nosuchmethodexception.getMessage(), nosuchmethodexception);
            }
            i++;
        } while (true);
        iterator = AppStatsDataStore.a(a).iterator();
        i = ((flag) ? 1 : 0);
_L3:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_551;
        }
        obj = (Class)iterator.next();
        int j;
        ((Class) (obj)).getMethod("export", new Class[] {
            java/lang/String, com/kofax/kmc/kut/utilities/appstats/AppStatsDsExportHandler
        }).invoke(null, new Object[] {
            b, c
        });
        AppStatsDataStore.d(a, ((Long)AppStatsDataStore.b(a).get(i)).longValue());
        j = (int)Math.round((double)((float)AppStatsDataStore.c(a) / (float)AppStatsDataStore.d(a)) * 100D);
        if (AppStatsDataStore.c(a) != AppStatsDataStore.d(a))
        {
            break MISSING_BLOCK_LABEL_483;
        }
        obj = er.ExportStatus.COMPLETE;
_L1:
        if (obj != er.ExportStatus.EXPORTING)
        {
            d.dataStoreExportComplete(e);
        }
        a(((er.ExportStatus) (obj)), j, e);
        i++;
        continue; /* Loop/switch isn't completed */
        try
        {
            obj = er.ExportStatus.EXPORTING;
        }
        catch (NoSuchMethodException nosuchmethodexception1)
        {
            nosuchmethodexception1.printStackTrace();
            throw new IllegalArgumentException(nosuchmethodexception1.getMessage(), nosuchmethodexception1);
        }
        catch (IllegalArgumentException illegalargumentexception1)
        {
            illegalargumentexception1.printStackTrace();
            throw illegalargumentexception1;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            illegalaccessexception.printStackTrace();
            throw new IllegalArgumentException(illegalaccessexception.getMessage(), illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            invocationtargetexception1.printStackTrace();
            throw new IllegalArgumentException(invocationtargetexception1.getMessage(), invocationtargetexception1);
        }
          goto _L1
        if (AppStatsDataStore.d(a) == 0L)
        {
            d.dataStoreExportComplete(e);
            a(er.ExportStatus.COMPLETE, 100, ErrorInfo.KMC_UT_STATS_NOTHING_TO_EXPORT);
        }
        Log.d("AppStatsDataStore", "AppStatsExportRunnable: run() end");
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

    oreStatusCallback(AppStatsDataStore appstatsdatastore, String s, AppStatsDsExportHandler appstatsdsexporthandler, oreStatusCallback orestatuscallback)
    {
        a = appstatsdatastore;
        super();
        e = ErrorInfo.KMC_SUCCESS;
        b = s;
        c = appstatsdsexporthandler;
        d = orestatuscallback;
    }
}
