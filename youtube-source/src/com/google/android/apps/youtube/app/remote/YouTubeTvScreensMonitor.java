// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.apps.youtube.app.ac;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.async.b;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.y;
import com.google.android.apps.ytremote.b.j;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.SsdpId;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bh, bw, bk, co, 
//            bx, cl, cm, bz, 
//            by, YouTubeTvScreen, cc, cd, 
//            cj, cp, cn, cg, 
//            ck, ca, ce, bi

public final class YouTubeTvScreensMonitor
    implements bh
{

    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    private final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    private final com.google.android.apps.youtube.common.a.b e = new co(this, (byte)0);
    private final bw f;
    private final bk g;
    private final SharedPreferences h;
    private final Context i;
    private final Map j = new ConcurrentHashMap();
    private final Map k = new ConcurrentHashMap();
    private final Map l = new ConcurrentHashMap();
    private final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    private final Handler n;
    private final h o;
    private final com.google.android.apps.ytremote.logic.b p = new j();
    private boolean q;
    private boolean r;
    private final Executor s;
    private final ac t;
    private final boolean u;
    private final Set v = new HashSet();

    public YouTubeTvScreensMonitor(Executor executor, bw bw1, h h1, bk bk1, SharedPreferences sharedpreferences, boolean flag, ac ac1, 
            Context context, l l1)
    {
        f = (bw)com.google.android.apps.youtube.common.fromguava.c.a(bw1);
        o = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        g = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1, "youTubeTvRemoteControl can not be null");
        h = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        s = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        u = flag;
        t = (ac)com.google.android.apps.youtube.common.fromguava.c.a(ac1);
        i = context;
        executor.execute(new bx(this, sharedpreferences));
        bk1.a(new cl(this, (byte)0));
        bk1.a(new cm(this, (byte)0));
        n = new bz(this, h1, bw1, bk1, com.google.android.apps.youtube.core.async.b.a(executor, new by(this, new com.google.android.apps.ytremote.b.c())));
        executor = new IntentFilter();
        executor.addAction("com.google.android.c2dm.intent.RECEIVE");
        executor.addCategory("com.google.android.youtube");
        context.registerReceiver(new PushNotificationsBroadcastReceiver(bw1, l1, bk1), executor, "com.google.android.c2dm.permission.SEND", null);
    }

    static YouTubeTvScreen a(YouTubeTvScreensMonitor youtubetvscreensmonitor, SsdpId ssdpid)
    {
        return youtubetvscreensmonitor.a(ssdpid);
    }

    private YouTubeTvScreen a(SsdpId ssdpid)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            YouTubeTvScreen youtubetvscreen = (YouTubeTvScreen)iterator.next();
            if (youtubetvscreen.getDevice().getSsdpId().equals(ssdpid))
            {
                return youtubetvscreen;
            }
        }

        return null;
    }

    static String a(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeDevice youtubedevice)
    {
        return youtubetvscreensmonitor.a(youtubedevice);
    }

    private String a(YouTubeDevice youtubedevice)
    {
        this;
        JVM INSTR monitorenter ;
        a(h);
        if (!k.containsKey(youtubedevice.getSsdpId())) goto _L2; else goto _L1
_L1:
        youtubedevice = (String)k.get(youtubedevice.getSsdpId());
_L4:
        this;
        JVM INSTR monitorexit ;
        return youtubedevice;
_L2:
        youtubedevice = youtubedevice.getDeviceName();
        if (true) goto _L4; else goto _L3
_L3:
        youtubedevice;
        throw youtubedevice;
    }

    private void a(SharedPreferences sharedpreferences)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = r;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!sharedpreferences.contains("dial_device_ids")) goto _L1; else goto _L3
_L3:
        String as[];
        as = sharedpreferences.getString("dial_device_ids", "").split(",");
        sharedpreferences = sharedpreferences.getString("dial_device_names", "").split(",");
        int i1 = 0;
