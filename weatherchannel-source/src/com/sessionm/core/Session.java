// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.FrameLayout;
import com.sessionm.api.AchievementActivity;
import com.sessionm.api.AchievementData;
import com.sessionm.api.ActivityListener;
import com.sessionm.api.SessionListener;
import com.sessionm.api.SessionM;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import com.sessionm.net.d;
import com.sessionm.ui.ActivityController;
import com.sessionm.ui.ButtonManager;
import com.sessionm.ui.SessionMActivity;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.core:
//            g, h, AchievementImpl, e, 
//            d, StatsCollector, a, b, 
//            Config

public class Session
    implements d
{
    private static final class RestartAfterStop extends Enum
    {

        public static final RestartAfterStop eo;
        public static final RestartAfterStop ep;
        public static final RestartAfterStop eq;
        private static final RestartAfterStop er[];

        public static RestartAfterStop valueOf(String s)
        {
            return (RestartAfterStop)Enum.valueOf(com/sessionm/core/Session$RestartAfterStop, s);
        }

        public static RestartAfterStop[] values()
        {
            return (RestartAfterStop[])er.clone();
        }

        static 
        {
            eo = new RestartAfterStop("DoNotRestart", 0);
            ep = new RestartAfterStop("ClearClientAndRestart", 1);
            eq = new RestartAfterStop("RestartWithoutReset", 2);
            er = (new RestartAfterStop[] {
                eo, ep, eq
            });
        }

        private RestartAfterStop(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void aw();
    }

    private class b extends AsyncTask
    {

        final Session dU;

        protected transient String a(Context acontext[])
        {
            com.sessionm.a.a.r(dU.getApplicationContext());
            if (dU.getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE || dU.getSessionState() == com.sessionm.api.SessionM.State.STARTED_OFFLINE)
            {
                dU.an();
            }
            return "";
        }

        protected transient void a(Integer ainteger[])
        {
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Context[])aobj);
        }

        protected void o(String s)
        {
            Session.cI = false;
        }

        protected void onPostExecute(Object obj)
        {
            o((String)obj);
        }

        protected void onProgressUpdate(Object aobj[])
        {
            a((Integer[])aobj);
        }

        private b()
        {
            dU = Session.this;
            super();
        }

    }

    private class c extends TimerTask
    {

        final Session dU;

        public void run()
        {
            dU.stopSession();
        }

        private c()
        {
            dU = Session.this;
            super();
        }

    }


    static final boolean $assertionsDisabled;
    private static final String TAG = "SessionM.Session";
    public static final String cH = "SessionM Session Thread";
    public static boolean cI = false;
    private static final String cJ = "ad_forecast_global";
    private static final String cK = "apiKey";
    private static final String cL = "smApiKey";
    private static final String cM = "com.sessionm.appid";
    private static final String cN = "com.sessionm.requeststore.currentsession";
    private static final String cO = "com.sessionm.requeststore.backlog";
    private static final String cP = "com.sessionm.urls.file";
    private static final String cQ = "com.sessionm.urls.portal";
    private static final String cR = "com.sessionm.urls.session";
    private static final String cS = "com.sessionm.urls.events";
    private static final String cT = "com.sessionm.urls.ads";
    private static final String cU = "com.sessionm.urls.optout";
    private static final String cV = "com.sessionm.urls.interstitial";
    private static final int cW = -1;
    private static final int cX = 1;
    private static final int cY = 50;
    private static final int cZ = 30;
    private static final int dF = 600;
    private static final long dK = 60000L;
    private static Session da;
    private volatile String cC;
    private long cD;
    private Context cf;
    private ExecutorService ck;
    private boolean dA;
    private Handler dB;
    private int dC;
    private boolean dD;
    private boolean dE;
    private int dG;
    private Timer dH;
    protected String dI;
    private boolean dJ;
    private boolean dL;
    private boolean dM;
    private com.sessionm.net.a dN;
    private com.sessionm.core.d dO;
    com.sessionm.core.b dP;
    private com.sessionm.b.a dQ;
    private RestartAfterStop dR;
    private String db;
    private String dc;
    private String dd;
    private int de;
    private ActivityController df;
    private com.sessionm.api.Activity dg;
    private Map dh;
    private Map di;
    private volatile com.sessionm.b.a dj;
    private com.sessionm.api.SessionM.EnrollmentResultType dk;
    private String dl;
    private String dm;
    private boolean dn;
    private boolean _flddo;
    private volatile String dp;
    private volatile com.sessionm.api.SessionM.State dq;
    private final Map dr = new HashMap();
    private final ArrayList ds = new ArrayList();
    private Activity dt;
    private final List du = Collections.synchronizedList(new ArrayList());
    private g dv;
    private RequestQueue dw;
    private boolean dx;
    private AchievementImpl dy;
    private boolean dz;
    private int fragmentFrameLayoutId;

    private Session()
    {
        dc = "";
        dd = "";
        de = -1;
        dq = com.sessionm.api.SessionM.State.STOPPED;
        dz = true;
        fragmentFrameLayoutId = -1;
        dG = 600;
        dJ = true;
        dR = RestartAfterStop.eo;
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", "Instantiated Session object.");
        }
        Looper looper = Looper.getMainLooper();
        if (looper == null)
        {
            return;
        } else
        {
            dB = new Handler(looper);
            return;
        }
    }

    public static Session D()
    {
        com/sessionm/core/Session;
        JVM INSTR monitorenter ;
        if (da == null) goto _L2; else goto _L1
_L1:
        Session session = da;
_L4:
        com/sessionm/core/Session;
        JVM INSTR monitorexit ;
        return session;
_L2:
        da = new Session();
        session = da;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void X()
    {
        g g1 = new g(dv);
        SessionM sessionm = SessionM.getInstance();
        SessionListener sessionlistener;
        for (Iterator iterator = al().iterator(); iterator.hasNext(); dB.post(new Runnable(sessionlistener, sessionm, g1) {

        final Session dU;
        final SessionListener dW;
        final SessionM dX;
        final g dY;

        public void run()
        {
            dW.onUserUpdated(dX, dY);
_L1:
            return;
            Throwable throwable;
            throwable;
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Exception calling SessionListener.onUserUpdated()", throwable);
                return;
            }
              goto _L1
        }

            
            {
                dU = Session.this;
                dW = sessionlistener;
                dX = sessionm;
                dY = g1;
                super();
            }
    }))
        {
            sessionlistener = (SessionListener)iterator.next();
        }

        Iterator iterator1 = ds.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator1.next();
            if (activity instanceof SessionListener)
            {
                dB.post(new Runnable(activity, sessionm, g1) {

                    final Session dU;
                    final SessionM dX;
                    final g dY;
                    final Activity dZ;

                    public void run()
                    {
                        ((SessionListener)dZ).onUserUpdated(dX, dY);
_L1:
                        return;
                        Throwable throwable;
                        throwable;
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM", "Exception calling SessionListener.onUserUpdated()", throwable);
                            return;
                        }
                          goto _L1
                    }

            
            {
                dU = Session.this;
                dZ = activity;
                dX = sessionm;
                dY = g1;
                super();
            }
                });
            }
        } while (true);
    }

    private void Y()
    {
        this;
        JVM INSTR monitorenter ;
        if (L() != null || dt != null) goto _L2; else goto _L1
_L1:
        boolean flag = getSessionState().isStarted();
        if (flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Z();
        dH = new Timer();
        dH.schedule(new c(), dG * 1000);
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Started session timer, ").append(dG).append(" seconds").toString());
        }
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    private void Z()
    {
        this;
        JVM INSTR monitorenter ;
        if (dH != null)
        {
            dH.cancel();
            dH = null;
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "Cancelled session timer");
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static long a(Session session, long l1)
    {
        session.cD = l1;
        return l1;
    }

    private transient Activity a(com.sessionm.api.Activity activity, Object aobj[])
    {
        if (!isExpandedPresentationMode() || aobj == null || aobj.length <= 0 || !(aobj[0] instanceof Activity)) goto _L2; else goto _L1
_L1:
        if (!ds.contains(aobj[0])) goto _L4; else goto _L3
_L3:
        Object obj = (Activity)aobj[0];
_L6:
label0:
        {
            aobj = ((Object []) (obj));
            if (obj == null)
            {
                aobj = dt;
            }
            obj = activity.getActivityType();
            if (obj != com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT)
            {
                activity = ((com.sessionm.api.Activity) (aobj));
                if (obj != com.sessionm.api.SessionM.ActivityType.INTERSTITIAL)
                {
                    break label0;
                }
            }
            if (com.sessionm.core.h.k(cf))
            {
                activity = ((com.sessionm.api.Activity) (aobj));
                if (!dv.isOptedOut())
                {
                    break label0;
                }
            }
            activity = null;
        }
        return activity;
_L4:
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Provided activity was not started, aborting presentation.");
        }
_L2:
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Context a(Session session, Context context)
    {
        session.cf = context;
        return context;
    }

    private FrameLayout a(Activity activity)
    {
        SessionM sessionm;
        ActivityListener activitylistener;
        sessionm = SessionM.getInstance();
        activitylistener = sessionm.getActivityListener();
        if (activitylistener == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        FrameLayout framelayout = activitylistener.viewGroupForActivity(sessionm);
        return framelayout;
        Throwable throwable;
        throwable;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception calling ActivityListener.viewGroupForActivity()", throwable);
        }
        if (!(activity instanceof ActivityListener) || activity == activitylistener)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        activity = ((ActivityListener)activity).viewGroupForActivity(sessionm);
        return activity;
        activity;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception calling ActivityListener.viewGroupForActivity()", activity);
        }
        return null;
    }

    static g a(Session session, g g1)
    {
        session.dv = g1;
        return g1;
    }

    static RequestQueue a(Session session, RequestQueue requestqueue)
    {
        session.dw = requestqueue;
        return requestqueue;
    }

    static Map a(Session session)
    {
        return session.di;
    }

    public static void a(Context context, a a1)
    {
        Session session = D();
        session.getExecutorService().execute(new Runnable(session, context, a1) {

            final a ed;
            final Context val$context;
            final Session val$session;

            public void run()
            {
                Session session1 = Session.D();
                session1;
                JVM INSTR monitorenter ;
                RequestQueue requestqueue;
                com.sessionm.core.Session.a(session, context.getApplicationContext());
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().removeAllCookie();
                ButtonManager.reset();
                session.P();
                session.U();
                session.b(0L);
                requestqueue = session.N();
                if (requestqueue == null)
                {
                    break MISSING_BLOCK_LABEL_85;
                }
                requestqueue.reset();
                com.sessionm.core.Session.a(session, null);
                session.T();
                session.R();
                session.aj();
                com.sessionm.core.Session.a(session, null);
                if (ed != null)
                {
                    (new Handler(context.getMainLooper())).post(new Runnable(this) {

                        final _cls18 ee;

                        public void run()
                        {
                            ee.ed.aw();
                        }

            
            {
                ee = _pcls18;
                super();
            }
                    });
                }
                session.as().g(context);
                com.sessionm.c.b.i(false);
                com.sessionm.c.d.t(context);
                session1;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                session1;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                session = session1;
                context = context1;
                ed = a1;
                super();
            }
        });
    }

    private void a(AchievementImpl achievementimpl)
    {
        if (!dv.isOptedOut() && (achievementimpl == null || !achievementimpl.equals(dy)))
        {
            dy = achievementimpl;
            if (!$assertionsDisabled && achievementimpl == null)
            {
                throw new AssertionError();
            }
            if (achievementimpl.isCustom())
            {
                achievementimpl = SessionM.getInstance();
                SessionListener sessionlistener;
                for (Iterator iterator = (new ArrayList(du)).iterator(); iterator.hasNext(); dB.post(new Runnable(sessionlistener, achievementimpl) {

        final Session dU;
        final SessionListener dW;
        final SessionM dX;

        public void run()
        {
            dW.onUnclaimedAchievement(dX, Session.k(dU));
_L1:
            return;
            Throwable throwable;
            throwable;
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Listener exception calling SessionListener.onUnclaimedAchievement()", throwable);
                return;
            }
              goto _L1
        }

            
            {
                dU = Session.this;
                dW = sessionlistener;
                dX = sessionm;
                super();
            }
    }))
                {
                    sessionlistener = (SessionListener)iterator.next();
                }

                Iterator iterator1 = (new ArrayList(ds)).iterator();
                while (iterator1.hasNext()) 
                {
                    Activity activity = (Activity)iterator1.next();
                    if (activity instanceof SessionListener)
                    {
                        dB.post(new Runnable(activity, achievementimpl) {

                            final Session dU;
                            final SessionM dX;
                            final Activity dZ;

                            public void run()
                            {
                                ((SessionListener)dZ).onUnclaimedAchievement(dX, Session.k(dU));
_L1:
                                return;
                                Throwable throwable;
                                throwable;
                                if (Log.isLoggable("SessionM", 6))
                                {
                                    Log.e("SessionM", "Activity exception calling SessionListener.onUnclaimedAchievement()", throwable);
                                    return;
                                }
                                  goto _L1
                            }

            
            {
                dU = Session.this;
                dZ = activity;
                dX = sessionm;
                super();
            }
                        });
                    }
                }
            }
        }
    }

    static void a(Session session, AchievementImpl achievementimpl)
    {
        session.b(achievementimpl);
    }

    static void a(Session session, String s, int i1)
    {
        session.b(s, i1);
    }

    private void a(Request request)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        int i1;
        if (request.aU() != null)
        {
            obj = request.aU().bD();
        }
        if (request.aZ() != null)
        {
            flag = request.aZ().getBoolean("eligible");
        }
        i1 = request.getStatusCode();
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", String.format("Session start response: %s HTTP code: %d", new Object[] {
                obj, Integer.valueOf(i1)
            }));
        }
          goto _L1
