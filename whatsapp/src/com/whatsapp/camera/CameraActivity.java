// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.ContactPicker;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.Main;
import com.whatsapp.PhotoView;
import com.whatsapp.VideoView;
import com.whatsapp.aka;
import com.whatsapp.aoz;
import com.whatsapp.au2;
import com.whatsapp.cq;
import com.whatsapp.iz;
import com.whatsapp.k;
import com.whatsapp.og;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import com.whatsapp.util.aj;
import com.whatsapp.util.c;
import com.whatsapp.util.c1;
import java.io.File;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.whatsapp.camera:
//            y, c, al, j, 
//            a1, a8, CameraView, as, 
//            ak, x, l, m, 
//            t, CameraLayout, k, AutofocusOverlay, 
//            ZoomOverlay, ShutterOverlay, af, p, 
//            ao, ad, q, n, 
//            z, g, d, f

public class CameraActivity extends DialogToastActivity
{

    private static final String O[];
    public static int n;
    private ViewGroup A;
    private cq B;
    private PhotoView C;
    private CameraView D;
    private View E;
    private int F;
    private AutofocusOverlay G;
    private View H;
    private ImageView I;
    private ImageButton J;
    private og K;
    private ConversationTextEntry L;
    private Rect M;
    private TextView N;
    private View j;
    private ShutterOverlay k;
    private ZoomOverlay l;
    private View m;
    private boolean o;
    private File p;
    private View q;
    private File r;
    private long s;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener t;
    private ProgressBar u;
    private Uri v;
    private TextView w;
    private Handler x;
    private ImageButton y;
    private View z;

    public CameraActivity()
    {
        o = true;
        x = new y(this);
        t = new com.whatsapp.camera.c(this);
    }

    static int a(CameraActivity cameraactivity, int i1)
    {
        cameraactivity.F = i1;
        return i1;
    }

    static ZoomOverlay a(CameraActivity cameraactivity)
    {
        return cameraactivity.l;
    }

    private void a()
    {
label0:
        {
            Log.i(O[12]);
            if (K == null)
            {
                w.setText(0x7f0e0077);
            }
            I.setImageResource(0x7f0200e7);
            q.setVisibility(0);
            H.setVisibility(8);
            m.setVisibility(8);
            E.setVisibility(8);
            A.addView(D, 0);
            I.setEnabled(true);
            z.setEnabled(true);
            y.setEnabled(true);
            N.setVisibility(8);
            u.setVisibility(8);
            j.setVisibility(8);
            if (android.os.Build.VERSION.SDK_INT < 9 || Camera.getNumberOfCameras() <= 1)
            {
                z.setVisibility(8);
                if (n == 0)
                {
                    break label0;
                }
            }
            z.setVisibility(0);
        }
        y.setVisibility(0);
        j.setVisibility(8);
        ((VideoView)findViewById(0x7f0b00e9)).setVisibility(8);
        if (r != null)
        {
            r.delete();
            r = null;
        }
        if (p != null)
        {
            p.delete();
            p = null;
        }
        F = 0;
        M = null;
        C.setRotation(0.0F, false);
    }

