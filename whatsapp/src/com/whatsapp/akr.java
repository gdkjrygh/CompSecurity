// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AsyncPlayer;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.bk;
import com.whatsapp.util.s;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            _t, App, asv, at4, 
//            d7, e1, MediaData, aoz, 
//            m1

public class akr
{

    private static byte a[];
    public static akr g;
    private static AudioManager m;
    private static String w[];
    private static final String z[];
    private int b;
    private boolean c;
    private Sensor d;
    private int e;
    private Handler f;
    private android.media.AudioManager.OnAudioFocusChangeListener h;
    private at4 i;
    private asv j;
    private MediaPlayer k;
    private c4 l;
    private Visualizer n;
    private Activity o;
    private long p;
    private SensorEventListener q;
    private SensorManager r;
    private boolean s;
    private float t;
    private s u;
    private int v;

    public akr(Activity activity)
    {
        f = new _t(this);
        o = activity;
        if (m == null)
        {
            m = (AudioManager)o.getSystemService(z[8]);
        }
    }

    static void a(akr akr1)
    {
        akr1.h();
    }

    static void a(akr akr1, int i1)
    {
        akr1.b(i1);
    }

    public static boolean a(c4 c4_1)
    {
        akr akr1;
        try
        {
            akr1 = g;
        }
        // Misplaced declaration of an exception variable
        catch (c4 c4_1)
        {
            throw c4_1;
        }
        if (akr1 == null)
        {
            return false;
        } else
        {
            return c4_1.y.equals(g.l.y);
        }
    }

    static Sensor b(akr akr1)
    {
        return akr1.d;
    }

