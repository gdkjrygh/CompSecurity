// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RemoteViews;
import com.whatsapp.fieldstats.au;
import com.whatsapp.fieldstats.av;
import com.whatsapp.fieldstats.n;
import com.whatsapp.messaging.m;
import com.whatsapp.protocol.VoipOptions;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.bw;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.a6;
import com.whatsapp.util.aq;
import com.whatsapp.util.c;
import de.greenrobot.event.g;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.whatsapp:
//            abi, c8, App, Voip, 
//            k, og, hh, asw, 
//            VoipActivity, aa, a1f, aoz, 
//            ft, a_o, bn, l1, 
//            c3, h6, zu, ne, 
//            atj, p9, abv, a8g, 
//            os, fv, au

public class VoiceService extends Service
    implements m
{

    private static final Object B;
    private static final ThreadPoolExecutor C;
    private static final String I[];
    private SoundPool A;
    private BluetoothHeadset D;
    private boolean E;
    private BroadcastReceiver F;
    private boolean G;
    private boolean H;
    private boolean a;
    private long b[];
    private a1f c;
    private a6 d;
    private BroadcastReceiver e;
    private BroadcastReceiver f;
    private Handler g;
    private Handler h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private android.os.PowerManager.WakeLock m;
    private HandlerThread n;
    private Ringtone o;
    private Handler p;
    private VoiceServiceEventCallback q;
    private BroadcastReceiver r;
    private abv s;
    private android.os.PowerManager.WakeLock t;
    private aq u;
    private final c8 v = new c8(this);
    private a_o w;
    private boolean x;
    private BluetoothAdapter y;
    private PhoneStateListener z;

    public VoiceService()
    {
        q = new VoiceServiceEventCallback();
    }

    private Notification A()
    {
        Object obj1;
        int j1;
        j1 = App.am;
        obj1 = Voip.getCallInfo();
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        try
        {
            Log.e(I[25]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj = null;
_L6:
        return ((Notification) (obj));
_L2:
        Object obj2;
        boolean flag;
        boolean flag1;
        int k1;
        int i2;
        long l2;
        l2 = ((Voip.CallInfo) (obj1)).getCallActiveTime();
        obj2 = new android.support.v4.app.NotificationCompat.Builder(this);
        obj = App.az.f(((Voip.CallInfo) (obj1)).getPeerId());
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        k1 = getResources().getDimensionPixelSize(0x1050005);
        i2 = getResources().getDimensionPixelSize(0x1050006);
        flag = false;
        flag1 = false;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        Bitmap bitmap = ((og) (obj)).a(Math.min(k1, i2), 0.0F);
        if (bitmap != null)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setLargeIcon(bitmap);
            flag = true;
            flag1 = true;
            if (j1 == 0)
            {
                break MISSING_BLOCK_LABEL_186;
            }
        }
        boolean flag2 = ((og) (obj)).C;
        flag = flag1;
        if (flag2)
        {
            try
            {
                Log.i(I[20]);
                com.whatsapp.asw.a(new hh(this, ((og) (obj)), Math.min(k1, i2)), new Void[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            flag = flag1;
        }
        if (!flag)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setLargeIcon(Bitmap.createScaledBitmap(((BitmapDrawable)getResources().getDrawable(0x7f020096)).getBitmap(), Math.min(k1, i2), Math.min(k1, i2), true));
        }
        try
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setCategory(I[24]);
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setPriority(1);
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setSmallIcon(0x7f0205da);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = og.b(((Voip.CallInfo) (obj1)).getPeerId());
_L7:
        ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setContentTitle(((CharSequence) (obj)));
        boolean flag3 = ((Voip.CallInfo) (obj1)).isCaller();
        int i1;
        if (l2 > 0L)
        {
            i1 = 0x7f0e02bc;
        } else
        if (flag3)
        {
            i1 = 0x7f0e02bd;
        } else
        {
            i1 = 0x7f0e01fe;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setContentText(getText(i1));
        if (l2 <= 0L)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setUsesChronometer(true);
        ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setWhen(l2);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_341;
        }
        try
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setUsesChronometer(false);
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setWhen(System.currentTimeMillis());
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
label0:
        {
            Exception exception;
            try
            {
                ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setOngoing(true);
            }
            catch (Exception exception2)
            {
                throw exception2;
            }
            if (flag3 || l2 > 0L)
            {
                obj = new Intent(this, com/whatsapp/VoiceService);
                ((Intent) (obj)).setAction(I[27]);
                obj = PendingIntent.getService(this, 0, ((Intent) (obj)), 0x10000000);
                ((android.support.v4.app.NotificationCompat.Builder) (obj2)).addAction(0x7f02050a, getText(0x7f0e01fa), ((PendingIntent) (obj)));
                if (j1 == 0)
                {
                    break label0;
                }
            }
            obj = new Intent(this, com/whatsapp/VoiceService);
            ((Intent) (obj)).setAction(I[21]);
            obj = PendingIntent.getService(this, 0, ((Intent) (obj)), 0x10000000);
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).addAction(0x7f02050a, getText(0x7f0e0356), ((PendingIntent) (obj)));
            obj = new Intent(this, com/whatsapp/VoipActivity);
            ((Intent) (obj)).setAction(I[23]);
            obj = PendingIntent.getActivity(this, 0, ((Intent) (obj)), 0x10000000);
            ((android.support.v4.app.NotificationCompat.Builder) (obj2)).addAction(0x7f020501, getText(0x7f0e0046), ((PendingIntent) (obj)));
        }
        obj = new Intent(this, com/whatsapp/VoipActivity);
        ((Intent) (obj)).putExtra(I[28], ((Voip.CallInfo) (obj1)).getPeerId());
        ((android.support.v4.app.NotificationCompat.Builder) (obj2)).setContentIntent(PendingIntent.getActivity(this, 0, ((Intent) (obj)), 0x10000000));
        obj1 = ((android.support.v4.app.NotificationCompat.Builder) (obj2)).build();
        obj = obj1;
        if (l2 <= 0L) goto _L6; else goto _L5
_L5:
        i1 = android.os.Build.VERSION.SDK_INT;
        obj = obj1;
        if (i1 >= 16)
        {
            Exception exception3;
            try
            {
                obj2 = ((Notification) (obj1)).bigContentView;
            }
            catch (Exception exception4)
            {
                throw exception4;
            }
            obj = obj1;
            if (obj2 != null)
            {
                try
                {
                    i1 = Class.forName(I[22]).getDeclaredField(I[26]).getInt(null);
                    ((Notification) (obj1)).bigContentView.setViewVisibility(i1, 8);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.a(I[19], ((Throwable) (obj)));
                    return ((Notification) (obj1));
                }
                return ((Notification) (obj1));
            }
        }
          goto _L6
        obj;
        throw obj;
_L4:
        obj = com.whatsapp.util.c.b(((og) (obj)).a(this));
          goto _L7
        exception;
        throw exception;
        exception3;
        throw exception3;
          goto _L7
    }

    private void B()
    {
        Object obj = (PowerManager)getSystemService(I[105]);
        if (!((PowerManager) (obj)).isScreenOn())
        {
            obj = ((PowerManager) (obj)).newWakeLock(0x1000000a, I[106]);
            if (obj != null)
            {
                ((android.os.PowerManager.WakeLock) (obj)).acquire();
                ((android.os.PowerManager.WakeLock) (obj)).release();
            }
        }
    }

    private String C()
    {
        Object obj = Voip.getPeerJid();
        obj = App.az.e(((String) (obj)));
        if (obj != null)
        {
            return ((og) (obj)).a(this);
        } else
        {
            return null;
        }
    }

    private void E()
    {
        if (t != null)
        {
            t.release();
            t = null;
        }
    }

    private void G()
    {
        if (m != null)
        {
            m.release();
            m = null;
        }
    }

    private void I()
    {
        G();
        E();
    }

    static BluetoothHeadset a(VoiceService voiceservice, BluetoothHeadset bluetoothheadset)
    {
        voiceservice.D = bluetoothheadset;
        return bluetoothheadset;
    }

    static Handler a(VoiceService voiceservice)
    {
        return voiceservice.p;
    }

    static void a(VoiceService voiceservice, Voip.CallState callstate)
    {
        voiceservice.a(callstate);
    }

    static void a(VoiceService voiceservice, Voip.CallState callstate, Voip.CallInfo callinfo)
    {
        voiceservice.a(callstate, callinfo);
    }

    static void a(VoiceService voiceservice, String s1)
    {
        voiceservice.b(s1);
    }

    static void a(VoiceService voiceservice, boolean flag)
    {
        voiceservice.b(flag);
    }

    private void a(Voip.CallState callstate)
    {
        AudioManager audiomanager;
        int i1;
        i1 = App.am;
        audiomanager = (AudioManager)getSystemService(I[6]);
        com.whatsapp.aa.a[callstate.ordinal()];
        JVM INSTR tableswitch 1 6: default 64
    //                   1 65
    //                   2 65
    //                   3 65
    //                   4 65
    //                   5 111
    //                   6 137;
           goto _L1 _L2 _L2 _L2 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            audiomanager.setMode(3);
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        audiomanager.setMode(2);
        if (c == null) goto _L1; else goto _L5
_L5:
        c.c().setVolumeControlStream(0);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        c.c().setVolumeControlStream(0x80000000);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        audiomanager.setMode(1);
        if (c != null)
        {
            c.c().setVolumeControlStream(2);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void a(Voip.CallState callstate, Voip.CallInfo callinfo)
    {
        int i1;
        i1 = App.am;
        App.u();
        if (callinfo != null && callstate != callinfo.getCallState()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
label0:
        {
            obj = callinfo.getCallState();
            if (obj == Voip.CallState.RECEIVED_CALL)
            {
                v();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (obj == Voip.CallState.NONE)
            {
                p.removeMessages(1);
            }
        }
        if (obj != Voip.CallState.NONE)
        {
            b();
        }
        if (c != null)
        {
            c.a(callstate, callinfo);
        }
        callinfo = new a(callinfo.getPeerId(), callinfo.isCaller(), com.whatsapp.Voip.a(callinfo.getCallId()));
        if (obj != Voip.CallState.NONE)
        {
            break; /* Loop/switch isn't completed */
        }
        s();
        Voip.b();
        obj = App.ah.a(callinfo);
        if (obj != null)
        {
            App.k(((c4) (obj)));
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        Log.e((new StringBuilder()).append(I[42]).append(callinfo).toString());
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        com.whatsapp.Voip.a();
        if (callstate != Voip.CallState.NONE) goto _L1; else goto _L4
_L4:
        callstate = App.ah.a(callinfo);
        if (callstate == null)
        {
            break; /* Loop/switch isn't completed */
        }
        App.b(callstate);
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        Log.e((new StringBuilder()).append(I[41]).append(callinfo).toString());
        return;
    }

    public static void a(av av1)
    {
        com.whatsapp.fieldstats.Events.Call call = new com.whatsapp.fieldstats.Events.Call();
        call.callNetwork = new Double(u());
        call.callResult = new Double(av1.ordinal());
        call.callSide = new Double(n.CALLEE.ordinal());
        com.whatsapp.ft.a(com.whatsapp.App.au, call);
    }

    private void a(boolean flag)
    {
label0:
        {
            Log.i((new StringBuilder()).append(I[11]).append(flag).append(I[13]).append(l).toString());
            AudioManager audiomanager = (AudioManager)getSystemService(I[12]);
            if (flag)
            {
                j = false;
                audiomanager.startBluetoothSco();
                if (!l)
                {
                    break label0;
                }
                audiomanager.setBluetoothScoOn(true);
                i();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            j = true;
            audiomanager.stopBluetoothSco();
            if (!l)
            {
                audiomanager.setBluetoothScoOn(false);
                i();
            }
        }
    }

    static Notification b(VoiceService voiceservice)
    {
        return voiceservice.A();
    }

    private void b()
    {
label0:
        {
            int i1 = App.am;
            App.u();
            AudioManager audiomanager = (AudioManager)getSystemService(I[31]);
            if (audiomanager.isBluetoothScoOn())
            {
                w = a_o.BLUETOOTH;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (audiomanager.isSpeakerphoneOn() && !H)
            {
                w = a_o.SPEAKER;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (audiomanager.isWiredHeadsetOn())
            {
                w = a_o.HEADSET;
                if (i1 == 0)
                {
                    break label0;
                }
            }
            w = a_o.EARPIECE;
        }
        H = false;
        Log.i((new StringBuilder()).append(I[30]).append(w).toString());
        if (c != null)
        {
            c.b();
        }
        m();
    }

    private void b(String s1)
    {
        Intent intent = new Intent(I[9], null, this, com/whatsapp/VoiceService);
        if (s1 != null)
        {
            intent.putExtra(I[8], s1);
        }
        startService(intent);
    }

    private void b(boolean flag)
    {
label0:
        {
            int i1 = App.am;
            Log.i(I[116]);
            App.u();
            if (a)
            {
                return;
            }
            long l2 = System.currentTimeMillis();
            AudioManager audiomanager = (AudioManager)getSystemService(I[126]);
            x = false;
            E = false;
            G = false;
            Object obj = (TelephonyManager)getSystemService(I[118]);
            boolean flag1;
            if (((TelephonyManager) (obj)).getCallState() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            i = flag1;
            ((TelephonyManager) (obj)).listen(z, 32);
            registerReceiver(r, new IntentFilter(I[119]));
            registerReceiver(e, new IntentFilter(I[120]));
            registerReceiver(F, new IntentFilter(I[123]));
            obj = registerReceiver(f, new IntentFilter(I[124]));
            if (obj != null)
            {
                int j1;
                long l3;
                if (1 == ((Intent) (obj)).getIntExtra(I[122], -1))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                l = flag1;
            }
            g();
            H = false;
            q();
            audiomanager.setMicrophoneMute(false);
            if (!flag && !audiomanager.isWiredHeadsetOn())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            audiomanager.setSpeakerphoneOn(flag1);
            if (e())
            {
                a(true);
            }
            b();
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                j1 = audiomanager.requestAudioFocus((android.media.AudioManager.OnAudioFocusChangeListener)B, 0, 2);
                Log.i((new StringBuilder()).append(I[125]).append(j1).toString());
            }
            if (!flag)
            {
                k();
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                audiomanager.setMode(3);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            audiomanager.setMode(2);
        }
        g.sendEmptyMessageDelayed(0, 1000L);
        if (A != null)
        {
            A.release();
        }
        A = new SoundPool(1, 0, 0);
        k = A.load(getApplicationContext(), 0x7f060001, 1);
        p.sendEmptyMessage(3);
        a = true;
        l3 = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(I[117]).append(l3 - l2).append(I[121]).toString());
    }

    static boolean b(VoiceService voiceservice, boolean flag)
    {
        voiceservice.i = flag;
        return flag;
    }

    static void c(VoiceService voiceservice, boolean flag)
    {
        voiceservice.a(flag);
    }

    static boolean c(VoiceService voiceservice)
    {
        return voiceservice.G;
    }

    static a1f d(VoiceService voiceservice)
    {
        return voiceservice.c;
    }

    private void d()
    {
        Log.i(I[57]);
        App.u();
        x = true;
        if (c != null)
        {
            Window window = c.c().getWindow();
            View view = ((ViewGroup)window.getDecorView().findViewById(0x1020002)).getChildAt(0);
            if (view.getVisibility() == 0)
            {
                android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
                layoutparams.flags = layoutparams.flags | 0x400;
                layoutparams.screenBrightness = 0.1F;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                }
                view.setVisibility(4);
                window.setAttributes(layoutparams);
            }
        }
    }

    static boolean d(VoiceService voiceservice, boolean flag)
    {
        voiceservice.H = flag;
        return flag;
    }

    static boolean e(VoiceService voiceservice)
    {
        return voiceservice.E;
    }

    static boolean e(VoiceService voiceservice, boolean flag)
    {
        voiceservice.G = flag;
        return flag;
    }

    private void f()
    {
label0:
        {
label1:
            {
                boolean flag = true;
                Log.i((new StringBuilder()).append(I[108]).append(i).toString());
                Object obj = Voip.getCallInfo();
                if (obj == null)
                {
                    break label0;
                }
                String s1 = ((Voip.CallInfo) (obj)).getPeerId();
                if (((Voip.CallInfo) (obj)).getCallState() == Voip.CallState.CALLING && i)
                {
                    b(((String) (null)));
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                if (s1 != null)
                {
                    String s2 = c4.a(s1, true).c;
                    obj = ((Voip.CallInfo) (obj)).getCallId();
                    if (i)
                    {
                        flag = false;
                    }
                    App.b(s2, s1, ((String) (obj)), flag);
                }
            }
            Voip.setAudioStreamPause(i);
        }
    }

    static boolean f(VoiceService voiceservice)
    {
        return voiceservice.j;
    }

    static boolean f(VoiceService voiceservice, boolean flag)
    {
        voiceservice.l = flag;
        return flag;
    }

    private void g()
    {
        Voip.setNetworkMedium(u());
    }

    static void g(VoiceService voiceservice)
    {
        voiceservice.y();
    }

    static void h(VoiceService voiceservice)
    {
        voiceservice.f();
    }

    private void i()
    {
        p.removeMessages(0);
        p.sendEmptyMessage(0);
    }

    static void i(VoiceService voiceservice)
    {
        voiceservice.b();
    }

    private void j()
    {
        Log.i(I[33]);
        App.u();
        x = false;
        if (c != null)
        {
            Window window = c.c().getWindow();
            View view = ((ViewGroup)window.getDecorView().findViewById(0x1020002)).getChildAt(0);
            if (view.getVisibility() == 4)
            {
                android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
                layoutparams.flags = layoutparams.flags & 0xfffffbff;
                layoutparams.screenBrightness = -1F;
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
                }
                view.setVisibility(0);
                window.setAttributes(layoutparams);
            }
        }
    }

    static boolean j(VoiceService voiceservice)
    {
        return voiceservice.a;
    }

    private void k()
    {
        AudioManager audiomanager;
        int i1;
        i1 = App.am;
        Log.i(I[47]);
        audiomanager = (AudioManager)getSystemService(I[46]);
        audiomanager.getRingerMode();
        JVM INSTR tableswitch 0 2: default 60
    //                   0 368
    //                   1 382
    //                   2 354;
           goto _L1 _L2 _L3 _L4
_L1:
        if (o != null) goto _L6; else goto _L5
_L5:
        String s1;
        SharedPreferences sharedpreferences;
        sharedpreferences = com.whatsapp.App.au.getSharedPreferences(I[52], 0);
        s1 = sharedpreferences.getString(I[49], I[54]);
        Object obj = App.az.f(Voip.getPeerJid());
        if (obj != null)
        {
            obj = ((og) (obj)).b(sharedpreferences);
            if (obj != null)
            {
                s1 = ((String) (obj));
            }
        }
        if (s1 != null)
        {
            Log.i((new StringBuilder()).append(I[45]).append(s1).toString());
            o = RingtoneManager.getRingtone(this, Uri.parse(s1));
        }
        if (o == null) goto _L8; else goto _L7
_L7:
        audiomanager.setMode(1);
        o.play();
        if (i1 == 0) goto _L9; else goto _L8
_L8:
        Log.e((new StringBuilder()).append(I[51]).append(s1).toString());
_L9:
        if (audiomanager.getRingerMode() != 2 && audiomanager.getRingerMode() != 1) goto _L6; else goto _L10
_L10:
        s1 = sharedpreferences.getString(I[53], "1");
        if (s1.equals("0")) goto _L6; else goto _L11
_L11:
        byte byte0;
        byte byte1;
        byte byte2;
        byte0 = -1;
        byte1 = byte0;
        byte2 = byte0;
        s1.hashCode();
        JVM INSTR tableswitch 49 51: default 304
    //                   49 394
    //                   50 412
    //                   51 434;
           goto _L12 _L13 _L14 _L15
_L12:
        byte0;
        JVM INSTR tableswitch 0 2: default 332
    //                   0 454
    //                   1 482
    //                   2 510;
           goto _L16 _L17 _L18 _L19
_L16:
        ((Vibrator)getSystemService(I[50])).vibrate(b, 0);
_L6:
        return;
_L4:
        Log.i(I[48]);
        if (i1 == 0) goto _L1; else goto _L2
_L2:
        Log.i(I[44]);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        Log.i(I[55]);
          goto _L1
_L13:
        if (!s1.equals("1")) goto _L12; else goto _L20
_L20:
        if (i1 == 0) goto _L22; else goto _L21
_L21:
        byte1 = 0;
_L14:
        byte0 = byte1;
        if (!s1.equals("2")) goto _L12; else goto _L23
_L23:
        if (i1 == 0) goto _L25; else goto _L24
_L24:
        byte2 = 1;
_L15:
        byte0 = byte2;
        if (s1.equals("3"))
        {
            byte0 = 2;
        }
          goto _L12
_L17:
        b = (new long[] {
            0L, 750L, 1500L
        });
        if (i1 == 0) goto _L16; else goto _L18
_L18:
        b = (new long[] {
            0L, 300L, 200L
        });
        if (i1 == 0) goto _L16; else goto _L19
_L19:
        b = (new long[] {
            0L, 750L, 250L
        });
          goto _L16
_L25:
        byte0 = 1;
          goto _L12
_L22:
        byte0 = 0;
          goto _L12
    }

    static void k(VoiceService voiceservice)
    {
        voiceservice.d();
    }

    static String l(VoiceService voiceservice)
    {
        return voiceservice.C();
    }

    private void m()
    {
        Voip.CallInfo callinfo = Voip.getCallInfo();
        if (callinfo != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (callinfo.isCaller() || callinfo.getCallState() != Voip.CallState.RECEIVED_CALL)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (w != a_o.EARPIECE || !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        p();
        u.a(d);
        Log.i(I[37]);
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        G();
        u.a(null);
        Log.i(I[36]);
        return;
    }

    static void m(VoiceService voiceservice)
    {
        voiceservice.j();
    }

    static void n(VoiceService voiceservice)
    {
        voiceservice.i();
    }

    static boolean o(VoiceService voiceservice)
    {
        return voiceservice.i;
    }

    static Handler p(VoiceService voiceservice)
    {
        return voiceservice.h;
    }

    private void p()
    {
        G();
        int i1 = t();
        PowerManager powermanager = (PowerManager)getSystemService(I[114]);
        if (m == null && i1 != -1 && powermanager != null)
        {
            m = powermanager.newWakeLock(i1, I[113]);
            if (m != null)
            {
                m.acquire();
            }
        }
    }

    private void q()
    {
        E();
        PowerManager powermanager = (PowerManager)getSystemService(I[39]);
        if (powermanager != null)
        {
            t = powermanager.newWakeLock(1, I[40]);
            if (t != null)
            {
                t.acquire();
            }
        }
    }

    static boolean q(VoiceService voiceservice)
    {
        return voiceservice.l;
    }

    static BluetoothHeadset r(VoiceService voiceservice)
    {
        return voiceservice.D;
    }

    static Handler s(VoiceService voiceservice)
    {
        return voiceservice.g;
    }

    private void s()
    {
        Log.i(I[131]);
        App.u();
        if (!a)
        {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (A != null)
        {
            A.play(k, 1.0F, 1.0F, 0, 0, 1.0F);
        }
        a = false;
        x = false;
        E = false;
        G = false;
        ((TelephonyManager)getSystemService(I[132])).listen(z, 0);
        unregisterReceiver(r);
        unregisterReceiver(e);
        unregisterReceiver(F);
        unregisterReceiver(f);
        u.a(null);
        j();
        I();
        B();
        w();
        AudioManager audiomanager = (AudioManager)getSystemService(I[135]);
        audiomanager.setSpeakerphoneOn(false);
        audiomanager.setMicrophoneMute(false);
        if (l)
        {
            a(false);
        }
        audiomanager.setMode(0);
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            audiomanager.abandonAudioFocus((android.media.AudioManager.OnAudioFocusChangeListener)B);
        }
        g.removeCallbacksAndMessages(null);
        h.removeCallbacksAndMessages(null);
        p.removeCallbacksAndMessages(null);
        stopForeground(true);
        stopSelf();
        long l3 = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(I[133]).append(l3 - l2).append(I[134]).toString());
    }

    private int t()
    {
        int i1 = android/os/PowerManager.getDeclaredField(I[16]).getInt(null);
        return i1;
        Object obj;
        obj;
        Log.w(I[15]);
_L2:
        return -1;
        obj;
        Log.w(I[14]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int u()
    {
        int i1;
label0:
        {
            int j1 = App.am;
            int k1 = App.G();
            if (k1 == 0)
            {
                i1 = au.NONE.getCode();
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (k1 == 1)
            {
                i1 = au.WIFI.getCode();
                if (j1 == 0)
                {
                    break label0;
                }
            }
            i1 = au.CELLULAR.getCode();
        }
        return i1;
    }

    private void v()
    {
        p.removeMessages(1);
        p.sendEmptyMessageDelayed(1, 500L);
    }

    private void y()
    {
        int i1;
label0:
        {
            if (Voip.startCallRecording(new Voip.RecordingInfo[Voip.DebugTapType.values().length]))
            {
                i1 = 0x7f0e048f;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            i1 = 0x7f0e048e;
        }
        com.whatsapp.App.au.ab().post(new bn(this, i1));
    }

    static ThreadPoolExecutor z()
    {
        return C;
    }

    public void D()
    {
        Log.i(I[7]);
        Voip.rejectCall();
    }

    public boolean F()
    {
        return w == a_o.SPEAKER;
    }

    public void H()
    {
        Log.i(I[127]);
        w();
        Voip.acceptCall();
        if (w == a_o.SPEAKER)
        {
            h();
        }
        if (!com.whatsapp.App.aq())
        {
            App.ay();
        }
    }

    public void a()
    {
        boolean flag;
        if (w != a_o.BLUETOOTH)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public void a(a1f a1f1)
    {
label0:
        {
            c = a1f1;
            if (a1f1 != null)
            {
                a(Voip.getCurrentCallState());
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (Voip.getCurrentCallState() == Voip.CallState.RECEIVED_CALL)
            {
                v();
            }
        }
    }

    public void a(b3 b3_1, String s1, long l2)
    {
        String s2 = b3_1.a;
        String s3 = b3_1.d;
        Log.i((new StringBuilder()).append(I[91]).append(s2).append(I[92]).append(s1).toString());
        Voip.CallInfo callinfo = Voip.getCallInfo();
        if (callinfo != null && TextUtils.equals(callinfo.getCallId(), s1) && TextUtils.equals(callinfo.getPeerId(), s2))
        {
            p.removeMessages(1);
        }
        if (callinfo != null)
        {
            l2 = callinfo.getCallDuration();
        } else
        {
            l2 = 0L;
        }
        Voip.nativeHandleCallTerminate(s2, s3, s1);
        com.whatsapp.App.a(new bw(b3_1, l2));
    }

    public void a(b3 b3_1, String s1, long l2, int i1, String as[], int ai[], 
            byte abyte0[][], int ai1[], byte abyte1[][], byte abyte2[][], byte abyte3[], byte abyte4[], VoipOptions voipoptions)
    {
label0:
        {
            int j1 = App.am;
            String s2 = b3_1.a;
            b3_1 = b3_1.d;
            Log.i((new StringBuilder()).append(I[2]).append(s2).append(I[0]).append(s1).toString());
            c4 c4_1 = new c4(new a(s2, false, com.whatsapp.Voip.a(s1)));
            c4_1.I = l2;
            c4_1.w = 8;
            c4_1.H = 0;
            c4_1.M = 6;
            App.ah.g(c4_1);
            App.e(s2, b3_1, s1);
            com.whatsapp.l1.c(c4_1);
            TelephonyManager telephonymanager = (TelephonyManager)com.whatsapp.App.au.getSystemService(I[1]);
            if (i1 >= 45)
            {
                Log.i((new StringBuilder()).append(I[4]).append(i1).toString());
                App.d(c4_1);
                a(av.MISSED);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            if (telephonymanager.getCallState() != 0)
            {
                Log.i(I[3]);
                if (com.whatsapp.Voip.a == null)
                {
                    break label0;
                }
                com.whatsapp.Voip.a.sendReject(s1, s2, I[5]);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            Voip.nativeHandleCallOffer(s2, b3_1, s1, as, ai, abyte0, ai1, abyte1, abyte2, abyte3, abyte4, voipoptions, Voip.e());
            g();
        }
    }

    public void a(b3 b3_1, String s1, long l2, String s2)
    {
        Log.i(I[137]);
        String s3 = b3_1.a;
        b3_1 = b3_1.d;
        App.b(s3, b3_1, s1);
        Voip.nativeHandleCallOfferReject(s3, b3_1, s1, s2);
    }

    public void a(b3 b3_1, String s1, long l2, String s2, int i1, byte abyte0[][], 
            int ai[], byte abyte1[], byte abyte2[], byte abyte3[], int j1)
    {
        Log.i(I[38]);
        String s3 = b3_1.a;
        b3_1 = b3_1.d;
        com.whatsapp.App.c(s3, b3_1, s1);
        Voip.nativeHandleCallOfferAccept(s3, b3_1, s1, s2, i1, abyte0, ai, abyte1, abyte2, abyte3, j1);
    }

    public void a(b3 b3_1, String s1, long l2, boolean flag)
    {
label0:
        {
            Log.i((new StringBuilder()).append(I[10]).append(flag).toString());
            if (flag)
            {
                q.callResumed();
                Voip.setPeerAudioStreamPause(false);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            q.callInterrupted();
            Voip.setPeerAudioStreamPause(true);
        }
        com.whatsapp.App.a(b3_1);
    }

    public void a(b3 b3_1, String s1, long l2, byte abyte0[], int i1)
    {
        Log.i(I[128]);
        Voip.nativeHandleCallRelayElection(b3_1.a, b3_1.d, s1, abyte0, i1);
        com.whatsapp.App.a(b3_1);
    }

    public void a(b3 b3_1, String s1, long l2, byte abyte0[][], int ai[])
    {
        Log.i(I[89]);
        Voip.nativeHandleCallRelayLatency(b3_1.a, b3_1.d, s1, abyte0, ai);
        com.whatsapp.App.a(b3_1);
    }

    public void a(String s1)
    {
        Log.i(I[94]);
        long l2 = System.currentTimeMillis();
        App.u();
        if (s1 != null && c != null)
        {
            c.e(s1);
        }
        Voip.endCall();
        long l3 = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(I[93]).append(l3 - l2).append(I[95]).toString());
    }

    public void a(String s1, String s2)
    {
        Log.i(I[32]);
    }

    public void a(String s1, String s2, String s3)
    {
        Log.i(I[107]);
    }

    public void a(String s1, String s2, String s3, int i1, byte abyte0[][], byte abyte1[][], VoipOptions voipoptions)
    {
        Log.i(I[34]);
        Voip.nativeHandleCallOfferAck(s1, s2, s3, i1, abyte0, abyte1, voipoptions, Voip.e());
    }

    public void b(b3 b3_1, String s1, long l2, boolean flag)
    {
        Log.i(I[88]);
        com.whatsapp.App.a(b3_1);
    }

    public void b(b3 b3_1, String s1, long l2, byte abyte0[][], int ai[])
    {
        Log.i(I[136]);
        Voip.nativeHandleCallTransport(b3_1.a, b3_1.d, s1, abyte0, ai);
        com.whatsapp.App.a(b3_1);
    }

    public void b(String s1, String s2)
    {
        Log.i(I[110]);
    }

    public void b(String s1, String s2, String s3)
    {
        Log.i(I[90]);
        Voip.nativeHandleCallOfferReceipt(s1, s2, s3);
    }

    public void c(String s1, String s2)
    {
        Log.i(I[29]);
    }

    public void c(String s1, String s2, String s3)
    {
        Log.i(I[43]);
    }

    public boolean c()
    {
        return G;
    }

    public void d(String s1, String s2)
    {
        Log.i(I[85]);
    }

    public void e(String s1, String s2)
    {
        Log.i(I[18]);
    }

    public boolean e()
    {
        if (android.os.Build.VERSION.SDK_INT >= 8 && y != null && y.isEnabled())
        {
            AudioManager audiomanager = (AudioManager)getSystemService(I[56]);
            if (audiomanager.isBluetoothScoAvailableOffCall())
            {
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    boolean flag;
                    if (D != null && !D.getConnectedDevices().isEmpty())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return flag;
                }
                if (audiomanager.isBluetoothScoOn() || audiomanager.isBluetoothA2dpOn())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(String s1, String s2)
    {
        Log.i(I[17]);
    }

    public void g(String s1, String s2)
    {
        Log.i(I[35]);
    }

    public void h()
    {
        AudioManager audiomanager = (AudioManager)getSystemService(I[86]);
        boolean flag;
        if (w != a_o.SPEAKER)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Log.i((new StringBuilder()).append(I[87]).append(flag).toString());
        audiomanager.setSpeakerphoneOn(flag);
        b();
    }

    public void h(String s1, String s2)
    {
        Log.i(I[84]);
    }

    public void l()
    {
        boolean flag;
        if (!E)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        E = flag;
        Log.i((new StringBuilder()).append(I[115]).append(E).toString());
        if (Voip.getCurrentCallState() == Voip.CallState.ACTIVE)
        {
            Voip.muteCall(E);
        }
        if (c != null)
        {
            c.b();
        }
    }

    public boolean n()
    {
        return E;
    }

    public void o()
    {
        a(((String) (null)));
    }

    public IBinder onBind(Intent intent)
    {
        Log.i((new StringBuilder()).append(I[109]).append(intent).toString());
        return v;
    }

    public void onCreate()
    {
        Log.i(I[129]);
        super.onCreate();
        de.greenrobot.event.g.a().c(this);
        Voip.nativeRegisterEventCallback(q);
        u = new aq(this);
        y = BluetoothAdapter.getDefaultAdapter();
        if (android.os.Build.VERSION.SDK_INT >= 11 && y != null)
        {
            c3 c3_1 = new c3(this);
            y.getProfileProxy(this, c3_1, 1);
        }
        z = new h6(this);
        r = new _cls4();
        e = new _cls5();
        f = new _cls6();
        F = new _cls7();
        g = new Handler(new zu(this));
        h = new Handler(new ne(this));
        p = new Handler(new atj(this));
        d = new p9(this);
        n = new HandlerThread(I[130]);
        n.start();
        s = new abv(this, n.getLooper(), null);
    }

    public void onDestroy()
    {
        Log.i(I[96]);
        if (A != null)
        {
            A.release();
            A = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11 && y != null && D != null)
        {
            y.closeProfileProxy(1, D);
        }
        if (App.a4())
        {
            AlarmManager alarmmanager = (AlarmManager)getSystemService(I[101]);
            Object obj = (new Intent(I[102])).setPackage(I[99]);
            ((Intent) (obj)).putExtra(I[103], I[100]);
            ((Intent) (obj)).putExtra(I[97], true);
            ((Intent) (obj)).putExtra(I[98], a8g.VOICE);
            ((Intent) (obj)).putExtra(I[104], EnumSet.of(os.VOICE));
            obj = PendingIntent.getBroadcast(this, 0, ((Intent) (obj)), 0x40000000);
            alarmmanager.cancel(((PendingIntent) (obj)));
            alarmmanager.set(3, SystemClock.elapsedRealtime() + 30000L, ((PendingIntent) (obj)));
        }
        I();
        Voip.nativeUnregisterEventCallback();
        de.greenrobot.event.g.a().e(this);
        if (n != null)
        {
            s.sendEmptyMessage(0);
            n = null;
        }
        super.onDestroy();
    }

    public void onEvent(com.whatsapp.au au1)
    {
        g();
    }

    public void onEvent(fv fv1)
    {
        if (fv1.a())
        {
            Voip.onNetworkChange();
        }
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        String s1;
        int k1;
        int i2;
        int j2;
        int k2;
        long l2;
        k2 = App.am;
        if (intent == null)
        {
            Log.w(I[79]);
            if (!a)
            {
                stopSelf();
            }
            return 2;
        }
        s1 = intent.getAction();
        Log.i((new StringBuilder()).append(I[62]).append(intent).append(I[58]).append(i1).append(I[64]).append(j1).toString());
        if (s1 == null)
        {
            Log.w(I[74]);
            App.p(I[69]);
            return 2;
        }
        if (!a && !I[67].equals(s1) && !I[60].equals(s1))
        {
            Log.w(I[68]);
            return 2;
        }
        l2 = System.currentTimeMillis();
        i1 = -1;
        j1 = i1;
        k1 = i1;
        i2 = i1;
        j2 = i1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 232
    //                   -1573659621: 337
    //                   1281366991: 442
    //                   1331833598: 386
    //                   1444513451: 360
    //                   2138982608: 414;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        i1;
        JVM INSTR tableswitch 0 4: default 268
    //                   0 464
    //                   1 754
    //                   2 802
    //                   3 811
    //                   4 830;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        Log.w(I[81]);
_L18:
        long l3 = System.currentTimeMillis();
        Log.i((new StringBuilder()).append(I[70]).append(s1).append(I[71]).append(l3 - l2).append(I[59]).toString());
        return 2;
_L2:
        if (!s1.equals(I[77])) goto _L1; else goto _L13
_L13:
        j1 = 0;
        i1 = 0;
        if (k2 == 0) goto _L1; else goto _L5
_L5:
        i1 = j1;
        if (!s1.equals(I[83])) goto _L1; else goto _L14
_L14:
        k1 = 1;
        i1 = 1;
        if (k2 == 0) goto _L1; else goto _L4
_L4:
        i1 = k1;
        if (!s1.equals(I[65])) goto _L1; else goto _L15
_L15:
        i2 = 2;
        i1 = i2;
        if (k2 == 0) goto _L1; else goto _L6
_L6:
        i1 = i2;
        if (!s1.equals(I[73])) goto _L1; else goto _L16
_L16:
        j2 = 3;
        i1 = j2;
        if (k2 == 0) goto _L1; else goto _L3
_L3:
        i1 = j2;
        if (s1.equals(I[80]))
        {
            i1 = 4;
        }
          goto _L1
_L8:
        Object obj;
        Object obj1;
        c4 c4_1;
        long l4;
        boolean flag;
        if (((TelephonyManager)getSystemService(I[76])).getCallState() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (!i)
        {
            break; /* Loop/switch isn't completed */
        }
        com.whatsapp.App.a(this, 0x7f0e007a, 1);
        if (k2 == 0) goto _L18; else goto _L17
_L17:
        if (!com.whatsapp.App.n(this) || App.G() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        com.whatsapp.App.a(this, 0x7f0e0079, 1);
        if (k2 == 0) goto _L18; else goto _L19
_L19:
        obj = intent.getStringExtra(I[61]);
        obj1 = c4.a(((String) (obj)), true).c;
        c4_1 = new c4(new a(((String) (obj)), true, com.whatsapp.Voip.a(((String) (obj1)))));
        c4_1.I = App.U();
        c4_1.w = 8;
        c4_1.H = 0;
        c4_1.M = 6;
        App.ah.g(c4_1);
        com.whatsapp.l1.c(c4_1);
        b(true);
        l4 = System.currentTimeMillis();
        Voip.startCall(((String) (obj1)), ((String) (obj)));
        Log.i((new StringBuilder()).append(I[72]).append(System.currentTimeMillis() - l4).append(I[82]).toString());
        g();
        obj1 = new Intent(this, com/whatsapp/VoipActivity);
        ((Intent) (obj1)).setFlags(0x10000000);
        ((Intent) (obj1)).putExtra(I[66], ((String) (obj)));
        startActivity(((Intent) (obj1)));
        obj = A();
        if (obj == null) goto _L18; else goto _L20
_L20:
        startForeground(0x7f0b001e, ((Notification) (obj)));
        if (k2 == 0) goto _L18; else goto _L9
_L9:
        obj = (Message)intent.getParcelableExtra(I[63]);
        obj.obj = intent.getParcelableExtra(I[75]);
        s.obtainMessage(1, obj).sendToTarget();
        if (k2 == 0) goto _L18; else goto _L10
_L10:
        D();
        if (k2 == 0) goto _L18; else goto _L11
_L11:
        a(intent.getStringExtra(I[78]));
        if (k2 == 0) goto _L18; else goto _L12
_L12:
        intent = A();
        if (intent == null) goto _L18; else goto _L21
_L21:
        startForeground(0x7f0b001e, intent);
        if (k2 == 0) goto _L18; else goto _L7
    }

    public boolean r()
    {
        return w == a_o.BLUETOOTH;
    }

    public void w()
    {
        Log.i(I[111]);
        if (b != null)
        {
            ((Vibrator)getSystemService(I[112])).cancel();
            b = null;
        }
        if (o != null)
        {
            o.stop();
            o = null;
        }
    }

    public boolean x()
    {
        return x;
    }

    static 
    {
        Object obj;
        String as[];
        char c1;
        int i1;
        as = new String[138];
        obj = "y}\"4p9}(1<";
        c1 = '\uFFFF';
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
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
            switch (c1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "%5.;y";
                i1 = 1;
                c1 = '\0';
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                i1 = 2;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'}''s8}";
                c1 = '\001';
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'r(2r:/$11;2/xj:41xu;p1's2/$&o";
                c1 = '\002';
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'r(2r:/$11!2.xs99n";
                c1 = '\003';
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "7(2,";
                c1 = '\004';
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "4(%<s";
                c1 = '\005';
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "#2(%36<-93'8+0\177!";
                c1 = '\006';
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                obj = "03%\n\17741-\no!/(;{";
                c1 = '\007';
                i1 = 8;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "=</2i%\002\"4p9";
                c1 = '\b';
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px4/!y'/4%h<2/uy;9|";
                c1 = '\t';
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "#2(%34(%<s\n/. h0r\"=};:$\027p 85:s!5\022!}!8a6t43&<r2}#9i0).:h=}2!}!8a!su";
                c1 = '\n';
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "4(%<s";
                c1 = '\013';
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "y}#9i0).:h=}\022\026Su>.;r0>50xu";
                c1 = '\f';
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = " 3 7p0}5:<4>\"0o&}\021\007S\r\024\f\034H\f\002\022\026N\020\030\017\nS\023\033\036\002]\036\030\036\031S\026\026a3u01%uu;}\021:k0/\f4r4:$'";
                c1 = '\r';
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = ";2a\005N\032\005\b\030U\001\004\036\006_\007\030\004\033C\032\033\007\nK\024\026\004\nP\032\036\nuz<8-1<<3a\005s\"83\030};<&0n";
                c1 = '\016';
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\005\017\016\rU\030\024\025\fC\006\036\023\020Y\033\002\016\023Z\n\n\000\036Y\n\021\016\026W";
                c1 = '\017';
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p 6\1770-5x}66";
                c1 = '\020';
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px/$9},p-4h03\",14>*";
                c1 = '\021';
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 19;
                obj = "#2(%3&83#u68n;s!4'<\1774)(:rz)(8yx((x{:3$";
                c1 = '\022';
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "#2(%3&83#u68n;s!4'<\1774)(:rz3$0xx)) q7";
                c1 = '\023';
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "'8+0\177!\002\"4p9";
                c1 = '\024';
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "62,{};93:u1s(;h0//4p{\017e<x";
                c1 = '\025';
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "62,{k=<5&}%-o<r!8/!24>5<s;s\000\026_\020\r\025\n_\024\021\r";
                c1 = '\026';
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "6<-9";
                c1 = '\027';
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "12a;s!}\"'y4)$ur:)(3u6<5<s;qa\"yu<30<;25uu;} u}6)(#yu> 9p";
                c1 = '\030';
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "!4,0";
                c1 = '\031';
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "=</2i%\002\"4p9";
                c1 = '\032';
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                obj = "?4%";
                c1 = '\033';
                i1 = 28;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px04!yx<\">";
                c1 = '\034';
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "#2(%34(%<s\n/. h0r4%x4)$\024i14.\007s )$o<";
                c1 = '\035';
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "4(%<s";
                c1 = '\036';
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p30v0>5x}66";
                c1 = '\037';
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "#2(%30<3xz4/";
                c1 = ' ';
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p 6w";
                c1 = '!';
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px4/!y'/4%h<2/x}66";
                c1 = '"';
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "#2(%349+ o!\r3:d<0(!e\0068/&s'ga:z3";
                c1 = '#';
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "#2(%349+ o!\r3:d<0(!e\0068/&s'ga:r";
                c1 = '$';
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p 6\1770-5";
                c1 = '%';
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "%260n";
                c1 = '&';
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = "\0025 !o\024-1uJ:4\"0O0/7<\1770";
                c1 = '\'';
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "6</ur:)a3u;9a8y&. 2yu";
                c1 = '(';
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "6</ur:)a3u;9a8y&. 2yu";
                c1 = ')';
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p30v0>5xn0>$<l!";
                c1 = '*';
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "#2(%3'4/2h:3$zn<3&0n\n0.1yz.(9y;)";
                c1 = '+';
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "#2(%3'4/2h:3$z<";
                c1 = ',';
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                i1 = 46;
                obj = "4(%<s";
                c1 = '-';
                break;

            case 45: // '-'
                as1[i1] = ((String) (obj));
                i1 = 47;
                obj = "#2(%3'4/2h:3$zl9<8";
                c1 = '.';
                break;

            case 46: // '.'
                as1[i1] = ((String) (obj));
                i1 = 48;
                obj = "#2(%3'4/2h:3$zn<3&0n\n0.1yz3.'q41";
                c1 = '/';
                break;

            case 47: // '/'
                as1[i1] = ((String) (obj));
                i1 = 49;
                obj = "6<-9C'4/2h:3$";
                c1 = '0';
                break;

            case 48: // '0'
                as1[i1] = ((String) (obj));
                i1 = 50;
                obj = "#4#'}!23";
                c1 = '1';
                break;

            case 49: // '1'
                as1[i1] = ((String) (obj));
                i1 = 51;
                obj = "#2(%3'4/2h:3$zr:p3<r2).;yu;. r1}':nu";
                c1 = '2';
                break;

            case 50: // '2'
                as1[i1] = ((String) (obj));
                i1 = 52;
                obj = "62,{k=<5&}%-\036%n0;$'y;>$&";
                c1 = '3';
                break;

            case 51: // '3'
                as1[i1] = ((String) (obj));
                i1 = 53;
                obj = "6<-9C#4#'}!8\0369y;:5=";
                c1 = '4';
                break;

            case 52: // '4'
                as1[i1] = ((String) (obj));
                i1 = 54;
                obj = "62/!y;){z3&85!u;:2zo,.50qz/(;{!2/0";
                c1 = '5';
                break;

            case 53: // '5'
                as1[i1] = ((String) (obj));
                i1 = 55;
                obj = "#2(%3'4/2h:3$zn<3&0n\n0.1yz+(7n4)$";
                c1 = '6';
                break;

            case 54: // '6'
                as1[i1] = ((String) (obj));
                i1 = 56;
                obj = "4(%<s";
                c1 = '7';
                break;

            case 55: // '7'
                as1[i1] = ((String) (obj));
                i1 = 57;
                obj = "#2(%30<3xr0<3";
                c1 = '8';
                break;

            case 56: // '8'
                as1[i1] = ((String) (obj));
                i1 = 58;
                obj = "u;-4{&`";
                c1 = '9';
                break;

            case 57: // '9'
                as1[i1] = ((String) (obj));
                i1 = 59;
                obj = "u02";
                c1 = ':';
                break;

            case 58: // ':'
                as1[i1] = ((String) (obj));
                i1 = 60;
                obj = "&) 'h\n> 9p";
                c1 = ';';
                break;

            case 59: // ';'
                as1[i1] = ((String) (obj));
                i1 = 61;
                obj = "?4%";
                c1 = '<';
                break;

            case 60: // '<'
                as1[i1] = ((String) (obj));
                i1 = 62;
                obj = "#2(%3&83#u68n6q1}(;h035h";
                c1 = '=';
                break;

            case 61: // '='
                as1[i1] = ((String) (obj));
                i1 = 63;
                obj = "0%5'}\n/$6y<+$\nq0.24{0";
                c1 = '>';
                break;

            case 62: // '>'
                as1[i1] = ((String) (obj));
                i1 = 64;
                obj = "u.54n!\024%h";
                c1 = '?';
                break;

            case 63: // '?'
                as1[i1] = ((String) (obj));
                i1 = 65;
                obj = "'8+0\177!\002\"4p9";
                c1 = '@';
                break;

            case 64: // '@'
                as1[i1] = ((String) (obj));
                i1 = 66;
                obj = "?4%";
                c1 = 'A';
                break;

            case 65: // 'A'
                as1[i1] = ((String) (obj));
                i1 = 67;
                obj = "'8\"0u#8\0368y&. 2y";
                c1 = 'B';
                break;

            case 66: // 'B'
                as1[i1] = ((String) (obj));
                i1 = 68;
                obj = "#2(%3&83#u68n6q1r/:hx.54n!8%";
                c1 = 'C';
                break;

            case 67: // 'C'
                as1[i1] = ((String) (obj));
                i1 = 69;
                obj = "#2(%3&83#u68n6q1r/ p9p 6h<2/";
                c1 = 'D';
                break;

            case 68: // 'D'
                as1[i1] = ((String) (obj));
                i1 = 70;
                obj = "#2(%3&83#u68n6q1r";
                c1 = 'E';
                break;

            case 69: // 'E'
                as1[i1] = ((String) (obj));
                i1 = 71;
                obj = "u8-4l&8%u";
                c1 = 'F';
                break;

            case 70: // 'F'
                as1[i1] = ((String) (obj));
                i1 = 72;
                obj = "#2(%3;<5<j0\0022!}')\0366}91a0p4-20xu";
                c1 = 'G';
                break;

            case 71: // 'G'
                as1[i1] = ((String) (obj));
                i1 = 73;
                obj = "=</2i%\002\"4p9";
                c1 = 'H';
                break;

            case 72: // 'H'
                as1[i1] = ((String) (obj));
                i1 = 74;
                obj = "#2(%3&83#u68n6q1r/ p9p 6h<2/";
                c1 = 'I';
                break;

            case 73: // 'I'
                as1[i1] = ((String) (obj));
                i1 = 75;
                obj = "0%5'}\n/$6y<+$\nq0.24{0\002.7v";
                c1 = 'J';
                break;

            case 74: // 'J'
                as1[i1] = ((String) (obj));
                i1 = 76;
                obj = "%5.;y";
                c1 = 'K';
                break;

            case 75: // 'K'
                as1[i1] = ((String) (obj));
                i1 = 77;
                obj = "&) 'h\n> 9p";
                c1 = 'L';
                break;

            case 76: // 'L'
                as1[i1] = ((String) (obj));
                i1 = 78;
                obj = "03%\n\17741-\no!/(;{";
                c1 = 'M';
                break;

            case 77: // 'M'
                as1[i1] = ((String) (obj));
                i1 = 79;
                obj = "#2(%3&83#u68n6q1r/ p9p(;h035";
                c1 = 'N';
                break;

            case 78: // 'N'
                as1[i1] = ((String) (obj));
                i1 = 80;
                obj = "'8''y&5\036;s!4'<\1774)(:r";
                c1 = 'O';
                break;

            case 79: // 'O'
                as1[i1] = ((String) (obj));
                i1 = 81;
                obj = "#2(%3&83#u68n6q1r4;w;26;14>5<s;";
                c1 = 'P';
                break;

            case 80: // 'P'
                as1[i1] = ((String) (obj));
                i1 = 82;
                obj = "u02";
                c1 = 'Q';
                break;

            case 81: // 'Q'
                as1[i1] = ((String) (obj));
                i1 = 83;
                obj = "'8\"0u#8\0368y&. 2y";
                c1 = 'R';
                break;

            case 82: // 'R'
                as1[i1] = ((String) (obj));
                i1 = 84;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px)34r&-.'hx<\">";
                c1 = 'S';
                break;

            case 83: // 'S'
                as1[i1] = ((String) (obj));
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px/$9},p$9y6)(:rx<\">";
                c1 = 'T';
                i1 = 85;
                break;

            case 84: // 'T'
                as1[i1] = ((String) (obj));
                i1 = 86;
                obj = "4(%<s";
                c1 = 'U';
                break;

            case 85: // 'U'
                as1[i1] = ((String) (obj));
                i1 = 87;
                obj = "#2(%34(%<s\n/. h0r5:s21$\006l0<*0n\0055.;yu>)4r24/2<&-$4w0/a&h4)$uh:}";
                c1 = 'V';
                break;

            case 86: // 'V'
                as1[i1] = ((String) (obj));
                i1 = 88;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px04!y";
                c1 = 'W';
                break;

            case 87: // 'W'
                as1[i1] = ((String) (obj));
                i1 = 89;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px/$9},p-4h03\",";
                c1 = 'X';
                break;

            case 88: // 'X'
                as1[i1] = ((String) (obj));
                i1 = 90;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p30\177041!";
                c1 = 'Y';
                break;

            case 89: // 'Y'
                as1[i1] = ((String) (obj));
                i1 = 91;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px)$'q<3 !yu;3:qu";
                c1 = 'Z';
                break;

            case 90: // 'Z'
                as1[i1] = ((String) (obj));
                i1 = 92;
                obj = "y}\"4p9}(1<";
                c1 = '[';
                break;

            case 91: // '['
                as1[i1] = ((String) (obj));
                i1 = 93;
                obj = "#2(%36<-9303%uy9<1&y1}";
                c1 = '\\';
                break;

            case 92: // '\\'
                as1[i1] = ((String) (obj));
                i1 = 94;
                obj = "#2(%36<-9303%";
                c1 = ']';
                break;

            case 93: // ']'
                as1[i1] = ((String) (obj));
                i1 = 95;
                obj = "u02";
                c1 = '^';
                break;

            case 94: // '^'
                as1[i1] = ((String) (obj));
                i1 = 96;
                obj = "#2(%3&83#u68n1y&)3:e";
                c1 = '_';
                break;

            case 95: // '_'
                as1[i1] = ((String) (obj));
                i1 = 97;
                obj = "3236y\000--:}1";
                c1 = '`';
                break;

            case 96: // '`'
                as1[i1] = ((String) (obj));
                i1 = 98;
                obj = "#4$\"";
                c1 = 'a';
                break;

            case 97: // 'a'
                as1[i1] = ((String) (obj));
                i1 = 99;
                obj = "62,{k=<5&}%-";
                c1 = 'b';
                break;

            case 98: // 'b'
                as1[i1] = ((String) (obj));
                i1 = 100;
                obj = "\0032\b\005<\026<-9<\0203%0x";
                c1 = 'c';
                break;

            case 99: // 'c'
                as1[i1] = ((String) (obj));
                i1 = 101;
                obj = "41 'q";
                c1 = 'd';
                break;

            case 100: // 'd'
                as1[i1] = ((String) (obj));
                i1 = 102;
                obj = "62,{k=<5&}%-o\031S\022\002\002\007U\001\024\002\024P\n\030\027\020R\001";
                c1 = 'e';
                break;

            case 101: // 'e'
                as1[i1] = ((String) (obj));
                i1 = 103;
                obj = "6/(!u6<-\020j035";
                c1 = 'f';
                break;

            case 102: // 'f'
                as1[i1] = ((String) (obj));
                i1 = 104;
                obj = "!<&&";
                c1 = 'g';
                break;

            case 103: // 'g'
                as1[i1] = ((String) (obj));
                i1 = 105;
                obj = "%260n";
                c1 = 'h';
                break;

            case 104: // 'h'
                as1[i1] = ((String) (obj));
                i1 = 106;
                obj = "\0032(6y\00683#u68a0r1}\"4p9";
                c1 = 'i';
                break;

            case 105: // 'i'
                as1[i1] = ((String) (obj));
                i1 = 107;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p 6\1770-5xn0>$<l!";
                c1 = 'j';
                break;

            case 106: // 'j'
                as1[i1] = ((String) (obj));
                i1 = 108;
                obj = "#2(%368-9i9<3x\17741-xu;p1's2/$&ox>)4r28%o<";
                c1 = 'k';
                break;

            case 107: // 'k'
                as1[i1] = ((String) (obj));
                i1 = 109;
                obj = "#2(%3&83#u68n7u;9a<r!8/!!";
                c1 = 'l';
                break;

            case 108: // 'l'
                as1[i1] = ((String) (obj));
                i1 = 110;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px)$'q<3 !yx<\">";
                c1 = 'm';
                break;

            case 109: // 'm'
                as1[i1] = ((String) (obj));
                i1 = 111;
                obj = "#2(%3'4/2h:3$zo!21";
                c1 = 'n';
                break;

            case 110: // 'n'
                as1[i1] = ((String) (obj));
                i1 = 112;
                obj = "#4#'}!23";
                c1 = 'o';
                break;

            case 111: // 'o'
                as1[i1] = ((String) (obj));
                i1 = 113;
                obj = "\0025 !o\024-1uJ:4\"0O0/7<\1770}\021's-4,<h,";
                c1 = 'p';
                break;

            case 112: // 'p'
                as1[i1] = ((String) (obj));
                i1 = 114;
                obj = "%260n";
                c1 = 'q';
                break;

            case 113: // 'q'
                as1[i1] = ((String) (obj));
                i1 = 115;
                obj = "#2(%3!2&2p0\0204!y\006) !i&}\"=};:(;{u04!y1}2!}!8a!su";
                c1 = 'r';
                break;

            case 114: // 'r'
                as1[i1] = ((String) (obj));
                i1 = 116;
                obj = "#2(%3&83#u68n&h4/5";
                c1 = 's';
                break;

            case 115: // 's'
                as1[i1] = ((String) (obj));
                i1 = 117;
                obj = "#2(%3&83#u68n&h4/5uy9<1&y1}";
                c1 = 't';
                break;

            case 116: // 't'
                as1[i1] = ((String) (obj));
                i1 = 118;
                obj = "%5.;y";
                c1 = 'u';
                break;

            case 117: // 'u'
                as1[i1] = ((String) (obj));
                i1 = 119;
                obj = "43%'s<9o<r!8/!24>5<s;s\022\026N\020\030\017\nS\023\033";
                c1 = 'v';
                break;

            case 118: // 'v'
                as1[i1] = ((String) (obj));
                i1 = 120;
                obj = "43%'s<9o<r!8/!24>5<s;s\t\020]\021\016\004\001C\005\021\024\022";
                c1 = 'w';
                break;

            case 119: // 'w'
                as1[i1] = ((String) (obj));
                i1 = 121;
                obj = "u02";
                c1 = 'x';
                break;

            case 120: // 'x'
                as1[i1] = ((String) (obj));
                i1 = 122;
                obj = "43%'s<9o8y14 {y-)342\006\036\016\n]\000\031\b\032C\006\t\000\001Y";
                c1 = 'y';
                break;

            case 121: // 'y'
                as1[i1] = ((String) (obj));
                i1 = 123;
                obj = "43%'s<9o7p 85:s!5o=y4920h{-3:z<1${}6)(:r{\036\016\033R\020\036\025\034S\033\002\022\001]\001\030\036\026T\024\023\006\020X";
                c1 = 'z';
                break;

            case 122: // 'z'
                as1[i1] = ((String) (obj));
                i1 = 124;
                obj = "43%'s<9o8y14 {O\026\022\036\024I\021\024\016\nO\001\034\025\020C\026\025\000\033[\020\031";
                c1 = '{';
                break;

            case 123: // '{'
                as1[i1] = ((String) (obj));
                i1 = 125;
                obj = "'82 p!}.3<4(%<su;.6i&}':nu+.<\1770}\"4p9ga";
                c1 = '|';
                break;

            case 124: // '|'
                as1[i1] = ((String) (obj));
                i1 = 126;
                obj = "4(%<s";
                c1 = '}';
                break;

            case 125: // '}'
                as1[i1] = ((String) (obj));
                i1 = 127;
                obj = "#2(%36<-934>\"0l!";
                c1 = '~';
                break;

            case 126: // '~'
                as1[i1] = ((String) (obj));
                i1 = 128;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px/$9},p$9y6)(:r";
                c1 = '\177';
                break;

            case 127: // '\177'
                as1[i1] = ((String) (obj));
                i1 = 129;
                obj = "#2(%3&83#u68n6n0<50";
                c1 = '\200';
                break;

            case 128: 
                as1[i1] = ((String) (obj));
                i1 = 130;
                obj = "\0032(%<\0064&;}94/2<\001530}1";
                c1 = '\201';
                break;

            case 129: 
                as1[i1] = ((String) (obj));
                i1 = 131;
                obj = "#2(%3&83#u68n&h:-";
                c1 = '\202';
                break;

            case 130: 
                as1[i1] = ((String) (obj));
                i1 = 132;
                obj = "%5.;y";
                c1 = '\203';
                break;

            case 131: 
                as1[i1] = ((String) (obj));
                i1 = 133;
                obj = "#2(%3&83#u68n&h:-a0p4-20xu";
                c1 = '\204';
                break;

            case 132: 
                as1[i1] = ((String) (obj));
                i1 = 134;
                obj = "u02";
                c1 = '\205';
                break;

            case 133: 
                as1[i1] = ((String) (obj));
                i1 = 135;
                obj = "4(%<s";
                c1 = '\206';
                break;

            case 134: 
                as1[i1] = ((String) (obj));
                i1 = 136;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px)34r&-.'h";
                c1 = '\207';
                break;

            case 135: 
                as1[i1] = ((String) (obj));
                i1 = 137;
                obj = "#2(%3'8\"0u#8\0368y&. 2yz> 9px2'3y'p30v0>5";
                c1 = '\210';
                break;

            case 136: 
                as1[i1] = ((String) (obj));
                I = as;
                byte byte0;
                char c2;
                if (android.os.Build.VERSION.SDK_INT >= 8)
                {
                    B = new abi();
                } else
                {
                    B = null;
                }
                C = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 3200
    //                   0 3223
    //                   1 3230
    //                   2 3237
    //                   3 3244;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_3244;
_L3:
        byte0 = 28;
_L9:
        obj[j1] = (char)(byte0 ^ c2);
        j1++;
          goto _L8
_L4:
        byte0 = 85;
          goto _L9
_L5:
        byte0 = 93;
          goto _L9
_L6:
        byte0 = 65;
          goto _L9
        byte0 = 85;
          goto _L9
    }

    private class VoiceServiceEventCallback
        implements Voip.EventCallback
    {

        private static final String z[];
        protected ate bufferQueue;
        final VoiceService this$0;

        public void audioInitError()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[23]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void audioStreamStarted()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[4]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this).sendEmptyMessage(2);
        }

        public void callAcceptFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[16]).toString());
        }

        public void callAcceptReceived()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[47]).toString());
        }

        public void callAcceptSent()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[20]).toString());
        }

        public void callCaptureBufferFilled(Voip.DebugTapType debugtaptype, byte abyte0[], int i1, Voip.RecordingInfo arecordinginfo[])
        {
            if (abyte0 == null || abyte0.length <= 0 || i1 <= 0 || arecordinginfo == null)
            {
                return;
            } else
            {
                VoiceService.z().execute(new i_(this, arecordinginfo, debugtaptype, abyte0, i1));
                return;
            }
        }

        public void callCaptureEnded(Voip.DebugTapType debugtaptype, Voip.RecordingInfo arecordinginfo[])
        {
            VoiceService.z().execute(new asn(this, arecordinginfo, debugtaptype));
        }

        public void callEnding()
        {
label0:
            {
                long l2 = 0L;
                Log.i((new StringBuilder()).append(getClass().getName()).append(z[42]).toString());
                Voip.checkStreamStatistics();
                Voip.CallInfo callinfo = Voip.getCallInfo();
                if (callinfo == null)
                {
                    Log.e(z[44]);
                    return;
                }
                a a1 = new a(callinfo.getPeerId(), callinfo.isCaller(), com.whatsapp.Voip.a(callinfo.getCallId()));
                c4 c4_1 = App.ah.a(a1);
                long l3 = Math.max(0L, callinfo.getCallDuration());
                if (c4_1 != null)
                {
                    c4_1.H = (int)l3 / 1000;
                    if (callinfo.isEndedByMe())
                    {
                        l2 = 1L;
                    }
                    c4_1.t = l2;
                    String s1;
                    if (VoiceService.j(VoiceService.this))
                    {
                        s1 = z[43];
                    } else
                    {
                        s1 = null;
                    }
                    c4_1.l = s1;
                    Log.i((new StringBuilder()).append(getClass().getName()).append(z[45]).append(c4_1.H).append(")").toString());
                    App.ah.e(c4_1);
                    if (App.am == 0)
                    {
                        break label0;
                    }
                }
                Log.e((new StringBuilder()).append(z[41]).append(a1).toString());
            }
            com.whatsapp.l1.a(callinfo.getBytesSent(), 2);
            l1.b(callinfo.getBytesReceived(), 2);
            com.whatsapp.ft.a(com.whatsapp.App.au, Voip.getCallFieldStats());
            if (App.a9())
            {
                com.whatsapp.s0.a(false);
            }
            VoiceService.z().execute(new ze(this));
        }

        public void callInterrupted()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[1]).toString());
        }

        public void callOfferAckedWithRelayInfo()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[29]).toString());
            VoiceService.p(VoiceService.this).removeMessages(2);
        }

        public void callOfferNacked()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[39]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void callOfferReceived()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[0]).toString());
        }

        public void callOfferSent()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[28]).toString());
        }

        public void callRejectReceived(String s1)
        {
label0:
            {
                int i1 = App.am;
                Log.i((new StringBuilder()).append(getClass().getName()).append(z[7]).append(s1).append(')').toString());
                if (z[9].equals(s1))
                {
                    VoiceService.e(VoiceService.this, true);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (z[8].equals(s1))
                {
                    com.whatsapp.VoiceService.a(VoiceService.this, getString(0x7f0e0498, new Object[] {
                        VoiceService.l(VoiceService.this)
                    }));
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                com.whatsapp.VoiceService.a(VoiceService.this, null);
            }
        }

        public void callResumed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[25]).toString());
        }

        public void callStateChanged(Voip.CallState callstate, Voip.CallInfo callinfo)
        {
            Voip.CallState callstate1;
label0:
            {
                int i1 = App.am;
                callstate1 = callinfo.getCallState();
                Log.i((new StringBuilder()).append(getClass().getName()).append(z[36]).append(callstate).append(z[35]).append(callstate1).append(')').toString());
                if (callstate1 == callstate)
                {
                    return;
                }
                com.whatsapp.VoiceService.a(VoiceService.this, callstate1);
                if (callstate1 == Voip.CallState.ACTIVE)
                {
                    VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (callstate1 == Voip.CallState.ACCEPT_RECEIVED || callstate1 == Voip.CallState.ACCEPT_SENT)
                {
                    VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                    VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(1, 20000L);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (callstate1 != Voip.CallState.NONE)
                {
                    VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                    VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(0, 45000L);
                    if (!callinfo.isCaller())
                    {
                        break label0;
                    }
                    VoiceService.p(VoiceService.this).sendEmptyMessageDelayed(2, 15000L);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (callstate1 == Voip.CallState.NONE)
                {
                    VoiceService.p(VoiceService.this).removeCallbacksAndMessages(null);
                }
            }
            com.whatsapp.aa.a[callstate1.ordinal()];
            JVM INSTR tableswitch 1 1: default 252
        //                       1 276;
               goto _L1 _L2
_L1:
            Message.obtain(com.whatsapp.VoiceService.a(VoiceService.this), 4, callstate.ordinal(), callstate1.ordinal(), callinfo).sendToTarget();
            return;
_L2:
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                startService(new Intent(z[34], null, VoiceService.this, com/whatsapp/VoiceService));
            }
            if (App.a9())
            {
                com.whatsapp.VoiceService.g(VoiceService.this);
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void callTerminateReceived()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[14]).toString());
        }

        public void errorGatheringHostCandidates()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[48]).toString());
        }

        public byte[] getByteBuffer(int i1)
        {
            return bufferQueue.a(i1);
        }

        public void handleAcceptFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[5]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void handleOfferFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[33]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void incompatibleSrtpKeyExchange()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[12]).toString());
        }

        public void mediaStreamError()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[27]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void mediaStreamStartError()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[24]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void missingRelayInfo()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[10]).toString());
        }

        public void p2pNegotaitionFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[32]).toString());
        }

        public void p2pNegotiationSuccess()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[31]).toString());
        }

        public void p2pTransportCreateFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[26]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void p2pTransportMediaCreateFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[13]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void p2pTransportRestartSuccess()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[38]).toString());
        }

        public void p2pTransportStartFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[21]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void relayBindsFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[19]).toString());
        }

        public void relayCreateSuccess()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[6]).toString());
        }

        public void relayElectionSendFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[15]).toString());
        }

        public void relayLatencySendFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[22]).toString());
        }

        public void rtcpPacketReceived()
        {
        }

        public void rxTimeout()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[17]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void rxTrafficStarted()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[18]).toString());
        }

        public void rxTrafficStopped()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[3]).toString());
        }

        public void sendAcceptFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[11]).toString());
            w();
        }

        public void sendOfferFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[37]).toString());
        }

        public void soundPortCreateFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[46]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void transportCandSendFailed()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[30]).toString());
        }

        public void txTimeout()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[2]).toString());
            com.whatsapp.VoiceService.a(VoiceService.this, null);
        }

        public void willCreateSoundPort()
        {
            Log.i((new StringBuilder()).append(getClass().getName()).append(z[40]).toString());
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i1;
            as = new String[49];
            obj = "\005_GP\npZ@Y\024mYEY\017IYB";
            byte0 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
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
                switch (byte0)
                {
                default:
                    as1[i1] = ((String) (obj));
                    obj = "\005_GP\nvRRY\024MIVH\003[";
                    i1 = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = "\005H^h\017RYII\022";
                    i1 = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    obj = "\005N^h\024^Z@U\005lHGS\026OYB";
                    i1 = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    i1 = 4;
                    obj = "\005]SX\017PoRN\003^QuH\007MHCX";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i1] = ((String) (obj));
                    i1 = 5;
                    obj = "\005TGR\002SYg_\005ZLRz\007VPCX";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i1] = ((String) (obj));
                    i1 = 6;
                    obj = "\005NCP\007F\177TY\007KYuI\005\\YUO";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i1] = ((String) (obj));
                    i1 = 7;
                    obj = "\005_GP\nmYLY\005KnC_\003VJCXN";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i1] = ((String) (obj));
                    i1 = 8;
                    obj = "JRE]\nS]DP\003";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i1] = ((String) (obj));
                    i1 = 9;
                    obj = "]IUE";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i1] = ((String) (obj));
                    i1 = 10;
                    obj = "\005QOO\025VRAn\003S]_u\bYS";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i1] = ((String) (obj));
                    i1 = 11;
                    obj = "\005OCR\002~_EY\026KzGU\nZX";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i1] = ((String) (obj));
                    i1 = 12;
                    obj = "\005UH_\tRLGH\017]PCo\024KLmY\037zDET\007Q[C";
                    byte0 = 11;
                    break;

                case 11: // '\013'
                    as1[i1] = ((String) (obj));
                    i1 = 13;
                    obj = "\005L\024L2M]HO\026PNRq\003[UG\177\024Z]RY ^UJY\002";
                    byte0 = 12;
                    break;

                case 12: // '\f'
                    as1[i1] = ((String) (obj));
                    i1 = 14;
                    obj = "\005_GP\nkYTQ\017Q]RY4Z_CU\020ZX";
                    byte0 = 13;
                    break;

                case 13: // '\r'
                    as1[i1] = ((String) (obj));
                    i1 = 15;
                    obj = "\005NCP\007FyJY\005KUIR5ZRBz\007VPCX";
                    byte0 = 14;
                    break;

                case 14: // '\016'
                    as1[i1] = ((String) (obj));
                    i1 = 16;
                    obj = "\005_GP\n~_EY\026KzGU\nZX";
                    byte0 = 15;
                    break;

                case 15: // '\017'
                    as1[i1] = ((String) (obj));
                    i1 = 17;
                    obj = "\005N^h\017RYII\022";
                    byte0 = 16;
                    break;

                case 16: // '\020'
                    as1[i1] = ((String) (obj));
                    i1 = 18;
                    obj = "\005N^h\024^Z@U\005lHGN\022ZX";
                    byte0 = 17;
                    break;

                case 17: // '\021'
                    as1[i1] = ((String) (obj));
                    i1 = 19;
                    obj = "\005NCP\007F~OR\002LzGU\nZX";
                    byte0 = 18;
                    break;

                case 18: // '\022'
                    as1[i1] = ((String) (obj));
                    i1 = 20;
                    obj = "\005_GP\n~_EY\026KoCR\022";
                    byte0 = 19;
                    break;

                case 19: // '\023'
                    as1[i1] = ((String) (obj));
                    i1 = 21;
                    obj = "\005L\024L2M]HO\026PNRo\022^NRz\007VPCX";
                    byte0 = 20;
                    break;

                case 20: // '\024'
                    as1[i1] = ((String) (obj));
                    i1 = 22;
                    obj = "\005NCP\007FpGH\003Q__o\003QX`]\017SYB";
                    byte0 = 21;
                    break;

                case 21: // '\025'
                    as1[i1] = ((String) (obj));
                    i1 = 23;
                    obj = "\005]SX\017PuHU\022zNTS\024";
                    byte0 = 22;
                    break;

                case 22: // '\026'
                    as1[i1] = ((String) (obj));
                    i1 = 24;
                    obj = "\005QCX\017^oRN\003^QuH\007MHcN\024PN";
                    byte0 = 23;
                    break;

                case 23: // '\027'
                    as1[i1] = ((String) (obj));
                    i1 = 25;
                    obj = "\005_GP\nmYUI\013ZX";
                    byte0 = 24;
                    break;

                case 24: // '\030'
                    as1[i1] = ((String) (obj));
                    i1 = 26;
                    obj = "\005L\024L2M]HO\026PNR\177\024Z]RY ^UJY\002";
                    byte0 = 25;
                    break;

                case 25: // '\031'
                    as1[i1] = ((String) (obj));
                    i1 = 27;
                    obj = "\005QCX\017^oRN\003^QcN\024PN";
                    byte0 = 26;
                    break;

                case 26: // '\032'
                    as1[i1] = ((String) (obj));
                    i1 = 28;
                    obj = "\005_GP\npZ@Y\024lYHH";
                    byte0 = 27;
                    break;

                case 27: // '\033'
                    as1[i1] = ((String) (obj));
                    i1 = 29;
                    obj = "\005_GP\npZ@Y\024~_MY\002hURT4ZPGE/QZI";
                    byte0 = 28;
                    break;

                case 28: // '\034'
                    as1[i1] = ((String) (obj));
                    i1 = 30;
                    obj = "\005HT]\bLLIN\022|]HX5ZRBz\007VPCX";
                    byte0 = 29;
                    break;

                case 29: // '\035'
                    as1[i1] = ((String) (obj));
                    i1 = 31;
                    obj = "\005L\024L(Z[IH\017^HOS\blIE_\003LO";
                    byte0 = 30;
                    break;

                case 30: // '\036'
                    as1[i1] = ((String) (obj));
                    i1 = 32;
                    obj = "\005L\024L(Z[IH\017^HOS\by]OP\003[";
                    byte0 = 31;
                    break;

                case 31: // '\037'
                    as1[i1] = ((String) (obj));
                    i1 = 33;
                    obj = "\005TGR\002SYiZ\000ZN`]\017SYB";
                    byte0 = 32;
                    break;

                case 32: // ' '
                    as1[i1] = ((String) (obj));
                    i1 = 34;
                    obj = "MY@N\003LTyR\tKU@U\005^HOS\b";
                    byte0 = 33;
                    break;

                case 33: // '!'
                    as1[i1] = ((String) (obj));
                    i1 = 35;
                    obj = "\023\034";
                    byte0 = 34;
                    break;

                case 34: // '"'
                    as1[i1] = ((String) (obj));
                    i1 = 36;
                    obj = "\005_GP\nlHGH\003|TGR\001ZX\016";
                    byte0 = 35;
                    break;

                case 35: // '#'
                    as1[i1] = ((String) (obj));
                    i1 = 37;
                    obj = "\005OCR\002pZ@Y\024y]OP\003[";
                    byte0 = 36;
                    break;

                case 36: // '$'
                    as1[i1] = ((String) (obj));
                    obj = "\005L\024L2M]HO\026PNRn\003LHGN\022lIE_\003LO";
                    byte0 = 37;
                    i1 = 38;
                    break;

                case 37: // '%'
                    as1[i1] = ((String) (obj));
                    i1 = 39;
                    obj = "\005_GP\npZ@Y\024q]EW\003[";
                    byte0 = 38;
                    break;

                case 38: // '&'
                    as1[i1] = ((String) (obj));
                    i1 = 40;
                    obj = "\005KOP\n|NC]\022ZoII\b[lIN\022";
                    byte0 = 39;
                    break;

                case 39: // '\''
                    as1[i1] = ((String) (obj));
                    i1 = 41;
                    obj = "\\]H\034\bPH\006Z\017QX\006Q\003LOG[\003\037";
                    byte0 = 40;
                    break;

                case 40: // '('
                    as1[i1] = ((String) (obj));
                    i1 = 42;
                    obj = "\005_GP\nzRBU\bX";
                    byte0 = 41;
                    break;

                case 41: // ')'
                    as1[i1] = ((String) (obj));
                    i1 = 43;
                    obj = "\\]JP9L_TY\003QcVN\003LYHH\003[";
                    byte0 = 42;
                    break;

                case 42: // '*'
                    as1[i1] = ((String) (obj));
                    i1 = 44;
                    obj = "HY\006]\024Z\034HS\022\037UH\034\007\037]EH\017IY\006_\007SP";
                    byte0 = 43;
                    break;

                case 43: // '+'
                    as1[i1] = ((String) (obj));
                    i1 = 45;
                    obj = "\005_GP\nzRBU\bX\034\016X\023M]RU\tQ\001";
                    byte0 = 44;
                    break;

                case 44: // ','
                    as1[i1] = ((String) (obj));
                    i1 = 46;
                    obj = "\005OII\b[lIN\022|NC]\022ZzGU\nZX";
                    byte0 = 45;
                    break;

                case 45: // '-'
                    as1[i1] = ((String) (obj));
                    i1 = 47;
                    obj = "\005_GP\n~_EY\026KnC_\003VJCX";
                    byte0 = 46;
                    break;

                case 46: // '.'
                    as1[i1] = ((String) (obj));
                    i1 = 48;
                    obj = "\005YTN\tM{GH\016ZNOR\001wSUH%^RBU\002^HCO";
                    byte0 = 47;
                    break;

                case 47: // '/'
                    as1[i1] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c1 = obj[j1];
            j1 % 5;
            JVM INSTR tableswitch 0 3: default 1160
        //                       0 1183
        //                       1 1190
        //                       2 1197
        //                       3 1204;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_1204;