    private void a(Uri uri)
    {
        Object obj;
        try
        {
            Log.i(O[36]);
            if (K == null)
            {
                w.setText(0x7f0e0075);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            throw uri;
        }
        v = uri;
        p = new File(uri.getPath());
        obj = c1.d(uri);
_L1:
        OutOfMemoryError outofmemoryerror;
        if (obj == null)
        {
            try
            {
                Log.e(O[37]);
                App.b(this, 0x7f0e0074, 1);
                finish();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                throw uri;
            }
        }
        A.removeView(D);
        H.setVisibility(0);
        m.setVisibility(0);
        E.setVisibility(0);
        q.setVisibility(8);
        findViewById(0x7f0b00e8).setVisibility(8);
        C.setVisibility(0);
        C.b(true);
        C.a(((android.graphics.Bitmap) (obj)));
        m.setOnClickListener(new al(this, uri));
        E.setOnClickListener(new j(this));
        findViewById(0x7f0b00f1).setOnClickListener(new a1(this, uri));
        findViewById(0x7f0b00f2).setOnClickListener(new a8(this));
        return;
        outofmemoryerror;
_L2:
        Log.a(O[35], outofmemoryerror);
        App.b(this, 0x7f0e0074, 1);
        finish();
        outofmemoryerror = null;
          goto _L1
        outofmemoryerror;
          goto _L2
        outofmemoryerror;
          goto _L2
    }

    static void a(CameraActivity cameraactivity, Uri uri)
    {
        cameraactivity.a(uri);
    }

    static void a(CameraActivity cameraactivity, String s1)
    {
        cameraactivity.a(s1);
    }

    static void a(CameraActivity cameraactivity, boolean flag)
    {
        cameraactivity.a(flag);
    }

    static void a(CameraActivity cameraactivity, boolean flag, View view)
    {
        cameraactivity.a(flag, view);
    }

    private void a(String s1)
    {
label0:
        {
            int i1 = n;
            if (O[3].equals(s1))
            {
                y.setImageResource(0x7f0200c9);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            if (O[4].equals(s1))
            {
                y.setImageResource(0x7f0200ca);
                if (i1 == 0)
                {
                    break label0;
                }
            }
            y.setImageResource(0x7f0200c8);
        }
    }

    private void a(boolean flag)
    {
        int i1;
        i1 = n;
        Log.i((new StringBuilder()).append(O[21]).append(flag).toString());
        D.m();
        setRequestedOrientation(-1);
        Object obj;
        try
        {
            if (android.provider.Settings.System.getInt(getContentResolver(), O[19]) != 0)
            {
                ((Vibrator)getSystemService(O[17])).vibrate(75L);
            }
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            Log.a(O[18], settingnotfoundexception);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        flag = o;
        if (!flag) goto _L4; else goto _L3
_L3:
        f();
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        try
        {
            obj = K;
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
        if (obj == null) goto _L7; else goto _L6
_L6:
        c1.a(this, K.a, r, (byte)3, false);
_L9:
        c1.a(this, Uri.fromFile(r));
        finish();
        if (i1 == 0) goto _L5; else goto _L7
_L7:
        obj = new Intent(getBaseContext(), com/whatsapp/ContactPicker);
        Object obj1;
        String s1;
        try
        {
            ((Intent) (obj)).setType(O[16]);
            ((Intent) (obj)).putExtra(O[22], Uri.fromFile(r));
            ((Intent) (obj)).putExtra(O[14], true);
            startActivity(((Intent) (obj)));
            c1.a(this, Uri.fromFile(r));
            finish();
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception1)
        {
            throw settingnotfoundexception1;
        }
        if (i1 == 0) goto _L5; else goto _L2
_L2:
        r.delete();
        finish();
_L5:
        return;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        s1 = ((IOException) (obj1)).getMessage();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        flag = ((IOException) (obj1)).getMessage().contains(O[20]);
        if (flag)
        {
            try
            {
                App.a(this, getString(0x7f0e015f));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw obj1;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_322;
            }
        }
        App.b(getBaseContext(), 0x7f0e03d4, 0);
        Log.e((new StringBuilder()).append(O[15]).append(((IOException) (obj1)).toString()).toString());
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        throw obj1;
        obj1;
        throw obj1;
    }

    private void a(boolean flag, View view)
    {
label0:
        {
            if (flag && view.getVisibility() != 0)
            {
                view.setVisibility(0);
                AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                alphaanimation.setDuration(300L);
                view.startAnimation(alphaanimation);
                if (n == 0)
                {
                    break label0;
                }
            }
            if (!flag && view.getVisibility() != 8)
            {
                view.setVisibility(8);
                AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
                alphaanimation1.setDuration(300L);
                view.startAnimation(alphaanimation1);
            }
        }
    }

    static PhotoView b(CameraActivity cameraactivity)
    {
        return cameraactivity.C;
    }

    private void b()
    {
label0:
        {
            List list = D.b();
            if (list == null || list.size() <= 1)
            {
                y.setVisibility(8);
                if (n == 0)
                {
                    break label0;
                }
            }
            y.setVisibility(0);
            a(D.n());
        }
    }

    static View c(CameraActivity cameraactivity)
    {
        return cameraactivity.j;
    }

    static cq d(CameraActivity cameraactivity)
    {
        return cameraactivity.B;
    }

    private void d()
    {
        int i1;
        int j1;
        i1 = n;
        Log.i(O[34]);
        r = c1.a(this, (byte)3, O[33]);
        j1 = getWindowManager().getDefaultDisplay().getOrientation();
        getResources().getConfiguration().orientation;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 181
    //                   2 209;
           goto _L1 _L2 _L3
_L1:
        D.setKeepScreenOn(true);
        D.a(r);
        x.sendEmptyMessage(0);
        N.setVisibility(0);
        u.setVisibility(0);
        if (!o)
        {
            j.setVisibility(0);
        }
        z.setVisibility(8);
        y.setVisibility(8);
        s = System.currentTimeMillis();
        if (o && K == null)
        {
            w.setText("");
        }
        return;
_L2:
        if (j1 == 0 || j1 == 1)
        {
            setRequestedOrientation(1);
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        setRequestedOrientation(9);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (j1 == 0 || j1 == 1)
        {
            setRequestedOrientation(0);
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        setRequestedOrientation(8);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private Intent e()
    {
        Intent intent = new Intent(this, com/whatsapp/camera/CameraActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x4000000);
        intent.addFlags(0x800000);
        intent.addFlags(0x40000000);
        Intent intent1 = new Intent();
        intent1.putExtra(O[25], intent);
        intent1.putExtra(O[26], getString(0x7f0e0076));
        intent1.putExtra(O[24], android.content.Intent.ShortcutIconResource.fromContext(this, 0x7f020594));
        return intent1;
    }

    static Rect e(CameraActivity cameraactivity)
    {
        return cameraactivity.M;
    }

    private void f()
    {
        Object obj;
        long l1;
        long l2;
        View view;
        Object obj2;
        Object obj3;
        TextView textview;
        TextView textview1;
        long l3;
        try
        {
            Log.i(O[2]);
            if (K == null)
            {
                w.setText(0x7f0e0078);
            }
        }
        catch (Exception exception)
        {
            throw exception;
        }
        A.removeView(D);
        q.setVisibility(8);
        H.setVisibility(0);
        m.setVisibility(8);
        E.setVisibility(8);
        C.setVisibility(8);
        view = findViewById(0x7f0b00e8);
        view.setVisibility(0);
        obj2 = (VideoView)findViewById(0x7f0b00e9);
        ((VideoView) (obj2)).setVisibility(0);
        ((VideoView) (obj2)).setVideoPath(r.getAbsolutePath());
        ((VideoView) (obj2)).requestFocus();
        ((VideoView) (obj2)).seekTo(1);
        l3 = System.currentTimeMillis() - s;
        obj3 = new MediaMetadataRetriever();
        l1 = l3;
        l2 = l3;
        ((MediaMetadataRetriever) (obj3)).setDataSource(r.getAbsolutePath());
        l1 = l3;
        l2 = l3;
        l3 = Long.parseLong(((MediaMetadataRetriever) (obj3)).extractMetadata(9));
        l1 = l3;
        l2 = l3;
        obj = ((MediaMetadataRetriever) (obj3)).getFrameAtTime(0L);
        l1 = l3;
_L1:
        Object obj1;
        if (obj != null)
        {
            try
            {
                ((VideoView) (obj2)).setBackgroundDrawable(new BitmapDrawable(getResources(), ((android.graphics.Bitmap) (obj))));
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
        }
        ((MediaMetadataRetriever) (obj3)).release();
        obj = findViewById(0x7f0b00ea);
        findViewById(0x7f0b00f1).setOnClickListener(new as(this));
        findViewById(0x7f0b00f2).setOnClickListener(new ak(this));
        obj3 = (SeekBar)findViewById(0x7f0b00ed);
        ((SeekBar) (obj3)).setProgress(0);
        ((SeekBar) (obj3)).setMax((int)l1);
        ((SeekBar) (obj3)).setVisibility(0);
        textview = (TextView)findViewById(0x7f0b00ec);
        textview1 = (TextView)findViewById(0x7f0b00ee);
        textview.setText(DateUtils.formatElapsedTime(0L));
        textview1.setText(DateUtils.formatElapsedTime(l1 / 1000L));
        ((SeekBar) (obj3)).setOnSeekBarChangeListener(new x(this, ((VideoView) (obj2)), textview));
        obj2 = new l(this, ((VideoView) (obj2)), ((View) (obj)), new m(this, ((VideoView) (obj2)), ((SeekBar) (obj3)), ((View) (obj))));
        view.setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        ((View) (obj)).setOnClickListener(((android.view.View.OnClickListener) (obj2)));
        return;
        obj1;
        Log.e((new StringBuilder()).append(O[0]).append(((Exception) (obj1)).toString()).toString());
        obj1 = c1.b(r.getAbsolutePath());
          goto _L1
        obj1;
        Log.e((new StringBuilder()).append(O[1]).append(((NoSuchMethodError) (obj1)).toString()).toString());
        obj1 = c1.b(r.getAbsolutePath());
        l1 = l2;
          goto _L1
    }

    static void f(CameraActivity cameraactivity)
    {
        cameraactivity.d();
    }

    static CameraView g(CameraActivity cameraactivity)
    {
        return cameraactivity.D;
    }

    private void g()
    {
        Log.i(O[23]);
        I.setEnabled(false);
        z.setEnabled(false);
        y.setEnabled(false);
        D.a(new t(this));
    }

    static View h(CameraActivity cameraactivity)
    {
        return cameraactivity.H;
    }

    static File i(CameraActivity cameraactivity)
    {
        return cameraactivity.r;
    }

    static og j(CameraActivity cameraactivity)
    {
        return cameraactivity.K;
    }

    static ProgressBar k(CameraActivity cameraactivity)
    {
        return cameraactivity.u;
    }

    static void l(CameraActivity cameraactivity)
    {
        cameraactivity.b();
    }

    static ImageView m(CameraActivity cameraactivity)
    {
        return cameraactivity.I;
    }

    static AutofocusOverlay n(CameraActivity cameraactivity)
    {
        return cameraactivity.G;
    }

    static TextView o(CameraActivity cameraactivity)
    {
        return cameraactivity.N;
    }

    static ShutterOverlay p(CameraActivity cameraactivity)
    {
        return cameraactivity.k;
    }

    static ConversationTextEntry q(CameraActivity cameraactivity)
    {
        return cameraactivity.L;
    }

    static ImageButton r(CameraActivity cameraactivity)
    {
        return cameraactivity.J;
    }

    static void s(CameraActivity cameraactivity)
    {
        cameraactivity.a();
    }

    static int t(CameraActivity cameraactivity)
    {
        return cameraactivity.F;
    }

    static long u(CameraActivity cameraactivity)
    {
        return cameraactivity.s;
    }

    static Handler v(CameraActivity cameraactivity)
    {
        return cameraactivity.x;
    }

    static boolean w(CameraActivity cameraactivity)
    {
        return cameraactivity.o;
    }

    static void x(CameraActivity cameraactivity)
    {
        cameraactivity.g();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        i1;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 != -1) goto _L1; else goto _L3
_L3:
        Object obj;
        Uri uri = Uri.fromFile(App.m(O[30]));
        obj = uri;
        if (v.getQueryParameter(O[29]) != null)
        {
            obj = uri.buildUpon().appendQueryParameter(O[31], "1").build();
        }
        obj = c1.d(((Uri) (obj)));
        if (obj == null)
        {
            try
            {
                Log.e(O[27]);
                App.b(this, 0x7f0e0074, 1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        } else
        {
            M = (Rect)intent.getParcelableExtra(O[32]);
            C.a(((android.graphics.Bitmap) (obj)));
            return;
        }
        intent;
_L5:
        Log.a(O[28], intent);
        App.b(this, 0x7f0e0074, 1);
        return;
        intent;
        continue; /* Loop/switch isn't completed */
        intent;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onBackPressed()
    {
        if (H.getVisibility() == 0)
        {
            a();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        int i1;
label0:
        {
            i1 = n;
            super.onCreate(bundle);
            Log.i(O[7]);
            if (App.Z == null || !App.ah.y() || App.f(this) != 3)
            {
                Log.i(O[11]);
                App.q(O[5]);
                startActivity(new Intent(this, com/whatsapp/Main));
                finish();
                return;
            }
            if (!WhatsAppLibLoader.a(null))
            {
                Log.i(O[9]);
                finish();
                return;
            }
            if (O[6].equals(getIntent().getAction()))
            {
                setResult(-1, e());
                finish();
                return;
            }
            if (App.A() < (long)(au2.q * 1024 * 1024))
            {
                bundle = App.au;
                App.a(getApplicationContext(), 0x7f0e015f, 1);
                finish();
                return;
            }
            getWindow().setFlags(1024, 1024);
            getWindow().clearFlags(256);
            getWindow().setBackgroundDrawable(new ColorDrawable(0xff000000));
            bundle = new CameraLayout(this);
            iz.a(getWindow().getLayoutInflater(), 0x7f03002a, bundle, true);
            setContentView(bundle);
            o = getIntent().getBooleanExtra(O[10], true);
            bundle = getIntent().getStringExtra(O[8]);
            if (bundle != null)
            {
                K = App.az.e(bundle);
                if (K.k() || K.d())
                {
                    bundle = com.whatsapp.util.c.b(getString(0x7f0e037c, new Object[] {
                        K.a(this)
                    }), getBaseContext());
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                bundle = getString(0x7f0e037d, new Object[] {
                    K.a(this)
                });
                if (i1 == 0)
                {
                    break label0;
                }
            }
            bundle = getString(0x7f0e0077);
        }
label1:
        {
            w = (TextView)findViewById(0x7f0b00f3);
            w.setText(bundle);
            H = findViewById(0x7f0b00e6);
            q = findViewById(0x7f0b00e0);
            C = (PhotoView)findViewById(0x7f0b00e7);
            D = (CameraView)findViewById(0x7f0b00e2);
            D.setCameraCallback(new com.whatsapp.camera.k(this));
            A = (ViewGroup)findViewById(0x7f0b00e1);
            G = new AutofocusOverlay(this);
            G.setVisibility(8);
            A.addView(G, -1, -1);
            l = new ZoomOverlay(this);
            l.setVisibility(8);
            A.addView(l, -1, -1);
            k = new ShutterOverlay(this);
            A.addView(k, -1, -1);
            N = (TextView)findViewById(0x7f0b00f6);
            u = (ProgressBar)findViewById(0x7f0b00f7);
            u.setMax(100);
            j = findViewById(0x7f0b00f8);
            z = findViewById(0x7f0b00e4);
            if (android.os.Build.VERSION.SDK_INT < 9 || Camera.getNumberOfCameras() <= 1)
            {
                z.setVisibility(8);
                if (i1 == 0)
                {
                    break label1;
                }
            }
            z.setOnClickListener(new af(this));
        }
        y = (ImageButton)findViewById(0x7f0b00e5);
        y.setOnClickListener(new p(this));
        I = (ImageView)findViewById(0x7f0b00e3);
        I.setOnClickListener(new ao(this));
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            I.setOnLongClickListener(new ad(this));
        }
        I.setOnTouchListener(new q(this));
        J = (ImageButton)findViewById(0x7f0b0167);
        J.setOnClickListener(new n(this));
        L = (ConversationTextEntry)findViewById(0x7f0b0182);
        L.setInputEnterDone(true);
        L.setFilters(new InputFilter[] {
            new aka(160)
        });
        L.setOnEditorActionListener(new z(this));
        bundle = (TextView)findViewById(0x7f0b022b);
        L.addTextChangedListener(new g(this, bundle));
        B = new d(this, this);
        B.a(new f(this));
        m = findViewById(0x7f0b00f4);
        E = findViewById(0x7f0b00f5);
        H.getViewTreeObserver().addOnGlobalLayoutListener(t);
    }

    protected void onDestroy()
    {
        Log.i(O[13]);
        super.onDestroy();
        if (H != null)
        {
            H.getViewTreeObserver().removeGlobalOnLayoutListener(t);
        }
    }

    protected void onPause()
    {
        super.onPause();
        if (D.j())
        {
            boolean flag;
            if (System.currentTimeMillis() - s > 1000L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i1;
        as1 = new String[38];
        obj = "XTwEF^OvV@KJ<GLZKzDLAI{UDL";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as2[i1] = ((String) (obj));
                obj = "XTwEF^OvV@KJ<GLZKzDLAI{UDL";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i1] = ((String) (obj));
                obj = "M\\~E[O\\pT@XTgY\006]XgUYXTwEF^OvV@KJ";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i1] = ((String) (obj));
                i1 = 3;
                obj = "A[u";
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i1] = ((String) (obj));
                i1 = 4;
                obj = "AS";
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i1] = ((String) (obj));
                i1 = 5;
                obj = "M\\~E[O\\pT@XTgY\tLRfNJK\035gO\tC\\zN";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i1] = ((String) (obj));
                i1 = 6;
                obj = "OSwRFGY=IGZX}T\007O^gIF@\023PrloiV\177zfrAtj{i";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i1] = ((String) (obj));
                i1 = 7;
                obj = "M\\~E[O\\pT@XTgY\006MOvA]K";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i1] = ((String) (obj));
                i1 = 8;
                obj = "DTw";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i1] = ((String) (obj));
                i1 = 9;
                obj = "O_|R]GSt\000M[X3TF\016SrT@XX3L@LOrR@KN3M@]NzNN";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i1] = ((String) (obj));
                i1 = 10;
                obj = "^OvV@KJ";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i1] = ((String) (obj));
                i1 = 11;
                obj = "M\\~E[O\\pT@XTgY\006MOvA]K\022}O\004CX>O[\003P`GZZRaE\004J_";
                byte0 = 10;
                break;

            case 10: // '\n'
                as2[i1] = ((String) (obj));
                i1 = 12;
                obj = "M\\~E[O\\pT@XTgY\006\\X`TH\\I";
                byte0 = 11;
                break;

            case 11: // '\013'
                as2[i1] = ((String) (obj));
                i1 = 13;
                obj = "M\\~E[O\\pT@XTgY\006JX`T[AD";
                byte0 = 12;
                break;

            case 12: // '\f'
                as2[i1] = ((String) (obj));
                i1 = 14;
                obj = "]VzPv^OvV@KJ";
                byte0 = 13;
                break;

            case 13: // '\r'
                as2[i1] = ((String) (obj));
                i1 = 15;
                obj = "M\\~E[O\\pT@XTgY\006]I|P_GYvOJOMgU[K\035";
                byte0 = 14;
                break;

            case 14: // '\016'
                as2[i1] = ((String) (obj));
                i1 = 16;
                obj = "XTwEF\001\027";
                byte0 = 15;
                break;

            case 15: // '\017'
                as2[i1] = ((String) (obj));
                i1 = 17;
                obj = "XTqRHZRa";
                byte0 = 16;
                break;

            case 16: // '\020'
                as2[i1] = ((String) (obj));
                i1 = 18;
                obj = "M\\~E[O\\pT@XTgY\006]I|P_GYvOJOMgU[K";
                byte0 = 17;
                break;

            case 17: // '\021'
                as2[i1] = ((String) (obj));
                obj = "F\\cT@MbuELJ_rCBqX}AKBXw";
                byte0 = 18;
                i1 = 19;
                break;

            case 18: // '\022'
                as2[i1] = ((String) (obj));
                i1 = 20;
                obj = "`R3SYO^v";
                byte0 = 19;
                break;

            case 19: // '\023'
                as2[i1] = ((String) (obj));
                i1 = 21;
                obj = "M\\~E[O\\pT@XTgY\006]I|P_GYvOJOMgU[K\035";
                byte0 = 20;
                break;

            case 20: // '\024'
                as2[i1] = ((String) (obj));
                i1 = 22;
                obj = "OSwRFGY=IGZX}T\007KEgRH\000nGrlop";
                byte0 = 21;
                break;

            case 21: // '\025'
                as2[i1] = ((String) (obj));
                i1 = 23;
                obj = "M\\~E[O\\pT@XTgY\006Z\\xEH@Y`EGJMzC][Ov";
                byte0 = 22;
                break;

            case 22: // '\026'
                as2[i1] = ((String) (obj));
                i1 = 24;
                obj = "OSwRFGY=IGZX}T\007KEgRH\000N{O[Z^fT\007g~\\nv|x@o||~V";
                byte0 = 23;
                break;

            case 23: // '\027'
                as2[i1] = ((String) (obj));
                i1 = 25;
                obj = "OSwRFGY=IGZX}T\007KEgRH\000N{O[Z^fT\007gsGegz";
                byte0 = 24;
                break;

            case 24: // '\030'
                as2[i1] = ((String) (obj));
                i1 = 26;
                obj = "OSwRFGY=IGZX}T\007KEgRH\000N{O[Z^fT\007`|^e";
                byte0 = 25;
                break;

            case 25: // '\031'
                as2[i1] = ((String) (obj));
                i1 = 27;
                obj = "M\\~E[O\\pT@XTgY\006]XgUY^OvV@KJ=N\\BQqI]C\\c";
                byte0 = 26;
                break;

            case 26: // '\032'
                as2[i1] = ((String) (obj));
                i1 = 28;
                obj = "M\\~E[O\\pT@XTgY\006]XgUY^OvV@KJ";
                byte0 = 27;
                break;

            case 27: // '\033'
                as2[i1] = ((String) (obj));
                i1 = 29;
                obj = "HQzP\004F";
                byte0 = 28;
                break;

            case 28: // '\034'
                as2[i1] = ((String) (obj));
                i1 = 30;
                obj = "M\\~E[O";
                byte0 = 29;
                break;

            case 29: // '\035'
                as2[i1] = ((String) (obj));
                i1 = 31;
                obj = "HQzP\004F";
                byte0 = 30;
                break;

            case 30: // '\036'
                as2[i1] = ((String) (obj));
                obj = "\\XpT";
                byte0 = 31;
                i1 = 32;
                break;

            case 31: // '\037'
                as2[i1] = ((String) (obj));
                i1 = 33;
                obj = "\000Pc\024";
                byte0 = 32;
                break;

            case 32: // ' '
                as2[i1] = ((String) (obj));
                i1 = 34;
                obj = "M\\~E[O\\pT@XTgY\006]IrR]XTwEFM\\cT\\\\X";
                byte0 = 33;
                break;

            case 33: // '!'
                as2[i1] = ((String) (obj));
                i1 = 35;
                obj = "M\\~E[O\\pT@XTgY\006]XgUY^OvV@KJ";
                byte0 = 34;
                break;

            case 34: // '"'
                as2[i1] = ((String) (obj));
                i1 = 36;
                obj = "M\\~E[O\\pT@XTgY\006]XgUY^U|TF^OvV@KJ";
                byte0 = 35;
                break;

            case 35: // '#'
                as2[i1] = ((String) (obj));
                i1 = 37;
                obj = "M\\~E[O\\pT@XTgY\006]XgUY^OvV@KJ=N\\BQqI]C\\c";
                byte0 = 36;
                break;

            case 36: // '$'
                as2[i1] = ((String) (obj));
                O = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 916
    //                   0 939
    //                   1 946
    //                   2 953
    //                   3 960;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_960;
_L3:
        byte byte1 = 41;
_L9:
        obj[j1] = (char)(byte1 ^ c2);
        j1++;
          goto _L8
_L4:
        byte1 = 46;
          goto _L9
_L5:
        byte1 = 61;
          goto _L9
_L6:
        byte1 = 19;
          goto _L9
        byte1 = 32;
          goto _L9
    }
}
