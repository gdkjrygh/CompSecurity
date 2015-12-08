// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.async.ListenerCallbackThreadType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsState, AppStatsThresholdReachedEvent, AppStatsExportListener, AppstatsThresholdReachedListener, 
//            b, AppStatsWritetoFileEvent, AppStatsWriteFileListener, AppStatsExportEvent, 
//            UtilitiesAppStatsClient, AppStatsDataStore, AppStatsMsSqlExportHandler, AppStatsJsonExportHandler, 
//            AppStatsGreenDaoDs, AppStatsDsExportHandler, AppStatsSessionEvent

public class AppStatistics
{

    private static final String a = "AppStatistics";
    private AppStatsDsExportHandler A;
    private AppStatsExportFormat B;
    private String C;
    private AppStatsState D;
    private AppStatsState E;
    private AppStatsState F;
    private FriendAS G;
    private String H;
    private String I;
    private UtilitiesAppStatsClient b;
    private int c;
    private int d;
    private long e;
    private String f;
    private long g;
    private boolean h;
    private ListenerCallbackThreadType i;
    private List j;
    private List k;
    private List l;
    private String m;
    private String n;
    private AppStatsDataStore o;
    private ArrayList p;
    private ArrayList q;
    private ArrayList r;
    private ArrayList s;
    private CopyOnWriteArrayList t;
    private ArrayList u;
    private TaskRunner v;
    private int w;
    private float x;
    private long y;
    private AppStatsDsExportHandler z;

    private AppStatistics()
    {
        b = null;
        c = 0;
        d = 0;
        e = 0L;
        f = "";
        g = 0L;
        h = false;
        i = ListenerCallbackThreadType.UI_THREAD;
        j = new ArrayList();
        k = new ArrayList();
        l = j;
        m = UUID.randomUUID().toString();
        n = null;
        o = null;
        p = new ArrayList();
        q = new ArrayList();
        r = p;
        s = new ArrayList();
        t = new CopyOnWriteArrayList();
        u = new ArrayList();
        v = null;
        w = 0;
        x = 0.0F;
        y = 0L;
        z = null;
        A = null;
        B = null;
        C = "";
        D = AppStatsState.APP_STATS_UNINITIALIZED;
        E = D;
        F = AppStatsState.APP_STATS_UNINITIALIZED;
        G = new FriendAS(getClass().getName());
        H = null;
        I = null;
    }

    AppStatistics(_cls1 _pcls1)
    {
        this();
    }

    static int a(AppStatistics appstatistics, int i1)
    {
        appstatistics.w = i1;
        return i1;
    }

    static long a(AppStatistics appstatistics, long l1)
    {
        l1 = appstatistics.e + l1;
        appstatistics.e = l1;
        return l1;
    }

    static AppStatsDataStore a(AppStatistics appstatistics)
    {
        return appstatistics.o;
    }

    static AppStatsState a(AppStatistics appstatistics, AppStatsState appstatsstate)
    {
        appstatistics.E = appstatsstate;
        return appstatsstate;
    }

    private TaskRunner a()
    {
        if (v == null)
        {
            v = new TaskRunner(1);
        }
        return v;
    }

    static ArrayList a(AppStatistics appstatistics, ArrayList arraylist)
    {
        appstatistics.r = arraylist;
        return arraylist;
    }