_L3:
            byte byte1 = 102;
_L9:
            obj[j1] = (char)(byte1 ^ c1);
            j1++;
              goto _L8
_L4:
            byte1 = 63;
              goto _L9
_L5:
            byte1 = 60;
              goto _L9
_L6:
            byte1 = 38;
              goto _L9
            byte1 = 60;
              goto _L9
        }

        public VoiceServiceEventCallback()
        {
            this$0 = VoiceService.this;
            super();
            bufferQueue = new ate();
        }
    }


    private class _cls4 extends BroadcastReceiver
    {

        private static final String z;
        final VoiceService a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals(z))
            {
                a.w();
            }
        }

        static 
        {
            char ac[];
            int i1;
            int j1;
            ac = "pk\034ktxaVpue`\026m5pf\fpt\177++ZIT@6FTWC".toCharArray();
            j1 = ac.length;
            i1 = 0;
_L7:
            char c1;
            if (j1 <= i1)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[i1];
            i1 % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 97
        //                       3 103;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_103;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 27;
_L8:
            ac[i1] = (char)(byte0 ^ c1);
            i1++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 17;
              goto _L8
_L3:
            byte0 = 5;
              goto _L8
_L4:
            byte0 = 120;
              goto _L8
            byte0 = 25;
              goto _L8
        }

        _cls4()
        {
            a = VoiceService.this;
            super();
        }
    }


    private class _cls5 extends BroadcastReceiver
    {

        private static final String z;
        final VoiceService a;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getIntExtra(z, 0) > 0)
            {
                VoiceService.d(a, true);
            }
            VoiceService.i(a);
            if (VoiceService.d(a) != null)
            {
                VoiceService.d(a).b();
            }
        }

        static 
        {
            char ac[];
            int i1;
            int j1;
            ac = ",\023_\037~".toCharArray();
            j1 = ac.length;
            i1 = 0;
_L7:
            char c1;
            if (j1 <= i1)
            {
                z = (new String(ac)).intern();
                return;
            }
            c1 = ac[i1];
            i1 % 5;
            JVM INSTR tableswitch 0 3: default 68
        //                       0 86
        //                       1 92
        //                       2 98
        //                       3 104;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_104;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            byte byte0 = 27;
_L8:
            ac[i1] = (char)(byte0 ^ c1);
            i1++;
            if (true) goto _L7; else goto _L6
_L6:
            byte0 = 95;
              goto _L8
_L3:
            byte0 = 103;
              goto _L8
_L4:
            byte0 = 62;
              goto _L8
            byte0 = 107;
              goto _L8
        }

        _cls5()
        {
            a = VoiceService.this;
            super();
        }
    }


    private class _cls6 extends BroadcastReceiver
    {

        private static final String z[];
        final VoiceService a;
        private boolean b;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
label1:
                {
                    int i1 = App.am;
                    if (!z[0].equals(intent.getAction()))
                    {
                        break label0;
                    }
                    int j1 = intent.getIntExtra(z[1], -1);
                    boolean flag1 = VoiceService.q(a);
                    if (j1 == 1)
                    {
                        VoiceService.f(a, true);
                        b = false;
                        if (VoiceService.r(a) == null)
                        {
                            break label1;
                        }
                        context = VoiceService.r(a).getConnectedDevices().iterator();
                        do
                        {
                            if (!context.hasNext())
                            {
                                break;
                            }
                            intent = (BluetoothDevice)context.next();
                            if (!VoiceService.r(a).isAudioConnected(intent))
                            {
                                continue;
                            }
                            int k1 = intent.getBluetoothClass().getDeviceClass();
                            boolean flag;
                            if (k1 == 1032 || k1 == 1056 || k1 == 1028)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            b = flag;
                            if (b && i1 == 0)
                            {
                                break;
                            }
                        } while (i1 == 0);
                        if (i1 == 0)
                        {
                            break label1;
                        }
                    }
                    if (j1 == 0)
                    {
                        VoiceService.f(a, false);
                        if (flag1 && !VoiceService.f(a) && b && a.e())
                        {
                            com.whatsapp.VoiceService.a(a, null);
                        }
                        b = false;
                    }
                }
                com.whatsapp.VoiceService.n(a);
            }
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i1;
            as = new String[2];
            obj = "\000r\0220:\bxX/0\005u\027l\006\"S)\003\000%U9\035\0065]\"\007\n\"T7\f\022$X";
            byte1 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
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
                    as1[i1] = ((String) (obj));
                    i1 = 1;
                    obj = "\000r\0220:\bxX/0\005u\027l0\031h\004#{2_9\035\0244X?\r\n2H7\026\020";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    z = as;
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
            byte byte0 = 85;
