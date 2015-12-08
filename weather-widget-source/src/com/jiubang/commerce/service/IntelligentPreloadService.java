// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.service;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.jiubang.commerce.ad.c.e;
import com.jiubang.commerce.ad.d.c;
import com.jiubang.commerce.ad.d.h;
import com.jiubang.commerce.ad.d.l;
import com.jiubang.commerce.ad.d.q;
import com.jiubang.commerce.ad.e.ah;
import com.jiubang.commerce.ad.e.al;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.f.d;
import com.jiubang.commerce.ad.f.f;
import com.jiubang.commerce.ad.f.g;
import com.jiubang.commerce.receiver.NetWorkDynamicBroadcastReceiver;
import com.jiubang.commerce.utils.AdTimer;
import com.jiubang.commerce.utils.a;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.j;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.service:
//            a

public class IntelligentPreloadService extends Service
    implements f, a
{

    e a;
    private NetWorkDynamicBroadcastReceiver b;
    private d c;
    private int d;
    private com.jiubang.commerce.ad.d.e e;
    private l f;
    private com.jiubang.commerce.ad.f.a g;
    private g h;
    private com.jiubang.commerce.ad.d.a i;
    private c j;
    private com.jiubang.commerce.ad.d.d k;
    private Bundle l;
    private boolean m;
    private boolean n;
    private long o;
    private AdTimer p;

    public IntelligentPreloadService()
    {
        d = -1;
        m = false;
        n = true;
        o = 0x927c0L;
    }

    static long a(IntelligentPreloadService intelligentpreloadservice)
    {
        return intelligentpreloadservice.o;
    }

    static AdTimer a(IntelligentPreloadService intelligentpreloadservice, AdTimer adtimer)
    {
        intelligentpreloadservice.p = adtimer;
        return adtimer;
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        while (!TextUtils.isEmpty(s2) && "16".equals(s2) || context == null || b(context)) 
        {
            return;
        }
        Intent intent = new Intent(context, com/jiubang/commerce/service/IntelligentPreloadService);
        Bundle bundle = new Bundle();
        bundle.putString("processName", s);
        bundle.putString("goid", s1);
        bundle.putString("cid", s2);
        bundle.putString("gadid", s3);
        bundle.putString("channel", s4);
        bundle.putString("dataChannel", s5);
        bundle.putString("entranceId", s6);
        bundle.putBoolean("showlog", j.a);
        intent.putExtra("ini_params", bundle);
        context.startService(intent);
    }

    private void a(Intent intent)
    {
        ah.a(getApplicationContext());
        l = b(intent);
        if (l != null)
        {
            b(l);
            m = true;
            b = new NetWorkDynamicBroadcastReceiver();
            intent = new IntentFilter();
            intent.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            registerReceiver(b, intent);
            c = new d(getApplicationContext(), this);
            c.b();
            if (!q.b(getApplicationContext()))
            {
                al.a(getApplicationContext()).a(new com.jiubang.commerce.service.a(this));
            }
            j();
            return;
        }
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stopSelfSafelyxxx");
        }
        m();
    }

    private void a(Bundle bundle)
    {
        String s = bundle.getString("processName");
        String s1 = bundle.getString("goid");
        String s2 = bundle.getString("cid");
        String s3 = bundle.getString("gadid");
        String s4 = bundle.getString("channel");
        String s5 = bundle.getString("dataChannel");
        String s6 = bundle.getString("entranceId");
        boolean flag = bundle.getBoolean("showlog");
        bundle = getSharedPreferences("ini_params", 0).edit();
        bundle.putString("processName", s);
        bundle.putString("goid", s1);
        bundle.putString("cid", s2);
        bundle.putString("gadid", s3);
        bundle.putString("channel", s4);
        bundle.putString("dataChannel", s5);
        bundle.putString("entranceId", s6);
        bundle.putBoolean("showlog", flag);
        bundle.commit();
    }

    private void a(String s)
    {
        Object obj = null;
        d;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 52
    //                   1 60
    //                   2 68;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!"onGPOpen".equals(s) || obj == null) goto _L6; else goto _L5
_L5:
        ((h) (obj)).b();
_L8:
        return;
_L2:
        obj = f;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = i;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = j;
        continue; /* Loop/switch isn't completed */
_L6:
        if ("onGPClose".equals(s) && obj != null)
        {
            ((h) (obj)).c();
            return;
        }
        if (!"exit".equals(s) || !j.a) goto _L8; else goto _L7
_L7:
        com.jiubang.commerce.utils.j.b("Ad_SDK", "IntelligentPreloadService exit!");
        m();
        return;
        if (true) goto _L1; else goto _L9
_L9:
    }

    public static boolean a(Context context)
    {
        Object obj;
        obj = ((ActivityManager)context.getSystemService("activity")).getRunningServices(0x7fffffff);
        context = c(context);
        obj = ((List) (obj)).iterator();
_L2:
        String s;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_91;
            }
            s = ((android.app.ActivityManager.RunningServiceInfo)((Iterator) (obj)).next()).process;
        } while (s == null);
        if (!s.trim().endsWith("com.jiubang.commerce.service.IntelligentPreloadService")) goto _L2; else goto _L1