    private void a(ThresholdType thresholdtype)
    {
        if (thresholdtype != ThresholdType.THRESH_TYPE_RAM) goto _L2; else goto _L1
_L1:
        if (c != 0 && (float)e - x >= (float)c) goto _L4; else goto _L3
_L3:
        return;
_L4:
        long l1;
        x = e;
        l1 = e;
_L6:
        a(((EventObject) (new AppStatsThresholdReachedEvent(this, thresholdtype, l1))));
        return;
_L2:
label0:
        {
            if (thresholdtype != ThresholdType.THRESH_TYPE_FILE)
            {
                break label0;
            }
            try
            {
                if (d == 0 || getFileSize() - y < (long)d)
                {
                    continue; /* Loop/switch isn't completed */
                }
                y = getFileSize();
                l1 = getFileSize();
            }
            // Misplaced declaration of an exception variable
            catch (ThresholdType thresholdtype)
            {
                thresholdtype.printStackTrace();
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND, thresholdtype);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L3; else goto _L7
_L7:
        throw new UnsupportedOperationException("handleThreshold: ThresholdType parameter specified is unsupported.");
    }

    static void a(AppStatistics appstatistics, ThresholdType thresholdtype)
    {
        appstatistics.a(thresholdtype);
    }

    static void a(AppStatistics appstatistics, AppStatsWriteFileListener.WriteFileStatus writefilestatus, float f1, ErrorInfo errorinfo)
    {
        appstatistics.a(writefilestatus, f1, errorinfo);
    }

    static void a(AppStatistics appstatistics, String s1, boolean flag)
    {
        appstatistics.a(s1, flag);
    }

    static void a(AppStatistics appstatistics, EventObject eventobject)
    {
        appstatistics.a(eventobject);
    }

    private void a(AppStatsExportEvent appstatsexportevent)
    {
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((AppStatsExportListener)iterator.next()).exportStatusEvent(appstatsexportevent)) { }
    }

    private void a(AppStatsThresholdReachedEvent appstatsthresholdreachedevent)
    {
        for (Iterator iterator = s.iterator(); iterator.hasNext(); ((AppstatsThresholdReachedListener)iterator.next()).thresholdReached(appstatsthresholdreachedevent)) { }
    }

    private void a(AppStatsWriteFileListener.WriteFileStatus writefilestatus, float f1, ErrorInfo errorinfo)
    {
        this;
        JVM INSTR monitorenter ;
        if (writefilestatus != AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE) goto _L2; else goto _L1
_L1:
        a("handleWritetoFile()", true);
        E = D;
        D = D.b(b.f, D.a);
        F = E;
        a("handleWritetoFile()", false);
_L4:
        this;
        JVM INSTR monitorexit ;
        a(((EventObject) (new AppStatsWritetoFileEvent(this, writefilestatus, f1, errorinfo))));
        return;
_L2:
        if (writefilestatus != AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_FAILED) goto _L4; else goto _L3
_L3:
        D = D.c(b.f, D.a);
          goto _L4
        writefilestatus;
        this;
        JVM INSTR monitorexit ;
        throw writefilestatus;
    }

    private void a(AppStatsWritetoFileEvent appstatswritetofileevent)
    {
        for (Iterator iterator = r.iterator(); iterator.hasNext(); ((AppStatsWriteFileListener)iterator.next()).writeFileStatusEvent(appstatswritetofileevent)) { }
    }

    private void a(Object obj, String s1)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append(s1).append(" parameter is null").toString());
        }
        if (obj.getClass().getSimpleName().equals("Integer") && ((Integer)obj).intValue() < 0)
        {
            obj = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            ((ErrorInfo) (obj)).setErrCause((new StringBuilder()).append("'").append(s1).append("'").append(" parameter is negative").toString());
            throw new KmcRuntimeException(((ErrorInfo) (obj)));
        } else
        {
            return;
        }
    }

    private void a(String s1)
    {
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((DataStoreInitializedListener)iterator.next()).dataStoreInitialized(s1)) { }
    }

    private void a(String s1, boolean flag)
    {
        if (flag)
        {
            Log.d("AppStatsState", (new StringBuilder()).append(s1).append(" enter; appStatsState=").append(D).append(", previousAppStatsState=").append(F).toString());
            return;
        } else
        {
            Log.d("AppStatsState", (new StringBuilder()).append(s1).append(" exit; appStatsState=").append(D).append(", previousAppStatsState=").append(F).toString());
            return;
        }
    }

    private void a(EventObject eventobject)
    {
        if (i == ListenerCallbackThreadType.WORKER_THREAD)
        {
            b(eventobject);
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(new _cls1(eventobject));
            return;
        }
    }

    static AppStatsState b(AppStatistics appstatistics, AppStatsState appstatsstate)
    {
        appstatistics.D = appstatsstate;
        return appstatsstate;
    }

    static String b(AppStatistics appstatistics)
    {
        return appstatistics.H;
    }

    private List b()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        list = l;
        if (l.hashCode() != j.hashCode())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l = k;