_L4:
        if (i1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        Object obj = as[i1];
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new SsdpId(((String) (obj)));
            m.add(obj);
            k.put(obj, sharedpreferences[i1]);
        }
        break MISSING_BLOCK_LABEL_135;
        r = true;
          goto _L1
        sharedpreferences;
        throw sharedpreferences;
        i1++;
          goto _L4
    }

    private void a(YouTubeTvScreen youtubetvscreen)
    {
        n.post(new cc(this, youtubetvscreen));
    }

    private void a(YouTubeTvScreen youtubetvscreen, int i1)
    {
        YouTubeTvScreen youtubetvscreen1 = a(youtubetvscreen.getDevice().getSsdpId());
        if (youtubetvscreen1 != null)
        {
            c((new StringBuilder("Removing duplicate device ")).append(youtubetvscreen1).toString());
            c(youtubetvscreen1);
        }
        c.add(youtubetvscreen);
        if (i1 == -1)
        {
            b.add(youtubetvscreen);
        } else
        {
            b.add(i1, youtubetvscreen);
        }
        a(youtubetvscreen);
    }

    static void a(YouTubeTvScreensMonitor youtubetvscreensmonitor, SharedPreferences sharedpreferences)
    {
        youtubetvscreensmonitor.a(sharedpreferences);
    }

    static void a(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        youtubetvscreensmonitor.a(youtubetvscreen, -1);
    }

    static void a(YouTubeTvScreensMonitor youtubetvscreensmonitor, String s1)
    {
        youtubetvscreensmonitor.c(s1);
    }

    static boolean a(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.q;
    }

    static com.google.android.apps.youtube.common.a.b b(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.e;
    }

    private void b(YouTubeTvScreen youtubetvscreen)
    {
        n.post(new cd(this, youtubetvscreen));
    }

    private void b(YouTubeTvScreen youtubetvscreen, int i1)
    {
        if (b.contains(youtubetvscreen))
        {
            return;
        }
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            YouTubeTvScreen youtubetvscreen1 = (YouTubeTvScreen)iterator.next();
            if (youtubetvscreen1.getScreen().getScreenId().equals(youtubetvscreen.getScreen().getScreenId()))
            {
                c((new StringBuilder("Removing duplicate screen ")).append(youtubetvscreen1).toString());
                d(youtubetvscreen1);
            }
        } while (true);
        d.add(youtubetvscreen);
        if (i1 == -1)
        {
            b.add(youtubetvscreen);
        } else
        {
            b.add(i1, youtubetvscreen);
        }
        a(youtubetvscreen);
    }

    static void b(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        youtubetvscreensmonitor.b(youtubetvscreen, -1);
    }

    static CopyOnWriteArrayList c(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.b;
    }

    private void c()
    {
        n.removeMessages(2);
        if (!o.c() && !o.d() || !o.a())
        {
            if (!c.isEmpty())
            {
                c("Not connected to wifi/eth or network not available. Will mark all devices as unavailable.");
            }
            YouTubeTvScreen youtubetvscreen;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); b(youtubetvscreen))
            {
                youtubetvscreen = (YouTubeTvScreen)iterator.next();
                b.remove(youtubetvscreen);
            }

            c.clear();
            return;
        } else
        {
            Set set = y.a(new ConcurrentHashMap());
            set.addAll(c);
            n.sendMessageDelayed(Message.obtain(n, 2, set), 9500L);
            c("Starting new DIAL search.");
            p.a(new cj(this, set));
            return;
        }
    }

    private void c(YouTubeTvScreen youtubetvscreen)
    {
        c((new StringBuilder("Removing dial device ")).append(youtubetvscreen).toString());
        c.remove(youtubetvscreen);
        b.remove(youtubetvscreen);
        l.remove(youtubetvscreen.getDevice().getSsdpId());
        b(youtubetvscreen);
    }

    static void c(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        youtubetvscreensmonitor.b(youtubetvscreen);
    }

    private void c(String s1)
    {
        if (u || "true".equalsIgnoreCase(t.a("enable_mdx_logs", "")))
        {
            Log.d("YouTube MDX", s1);
        }
    }

    private void d(YouTubeTvScreen youtubetvscreen)
    {
        c((new StringBuilder("Removing cloud screen ")).append(youtubetvscreen).toString());
        d.remove(youtubetvscreen);
        b.remove(youtubetvscreen);
        b(youtubetvscreen);
    }

    static void d(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        YouTubeTvScreen youtubetvscreen;
        for (Iterator iterator = youtubetvscreensmonitor.d.iterator(); iterator.hasNext(); youtubetvscreensmonitor.b(youtubetvscreen))
        {
            youtubetvscreen = (YouTubeTvScreen)iterator.next();
            youtubetvscreensmonitor.b.remove(youtubetvscreen);
        }

        youtubetvscreensmonitor.d.clear();
    }

    static void d(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        youtubetvscreensmonitor.d(youtubetvscreen);
    }

    static Handler e(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.n;
    }

    static void e(YouTubeTvScreensMonitor youtubetvscreensmonitor, YouTubeTvScreen youtubetvscreen)
    {
        youtubetvscreensmonitor.c(youtubetvscreen);
    }

    static void f(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        youtubetvscreensmonitor.c();
    }

    static Map g(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.l;
    }

    static Map h(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.j;
    }

    static CopyOnWriteArrayList i(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.a;
    }

    static Map j(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.k;
    }

    static CopyOnWriteArrayList k(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.m;
    }

    static SharedPreferences l(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.h;
    }

    static CopyOnWriteArrayList m(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.d;
    }

    static bk n(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.g;
    }

    static Context o(YouTubeTvScreensMonitor youtubetvscreensmonitor)
    {
        return youtubetvscreensmonitor.i;
    }

    public final List a()
    {
        return b;
    }

    public final void a(YouTubeTvScreen youtubetvscreen, com.google.android.apps.youtube.common.a.b b1)
    {
        if (youtubetvscreen.hasScreen())
        {
            d(youtubetvscreen);
            f.a(youtubetvscreen.getScreen().getScreenId(), new cp(youtubetvscreen, b1));
        }
    }

    public final void a(YouTubeTvScreen youtubetvscreen, String s1, com.google.android.apps.youtube.common.a.b b1)
    {
        int i1 = b.indexOf(youtubetvscreen);
        if (youtubetvscreen.hasDevice())
        {
            s1 = new YouTubeTvScreen(youtubetvscreen.getDevice().withNewDeviceName(s1));
            a(((YouTubeTvScreen) (s1)), i1);
            s.execute(new cn(this, youtubetvscreen, s1, b1));
            return;
        } else
        {
            YouTubeTvScreen youtubetvscreen1 = new YouTubeTvScreen(youtubetvscreen.getScreen().withName(s1));
            b(youtubetvscreen1, i1);
            f.a(youtubetvscreen1.getScreen().getScreenId(), s1, new cp(youtubetvscreen, b1));
            return;
        }
    }

    public final void a(bi bi)
    {
        a.add(bi);
    }

    public final void a(CloudScreen cloudscreen, com.google.android.apps.youtube.common.a.b b1)
    {
        f.a(cloudscreen, new cg(this, cloudscreen, b1));
    }

    public final void a(SsdpId ssdpid, ck ck1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            YouTubeTvScreen youtubetvscreen = (YouTubeTvScreen)iterator.next();
            if (youtubetvscreen.getDevice().getSsdpId().equals(ssdpid))
            {
                ck1.a(youtubetvscreen);
                return;
            }
        }

        j.put(ssdpid, Boolean.valueOf(false));
        p.a(new ca(this, ssdpid, ck1));
        ssdpid = Message.obtain(n, 3, new Pair(ssdpid, ck1));
        n.sendMessageDelayed(ssdpid, 9500L);
    }

    public final void a(String s1)
    {
        v.remove(s1);
        if (v.isEmpty())
        {
            q = false;
            n.removeMessages(0);
            n.removeMessages(1);
        }
    }

    public final void a(String s1, PairingCode pairingcode, com.google.android.apps.youtube.common.a.b b1)
    {
        f.a(s1, pairingcode, new ce(this, b1));
    }

    public final List b()
    {
        return d;
    }

    public final void b(bi bi)
    {
        a.remove(bi);
    }

    public final void b(String s1)
    {
        if (v.isEmpty())
        {
            q = true;
            f.c(null);
            f.a(e);
            c();
            q = true;
            n.sendEmptyMessageDelayed(0, 5000L);
            n.sendEmptyMessageDelayed(1, 10000L);
        }
        v.add(s1);
    }

    private class PushNotificationsBroadcastReceiver extends BroadcastReceiver
    {

        private final bw a;
        private final l b;
        private final bk c;

        public static boolean a(Intent intent)
        {
            boolean flag1 = false;
            intent = intent.getExtras();
            boolean flag = flag1;
            if (intent != null)
            {
                intent = intent.getString("sm");
                flag = flag1;
                if (intent != null)
                {
                    intent = intent.replace("\\", "");
                    boolean flag2;
                    try
                    {
                        flag2 = "automaticPairing".equals((new JSONObject(intent)).getString("notificationType"));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Intent intent)
                    {
                        return false;
                    }
                    flag = flag1;
                    if (flag2)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public void onReceive(Context context, Intent intent)
        {
_L2:
            return;
            if (!b.b() || !a(intent)) goto _L2; else goto _L1
_L1:
            intent = intent.getExtras();
            if (intent == null) goto _L2; else goto _L3
_L3:
            Object obj = intent.getString("sm");
            if (obj == null) goto _L2; else goto _L4
_L4:
            obj = ((String) (obj)).replace("\\", "");
            boolean flag;
            try
            {
                obj = (new JSONObject(((String) (obj)))).getJSONObject("pairingData");
                String s1 = ((JSONObject) (obj)).getString("pairingCode");
                if (((JSONObject) (obj)).has("tvName"))
                {
                    intent.putString("tv_name", ((JSONObject) (obj)).getString("tvName"));
                }
                flag = ((JSONObject) (obj)).getBoolean("isAvailable");
                intent.putString("pairing_code", s1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                L.a("Automatic Pairing Notification parsing failed", context);
                return;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            if (RemoteControl.State.CONNECTED.equals(c.b()) || RemoteControl.State.CONNECTING.equals(c.b())) goto _L2; else goto _L5
_L5:
            com.google.android.apps.youtube.app.remote.a.a(context, a, intent);
            return;
            com.google.android.apps.youtube.app.remote.a.b(context, a, intent);
            return;
        }

        public PushNotificationsBroadcastReceiver(bw bw1, l l1, bk bk1)
        {
            a = bw1;
            b = l1;
            c = bk1;
        }
    }

}
