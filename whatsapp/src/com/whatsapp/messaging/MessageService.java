// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.dc;
import com.whatsapp.ft;
import com.whatsapp.my;
import com.whatsapp.protocol.cq;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.whatsapp.messaging:
//            h, bb, q, a5, 
//            a1, b8, c, af, 
//            ai, as, CaptivePortalActivity

public class MessageService extends Service
{

    private static final String B;
    private static final String H[];
    private static final String e;
    private static final String f;
    private static CountDownLatch h;
    private static final AtomicBoolean o;
    private Messenger A;
    private final Messenger C = new Messenger(new a5(this));
    private boolean D;
    private a1 E;
    private final BroadcastReceiver F = new _cls1();
    private byte G[];
    private final BroadcastReceiver a = new _cls3();
    private Handler b;
    private boolean c;
    private boolean d;
    private long g;
    private String i;
    private final Handler j = new Handler(new b8(this));
    private as k;
    private boolean l;
    private Random m;
    private final bb n = new bb(this);
    private af p;
    private final q q = new q(this);
    private boolean r;
    private long s;
    private int t;
    private a1 u;
    private final BroadcastReceiver v = new _cls4();
    private HandlerThread w;
    private boolean x;
    private boolean y;
    private a1 z;

    public MessageService()
    {
        int i1 = h.a;
        super();
        d = false;
        l = false;
        D = false;
        t = -1;
        g = 0L;
        s = 10000L;
        m = new Random();
        E = new a1(3, H[1], true);
        z = new a1(3, H[3], false);
        u = new a1(3, H[2], true);
        x = false;
        if (DialogToastActivity.g != 0)
        {
            h.a = i1 + 1;
        }
    }

    private void a()
    {
label0:
        {
            Log.i(H[51]);
            if (!c)
            {
                registerReceiver(a, new IntentFilter(f));
                c = true;
            }
            AlarmManager alarmmanager = (AlarmManager)getSystemService(H[52]);
            PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(f), 0);
            alarmmanager.cancel(pendingintent);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                alarmmanager.setExact(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
                if (h.a == 0)
                {
                    break label0;
                }
            }
            alarmmanager.set(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
        }
    }

    private void a(int i1)
    {
        if (i1 == t)
        {
            return;
        }
        Log.i((new StringBuilder()).append(H[56]).append(t).append(H[57]).append(i1).toString());
        if (d)
        {
            com.whatsapp.messaging.c.a(A, true);
        }
        t = i1;
        ft.a(this);
    }

    public static void a(Context context)
    {
        context.startService((new Intent(context, com/whatsapp/messaging/MessageService)).setAction(H[16]));
    }

    public static void a(Context context, boolean flag)
    {
        context.startService((new Intent(context, com/whatsapp/messaging/MessageService)).setAction(H[70]).putExtra(H[69], flag));
    }

    public static void a(Context context, boolean flag, boolean flag1)
    {
        a(context, flag, flag1, false, null, null);
    }

    public static void a(Context context, boolean flag, boolean flag1, boolean flag2, String s1, String as1[])
    {
        a(context, flag, flag1, flag2, s1, as1, false);
    }

    public static void a(Context context, boolean flag, boolean flag1, boolean flag2, String s1, String as1[], boolean flag3)
    {
        context.startService((new Intent(context, com/whatsapp/messaging/MessageService)).setAction(H[45]).putExtra(H[46], flag).putExtra(H[48], flag1).putExtra(H[49], flag2).putExtra(H[44], s1).putExtra(H[47], as1).putExtra(H[43], flag3));
    }

    private void a(Message message)
    {
        p.a(message);
    }