_L3:
        N().reset();
        l(2);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        obj = request.aT();
        request = request.aZ();
        if (obj != null || request == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (cC != null)
        {
            Log.e("SessionM.Session", "Session id already set.");
        }
        cC = request.getString("id");
        dp = request.getString("offers");
        dI = request.getString("authenticity_token");
        if (cC == null || cC.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_462;
        }
        com.sessionm.core.e.u().h(cC);
        k(request.getString("uuid"));
        j(request.getInt("session_timeout"));
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Session time is set to : ").append(dG).toString());
        }
        k(request.getInt("max_process_request_time"));
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Request timeout interval is set to : ").append(dC).toString());
        }
        com.sessionm.core.e.u().g(request.getInt("batch_size"));
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Max synch size is set to : ").append(com.sessionm.core.e.u().z()).toString());
        }
        com.sessionm.core.e.u().h(request.getInt("max_request_store_size"));
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Max backlog size is set to : ").append(com.sessionm.core.e.u().y()).toString());
        }
        a(com.sessionm.api.SessionM.State.STARTED_ONLINE);
        if (Log.isLoggable("SessionM", 4))
        {
            Log.i("SessionM", "Session started successfully");
        }
        N().bj();
        as().g(cf);
          goto _L2
        request;
        throw request;
        if (Log.isLoggable("SessionM.Session", 6))
        {
            Log.e("SessionM", "Session start response did not contain a session id.");
        }
        a(com.sessionm.api.SessionM.State.STARTED_OFFLINE);
        ak();
          goto _L2
_L1:
        if (i1 != 406 && (i1 != 201 || flag)) goto _L4; else goto _L3
    }

    static boolean a(Session session, boolean flag)
    {
        return session.f(flag);
    }

    private String[] a(int i1, int j1)
    {
        if (!collectsLocation())
        {
            return null;
        }
        LocationManager locationmanager = (LocationManager)cf.getSystemService("location");
        Object obj;
        if (i1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (j1 == 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0 || j1 != 0)
        {
            obj = locationmanager.getLastKnownLocation("network");
            if (obj == null && j1 != 0)
            {
                obj = locationmanager.getLastKnownLocation("gps");
            }
        } else
        {
            if (Log.isLoggable("SessionM.Session", 5))
            {
                Log.w("SessionM.Session", String.format("Location permissions are not defined in the manifest.", new Object[0]));
            }
            obj = null;
        }
        if (obj != null)
        {
            double d1 = ((Location) (obj)).getLatitude();
            double d2 = ((Location) (obj)).getLongitude();
            obj = new String[2];
            obj[0] = String.valueOf(d1);
            obj[1] = String.valueOf(d2);
        } else
        {
            obj = null;
        }
        return ((String []) (obj));
    }

    private void aa()
    {
        if (!f(true))
        {
            com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
            a1.put("_method", "delete");
            Request request = new Request(com.sessionm.net.Request.Type.gN);
            request.d(a1);
            N().f(request);
        }
    }

    private void ab()
    {
        this;
        JVM INSTR monitorenter ;
        ar();
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", "Finishing up session stop.");
        }
        RequestQueue requestqueue = N();
        requestqueue.stop();
        if (!aq())
        {
            f(true);
        }
        requestqueue.b(this);
        a(com.sessionm.api.SessionM.State.STOPPED);
        com.sessionm.core.e.u().x();
        C().c(null);
        cC = null;
        dj = null;
        dp = null;
        dy = null;
        dh = null;
        dv = null;
        dw.shutdown();
        dw = null;
        dQ = null;
        dP = null;
        if ((long)StatsCollector.Stat.eC.aA() == 0L)
        {
            com.sessionm.core.StatsCollector.a(StatsCollector.Stat.eC, System.currentTimeMillis() - cD);
        }
        StatsCollector.h(cf);
        cD = 0L;
        StatsCollector.reset();
        if (Log.isLoggable("SessionM.Session", 4))
        {
            Log.i("SessionM.Session", "Session stopped");
        }
        if (dR != RestartAfterStop.eo)
        {
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "Restarting session.");
            }
            dB.post(new Runnable() {

                final Session dU;

                public void run()
                {
                    Session.D().a(Session.h(dU), Session.j(dU));
                }

            
            {
                dU = Session.this;
                super();
            }
            });
            dR = RestartAfterStop.eo;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private com.sessionm.b.a ac()
    {
        com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
        com.sessionm.core.a a2;
        String s;
        for (Iterator iterator = dr.values().iterator(); iterator.hasNext(); a1.put(a2.getName(), s))
        {
            a2 = (com.sessionm.core.a)iterator.next();
            s = String.format(Locale.US, "%d", new Object[] {
                Integer.valueOf(a2.getCount())
            });
        }

        dr.clear();
        return a1;
    }

    private void ak()
    {
        long l1 = (long)((new Random()).nextFloat() * 60000F);
        long l2 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Session restart threshold delay: ").append(l1).append("ms").toString());
        }
        b(l2 + l1);
    }

    private List al()
    {
        return du;
    }

    private int ao()
    {
        Object obj;
        int i1;
        obj = cf.getSharedPreferences("com.sessionm.session.stats", 0);
        i1 = ((SharedPreferences) (obj)).getInt("com.sessionm.session.stats.start", 0);
        obj = ((SharedPreferences) (obj)).edit();
        if (!_flddo)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((android.content.SharedPreferences.Editor) (obj)).clear();
        _flddo = false;
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        i1 = 0;
        try
        {
            ((android.content.SharedPreferences.Editor) (obj)).putInt("com.sessionm.session.stats.start", i1 + 1);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        catch (Exception exception)
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Exception getting/setting count", exception);
            }
            return 0;
        }
        return i1;
    }

    private boolean aq()
    {
        return de == 2;
    }

    private void ar()
    {
        String s = Thread.currentThread().getName();
        if (!s.startsWith("SessionM Session Thread") && Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", String.format("Session method called from wrong thread: %s", new Object[] {
                s
            }), new Throwable());
        }
    }

    static AchievementImpl b(Session session, String s, int i1)
    {
        return session.c(s, i1);
    }

    private void b(Activity activity)
    {
        Z();
        if (isSessionAutoStartEnabled() && getSessionState() == com.sessionm.api.SessionM.State.STOPPED)
        {
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "auto starting session from lifecycle call.");
            }
            a(activity, db);
        }
        dt = activity;
        getExecutorService().execute(new Runnable() {

            final Session dU;

            public void run()
            {
                synchronized (dU)
                {
                    if (!dU.C().isOptedOut() && dU.getSessionState().isStarted())
                    {
                        com.sessionm.core.Session.a(dU, null);
                    }
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                super();
            }
        });
    }

    private void b(com.sessionm.b.a a1)
    {
        a1 = a1.B("hosts");
        if (a1 != null)
        {
            String s = a1.getString("events");
            if (s != null)
            {
                b(s, "com.sessionm.urls.events");
            }
            s = a1.getString("ads");
            if (s != null)
            {
                b(s, "com.sessionm.urls.ads");
            }
            s = a1.getString("optout");
            if (s != null)
            {
                b(s, "com.sessionm.urls.optout");
            }
            s = a1.getString("portal");
            if (s != null)
            {
                b(s, "com.sessionm.urls.portal");
            }
            s = a1.getString("sessions");
            if (s != null)
            {
                b(s, "com.sessionm.urls.session");
            }
            a1 = a1.getString("interstitials");
            if (a1 != null)
            {
                b(((String) (a1)), "com.sessionm.urls.interstitial");
                return;
            }
        }
    }

    private void b(AchievementImpl achievementimpl)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Process available achievement, activityData: ").append(achievementimpl).toString());
        }
        if (achievementimpl == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (dA)
        {
            updateAchievementsList();
        }
        Object obj = L();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (getCurrentActivity().getActivityType() != com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT) goto _L2; else goto _L3
_L3:
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", "Stop available achievement processing because it achievement UI is currently presented");
        }
_L9:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (achievementimpl == null) goto _L5; else goto _L4
_L4:
        if (achievementimpl.c()) goto _L5; else goto _L6
_L6:
        a(achievementimpl);
