// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import java.util.List;

// Referenced classes of package com.miteksystems.misnap:
//            d, e, f, MiSnapAPI, 
//            q, t, k, i, 
//            MitekAnalyzer, r, al, g, 
//            h

public class MiSnap extends Activity
{

    static int h = 599;
    static boolean i;
    static boolean q = false;
    static boolean s = false;
    static int v = -1;
    private OrientationEventListener A;
    private int B;
    private boolean C;
    private final android.content.DialogInterface.OnClickListener D = new e(this);
    private final android.content.DialogInterface.OnClickListener E = new f(this);
    private boolean F;
    MiSnapAPI a;
    k b;
    MitekAnalyzer c;
    al d;
    r e;
    i f;
    Object g;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    Context o;
    boolean p;
    protected int r;
    Camera t;
    int u;
    Handler w;
    boolean x;
    private android.widget.FrameLayout.LayoutParams y;
    private t z;

    public MiSnap()
    {
        b = null;
        e = null;
        f = null;
        g = new Object();
        p = false;
        A = null;
        r = 360;
        B = 0;
        C = false;
        u = 1;
        w = new d(this);
        F = false;
        x = false;
    }

    public static int a()
    {
        return v;
    }

    private Camera a(Context context)
    {
        int i1;
        i1 = 0;
        if (!context.getPackageManager().hasSystemFeature("android.hardware.camera"))
        {
            Log.e("MiSnapCamera", "No Camera");
            return null;
        }
        t = Camera.open();
        if (a.t() != 1) goto _L2; else goto _L1
_L1:
        context = new android.hardware.Camera.CameraInfo();
        Camera.getCameraInfo(0, context);
        v;
        JVM INSTR tableswitch 0 3: default 429
    //                   0 363
    //                   1 363
    //                   2 363
    //                   3 370;
           goto _L3 _L4 _L4 _L4 _L5
_L3:
        (new StringBuilder("rotation=")).append(v).toString();
        (new StringBuilder("device orientation=")).append(getResources().getConfiguration().orientation).toString();
        if (((android.hardware.Camera.CameraInfo) (context)).facing != 1) goto _L7; else goto _L6
_L6:
        i1 = (360 - (i1 + ((android.hardware.Camera.CameraInfo) (context)).orientation) % 360) % 360;
_L18:
        t.setDisplayOrientation(i1);
_L2:
        context = t.getParameters();
        k = context.getSupportedFocusModes().contains("auto");
        if (!k)
        {
            k = getPackageManager().hasSystemFeature("android.hardware.camera.autofocus");
        }
        if (j) goto _L9; else goto _L8
_L8:
        if (!k) goto _L11; else goto _L10
_L10:
        context = context.getSupportedPreviewSizes();
        if (context == null) goto _L9; else goto _L12
_L12:
        if (context.size() == 0) goto _L9; else goto _L13
_L13:
        Object obj = t;
        obj.getClass();
        obj = new android.hardware.Camera.Size(((Camera) (obj)), 1920, 1080);
        Object obj1 = t;
        obj1.getClass();
        obj1 = new android.hardware.Camera.Size(((Camera) (obj1)), 1280, 720);
        l = context.contains(obj);
        m = context.contains(obj1);
        n = false;
        a(false);
_L11:
        j = true;
_L9:
        if (!k) goto _L15; else goto _L14
_L14:
        if (l) goto _L17; else goto _L16
_L16:
        boolean flag = m;
        if (!flag) goto _L15; else goto _L17
_L17:
        return t;
_L4:
        i1 = 90;
          goto _L3
_L7:
        i1 = ((((android.hardware.Camera.CameraInfo) (context)).orientation - i1) + 360) % 360;
          goto _L18
_L15:
        a.a();
          goto _L17
_L5:
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                setRequestedOrientation(8);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MiSnapCamera", "Camera busy or not available");
            return null;
        }
        i1 = 270;
          goto _L3
    }

    private void a(View view)
    {
        if (view != null && view.getBackground() != null)
        {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 < ((ViewGroup)view).getChildCount()) goto _L4; else goto _L3
_L3:
        ((ViewGroup)view).removeAllViews();
_L2:
        return;
_L4:
        a(((ViewGroup)view).getChildAt(i1));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(MiSnap misnap)
    {
        boolean flag = true;
        SharedPreferences sharedpreferences = misnap.o.getSharedPreferences("MiSnapFileName", 0);
        if (sharedpreferences != null)
        {
            StringBuilder stringbuilder;
            boolean flag1;
            if (q.g)
            {
                i = false;
            } else
            {
                i = sharedpreferences.getBoolean("showAnimationNextTime", false);
            }
            stringbuilder = new StringBuilder("First Time user: ");
            if (i)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            stringbuilder.append(flag1).toString();
            misnap.o();
            misnap.j = sharedpreferences.getBoolean("cameraSupportCalculated", false);
            if (misnap.j)
            {
                misnap.k = sharedpreferences.getBoolean("supportsAutoFocus", false);
                misnap.l = sharedpreferences.getBoolean("supports1080p", false);
                misnap.m = sharedpreferences.getBoolean("supports720p", false);
                misnap.n = sharedpreferences.getBoolean("supportsVGA", false);
            }
        }
        if (i)
        {
            flag = false;
        }
        if (flag)
        {
            misnap.y = new android.widget.FrameLayout.LayoutParams(-2, -1);
            misnap.y.gravity = 17;
            misnap.setContentView(misnap.z, misnap.y);
            misnap.z.h();
            return;
        } else
        {
            misnap.u = 2;
            misnap.w.sendEmptyMessage(misnap.u);
            return;
        }
    }

    static void a(MiSnap misnap, int i1)
    {
        misnap.B = i1;
    }

    static void b(MiSnap misnap)
    {
        if (misnap.t == null)
        {
            misnap.t = misnap.a(misnap);
            if (misnap.t == null)
            {
                misnap.a(0, null, "CameraNotSufficient");
                return;
            }
        }
        if (misnap.z == null)
        {
            misnap.a(0, null, "VideoCaptureFailed");
            return;
        } else
        {
            misnap.b = new k(misnap, misnap.t, misnap.w);
            misnap.b.a(misnap.c);
            misnap.b.a(misnap.z);
            misnap.y = new android.widget.FrameLayout.LayoutParams(-2, -1);
            misnap.y.gravity = 17;
            misnap.setContentView(misnap.b, misnap.y);
            misnap.addContentView(misnap.z, misnap.y);
            misnap.b.b();
            return;
        }
    }

    static void b(MiSnap misnap, int i1)
    {
        char c1 = '\u0168';
        if ((misnap.f == null || !misnap.f.a()) && i1 != -1 && (340 > i1 || i1 >= 360) && (i1 < 0 || i1 > 20))
        {
            int j1 = c1;
            if (10 < i1)
            {
                j1 = c1;
                if (i1 < 176)
                {
                    j1 = 180;
                }
            }
            if (j1 != misnap.r)
            {
                misnap.r = j1;
                if (misnap.z != null)
                {
                    misnap.z.p();
                }
            }
        }
    }

    static t c(MiSnap misnap)
    {
        return misnap.z;
    }

    static int d(MiSnap misnap)
    {
        return misnap.B;
    }

    static void e(MiSnap misnap)
    {
        misnap.m();
    }

    private void m()
    {
        F = true;
        q = false;
        synchronized (g)
        {
            if (c != null)
            {
                c.b(d);
                c.b(z);
                c = null;
            }
            if (b != null)
            {
                b.k();
                b = null;
            }
            p();
            a(z);
            if (z != null)
            {
                z.q();
                z = null;
            }
            d = null;
        }
        a(findViewById(R.id.camera_surface_frame));
        if (e != null)
        {
            e.b();
        }
        System.gc();
    }

    private void n()
    {
        Intent intent = new Intent();
        a(R.string.uxp_cancel);
        if (b != null)
        {
            b.a(false);
            b.a();
            intent.putExtra("com.miteksystems.misnap.MIBI_DATA", b.h());
        }
        a(0, intent, "Cancelled");
    }

    private void o()
    {
        getClass().getName();
    }

    private void p()
    {
        if (A != null)
        {
            A.disable();
            A = null;
        }
    }

    final void a(int i1)
    {
        if (d != null)
        {
            d.a(getString(i1));
        }
    }

    final void a(int i1, int j1)
    {
        if (d != null)
        {
            d.a(getString(i1), j1);
        }
    }

    final void a(int i1, Intent intent, String s1)
    {
        if (C)
        {
            return;
        }
        (new StringBuilder("exitApp called with code=")).append(i1).toString();
        o();
        C = true;
        Intent intent1 = intent;
        if (intent == null)
        {
            intent1 = new Intent();
        }
        intent1.putExtra("com.miteksystems.misnap.ResultCode", s1);
        setResult(i1, intent1);
        finish();
        w.postAtFrontOfQueue(new g(this));
    }

    final void a(boolean flag)
    {
        SharedPreferences sharedpreferences = o.getSharedPreferences("MiSnapFileName", 0);
        if (sharedpreferences != null)
        {
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            if (sharedpreferences != null)
            {
                if (flag)
                {
                    editor.putBoolean("showAnimationNextTime", true);
                }
                if (j)
                {
                    editor.putBoolean("cameraSupportCalculated", true);
                    editor.putBoolean("supportsAutoFocus", k);
                    editor.putBoolean("supports1080p", l);
                    editor.putBoolean("supports720p", m);
                    editor.putBoolean("supportsVGA", n);
                }
                editor.commit();
            }
        }
    }

    final int b()
    {
        return u;
    }

    final void c()
    {
        u = 10;
    }

    protected final void d()
    {
        t = a(this);
        if (t == null)
        {
            a(0, null, "CameraNotSufficient");
        }
        c = new MitekAnalyzer(a.j(), a.i(), a.g(), a.h(), a.s(), a.n());
        z = new t(this, w, e, f, '\0');
        z.a(a.m());
        d = new al(this, w, '\0');
        c.a(z);
        c.a(d);
        u = 19;
        w.sendEmptyMessage(u);
    }

    final int e()
    {
        if (a.b())
        {
            return a.F();
        } else
        {
            return a.G();
        }
    }

    final boolean f()
    {
        return F;
    }

    final void g()
    {
        if (b != null)
        {
            b.k();
            b = null;
            t = null;
        }
    }

    final void h()
    {
        B = 0;
    }

    final void i()
    {
        a.a();
        a(R.string.uxp_start_still_camera);
        u = 2;
        w.sendEmptyMessage(u);
    }

    final float j()
    {
        return (float)r;
    }

    final boolean k()
    {
        return r == 360;
    }

    public final void l()
    {
        p();
    }

    public void onBackPressed()
    {
        n();
    }

    public void onCancelButton(View view)
    {
        o();
        n();
    }

    public void onCaptureButton(View view)
    {
        o();
        z.e.setClickable(false);
        b.j();
        if (z != null)
        {
            z.f.setClickable(false);
            z.g.setClickable(false);
            z.d.setClickable(false);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        v = getWindowManager().getDefaultDisplay().getRotation();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            getWindow().setFlags(8192, 8192);
        }
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            setRequestedOrientation(0);
        }
        o = this;
        a = new MiSnapAPI(getIntent());
        if (a.t() == 0)
        {
            A = new h(this, this);
            A.enable();
        }
        f = new i(this);
        if (f != null)
        {
            e = new r(this, a, f.a());
        }
        getWindow().setFlags(1024, 1024);
        requestWindowFeature(1);
        w.sendEmptyMessage(1);
    }

    public void onDestroy()
    {
        super.onDestroy();
        m();
        u = 1;
    }

    public void onFlashToggle(View view)
    {
        boolean flag = true;
        p = true;
        if (x)
        {
            flag = false;
        }
        x = flag;
        b.b(x);
        int i1;
        if (x)
        {
            i1 = R.string.uxp_flash_on;
        } else
        {
            i1 = R.string.uxp_flash_off;
        }
        a(i1);
        if (x)
        {
            i1 = R.drawable.icon_flash_on;
        } else
        {
            i1 = R.drawable.icon_flash_off;
        }
        ((ImageButton)view).setImageResource(i1);
        if (z != null)
        {
            z.postInvalidate();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        if (hasWindowFocus())
        {
            (new StringBuilder("onPause(): focus status: ")).append(hasWindowFocus()).toString();
            if (!"CREDIT_CARD".equals(a.n()))
            {
                n();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 1 1: default 24
    //                   1 26;
           goto _L1 _L2
_L1:
        return false;
_L2:
        if (a.b() && z != null && !z.f() && !z.a())
        {
            w.sendEmptyMessage(11);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