    private void a(Messenger messenger)
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)getSystemService(H[62]);
        A = messenger;
        d = true;
        messenger = connectivitymanager.getActiveNetworkInfo();
        if (messenger != null)
        {
            t = messenger.getType();
        }
        w = new HandlerThread(H[61]);
        w.start();
        b = new Handler(w.getLooper());
        registerReceiver(F, new IntentFilter(B), null, b);
        messenger = new IntentFilter(H[63]);
        if (registerReceiver(F, messenger, null, b) == null)
        {
            b.post(new ai(this));
        }
        a(true);
        if (l)
        {
            p.c();
        }
        ft.a(this);
    }

    static void a(MessageService messageservice)
    {
        messageservice.v();
    }

    static void a(MessageService messageservice, int i1)
    {
        messageservice.a(i1);
    }

    static void a(MessageService messageservice, Message message)
    {
        messageservice.a(message);
    }

    static void a(MessageService messageservice, Messenger messenger)
    {
        messageservice.a(messenger);
    }

    static void a(MessageService messageservice, cq cq)
    {
        messageservice.a(cq);
    }

    static void a(MessageService messageservice, boolean flag)
    {
        messageservice.e(flag);
    }

    private void a(cq cq)
    {
        p.a(cq);
        u.a(true);
    }

    private void a(boolean flag)
    {
        a(flag, false, null, null, false);
    }

    private void a(boolean flag, boolean flag1, String s1, String as1[], boolean flag2)
    {
        int i1;
        boolean flag3;
        flag3 = false;
        i1 = h.a;
        as1 = q.a(as1);
        if (u.a()) goto _L2; else goto _L1
_L1:
        if (flag1)
        {
            Log.i(H[19]);
            com.whatsapp.messaging.c.b(A);
        }
        if (App.v(this) && !f())
        {
            if (!g());
        }
_L4:
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        E.a(true);
        z.a(true);
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!E.a()) goto _L4; else goto _L3
_L3:
        if (D && t != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (E.a() && z.a())
        {
            z.a(false);
            Log.i((new StringBuilder()).append(H[18]).append(D).append(',').append(t).append(')').toString());
            App.F();
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        Log.i(H[17]);
        return;
        if (!y || !l || !d || x) goto _L4; else goto _L5
_L5:
label0:
        {
            if (!App.R())
            {
                flag = flag3;
                if (!my.r())
                {
                    break label0;
                }
            }
            flag = true;
        }
        App.h(flag);
        com.whatsapp.messaging.c.a(A, i, G, s1, flag, App.q, as1, flag2);
        return;
    }

    private void b()
    {
        Log.i(H[58]);
        AlarmManager alarmmanager = (AlarmManager)getSystemService(H[59]);
        PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(e), 0);
        alarmmanager.cancel(pendingintent);
        alarmmanager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 15000L, 0x3a980L, pendingintent);
    }

    public static void b(Context context)
    {
        context.startService((new Intent(context, com/whatsapp/messaging/MessageService)).setAction(H[50]));
    }

    public static void b(Context context, boolean flag)
    {
        a(context, flag, false, false, null, null);
    }

    static void b(MessageService messageservice)
    {
        messageservice.k();
    }

    static void b(MessageService messageservice, boolean flag)
    {
        messageservice.d(flag);
    }

    private void b(boolean flag)
    {
        y = flag;
    }

    static Messenger c(MessageService messageservice)
    {
        return messageservice.A;
    }

    private void c()
    {
        boolean flag;
        try
        {
            Log.i(H[39]);
            flag = y;
        }
        catch (InterruptedException interruptedexception)
        {
            throw interruptedexception;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        InterruptedException interruptedexception1;
        try
        {
            b(false);
            if (!u.a())
            {
                p.d();
            }
        }
        catch (InterruptedException interruptedexception2)
        {
            throw interruptedexception2;
        }
        u.a(true);
        if (!d)
        {
            break; /* Loop/switch isn't completed */
        }
        unregisterReceiver(F);
        w.quit();
        try
        {
            w.join();
        }
        catch (InterruptedException interruptedexception3)
        {
            Log.w(H[40]);
            Thread.currentThread().interrupt();
        }
        w = null;
        b = null;
        h = new CountDownLatch(1);
        o.set(false);
        com.whatsapp.messaging.c.e(A);
        d = false;
        if (h.a == 0) goto _L1; else goto _L3
_L3:
        k.quit();
        return;
        interruptedexception1;
        throw interruptedexception1;
    }

    static void c(MessageService messageservice, boolean flag)
    {
        messageservice.c(flag);
    }

    private void c(boolean flag)
    {
        Object obj;
        int j1;
        j1 = h.a;
        obj = ((ConnectivityManager)getSystemService(H[34])).getActiveNetworkInfo();
        Log.i((new StringBuilder()).append(H[37]).append(obj).append(H[35]).append(flag).toString());
        App.F();
        if (obj != null) goto _L2; else goto _L1
_L1:
        j.sendMessage(Message.obtain(j, 0, -1, 0));
        if (j1 == 0) goto _L3; else goto _L2
_L2:
        boolean flag3;
label0:
        {
label1:
            {
label2:
                {
                    Object obj1;
                    Handler handler;
                    boolean flag1;
                    int i1;
                    int k1;
                    boolean flag2;
                    if (((NetworkInfo) (obj)).getState() == android.net.NetworkInfo.State.CONNECTED)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        flag2 = CaptivePortalActivity.a(((NetworkInfo) (obj)));
                    } else
                    {
                        flag2 = false;
                    }
                    obj1 = j;
                    handler = j;
                    k1 = ((NetworkInfo) (obj)).getType();
                    if (flag1 && !flag2)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    ((Handler) (obj1)).sendMessage(Message.obtain(handler, 0, k1, i1));
                    if (!flag1 || !flag2)
                    {
                        break label1;
                    }
                    flag3 = flag2;
                    if (flag)
                    {
                        break label0;
                    }
                    obj = new Intent(B);
                    obj = PendingIntent.getBroadcast(getApplicationContext(), 0, ((Intent) (obj)), 0);
                    obj1 = (AlarmManager)getSystemService(H[36]);
                    if (android.os.Build.VERSION.SDK_INT >= 19)
                    {
                        ((AlarmManager) (obj1)).setExact(2, SystemClock.elapsedRealtime() + 60000L, ((PendingIntent) (obj)));
                        if (j1 == 0)
                        {
                            break label2;
                        }
                    }
                    ((AlarmManager) (obj1)).set(2, SystemClock.elapsedRealtime() + 60000L, ((PendingIntent) (obj)));
                }
                Log.i(H[33]);
                return;
            }
            obj = new Intent(B);
            obj = PendingIntent.getBroadcast(getApplicationContext(), 0, ((Intent) (obj)), 0x20000000);
            flag3 = flag2;
            if (obj != null)
            {
                Log.i(H[32]);
                ((AlarmManager)getSystemService(H[38])).cancel(((PendingIntent) (obj)));
                flag3 = flag2;
            }
        }
_L5:
        o.set(flag3);
        h.countDown();
        return;
_L3:
        flag3 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static Handler d(MessageService messageservice)
    {
        return messageservice.b;
    }

    private void d()
    {
        if (y)
        {
            return;
        } else
        {
            Log.i(H[60]);
            b(true);
            k = new as(this, C);
            k.start();
            return;
        }
    }

    private void d(boolean flag)
    {
label0:
        {
label1:
            {
                int i1;
label2:
                {
                    i1 = h.a;
                    if (D == flag)
                    {
                        break label1;
                    }
                    if (flag)
                    {
                        Log.i(H[55]);
                        a(true);
                        if (i1 == 0)
                        {
                            break label2;
                        }
                    }
                    Log.i(H[54]);
                    if (d)
                    {
                        com.whatsapp.messaging.c.a(A, true);
                    }
                }
                D = flag;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (flag)
            {
                a(false, true, null, null, false);
            }
        }
    }

    private void e()
    {
        a1 a1_1 = E;
        boolean flag;
        if (!App.v(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1_1.a(flag);
    }

    static void e(MessageService messageservice)
    {
        messageservice.m();
    }

    private void e(boolean flag)
    {
label0:
        {
            u.a(true);
            p.d();
            j();
            r();
            if (!flag)
            {
                break label0;
            }
            NetworkInfo networkinfo = ((ConnectivityManager)getSystemService(H[0])).getActiveNetworkInfo();
            if (networkinfo != null && networkinfo.isConnected())
            {
                w();
                if (h.a == 0)
                {
                    break label0;
                }
            }
            E.a(true);
        }
        if (App.as.f())
        {
            E.a(true);
        }
    }

    static void f(MessageService messageservice)
    {
        messageservice.u();
    }

    private boolean f()
    {
        return c;
    }

    private boolean g()
    {
label0:
        {
            Log.i(H[41]);
            AlarmManager alarmmanager;
            PendingIntent pendingintent;
            boolean flag;
            if (!c)
            {
                registerReceiver(a, new IntentFilter(f));
                c = true;
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break label0;
            }
            alarmmanager = (AlarmManager)getSystemService(H[42]);
            pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(f), 0);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                alarmmanager.setExact(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
                if (h.a == 0)
                {
                    break label0;
                }
            }
            alarmmanager.set(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
        }
        return flag;
    }

    static boolean g(MessageService messageservice)
    {
        return messageservice.d;
    }

    private void h()
    {
        e();
    }

    static void h(MessageService messageservice)
    {
        messageservice.h();
    }

    static void i(MessageService messageservice)
    {
        messageservice.n();
    }

    private void j()
    {
        Log.i(H[67]);
        AlarmManager alarmmanager = (AlarmManager)getSystemService(H[68]);
        PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(e), 0x20000000);
        if (pendingintent != null)
        {
            alarmmanager.cancel(pendingintent);
        }
    }

    static void j(MessageService messageservice)
    {
        messageservice.r();
    }

    private void k()
    {
        p.e();
    }

    static String l()
    {
        return B;
    }

    private void m()
    {
label0:
        {
            Log.i(H[8]);
            if (!c)
            {
                break label0;
            }
            AlarmManager alarmmanager = (AlarmManager)getSystemService(H[7]);
            PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(f), 0);
            alarmmanager.cancel(pendingintent);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                alarmmanager.setExact(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
                if (h.a == 0)
                {
                    break label0;
                }
            }
            alarmmanager.set(2, SystemClock.elapsedRealtime() + 0x927c0L, pendingintent);
        }
    }

    private void n()
    {
        p.a();
    }

    static String p()
    {
        return f;
    }

    static String q()
    {
        return e;
    }

    private void r()
    {
        Log.i(H[5]);
        if (c)
        {
            PendingIntent pendingintent = PendingIntent.getBroadcast(this, 0, new Intent(f), 0x20000000);
            if (pendingintent != null)
            {
                ((AlarmManager)getSystemService(H[4])).cancel(pendingintent);
                pendingintent.cancel();
            }
            unregisterReceiver(a);
            c = false;
        }
    }

    private void s()
    {
        Log.i(H[9]);
        g = 0L;
        s = 10000L;
    }

    private void u()
    {
        u.a(false);
        p.b();
        if (App.v(this))
        {
            a();
        }
        s();
        e();
        b();
    }

    private void v()
    {
        p.f();
    }

    private void w()
    {
label0:
        {
            if (r)
            {
                Log.i(H[12]);
                return;
            }
            AlarmManager alarmmanager = (AlarmManager)getSystemService(H[15]);
            long l1 = SystemClock.elapsedRealtime();
            Object obj = (new Intent(this, com/whatsapp/messaging/MessageService)).setAction(H[13]).putExtra(H[11], true);
            long l2 = x();
            if (l2 == 0L)
            {
                Log.i(H[14]);
                startService(((Intent) (obj)));
                return;
            }
            long l3 = l2 / 2L;
            l2 = m.nextLong() % l2 + l3;
            Log.i((new StringBuilder()).append(H[10]).append(l2).toString());
            obj = PendingIntent.getService(this, 0, ((Intent) (obj)), 0);
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                alarmmanager.setExact(2, l1 + l2, ((PendingIntent) (obj)));
                if (h.a == 0)
                {
                    break label0;
                }
            }
            alarmmanager.set(2, l1 + l2, ((PendingIntent) (obj)));
        }
        r = true;
    }

    private long x()
    {
        if (g > 0xa4cb800L)
        {
            return 0xa4cb800L;
        } else
        {
            s = s + g;
            g = s - g;
            return s - g;
        }
    }

    static boolean y()
    {
        Log.i(H[66]);
        h.await();
        boolean flag = o.get();
        Log.i((new StringBuilder()).append(H[65]).append(flag).toString());
        return flag;
    }

    public void a(String s1, byte abyte0[])
    {
        i = s1;
        G = abyte0;
    }

    public void a(String s1, byte abyte0[], af af1)
    {
        i = s1;
        G = abyte0;
        p = af1;
        l = true;
        a(true);
        if (d)
        {
            af1.c();
        }
    }

    public void b(Message message)
    {
        c(message);
    }

    public void c(Message message)
    {
        int i1 = h.a;
        com.whatsapp.messaging.h.a(message);
        JVM INSTR tableswitch 2 91: default 384
    //                   2 450
    //                   3 384
    //                   4 424
    //                   5 384
    //                   6 396
    //                   7 396
    //                   8 384
    //                   9 384
    //                   10 454
    //                   11 384
    //                   12 450
    //                   13 450
    //                   14 450
    //                   15 450
    //                   16 384
    //                   17 450
    //                   18 450
    //                   19 384
    //                   20 450
    //                   21 384
    //                   22 384
    //                   23 450
    //                   24 450
    //                   25 450
    //                   26 384
    //                   27 384
    //                   28 450
    //                   29 450
    //                   30 450
    //                   31 396
    //                   32 396
    //                   33 450
    //                   34 450
    //                   35 384
    //                   36 384
    //                   37 396
    //                   38 384
    //                   39 384
    //                   40 384
    //                   41 384
    //                   42 384
    //                   43 384
    //                   44 384
    //                   45 384
    //                   46 384
    //                   47 384
    //                   48 384
    //                   49 384
    //                   50 384
    //                   51 384
    //                   52 384
    //                   53 384
    //                   54 384
    //                   55 384
    //                   56 450
    //                   57 450
    //                   58 384
    //                   59 450
    //                   60 450
    //                   61 450
    //                   62 450
    //                   63 450
    //                   64 450
    //                   65 450
    //                   66 384
    //                   67 450
    //                   68 450
    //                   69 450
    //                   70 450
    //                   71 450
    //                   72 384
    //                   73 384
    //                   74 384
    //                   75 396
    //                   76 450
    //                   77 450
    //                   78 450
    //                   79 450
    //                   80 450
    //                   81 450
    //                   82 450
    //                   83 384
    //                   84 384
    //                   85 384
    //                   86 384
    //                   87 396
    //                   88 384
    //                   89 450
    //                   90 450
    //                   91 450;
           goto _L1 _L2 _L1 _L3 _L1 _L4 _L4 _L1 _L1 _L5 _L1 _L2 _L2 _L2 _L2 _L1 _L2 _L2 _L1 _L2 _L1 _L1 _L2 _L2 _L2 _L1 _L1 _L2 _L2 _L2 _L4 _L4 _L2 _L2 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L1 _L2 _L2 _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L1 _L2 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L4 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L1 _L1 _L1 _L1 _L4 _L1 _L2 _L2 _L2
_L1:
        com.whatsapp.messaging.c.a(A, Message.obtain(message));
_L6:
        return;
_L4:
        com.whatsapp.messaging.c.a(A, Message.obtain(message));
        m();
        s();
        a(true);
        if (i1 == 0) goto _L6; else goto _L3
_L3:
        m();
        if (message.obj == null) goto _L6; else goto _L7
_L7:
        com.whatsapp.messaging.c.a(A, Message.obtain(message));
        if (i1 == 0) goto _L6; else goto _L2
_L2:
        m();
_L5:
        s();
        a(true);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void i()
    {
        App.q(H[6]);
        com.whatsapp.messaging.c.d(A);
    }

    public void o()
    {
        com.whatsapp.messaging.c.c(A);
    }

    public IBinder onBind(Intent intent)
    {
        return n;
    }

    public void onCreate()
    {
        super.onCreate();
        Log.i(H[64]);
        registerReceiver(v, new IntentFilter(e));
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i(H[20]);
        if (y)
        {
            c();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
label0:
        {
            i1 = h.a;
            String s1;
            if (intent != null)
            {
                s1 = intent.getAction();
            } else
            {
                s1 = null;
            }
            if (s1 == null)
            {
                d();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (s1.equals(H[21]))
            {
                c();
                x = true;
                stopSelf();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (s1.equals(H[28]))
            {
                x = false;
                d();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (s1.equals(H[22]))
            {
                r = false;
                d();
                boolean flag = intent.getBooleanExtra(H[25], false);
                boolean flag1 = intent.getBooleanExtra(H[23], false);
                boolean flag2 = intent.getBooleanExtra(H[27], false);
                String s2 = intent.getStringExtra(H[26]);
                String as1[] = intent.getStringArrayExtra(H[24]);
                boolean flag3 = intent.getBooleanExtra(H[30], false);
                if (flag)
                {
                    s();
                }
                a(flag1, flag2, s2, as1, flag3);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (s1.equals(H[29]))
            {
                d();
                if (intent.getBooleanExtra(H[31], false))
                {
                    h();
                }
            }
        }
        return 1;
    }

    public void t()
    {
        App.q(H[53]);
        com.whatsapp.messaging.c.a(A);
        m();
        s();
        a(true);
        com.whatsapp.messaging.c.b(A);
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as1 = new String[71];
        obj = "disP[drtHWs\177";
        byte0 = -1;
        i1 = 0;
_L74:
        String as2[];
        int k1;
        int l1;
        as2 = as1;
        obj = ((String) (obj)).toCharArray();
        l1 = obj.length;
        k1 = 0;
_L86:
        if (l1 > k1) goto _L2; else goto _L1
_L1:
        obj = (new String(((char []) (obj)))).intern();
        byte0;
        JVM INSTR tableswitch 0 69: default 344
    //                   0 360
    //                   1 376
    //                   2 392
    //                   3 408
    //                   4 424
    //                   5 441
    //                   6 459
    //                   7 477
    //                   8 495
    //                   9 513
    //                   10 531
    //                   11 549
    //                   12 567
    //                   13 585
    //                   14 603
    //                   15 621
    //                   16 639
    //                   17 657
    //                   18 675
    //                   19 693
    //                   20 711
    //                   21 729
    //                   22 747
    //                   23 765
    //                   24 783
    //                   25 801
    //                   26 819
    //                   27 837
    //                   28 855
    //                   29 873
    //                   30 891
    //                   31 909
    //                   32 927
    //                   33 945
    //                   34 963
    //                   35 981
    //                   36 999
    //                   37 1017
    //                   38 1035
    //                   39 1053
    //                   40 1071
    //                   41 1089
    //                   42 1107
    //                   43 1125
    //                   44 1143
    //                   45 1161
    //                   46 1179
    //                   47 1197
    //                   48 1215
    //                   49 1233
    //                   50 1251
    //                   51 1269
    //                   52 1287
    //                   53 1305
    //                   54 1323
    //                   55 1341
    //                   56 1359
    //                   57 1377
    //                   58 1395
    //                   59 1413
    //                   60 1431
    //                   61 1449
    //                   62 1467
    //                   63 1485
    //                   64 1503
    //                   65 1521
    //                   66 1539
    //                   67 1557
    //                   68 1575
    //                   69 1593;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73
_L3:
        as2[i1] = ((String) (obj));
        obj = "jcnM_`cBM[upt][(jrYYbbBXRfa2SKtrBL[disP[dr";
        i1 = 1;
        byte0 = 0;
          goto _L74
_L4:
        as2[i1] = ((String) (obj));
        i1 = 2;
        obj = "jcnM_`cBM[upt][(jrYYbbBXRfa2ZWterPPbei[Z";
        byte0 = 1;
          goto _L74
_L5:
        as2[i1] = ((String) (obj));
        i1 = 3;
        obj = "jcnM_`cBM[upt][(jrYYbbBXRfa2SKtrBWYiio[aiciIQumBQPdc";
        byte0 = 2;
          goto _L74
_L6:
        as2[i1] = ((String) (obj));
        i1 = 4;
        obj = "fj|LS";
        byte0 = 3;
          goto _L74
_L7:
        as2[i1] = ((String) (obj));
        i1 = 5;
        obj = "\177kmN\021tcoHWdc2RQ`ihJ\023sop[L(btM_ejx";
        byte0 = 4;
          goto _L74
_L8:
        as2[i1] = ((String) (obj));
        obj = "tcnMWhh=WPfeiWHb";
        byte0 = 5;
        i1 = 6;
          goto _L74
_L9:
        as2[i1] = ((String) (obj));
        obj = "fj|LS";
        i1 = 7;
        byte0 = 6;
          goto _L74
_L10:
        as2[i1] = ((String) (obj));
        i1 = 8;
        obj = "\177kmN\021tcoHWdc2RQ`ihJ\023sop[L(txM[s";
        byte0 = 7;
          goto _L74
_L11:
        as2[i1] = ((String) (obj));
        i1 = 9;
        obj = "\177kmN\021tcoHWdc2\\_dmBQXa)o[Mbr";
        byte0 = 8;
          goto _L74
_L12:
        as2[i1] = ((String) (obj));
        i1 = 10;
        obj = "\177kmN\021tcoHWdc2L[disP[dr2";
        byte0 = 9;
          goto _L74
_L13:
        as2[i1] = ((String) (obj));
        i1 = 11;
        obj = "aio][";
        byte0 = 10;
          goto _L74
_L14:
        as2[i1] = ((String) (obj));
        i1 = 12;
        obj = "\177kmN\021tcoHWdc2L[disP[dr2_Ruc|ZG*vxPZnhz";
        byte0 = 11;
          goto _L74
_L15:
        as2[i1] = ((String) (obj));
        i1 = 13;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3l{DISp{DR";
        byte0 = 12;
          goto _L74
_L16:
        as2[i1] = ((String) (obj));
        i1 = 14;
        obj = "\177kmN\021tcoHWdc2L[disP[dr2WSjcyW_sc";
        byte0 = 13;
          goto _L74
_L17:
        as2[i1] = ((String) (obj));
        i1 = 15;
        obj = "fj|LS";
        byte0 = 14;
          goto _L74
_L18:
        as2[i1] = ((String) (obj));
        i1 = 16;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3mjHVBpqXTXmjFTI";
        byte0 = 15;
          goto _L74
_L19:
        as2[i1] = ((String) (obj));
        i1 = 17;
        obj = "\177kmN\021tcoHWdc2L[disP[dr2P[sqrLUXss_Hfoq_\\kc";
        byte0 = 16;
          goto _L74
_L20:
        as2[i1] = ((String) (obj));
        i1 = 18;
        obj = "\177kmN\021tcoHWdc2P[sqrLU(ozPQuc=\026";
        byte0 = 17;
          goto _L74
_L21:
        as2[i1] = ((String) (obj));
        i1 = 19;
        obj = "\177kmN\021tcoHWdc2L[disP[dr2PQsYyWMdisP[drxZ\021dnx]UXerPPbeiWHnrd";
        byte0 = 18;
          goto _L74
_L22:
        as2[i1] = ((String) (obj));
        i1 = 20;
        obj = "\177kmN\021tcoHWdc2Z[troQG";
        byte0 = 19;
          goto _L74
_L23:
        as2[i1] = ((String) (obj));
        i1 = 21;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3mjHVBpqXTXmjFTI";
        byte0 = 20;
          goto _L74
_L24:
        as2[i1] = ((String) (obj));
        i1 = 22;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3l{DISp{DR";
        byte0 = 21;
          goto _L74
_L25:
        as2[i1] = ((String) (obj));
        i1 = 23;
        obj = "aio][";
        byte0 = 22;
          goto _L74
_L26:
        as2[i1] = ((String) (obj));
        i1 = 24;
        obj = "agqR\\fevaWwu";
        byte0 = 23;
          goto _L74
_L27:
        as2[i1] = ((String) (obj));
        i1 = 25;
        obj = "ucn[J";
        byte0 = 24;
          goto _L74
_L28:
        as2[i1] = ((String) (obj));
        i1 = 26;
        obj = "nvB_ZctxMM";
        byte0 = 25;
          goto _L74
_L29:
        as2[i1] = ((String) (obj));
        i1 = 27;
        obj = "dnx]UXerPPbeiWQi";
        byte0 = 26;
          goto _L74
_L30:
        as2[i1] = ((String) (obj));
        i1 = 28;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3mjFTI";
        byte0 = 27;
          goto _L74
_L31:
        as2[i1] = ((String) (obj));
        i1 = 29;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3m{SY^qpIC^jwHHBjgWC";
        byte0 = 28;
          goto _L74
_L32:
        as2[i1] = ((String) (obj));
        i1 = 30;
        obj = "hpxLLnbxa[\177vtL[c";
        byte0 = 29;
          goto _L74
_L33:
        as2[i1] = ((String) (obj));
        i1 = 31;
        obj = "kisYadisP[dr";
        byte0 = 30;
          goto _L74
_L34:
        as2[i1] = ((String) (obj));
        i1 = 32;
        obj = "disP[drtHWs\177=L[std\036_kgoS\036dgs][kcy";
        byte0 = 31;
          goto _L74
_L35:
        as2[i1] = ((String) (obj));
        i1 = 33;
        obj = "disP[drtHWs\177=L[std\036_kgoS\036tci\036Xht=\b\01676-SM'`oQS'hrI";
        byte0 = 32;
          goto _L74
_L36:
        as2[i1] = ((String) (obj));
        i1 = 34;
        obj = "disP[drtHWs\177";
        byte0 = 33;
          goto _L74
_L37:
        as2[i1] = ((String) (obj));
        i1 = 35;
        obj = "'onl[std\003";
        byte0 = 34;
          goto _L74
_L38:
        as2[i1] = ((String) (obj));
        i1 = 36;
        obj = "fj|LS";
        byte0 = 35;
          goto _L74
_L39:
        as2[i1] = ((String) (obj));
        i1 = 37;
        obj = "\177kmN\021tcoHWdc2P[sqrLU(g~JWqc=";
        byte0 = 36;
          goto _L74
_L40:
        as2[i1] = ((String) (obj));
        i1 = 38;
        obj = "fj|LS";
        byte0 = 37;
          goto _L74
_L41:
        as2[i1] = ((String) (obj));
        i1 = 39;
        obj = "\177kmN\021tcoHWdc2MJhv";
        byte0 = 38;
          goto _L74
_L42:
        as2[i1] = ((String) (obj));
        i1 = 40;
        obj = "nhi[LusmJ[c&jVWkc=I_nrtPY'is\036]hhs[]sokWJ~&u_PcjxL\036sno[_c&iQ\036b~tJ";
        byte0 = 39;
          goto _L74
_L43:
        as2[i1] = ((String) (obj));
        i1 = 41;
        obj = "\177kmN\021tcoHWdc2RQ`ihJ\023sop[L(ui_Lso{P[dcnM_u\177";
        byte0 = 40;
          goto _L74
_L44:
        as2[i1] = ((String) (obj));
        i1 = 42;
        obj = "fj|LS";
        byte0 = 41;
          goto _L74
_L45:
        as2[i1] = ((String) (obj));
        i1 = 43;
        obj = "hpxLLnbxa[\177vtL[c";
        byte0 = 42;
          goto _L74
_L46:
        as2[i1] = ((String) (obj));
        i1 = 44;
        obj = "nvB_ZctxMM";
        byte0 = 43;
          goto _L74
_L47:
        as2[i1] = ((String) (obj));
        i1 = 45;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3l{DISp{DR";
        byte0 = 44;
          goto _L74
_L48:
        as2[i1] = ((String) (obj));
        i1 = 46;
        obj = "aio][";
        byte0 = 45;
          goto _L74
_L49:
        as2[i1] = ((String) (obj));
        i1 = 47;
        obj = "agqR\\fevaWwu";
        byte0 = 46;
          goto _L74
_L50:
        as2[i1] = ((String) (obj));
        i1 = 48;
        obj = "ucn[J";
        byte0 = 47;
          goto _L74
_L51:
        as2[i1] = ((String) (obj));
        i1 = 49;
        obj = "dnx]UXerPPbeiWQi";
        byte0 = 48;
          goto _L74
_L52:
        as2[i1] = ((String) (obj));
        i1 = 50;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3mjFTI";
        byte0 = 49;
          goto _L74
_L53:
        as2[i1] = ((String) (obj));
        i1 = 51;
        obj = "\177kmN\021tcoHWdc2RQ`ihJ\023sop[L(cs_\\kc";
        byte0 = 50;
          goto _L74
_L54:
        as2[i1] = ((String) (obj));
        i1 = 52;
        obj = "fj|LS";
        byte0 = 51;
          goto _L74
_L55:
        as2[i1] = ((String) (obj));
        i1 = 53;
        obj = "tcnMWhh=_]sok[";
        byte0 = 52;
          goto _L74
_L56:
        as2[i1] = ((String) (obj));
        i1 = 54;
        obj = "\177kmN\021tcoHWdc2P[sqrLU(brIP";
        byte0 = 53;
          goto _L74
_L57:
        as2[i1] = ((String) (obj));
        i1 = 55;
        obj = "\177kmN\021tcoHWdc2P[sqrLU(sm";
        byte0 = 54;
          goto _L74
_L58:
        as2[i1] = ((String) (obj));
        i1 = 56;
        obj = "\177kmN\021tcoHWdc2P[sqrLU(ujWJdn=QRc;";
        byte0 = 55;
          goto _L74
_L59:
        as2[i1] = ((String) (obj));
        i1 = 57;
        obj = "'hxI\003";
        byte0 = 56;
          goto _L74
_L60:
        as2[i1] = ((String) (obj));
        i1 = 58;
        obj = "\177kmN\021tcoHWdc2]RncsJ\023wosY[u+iWSbt2MJfti";
        byte0 = 57;
          goto _L74
_L61:
        as2[i1] = ((String) (obj));
        i1 = 59;
        obj = "fj|LS";
        byte0 = 58;
          goto _L74
_L62:
        as2[i1] = ((String) (obj));
        i1 = 60;
        obj = "\177kmN\021tcoHWdc2MJfti";
        byte0 = 59;
          goto _L74
_L63:
        as2[i1] = ((String) (obj));
        i1 = 61;
        obj = "JcnM_`cN[Lqo~[\036DisP[drtHWs\177=v_ibq[L";
        byte0 = 60;
          goto _L74
_L64:
        as2[i1] = ((String) (obj));
        obj = "disP[drtHWs\177";
        byte0 = 61;
        i1 = 62;
          goto _L74
_L65:
        as2[i1] = ((String) (obj));
        i1 = 63;
        obj = "fhyLQnb3P[s(~QPi(^qpIC^jwQOIgaDN\\pyB";
        byte0 = 62;
          goto _L74
_L66:
        as2[i1] = ((String) (obj));
        i1 = 64;
        obj = "\177kmN\021tcoHWdc2]Lbgi[";
        byte0 = 63;
          goto _L74
_L67:
        as2[i1] = ((String) (obj));
        i1 = 65;
        obj = "dgmJWqc=IWao=MJfrhM\036nu=";
        byte0 = 64;
          goto _L74
_L68:
        as2[i1] = ((String) (obj));
        i1 = 66;
        obj = "fq|WJnhz\036]fviWHb&jWXn&nJ_ssn";
        byte0 = 65;
          goto _L74
_L69:
        as2[i1] = ((String) (obj));
        i1 = 67;
        obj = "\177kmN\021tcoHWdc2]RncsJ\023wosY[u+iWSbt2MJhv";
        byte0 = 66;
          goto _L74
_L70:
        as2[i1] = ((String) (obj));
        i1 = 68;
        obj = "fj|LS";
        byte0 = 67;
          goto _L74
_L71:
        as2[i1] = ((String) (obj));
        i1 = 69;
        obj = "kisYadisP[dr";
        byte0 = 68;
          goto _L74
_L72:
        as2[i1] = ((String) (obj));
        i1 = 70;
        obj = "dip\020IogiM_wv3s[tu|Y[TcoHWdc3m{SY^qpIC^jwHHBjgWC";
        byte0 = 69;
          goto _L74
_L73:
        Object obj1;
        as2[i1] = ((String) (obj));
        H = as1;
        obj = (new StringBuilder()).append(com/whatsapp/messaging/MessageService.getCanonicalName());
        obj1 = ")ERppBEIwhNRDalBROgaFEIwqI";
        i1 = -1;
_L80:
        int j1;
        obj1 = ((String) (obj1)).toCharArray();
        k1 = obj1.length;
        j1 = 0;
_L93:
        if (k1 > j1) goto _L76; else goto _L75
_L75:
        obj1 = (new String(((char []) (obj1)))).intern();
        i1;
        JVM INSTR tableswitch 0 1: default 1680
    //                   0 1893
    //                   1 1929;
           goto _L77 _L78 _L79
_L77:
        B = ((StringBuilder) (obj)).append(((String) (obj1))).toString();
        obj = (new StringBuilder()).append(com/whatsapp/messaging/MessageService.getCanonicalName());
        obj1 = ")JRyqRRB\177}SORp";
        i1 = 0;
          goto _L80
_L2:
        char c1 = obj[k1];
        k1 % 5;
        JVM INSTR tableswitch 0 3: default 1756
    //                   0 1779
    //                   1 1786
    //                   2 1793
    //                   3 1800;
           goto _L81 _L82 _L83 _L84 _L85
_L81:
        j1 = 62;
_L87:
        obj[k1] = (char)(j1 ^ c1);
        k1++;
          goto _L86
_L82:
        j1 = 7;
          goto _L87
_L83:
        j1 = 6;
          goto _L87
_L84:
        j1 = 29;
          goto _L87
_L85:
        j1 = 62;
          goto _L87
_L76:
        l1 = obj1[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1848
    //                   0 1869
    //                   1 1875
    //                   2 1881
    //                   3 1887;
           goto _L88 _L89 _L90 _L91 _L92
_L88:
        byte0 = 62;
_L94:
        obj1[j1] = (char)(byte0 ^ l1);
        j1++;
          goto _L93
_L89:
        byte0 = 7;
          goto _L94
_L90:
        byte0 = 6;
          goto _L94
_L91:
        byte0 = 29;
          goto _L94
_L92:
        byte0 = 62;
          goto _L94
_L78:
        f = ((StringBuilder) (obj)).append(((String) (obj1))).toString();
        obj = (new StringBuilder()).append(com/whatsapp/messaging/MessageService.getCanonicalName());
        obj1 = ")EQw{IRBnwIAXlaFEIwqI";
        i1 = 1;
          goto _L80
_L79:
        e = ((StringBuilder) (obj)).append(((String) (obj1))).toString();
        o = new AtomicBoolean();
        h = new CountDownLatch(1);
        if (true) goto _L74; else goto _L95
_L95:
    }

    private class _cls1 extends BroadcastReceiver
    {

        private static final String z[];
        final MessageService a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                int i1 = h.a;
                if (z[3].equals(intent.getAction()))
                {
                    if (!MessageService.d(a).post(new b3(this)))
                    {
                        Log.w((new StringBuilder()).append(z[1]).append(intent).toString());
                    }
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (MessageService.l().equals(intent.getAction()))
                {
                    if (!MessageService.d(a).post(new a(this)))
                    {
                        Log.w((new StringBuilder()).append(z[2]).append(intent).toString());
                    }
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                Log.w((new StringBuilder()).append(z[0]).append(intent).toString());
            }
        }

        static 
        {
            Object obj;
            String as1[];
            byte byte1;
            int i1;
            as1 = new String[4];
            obj = "gB\035\\KeBV[JfI\030F\004`I\025WMdI\022\022M|\f\025]J|I\025FMdE\002K\004`I\025WMdI\004\022";
            byte1 = -1;
            i1 = 0;
_L2:
            String as2[];
            int j1;
            int k1;
            as2 = as1;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as2[i1] = ((String) (obj));
                    obj = "tM\037^Av\f\002]\004bC\005F\004qD\023QO\\I\002EK`G%FEfIV@Q|B\027PHw\026V";
                    i1 = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as2[i1] = ((String) (obj));
                    obj = "tM\037^Av\f\002]\004bC\005F\004qD\023QO\\I\002EK`G%FEfIV@Q|B\027PHw\026V";
                    i1 = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as2[i1] = ((String) (obj));
                    i1 = 3;
                    obj = "sB\022@K{HX\\Af\002\025]J|\0025}j\\i5fmDe\"k{Qd7|cW";
                    byte1 = 2;
                    break;

                case 2: // '\002'
                    as2[i1] = ((String) (obj));
                    z = as1;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 176
        //                       0 197
        //                       1 203
        //                       2 209
        //                       3 215;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_215;
_L3:
            byte byte0 = 36;
_L9:
            obj[j1] = (char)(byte0 ^ c1);
            j1++;
              goto _L8
_L4:
            byte0 = 18;
              goto _L9
_L5:
            byte0 = 44;
              goto _L9
_L6:
            byte0 = 118;
              goto _L9
            byte0 = 50;
              goto _L9
        }

        _cls1()
        {
            a = MessageService.this;
            super();
        }
    }


    private class _cls3 extends BroadcastReceiver
    {

        private static final String z[];
        final MessageService a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                int i1 = h.a;
                if (MessageService.p().equals(intent.getAction()))
                {
                    Log.i(z[0]);
                    if (!App.v(a))
                    {
                        MessageService.j(a);
                        MessageService.h(a);
                        if (i1 == 0)
                        {
                            break label0;
                        }
                    }
                    if (Voip.h())
                    {
                        MessageService.e(a);
                        com.whatsapp.messaging.c.b(MessageService.c(a));
                        if (i1 == 0)
                        {
                            break label0;
                        }
                    }
                    com.whatsapp.messaging.c.a(MessageService.c(a), false);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                Log.w((new StringBuilder()).append(z[1]).append(intent).toString());
            }
        }

        static 
        {
            Object obj;
            String as1[];
            byte byte1;
            int i1;
            as1 = new String[2];
            obj = "k2\001\0224`:\003\024rp:^\016tt0\004\0266g6\034\007i<+\030\017~|*\005";
            byte1 = -1;
            i1 = 0;
_L2:
            String as2[];
            int j1;
            int k1;
            as2 = as1;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as2[i1] = ((String) (obj));
                    i1 = 1;
                    obj = "f1\032\ftd1Q\013ug:\037\026;a:\022\007re:\025Br}\177\035\r||*\005Biv<\024\013mv-Q";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as2[i1] = ((String) (obj));
                    z = as1;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 136
        //                       0 157
        //                       1 163
        //                       2 169
        //                       3 175;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_175;
_L3:
            byte byte0 = 27;
_L9:
            obj[j1] = (char)(byte0 ^ c1);
            j1++;
              goto _L8
_L4:
            byte0 = 19;
              goto _L9
_L5:
            byte0 = 95;
              goto _L9
_L6:
            byte0 = 113;
              goto _L9
            byte0 = 98;
              goto _L9
        }

        _cls3()
        {
            a = MessageService.this;
            super();
        }
    }


    private class _cls4 extends BroadcastReceiver
    {

        private static final String z[];
        final MessageService a;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                if (MessageService.q().equals(intent.getAction()))
                {
                    Log.i((new StringBuilder()).append(z[0]).append(MessageService.g(a)).toString());
                    if (!MessageService.g(a))
                    {
                        break label0;
                    }
                    com.whatsapp.messaging.c.b(MessageService.c(a));
                    if (h.a == 0)
                    {
                        break label0;
                    }
                }
                Log.w((new StringBuilder()).append(z[1]).append(intent).toString());
            }
        }

        static 
        {
            Object obj;
            String as1[];
            byte byte1;
            int i1;
            as1 = new String[2];
            obj = "br\021\001Biz\023\007\004yzN\022\001sz\017\005@jv\017\026\bh2\025\030\000\177mN\027\004hzA\022\002tq\004\022\031sp\017%\005hz\000\025?\177~\005\bW";
            byte1 = -1;
            i1 = 0;
_L2:
            String as2[];
            int j1;
            int k1;
            as2 = as1;
            obj = ((String) (obj)).toCharArray();
            k1 = obj.length;
            j1 = 0;
_L8:
label0:
            {
                if (k1 > j1)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as2[i1] = ((String) (obj));
                    i1 = 1;
                    obj = "oq\n\037\002mqA\030\003nz\017\005Mhz\002\024\004lz\005Q\004t?\002\035\004\177q\025Q\035sq\006\024\037:m\004\022\bsi\004\003M";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as2[i1] = ((String) (obj));
                    z = as1;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 136
        //                       0 157
        //                       1 163
        //                       2 169
        //                       3 175;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_175;
_L3:
            byte byte0 = 109;
_L9:
            obj[j1] = (char)(byte0 ^ c1);
            j1++;
              goto _L8
_L4:
            byte0 = 26;
              goto _L9
_L5:
            byte0 = 31;
              goto _L9
_L6:
            byte0 = 97;
              goto _L9
            byte0 = 113;
              goto _L9
        }

        _cls4()
        {
            a = MessageService.this;
            super();
        }
    }

}