_L1:
        m = UUID.randomUUID().toString();
        e = 0L;
        x = getRamSize();
        this;
        JVM INSTR monitorexit ;
        return list;
        l = j;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    static void b(AppStatistics appstatistics, EventObject eventobject)
    {
        appstatistics.b(eventobject);
    }

    private void b(EventObject eventobject)
    {
        if (eventobject instanceof AppStatsThresholdReachedEvent)
        {
            a((AppStatsThresholdReachedEvent)eventobject);
            return;
        }
        if (eventobject instanceof AppStatsWritetoFileEvent)
        {
            a((AppStatsWritetoFileEvent)eventobject);
            return;
        }
        if (eventobject instanceof AppStatsExportEvent)
        {
            a((AppStatsExportEvent)eventobject);
            return;
        } else
        {
            throw new IllegalThreadStateException("fireAppStatsEvent: unsupported EventObject instance.");
        }
    }

    static AppStatsState c(AppStatistics appstatistics, AppStatsState appstatsstate)
    {
        appstatistics.F = appstatsstate;
        return appstatsstate;
    }

    static String c(AppStatistics appstatistics)
    {
        return appstatistics.I;
    }

    private void c()
    {
        if (q.isEmpty())
        {
            q.add(G);
        }
        r = q;
        writeToFile();
    }

    static List d(AppStatistics appstatistics)
    {
        return appstatistics.l;
    }

    static String e(AppStatistics appstatistics)
    {
        return appstatistics.m;
    }

    static AppStatsState f(AppStatistics appstatistics)
    {
        return appstatistics.D;
    }

    static AppStatsState g(AppStatistics appstatistics)
    {
        return appstatistics.F;
    }

    public static AppStatistics getInstance()
    {
        return a.a;
    }

    static AppStatsState h(AppStatistics appstatistics)
    {
        return appstatistics.E;
    }

    static ArrayList i(AppStatistics appstatistics)
    {
        return appstatistics.p;
    }

    static String j(AppStatistics appstatistics)
    {
        return appstatistics.C;
    }

    static AppStatsDsExportHandler k(AppStatistics appstatistics)
    {
        return appstatistics.z;
    }

    static FriendAS l(AppStatistics appstatistics)
    {
        return appstatistics.G;
    }

    static ArrayList m(AppStatistics appstatistics)
    {
        return appstatistics.u;
    }

    static CopyOnWriteArrayList n(AppStatistics appstatistics)
    {
        return appstatistics.t;
    }

    static List o(AppStatistics appstatistics)
    {
        return appstatistics.b();
    }

    static int p(AppStatistics appstatistics)
    {
        return appstatistics.w;
    }

    public void addAppStatsExportListener(AppStatsExportListener appstatsexportlistener)
    {
        if (appstatsexportlistener == null)
        {
            throw new NullPointerException("addAppStatsExportListener: listener parameter is null");
        }
        if (!t.contains(appstatsexportlistener))
        {
            t.add(appstatsexportlistener);
        }
    }

    public void addAppStatsWriteFileListener(AppStatsWriteFileListener appstatswritefilelistener)
    {
        if (appstatswritefilelistener == null)
        {
            throw new NullPointerException("addAppStatsWriteFileListener: listener parameter is null");
        }
        if (!p.contains(appstatswritefilelistener))
        {
            p.add(appstatswritefilelistener);
        }
    }

    public void addAppThresholdListener(AppstatsThresholdReachedListener appstatsthresholdreachedlistener)
    {
        if (appstatsthresholdreachedlistener == null)
        {
            throw new NullPointerException("addAppThresholdListener: listener parameter is null");
        }
        if (!s.contains(appstatsthresholdreachedlistener))
        {
            s.add(appstatsthresholdreachedlistener);
        }
    }

    public void beginSession(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        a("beginSession()", true);
        a(s1, "sessionKey");
        a(s2, "category");
        ErrorInfo errorinfo = AppStatsState.APP_STATS_BEGINNING_SESSION.a(b.i, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_64;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (H != null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_SESSION_ALREADY_BEGUN);
        }
        F = D;
        D = AppStatsState.APP_STATS_BEGINNING_SESSION;
        if (b == null)
        {
            b = new UtilitiesAppStatsClient();
        }
        b.logAppStats(AppStatsEventIDType.APP_STATS_BEGIN_SESSION_EVENT, s1, s2);
        E = D;
        D = AppStatsState.APP_STATS_BEGINNING_SESSION.b(b.i, F.a);
        F = E;
        H = s1;
        I = s2;
        this;
        JVM INSTR monitorexit ;
    }

    public void endSession(boolean flag, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a("endSession()", true);
        a(s1, "description");
        ErrorInfo errorinfo = AppStatsState.APP_STATS_ENDING_SESSION.a(b.k, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_56;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (H == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_NO_SESSION_BEGUN);
        }
        F = D;
        D = AppStatsState.APP_STATS_ENDING_SESSION;
        if (b == null)
        {
            b = new UtilitiesAppStatsClient();
        }
        b.logAppStats(AppStatsEventIDType.APP_STATS_END_SESSION_EVENT, flag, s1);
        E = D;
        D = AppStatsState.APP_STATS_ENDING_SESSION.b(b.k, F.a);
        F = E;
        H = null;
        I = null;
        this;
        JVM INSTR monitorexit ;
    }

    public ErrorInfo export(String s1, AppStatsExportFormat appstatsexportformat)
    {
        this;
        JVM INSTR monitorenter ;
        ErrorInfo errorinfo;
        a("export()", true);
        errorinfo = AppStatsState.APP_STATS_EXPORTING.a(b.h, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_48;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!org.a.a.a.b.a(s1))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        throw new IllegalArgumentException("Export file path is empty or null");
        B = appstatsexportformat;
        C = s1;
        if (A == null && B == AppStatsExportFormat.EXP_FORMAT_APP_DEFINED)
        {
            s1 = ErrorInfo.KMC_UT_STATS_EXPORT_HANDLER_MISSING;
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_EXPORT_HANDLER_MISSING);
        }
        o.open();
        _cls2.a[appstatsexportformat.ordinal()];
        JVM INSTR tableswitch 1 3: default 211
    //                   1 163
    //                   2 192
    //                   3 203;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_203;