_L17:
        achievementimpl = K();
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (((ActivityController) (obj)).isInForeground()) goto _L9; else goto _L8
_L8:
        if (achievementimpl == null) goto _L9; else goto _L10
_L10:
        if (dy == null) goto _L9; else goto _L11
_L11:
        boolean flag;
        obj = SessionM.getInstance();
        flag = achievementimpl instanceof ActivityListener;
        if (!flag) goto _L13; else goto _L12
_L12:
        flag = ((ActivityListener)achievementimpl).shouldPresentAchievement(((SessionM) (obj)), dy);
_L19:
        if (!flag) goto _L9; else goto _L14
_L14:
        if (dy.isCustom() || dy.c()) goto _L9; else goto _L15
_L15:
        b(new com.sessionm.api.Activity(com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT), new Object[0]);
          goto _L9
        achievementimpl;
        throw achievementimpl;
_L5:
        if (getUnclaimedAchievement() != null) goto _L17; else goto _L16
_L16:
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", "No achievement is available");
        }
          goto _L9
        achievementimpl;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception calling ActivityListener.shouldPresentAchievement()", achievementimpl);
        }
        break MISSING_BLOCK_LABEL_331;
_L13:
        flag = isAutopresentMode();
        achievementimpl = ((SessionM) (obj)).getActivityListener();
        if (achievementimpl == null) goto _L19; else goto _L18
_L18:
        boolean flag1 = achievementimpl.shouldPresentAchievement(((SessionM) (obj)), dy);
        flag = flag1;
          goto _L19
        achievementimpl;
        if (!Log.isLoggable("SessionM", 6)) goto _L19; else goto _L20
_L20:
        Log.e("SessionM", "Exception calling ActivityListener.shouldPresentAchievement()", achievementimpl);
          goto _L19
        flag = false;
          goto _L19
    }

    private void b(Request request)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        int i1;
        if (request.aU() != null)
        {
            obj = request.aU().bD();
        }
        i1 = request.getStatusCode();
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", String.format("Session update response: %s HTTP code: %d", new Object[] {
                obj, Integer.valueOf(i1)
            }));
        }
        obj = request.aT();
        if (obj == null) goto _L2; else goto _L1
_L1:
        dk = com.sessionm.api.SessionM.EnrollmentResultType.FAILURE;
        if (Log.isLoggable("SessionM.Session", 6))
        {
            Log.e("SessionM", String.format("Error Code: %d Error: %s", new Object[] {
                Integer.valueOf(i1), ((Throwable) (obj)).toString()
            }));
        }
        dl = ((Throwable) (obj)).toString();
        X();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = request.aZ();
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!((com.sessionm.b.a) (obj)).getString("status").equals("ok"))
        {
            break MISSING_BLOCK_LABEL_175;
        }
        dk = com.sessionm.api.SessionM.EnrollmentResultType.SUCCESS;
          goto _L4
        request;
        throw request;
        Iterator iterator;
        request = new ArrayList();
        obj = ((com.sessionm.b.a) (obj)).B("errors");
        iterator = ((com.sessionm.b.a) (obj)).keys();
