// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Vibrator;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.fieldstats.a1;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            sx, abt, App, a1g, 
//            up, jv, aum, aox, 
//            Voip, au2, dx, akr, 
//            po, fm, ft, pr, 
//            dt

public class ak8
{

    private static int e;
    private static int g;
    private static int k;
    private static Boolean m;
    private static SoundPool n;
    private static final String z[];
    private dx a;
    private long b;
    private long c;
    private pr d;
    private float f;
    private String h;
    private int i;
    private int j;
    private Runnable l;
    private Activity o;
    private Handler p;
    private android.media.AudioManager.OnAudioFocusChangeListener q;
    private int r;
    private android.os.PowerManager.WakeLock s;
    private fm t;
    private Toast u;
    private TextView v;

    public ak8(Activity activity, dx dx1)
    {
        p = new sx(this);
        l = new abt(this);
        o = activity;
        a = dx1;
        v = (TextView)o.findViewById(0x7f0b016d);
        s = ((PowerManager)activity.getSystemService(z[8])).newWakeLock(6, z[9]);
        if (n == null)
        {
            n = new SoundPool(1, 1, 0);
            g = n.load(App.au, 0x7f060006, 0);
            k = n.load(App.au, 0x7f060007, 0);
            e = n.load(App.au, 0x7f060005, 0);
        }
        dx1 = (TextView)o.findViewById(0x7f0b0168);
        View view = o.findViewById(0x7f0b0165);
        activity = (TextView)o.findViewById(0x7f0b016f);
        float f1 = a1g.a().g;
        float f2 = a1g.a().g;
        int i1;
        if (f1 >= 2.0F)
        {
            i1 = 40;
        } else
        {
            i1 = 16;
        }
        i1 = (int)((float)i1 * f2);
        view.setOnTouchListener(new up(this, dx1, activity, i1, view));
        dx1 = o.findViewById(0x7f0b016e);
        dx1.getViewTreeObserver().addOnPreDrawListener(new jv(this, dx1, i1, activity));
        ((ViewGroup)o.findViewById(0x7f0b0149)).addView(new VoiceNoteRecordingUi._cls4(this, o), -1, -1);
    }

    static float a(ak8 ak8_1, float f1)
    {
        ak8_1.f = f1;
        return f1;
    }

    static long a(ak8 ak8_1, long l1)
    {
        ak8_1.b = l1;
        return l1;
    }

