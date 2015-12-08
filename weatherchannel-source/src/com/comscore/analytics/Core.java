// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.applications.KeepAlive;
import com.comscore.measurement.Measurement;
import com.comscore.measurement.MeasurementDispatcher;
import com.comscore.utils.CSLog;
import com.comscore.utils.CacheFlusher;
import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.Constants;
import com.comscore.utils.CustomExceptionHandler;
import com.comscore.utils.Date;
import com.comscore.utils.DispatchQueue;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Storage;
import com.comscore.utils.TransmissionMode;
import com.comscore.utils.Utils;
import com.comscore.utils.id.IdHelper;
import com.comscore.utils.task.TaskExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.comscore.analytics:
//            ApplicationState, SessionState, comScore, aa, 
//            h, i, v, u, 
//            ad, y, w, ab, 
//            ac, a, l, ae, 
//            d, m, s, o, 
//            p, n, r, q, 
//            g, k, z, b, 
//            f, e, t, ag, 
//            af, c, j, x

public class Core
{

    protected static final long x = 300L;
    protected AtomicInteger A;
    protected AtomicInteger B;
    protected long C;
    protected long D;
    protected long E;
    protected long F;
    protected long G;
    protected long H;
    protected long I;
    protected long J;
    protected long K;
    protected SessionState L;
    protected long M;
    protected long N;
    protected long O;
    protected int P;
    protected int Q;
    protected int R;
    protected long S;
    protected long T;
    protected long U;
    protected int V;
    protected long W;
    protected long X;
    protected Runnable Y;
    protected String Z;
    OfflineMeasurementsCache a;
    String aa;
    Context ab;
    protected final HashMap ac = new HashMap();
    protected final HashMap ad = new HashMap();
    boolean ae;
    protected long af;
    protected boolean ag;
    protected Thread.UncaughtExceptionHandler ah;
    boolean ai;
    TransmissionMode aj;
    TransmissionMode ak;
    String al[];
    private IdHelper am;
    private boolean an;
    private boolean ao;
    Storage b;
    KeepAlive c;
    CacheFlusher d;
    DispatchQueue e;
    TaskExecutor f;
    MeasurementDispatcher g;
    ConnectivityChangeReceiver h;
    protected Runnable i;
    protected Runnable j;
    protected long k;
    protected boolean l;
    protected boolean m;
    boolean n;
    AtomicInteger o;
    long p;
    AtomicInteger q;
    long r;
    long s;
    String t;
    String u;
    boolean v;
    String w;
    protected ApplicationState y;
    protected AtomicInteger z;

    public Core()
    {
        l = true;
        m = true;
        n = false;
        v = true;
        y = ApplicationState.INACTIVE;
        L = SessionState.INACTIVE;
        af = 0L;
        ag = false;
        an = true;
        q = new AtomicInteger(0);
        o = new AtomicInteger();
        B = new AtomicInteger(0);
        z = new AtomicInteger(0);
        A = new AtomicInteger(0);
        ah = Thread.getDefaultUncaughtExceptionHandler();
        ae = true;
        reset();
    }