_L5:
        JSONArray jsonarray;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_250;
        }
        jsonarray = (JSONArray)((com.sessionm.b.a) (obj)).D((String)iterator.next());
        request.add(jsonarray.get(0).toString());
          goto _L5
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
          goto _L5
        if (request.size() > 0)
        {
            dl = (String)request.get(0);
        }
        dk = com.sessionm.api.SessionM.EnrollmentResultType.FAILURE;
        X();
          goto _L4
    }

    private void b(String s, int i1)
    {
        com.sessionm.core.a a1 = (com.sessionm.core.a)dr.get(s);
        boolean flag;
        if (m(s) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a1 == null)
        {
            s = new com.sessionm.core.a(s, i1);
            dr.put(s.getName(), s);
        } else
        {
            a1.b(i1);
            s = a1;
        }
        s.b(flag);
    }

    static boolean b(Session session)
    {
        return session.aq();
    }

    private AchievementImpl c(String s, int i1)
    {
        for (s = m(s); s == null || !s.a(i1);)
        {
            return null;
        }

        return s;
    }

    private void c(Activity activity)
    {
        ActivityController activitycontroller = L();
        if (activitycontroller != null && activitycontroller.getActivityContext() == activity && !getCurrentActivity().isAndroidActivity())
        {
            activitycontroller.dismiss();
        }
        if (activity == dt)
        {
            dt = null;
        }
        getExecutorService().execute(new Runnable(activity) {

            final Session dU;
            final Activity dZ;

            public void run()
            {
                synchronized (dU)
                {
                    if (Session.g(dU) != 0L)
                    {
                        com.sessionm.core.StatsCollector.a(StatsCollector.Stat.eC, System.currentTimeMillis() - Session.g(dU));
                    }
                    StatsCollector.h(dZ);
                    if (Session.D().getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
                    {
                        com.sessionm.core.Session.a(dU, false);
                    }
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                dZ = activity;
                super();
            }
        });
        Y();
    }

    static void c(Session session)
    {
        session.ab();
    }

    static void d(Session session)
    {
        session.aa();
    }

    static void e(Session session)
    {
        session.Y();
    }

    static com.sessionm.api.SessionM.State f(Session session)
    {
        return session.dq;
    }

    private boolean f(boolean flag)
    {
        RequestQueue requestqueue = N();
        if (!M() || requestqueue == null)
        {
            return false;
        }
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", String.format(Locale.US, "Sending action request isSessionEnd: %b", new Object[] {
                Boolean.valueOf(flag)
            }));
        }
        com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
        a1.put("e", ac().aL());
        if (flag)
        {
            a1.put("session[end]", "1");
        }
        Request request = new Request(com.sessionm.net.Request.Type.gM);
        request.d(a1);
        requestqueue.e(request);
        return true;
    }

    static long g(Session session)
    {
        return session.cD;
    }

    static Context h(Session session)
    {
        return session.cf;
    }

    static com.sessionm.b.a i(Session session)
    {
        return session.ac();
    }

    static String j(Session session)
    {
        return session.db;
    }

    static AchievementImpl k(Session session)
    {
        return session.dy;
    }

    private void k(int i1)
    {
        dC = i1;
        if (dC > 0)
        {
            W().n(dC * 1000);
        }
    }

    private void k(String s)
    {
        if (s == null || s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        dm = s;
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("deviceIDFile", 0).edit();
        editor.putString("uuid", s);
        editor.commit();
_L1:
        return;
        s;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", "Exception saving device ID", s);
            return;
        }
          goto _L1
    }

    private AchievementImpl l(String s)
    {
        AchievementImpl achievementimpl = null;
        Iterator iterator = C().getAchievements().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AchievementImpl achievementimpl1 = (AchievementImpl)(AchievementData)iterator.next();
            if (achievementimpl1.getAchievementId().equals(s))
            {
                achievementimpl = achievementimpl1;
            }
        } while (true);
        return achievementimpl;
    }

    private void l(int i1)
    {
        if (i1 == 2 || i1 == 5)
        {
            a(com.sessionm.api.SessionM.State.STOPPED);
            de = i1;
        }
        SessionM sessionm = SessionM.getInstance();
        SessionListener sessionlistener;
        for (Iterator iterator = al().iterator(); iterator.hasNext(); dB.post(new Runnable(sessionlistener, sessionm, i1) {

        final Session dU;
        final SessionListener dW;
        final SessionM dX;
        final int ea;

        public void run()
        {
            dW.onSessionFailed(dX, ea);
_L1:
            return;
            Throwable throwable;
            throwable;
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Exception calling SessionListener.onSessionFailed()", throwable);
                return;
            }
              goto _L1
        }

            
            {
                dU = Session.this;
                dW = sessionlistener;
                dX = sessionm;
                ea = i1;
                super();
            }
    }))
        {
            sessionlistener = (SessionListener)iterator.next();
        }

        Iterator iterator1 = ds.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator1.next();
            if (activity instanceof SessionListener)
            {
                dB.post(new Runnable(activity, sessionm, i1) {

                    final Session dU;
                    final SessionM dX;
                    final Activity dZ;
                    final int ea;

                    public void run()
                    {
                        ((SessionListener)dZ).onSessionFailed(dX, ea);
_L1:
                        return;
                        Throwable throwable;
                        throwable;
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM", "Exception calling SessionListener.onSessionFailed()", throwable);
                            return;
                        }
                          goto _L1
                    }

            
            {
                dU = Session.this;
                dZ = activity;
                dX = sessionm;
                ea = i1;
                super();
            }
                });
            }
        } while (true);
    }

    private boolean l()
    {
        return de != -1;
    }

    private AchievementImpl m(String s)
    {
        AchievementImpl achievementimpl;
        Object obj;
        Object obj1;
        achievementimpl = null;
        obj1 = null;
        obj = obj1;
        if (C() == null) goto _L2; else goto _L1
_L1:
        if (s != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L2:
        return ((AchievementImpl) (obj));
_L4:
        Iterator iterator = C().getAchievements().iterator();
        do
        {
            obj = achievementimpl;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (AchievementData)iterator.next();
            if (((AchievementData) (obj)).getDistance() > 0 && ((AchievementData) (obj)).getAction().equals(s) && (achievementimpl == null || ((AchievementData) (obj)).getDistance() < achievementimpl.getDistance()))
            {
                achievementimpl = (AchievementImpl)obj;
            }
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    private boolean n(String s)
    {
        return s.length() == 40 && s.matches("([0-9a-f])*");
    }

    public g C()
    {
        this;
        JVM INSTR monitorenter ;
        if (dv == null) goto _L2; else goto _L1
_L1:
        g g1 = dv;
_L4:
        this;
        JVM INSTR monitorexit ;
        return g1;
_L2:
        dv = new g();
        g1 = dv;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String E()
    {
        this;
        JVM INSTR monitorenter ;
        String s = db;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String F()
    {
        this;
        JVM INSTR monitorenter ;
        String s = cC;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String G()
    {
        this;
        JVM INSTR monitorenter ;
        String s = dp;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public Map H()
    {
        this;
        JVM INSTR monitorenter ;
        Map map = dh;
        this;
        JVM INSTR monitorexit ;
        return map;
        Exception exception;
        exception;
        throw exception;
    }

    public com.sessionm.b.a I()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.b.a a1 = dj;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public com.sessionm.api.SessionM.EnrollmentResultType J()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.EnrollmentResultType enrollmentresulttype;
        if (dk == null)
        {
            dk = com.sessionm.api.SessionM.EnrollmentResultType.UNAVAILABLE;
        }
        enrollmentresulttype = dk;
        this;
        JVM INSTR monitorexit ;
        return enrollmentresulttype;
        Exception exception;
        exception;
        throw exception;
    }

    public Activity K()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity = dt;
        this;
        JVM INSTR monitorexit ;
        return activity;
        Exception exception;
        exception;
        throw exception;
    }

    public ActivityController L()
    {
        this;
        JVM INSTR monitorenter ;
        ActivityController activitycontroller = df;
        this;
        JVM INSTR monitorexit ;
        return activitycontroller;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean M()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = dr.size();
        boolean flag;
        if (i1 > 0)
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

    public RequestQueue N()
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue;
        ar();
        if (dw == null && cf != null)
        {
            com.sessionm.c.d d1 = new com.sessionm.c.d(cf, "com.sessionm.requeststore.currentsession");
            com.sessionm.c.d d2 = new com.sessionm.c.d(cf, "com.sessionm.requeststore.backlog");
            ArrayList arraylist = new ArrayList();
            arraylist.add(d1);
            arraylist.add(d2);
            dw = new RequestQueue(arraylist, com.sessionm.net.RequestQueue.RequestQueueType.hJ, getExecutorService(), W());
            dw.p(1);
            dw.q(0);
        }
        requestqueue = dw;
        this;
        JVM INSTR monitorexit ;
        return requestqueue;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean O()
    {
        return dD;
    }

    public void P()
    {
        this;
        JVM INSTR monitorenter ;
        de = -1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String Q()
    {
        if (!dn)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        dm = null;
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("deviceIDFile", 0).edit();
        editor.clear();
        editor.commit();
        dn = false;
_L2:
        return null;
        Exception exception;
        exception;
        if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
        Log.e("SessionM", "Exception resetting device ID", exception);
        return null;
        if (dm != null)
        {
            return dm;
        }
        if (cf != null)
        {
            dm = cf.getSharedPreferences("deviceIDFile", 0).getString("uuid", null);
        }
        return dm;
    }

    public void R()
    {
        dL = true;
    }

    public void S()
    {
        N().reset();
        dw = null;
    }

    public void T()
    {
        this;
        JVM INSTR monitorenter ;
        dn = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void U()
    {
        this;
        JVM INSTR monitorenter ;
        _flddo = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void V()
    {
        Object obj;
        if (cf != null)
        {
            if ((obj = cf.getSharedPreferences("smApiKey", 0)) != null)
            {
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).remove("apiKey");
                ((android.content.SharedPreferences.Editor) (obj)).commit();
                return;
            }
        }
    }

    public com.sessionm.net.a W()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.net.a a1;
        if (dN == null && cf != null)
        {
            dN = new com.sessionm.net.http.a(cf, true, true, new Object[0]);
        }
        a1 = dN;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "Application context object is null");
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        getExecutorService().execute(new Runnable(context, s) {

            final Context dS;
            final String dT;
            final Session dU;

            public void run()
            {
                dU.b(dS, dT);
            }

            
            {
                dU = Session.this;
                dS = context;
                dT = s;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public void a(com.sessionm.api.ActivityListener.UserAction useraction, Map map)
    {
        getListenerHandler().post(new Runnable(useraction, map) {

            final Session dU;
            final com.sessionm.api.ActivityListener.UserAction eg;
            final Map eh;

            public void run()
            {
                SessionM sessionm = SessionM.getInstance();
                ActivityListener activitylistener = sessionm.getActivityListener();
                Activity activity;
                if (activitylistener != null)
                {
                    try
                    {
                        activitylistener.onUserAction(sessionm, eg, eh);
                    }
                    catch (Throwable throwable1)
                    {
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM.Session", "Exception calling ActivityListener.onUserAction()", throwable1);
                        }
                        continue; /* Loop/switch isn't completed */
                    }
                }
_L4:
                activity = dU.K();
                if (!(activity instanceof ActivityListener) || activity == activitylistener)
                {
                    break MISSING_BLOCK_LABEL_66;
                }
                ((ActivityListener)activity).onUserAction(sessionm, eg, eh);
_L2:
                return;
                Throwable throwable;
                throwable;
                if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
                Log.e("SessionM.Session", "Exception calling ActivityListener.onUserAction()", throwable);
                return;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                dU = Session.this;
                eg = useraction;
                eh = map;
                super();
            }
        });
    }

    public void a(SessionListener sessionlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (sessionlistener == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        al().add(sessionlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        sessionlistener;
        throw sessionlistener;
    }

    public void a(com.sessionm.api.SessionM.State state)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = dq;
        if (state != obj) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", String.format(Locale.US, "Moving session to state: %s", new Object[] {
                state
            }));
        }
        dq = state;
        obj = SessionM.getInstance();
        SessionListener sessionlistener;
        for (Iterator iterator = al().iterator(); iterator.hasNext(); dB.post(new Runnable(sessionlistener, ((SessionM) (obj)), state) {

        final Session dU;
        final SessionListener dW;
        final SessionM dX;
        final com.sessionm.api.SessionM.State ec;

        public void run()
        {
            dW.onSessionStateChanged(dX, ec);
_L1:
            return;
            Throwable throwable;
            throwable;
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Exception calling SessionListener.onSessionStateChanged()", throwable);
                return;
            }
              goto _L1
        }

            
            {
                dU = Session.this;
                dW = sessionlistener;
                dX = sessionm;
                ec = state;
                super();
            }
    }))
        {
            sessionlistener = (SessionListener)iterator.next();
        }

        break MISSING_BLOCK_LABEL_114;
        state;
        throw state;
        Iterator iterator1 = ds.iterator();
        while (iterator1.hasNext()) 
        {
            Activity activity = (Activity)iterator1.next();
            if (activity instanceof SessionListener)
            {
                dB.post(new Runnable(activity, ((SessionM) (obj)), state) {

                    final Session dU;
                    final SessionM dX;
                    final Activity dZ;
                    final com.sessionm.api.SessionM.State ec;

                    public void run()
                    {
                        ((SessionListener)dZ).onSessionStateChanged(dX, ec);
_L1:
                        return;
                        Throwable throwable;
                        throwable;
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM", "Exception calling SessionListener.onSessionStateChanged()", throwable);
                            return;
                        }
                          goto _L1
                    }

            
            {
                dU = Session.this;
                dZ = activity;
                dX = sessionm;
                ec = state;
                super();
            }
                });
            }
        }
          goto _L1
    }

    public void a(com.sessionm.b.a a1)
    {
        com.sessionm.b.a aa2[];
        Object obj;
        Object obj2;
        Object obj3;
        ar();
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "Updating session state");
        }
        b(a1);
        obj2 = a1.B("player");
        com.sessionm.b.a aa3[] = (com.sessionm.b.a[])a1.a("ad_forecast", com/sessionm/b/a);
        if (a1.has("cache_content"))
        {
            com.sessionm.b.a aa1[] = (com.sessionm.b.a[])a1.a("cache_content", com/sessionm/b/a);
            av().a(aa1);
        }
        aa2 = aa3;
        if (aa3 != null)
        {
            aa2 = aa3;
            if (aa3.length == 0)
            {
                aa2 = null;
            }
        }
        obj = a1.B("ad_forecast_global");
        obj3 = C();
        if (obj2 != null || obj != null || aa2 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        dj = ((com.sessionm.b.a) (obj));
        boolean flag = ((g) (obj3)).c(((com.sessionm.b.a) (obj2)));
        if (((g) (obj3)).isOptedOut())
        {
            dy = null;
        }
        if (aa2 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((g) (obj3)).isOptedOut())
        {
            ((g) (obj3)).getAchievements().clear();
        }
        if (flag)
        {
            X();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        int i1;
        int j1;
        a1 = a1.getString("update_strategy");
        if (a1 != null && !a1.equals("update"))
        {
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "Cleared activity forecast");
            }
            C().getAchievements().clear();
        }
        obj3 = C().getAchievements();
        j1 = aa2.length;
        i1 = 0;
        a1 = null;
_L5:
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        obj = aa2[i1];
        obj2 = l(((com.sessionm.b.a) (obj)).getString(AchievementImpl.u));
        if (obj2 != null)
        {
            ((List) (obj3)).remove(obj2);
        }
        obj2 = new AchievementImpl(((com.sessionm.b.a) (obj)), "forecast");
        if (((AchievementImpl) (obj2)).isValid())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a1;
_L9:
        i1++;
        a1 = ((com.sessionm.b.a) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        ((List) (obj3)).add(obj2);
        String s = ((AchievementImpl) (obj2)).getAction();
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Updated forecast for action: ").append(s).append(", forecast: ").append(obj).toString());
        }
        if (((AchievementImpl) (obj2)).b()) goto _L7; else goto _L6
_L6:
        obj = a1;
        if (((AchievementImpl) (obj2)).a() != AchievementImpl.AchievementState.T) goto _L9; else goto _L8
_L8:
        obj = a1;
        if (a1 != null) goto _L9; else goto _L7
_L7:
        obj = obj2;
          goto _L9
        Iterator iterator = dr.values().iterator();
        boolean flag1 = false;
        do
        {
            boolean flag2;
label0:
            {
label1:
                {
                    if (iterator.hasNext())
                    {
                        Object obj1 = (com.sessionm.core.a)iterator.next();
                        if (((com.sessionm.core.a) (obj1)).e() || m(((com.sessionm.core.a) (obj1)).getName()) == null)
                        {
                            break label1;
                        }
                        ((com.sessionm.core.a) (obj1)).b(true);
                        obj1 = c(((com.sessionm.core.a) (obj1)).getName(), ((com.sessionm.core.a) (obj1)).getCount());
                        if (obj1 != null)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        flag2 = flag1;
                        if (!flag1)
                        {
                            break label0;
                        }
                        f(false);
                        b(((AchievementImpl) (obj1)));
                    }
                    getExecutorService().execute(new Runnable(flag1, a1) {

                        final Session dU;
                        final boolean em;
                        final AchievementImpl en;

                        public void run()
                        {
                            if (!em && en != null)
                            {
                                com.sessionm.core.Session.a(dU, en);
                            }
                        }

            
            {
                dU = Session.this;
                em = flag;
                en = achievementimpl;
                super();
            }
                    });
                    X();
                    return;
                }
                flag2 = flag1;
            }
            flag1 = flag2;
        } while (true);
    }

    public void a(RequestQueue requestqueue, Request request)
    {
    }

    public void a(RequestQueue requestqueue, com.sessionm.net.RequestQueue.RequestQueueNetworkState requestqueuenetworkstate)
    {
        ar();
        com.sessionm.api.SessionM.State state = getSessionState();
        if (requestqueuenetworkstate == com.sessionm.net.RequestQueue.RequestQueueNetworkState.hz && state == com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            a(com.sessionm.api.SessionM.State.STARTED_OFFLINE);
            requestqueue.bk();
        } else
        if (requestqueuenetworkstate == com.sessionm.net.RequestQueue.RequestQueueNetworkState.hy && state == com.sessionm.api.SessionM.State.STARTED_OFFLINE && !l() && cC != null && !aq())
        {
            a(com.sessionm.api.SessionM.State.STARTED_ONLINE);
            requestqueue.bj();
            return;
        }
    }

    public void a(RequestQueue requestqueue, com.sessionm.net.RequestQueue.RequestQueueSendState requestqueuesendstate)
    {
        ar();
        if (getSessionState() == com.sessionm.api.SessionM.State.STOPPING && requestqueuesendstate == com.sessionm.net.RequestQueue.RequestQueueSendState.hC)
        {
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "Queue transitioned to idle send state. Sending session stop request.");
            }
            N().bi();
        }
    }

    public void a(ActivityController activitycontroller)
    {
        this;
        JVM INSTR monitorenter ;
        if (activitycontroller != null) goto _L2; else goto _L1
_L1:
        Log.e("SessionM.Session", "Internal error: ActivityController was null");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Z();
        if (dg == null)
        {
            dg = new com.sessionm.api.Activity(com.sessionm.api.SessionM.ActivityType.INTERSTITIAL);
        }
        df = activitycontroller;
        if (true) goto _L4; else goto _L3
_L3:
        activitycontroller;
        throw activitycontroller;
    }

    public void a(String s, String s1, Throwable throwable)
    {
        Object obj = null;
        if (throwable != null)
        {
            obj = new StringWriter();
            throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
            obj = ((StringWriter) (obj)).toString();
        }
        s1 = String.format(Locale.US, "Application Error: name=%s, message=%s, exception=%s", new Object[] {
            s, s1, obj
        });
        s = com.sessionm.b.a.aJ();
        s.put("error[message]", s1);
        s1 = new Request(com.sessionm.net.Request.Type.gQ, new Object[] {
            E()
        });
        s1.d(s);
        s1.send();
    }

    public boolean a(AchievementActivity achievementactivity)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Activity activity = a(((com.sessionm.api.Activity) (achievementactivity)), new Object[0]);
        if (activity != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (!Log.isLoggable("SessionM.CA", 5))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Log.w("SessionM.CA", "No started android activities found. Custom achievement will not be claimable.");
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (Log.isLoggable("SessionM", 4))
        {
            Log.i("SessionM", (new StringBuilder()).append("Custom achievement presented, Android activity: ").append(activity).toString());
        }
        dy = null;
        dg = achievementactivity;
        getExecutorService().execute(new Runnable(achievementactivity) {

            final Session dU;
            final AchievementActivity dV;

            public void run()
            {
                com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
                Object obj = (AchievementImpl)dV.getAchievement();
                a1.put("achievement_id", (new StringBuilder()).append("").append(((AchievementImpl) (obj)).getAchievementId()).toString());
                obj = new Request(com.sessionm.net.Request.Type.gR, new Object[] {
                    dU.E()
                });
                ((Request) (obj)).d(a1);
                dU.N().f(((Request) (obj)));
            }

            
            {
                dU = Session.this;
                dV = achievementactivity;
                super();
            }
        });
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        achievementactivity;
        throw achievementactivity;
    }

    public boolean a(RequestQueue requestqueue)
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.State state;
        requestqueue = dq;
        state = com.sessionm.api.SessionM.State.STARTED_OFFLINE;
        boolean flag;
        if (requestqueue == state)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        requestqueue;
        throw requestqueue;
    }

    public boolean a(String s, String s1)
    {
        final Session session = D();
        if (session.dI == null)
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Session is not authenticated. Will cancel sign in.");
            }
        } else
        if (!com.sessionm.core.h.a(s) || !com.sessionm.core.h.b(s1))
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Attempt to sign in with invalid user data. Will cancel sign in.");
                return false;
            }
        } else
        {
            session.ad();
            session.getExecutorService().execute(new Runnable(s, s1) {

                final Session dU;
                final String eb;
                final String ei;
                final Session val$session;

                public void run()
                {
                    RequestQueue requestqueue = session.N();
                    com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
                    Object obj = com.sessionm.b.a.aJ();
                    ((com.sessionm.b.a) (obj)).put("email", eb);
                    ((com.sessionm.b.a) (obj)).put("password", ei);
                    a1.put("login", obj);
                    a1.put("authenticity_token", session.dI);
                    obj = new Request(com.sessionm.net.Request.Type.gY);
                    ((Request) (obj)).d(a1);
                    requestqueue.e(((Request) (obj)));
                }

            
            {
                dU = Session.this;
                session = session2;
                eb = s;
                ei = s1;
                super();
            }
            });
            return true;
        }
        return false;
    }

    protected void ad()
    {
        dk = com.sessionm.api.SessionM.EnrollmentResultType.UNAVAILABLE;
        dl = "";
    }

    public String ae()
    {
        String s1 = j("com.sessionm.urls.ads");
        String s = s1;
        if (s1 == null)
        {
            s = Config.f().h();
        }
        return s;
    }

    public String af()
    {
        String s1 = j("com.sessionm.urls.events");
        String s = s1;
        if (s1 == null)
        {
            s = Config.f().g();
        }
        return s;
    }

    public String ag()
    {
        String s1 = j("com.sessionm.urls.optout");
        String s = s1;
        if (s1 == null)
        {
            s = Config.f().g();
        }
        return s;
    }

    public String ah()
    {
        String s1 = j("com.sessionm.urls.portal");
        String s = s1;
        if (s1 == null)
        {
            s = Config.f().i();
        }
        return s;
    }

    public String ai()
    {
        String s1 = j("com.sessionm.urls.session");
        String s = s1;
        if (s1 == null)
        {
            s = Config.f().g();
        }
        return s;
    }

    public void aj()
    {
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("com.sessionm.urls.file", 0).edit();
        editor.clear();
        editor.commit();
_L1:
        return;
        Exception exception;
        exception;
        if (Log.isLoggable("SessionM", 6))
        {
            Log.e("SessionM", String.format("Exception clear host urls...", new Object[0]));
            return;
        }
          goto _L1
    }

    public com.sessionm.b.a am()
    {
        if (dQ == null)
        {
            return an();
        } else
        {
            return dQ;
        }
    }

    public com.sessionm.b.a an()
    {
        Object obj;
        Object obj1;
        com.sessionm.b.a a1;
        PackageManager packagemanager = cf.getPackageManager();
        a1 = com.sessionm.b.a.aJ();
        obj1 = (TelephonyManager)cf.getSystemService("phone");
        Object obj2;
        boolean flag;
        if (obj1 != null)
        {
            Object obj3;
            int i1;
            int j1;
            int k1;
            int l1;
            if (((TelephonyManager) (obj1)).getNetworkCountryIso() == null)
            {
                obj = "unknown";
            } else
            {
                obj = ((TelephonyManager) (obj1)).getNetworkCountryIso();
            }
            a1.put("isocountrycode", ((String) (obj)));
            if (((TelephonyManager) (obj1)).getNetworkOperatorName() == null)
            {
                obj = "unknown";
            } else
            {
                obj = ((TelephonyManager) (obj1)).getNetworkOperatorName();
            }
            a1.put("carriername", ((String) (obj)));
            if (((TelephonyManager) (obj1)).getNetworkOperator() == null)
            {
                obj = "unknown";
            } else
            {
                obj = ((TelephonyManager) (obj1)).getNetworkOperator();
            }
            a1.put("networkoperator", ((String) (obj)));
        } else
        {
            a1.put("isocountrycode", "unknown");
            a1.put("carriername", "unknown");
            a1.put("networkoperator", "unknown");
        }
        obj1 = com.sessionm.core.h.j(cf);
        a1.put("countrycode", String.valueOf(cf.getResources().getConfiguration().mcc));
        obj = cf.getApplicationInfo().packageName;
        a1.put("target_sdk_version", String.format(Locale.US, "%d", new Object[] {
            Integer.valueOf(cf.getApplicationInfo().targetSdkVersion)
        }));
        obj2 = Locale.US;
        if (!dM)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.put("hardware_acceleration_enabled", String.format(((Locale) (obj2)), "%b", new Object[] {
            Boolean.valueOf(flag)
        }));
        a1.put("packagename", ((String) (obj)));
        a1.put("connection", ((String) (obj1)));
        obj2 = (WindowManager)cf.getSystemService("window");
        obj1 = new DisplayMetrics();
        obj2 = ((WindowManager) (obj2)).getDefaultDisplay();
        if (com.sessionm.core.h.m(16))
        {
            ((Display) (obj2)).getRealMetrics(((DisplayMetrics) (obj1)));
        } else
        {
            ((Display) (obj2)).getMetrics(((DisplayMetrics) (obj1)));
        }
        obj1 = String.format(Locale.US, "%dx%d", new Object[] {
            Integer.valueOf(((DisplayMetrics) (obj1)).widthPixels), Integer.valueOf(((DisplayMetrics) (obj1)).heightPixels)
        });
        obj2 = getSDKVersion();
        obj3 = Q();
        if (obj3 != null)
        {
            a1.put("login", ((String) (obj3)));
        } else
        if (com.sessionm.a.a.s(cf))
        {
            String s = com.sessionm.a.a.c("gpadvertiserid", "none");
            flag = com.sessionm.a.a.aH();
            a1.put("transaction_id", s);
            a1.put("gpadvertiserid", s);
            a1.put("limitadtracking", flag);
        } else
        {
            a1.put("transaction_id", com.sessionm.a.a.c("androiddeviceid", "none"));
        }
        obj3 = TimeZone.getDefault().getDisplayName(true, 1);
        a1.put("screen", ((String) (obj1)));
        a1.put("density", String.valueOf(cf.getResources().getDisplayMetrics().density));
        a1.put("brand", com.sessionm.core.h.aE());
        a1.put("platform", "android");
        a1.put("model", com.sessionm.core.h.getModel());
        a1.put("version", android.os.Build.VERSION.INCREMENTAL);
        a1.put("manufacturer", Build.MANUFACTURER);
        a1.put("buildId", Build.DISPLAY);
        a1.put("platform_version", (new StringBuilder()).append("").append(android.os.Build.VERSION.SDK_INT).toString());
        a1.put("sdkVersion", ((String) (obj2)));
        a1.put("locale", Locale.getDefault().toString());
        a1.put("timezone", ((String) (obj3)));
        a1.put("se", as().t());
        a1.put("pid", (new StringBuilder()).append("").append(com.sessionm.core.h.getPid()).toString());
        if (!av().l())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.put("cache_enabled", flag);
        a1.put("cache_size", av().size());
        a1.put("cache_items", av().q());
        a1.put("sc", (new StringBuilder()).append("").append(ao()).toString());
        if (!dc.isEmpty())
        {
            a1.put("plugin_sdk", dc);
            a1.put("plugin_sdk_version", dd);
        }
        a1.put("app_version", packagemanager.getPackageInfo(((String) (obj)), 0).versionName);
        obj1 = packagemanager.getInstallerPackageName(((String) (obj)));
        obj = obj1;
        if (obj1 == null)
        {
            obj = "unknown";
        }
        try
        {
            a1.put("app_installer", ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Exception get installer name: ", ((Throwable) (obj)));
            }
        }
        if (dx)
        {
            a1.put("skip_blacklist", "true");
        }
        i1 = packagemanager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", cf.getPackageName());
        j1 = packagemanager.checkPermission("android.permission.ACCESS_FINE_LOCATION", cf.getPackageName());
        k1 = packagemanager.checkPermission("android.permission.ACCESS_WIFI_STATE", cf.getPackageName());
        l1 = packagemanager.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", cf.getPackageName());
        com.sessionm.b.a a3;
        if (i1 == 0)
        {
            obj1 = (new StringBuilder()).append("").append(",android.permission.ACCESS_COARSE_LOCATION").toString();
        } else
        {
            obj1 = "";
        }
        obj = obj1;
        if (j1 == 0)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(",android.permission.ACCESS_FINE_LOCATION").toString();
        }
        obj1 = obj;
        if (k1 == 0)
        {
            obj1 = (new StringBuilder()).append(((String) (obj))).append(",android.permission.ACCESS_WIFI_STATE").toString();
            dD = true;
        }
        obj = obj1;
        if (l1 == 0)
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append(",android.permission.WRITE_EXTERNAL_STORAGE").toString();
        }
        obj1 = a(i1, j1);
        if (obj1 != null && obj1.length > 1)
        {
            a1.put("latitude", obj1[0]);
            a1.put("longitude", obj1[1]);
        }
        obj1 = obj;
        if (((String) (obj)).startsWith(","))
        {
            obj1 = ((String) (obj)).substring(1);
        }
        a1.put("permissions", ((String) (obj1)));
        obj1 = com.sessionm.b.a.aJ();
        obj2 = H();
        if (obj2 != null)
        {
            obj = com.sessionm.b.a.aJ();
            com.sessionm.b.a a2 = com.sessionm.b.a.aJ();
            for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); a2.put((String)((java.util.Map.Entry) (obj3)).getKey(), (String)((java.util.Map.Entry) (obj3)).getValue()))
            {
                obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
            }

            ((com.sessionm.b.a) (obj)).put("data", a2.aL());
            ((com.sessionm.b.a) (obj1)).put("user", obj);
        }
        a3 = com.sessionm.b.a.aJ();
        if (C().isOptedOut())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        a3.put("opted_out", ((String) (obj)));
        ((com.sessionm.b.a) (obj1)).put("member", a3.aL());
        ((com.sessionm.b.a) (obj1)).put("device", a1.aL());
        dQ = ((com.sessionm.b.a) (obj1));
        return dQ;
    }

    public void ap()
    {
        if (dy != null)
        {
            if (Log.isLoggable("SessionM.Session", 3))
            {
                Log.d("SessionM.Session", "Unclaimed achievement ready in cache.");
            }
            b(dy);
        }
    }

    public com.sessionm.core.d as()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.core.d d1;
        if (dO == null)
        {
            dO = new com.sessionm.core.d(cf);
        }
        d1 = dO;
        this;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public void at()
    {
        this;
        JVM INSTR monitorenter ;
        getListenerHandler().post(new Runnable() {

            final Session dU;

            public void run()
            {
                SessionM sessionm = SessionM.getInstance();
                ActivityListener activitylistener = sessionm.getActivityListener();
                Activity activity;
                if (activitylistener != null)
                {
                    try
                    {
                        activitylistener.onPresented(sessionm);
                    }
                    catch (Throwable throwable1)
                    {
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM", "Exception calling ActivityListener.onPresented()", throwable1);
                        }
                        continue; /* Loop/switch isn't completed */
                    }
                }
_L4:
                activity = dU.K();
                if (!(activity instanceof ActivityListener) || activity == activitylistener)
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                ((ActivityListener)activity).onPresented(sessionm);
_L2:
                return;
                Throwable throwable;
                throwable;
                if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
                Log.e("SessionM", "Exception calling ActivityListener.onPresented()", throwable);
                return;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                dU = Session.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void au()
    {
        getListenerHandler().post(new Runnable() {

            final Session dU;

            public void run()
            {
                SessionM sessionm = SessionM.getInstance();
                ActivityListener activitylistener = sessionm.getActivityListener();
                Activity activity;
                if (activitylistener != null)
                {
                    try
                    {
                        activitylistener.onDismissed(sessionm);
                    }
                    catch (Throwable throwable1)
                    {
                        if (Log.isLoggable("SessionM", 6))
                        {
                            Log.e("SessionM.Session", "Exception calling ActivityListener.onDismissed()", throwable1);
                        }
                        continue; /* Loop/switch isn't completed */
                    }
                }
_L4:
                activity = dU.K();
                if (!(activity instanceof ActivityListener) || activity == activitylistener)
                {
                    break MISSING_BLOCK_LABEL_50;
                }
                ((ActivityListener)activity).onDismissed(sessionm);
_L2:
                return;
                Throwable throwable;
                throwable;
                if (!Log.isLoggable("SessionM", 6)) goto _L2; else goto _L1
_L1:
                Log.e("SessionM.Session", "Exception calling ActivityListener.onDismissed()", throwable);
                return;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                dU = Session.this;
                super();
            }
        });
    }

    public com.sessionm.core.b av()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.core.b b1;
        if (dP == null)
        {
            dP = new com.sessionm.core.b(cf, getExecutorService());
        }
        b1 = dP;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        RequestQueue requestqueue;
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("Set request send time threshold: ").append(l1).toString());
        }
        requestqueue = N();
        if (requestqueue == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        requestqueue.d(l1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(AchievementActivity achievementactivity)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        achievementactivity = (AchievementImpl)achievementactivity.getAchievement();
        obj = Config.f().getValue("api.version");
        achievementactivity = String.format("%s/v%s/apps/%s/awards/%s/ads", new Object[] {
            ae(), obj, db, achievementactivity.getAchievementId()
        });
        obj = K();
        if (obj == null) goto _L2; else goto _L1
_L1:
        SessionMActivity.startSessionMActivity(((Context) (obj)), achievementactivity, null, false);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("SessionM.Session", 6))
        {
            Log.e("SessionM.Session", "Cannot claim custom achievement since this is visible activity.");
        }
        if (true) goto _L4; else goto _L3
_L3:
        achievementactivity;
        throw achievementactivity;
    }

    public void b(SessionListener sessionlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (sessionlistener == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        al().remove(sessionlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        sessionlistener;
        throw sessionlistener;
    }

    public void b(RequestQueue requestqueue)
    {
    }

    public void b(RequestQueue requestqueue, Request request)
    {
        ar();
        if (request.bd().bh())
        {
            if ((request.aS() == com.sessionm.net.Request.Type.gN || request.aS() == com.sessionm.net.Request.Type.gM) && getSessionState() == com.sessionm.api.SessionM.State.STOPPING)
            {
                ab();
            } else
            {
                if (request.aS() == com.sessionm.net.Request.Type.gL)
                {
                    a(request);
                }
                if (request.aS() == com.sessionm.net.Request.Type.gO || request.aS() == com.sessionm.net.Request.Type.gY || request.aS() == com.sessionm.net.Request.Type.gZ || request.aS() == com.sessionm.net.Request.Type.ha)
                {
                    b(request);
                }
                if (request.bd() == com.sessionm.net.Request.State.gI)
                {
                    requestqueue = request.aZ();
                    if (requestqueue != null)
                    {
                        a(requestqueue);
                        return;
                    }
                }
            }
        }
    }

    public void b(ActivityController activitycontroller)
    {
        this;
        JVM INSTR monitorenter ;
        if (df == activitycontroller)
        {
            df = null;
            dg = null;
        }
        Y();
        this;
        JVM INSTR monitorexit ;
        return;
        activitycontroller;
        throw activitycontroller;
    }

    void b(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            try
            {
                android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("com.sessionm.urls.file", 0).edit();
                editor.putString(s1, s);
                editor.commit();
                return;
            }
            catch (Exception exception) { }
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", String.format("Exception saving url %s with key: %s", new Object[] {
                    s, s1
                }));
                return;
            }
        }
    }

    boolean b(Context context, String s)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.State state;
        ar();
        state = getSessionState();
        if (state == com.sessionm.api.SessionM.State.STOPPED) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "Starting session - already started.");
        }
        boolean flag = flag1;
        if (state != com.sessionm.api.SessionM.State.STOPPING)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        dR = RestartAfterStop.eq;
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!l())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "Starting session - disabled.");
        }
        l(de);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        context;
        throw context;
        cf = context.getApplicationContext();
        if (cf.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", cf.getPackageName()) == 0)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        if (Log.isLoggable("SessionM.Session", 6))
        {
            Log.e("SessionM.Session", String.format("ACCESS_NETWORK_STATE permissions are not defined in the manifest. This is a requirement for starting a session.", new Object[0]));
        }
        l(6);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        context = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", "looking for app id specified in the manifest");
        }
        context = cf.getPackageName();
        context = cf.getPackageManager().getApplicationInfo(context, 128);
        flag = flag1;
        if (context == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ApplicationInfo) (context)).metaData == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = ((ApplicationInfo) (context)).metaData.getString("com.sessionm.appid");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        if (Log.isLoggable("SessionM.Session", 4))
        {
            Log.i("SessionM", "Starting session");
        }
        if (n(context))
        {
            break MISSING_BLOCK_LABEL_370;
        }
        l(5);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        context;
        flag = flag1;
        if (!Log.isLoggable("SessionM.Session", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("SessionM", "Error querying manifest for app id - session not started", context);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        flag = flag1;
        if (!Log.isLoggable("SessionM", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d("SessionM", "App id is not specified as either startSession() parameter or in the manifest - session not started.");
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (!C().isOptedOut())
        {
            break MISSING_BLOCK_LABEL_409;
        }
        flag = flag1;
        if (!Log.isLoggable("SessionM.Session", 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d("SessionM.Session", "User is opted out of mPOINTS not starting a session.");
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        a(com.sessionm.api.SessionM.State.STARTING);
        getExecutorService().execute(new Runnable() {

            final Session dU;

            public void run()
            {
                com.sessionm.a.a.r(dU.getApplicationContext());
                Object obj = dU.an();
                synchronized (dU)
                {
                    Object obj2 = dU.N();
                    ((RequestQueue) (obj2)).start();
                    Object obj1 = com.sessionm.core.e.u();
                    obj2 = ((e) (obj1)).a((com.sessionm.c.c)((RequestQueue) (obj2)).bn().get(0), (com.sessionm.c.c)((RequestQueue) (obj2)).bn().get(1));
                    StatsCollector.reset();
                    CookieSyncManager.createInstance(dU.getApplicationContext());
                    ((e) (obj1)).w();
                    obj1 = new Request(com.sessionm.net.Request.Type.gL, new Object[] {
                        dU.E()
                    });
                    ((com.sessionm.b.a) (obj)).put("sessions", obj2);
                    ((com.sessionm.b.a) (obj)).put("stats", StatsCollector.i(Session.h(dU)).aL());
                    if (Session.g(dU) == 0L)
                    {
                        com.sessionm.core.Session.a(dU, System.currentTimeMillis());
                    }
                    ((com.sessionm.b.a) (obj)).put("e", Session.i(dU).aL());
                    ((Request) (obj1)).d(((com.sessionm.b.a) (obj)));
                    obj = dU.N();
                    ((RequestQueue) (obj)).a(dU);
                    ((RequestQueue) (obj)).e(((Request) (obj1)));
                    Session.e(dU);
                    if (((RequestQueue) (obj)).bl() > 0L)
                    {
                        dU.a(com.sessionm.api.SessionM.State.STARTED_OFFLINE);
                    }
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                super();
            }
        });
        db = context;
        ButtonManager.getInstance();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public transient boolean b(com.sessionm.api.Activity activity, Object aobj[])
    {
        boolean flag1 = false;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.ActivityType activitytype = activity.getActivityType();
        if (getSessionState().isStarted() || activitytype == com.sessionm.api.SessionM.ActivityType.PORTAL) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        if (!Log.isLoggable("SessionM.Session", 3))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        Log.d("SessionM.Session", (new StringBuilder()).append("Can't present in offline state, type: ").append(activity.getActivityType()).toString());
        flag1 = flag;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        Activity activity1 = a(activity, aobj);
        if (activity1 != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        flag1 = flag;
        if (!Log.isLoggable("SessionM.Session", 3)) goto _L4; else goto _L3
_L3:
        Log.d("SessionM.Session", (new StringBuilder()).append("Can't present when presenting activity is null, type: ").append(activity.getActivityType()).toString());
        flag1 = flag;
          goto _L4
        activity;
        throw activity;
        Object obj = L();
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (!activity.isAndroidActivity() && ((ActivityController) (obj)).isInForeground()) goto _L8; else goto _L7
_L7:
        dismissActivity();
_L6:
        if (activitytype != com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT) goto _L10; else goto _L9
_L9:
        if (dy != null) goto _L12; else goto _L11
_L11:
        flag1 = flag;
        if (!Log.isLoggable("SessionM.Session", 3)) goto _L4; else goto _L13
_L13:
        Log.d("SessionM.Session", (new StringBuilder()).append("Can't present when achievement data is null, type: ").append(activity.getActivityType()).toString());
        flag1 = flag;
          goto _L4
_L8:
        flag1 = flag;
        if (!Log.isLoggable("SessionM.Session", 3)) goto _L4; else goto _L14
_L14:
        Log.d("SessionM.Session", (new StringBuilder()).append("Can't present when in background state, type: ").append(activity.getActivityType()).toString());
        flag1 = flag;
          goto _L4
_L12:
        aobj = dy.d();
        int i1 = ((com.sessionm.b.a) (aobj)).getInt("cache_content_id");
        obj = av().f(i1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_372;
        }
        flag1 = flag;
        if (!Log.isLoggable("SessionM.Session", 3)) goto _L4; else goto _L15
_L15:
        Log.d("SessionM.Session", (new StringBuilder()).append("Can't present when achievement content is null, type: ").append(activity.getActivityType()).toString());
        flag1 = flag;
          goto _L4
        String s = ((com.sessionm.b.a) (obj)).getString("url");
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (Log.isLoggable("SessionM.Session", 6))
        {
            Log.e("SessionM.Session", String.format(Locale.US, "%s cache item has null url", new Object[] {
                ((com.sessionm.b.a) (obj)).aL().toString()
            }));
        }
        aobj = ActivityController.createActivityController(activity1, s, new Object[] {
            aobj, ((com.sessionm.b.a) (obj)).B("data")
        });
        ((ActivityController) (aobj)).setProvidedView(a(activity1));
        ((ActivityController) (aobj)).present(true);
        a(((ActivityController) (aobj)));
        dy.a(AchievementImpl.AchievementState.U);
        dy = null;
        flag = true;
_L19:
        dg = activity;
        flag1 = flag;
        if (!flag) goto _L4; else goto _L16
_L16:
        flag1 = flag;
        if (!Log.isLoggable("SessionM", 4)) goto _L4; else goto _L17
_L17:
        Log.i("SessionM", (new StringBuilder()).append("Presenting activity, type: ").append(activitytype).append(", presenting Android activity: ").append(activity1).toString());
        flag1 = flag;
          goto _L4
_L10:
        if (activitytype != com.sessionm.api.SessionM.ActivityType.INTERSTITIAL)
        {
            break MISSING_BLOCK_LABEL_617;
        }
        aobj = dP.n();
        flag = flag1;
        if (aobj == null) goto _L19; else goto _L18
_L18:
        com.sessionm.b.a a1 = ((com.sessionm.b.a) (aobj)).B("data");
        flag = SessionMActivity.startSessionMActivity(activity1, ((com.sessionm.b.a) (aobj)).getString("url"), a1, true);
          goto _L19
        flag = SessionMActivity.startSessionMActivity(activity1, com.sessionm.core.h.a(activity.getActivityType(), ah(), E(), C().isOptedOut(), aobj), null, true);
          goto _L19
    }

    public void c(RequestQueue requestqueue)
    {
    }

    public boolean c(RequestQueue requestqueue, Request request)
    {
        return request.aS().equals(com.sessionm.net.Request.Type.gL);
    }

    public boolean collectsLocation()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        SharedPreferences sharedpreferences = cf.getSharedPreferences("com.sessionm.location", 0);
        if (dL)
        {
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.clear();
            editor.commit();
        }
        flag = sharedpreferences.getBoolean("com.sessionm.location.collect", true);
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        flag = flag1;
        if (!Log.isLoggable("SessionM", 6))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e("SessionM", String.format((new StringBuilder()).append("Exception collect location: ").append(obj).toString(), new Object[0]));
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public void d(boolean flag)
    {
        dM = flag;
    }

    public void dismissActivity()
    {
        this;
        JVM INSTR monitorenter ;
        ActivityController activitycontroller = L();
        if (activitycontroller == null) goto _L2; else goto _L1
_L1:
        activitycontroller.dismiss();
        dg = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (dg instanceof AchievementActivity)
        {
            au();
            dg = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void e(boolean flag)
    {
        dD = flag;
    }

    public boolean enrollWithData(Map map)
    {
        di = new HashMap(map);
        String s = (String)di.get("email");
        map = (String)di.get("yob");
        dk = com.sessionm.api.SessionM.EnrollmentResultType.UNAVAILABLE;
        if (!com.sessionm.core.h.a(s) || com.sessionm.core.h.v(map) == -1 || getSessionState() != com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            if (getSessionState() != com.sessionm.api.SessionM.State.STARTED_ONLINE)
            {
                dk = com.sessionm.api.SessionM.EnrollmentResultType.FAILURE;
            }
            return false;
        }
        if (!map.isEmpty())
        {
            map = Integer.toString(com.sessionm.core.h.v(map));
        } else
        {
            map = "";
        }
        di.put("age", map);
        getExecutorService().execute(new Runnable(s) {

            final Session dU;
            final String eb;

            public void run()
            {
                this;
                JVM INSTR monitorenter ;
                RequestQueue requestqueue = dU.N();
                com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
                a1.put("user[data][email]", eb);
                a1.put("user[data][age]", (String)com.sessionm.core.Session.a(dU).get("age"));
                a1.put("user[data][gender]", (String)com.sessionm.core.Session.a(dU).get("gender"));
                a1.put("user[data][profile_image_url]", (String)com.sessionm.core.Session.a(dU).get("profile_image_url"));
                a1.put("user[data][first_name]", (String)com.sessionm.core.Session.a(dU).get("first_name"));
                a1.put("user[data][last_name]", (String)com.sessionm.core.Session.a(dU).get("last_name"));
                a1.put("user[data][zip_code]", (String)com.sessionm.core.Session.a(dU).get("zip_code"));
                Request request = new Request(com.sessionm.net.Request.Type.gO);
                request.d(a1);
                requestqueue.e(request);
                this;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                this;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                eb = s;
                super();
            }
        });
        return true;
    }

    public boolean enrollWithEmail(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", s);
        hashmap.put("yob", s1);
        return enrollWithData(hashmap);
    }

    public void f(com.sessionm.core.b b1)
    {
        dP = b1;
    }

    public Context getApplicationContext()
    {
        this;
        JVM INSTR monitorenter ;
        Context context = cf;
        this;
        JVM INSTR monitorexit ;
        return context;
        Exception exception;
        exception;
        throw exception;
    }

    public com.sessionm.api.Activity getCurrentActivity()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.Activity activity = dg;
        this;
        JVM INSTR monitorexit ;
        return activity;
        Exception exception;
        exception;
        throw exception;
    }

    public ExecutorService getExecutorService()
    {
        this;
        JVM INSTR monitorenter ;
        ExecutorService executorservice;
        if (ck == null)
        {
            ck = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(50));
            ((ThreadPoolExecutor)ck).setThreadFactory(new ThreadFactory() {

                final Session dU;

                public Thread newThread(Runnable runnable)
                {
                    runnable = new Thread(runnable);
                    runnable.setName("SessionM Session Thread");
                    return runnable;
                }

            
            {
                dU = Session.this;
                super();
            }
            });
        }
        executorservice = ck;
        this;
        JVM INSTR monitorexit ;
        return executorservice;
        Exception exception;
        exception;
        throw exception;
    }

    public int getFragmentFrameLayoutId()
    {
        return fragmentFrameLayoutId;
    }

    public Handler getListenerHandler()
    {
        this;
        JVM INSTR monitorenter ;
        Handler handler = dB;
        this;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    public String getPluginSDKName()
    {
        return dc;
    }

    public String getPluginSDKVersion()
    {
        return dd;
    }

    public int getRequestCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = N().bq();
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public String getResponseErrorMessage()
    {
        if (dl != null)
        {
            return dl;
        } else
        {
            return "";
        }
    }

    public String getSDKVersion()
    {
        return Config.f().getValue("sdk.version");
    }

    public com.sessionm.api.SessionM.State getSessionState()
    {
        this;
        JVM INSTR monitorenter ;
        com.sessionm.api.SessionM.State state = dq;
        this;
        JVM INSTR monitorexit ;
        return state;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean getShouldAutoUpdateAchievementsList()
    {
        return dA;
    }

    public AchievementData getUnclaimedAchievement()
    {
        this;
        JVM INSTR monitorenter ;
        AchievementImpl achievementimpl = dy;
        this;
        JVM INSTR monitorexit ;
        return achievementimpl;
        Exception exception;
        exception;
        throw exception;
    }

    public void i(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        de = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void i(String s)
    {
        this;
        JVM INSTR monitorenter ;
        logAction(s, 0);
        getExecutorService().execute(new Runnable() {

            final Session dU;

            public void run()
            {
                synchronized (dU)
                {
                    if (Session.g(dU) != 0L)
                    {
                        com.sessionm.core.StatsCollector.a(StatsCollector.Stat.eC, System.currentTimeMillis() - Session.g(dU));
                    }
                    if (Session.D().getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
                    {
                        com.sessionm.core.Session.a(dU, false);
                    }
                }
                return;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public boolean isAutopresentMode()
    {
        return dz;
    }

    public boolean isExpandedPresentationMode()
    {
        return dE;
    }

    public boolean isHardwareAccelerationDisabled()
    {
        return dM;
    }

    public boolean isSessionAutoStartEnabled()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = dJ;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    String j(String s)
    {
        String s1 = null;
        if (cf != null)
        {
            s1 = cf.getSharedPreferences("com.sessionm.urls.file", 0).getString(s, null);
        }
        return s1;
    }

    public void j(int i1)
    {
        int j1 = i1;
        if (i1 <= 0)
        {
            j1 = 600;
        }
        dG = j1;
    }

    public void logAction(final String action, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l() || action == null) goto _L2; else goto _L1
_L1:
        if (action.length() != 0 && dq != com.sessionm.api.SessionM.State.STOPPING && !C().isOptedOut()) goto _L3; else goto _L2
_L2:
        if (Log.isLoggable("SessionM.Session", 5))
        {
            Log.w("SessionM.Session", String.format("Throwing out log action for action : %s", new Object[] {
                action
            }));
        }
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (dq == com.sessionm.api.SessionM.State.STOPPED && isSessionAutoStartEnabled())
        {
            a(cf, db);
        }
        if (Log.isLoggable("SessionM", 4))
        {
            Log.i("SessionM", (new StringBuilder()).append("Log action ").append(action).toString());
        }
        getExecutorService().execute(new Runnable(i1) {

            final Session dU;
            final int el;
            final String val$action;

            public void run()
            {
                Session session = dU;
                session;
                JVM INSTR monitorenter ;
                Object obj;
                Session.e(dU);
                com.sessionm.core.Session.a(dU, action, el);
                obj = Session.b(dU, action, el);
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_57;
                }
                com.sessionm.core.Session.a(dU, ((AchievementImpl) (obj)));
                if (obj == null) goto _L2; else goto _L1
_L1:
                com.sessionm.core.Session.a(dU, false);
_L4:
                session;
                JVM INSTR monitorexit ;
                return;
_L2:
                obj = dU.N();
                if (obj == null) goto _L4; else goto _L3
_L3:
                if (Session.f(dU) != com.sessionm.api.SessionM.State.STARTED_OFFLINE || ((RequestQueue) (obj)).br() != com.sessionm.net.RequestQueue.RequestQueueSendState.hC) goto _L4; else goto _L5
_L5:
                ((RequestQueue) (obj)).bi();
                  goto _L4
                Exception exception;
                exception;
                session;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                action = s;
                el = i1;
                super();
            }
        });
        if (true) goto _L5; else goto _L4
_L4:
        action;
        throw action;
    }

    public void logOutUser()
    {
        final Session session = D();
        session.getExecutorService().execute(new Runnable() {

            final Session dU;
            final Session val$session;

            public void run()
            {
                session.N().e(new Request(com.sessionm.net.Request.Type.ha));
            }

            
            {
                dU = Session.this;
                session = session2;
                super();
            }
        });
    }

    public void logPaymentTransaction(float f1)
    {
        if (cf != null)
        {
            getExecutorService().execute(new Runnable(f1) {

                final Session dU;
                final float ef;

                public void run()
                {
                    dU.as().a(ef);
                }

            
            {
                dU = Session.this;
                ef = f1;
                super();
            }
            });
        }
        com.sessionm.core.d.s();
    }

    public void onActivityPause(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (!dE)
        {
            c(activity);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void onActivityResume(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (!cI)
        {
            cI = true;
            (new b()).execute(new Context[] {
                activity.getApplicationContext()
            });
        }
        if (!dE)
        {
            b(activity);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void onActivityStart(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        if (ds.size() == 0 && cD == 0L)
        {
            cD = System.currentTimeMillis();
        }
        ds.add(activity);
        if (dE)
        {
            b(activity);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void onActivityStop(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        ds.remove(activity);
        if (dE)
        {
            c(activity);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    public void setAppKey(String s)
    {
        db = s;
    }

    public void setApplicationContext(Context context)
    {
        cf = context;
    }

    public void setAutopresentMode(boolean flag)
    {
        dz = flag;
    }

    public void setCollectionLocation(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = cf.getSharedPreferences("com.sessionm.location", 0).edit();
        editor.putBoolean("com.sessionm.location.collect", flag);
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setExecutorService(ExecutorService executorservice)
    {
        this;
        JVM INSTR monitorenter ;
        if (executorservice != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new NullPointerException("executorService is null");
        executorservice;
        this;
        JVM INSTR monitorexit ;
        throw executorservice;
        ck = executorservice;
        this;
        JVM INSTR monitorexit ;
    }

    public void setExpandedPresentationMode(boolean flag)
    {
        if (Log.isLoggable("SessionM", 4))
        {
            Log.i("SessionM", (new StringBuilder()).append("Set expanded presentation mode: ").append(flag).toString());
        }
        dE = flag;
    }

    public void setFragmentFrameLayoutId(int i1)
    {
        fragmentFrameLayoutId = i1;
    }

    public void setListenerHandler(Handler handler)
    {
        this;
        JVM INSTR monitorenter ;
        if (handler != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dB = handler;
        if (true) goto _L1; else goto _L3
_L3:
        handler;
        throw handler;
    }

    public void setMetaData(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (s != null && s1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new NullPointerException();
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (dh == null)
        {
            dh = new HashMap();
        }
        dh.put(s, s1);
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", (new StringBuilder()).append("Set meta data, key: ").append(s).append(", value: ").append(s1).toString());
        }
        this;
        JVM INSTR monitorexit ;
    }

    public void setMetaData(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        dh = new HashMap(map);
_L1:
        if (Log.isLoggable("SessionM", 3))
        {
            Log.d("SessionM", (new StringBuilder()).append("Set meta data: ").append(map).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        dh = null;
          goto _L1
        map;
        throw map;
    }

    public void setPluginSDK(String s, String s1)
    {
        dc = s;
        dd = s1;
    }

    public void setSessionAutoStartEnabled(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        dJ = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setShouldAutoUpdateAchievementsList(boolean flag)
    {
        if (Log.isLoggable("SessionM.Session", 3))
        {
            Log.d("SessionM.Session", (new StringBuilder()).append("ShouldAutoUpdateAchievementsList is set to: ").append(flag).toString());
        }
        dA = flag;
    }

    public void setSkipBlacklist(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        dx = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean signUpUserWithData(Map map)
    {
        final Session session = D();
        if (session.dI == null)
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Session is not authenticated. Will cancel sign in.");
            }
            return false;
        }
        session.ad();
        map = new HashMap(map);
        if (!com.sessionm.core.h.a((CharSequence)map.get(SessionM.USER_DATA_EMAIL_KEY)) || !com.sessionm.core.h.b((CharSequence)map.get(SessionM.USER_DATA_PASSWORD_KEY)) || !com.sessionm.core.h.u((String)map.get(SessionM.USER_DATA_BIRTH_YEAR_KEY)) || !com.sessionm.core.h.c((CharSequence)map.get(SessionM.USER_DATA_GENDER_KEY)))
        {
            if (Log.isLoggable("SessionM", 6))
            {
                Log.e("SessionM", "Attempt to sign up with invalid user data. Will cancel sign up.");
            }
            return false;
        } else
        {
            session.getExecutorService().execute(new Runnable(map) {

                final Session dU;
                final Map ej;
                final Session val$session;

                public void run()
                {
                    this;
                    JVM INSTR monitorenter ;
                    RequestQueue requestqueue = session.N();
                    com.sessionm.b.a a1 = com.sessionm.b.a.aJ();
                    Object obj = com.sessionm.b.a.aJ();
                    ((com.sessionm.b.a) (obj)).put("email", (String)ej.get(SessionM.USER_DATA_EMAIL_KEY));
                    ((com.sessionm.b.a) (obj)).put("birth_year", (String)ej.get(SessionM.USER_DATA_BIRTH_YEAR_KEY));
                    ((com.sessionm.b.a) (obj)).put("gender", (String)ej.get(SessionM.USER_DATA_GENDER_KEY));
                    ((com.sessionm.b.a) (obj)).put("zip", (String)ej.get(SessionM.USER_DATA_ZIP_CODE_KEY));
                    ((com.sessionm.b.a) (obj)).put("password", (String)ej.get(SessionM.USER_DATA_PASSWORD_KEY));
                    ((com.sessionm.b.a) (obj)).put("tos", 1);
                    a1.put("member", obj);
                    a1.put("authenticity_token", session.dI);
                    a1.put("confirm_account", true);
                    obj = new Request(com.sessionm.net.Request.Type.gZ);
                    ((Request) (obj)).d(a1);
                    requestqueue.e(((Request) (obj)));
                    this;
                    JVM INSTR monitorexit ;
                    return;
                    Exception exception;
                    exception;
                    this;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                dU = Session.this;
                session = session2;
                ej = map;
                super();
            }
            });
            return true;
        }
    }

    public void stopSession()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = getSessionState().isStarted();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ActivityController activitycontroller;
        Z();
        activitycontroller = L();
        if (activitycontroller == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        activitycontroller.dismiss();
        Exception exception;
        if (getSessionState() == com.sessionm.api.SessionM.State.STARTED_ONLINE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(com.sessionm.api.SessionM.State.STOPPING);
        if (Log.isLoggable("SessionM.Session", 4))
        {
            Log.i("SessionM.Session", "Stopping session.");
        }
        getExecutorService().execute(new Runnable(flag) {

            final Session dU;
            final boolean ek;

            public void run()
            {
                boolean flag1 = true;
                Session session = dU;
                session;
                JVM INSTR monitorenter ;
                Locale locale;
                if (!dU.C().isOptedOut() && !Session.b(dU) && (ek || dU.N().br() != com.sessionm.net.RequestQueue.RequestQueueSendState.hC))
                {
                    break MISSING_BLOCK_LABEL_121;
                }
                if (!Log.isLoggable("SessionM.Session", 3))
                {
                    break MISSING_BLOCK_LABEL_111;
                }
                locale = Locale.US;
                Exception exception1;
                if (ek)
                {
                    flag1 = false;
                }
                Log.d("SessionM.Session", String.format(locale, "stopping offline(%b)/refused(%b) session. ", new Object[] {
                    Boolean.valueOf(flag1), Boolean.valueOf(Session.b(dU))
                }));
                Session.c(dU);
                return;
                com.sessionm.core.Session.d(dU);
                return;
                exception1;
                session;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                dU = Session.this;
                ek = flag;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public boolean updateAchievementsList()
    {
        getExecutorService().execute(new Runnable() {

            final Session dU;

            public void run()
            {
                this;
                JVM INSTR monitorenter ;
                RequestQueue requestqueue = dU.N();
                if (requestqueue != null)
                {
                    break MISSING_BLOCK_LABEL_17;
                }
                this;
                JVM INSTR monitorexit ;
                return;
                requestqueue.e(new Request(com.sessionm.net.Request.Type.gU, new Object[] {
                    dU.E()
                }));
                this;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                this;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                dU = Session.this;
                super();
            }
        });
        return true;
    }

    static 
    {
        boolean flag;
        if (!com/sessionm/core/Session.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        cI = false;
    }
}