_L1:
        throw new UnsupportedOperationException("export: the export format parameter specified is unsupported.");
_L2:
        s1 = new AppStatsMsSqlExportHandler();
_L5:
        z = s1;
        c();
        a("export()", false);
        this;
        JVM INSTR monitorexit ;
        return errorinfo;
_L3:
        s1 = new AppStatsJsonExportHandler();
          goto _L5
        s1 = A;
          goto _L5
    }

    public String getDeviceId()
    {
        return n;
    }

    public String getFileName()
    {
        return f;
    }

    public long getFileSize()
    {
        if (o == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        } else
        {
            g = o.calcDsSize();
            return g;
        }
    }

    public int getFileSizeThreshold()
    {
        return d;
    }

    public ListenerCallbackThreadType getListenerCallbackThreadType()
    {
        return i;
    }

    public long getRamSize()
    {
        return e;
    }

    public int getRamSizeThreshold()
    {
        return c;
    }

    public void initAppStats(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (org.a.a.a.b.a(n) && n == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        a("initAppStats()", true);
        ErrorInfo errorinfo = AppStatsState.APP_STATS_INITIALIZING.a(com.kofax.kmc.kut.utilities.appstats.b.b, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_65;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (!org.a.a.a.b.a(s1) && s1 != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        throw new NullPointerException("Database path is empty");
        if (D == AppStatsState.APP_STATS_INITIALIZED && o.isOpen())
        {
            o.close();
        }
        f = s1;
        o = AppStatsGreenDaoDs.getInstance();
        F = D;
        D = AppStatsState.APP_STATS_INITIALIZING;
        o.open(f);
        a(o.getDsUniqueId());
        E = D;
        D = AppStatsState.APP_STATS_INITIALIZING.b(com.kofax.kmc.kut.utilities.appstats.b.b, F.a);
        F = E;
        e = 0L;
        y = getFileSize();
        x = getRamSize();
        j.clear();
        k.clear();
_L1:
        a("initAppStats()", false);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        E = D;
        D = D.c(com.kofax.kmc.kut.utilities.appstats.b.b, F.a);
        F = E;
        throw s1;
        s1;
        s1.printStackTrace();
          goto _L1
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DEVICE_ID_MISSING);
    }

    public boolean isRecording()
    {
        return h;
    }

    public void logSessionEvent(AppStatsSessionEvent appstatssessionevent)
    {
        this;
        JVM INSTR monitorenter ;
        a("logSessionEvent()", true);
        if (appstatssessionevent != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        throw new NullPointerException("logSessionEvent: sessionEvent param cannot be null");
        appstatssessionevent;
        this;
        JVM INSTR monitorexit ;
        throw appstatssessionevent;
        ErrorInfo errorinfo = AppStatsState.APP_STATS_LOGGING_SESSION.a(b.j, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        if (!isRecording())
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_RECORDING_NOT_ON);
        }
        if (H == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_NO_SESSION_BEGUN);
        }
        F = D;
        D = AppStatsState.APP_STATS_LOGGING_SESSION;
        if (b == null)
        {
            b = new UtilitiesAppStatsClient();
        }
        b.logAppStats(AppStatsEventIDType.APP_STATS_LOG_SESSION_EVENT, appstatssessionevent);
        E = D;
        D = AppStatsState.APP_STATS_LOGGING_SESSION.b(b.j, F.a);
        F = E;
        this;
        JVM INSTR monitorexit ;
    }

    public ErrorInfo purge()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        a("purge()", true);
        obj = AppStatsState.APP_STATS_PURGING.a(b.c, D.a);
        if (obj != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(((ErrorInfo) (obj)));
        }
        break MISSING_BLOCK_LABEL_48;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        F = D;
        D = AppStatsState.APP_STATS_PURGING;
        if (h)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        o.close();
        o.remove();
        j.clear();
        k.clear();
        l = j;
        f = "";
        E = D;
        D = AppStatsState.APP_STATS_PURGING.b(b.c, F.a);
        F = E;
        a("purge()", false);
        this;
        JVM INSTR monitorexit ;
        return ((ErrorInfo) (obj));
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_RECORDING_NOT_OFF);
    }

    public void registerExportHandler(AppStatsDsExportHandler appstatsdsexporthandler)
    {
        A = appstatsdsexporthandler;
    }

    public void removeAppStatsExportListener(AppStatsExportListener appstatsexportlistener)
    {
        t.remove(appstatsexportlistener);
    }

    public void removeAppStatsThresholdListener(AppstatsThresholdReachedListener appstatsthresholdreachedlistener)
    {
        s.remove(appstatsthresholdreachedlistener);
    }

    public void removeAppStatsWriteFileListener(AppStatsWriteFileListener appstatswritefilelistener)
    {
        p.remove(appstatswritefilelistener);
    }

    public void setDeviceId(String s1)
    {
        n = s1;
    }

    public void setFileSizeThreshold(int i1)
    {
        d = i1;
    }

    public void setListenerCallbackThreadType(ListenerCallbackThreadType listenercallbackthreadtype)
    {
        i = listenercallbackthreadtype;
    }

    public void setRamSizeThreshold(int i1)
    {
        c = i1;
    }

    public ErrorInfo startRecord()
    {
        this;
        JVM INSTR monitorenter ;
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        a("startRecord()", true);
        if (D != AppStatsState.APP_STATS_WRITING) goto _L2; else goto _L1
_L1:
        Object obj = AppStatsState.APP_STATS_RECORDING_WRITING;
_L5:
        ErrorInfo errorinfo1 = ((AppStatsState) (obj)).a(b.d, D.a);
        if (errorinfo1 != ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING) goto _L4; else goto _L3
_L3:
        a("startRecord() - already recording...", false);
_L6:
        this;
        JVM INSTR monitorexit ;
        return errorinfo1;
_L2:
        obj = AppStatsState.APP_STATS_RECORDING;
          goto _L5
_L4:
        if (errorinfo1 != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo1);
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        F = D;
        D = ((AppStatsState) (obj));
        if (f == null)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_FILEPATH_IS_NULL);
        }
        o.open();
        h = true;
        a("startRecord()", false);
          goto _L6
    }

    public ErrorInfo stopRecord()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = ErrorInfo.KMC_SUCCESS;
        a("stopRecord()", true);
        if (D != AppStatsState.APP_STATS_RECORDING_WRITING)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = AppStatsState.APP_STATS_WRITING;