    private void b(int i1)
    {
        boolean flag = false;
        int j1 = App.am;
        double d1;
        double d2;
        double d3;
        at4 at4_1;
        byte abyte0[];
        try
        {
            v = i1;
            if (j != null)
            {
                j.a(i1);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        try
        {
            at4_1 = i;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            try
            {
                throw illegalstateexception1;
            }
            catch (IllegalStateException illegalstateexception2)
            {
                throw illegalstateexception2;
            }
        }
        if (at4_1 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        if (n != null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        b = b + 1;
        abyte0 = a;
        if (abyte0 == null)
        {
            a = new byte[128];
            i1 = 0;
            do
            {
                if (i1 >= a.length)
                {
                    break;
                }
                d1 = Math.sin(((double)i1 * 3.1415926535897931D * 32D) / (double)a.length);
                d2 = Math.abs(Math.sin(((double)i1 * 3.1415926535897931D * 4D) / (double)a.length));
                d3 = Math.abs(Math.sin(((double)i1 * 3.1415926535897931D * 1.0D) / (double)a.length));
                a[i1] = (byte)(int)(d1 * d2 * d3 * 64D + 128D);
                i1++;
            } while (j1 == 0);
        }
        if (b % 4 == 0)
        {
            i1 = ((flag) ? 1 : 0);
            do
            {
                if (i1 >= a.length)
                {
                    break;
                }
                a[i1] = (byte)(256 - a[i1]);
                i1++;
            } while (j1 == 0);
        }
        i.a(a);
    }

    private android.media.AudioManager.OnAudioFocusChangeListener c()
    {
        try
        {
            if (h == null)
            {
                h = new d7(this);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return h;
    }

    static boolean c(akr akr1)
    {
        return akr1.s;
    }

    static at4 d(akr akr1)
    {
        return akr1.i;
    }

    private void d()
    {
        try
        {
            if (j != null)
            {
                j.d();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    static s e(akr akr1)
    {
        return akr1.u;
    }

    private void e()
    {
        try
        {
            if (j != null)
            {
                j.c();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    private void f()
    {
        try
        {
            if (android.os.Build.VERSION.SDK_INT > 7)
            {
                m.abandonAudioFocus(c());
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    private void h()
    {
        try
        {
            if (r != null)
            {
                r.unregisterListener(q, d);
                r = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public static boolean i()
    {
        akr akr1;
        try
        {
            akr1 = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (akr1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (g.c)
        {
            return true;
        }
        return false;
    }

    private void j()
    {
        try
        {
            if (j != null)
            {
                j.a();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    private void k()
    {
        try
        {
            if (r == null)
            {
                r = (SensorManager)o.getSystemService(z[0]);
                d = r.getDefaultSensor(8);
                q = new e1(this);
                r.registerListener(q, d, 2);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    private void n()
    {
        try
        {
            if (j != null)
            {
                j.b();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public static void o()
    {
        try
        {
            if (g != null)
            {
                g.p();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    private void r()
    {
        byte byte0 = 1;
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 > 7)
        {
            AudioManager audiomanager;
            IllegalStateException illegalstateexception;
            android.media.AudioManager.OnAudioFocusChangeListener onaudiofocuschangelistener;
            int j1;
            try
            {
                audiomanager = m;
                onaudiofocuschangelistener = c();
                j1 = l.n;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            if (j1 == 1)
            {
                byte0 = 3;
            }
            audiomanager.requestAudioFocus(onaudiofocuschangelistener, 3, byte0);
        }
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public static boolean s()
    {
        akr akr1;
        try
        {
            akr1 = g;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (akr1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        if (g.m())
        {
            return true;
        }
        return false;
    }

    public static void t()
    {
        try
        {
            if (g != null)
            {
                g.b();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void a()
    {
        Object obj = g;
        if (obj != this)
        {
            try
            {
                if (g != null)
                {
                    g.b();
                }
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        obj = u;
        if (obj != null)
        {
            IllegalStateException illegalstateexception;
            boolean flag;
            try
            {
                flag = u.f();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                try
                {
                    throw illegalstateexception1;
                }
                catch (IllegalStateException illegalstateexception2)
                {
                    throw illegalstateexception2;
                }
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_52;
            }
        }
        l();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        p();
        return;
        illegalstateexception;
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void a(int i1)
    {
        try
        {
            v = i1;
            if (u != null)
            {
                u.b(i1);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void a(asv asv1)
    {
        j = asv1;
    }

    public void a(at4 at4_1)
    {
        i = at4_1;
    }

    protected void a(boolean flag)
    {
        int i1;
        i1 = App.am;
        if (App.aE)
        {
            flag = false;
        }
        boolean flag1;
        try
        {
            flag1 = c;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (flag1 != flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = u;
        if (obj == null) goto _L1; else goto _L3
_L3:
        Object obj1;
        android.view.WindowManager.LayoutParams layoutparams;
        int j1;
        long l1;
        long l2;
        boolean flag2;
        try
        {
            flag2 = u.f();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                throw obj1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
        }
        if (!flag2) goto _L1; else goto _L4
_L4:
        Log.i((new StringBuilder()).append(z[7]).append(flag).toString());
        c = flag;
        obj = o.getWindow();
        layoutparams = ((Window) (obj)).getAttributes();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        t = layoutparams.screenBrightness;
        layoutparams.screenBrightness = 0.1F;
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            layoutparams.screenBrightness = t;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            ((Window) (obj)).setAttributes(layoutparams);
            if (j != null)
            {
                j.a(flag);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (u == null) goto _L1; else goto _L5
_L5:
        flag2 = u.f();
        if (!flag2) goto _L1; else goto _L6
_L6:
        j1 = u.b();
        u.g();
        u.d();
        u = null;
        obj = (MediaData)l.B;
        u = com.whatsapp.util.s.a(((MediaData) (obj)).file.getAbsolutePath());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        try
        {
            obj = (AudioManager)o.getSystemService(z[6]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            App.b(o.getApplicationContext(), 0x7f0e0196, 0);
            return;
        }
        ((AudioManager) (obj)).setSpeakerphoneOn(false);
        u.a(0);
        o.setVolumeControlStream(0);
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        u.a(3);
        o.setVolumeControlStream(3);
        u.c();
        v = Math.max(0, j1 - 1000);
        u.b(v);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        l1 = System.currentTimeMillis();
        l2 = p;
        if (l1 - l2 >= 1500L)
        {
            break; /* Loop/switch isn't completed */
        }
        u.i();
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        s = true;
        j();
        f();
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        App.b(o.getApplicationContext(), 0x7f0e0196, 0);
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
    }

    public void b()
    {
        s s1;
        Log.i(z[5]);
        s1 = u;
        if (s1 != null)
        {
            IllegalStateException illegalstateexception;
            try
            {
                if (u.f())
                {
                    u.g();
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
            u.d();
            u = null;
        }
        try
        {
            if (k != null)
            {
                k.release();
                k = null;
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        try
        {
            if (n != null)
            {
                n.setEnabled(false);
                n = null;
            }
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        try
        {
            if (!c)
            {
                h();
            }
        }
        catch (IllegalStateException illegalstateexception4)
        {
            throw illegalstateexception4;
        }
        f();
        o.setVolumeControlStream(0x80000000);
        v = 0;
        s = false;
        f.removeMessages(0);
        g = null;
        e();
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void b(c4 c4_1)
    {
        l = c4_1;
    }

    public int g()
    {
        s s1;
        try
        {
            s1 = u;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (s1 == null)
        {
            return 0;
        } else
        {
            return Math.max(v, u.b());
        }
    }

    public void l()
    {
        int j1 = App.am;
        Object obj;
        if (g == this)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        obj = g;
        int i1;
        boolean flag;
        if (obj != null)
        {
            try
            {
                g.b();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                throw ioexception;
            }
        }
        try
        {
            App.k.stop();
            if (!App.p(o))
            {
                o.setVolumeControlStream(3);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        r();
        p = System.currentTimeMillis();
        if (u != null) goto _L2; else goto _L1
_L1:
        Log.i(z[1]);
        obj = i;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 < 17)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 > 18)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        flag = z[2].equals(Build.MANUFACTURER);
        if (flag)
        {
            Object obj1;
            IOException ioexception;
            boolean flag1;
            try
            {
                flag1 = bk.a(w, Build.MODEL);
            }
            catch (IOException ioexception1)
            {
                throw ioexception1;
            }
            if (flag1)
            {
                try
                {
                    MediaData mediadata = (MediaData)l.B;
                    k = new MediaPlayer();
                    k.setDataSource(mediadata.file.getAbsolutePath());
                    k.setAudioStreamType(3);
                    k.prepare();
                }
                catch (IOException ioexception2)
                {
                    Log.a(ioexception2);
                }
            }
        }
        obj1 = (MediaData)l.B;
        u = com.whatsapp.util.s.a(((MediaData) (obj1)).file.getAbsolutePath());
        u.a(3);
        u.c();
        u.b(v);
        u.i();
        e = u.a();
        f.sendEmptyMessage(0);
        if (l.y.b)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        i1 = l.n;
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        i1 = l.M;
        if (i1 == 9)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        i1 = l.M;
        if (i1 == 10)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        App.ah.b(l.y, 9);
        App.m(l);
        i1 = 1;
_L5:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        obj1 = i;
        if (obj1 != null)
        {
            IOException ioexception3;
            try
            {
                i1 = android.os.Build.VERSION.SDK_INT;
            }
            catch (IOException ioexception4)
            {
                throw ioexception4;
            }
            if (i1 >= 9)
            {
                try
                {
                    n = new Visualizer(u.e());
                    n.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    n.setDataCaptureListener(new m1(this), Visualizer.getMaxCaptureRate() / 2, true, true);
                    n.setEnabled(true);
                }
                catch (Exception exception)
                {
                    Log.e((new StringBuilder()).append(z[3]).append(exception.toString()).toString());
                }
            }
        }
        try
        {
            d();
            k();
            g = this;
        }
        catch (IOException ioexception5)
        {
            throw ioexception5;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_452;
        }
        b();
        if (j1 == 0) goto _L3; else goto _L2
_L2:
        Log.i(z[4]);
        u.b(v);
        u.i();
        s = false;
        f.sendEmptyMessage(0);
        n();
        k();
_L3:
        return;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception;
        throw ioexception;
        ioexception3;
        try
        {
            throw ioexception3;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception3)
        {
            try
            {
                throw ioexception3;
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception3)
            {
                try
                {
                    throw ioexception3;
                }
                // Misplaced declaration of an exception variable
                catch (IOException ioexception3)
                {
                    try
                    {
                        throw ioexception3;
                    }
                    // Misplaced declaration of an exception variable
                    catch (IOException ioexception3)
                    {
                        Log.a(ioexception3);
                    }
                }
            }
        }
        App.b(o.getApplicationContext(), 0x7f0e0196, 0);
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
        ioexception3;
        throw ioexception3;
        IOException ioexception6;
        ioexception6;
        throw ioexception6;
    }

    public boolean m()
    {
        s s1;
        try
        {
            s1 = u;
        }
        catch (IllegalStateException illegalstateexception)
        {
            try
            {
                throw illegalstateexception;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (u.f())
        {
            return true;
        }
        return false;
    }

    public void p()
    {
        s s1 = u;
        IllegalStateException illegalstateexception;
        if (s1 != null)
        {
            try
            {
                if (u.f())
                {
                    u.h();
                    s = true;
                    j();
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        f();
        return;
        illegalstateexception;
        throw illegalstateexception;
    }

    public int q()
    {
        return e;
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as = new String[9];
        obj = "uW -lt";
        byte0 = -1;
        as1 = as;
        i1 = 0;
_L10:
        int j1;
        int k1;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L7:
        if (k1 <= j1)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "kW=-baW/+go]>2b\177W<qprS<*";
                i1 = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "uS#-vhU";
                i1 = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "p[=+bj_+:jgB\"?zc@a-wg@:~";
                i1 = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                as1 = as;
                obj = "kW=-baW/+go]>2b\177W<qqcA;3f";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "kW=-baW/+go]>2b\177W<qpr]>";
                byte0 = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                obj = "gG*7l";
                byte0 = 5;
                i1 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                as1 = as;
                obj = "kW=-baW/+go]>2b\177W<qlhW/,st]67noF7~";
                byte0 = 6;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "gG*7l";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                z = as;
                as = new String[11];
                obj = "Afc\027:3\002{";
                byte0 = 8;
                as1 = as;
                i1 = 0;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                obj = "Afc\027:3\002x";
                byte0 = 9;
                i1 = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                obj = "Afc\027:3\002{\031";
                byte0 = 10;
                i1 = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                obj = "Uu\006sJ5\001y";
                byte0 = 11;
                i1 = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "Uu\006sN?\003w";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Uq\006sJ3\006{";
                byte0 = 13;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                obj = "Ub\006sO1\000~";
                byte0 = 14;
                i1 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "Uq\006sQ?\005~";
                byte0 = 15;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Afc\027:3\002v";
                byte0 = 16;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "Uu\006sM6\006{";
                byte0 = 17;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "Uqcn7C";
                byte0 = 18;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 360
    //                   0 382
    //                   1 389
    //                   2 396
    //                   3 403;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_403;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 3;
_L8:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 6;
          goto _L8
_L3:
        byte1 = 50;
          goto _L8
_L4:
        byte1 = 78;
          goto _L8
        byte1 = 94;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        w = as;
    }
}
