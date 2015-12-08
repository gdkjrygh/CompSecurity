// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.text.TextUtils;
import io.wecloud.message.bean.EventInfo;
import io.wecloud.message.e.a;
import io.wecloud.message.e.c;
import io.wecloud.message.frontia.b;
import io.wecloud.message.frontia.richmedia.MediaViewActivity;
import io.wecloud.message.g.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import org.json.JSONObject;

// Referenced classes of package io.wecloud.message:
//            a, e, b, c, 
//            j, d

public abstract class ClientService extends Service
{

    private static final String a = io/wecloud/message/ClientService.getSimpleName();
    private BroadcastReceiver b;
    private e c;
    private boolean d;
    private final Object e = new Object();
    private String f;
    private String g;
    private LocationListener h;
    private LocationManager i;
    private boolean j;
    private Handler k;

    public ClientService()
    {
        d = false;
        f = null;
        g = null;
        j = false;
        k = new io.wecloud.message.a(this);
    }

    static Object a(ClientService clientservice)
    {
        return clientservice.e;
    }

    private void a(Intent intent)
    {
        EventInfo eventinfo = new EventInfo();
        b b1 = new b();
        b1.a(intent.getBundleExtra("bean"));
        eventinfo.a(3003);
        eventinfo.a(b1.d());
        if (c != null && c.n())
        {
            a(eventinfo);
        } else
        {
            io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.b(eventinfo.a()));
        }
        a(getApplicationContext(), b1.d(), b1.f(), b1.g(), b1.l(), b1.e(), b1.n(), b1.k());
    }

    static void a(ClientService clientservice, EventInfo eventinfo)
    {
        clientservice.b(eventinfo);
    }

    static void a(ClientService clientservice, String s)
    {
        clientservice.a(s);
    }

    static void a(ClientService clientservice, boolean flag)
    {
        clientservice.j = flag;
    }

    private void a(String s)
    {
        s = new Notification();
        s.flags = 64;
        startForeground(0x215323, s);
    }

    private void a(boolean flag)
    {
label0:
        {
label1:
            {
                if (TextUtils.isEmpty(io.wecloud.message.c.a.d(this)))
                {
                    break label0;
                }
                if (c == null)
                {
                    c = new e(this);
                    if (!flag)
                    {
                        break label1;
                    }
                    c.e();
                    io.wecloud.message.e.c.b(a, "buildConnection --> CONNECT!");
                }
                return;
            }
            c.d = 0;
            c.a();
            io.wecloud.message.e.c.b(a, "buildConnection --> LOGIN!");
            return;
        }
        io.wecloud.message.e.c.d("CSH", "goid\u4E3A\u7A7A");
    }

    private boolean a(Context context)
    {
        boolean flag;
        try
        {
            flag = ((PowerManager)context.getSystemService("power")).isScreenOn();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return true;
        }
        return flag;
    }

    static boolean a(ClientService clientservice, Context context)
    {
        return clientservice.a(context);
    }

    static String b(ClientService clientservice)
    {
        return clientservice.f;
    }

    private void b(Intent intent)
    {
        EventInfo eventinfo = new EventInfo();
        b b1 = new b();
        b1.a(intent.getBundleExtra("bean"));
        eventinfo.a(3006);
        eventinfo.a(b1.d());
        if (c != null && c.n())
        {
            a(eventinfo);
            return;
        } else
        {
            io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.c(eventinfo.a()));
            return;
        }
    }

    private void b(EventInfo eventinfo)
    {
        io.wecloud.message.e.c.b(a, "-- > onEvent");
        if (eventinfo == null) goto _L2; else goto _L1
_L1:
        io.wecloud.message.e.c.b(a, (new StringBuilder("msg info = ")).append(eventinfo.d()).toString());
        if (TextUtils.isEmpty(eventinfo.c()) || TextUtils.isEmpty(f) || !eventinfo.c().equals(f)) goto _L2; else goto _L3
_L3:
        eventinfo = eventinfo.d();
        if (TextUtils.isEmpty(eventinfo)) goto _L2; else goto _L4
_L4:
        b b1;
        Object obj;
        b1 = new b(new JSONObject(eventinfo));
        obj = io.wecloud.message.c.a.x(getApplicationContext());
        if (((ArrayList) (obj)).contains(Long.toString(b1.d())))
        {
            return;
        }
        StringBuffer stringbuffer;
        if (((ArrayList) (obj)).size() >= 100)
        {
            ((ArrayList) (obj)).remove(0);
        }
        ((ArrayList) (obj)).add(Long.toString(b1.d()));
        stringbuffer = new StringBuffer();
        obj = ((ArrayList) (obj)).iterator();
_L16:
        if (((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        io.wecloud.message.c.a.e(getApplicationContext(), stringbuffer.toString());
        b1.e();
        JVM INSTR tableswitch 1 3: default 385
    //                   1 220
    //                   2 366
    //                   3 220;
           goto _L7 _L8 _L9 _L8
_L8:
        long l = io.wecloud.message.c.a.u(getApplicationContext());
        if (System.currentTimeMillis() - l >= 0x493e0L) goto _L11; else goto _L10
_L10:
        b1.b(false);
        b1.c(false);
_L13:
        a(b1);
_L14:
        if (TextUtils.isEmpty(b1.m()))
        {
            io.wecloud.message.frontia.c.a(getApplicationContext(), "0", b1, eventinfo);
            return;
        }
          goto _L12
_L6:
        String s = (String)((Iterator) (obj)).next();
        if (!TextUtils.isEmpty(s))
        {
            if (stringbuffer.length() > 0)
            {
                stringbuffer.append(",");
            }
            stringbuffer.append(s);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        try
        {
            io.wecloud.message.c.a.e(getApplicationContext(), System.currentTimeMillis());
        }
        // Misplaced declaration of an exception variable
        catch (EventInfo eventinfo)
        {
            eventinfo.printStackTrace();
            return;
        }
          goto _L13
        Throwable throwable;
        throwable;
        throwable.printStackTrace();
          goto _L14
_L12:
        io.wecloud.message.frontia.c.a(getApplicationContext(), b1.m(), b1, eventinfo);
        return;
_L9:
        try
        {
            a(getApplicationContext(), b1.g());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EventInfo eventinfo) { }
        eventinfo.printStackTrace();
_L2:
        return;
_L7:
        return;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static e c(ClientService clientservice)
    {
        return clientservice.c;
    }

    static String c()
    {
        return a;
    }

    private void d()
    {
        d = true;
        stopSelf();
    }

    static void d(ClientService clientservice)
    {
        clientservice.d();
    }

    static LocationManager e(ClientService clientservice)
    {
        return clientservice.i;
    }

    private String e()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        String s;
        if (!TextUtils.isEmpty(g))
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g = (new StringBuilder(String.valueOf(f))).append(":").append(0).toString();
        s = g;
        return s;
        obj;
        JVM INSTR monitorexit ;
        return "";
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static LocationListener f(ClientService clientservice)
    {
        return clientservice.h;
    }

    static boolean g(ClientService clientservice)
    {
        return clientservice.j;
    }

    static String h(ClientService clientservice)
    {
        return clientservice.e();
    }

    protected abstract void a();

    protected abstract void a(Context context, int l);

    protected abstract void a(Context context, long l, String s, String s1, String s2, int i1, 
            String s3, int j1);

    protected abstract void a(Context context, String s);

    public void a(EventInfo eventinfo)
    {
        io.wecloud.message.e.c.d(a, (new StringBuilder("Report Event, info = ")).append(eventinfo.toString()).toString());
        if (eventinfo == null || eventinfo.a() <= 0L) goto _L2; else goto _L1
_L1:
        eventinfo.b();
        JVM INSTR tableswitch 3003 3007: default 76
    //                   3003 77
    //                   3004 76
    //                   3005 76
    //                   3006 139
    //                   3007 201;
           goto _L2 _L3 _L2 _L2 _L4 _L5
_L2:
        return;
_L3:
        io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.b(eventinfo.a()));
        if (c != null && c.n())
        {
            if (c.o())
            {
                c.a(true);
                return;
            } else
            {
                c.a(2);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.c(eventinfo.a()));
        if (c != null && c.n())
        {
            if (c.o())
            {
                c.a(true);
                return;
            } else
            {
                c.a(2);
                return;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
        io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.e(eventinfo.d()));
        if (c != null && c.n())
        {
            if (c.o())
            {
                c.a(true);
                return;
            } else
            {
                c.a(2);
                return;
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected abstract void a(b b1);

    protected abstract void b();

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        io.wecloud.message.e.c.b("CSH", (new StringBuilder(String.valueOf(a))).append("----- onCreate").toString());
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            a("Ping...");
        }
        b = new io.wecloud.message.e(this, null);
        Object obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("android.intent.action.TIME_TICK");
        ((IntentFilter) (obj)).addAction("android.intent.action.TIMEZONE_CHANGED");
        ((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_ON");
        ((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(b, ((IntentFilter) (obj)));
        Throwable throwable;
        try
        {
            b();
            a();
        }
        catch (Throwable throwable1) { }
        if (a(getApplicationContext()))
        {
            io.wecloud.message.f.a.a(getApplicationContext()).a();
        }
        if (!TextUtils.isEmpty(io.wecloud.message.c.a.w(getApplicationContext())))
        {
            break MISSING_BLOCK_LABEL_259;
        }
        i = (LocationManager)getSystemService("location");
        obj = new Criteria();
        ((Criteria) (obj)).setAccuracy(1);
        ((Criteria) (obj)).setAltitudeRequired(false);
        ((Criteria) (obj)).setPowerRequirement(2);
        ((Criteria) (obj)).setSpeedRequired(false);
        ((Criteria) (obj)).setCostAllowed(true);
        obj = i.getBestProvider(((Criteria) (obj)), true);
        if (h == null)
        {
            h = new io.wecloud.message.b(this);
        }
        i.requestLocationUpdates(((String) (obj)), 0L, 0.0F, h);
        (new Handler()).postDelayed(new io.wecloud.message.c(this), 15000L);
        return;
        throwable;
        throwable.printStackTrace();
        return;
    }

    public void onDestroy()
    {
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("service onDestroy! ")).append(d).toString());
        unregisterReceiver(b);
        io.wecloud.message.j.d(this);
        io.wecloud.message.j.a(getApplicationContext(), -1);
        if (c != null)
        {
            c.k();
            c = null;
        }
        io.wecloud.message.f.a.a(getApplicationContext()).c();
        if (!d && io.wecloud.message.c.a.g(getApplicationContext()))
        {
            Intent intent = new Intent(io.wecloud.message.h.a.a(getPackageName()));
            intent.setPackage(getPackageName());
            startService(intent);
            io.wecloud.message.e.c.a("CSH", "uncorrect onDestroy, restart");
        }
        if (android.os.Build.VERSION.SDK_INT <= 17)
        {
            stopForeground(true);
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int l, int i1)
    {
        Object obj;
        boolean flag;
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("onStartCommand, intent = ")).append(intent).append(", flags = ").append(l).append(" , startId = ").append(i1).toString());
        if (TextUtils.isEmpty(f))
        {
            f = io.wecloud.message.h.a.f(getApplicationContext(), "APPKEY");
        }
        Object obj3;
        String s4;
        long l1;
        if (intent == null)
        {
            flag = true;
        } else
        {
            flag = intent.hasExtra("re_conn");
        }
        a(flag);
        if (intent == null) goto _L2; else goto _L1
_L1:
        obj = intent.getStringExtra("action");
        io.wecloud.message.e.c.b(a, (new StringBuilder("actionFlag = ")).append(((String) (obj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L3
_L3:
        if (!((String) (obj)).equals("io.wecloud.message.action.MESSAGE")) goto _L5; else goto _L4
_L4:
        obj3 = intent.getStringExtra("appKey");
        s4 = intent.getStringExtra("info");
        l1 = intent.getLongExtra("msgId", -1L);
        obj = new EventInfo();
        ((EventInfo) (obj)).a(l1);
        ((EventInfo) (obj)).a(((String) (obj3)));
        ((EventInfo) (obj)).b(s4);
        obj3 = k.obtainMessage();
        obj3.what = 272;
        obj3.obj = obj;
        k.sendMessage(((Message) (obj3)));
_L2:
        return super.onStartCommand(intent, 1, i1);
_L5:
        if (!((String) (obj)).equals("io.wecloud.message.action.METHOD"))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent.getIntExtra("method_key", -1);
        JVM INSTR tableswitch 1003 1025: default 376
    //                   1003 379
    //                   1004 376
    //                   1005 376
    //                   1006 376
    //                   1007 440
    //                   1008 376
    //                   1009 376
    //                   1010 670
    //                   1011 376
    //                   1012 376
    //                   1013 376
    //                   1014 376
    //                   1015 729
    //                   1016 579
    //                   1017 766
    //                   1018 773
    //                   1019 866
    //                   1020 902
    //                   1021 984
    //                   1022 1041
    //                   1023 1049
    //                   1024 1089
    //                   1025 1230;
           goto _L6 _L7 _L6 _L6 _L6 _L8 _L6 _L6 _L9 _L6 _L6 _L6 _L6 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L6:
        break; /* Loop/switch isn't completed */
_L7:
        String s = intent.getStringExtra("pkg");
        if (!TextUtils.isEmpty(s))
        {
            if (!s.equals(getPackageName()))
            {
                io.wecloud.message.e.c.b("CSH", "stop service");
                d = true;
                stopSelf();
            } else
            {
                a(getApplicationContext(), 0);
            }
        }
        break; /* Loop/switch isn't completed */
_L8:
        String s1 = intent.getStringExtra("pkg");
        io.wecloud.message.e.c.b(a, (new StringBuilder("relogin -- pkg = ")).append(s1).toString());
        if (c != null && s1.equals(getPackageName()))
        {
            io.wecloud.message.j.d(getApplicationContext());
            c.d = 0;
            c.a();
            io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.a(flag, (new StringBuilder(String.valueOf(io.wecloud.message.h.a.c(getApplicationContext(), getPackageName())))).append(":").append(105).toString()));
        } else
        {
            d = true;
            stopSelf();
        }
        break; /* Loop/switch isn't completed */
_L11:
        String s2 = intent.getStringExtra("pkg");
        if (c != null && s2.equals(getPackageName()))
        {
            if (!c.n())
            {
                io.wecloud.message.e.c.b(a, (new StringBuilder("re-connect -- pkg = ")).append(s2).toString());
                io.wecloud.message.j.d(getApplicationContext());
                c.e();
            }
        } else
        {
            d = true;
            stopSelf();
        }
        break; /* Loop/switch isn't completed */
_L9:
        if (intent.getBooleanExtra("tickAlarm", false) && c != null)
        {
            c.a(0, e());
            io.wecloud.message.e.c.b(a, (new StringBuilder("tick alarm, response pkgname = ")).append(getPackageName()).toString());
        }
        break; /* Loop/switch isn't completed */
_L10:
        io.wecloud.message.e.c.b(a, "\u767B\u5F55\u6210\u529F\uFF01");
        d d1 = new d(this);
        (new Timer()).schedule(d1, 30000L);
        break; /* Loop/switch isn't completed */
_L12:
        d();
        break; /* Loop/switch isn't completed */
_L13:
        String s3 = intent.getStringExtra("upload_data");
        if (!TextUtils.isEmpty(s3))
        {
            if (c != null && c.n())
            {
                EventInfo eventinfo = new EventInfo();
                eventinfo.a(110L);
                eventinfo.b(s3);
                eventinfo.a(3007);
                a(eventinfo);
            } else
            {
                io.wecloud.message.e.b.a(getApplicationContext()).a(io.wecloud.message.e.a.e(s3));
            }
        }
        break; /* Loop/switch isn't completed */
_L14:
        Object obj1;
        Object obj2;
        Object obj4;
        try
        {
            Intent intent1 = getPackageManager().getLaunchIntentForPackage(getPackageName());
            intent1.setFlags(0x14000000);
            startActivity(intent1);
        }
        catch (Exception exception) { }
        a(intent);
        break; /* Loop/switch isn't completed */
_L15:
        obj4 = intent.getStringExtra("param");
        if (!TextUtils.isEmpty(((CharSequence) (obj4)))) goto _L22; else goto _L21
_L21:
        obj1 = getPackageManager().getLaunchIntentForPackage(getPackageName());
_L23:
        ((Intent) (obj1)).setFlags(0x14000000);
        startActivity(((Intent) (obj1)));
_L24:
        a(intent);
        break; /* Loop/switch isn't completed */
_L22:
        obj1 = new Intent();
        ((Intent) (obj1)).setClassName(getPackageName(), ((String) (obj4)));
          goto _L23
        obj2;
          goto _L24
_L16:
        obj2 = intent.getStringExtra("param");
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            try
            {
                obj2 = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj2))));
                ((Intent) (obj2)).setFlags(0x14000000);
                startActivity(((Intent) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        a(intent);
        break; /* Loop/switch isn't completed */
          goto _L23
_L17:
        a(intent);
        break; /* Loop/switch isn't completed */
_L18:
        b(intent);
        io.wecloud.message.e.c.b(a, (new StringBuilder("delete intent msgId = ")).append(intent.getLongExtra("msgId", -1L)).toString());
        break; /* Loop/switch isn't completed */
_L19:
        obj2 = intent.getStringExtra("intent_uri");
        io.wecloud.message.e.c.b(a, (new StringBuilder("START_CUSTOM_INTENT -- > intent str = ")).append(((String) (obj2))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj2)))) goto _L26; else goto _L25
_L25:
        obj2 = Intent.getIntent(((String) (obj2)));
        ((Intent) (obj2)).addFlags(0x14000000);
        l = intent.getIntExtra("intent_type", -1);
        l;
        JVM INSTR tableswitch 1 3: default 1184
    //                   1 1192
    //                   2 1211
    //                   3 1220;
           goto _L26 _L27 _L28 _L29
_L26:
        a(intent);
        break; /* Loop/switch isn't completed */
_L27:
        try
        {
            startActivity(((Intent) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            ((Exception) (obj2)).printStackTrace();
        }
        continue; /* Loop/switch isn't completed */
_L28:
        sendBroadcast(((Intent) (obj2)));
        continue; /* Loop/switch isn't completed */
_L29:
        startService(((Intent) (obj2)));
        if (true) goto _L26; else goto _L30
_L30:
        break; /* Loop/switch isn't completed */
_L20:
        try
        {
            obj2 = new b();
            ((b) (obj2)).a(intent.getBundleExtra("bean"));
            obj4 = new Intent(getApplicationContext(), io/wecloud/message/frontia/richmedia/MediaViewActivity);
            ((Intent) (obj4)).setFlags(0x10000000);
            ((Intent) (obj4)).putExtra("show_title", false);
            ((Intent) (obj4)).putExtra("url", ((b) (obj2)).n());
            ((Intent) (obj4)).putExtra("show_loading", true);
            ((Intent) (obj4)).putExtra("request_focus", true);
            ((Intent) (obj4)).putExtra("content", ((b) (obj2)).c());
            startActivity(((Intent) (obj4)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        a(intent);
        if (true) goto _L2; else goto _L31
_L31:
    }

}