    public static Animation a(boolean flag)
    {
        AnimationSet animationset = new AnimationSet(true);
        Object obj;
        if (flag)
        {
            obj = new AlphaAnimation(0.0F, 1.0F);
        } else
        {
            obj = new AlphaAnimation(1.0F, 0.0F);
        }
        ((Animation) (obj)).setDuration(150L);
        animationset.addAnimation(((Animation) (obj)));
        if (flag)
        {
            obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        } else
        {
            obj = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.5F, 1, 0.5F);
        }
        ((ScaleAnimation) (obj)).setDuration(150L);
        animationset.addAnimation(((Animation) (obj)));
        animationset.setDuration(150L);
        return animationset;
    }

    static pr a(ak8 ak8_1, pr pr1)
    {
        ak8_1.d = pr1;
        return pr1;
    }

    static String a(ak8 ak8_1)
    {
        return ak8_1.h;
    }

    static Activity b(ak8 ak8_1)
    {
        return ak8_1.o;
    }

    static Handler c(ak8 ak8_1)
    {
        return ak8_1.p;
    }

    static TextView d(ak8 ak8_1)
    {
        return ak8_1.v;
    }

    private void d()
    {
        if (android.os.Build.VERSION.SDK_INT > 7)
        {
            ((AudioManager)o.getSystemService(z[10])).requestAudioFocus(h(), 3, 2);
        }
    }

    static SoundPool e()
    {
        return n;
    }

    static pr e(ak8 ak8_1)
    {
        return ak8_1.d;
    }

    static int f(ak8 ak8_1)
    {
        return ak8_1.j;
    }

    private void f()
    {
        o.findViewById(0x7f0b016c).setVisibility(4);
        View view = o.findViewById(0x7f0b0172);
        view.setVisibility(0);
        Object obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        ((Animation) (obj)).setDuration(200L);
        ((Animation) (obj)).setStartOffset(600L);
        ((Animation) (obj)).setFillBefore(true);
        view.startAnimation(((Animation) (obj)));
        obj = o.findViewById(0x7f0b0171);
        ((View) (obj)).setVisibility(0);
        AnimationSet animationset = new AnimationSet(true);
        animationset.setInterpolator(new DecelerateInterpolator(1.1F));
        Object obj1 = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -3F);
        ((Animation) (obj1)).setDuration(600L);
        ((Animation) (obj1)).setRepeatMode(2);
        ((Animation) (obj1)).setRepeatCount(1);
        Object obj2 = new RotateAnimation(0.0F, 360F, 1, 0.5F, 1, 0.5F);
        ((Animation) (obj2)).setDuration(600L);
        Object obj3 = new ScaleAnimation(1.0F, 0.9F, 1.0F, 0.95F, 1, 0.5F, 1, 0.5F);
        ((Animation) (obj3)).setDuration(1200L);
        animationset.addAnimation(((Animation) (obj3)));
        animationset.addAnimation(((Animation) (obj2)));
        animationset.addAnimation(((Animation) (obj1)));
        obj1 = o.findViewById(0x7f0b0173);
        obj2 = new AnimationSet(true);
        obj3 = new TranslateAnimation(1, 0.0F, 1, -0.3F, 1, 0.0F, 1, 0.0F);
        ((Animation) (obj3)).setDuration(150L);
        ((Animation) (obj3)).setStartOffset(700L);
        ((Animation) (obj3)).setFillAfter(true);
        RotateAnimation rotateanimation = new RotateAnimation(0.0F, -60F, 1, 0.5F, 1, 0.5F);
        rotateanimation.setDuration(150L);
        rotateanimation.setStartOffset(700L);
        rotateanimation.setFillAfter(true);
        ((AnimationSet) (obj2)).addAnimation(rotateanimation);
        ((AnimationSet) (obj2)).addAnimation(((Animation) (obj3)));
        ((AnimationSet) (obj2)).setFillAfter(true);
        ((View) (obj1)).startAnimation(((Animation) (obj2)));
        obj2 = o.findViewById(0x7f0b0167);
        if (obj2 != null)
        {
            ((View) (obj2)).setVisibility(4);
        }
        ((View) (obj)).startAnimation(animationset);
        animationset.setAnimationListener(new aum(this, ((View) (obj)), ((View) (obj1)), view));
    }

    static float g(ak8 ak8_1)
    {
        return ak8_1.f;
    }

    private void g()
    {
        if (android.os.Build.VERSION.SDK_INT > 7)
        {
            ((AudioManager)o.getSystemService(z[7])).abandonAudioFocus(h());
        }
    }

    private android.media.AudioManager.OnAudioFocusChangeListener h()
    {
        if (q == null)
        {
            q = new aox(this);
        }
        return q;
    }

    static fm h(ak8 ak8_1)
    {
        return ak8_1.t;
    }

    static dx i(ak8 ak8_1)
    {
        return ak8_1.a;
    }

    static long j(ak8 ak8_1)
    {
        return ak8_1.b;
    }

    public void a(int i1)
    {
        r = i1;
    }

    public void a(String s1)
    {
        h = s1;
    }

    public boolean a()
    {
        return t != null;
    }

    public void b()
    {
        int i1;
        int j1;
        i1 = App.am;
        try
        {
            if (Voip.h())
            {
                App.b(o, 0x7f0e016d, 0);
                return;
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            throw settingnotfoundexception;
        }
        Log.i(z[1]);
        String s1 = Environment.getExternalStorageState();
        try
        {
            if (!s1.equals(z[0]))
            {
                o.showDialog(15);
                return;
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception1)
        {
            throw settingnotfoundexception1;
        }
        try
        {
            if (App.A() < (long)(au2.q * 1024 * 1024))
            {
                a.a(0x7f0e015f);
                return;
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception2)
        {
            throw settingnotfoundexception2;
        }
        try
        {
            if (App.C(h))
            {
                o.showDialog(106);
                return;
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception3)
        {
            throw settingnotfoundexception3;
        }
        try
        {
            if (t != null)
            {
                Log.e(z[2]);
                return;
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception4)
        {
            throw settingnotfoundexception4;
        }
        akr.t();
        j1 = o.getWindowManager().getDefaultDisplay().getOrientation();
        int k1 = o.getResources().getConfiguration().orientation;
        k1;
        JVM INSTR tableswitch 1 2: default 200
    //                   1 726
    //                   2 764;
           goto _L1 _L2 _L3
_L1:
        Object obj;
label0:
        {
            s.acquire();
            d();
            i();
            float f1;
            Object obj1;
            AlphaAnimation alphaanimation;
            boolean flag;
            try
            {
                if (android.provider.Settings.System.getInt(o.getContentResolver(), z[3]) != 0)
                {
                    ((Vibrator)o.getSystemService(z[5])).vibrate(75L);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.a(z[6], ((Throwable) (obj)));
            }
            j = n.play(g, 1.0F, 1.0F, 0, 0, 1.0F);
            v.setText(DateUtils.formatElapsedTime(0L));
            f = 1.0F;
            obj = o.findViewById(0x7f0b016c);
            ((View) (obj)).setVisibility(0);
            obj1 = new AlphaAnimation(0.0F, 1.0F);
            ((Animation) (obj1)).setInterpolator(new po(this));
            ((Animation) (obj1)).setDuration(500L);
            ((Animation) (obj1)).setRepeatMode(2);
            ((Animation) (obj1)).setRepeatCount(-1);
            ((View) (obj)).startAnimation(((Animation) (obj1)));
            obj = new AnimationSet(true);
            try
            {
                flag = App.aR();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                i1 = 2;
            } else
            {
                i1 = -2;
            }
            f1 = i1;
            if (App.aR())
            {
                i1 = -1;
            } else
            {
                i1 = 1;
            }
            obj1 = new TranslateAnimation(1, f1, 1, i1, 1, 0.0F, 1, 0.0F);
            ((Animation) (obj1)).setDuration(1600L);
            ((Animation) (obj1)).setRepeatCount(-1);
            alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setDuration(1600L);
            alphaanimation.setRepeatCount(-1);
            ((AnimationSet) (obj)).addAnimation(((Animation) (obj1)));
            ((AnimationSet) (obj)).addAnimation(alphaanimation);
            ((AnimationSet) (obj)).setDuration(1600L);
            ((AnimationSet) (obj)).setRepeatCount(-1);
            ((AnimationSet) (obj)).setInterpolator(new DecelerateInterpolator());
            o.findViewById(0x7f0b0170).startAnimation(((Animation) (obj)));
            obj = o.findViewById(0x7f0b016a);
            try
            {
                ((View) (obj)).setVisibility(0);
                ((View) (obj)).setClickable(true);
                flag = App.aR();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = -1;
            }
            obj1 = new TranslateAnimation(1, i1, 1, 0.0F, 1, 0.0F, 1, 0.0F);
            ((Animation) (obj1)).setDuration(150L);
            ((View) (obj)).startAnimation(((Animation) (obj1)));
            obj = o.findViewById(0x7f0b0163);
            obj1 = new AlphaAnimation(1.0F, 0.0F);
            ((Animation) (obj1)).setDuration(150L);
            ((Animation) (obj1)).setFillAfter(true);
            ((View) (obj)).startAnimation(((Animation) (obj1)));
            o.findViewById(0x7f0b0149).setVisibility(0);
            obj = App.a(c1.b(2), (byte)2, 1, true);
            try
            {
                if (m != null)
                {
                    break label0;
                }
                m = Boolean.FALSE;
                i1 = App.l;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (i1 != 3);
        }
        obj1 = ((File) (obj)).getAbsolutePath();
        if (!m.booleanValue()) goto _L5; else goto _L4
_L4:
        obj = z[4];
_L10:
        t = fm.a(((String) (obj1)), ((String) (obj)));
        b = System.currentTimeMillis();
        long l1;
        try
        {
            t.f();
        }
        catch (Exception exception)
        {
            b(false);
            a.a(0x7f0e0168);
        }
        try
        {
            v.removeCallbacks(l);
            obj = v;
            obj1 = l;
            i1 = android.os.Build.VERSION.SDK_INT;
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception5)
        {
            throw settingnotfoundexception5;
        }
        if (i1 >= 16)
        {
            l1 = 340L;
        } else
        {
            l1 = 160L;
        }
        ((TextView) (obj)).postDelayed(((Runnable) (obj1)), l1);
        return;
_L2:
        if (j1 != 0 && j1 != 1) goto _L7; else goto _L6
_L6:
        o.setRequestedOrientation(1);
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        o.setRequestedOrientation(9);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        if (j1 != 0 && j1 != 1) goto _L9; else goto _L8
_L8:
        o.setRequestedOrientation(0);
        if (i1 == 0) goto _L1; else goto _L9
_L9:
        try
        {
            o.setRequestedOrientation(8);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
          goto _L1
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
_L5:
        obj = "";
          goto _L10
    }

    public void b(boolean flag)
    {
        int j1 = App.am;
        i();
        if (t == null) goto _L2; else goto _L1
_L1:
        String s1 = h;
        if (s1 != null) goto _L3; else goto _L2
_L2:
        return;
        Exception exception;
        exception;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
_L3:
        long l2;
        Log.i((new StringBuilder()).append(z[12]).append(flag).toString());
        App.x(h);
        o.findViewById(0x7f0b0149).setVisibility(8);
        Object obj = o.findViewById(0x7f0b016a);
        Object obj2;
        int ai[];
        View view;
        int i1;
        int k1;
        int l1;
        int i2;
        boolean flag1;
        try
        {
            ((View) (obj)).setVisibility(8);
            flag1 = App.aR();
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        obj2 = new TranslateAnimation(1, 0.0F, 1, i1, 1, 0.0F, 1, 0.0F);
        ((Animation) (obj2)).setDuration(150L);
        ((View) (obj)).startAnimation(((Animation) (obj2)));
        obj = o.findViewById(0x7f0b0163);
        try
        {
            flag1 = App.aR();
        }
        catch (Exception exception3)
        {
            throw exception3;
        }
        if (flag1)
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        obj2 = new TranslateAnimation(1, i1, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        ((Animation) (obj2)).setDuration(150L);
        ((View) (obj)).startAnimation(((Animation) (obj2)));
        obj = o.findViewById(0x7f0b016c);
        ((View) (obj)).clearAnimation();
        ((ImageView)obj).getDrawable().setAlpha(255);
        o.findViewById(0x7f0b0170).clearAnimation();
        l2 = System.currentTimeMillis() - b;
        Log.i((new StringBuilder()).append(z[15]).append(l2).toString());
        Exception exception4;
        if (!flag && l2 >= 1000L)
        {
            try
            {
                f();
            }
            catch (Exception exception5)
            {
                throw exception5;
            }
        }
        obj = t.c();
        t.a();
_L7:
        Exception exception6;
        Exception exception12;
        try
        {
            t.b();
        }
        catch (Exception exception13)
        {
            Log.a(z[13], exception13);
        }
        try
        {
            t = null;
            o.setRequestedOrientation(-1);
            g();
            if (s.isHeld())
            {
                s.release();
            }
        }
        catch (Exception exception7)
        {
            throw exception7;
        }
        try
        {
            if (android.provider.Settings.System.getInt(o.getContentResolver(), z[16]) != 0)
            {
                ((Vibrator)o.getSystemService(z[18])).vibrate(75L);
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception1)
        {
            Log.a(z[14], settingnotfoundexception1);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_809;
        }
        if (l2 < 1000L)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        try
        {
            Thread.sleep(50L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            throw settingnotfoundexception;
        }
        n.play(k, 1.0F, 1.0F, 0, 0, 1.0F);
        ft.a(o, a1.SENT, ((File) (obj)).length());
        i = 0;
        obj2 = d;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        d.e().H = (int)(l2 / 1000L);
        d.b(true);
        d = null;
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            c1.a(App.au, h, ((File) (obj)), (byte)2, 1, true);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            Log.a(filenotfoundexception);
        }
        catch (IOException ioexception)
        {
            Log.a(ioexception);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        ((File) (obj)).delete();
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
label0:
        {
label1:
            {
                Object obj1;
                try
                {
                    if (d != null)
                    {
                        d.b(false);
                        d = null;
                    }
                }
                catch (Exception exception8)
                {
                    throw exception8;
                }
                n.play(e, 1.0F, 1.0F, 0, 0, 1.0F);
                ft.a(o, a1.TOO_SHORT, ((File) (obj)).length());
                ((File) (obj)).delete();
                obj2 = new TextView(o);
                i = i + 1;
                ((TextView) (obj2)).setText(0x7f0e0058);
                ((TextView) (obj2)).setTextColor(-1);
                ((TextView) (obj2)).setBackgroundDrawable(new m(o.getResources().getDrawable(0x7f020602)));
                ai = new int[2];
                view = o.findViewById(0x7f0b0165);
                view.getLocationOnScreen(ai);
                i1 = o.getWindow().getDecorView().getHeight() - ai[1];
                try
                {
                    if (System.currentTimeMillis() - c <= 3500L)
                    {
                        break label0;
                    }
                    c = System.currentTimeMillis();
                    u = new Toast(o.getApplicationContext());
                    flag = App.aR();
                }
                catch (Exception exception9)
                {
                    throw exception9;
                }
                if (flag)
                {
                    k1 = o.getWindow().getDecorView().getWidth();
                    l1 = ai[0];
                    i2 = view.getWidth();
                    u.setGravity(85, k1 - l1 - i2, i1);
                    if (j1 == 0)
                    {
                        break label1;
                    }
                }
                k1 = ai[0];
                u.setGravity(83, k1, i1);
            }
            u.setDuration(1);
            u.setView(((View) (obj2)));
            u.show();
        }
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (d != null)
            {
                d.b(false);
                d = null;
            }
        }
        catch (Exception exception10)
        {
            throw exception10;
        }
        if (obj != null)
        {
            try
            {
                if (((File) (obj)).length() > 0L)
                {
                    ft.a(o, a1.CANCELLED, ((File) (obj)).length());
                }
            }
            catch (Exception exception11)
            {
                throw exception11;
            }
            ((File) (obj)).delete();
        }
        if (r == 0) goto _L2; else goto _L4
_L4:
        i1 = r;
        v.postDelayed(new dt(this, i1), 2000L);
        r = 0;
        return;
        exception4;
        throw exception4;
        exception12;
        if (!flag || l2 < 1000L) goto _L6; else goto _L5
_L5:
        Log.a(z[17], exception12);
        if (j1 == 0) goto _L7; else goto _L6
_L6:
        try
        {
            Log.i((new StringBuilder()).append(z[11]).append(exception12.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception6)
        {
            throw exception6;
        }
          goto _L7
        exception6;
        throw exception6;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
    }

    public void c()
    {
    }

    public void i()
    {
        if (u != null)
        {
            u.cancel();
            u = null;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[19];
        obj = "PJ\006g1XA";
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
                obj = "KJ\032j SJ\007ljNQ\022{1KJ\032j SJ\007l";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "KJ\032j SJ\007ljNQ\022{1KJ\032j SJ\007ljTK\003{*ZW\026z6";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "UD\003},^z\025l YG\022j.b@\035h'Q@\027";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "\\P\027`*\022J\024n~\035F\034m ^VNf5HV";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "KL\021{$IJ\001";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "KJ\032j SJ\007ljNQ\022{1KJ\032j SJ\007l";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\\P\027`*";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "MJ\004l7";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                obj = "KJ\032j SJ\007l";
                byte0 = 8;
                i1 = 9;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\\P\027`*";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026&6IJ\003)";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026)";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026&7XI\026h6X";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026)!HW\022},RKI";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "UD\003},^z\025l YG\022j.b@\035h'Q@\027";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "KJ\032j SJ\007ljNQ\034y3RL\020l+RQ\026&6IJ\003)";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "KL\021{$IJ\001";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 500
    //                   0 523
    //                   1 530
    //                   2 537
    //                   3 544;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_544;
_L3:
        byte byte1 = 69;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 61;
          goto _L9
_L5:
        byte1 = 37;
          goto _L9
_L6:
        byte1 = 115;
          goto _L9
        byte1 = 9;
          goto _L9
    }
}