_L9:
            obj[j1] = (char)(byte0 ^ c1);
            j1++;
              goto _L8
_L4:
            byte0 = 97;
              goto _L9
_L5:
            byte0 = 28;
              goto _L9
_L6:
            byte0 = 118;
              goto _L9
            byte0 = 66;
              goto _L9
        }

        _cls6()
        {
            a = VoiceService.this;
            super();
            b = false;
        }
    }


    private class _cls7 extends BroadcastReceiver
    {

        private static final String z[];
        final VoiceService a;

        public void onReceive(Context context, Intent intent)
        {
            int i1;
            int j1;
label0:
            {
                context = intent.getAction();
                if (z[2].equals(context))
                {
                    i1 = intent.getIntExtra(z[0], 0);
                    j1 = intent.getIntExtra(z[1], 0);
                    if (i1 != j1)
                    {
                        break label0;
                    }
                }
                return;
            }
            if ((j1 == 2 || VoiceService.q(a)) && (i1 == 3 || i1 == 0))
            {
                context = (AudioManager)a.getSystemService(z[3]);
                context.stopBluetoothSco();
                context.setBluetoothScoOn(false);
            }
            com.whatsapp.VoiceService.n(a);
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i1;
            as = new String[4];
            obj = "#&R1++,\030!(7-B,+6 \03036-._/!l-N76#fe\027\005\026\r";
            byte1 = -1;
            i1 = 0;
_L2:
            String as1[];
            int j1;
            int k1;
            as1 = as;
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
                    as1[i1] = ((String) (obj));
                    obj = "#&R1++,\030!(7-B,+6 \03036-._/!l-N76#ff\021\001\024\001y\026\027\035\033b\002\020\007";
                    i1 = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i1] = ((String) (obj));
                    obj = "#&R1++,\030!(7-B,+6 \030+!#,E&0l8D,\"+$Sm%!<_,*l\013y\r\n\007\013b\n\013\f\027e\027\005\026\ri\000\f\003\006q\006\0";
                    i1 = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i1] = ((String) (obj));
                    i1 = 3;
                    obj = "#=R*+";
                    byte1 = 2;
                    break;

                case 2: // '\002'
                    as1[i1] = ((String) (obj));
                    z = as;
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
            byte byte0 = 68;
_L9:
            obj[j1] = (char)(byte0 ^ c1);
            j1++;
              goto _L8
_L4:
            byte0 = 66;
              goto _L9
_L5:
            byte0 = 72;
              goto _L9
_L6:
            byte0 = 54;
              goto _L9
            byte0 = 67;
              goto _L9
        }

        _cls7()
        {
            a = VoiceService.this;
            super();
        }
    }

}