    private void A()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add("lastApplicationAccumulationTimestamp");
        arraylist.add("lastSessionAccumulationTimestamp");
        a("lastActivityTime", arraylist);
        a("ns_ap_fg", "foregroundTransitionsCount");
        a("installTime", "installId");
        a("ns_ap_ver", "previousVersion");
    }

    private String a(String s1, Properties properties, boolean flag)
    {
        if (properties != null)
        {
            properties = properties.getProperty(s1);
            if (properties != null)
            {
                b.set(s1, properties);
                return properties;
            }
        }
        if (flag && b.has(s1).booleanValue())
        {
            return b.get(s1);
        } else
        {
            return null;
        }
    }

    static void a(Core core, TransmissionMode transmissionmode)
    {
        core.a(transmissionmode);
    }

    static void a(Core core, String s1)
    {
        core.b(s1);
    }

    static void a(Core core, String s1, String s2)
    {
        core.b(s1, s2);
    }

    private void a(TransmissionMode transmissionmode)
    {
        if (!an)
        {
            return;
        } else
        {
            aj = transmissionmode;
            return;
        }
    }

    static boolean a(Core core)
    {
        return core.an;
    }

    static boolean a(Core core, boolean flag)
    {
        core.an = flag;
        return flag;
    }

    static void b(Core core, TransmissionMode transmissionmode)
    {
        core.b(transmissionmode);
    }

    static void b(Core core, String s1)
    {
        core.c(s1);
    }

    private void b(TransmissionMode transmissionmode)
    {
        if (!an)
        {
            return;
        } else
        {
            ak = transmissionmode;
            return;
        }
    }

    private void b(String s1)
    {
        while (!an || am == null) 
        {
            return;
        }
        am.setPublisherSecret(s1);
        am.generateIds();
    }

    private void b(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ac.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    static boolean b(Core core)
    {
        return core.ao;
    }

    static boolean b(Core core, boolean flag)
    {
        core.ao = flag;
        return flag;
    }

    static void c(Core core, String s1)
    {
        core.d(s1);
    }

    private void c(String s1)
    {
        if (an)
        {
            aa = s1;
            if (b != null)
            {
                b.set("appName", aa);
                return;
            }
        }
    }

    private void d(String s1)
    {
        if (!an)
        {
            return;
        }
        String s2;
        if (isSecure())
        {
            s2 = "https://sb.scorecardresearch.com/p2?";
        } else
        {
            s2 = "http://b.scorecardresearch.com/p2?";
        }
        a(s2);
        b("c2", s1);
    }

    public static Core getInstance()
    {
        return comScore.getCore();
    }

    protected Measurement a(EventType eventtype, HashMap hashmap, String s1)
    {
        return ApplicationMeasurement.newApplicationMeasurement(this, eventtype, hashmap, s1);
    }

    protected IdHelper a(Context context, Storage storage)
    {
        return new IdHelper(context, storage);
    }

    protected void a()
    {
        b = b();
        g = e();
        a(b);
        e = c();
        c = f();
        a = g();
        d = h();
        h = i();
        j();
        am = a(ab, b);
    }

    void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = an;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        int j1;
        j1 = i1;
        if (i1 < 60)
        {
            j1 = 60;
        }
        l = flag;
        k = j1 * 1000;
        if (y != ApplicationState.FOREGROUND) goto _L4; else goto _L3
_L3:
        v();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L4:
        if (y != ApplicationState.BACKGROUND_UX_ACTIVE || l) goto _L1; else goto _L5
_L5:
        v();
          goto _L1
    }

    protected void a(ApplicationState applicationstate)
    {
        CSLog.d(this, (new StringBuilder()).append("Leaving application state: ").append(applicationstate).toString());
        switch (aa.a[applicationstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.start();
            c.start(3000);
            ab.registerReceiver(h, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d.start();
            return;

        case 2: // '\002'
            w();
            return;

        case 3: // '\003'
            setCurrentActivityName(null);
            break;
        }
        w();
    }

    protected void a(ApplicationState applicationstate, ApplicationState applicationstate1)
    {
        while (!an || applicationstate1 == ApplicationState.INACTIVE || !isAutoStartEnabled() || n) 
        {
            return;
        }
        notify(EventType.START, ad, false);
    }

    protected void a(SessionState sessionstate)
    {
        if (an)
        {
            CSLog.d(this, (new StringBuilder()).append("Leaving session state: ").append(sessionstate).toString());
            long l1 = Date.unixTime();
            switch (aa.b[sessionstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                if (Y != null)
                {
                    f.removeEnqueuedTask(Y);
                    Y = null;
                }
                U = l1;
                // fall through

            case 2: // '\002'
                T = l1;
                // fall through

            case 3: // '\003'
                S = l1;
                return;

            case 4: // '\004'
                break;
            }
            if (!p())
            {
                long l2 = M;
                M = (l1 - X) + l2;
                return;
            }
        }
    }

    protected void a(SessionState sessionstate, SessionState sessionstate1)
    {
    }

    void a(EventType eventtype, HashMap hashmap)
    {
        if (an)
        {
            if (z())
            {
                x();
                return;
            }
            y();
            if (!n && eventtype != EventType.START)
            {
                g.sendMeasurmement(a(EventType.START, new HashMap(), Z), false);
            }
            if (eventtype != EventType.CLOSE)
            {
                g.sendMeasurmement(a(eventtype, Utils.mapOfStrings(hashmap), Z), false);
                return;
            }
        }
    }

    protected void a(Storage storage)
    {
        A();
        g.loadEventData();
    }

    void a(String s1)
    {
        int j1;
        if (!an)
        {
            return;
        }
        j1 = s1.indexOf('?');
        if (j1 < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = s1;
        if (j1 < s1.length() - 1)
        {
            obj = s1.substring(j1 + 1).split("&");
            int k1 = obj.length;
            int i1 = 0;
            while (i1 < k1) 
            {
                String as[] = obj[i1].split("=");
                if (as.length == 2)
                {
                    setLabel(as[0], as[1], false);
                } else
                if (as.length == 1)
                {
                    setLabel("name", as[0], false);
                }
                i1++;
            }
            obj = s1.substring(0, j1 + 1);
        }
_L4:
        Z = ((String) (obj));
        return;
_L2:
        obj = (new StringBuilder()).append(s1).append('?').toString();
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s2);
        a(s1, arraylist);
    }

    void a(String s1, ArrayList arraylist)
    {
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            String s2 = (String)arraylist.next();
            String s3 = b.get(s1);
            String s4 = b.get(s2);
            if (Utils.isNotEmpty(s3) && Utils.isEmpty(s4))
            {
                b.set(s2, s3);
            }
        } while (true);
        b.remove(s1);
    }

    protected void a(boolean flag)
    {
        if (an) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = Date.unixTime();
        l2 = l1 - K;
        aa.a[y.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 254
    //                   2 229
    //                   3 204;
           goto _L3 _L4 _L5 _L6
_L4:
        break MISSING_BLOCK_LABEL_254;
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        K = l1;
        if (flag)
        {
            b.set("lastApplicationAccumulationTimestamp", Long.toString(K));
            b.set("foregroundTransitionsCount", Long.toString(B.get()));
            b.set("accumulatedForegroundTime", Long.toString(G));
            b.set("accumulatedBackgroundTime", Long.toString(F));
            b.set("accumulatedInactiveTime", Long.toString(H));
            b.set("totalForegroundTime", Long.toString(C));
            b.set("totalBackgroundTime", Long.toString(D));
            b.set("totalInactiveTime", Long.toString(E));
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        G = G + l2;
        C = l2 + C;
          goto _L8
_L5:
        F = F + l2;
        D = l2 + D;
          goto _L8
        H = H + l2;
        E = l2 + E;
          goto _L8
    }

    public void allowLiveTransmission(TransmissionMode transmissionmode, boolean flag)
    {
        if (an && transmissionmode != null)
        {
            if (!flag)
            {
                a(transmissionmode);
                return;
            }
            if (f != null && getLiveTransmissionMode() != transmissionmode)
            {
                f.execute(new h(this, transmissionmode), flag);
                return;
            }
        }
    }

    public void allowOfflineTransmission(TransmissionMode transmissionmode, boolean flag)
    {
        if (an && transmissionmode != null)
        {
            if (!flag)
            {
                b(transmissionmode);
                return;
            }
            if (f != null && getOfflineTransmissionMode() != transmissionmode)
            {
                f.execute(new i(this, transmissionmode), flag);
                return;
            }
        }
    }

    protected Storage b()
    {
        return new Storage(ab);
    }

    protected void b(ApplicationState applicationstate)
    {
        if (an) goto _L2; else goto _L1
_L1:
        return;
_L2:
        CSLog.d(this, (new StringBuilder()).append("Entering application state: ").append(applicationstate).toString());
        switch (aa.a[applicationstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h.stop();
            c.stop();
            d.stop();
            try
            {
                ab.unregisterReceiver(h);
            }
            // Misplaced declaration of an exception variable
            catch (ApplicationState applicationstate) { }
            w();
            return;

        case 2: // '\002'
            if (!l)
            {
                v();
                return;
            }
            break;

        case 3: // '\003'
            v();
            B.getAndIncrement();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void b(SessionState sessionstate)
    {
        if (!an)
        {
            return;
        }
        CSLog.d(this, (new StringBuilder()).append("Entering session state: ").append(sessionstate).toString());
        switch (aa.b[sessionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            q();
            o();
            // fall through

        case 2: // '\002'
            r();
            // fall through

        case 3: // '\003'
            p();
            break;
        }
    }

    protected void b(boolean flag)
    {
        if (an) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        long l2;
        l1 = Date.unixTime();
        l2 = l1 - X;
        aa.b[L.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 305
    //                   2 321
    //                   3 337;
           goto _L3 _L4 _L5 _L6
_L3:
        X = l1;
        if (flag)
        {
            b.set("lastSessionAccumulationTimestamp", Long.toString(X));
            b.set("lastApplicationSessionTimestamp", Long.toString(S));
            b.set("lastUserSessionTimestamp", Long.toString(T));
            b.set("lastActiveUserSessionTimestamp", Long.toString(U));
            b.set("accumulatedApplicationSessionTime", Long.toString(M));
            b.set("accumulatedActiveUserSessionTime", Long.toString(O));
            b.set("accumulatedUserSessionTime", Long.toString(N));
            b.set("activeUserSessionCount", Long.toString(R));
            b.set("userSessionCount", Long.toString(Q));
            b.set("lastUserInteractionTimestamp", Long.toString(W));
            b.set("userInteractionCount", Integer.toString(V));
            b.set("previousGenesis", Long.toString(J));
            b.set("genesis", Long.toString(I));
            b.set("applicationSessionCountKey", Integer.toString(P));
            return;
        }
          goto _L7
_L4:
        O = O + l2;
        U = l1;
_L5:
        N = N + l2;
        T = l1;
_L6:
        M = l2 + M;
        S = l1;
        if (true) goto _L3; else goto _L7
_L7:
        if (true) goto _L1; else goto _L8
_L8:
    }

    protected DispatchQueue c()
    {
        return new DispatchQueue(this);
    }

    void c(boolean flag)
    {
        ae = flag;
    }

    protected TaskExecutor d()
    {
        return new TaskExecutor(this);
    }

    protected void d(boolean flag)
    {
        if (!an)
        {
            return;
        } else
        {
            n = flag;
            return;
        }
    }

    public void disableAutoUpdate()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        l = true;
        k = -1L;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected MeasurementDispatcher e()
    {
        return new MeasurementDispatcher(this);
    }

    public void enableAutoUpdate(int i1, boolean flag, boolean flag1)
    {
        if (an)
        {
            if (!flag1)
            {
                a(i1, flag);
                return;
            }
            if (f != null)
            {
                f.execute(new v(this, i1, flag), flag1);
                return;
            }
        }
    }

    protected KeepAlive f()
    {
        return new KeepAlive(this, 0x5265c00L);
    }

    public void flush(boolean flag)
    {
        while (!an || f == null) 
        {
            return;
        }
        f.execute(new u(this), flag);
    }

    protected OfflineMeasurementsCache g()
    {
        return new OfflineMeasurementsCache(this);
    }

    public int getActiveUserSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (R < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = R;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!an)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        R = 0;
        b.set("activeUserSessionCount", Integer.toString(R));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getActiveUserSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = O;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            O = 0L;
            b.set("accumulatedActiveUserSessionTime", Long.toString(O));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public Context getAppContext()
    {
        return ab;
    }

    public String getAppName()
    {
        Object obj;
        PackageManager packagemanager;
        if (aa != null && aa.length() != 0 || ab == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = ab.getPackageName();
        packagemanager = ab.getPackageManager();
        obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(((String) (obj)), 0));
        if (obj != null)
        {
            try
            {
                setAppName(obj.toString(), false);
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                aa = b.get("appName");
            }
        }
        return aa;
    }

    public int getApplicationSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = P;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            P = 0;
            b.set("applicationSessionCountKey", Integer.toString(P));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getApplicationSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = M;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            M = 0L;
            b.set("accumulatedApplicationSessionTime", Long.toString(M));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public ApplicationState getApplicationState()
    {
        return y;
    }

    public String getAutoStartLabel(String s1)
    {
        return (String)ad.get(s1);
    }

    public HashMap getAutoStartLabels()
    {
        return ad;
    }

    public long getAutoUpdateInterval()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = k;
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getBackgroundTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = F;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            F = 0L;
            b.set("accumulatedBackgroundTime", Long.toString(F));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getBackgroundTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = D;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            D = 0L;
            b.set("totalBackgroundTime", Long.toString(D));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public CacheFlusher getCacheFlusher()
    {
        return d;
    }

    public long getCacheFlushingInterval()
    {
        return af;
    }

    public int getCacheMaxBatchFiles()
    {
        if (a != null)
        {
            return a.getCacheMaxBatchFiles();
        } else
        {
            return 100;
        }
    }

    public int getCacheMaxFlushesInARow()
    {
        if (a != null)
        {
            return a.getCacheMaxPosts();
        } else
        {
            return 10;
        }
    }

    public int getCacheMaxMeasurements()
    {
        if (a != null)
        {
            return a.getCacheMaxMeasurements();
        } else
        {
            return 2000;
        }
    }

    public long getCacheMeasurementExpiry()
    {
        if (a != null)
        {
            return a.getCacheMeasurementExpiry();
        } else
        {
            return 31L;
        }
    }

    public long getCacheMinutesToRetry()
    {
        if (a != null)
        {
            return a.getCacheWaitMinutes();
        } else
        {
            return 30L;
        }
    }

    public int getColdStartCount()
    {
        return q.get();
    }

    public long getColdStartId()
    {
        return p;
    }

    public ConnectivityChangeReceiver getConnectivityReceiver()
    {
        return h;
    }

    public String getCrossPublisherId()
    {
        if (am == null)
        {
            return null;
        } else
        {
            return am.getCrossPublisherId();
        }
    }

    public String getCurrentActivityName()
    {
        return w;
    }

    public String getCurrentVersion()
    {
        return t;
    }

    public String getCustomerC2()
    {
        return (String)getLabels().get("c2");
    }

    public boolean getErrorHandlingEnabled()
    {
        return ag;
    }

    public long getFirstInstallId()
    {
        return s;
    }

    public long getForegroundTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = G;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            G = 0L;
            b.set("accumulatedForegroundTime", Long.toString(G));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getForegroundTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = C;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            C = 0L;
            b.set("totalForegroundTime", Long.toString(C));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getForegroundTransitionsCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = B.get();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (an)
        {
            B.set(0);
            b.set("foregroundTransitionsCount", Long.toString(B.get()));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getGenesis()
    {
        return I;
    }

    public IdHelper getIdHelper()
    {
        return am;
    }

    public long getInactiveTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = H;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            H = 0L;
            b.set("accumulatedInactiveTime", Long.toString(H));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getInactiveTotalTime(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = E;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            E = 0L;
            b.set("totalInactiveTime", Long.toString(E));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getInstallId()
    {
        return r;
    }

    public KeepAlive getKeepAlive()
    {
        return c;
    }

    public String getLabel(String s1)
    {
        return (String)ac.get(s1);
    }

    public HashMap getLabels()
    {
        return ac;
    }

    public TransmissionMode getLiveTransmissionMode()
    {
        return aj;
    }

    public MeasurementDispatcher getMeasurementDispatcher()
    {
        return g;
    }

    public String[] getMeasurementLabelOrder()
    {
        return al;
    }

    public OfflineMeasurementsCache getOfflineCache()
    {
        return a;
    }

    public TransmissionMode getOfflineTransmissionMode()
    {
        return ak;
    }

    public String getPixelURL()
    {
        return Z;
    }

    public long getPreviousGenesis()
    {
        return J;
    }

    public String getPreviousVersion()
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        s1 = u;
        if (u != null && u.length() > 0)
        {
            b.remove("previousVersion");
            u = null;
        }
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String getPublisherSecret()
    {
        if (am == null)
        {
            return "";
        } else
        {
            return am.getPublisherSecret();
        }
    }

    public DispatchQueue getQueue()
    {
        return e;
    }

    public int getRunsCount()
    {
        return o.get();
    }

    public String getSalt()
    {
        return getPublisherSecret();
    }

    public SessionState getSessionState()
    {
        return L;
    }

    public Storage getStorage()
    {
        return b;
    }

    public TaskExecutor getTaskExecutor()
    {
        return f;
    }

    public int getUserInteractionCount(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = V;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            V = 0;
            b.set("userInteractionCount", Integer.toString(V));
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public int getUserSessionCountDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = -1;
        int j1;
        if (Q < 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        j1 = Q;
        i1 = j1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        i1 = j1;
        if (!an)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        Q = 0;
        b.set("userSessionCount", Integer.toString(Q));
        i1 = j1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long getUserSessionTimeDelta(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = N;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        if (an)
        {
            N = 0L;
            b.set("accumulatedUserSessionTime", Long.toString(N));
        }
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public String getVersion()
    {
        return "3.1502.26";
    }

    public String getVisitorId()
    {
        if (am == null)
        {
            return null;
        } else
        {
            return am.getVisitorId();
        }
    }

    protected CacheFlusher h()
    {
        return new CacheFlusher(this);
    }

    public boolean handleColdStart()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = an;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n)
        {
            continue; /* Loop/switch isn't completed */
        }
        n = true;
        q.getAndIncrement();
        b.set("coldStartCount", String.valueOf(q));
        p = Date.unixTime();
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected ConnectivityChangeReceiver i()
    {
        return new ConnectivityChangeReceiver(this);
    }

    public void incrementRunsCount()
    {
        if (!an)
        {
            return;
        } else
        {
            o.getAndIncrement();
            b.set("runs", Long.toString(o.get()));
            return;
        }
    }

    public boolean isAutoStartEnabled()
    {
        return v;
    }

    public boolean isAutoUpdateEnabled()
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = k;
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isEnabled()
    {
        return an;
    }

    public boolean isKeepAliveEnabled()
    {
        return ae;
    }

    public boolean isSecure()
    {
        return ai;
    }

    protected void j()
    {
        K = Utils.getLong(b.get("lastApplicationAccumulationTimestamp"), -1L);
        X = Utils.getLong(b.get("lastSessionAccumulationTimestamp"), -1L);
        S = Utils.getLong(b.get("lastApplicationSessionTimestamp"), -1L);
        T = Utils.getLong(b.get("lastUserSessionTimestamp"), -1L);
        U = Utils.getLong(b.get("lastActiveUserSessionTimestamp"), -1L);
        B.set(Utils.getInteger(b.get("foregroundTransitionsCount")));
        G = Utils.getLong(b.get("accumulatedForegroundTime"));
        F = Utils.getLong(b.get("accumulatedBackgroundTime"));
        H = Utils.getLong(b.get("accumulatedInactiveTime"));
        C = Utils.getLong(b.get("totalForegroundTime"));
        D = Utils.getLong(b.get("totalBackgroundTime"));
        E = Utils.getLong(b.get("totalInactiveTime"));
        M = Utils.getLong(b.get("accumulatedApplicationSessionTime"));
        O = Utils.getLong(b.get("accumulatedActiveUserSessionTime"));
        N = Utils.getLong(b.get("accumulatedUserSessionTime"));
        R = Utils.getInteger(b.get("activeUserSessionCount"), -1);
        Q = Utils.getInteger(b.get("userSessionCount"), -1);
        W = Utils.getLong(b.get("lastUserInteractionTimestamp"), -1L);
        V = Utils.getInteger(b.get("userInteractionCount"), 0);
        P = Utils.getInteger(b.get("applicationSessionCountKey"), 0);
        t = k();
        J = Utils.getLong(b.get("previousGenesis"), 0L);
        I = Utils.getLong(b.get("genesis"), -1L);
        long l1;
        if (I < 0L)
        {
            I = Date.unixTime();
            J = 0L;
            S = I;
            P = P + 1;
        } else
        {
            if (!p())
            {
                M = M + (Date.unixTime() - X);
                b.set("accumulatedApplicationSessionTime", Long.toString(M));
            }
            S = I;
        }
        s = Utils.getLong(b.get("firstInstallId"), -1L);
        if (s < 0L)
        {
            s = I;
            r = I;
            b.set("currentVersion", t);
            b.set("firstInstallId", String.valueOf(s));
            b.set("installId", String.valueOf(r));
        } else
        {
            if (b.has("previousVersion").booleanValue())
            {
                u = b.get("previousVersion");
            }
            String s1 = b.get("currentVersion");
            if (!s1.equals(t))
            {
                u = s1;
                b.set("previousVersion", u);
                r = I;
                b.set("installId", String.valueOf(r));
            } else
            {
                r = Utils.getLong(b.get("installId"), -1L);
            }
            b.set("currentVersion", t);
        }
        b.set("genesis", Long.toString(I));
        b.set("previousGenesis", Long.toString(J));
        l1 = Date.unixTime();
        if (K >= 0L)
        {
            long l2 = l1 - K;
            H = H + l2;
            b.set("accumulatedInactiveTime", Long.toString(H));
            E = l2 + E;
            b.set("totalInactiveTime", Long.toString(E));
        }
        K = l1;
        X = l1;
        b.set("lastApplicationAccumulationTimestamp", Long.toString(K));
        b.set("lastSessionAccumulationTimestamp", Long.toString(X));
        b.set("lastApplicationSessionTimestamp", Long.toString(S));
        if (!b.has("runs").booleanValue())
        {
            b.set("runs", "0");
        }
        o.set(Utils.getInteger(b.get("runs")));
        q.set(Utils.getInteger(b.get("coldStartCount")));
    }

    protected String k()
    {
        String s1 = ab.getPackageName();
        try
        {
            s1 = ab.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return "0";
        }
        return s1;
    }

    protected void l()
    {
        if (ab == null) goto _L2; else goto _L1
_L1:
        Object obj = ab.getResources().getAssets();
        Object obj1;
        obj1 = ((AssetManager) (obj)).open("comScore.properties");
        obj = new Properties();
        ((Properties) (obj)).load(((java.io.InputStream) (obj1)));
        Constants.DEBUG = Utils.getBoolean(a("Debug", ((Properties) (obj)), false));
        ai = Utils.getBoolean(a("Secure", ((Properties) (obj)), false));
        obj1 = a("PublisherSecret", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b(((String) (obj1)));
        obj1 = a("AppName", ((Properties) (obj)), true);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c(((String) (obj1)));
        obj1 = a("CustomerC2", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        d(((String) (obj1)));
        obj1 = a("PixelURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        a(((String) (obj1)));
        obj1 = a("OfflineURL", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        a.setUrl(((String) (obj1)));
        obj1 = a("LiveTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        aj = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L5:
        obj1 = a("OfflineTransmissionMode", ((Properties) (obj)), false);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        ak = TransmissionMode.valueOf(((String) (obj1)).toUpperCase(Locale.getDefault()));
_L3:
        int i1;
        ae = Utils.getBoolean(a("KeepAliveEnabled", ((Properties) (obj)), false), true);
        i1 = Utils.getInteger(a("CacheMaxSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        a.setCacheMaxMeasurements(i1);
        i1 = Utils.getInteger(a("CacheMaxBatchSize", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        a.setCacheMaxBatchFiles(i1);
        i1 = Utils.getInteger(a("CacheMaxFlushesInARow", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        a.setCacheMaxPosts(i1);
        i1 = Utils.getInteger(a("CacheMinutesToRetry", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_345;
        }
        a.setCacheWaitMinutes(i1);
        i1 = Utils.getInteger(a("CacheExpiryInDays", ((Properties) (obj)), false), -1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        a.setCacheMeasurementExpiry(i1);
        long l1 = Utils.getLong(a("CacheFlushingInterval", ((Properties) (obj)), false), -1L);
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        af = l1;
        if (d != null)
        {
            d.update();
        }
        boolean flag;
        setErrorHandlingEnabled(Utils.getBoolean(a("ErrorHandlingEnabled", ((Properties) (obj)), false)));
        v = Utils.getBoolean(a("AutoStartEnabled", ((Properties) (obj)), false), true);
        flag = Utils.getBoolean(a("AutoUpdateInForegroundOnly", ((Properties) (obj)), false), true);
        i1 = Utils.getInteger(a("AutoUpdateInterval", ((Properties) (obj)), false), -1);
        IllegalArgumentException illegalargumentexception;
        if (i1 >= 60)
        {
            try
            {
                a(i1, flag);
                return;
            }
            catch (IOException ioexception)
            {
                if (Constants.DEBUG)
                {
                    CSLog.printStackTrace(ioexception);
                    return;
                }
            }
        }
          goto _L2
        illegalargumentexception;
        aj = TransmissionMode.DEFAULT;
        continue; /* Loop/switch isn't completed */
        illegalargumentexception;
        ak = TransmissionMode.DEFAULT;
          goto _L3
_L2:
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected Context m()
    {
        return ab;
    }

    protected void n()
    {
        if (an)
        {
            if (f.containsTask(j))
            {
                f.removeEnqueuedTask(j);
                j = null;
            }
            long l1 = Date.unixTime();
            SessionState sessionstate;
            ApplicationState applicationstate;
            ApplicationState applicationstate1;
            SessionState sessionstate1;
            if (z.get() > 0)
            {
                applicationstate = ApplicationState.FOREGROUND;
            } else
            if (A.get() > 0)
            {
                applicationstate = ApplicationState.BACKGROUND_UX_ACTIVE;
            } else
            {
                applicationstate = ApplicationState.INACTIVE;
            }
            if (l1 - W < 0x493e0L)
            {
                sessionstate = SessionState.ACTIVE_USER;
            } else
            if (A.get() > 0)
            {
                sessionstate = SessionState.USER;
            } else
            if (z.get() > 0)
            {
                sessionstate = SessionState.APPLICATION;
            } else
            {
                sessionstate = SessionState.INACTIVE;
            }
            applicationstate1 = y;
            sessionstate1 = L;
            if (applicationstate != applicationstate1 || sessionstate != sessionstate1)
            {
                j = new ad(this, applicationstate1, applicationstate, sessionstate1, sessionstate);
                if (m && applicationstate != ApplicationState.FOREGROUND)
                {
                    f.execute(j, 300L);
                    return;
                } else
                {
                    j.run();
                    j = null;
                    return;
                }
            }
        }
    }

    public void notify(EventType eventtype, HashMap hashmap, boolean flag)
    {
        if (an)
        {
            if (!flag)
            {
                a(eventtype, hashmap);
                return;
            }
            if (f != null)
            {
                f.execute(new y(this, eventtype, hashmap), flag);
                return;
            }
        }
    }

    protected void o()
    {
        if (!an)
        {
            return;
        }
        if (Y != null)
        {
            f.removeEnqueuedTask(Y);
            Y = null;
        }
        Y = new UserInteractionTask();
        f.execute(Y, 0x493e0L);
    }

    public void onEnterForeground()
    {
        while (!an || f == null) 
        {
            return;
        }
        f.execute(new w(this), true);
    }

    public void onExitForeground()
    {
        while (!an || f == null) 
        {
            return;
        }
        f.execute(new ab(this), true);
    }

    public void onUserInteraction()
    {
        while (!an || f == null) 
        {
            return;
        }
        f.execute(new ac(this), true);
    }

    public void onUxActive()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.execute(new a(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onUxInactive()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f != null)
        {
            f.execute(new l(this), true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected boolean p()
    {
        boolean flag = false;
        if (!an)
        {
            return false;
        }
        long l1 = Date.unixTime();
        if (l1 - S > 0x1b7740L)
        {
            J = I;
            I = l1;
            P = P + 1;
            flag = true;
        }
        S = l1;
        return flag;
    }

    protected void q()
    {
        if (!an)
        {
            return;
        }
        long l1 = Date.unixTime();
        if (l1 - U >= 0x493e0L)
        {
            R = R + 1;
        }
        U = l1;
    }

    protected void r()
    {
        if (!an)
        {
            return;
        }
        long l1 = Date.unixTime();
        if (l1 - T >= 0x493e0L)
        {
            Q = Q + 1;
        }
        T = l1;
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        aj = TransmissionMode.DEFAULT;
        ak = TransmissionMode.DEFAULT;
        ai = false;
        al = Constants.LABELS_ORDER;
        y = ApplicationState.INACTIVE;
        L = SessionState.INACTIVE;
        n = false;
        o.set(0);
        p = -1L;
        q.set(0);
        s = -1L;
        r = -1L;
        t = null;
        u = null;
        z.set(0);
        A.set(0);
        C = 0L;
        D = 0L;
        E = 0L;
        F = 0L;
        G = 0L;
        H = 0L;
        M = 0L;
        O = 0L;
        N = 0L;
        I = -1L;
        J = 0L;
        R = -1;
        Q = -1;
        V = 0;
        W = -1L;
        K = -1L;
        X = -1L;
        S = -1L;
        T = -1L;
        U = -1L;
        r = -1L;
        s = -1L;
        disableAutoUpdate();
        if (j != null)
        {
            f.removeEnqueuedTask(j);
            j = null;
        }
        if (Y != null)
        {
            f.removeEnqueuedTask(Y);
            Y = null;
        }
        if (c != null)
        {
            c.cancel();
        }
        if (d != null)
        {
            d.stop();
        }
        if (f != null)
        {
            f.removeAllEnqueuedTasks();
        }
        if (b != null)
        {
            b.close();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void s()
    {
        a(true);
    }

    public void setAppContext(Context context)
    {
        if (ab != null || context == null)
        {
            return;
        } else
        {
            ab = context;
            f = d();
            f.execute(new ae(this), true);
            return;
        }
    }

    public void setAppName(String s1, boolean flag)
    {
        if (an)
        {
            if (!flag)
            {
                c(s1);
                return;
            }
            if (f != null)
            {
                f.execute(new d(this, s1), flag);
                return;
            }
        }
    }

    public void setAutoStartEnabled(boolean flag, boolean flag1)
    {
        if (!an)
        {
            return;
        } else
        {
            f.execute(new m(this, flag), flag1);
            return;
        }
    }

    public void setAutoStartLabel(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ad.put(s1, s2);
        if (true) goto _L1; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public void setAutoStartLabels(HashMap hashmap)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || hashmap == null) goto _L3; else goto _L2
_L2:
        ad.putAll(Utils.mapOfStrings(hashmap));
        if (true) goto _L3; else goto _L4
_L4:
        hashmap;
        throw hashmap;
    }

    public void setCacheFlushingInterval(long l1, boolean flag)
    {
        while (!an || f == null || af == l1) 
        {
            return;
        }
        f.execute(new s(this, l1), flag);
    }

    public void setCacheMaxBatchFiles(int i1, boolean flag)
    {
        while (!an || f == null || a == null) 
        {
            return;
        }
        f.execute(new o(this, i1), flag);
    }

    public void setCacheMaxFlushesInARow(int i1, boolean flag)
    {
        while (!an || f == null || a == null) 
        {
            return;
        }
        f.execute(new p(this, i1), flag);
    }

    public void setCacheMaxMeasurements(int i1, boolean flag)
    {
        while (!an || f == null || a == null) 
        {
            return;
        }
        f.execute(new n(this, i1), flag);
    }

    public void setCacheMeasurementExpiry(int i1, boolean flag)
    {
        while (!an || f == null || a == null) 
        {
            return;
        }
        f.execute(new r(this, i1), flag);
    }

    public void setCacheMinutesToRetry(int i1, boolean flag)
    {
        while (!an || f == null || a == null) 
        {
            return;
        }
        f.execute(new q(this, i1), flag);
    }

    public void setCurrentActivityName(String s1)
    {
        w = s1;
    }

    public void setCustomerC2(String s1, boolean flag)
    {
        if (an && s1 != null && s1.length() != 0)
        {
            if (!flag)
            {
                d(s1);
                return;
            }
            if (f != null)
            {
                f.execute(new g(this, s1), flag);
                return;
            }
        }
    }

    public void setDebug(boolean flag)
    {
        if (!an)
        {
            return;
        } else
        {
            f.execute(new k(this, flag), true);
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        f.execute(new z(this, flag), true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setErrorHandlingEnabled(boolean flag)
    {
        if (an)
        {
            ag = flag;
            if (flag)
            {
                Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandler(this));
                return;
            }
            if (Thread.getDefaultUncaughtExceptionHandler() != ah)
            {
                Thread.setDefaultUncaughtExceptionHandler(ah);
                return;
            }
        }
    }

    public void setKeepAliveEnabled(boolean flag, boolean flag1)
    {
        if (an)
        {
            if (!flag1)
            {
                c(flag);
                return;
            }
            if (f != null)
            {
                f.execute(new b(this, flag), flag1);
                return;
            }
        }
    }

    public void setLabel(String s1, String s2, boolean flag)
    {
        if (an)
        {
            if (!flag)
            {
                b(s1, s2);
                return;
            }
            if (f != null)
            {
                f.execute(new f(this, s1, s2), flag);
                return;
            }
        }
    }

    public void setLabels(HashMap hashmap, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = an;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag1 || hashmap == null) goto _L3; else goto _L2
_L2:
        if (f != null)
        {
            f.execute(new e(this, hashmap), flag);
        }
        if (true) goto _L3; else goto _L4
_L4:
        hashmap;
        throw hashmap;
    }

    public void setMeasurementLabelOrder(String as[], boolean flag)
    {
        while (!an || f == null || as == al || as == null || as.length <= 0) 
        {
            return;
        }
        f.execute(new t(this, as), flag);
    }

    public void setOfflineURL(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || s1 == null) goto _L3; else goto _L2
_L2:
        if (s1.length() != 0 && f != null)
        {
            f.execute(new ag(this, s1), true);
        }
        if (true) goto _L3; else goto _L4
_L4:
        s1;
        throw s1;
    }

    public void setPixelURL(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = an;
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag1 || s1 == null) goto _L3; else goto _L2
_L2:
        if (s1.length() == 0) goto _L3; else goto _L4
_L4:
        if (flag) goto _L6; else goto _L5
_L5:
        a(s1);
          goto _L3
        s1;
        throw s1;
_L6:
        if (f == null) goto _L3; else goto _L7
_L7:
        f.execute(new af(this, s1), flag);
          goto _L3
    }

    public void setPublisherSecret(String s1, boolean flag)
    {
        while (!an || s1 == null || s1.length() == 0 || f == null) 
        {
            return;
        }
        f.execute(new c(this, s1), flag);
    }

    public void setSecure(boolean flag, boolean flag1)
    {
        if (an)
        {
            if (!flag1)
            {
                ai = flag;
                return;
            }
            if (f != null)
            {
                f.execute(new j(this, flag), flag1);
                return;
            }
        }
    }

    protected void t()
    {
        b(true);
    }

    protected OfflineMeasurementsCache u()
    {
        return a;
    }

    public void update()
    {
        this;
        JVM INSTR monitorenter ;
        update(true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void update(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = an;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (f.containsTask(j))
        {
            f.removeEnqueuedTask(j);
            j.run();
            j = null;
        }
        a(flag);
        b(flag);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void v()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        w();
        if (k >= 60000L)
        {
            i = new x(this);
            f.execute(i, k, true, k);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void w()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = an;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (i != null)
        {
            f.removeEnqueuedTask(i);
            i = null;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void x()
    {
    }

    protected void y()
    {
    }

    boolean z()
    {
        return ab == null || am.isPublisherSecretEmpty() || Z == null || Z.length() == 0;
    }

    private class UserInteractionTask
        implements Runnable
    {

        final Core a;

        public void run()
        {
label0:
            {
                synchronized (a)
                {
                    if (Core.a(a))
                    {
                        break label0;
                    }
                }
                return;
            }
            if (a.Y != null)
            {
                a.f.removeEnqueuedTask(a.Y);
                a.Y = null;
                a.n();
            }
            core;
            JVM INSTR monitorexit ;
            return;
            exception;
            core;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public UserInteractionTask()
        {
            a = Core.this;
            super();
        }
    }

}