_L1:
        ErrorInfo errorinfo;
        errorinfo = ((AppStatsState) (obj)).a(b.e, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_92;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
label0:
        {
            if (D != AppStatsState.APP_STATS_RECORDING)
            {
                break label0;
            }
            obj = AppStatsState.APP_STATS_INITIALIZED;
        }
          goto _L1
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_STATE_TRANSITION);
        F = D;
        D = ((AppStatsState) (obj));
        if (h)
        {
            w = j.size();
            h = false;
        }
        a("stopRecord()", false);
        this;
        JVM INSTR monitorexit ;
        return errorinfo;
    }

    public void upgradeSchema(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a("upgradeSchema()", true);
        ErrorInfo errorinfo = AppStatsState.APP_STATS_UPGRADING.a(b.l, D.a);
        if (errorinfo != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo);
        }
        break MISSING_BLOCK_LABEL_48;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new NullPointerException("upgradeSchema: datastoreName parameter is null");
        if (org.a.a.a.b.a(s1))
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_FILEPATH_IS_NULL);
        }
        o = AppStatsGreenDaoDs.getInstance();
        F = D;
        D = AppStatsState.APP_STATS_UPGRADING;
        o.upgrade(s1);
        E = D;
        D = AppStatsState.APP_STATS_UPGRADING.b(b.l, F.a);
        F = E;
        this;
        JVM INSTR monitorexit ;
    }

    public ErrorInfo writeToFile()
    {
        this;
        JVM INSTR monitorenter ;
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        a("writeToFile()", true);
        if (D != AppStatsState.APP_STATS_RECORDING) goto _L2; else goto _L1
_L1:
        Object obj = AppStatsState.APP_STATS_RECORDING_WRITING;
_L5:
        ErrorInfo errorinfo1 = ((AppStatsState) (obj)).a(com.kofax.kmc.kut.utilities.appstats.b.f, D.a);
        if (errorinfo1 != ErrorInfo.KMC_UT_STATS_ALREADY_WRITING) goto _L4; else goto _L3
_L3:
        a("writeToFile() - already writing...", false);
_L6:
        this;
        JVM INSTR monitorexit ;
        return errorinfo1;
_L2:
        obj = AppStatsState.APP_STATS_WRITING;
          goto _L5
_L4:
        if (errorinfo1 != ErrorInfo.KMC_SUCCESS)
        {
            throw new KmcRuntimeException(errorinfo1);
        }
        break MISSING_BLOCK_LABEL_90;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        F = D;
        D = ((AppStatsState) (obj));
        if (!h)
        {
            o.open();
        }
        obj = a();
        c c1 = new c(null);
        b b1 = new b(null);
        v.addOnTaskCompletedListener(b1, c1, false);
        ((TaskRunner) (obj)).submit(c1);
        a("writeToFile()", false);
          goto _L6
    }

    private class FriendAS
        implements DataStoreStatusCallback, AppStatsWriteFileListener, com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao.AppStatsDaoCalcObjSize
    {

        final AppStatistics a;

        public void addAppStatsExportListener(AppStatsExportListener appstatsexportlistener, int i1)
        {
            if (appstatsexportlistener == null)
            {
                throw new NullPointerException("addAppStatsExportListener: listener parameter is null");
            }
            if (!AppStatistics.n(a).contains(appstatsexportlistener))
            {
                AppStatistics.n(a).add(i1, appstatsexportlistener);
            }
        }

        public void addDataStoreInitializedListener(DataStoreInitializedListener datastoreinitializedlistener)
        {
            if (datastoreinitializedlistener == null)
            {
                throw new NullPointerException("addDataStoreInitializedListener: listener parameter is null");
            }
            if (!AppStatistics.m(a).contains(datastoreinitializedlistener))
            {
                AppStatistics.m(a).add(datastoreinitializedlistener);
            }
        }

        public long currentEventTime()
        {
            return System.currentTimeMillis();
        }

        public void daoCalcObjSizeResult(int i1, String s1)
        {
            synchronized (a)
            {
                if (AppStatistics.e(a).equals(s1))
                {
                    AppStatistics.a(a, i1);
                }
            }
            AppStatistics.a(a, ThresholdType.THRESH_TYPE_RAM);
            return;
            s1;
            appstatistics;
            JVM INSTR monitorexit ;
            throw s1;
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
            com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a, AppStatistics.f(a).b(com.kofax.kmc.kut.utilities.appstats.b.h, AppStatistics.g(a).a));
_L2:
            AppStatistics.c(a, AppStatistics.h(a));
            AppStatistics.a(a, "DataStoreExportComplete()", false);
            return;
            com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(a, AppStatistics.f(a).c(com.kofax.kmc.kut.utilities.appstats.b.h, AppStatistics.g(a).a));
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
            int i1;
            i1 = 0;
            if (aappstatsdao == null)
            {
                throw new NullPointerException("'appStatsDao' parameter is null");
            }
            AppStatistics appstatistics = a;
            appstatistics;
            JVM INSTR monitorenter ;
            int j1 = aappstatsdao.length;
_L2:
            Object obj;
            if (i1 >= j1)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            obj = aappstatsdao[i1];
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
            AppStatistics.a(a, ThresholdType.THRESH_TYPE_RAM);
            return;
            aappstatsdao;
            appstatistics;
            JVM INSTR monitorexit ;
            throw aappstatsdao;
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void removeDataStoreInitializedListener(DataStoreInitializedListener datastoreinitializedlistener)
        {
            AppStatistics.m(a).remove(datastoreinitializedlistener);
        }

        public void writeFileStatusEvent(AppStatsWritetoFileEvent appstatswritetofileevent)
        {
            if (appstatswritetofileevent.getWritetoFileStatus() != AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING)
            {
                synchronized (a)
                {
                    AppStatistics.a(a, AppStatistics.i(a));
                }
            }
            if (appstatswritetofileevent.getWritetoFileStatus() != AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE)
            {
                break MISSING_BLOCK_LABEL_142;
            }
            appstatswritetofileevent = AppStatsState.APP_STATS_EXPORTING.a(com.kofax.kmc.kut.utilities.appstats.b.h, AppStatistics.f(a).a);
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

        public FriendAS(String s1)
        {
            a = AppStatistics.this;
            super();
            if (!org.a.a.a.b.c(s1, "com.kofax"))
            {
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            } else
            {
                AppStatsDao.addAppStatsDaoCalcObjSizeListener(this);
                return;
            }
        }
    }


    private class ThresholdType extends Enum
    {

        public static final ThresholdType THRESH_TYPE_FILE;
        public static final ThresholdType THRESH_TYPE_RAM;
        private static final ThresholdType a[];

        public static ThresholdType valueOf(String s1)
        {
            return (ThresholdType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatistics$ThresholdType, s1);
        }

        public static ThresholdType[] values()
        {
            return (ThresholdType[])a.clone();
        }

        static 
        {
            THRESH_TYPE_RAM = new ThresholdType("THRESH_TYPE_RAM", 0);
            THRESH_TYPE_FILE = new ThresholdType("THRESH_TYPE_FILE", 1);
            a = (new ThresholdType[] {
                THRESH_TYPE_RAM, THRESH_TYPE_FILE
            });
        }

        private ThresholdType(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class DataStoreInitializedListener
    {

        public abstract void dataStoreInitialized(String s1);
    }


    private class _cls1
        implements Runnable
    {

        final EventObject a;
        final AppStatistics b;

        public void run()
        {
            com.kofax.kmc.kut.utilities.appstats.AppStatistics.b(b, a);
        }

        _cls1(EventObject eventobject)
        {
            b = AppStatistics.this;
            a = eventobject;
            super();
        }
    }


    private class a
    {

        public static final AppStatistics a = new AppStatistics(null);


        private a()
        {
        }
    }


    private class AppStatsExportFormat extends Enum
    {

        public static final AppStatsExportFormat EXP_FORMAT_APP_DEFINED;
        public static final AppStatsExportFormat EXP_FORMAT_JSON;
        public static final AppStatsExportFormat EXP_FORMAT_SQL_SERVER;
        private static final AppStatsExportFormat a[];

        public static AppStatsExportFormat valueOf(String s1)
        {
            return (AppStatsExportFormat)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatistics$AppStatsExportFormat, s1);
        }

        public static AppStatsExportFormat[] values()
        {
            return (AppStatsExportFormat[])a.clone();
        }

        static 
        {
            EXP_FORMAT_SQL_SERVER = new AppStatsExportFormat("EXP_FORMAT_SQL_SERVER", 0);
            EXP_FORMAT_JSON = new AppStatsExportFormat("EXP_FORMAT_JSON", 1);
            EXP_FORMAT_APP_DEFINED = new AppStatsExportFormat("EXP_FORMAT_APP_DEFINED", 2);
            a = (new AppStatsExportFormat[] {
                EXP_FORMAT_SQL_SERVER, EXP_FORMAT_JSON, EXP_FORMAT_APP_DEFINED
            });
        }

        private AppStatsExportFormat(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class _cls2
    {

        static final int a[];

        static 
        {
            a = new int[AppStatsExportFormat.values().length];
            try
            {
                a[AppStatsExportFormat.EXP_FORMAT_SQL_SERVER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[AppStatsExportFormat.EXP_FORMAT_JSON.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AppStatsExportFormat.EXP_FORMAT_APP_DEFINED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class c
        implements Callable
    {

        final AppStatistics a;
        private int b;

        private AppStatsWriteToFileResults a(List list)
        {
            ErrorInfo errorinfo;
            AppStatsWriteToFileResults appstatswritetofileresults;
            Iterator iterator;
            errorinfo = ErrorInfo.KMC_SUCCESS;
            appstatswritetofileresults = new AppStatsWriteToFileResults(errorinfo, AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING);
            list.size();
            AppStatistics.a(a, list.size());
            iterator = list.iterator();
_L7:
            if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
            Object obj;
            int i1;
            try
            {
                Log.i("AppStatistics", (new StringBuilder()).append(" i = ").append(0).append("  ").append("size = ").append(list.size()).toString());
                ((AppStatsDao)iterator.next()).writeToDb();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.w("AppStatistics", ((SQLiteConstraintException) (obj)).getMessage());
            }
            Log.i("AppStatistics", "WriteToDB");
            iterator.remove();
            try
            {
                i1 = list.size();
                b = AppStatistics.p(a) - i1;
                i1 = (b * 100) / AppStatistics.p(a);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                appstatswritetofileresults.setState(AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_FAILED);
                Log.w("AppStatistics", ((Exception) (obj)).getMessage());
                continue; /* Loop/switch isn't completed */
            }
            if (i1 < 100) goto _L4; else goto _L3
_L3:
            obj = AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE;
_L5:
            appstatswritetofileresults.setState(((AppStatsWriteFileListener.WriteFileStatus) (obj)));
            AppStatistics.a(a, appstatswritetofileresults.getState(), i1, errorinfo);
            AppStatistics.a(a, ThresholdType.THRESH_TYPE_FILE);
            AppStatistics.a(a, ThresholdType.THRESH_TYPE_RAM);
            continue; /* Loop/switch isn't completed */
_L4:
            obj = AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING;
            if (true) goto _L5; else goto _L2
_L2:
            return appstatswritetofileresults;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public AppStatsWriteToFileResults a()
        {
            ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
            AppStatistics.a(a, "MyWriteToFileTask()", true);
            AppStatsWriteToFileResults appstatswritetofileresults = new AppStatsWriteToFileResults(errorinfo, AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING);
            List list = AppStatistics.o(a);
            if (list.size() == 0)
            {
                appstatswritetofileresults.setState(AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE);
                AppStatistics.a(a, appstatswritetofileresults.getState(), 100F, errorinfo);
            } else
            {
                appstatswritetofileresults = a(list);
            }
            AppStatistics.a(a, "MyWriteToFileTask()", false);
            return appstatswritetofileresults;
        }

        public Object call()
        {
            return a();
        }

        private c()
        {
            a = AppStatistics.this;
            super();
        }

        c(_cls1 _pcls1)
        {
            this();
        }
    }


    private class b
        implements com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedListener
    {

        final AppStatistics a;

        public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedEvent taskcompletedevent)
        {
            if (taskcompletedevent.getTaskError() != ErrorInfo.KMC_SUCCESS);
        }

        private b()
        {
            a = AppStatistics.this;
            super();
        }

        b(_cls1 _pcls1)
        {
            this();
        }
    }

}