_L1:
        boolean flag = s.equals(context);
        if (!flag)
        {
            return true;
        }
          goto _L2
        context;
        com.jiubang.commerce.utils.j.b("IntelligentPreloadService", "isOthersRunning Error:", context);
        return true;
        return false;
    }

    private Bundle b(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getBundleExtra("ini_params");
            if (intent != null)
            {
                a(intent);
                return intent;
            } else
            {
                return l();
            }
        } else
        {
            return l();
        }
    }

    static AdTimer b(IntelligentPreloadService intelligentpreloadservice)
    {
        return intelligentpreloadservice.p;
    }

    private void b(Bundle bundle)
    {
        String s = bundle.getString("processName");
        String s1 = bundle.getString("goid");
        String s2 = bundle.getString("cid");
        String s3 = bundle.getString("gadid");
        String s4 = bundle.getString("channel");
        String s5 = bundle.getString("dataChannel");
        String s6 = bundle.getString("entranceId");
        com.jiubang.commerce.utils.j.a(bundle.getBoolean("showlog"));
        com.jiubang.commerce.ad.a.a(getApplicationContext(), s, s1, s2, s3, s4, s5, s6);
    }

    public static boolean b(Context context)
    {
        context = ((ActivityManager)context.getSystemService("activity")).getRunningServices(0x7fffffff).iterator();
_L1:
        String s;
        if (!context.hasNext())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        s = ((android.app.ActivityManager.RunningServiceInfo)context.next()).process;
        if (s != null)
        {
            boolean flag;
            try
            {
                flag = s.trim().endsWith("com.jiubang.commerce.service.IntelligentPreloadService");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                com.jiubang.commerce.utils.j.b("IntelligentPreloadService", "isAlreadyRunning Error:", context);
                return true;
            }
            if (flag)
            {
                return true;
            }
        }
          goto _L1
        return false;
    }

    public static String c(Context context)
    {
        return (new StringBuilder()).append(context.getPackageName()).append(":").append("com.jiubang.commerce.service.IntelligentPreloadService").toString();
    }

    public static boolean d(Context context)
    {
        return c(context).equals(com.jiubang.commerce.utils.b.d(context));
    }

    private void j()
    {
        String s = t.a().d();
        t.a().g();
        a = new e(getApplicationContext(), s);
        a.a();
    }

    private void k()
    {
        if (l != null)
        {
            String s = l.getString("cid");
            String s1 = l.getString("entranceId");
            (new q(getApplicationContext(), s, s1, false)).a(null);
        }
    }

    private Bundle l()
    {
        SharedPreferences sharedpreferences = getSharedPreferences("ini_params", 0);
        String s = sharedpreferences.getString("processName", "");
        String s1 = sharedpreferences.getString("goid", "");
        String s2 = sharedpreferences.getString("cid", "");
        String s3 = sharedpreferences.getString("gadid", "");
        String s4 = sharedpreferences.getString("channel", "");
        String s5 = sharedpreferences.getString("dataChannel", "");
        String s6 = sharedpreferences.getString("entranceId", "");
        boolean flag = sharedpreferences.getBoolean("showlog", false);
        if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s5))
        {
            return null;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("processName", s);
            bundle.putString("goid", s1);
            bundle.putString("cid", s2);
            bundle.putString("gadid", s3);
            bundle.putString("channel", s4);
            bundle.putString("dataChannel", s5);
            bundle.putString("entranceId", s6);
            bundle.putBoolean("showlog", flag);
            return bundle;
        }
    }

    private void m()
    {
        com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stopSelfSafely");
        n = false;
        stopSelf();
    }

    public void a()
    {
        q.c(getApplicationContext());
        k();
    }

    public void b()
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stop other proposal and start A proposal");
        }
        g();
        h();
        i();
        String s = t.a().g();
        if (d != 0)
        {
            String s1 = t.a().d();
            f = new l(getApplicationContext(), s1, s);
            d = 0;
        }
        if (!t.i() || !"1".equals(s))
        {
            e = new com.jiubang.commerce.ad.d.e(getApplicationContext(), f);
            if (j.a)
            {
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("GPMonitor duration A:").append(e.c()).toString());
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("Business Delay Time:").append(f.a()).toString());
            }
            e.a();
        }
    }

    public void c()
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stop other proposal and start B proposal");
        }
        f();
        h();
        i();
        String s = t.a().g();
        if (d != 1)
        {
            String s1 = t.a().d();
            i = new com.jiubang.commerce.ad.d.a(getApplicationContext(), s1, s);
            d = 1;
        }
        if (!t.i() || !"1".equals(s))
        {
            e = new com.jiubang.commerce.ad.d.e(getApplicationContext(), i);
            if (j.a)
            {
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("GPMonitor duration B:").append(e.c()).toString());
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("Business Delay Time:").append(i.a()).toString());
            }
            e.a();
        }
    }

    public void d()
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stop other proposal and start C proposal");
        }
        f();
        g();
        i();
        String s = t.a().g();
        if (d != 2)
        {
            String s1 = t.a().d();
            j = new c(getApplicationContext(), s1, s);
            d = 2;
        }
        if (!t.i() || !"1".equals(s))
        {
            e = new com.jiubang.commerce.ad.d.e(getApplicationContext(), j);
            if (j.a)
            {
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("GPMonitor duration C:").append(e.c()).toString());
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("Business Delay Time:").append(j.a()).toString());
            }
            e.a();
        }
    }

    public void e()
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "stop other proposal and start D proposal");
        }
        f();
        g();
        h();
        String s = t.a().g();
        if (d != 3)
        {
            String s1 = t.a().d();
            k = new com.jiubang.commerce.ad.d.d(getApplicationContext(), s1, s);
            d = 3;
        }
        if (!t.i() || !"1".equals(s))
        {
            e = new com.jiubang.commerce.ad.d.e(getApplicationContext(), k);
            if (j.a)
            {
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("GPMonitor duration D:").append(e.c()).toString());
                com.jiubang.commerce.utils.j.a("IntelligentPreloadService", (new StringBuilder()).append("Business Delay Time:").append(k.a()).toString());
            }
            e.a();
        }
    }

    public void f()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (f != null)
        {
            f.e();
            f = null;
        }
    }

    public void g()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (i != null)
        {
            i.e();
            i = null;
        }
    }

    public void h()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (j != null)
        {
            j.e();
            j = null;
        }
        if (h != null)
        {
            h.b();
            h = null;
        }
        if (g != null)
        {
            g.a();
            g = null;
        }
    }

    public void i()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (k != null)
        {
            k.e();
            k = null;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "onCreate");
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "onDestroy");
        }
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (p != null)
        {
            p.a();
            p = null;
        }
        if (f != null)
        {
            f.e();
            f = null;
        }
        if (a != null)
        {
            a.b();
            a = null;
        }
        if (c != null)
        {
            c.c();
            c = null;
        }
        if (g != null)
        {
            g.a();
            g = null;
        }
        if (h != null)
        {
            h.b();
            h = null;
        }
        if (b != null)
        {
            Intent intent;
            try
            {
                unregisterReceiver(b);
            }
            catch (Exception exception) { }
            b = null;
        }
        if (n)
        {
            intent = new Intent(getApplicationContext(), com/jiubang/commerce/service/IntelligentPreloadService);
            intent.putExtra("ini_params", l);
            startService(intent);
            return;
        } else
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "kill process");
            Process.killProcess(Process.myPid());
            return;
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("IntelligentPreloadService", "onStartCommand");
        }
        if (m)
        {
            a(intent.getStringExtra("command"));
        } else
        {
            if (a(getApplicationContext()))
            {
                m();
                return super.onStartCommand(intent, i1, j1);
            }
            a(intent);
        }
        return super.onStartCommand(intent, i1, j1);
    }
}
