// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextSwitcher;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.weather.globalview.s;
import com.gtp.a.a.c.c;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.c.d;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.d.j;
import com.gtp.go.weather.sharephoto.d.n;
import com.gtp.go.weather.sharephoto.d.p;
import com.gtp.go.weather.sharephoto.photo.ad;
import com.gtp.go.weather.sharephoto.takephoto.ab;
import com.gtp.go.weather.sharephoto.view.e;
import java.io.File;
import uk.co.senab.photoview.PhotoView;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            e, r, h, d, 
//            s, b, g, o, 
//            p, q, c, f, 
//            i, j, k, a, 
//            l, t, m, n, 
//            PhotoReportActivity

public class PhotoDetailActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private static final String M = (new StringBuilder()).append(com.gtp.a.a.c.c.a()).append("/share/photo_for_share.jpg").toString();
    private int A;
    private Dialog B;
    private String C;
    private TranslateAnimation D;
    private TranslateAnimation E;
    private TranslateAnimation F;
    private TranslateAnimation G;
    private TranslateAnimation H;
    private com.gtp.go.weather.sharephoto.d.c I;
    private boolean J;
    private boolean K;
    private Runnable L;
    private int a;
    private PhotoView b;
    private uk.co.senab.photoview.b c;
    private ImageView d;
    private ImageView e;
    private View f;
    private View g;
    private TextSwitcher h;
    private View i;
    private ImageView j;
    private View k;
    private CheckBox l;
    private View m;
    private s n;
    private ad o;
    private ViewGroup p;
    private p q;
    private long r;
    private boolean s;
    private boolean t;
    private boolean u;
    private t v;
    private Bitmap w;
    private Bitmap x;
    private int y;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.d z;

    public PhotoDetailActivity()
    {
        a = 1;
        r = -1L;
        t = true;
        u = false;
        A = -1;
        L = new com.gtp.go.weather.sharephoto.e(this);
    }

    static int a(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.a;
    }

    static Bitmap a(PhotoDetailActivity photodetailactivity, Bitmap bitmap)
    {
        photodetailactivity.w = bitmap;
        return bitmap;
    }

    static String a()
    {
        return M;
    }

    static String a(PhotoDetailActivity photodetailactivity, String s1)
    {
        photodetailactivity.C = s1;
        return s1;
    }

    private void a(long l1)
    {
        o.a(r, new r(this));
    }

    private void a(View view)
    {
        if (view.getVisibility() != 0)
        {
            view.setVisibility(0);
        }
    }

    static void a(PhotoDetailActivity photodetailactivity, long l1)
    {
        photodetailactivity.c(l1);
    }

    static void a(PhotoDetailActivity photodetailactivity, View view)
    {
        photodetailactivity.a(view);
    }

    static void a(PhotoDetailActivity photodetailactivity, File file)
    {
        photodetailactivity.a(file);
    }

    static void a(PhotoDetailActivity photodetailactivity, String s1, String s2)
    {
        photodetailactivity.a(s1, s2);
    }

    static void a(PhotoDetailActivity photodetailactivity, String s1, String s2, String s3)
    {
        photodetailactivity.a(s1, s2, s3);
    }

    static void a(PhotoDetailActivity photodetailactivity, String s1, boolean flag)
    {
        photodetailactivity.a(s1, flag);
    }

    static void a(PhotoDetailActivity photodetailactivity, String s1, boolean flag, boolean flag1)
    {
        photodetailactivity.a(s1, flag, flag1);
    }

    private void a(File file)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.SUBJECT", getString(0x7f080491));
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        intent.putExtra("android.intent.extra.TEXT", getString(0x7f080492, new Object[] {
            C
        }));
        try
        {
            startActivity(Intent.createChooser(intent, getString(0x7f0801dd)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Toast.makeText(getApplicationContext(), 0x7f0801de, 0).show();
        }
    }

    private void a(String s1)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runOnUiThread(new com.gtp.go.weather.sharephoto.h(this, s1));
            return;
        } else
        {
            Toast.makeText(this, s1, 0).show();
            return;
        }
    }

    private void a(String s1, String s2)
    {
        if (s)
        {
            e.setSelected(true);
        }
        Object obj = (new StringBuilder(ab.a(r).getAbsolutePath())).append(File.separator).append("photo_thumbnail_temporary.png").toString();
        DisplayMetrics displaymetrics = e().getDisplayMetrics();
        obj = ab.a(((String) (obj)), displaymetrics.widthPixels, displaymetrics.heightPixels);
        if (obj != null)
        {
            d.setVisibility(8);
            b.setImageBitmap(((Bitmap) (obj)));
        }
        (new com.gtp.go.weather.sharephoto.d(this, s1, s2)).execute(new Void[0]);
    }

    private void a(String s1, String s2, String s3)
    {
        if (s)
        {
            e.setSelected(true);
        }
        s3 = com.gtp.go.weather.sharephoto.d.h.a(this, j.a, s3);
        if (s3 != null)
        {
            d.setVisibility(8);
            b.setImageBitmap(s3);
        }
        s3 = new com.gtp.go.weather.sharephoto.d.b(this);
        I.a(j.b, s1, s3, new com.gtp.go.weather.sharephoto.s(this));
        if (!TextUtils.isEmpty(s2))
        {
            I.a(j.c, s2, s3, new com.gtp.go.weather.sharephoto.b(this));
            return;
        } else
        {
            K = true;
            return;
        }
    }

    private void a(String s1, boolean flag)
    {
        a(s1, flag, true);
    }

    private void a(String s1, boolean flag, boolean flag1)
    {
        if (n == null)
        {
            n = new s(this);
            n.setCanceledOnTouchOutside(false);
            n.a(false);
            n.a(0x7f020411);
            n.setOnCancelListener(new com.gtp.go.weather.sharephoto.g(this));
        }
        n.setCancelable(flag1);
        n.a(s1);
        if (flag && !n.isShowing() && !isFinishing())
        {
            n.show();
        }
    }

    private void a(boolean flag)
    {
        switch (a)
        {
        default:
            return;

        case 1: // '\001'
            i();
            c(flag);
            return;

        case 2: // '\002'
            i();
            break;
        }
        b(flag);
    }

    static boolean a(PhotoDetailActivity photodetailactivity, boolean flag)
    {
        photodetailactivity.s = flag;
        return flag;
    }

    private Bitmap b(View view)
    {
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        try
        {
            view.buildDrawingCache();
            view = view.getDrawingCache();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return null;
        }
        return view;
    }

    static Bitmap b(PhotoDetailActivity photodetailactivity, Bitmap bitmap)
    {
        photodetailactivity.x = bitmap;
        return bitmap;
    }

    static p b(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.q;
    }

    private void b()
    {
        D = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        D.setDuration(y);
        D.setAnimationListener(new o(this));
        H = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        H.setDuration(y);
        H.setStartOffset(100L);
        H.setAnimationListener(new com.gtp.go.weather.sharephoto.p(this));
        E = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        E.setDuration(y);
        F = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -1F);
        F.setDuration(y);
        F.setAnimationListener(new com.gtp.go.weather.sharephoto.q(this));
        G = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F);
        G.setDuration(y);
    }

    private void b(long l1)
    {
        (new com.gtp.go.weather.sharephoto.c(this, l1)).execute(new Long[] {
            Long.valueOf(l1)
        });
    }

    static void b(PhotoDetailActivity photodetailactivity, View view)
    {
        photodetailactivity.c(view);
    }

    static void b(PhotoDetailActivity photodetailactivity, String s1)
    {
        photodetailactivity.a(s1);
    }

    private void b(boolean flag)
    {
        c.a(android.widget.ImageView.ScaleType.CENTER_CROP);
        c.f();
        e(flag);
    }

    static boolean b(PhotoDetailActivity photodetailactivity, boolean flag)
    {
        photodetailactivity.J = flag;
        return flag;
    }

    private void c(long l1)
    {
        com.gtp.go.weather.sharephoto.c.d.a(getApplicationContext()).a(l1);
    }

    private void c(View view)
    {
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
    }

    private void c(boolean flag)
    {
        c.a(android.widget.ImageView.ScaleType.FIT_CENTER);
        c.f();
        d(flag);
        if (l.isChecked())
        {
            l.setChecked(false);
        }
    }

    static boolean c(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.u;
    }

    static boolean c(PhotoDetailActivity photodetailactivity, boolean flag)
    {
        photodetailactivity.K = flag;
        return flag;
    }

    static ImageView d(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.e;
    }

    static void d(PhotoDetailActivity photodetailactivity, boolean flag)
    {
        photodetailactivity.g(flag);
    }

    private void d(boolean flag)
    {
        if (flag)
        {
            h.setText(getString(0x7f080489));
            q.d();
            a(m);
            m.clearAnimation();
            m.startAnimation(H);
        } else
        {
            h.setCurrentText(getString(0x7f080489));
            if (u)
            {
                e.setVisibility(0);
            }
            f.setVisibility(0);
            m.setVisibility(8);
        }
        j.setImageResource(0x7f020107);
    }

    static int e(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.y;
    }

    private void e(boolean flag)
    {
        if (flag)
        {
            h.setText(getString(0x7f08049d));
            q.c();
            a(m);
            m.clearAnimation();
            m.startAnimation(E);
        } else
        {
            h.setCurrentText(getString(0x7f08049d));
            e.setVisibility(8);
            f.setVisibility(8);
            m.setVisibility(0);
        }
        j.setImageResource(0x7f0203e3);
    }

    static boolean e(PhotoDetailActivity photodetailactivity, boolean flag)
    {
        photodetailactivity.u = flag;
        return flag;
    }

    private LayerDrawable f(boolean flag)
    {
        Object obj = null;
        if (w != null)
        {
            obj = new Drawable[2];
            obj[0] = new BitmapDrawable(e(), w);
            if (flag && x != null)
            {
                obj[1] = new BitmapDrawable(e(), x);
                obj[1].setBounds(obj[0].getBounds());
            } else
            {
                obj[1] = new ColorDrawable(0);
            }
            obj = new LayerDrawable(((Drawable []) (obj)));
            ((LayerDrawable) (obj)).setLayerInset(0, 0, 0, 0, 0);
            ((LayerDrawable) (obj)).setLayerInset(1, 0, 0, 0, 0);
        }
        return ((LayerDrawable) (obj));
    }

    static Runnable f(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.L;
    }

    private void f()
    {
        e.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        m.setOnClickListener(this);
        f.setOnClickListener(this);
    }

    static ImageView g(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.j;
    }

    private void g()
    {
        if (t)
        {
            a(r);
            return;
        } else
        {
            b(r);
            return;
        }
    }

    private void g(boolean flag)
    {
        if (B == null)
        {
            p();
        }
        if (!isFinishing())
        {
            boolean flag1 = B.isShowing();
            if (flag && !flag1)
            {
                B.show();
            } else
            if (!flag && flag1)
            {
                B.dismiss();
                return;
            }
        }
    }

    static View h(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.g;
    }

    private void h()
    {
        if (J && K)
        {
            o();
            j();
            i();
        }
    }

    static TranslateAnimation i(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.G;
    }

    private void i()
    {
        LayerDrawable layerdrawable;
        if (a == 1)
        {
            layerdrawable = f(true);
        } else
        {
            layerdrawable = f(false);
        }
        if (layerdrawable != null)
        {
            b.setImageDrawable(layerdrawable);
            c.f();
        }
    }

    static TranslateAnimation j(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.F;
    }

    private void j()
    {
        if (w != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Toast.makeText(this, 0x7f08048d, 0).show();
        d.setVisibility(0);
        d.setImageResource(0x7f0203b6);
_L1:
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        outofmemoryerror.printStackTrace();
        return;
        c.a(true);
        if (d.getVisibility() == 0)
        {
            d.setVisibility(4);
        }
        if (a == 1)
        {
            q.a(3000);
            return;
        }
          goto _L1
    }

    static View k(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.f;
    }

    private boolean k()
    {
        if (w == null)
        {
            Toast.makeText(this, 0x7f08048e, 0).show();
            return false;
        } else
        {
            return true;
        }
    }

    static TranslateAnimation l(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.E;
    }

    private void l()
    {
        Bitmap bitmap = b(b);
        if (bitmap != null && !bitmap.isRecycled())
        {
            (new f(this)).execute(new Bitmap[] {
                bitmap
            });
            return;
        } else
        {
            a(getString(0x7f0804a0));
            return;
        }
    }

    static TranslateAnimation m(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.D;
    }

    private void m()
    {
        if (z == null)
        {
            z = new com.gau.go.launcherex.gowidget.weather.globaltheme.d(getApplicationContext());
        }
        z.a(1, com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(this));
    }

    static View n(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.m;
    }

    private void n()
    {
        int i1 = A;
        a = i1;
        if (i1 != -1)
        {
            A = -1;
            a(true);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    static View o(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.i;
    }

    private void o()
    {
        if (n != null && n.isShowing() && !isFinishing())
        {
            n.dismiss();
        }
    }

    static long p(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.r;
    }

    private void p()
    {
        b b1 = e();
        B = new Dialog(this, 0x7f07001c);
        Object obj = new ListView(this);
        ((ListView) (obj)).setCacheColorHint(0);
        ((ListView) (obj)).setBackgroundResource(0x7f0202b8);
        ((ListView) (obj)).setDivider(b1.getDrawable(0x7f0202b9));
        ((ListView) (obj)).setAdapter(new ArrayAdapter(this, 0x7f03010a, com.gau.go.launcherex.gowidget.weather.util.c.i(this)));
        ((ListView) (obj)).setOnItemClickListener(this);
        B.setContentView(((View) (obj)));
        obj = B.getWindow();
        ((Window) (obj)).clearFlags(0x8000000);
        ((Window) (obj)).setGravity(53);
        android.view.WindowManager.LayoutParams layoutparams = ((Window) (obj)).getAttributes();
        layoutparams.x = 0;
        float f1 = b1.getDisplayMetrics().density;
        layoutparams.y = (int)(b1.getDimension(0x7f0c015f) - f1 * 3F);
        layoutparams.width = (int)b1.getDimension(0x7f0c0170);
        layoutparams.height = -2;
        ((Window) (obj)).setAttributes(layoutparams);
        ((Window) (obj)).setWindowAnimations(0x7f070014);
        B.setCanceledOnTouchOutside(true);
        B.setOnShowListener(new i(this));
        B.setOnDismissListener(new com.gtp.go.weather.sharephoto.j(this));
    }

    private void q()
    {
        if (!k())
        {
            return;
        }
        Bitmap bitmap = null;
        if (x == null)
        {
            bitmap = w;
        } else
        {
            LayerDrawable layerdrawable = f(true);
            if (layerdrawable != null)
            {
                bitmap = com.gtp.go.weather.sharephoto.d.h.a(layerdrawable);
            }
        }
        if (bitmap != null && !bitmap.isRecycled())
        {
            (new k(this)).execute(new Bitmap[] {
                bitmap
            });
            return;
        } else
        {
            Toast.makeText(getApplicationContext(), 0x7f080494, 0).show();
            return;
        }
    }

    static void q(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.h();
    }

    private void r()
    {
        if (v != null)
        {
            unregisterReceiver(v);
            v = null;
        }
    }

    static void r(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.o();
    }

    static void s(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.j();
    }

    static void t(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.i();
    }

    static boolean u(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.k();
    }

    static CheckBox v(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.l;
    }

    static void w(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.l();
    }

    static void x(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.m();
    }

    static PhotoView y(PhotoDetailActivity photodetailactivity)
    {
        return photodetailactivity.b;
    }

    static void z(PhotoDetailActivity photodetailactivity)
    {
        photodetailactivity.r();
    }

    public void onBackPressed()
    {
        n();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
label0:
        {
            if (compoundbutton.equals(l))
            {
                if (!flag)
                {
                    break label0;
                }
                k.setVisibility(0);
            }
            return;
        }
        k.setVisibility(4);
    }

    public void onClick(View view)
    {
        boolean flag2 = true;
        boolean flag = true;
        if (view.equals(f))
        {
            if (k())
            {
                A = 1;
                a = 2;
                a(true);
            }
        } else
        {
            if (view.equals(e))
            {
                if (e.isSelected())
                {
                    flag = false;
                }
                s = flag;
                e.setSelected(s);
                view = new a(117);
                view.a(String.valueOf(r));
                if (s)
                {
                    view.b("fs_exellent_add");
                    com.gtp.go.weather.sharephoto.view.e.a(this, p);
                    com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(view);
                } else
                {
                    view.b("fs_exellent_minus");
                    com.gtp.go.weather.sharephoto.view.e.b(this, p);
                    com.gau.go.launcherex.gowidget.statistics.q.a(getApplicationContext()).a(view);
                }
                view = new g();
                view.a(r);
                view.a(s);
                com.gtp.go.weather.sharephoto.c.d.a(getApplicationContext()).a(view);
                return;
            }
            if (view.equals(j))
            {
                j.removeCallbacks(L);
                j.postDelayed(L, 50L);
                return;
            }
            if (view.equals(i))
            {
                n();
                return;
            }
            if (view.equals(m))
            {
                view = l;
                boolean flag1;
                if (!l.isChecked())
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                view.setChecked(flag1);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        p = (ViewGroup)getLayoutInflater().inflate(0x7f030003, null);
        setContentView(p);
        getWindow().clearFlags(0x8000000);
        I = new com.gtp.go.weather.sharephoto.d.c(this);
        b = (PhotoView)findViewById(0x7f090064);
        d = (ImageView)findViewById(0x7f090063);
        e = (ImageView)findViewById(0x7f090067);
        g = findViewById(0x7f090065);
        h = (TextSwitcher)findViewById(0x7f090061);
        h.setFactory(new com.gtp.go.weather.sharephoto.a(this));
        h.setInAnimation(this, 0x7f040026);
        h.setOutAnimation(this, 0x7f040027);
        i = findViewById(0x7f090060);
        j = (ImageView)findViewById(0x7f090066);
        k = findViewById(0x7f090068);
        l = (CheckBox)findViewById(0x7f09006b);
        l.setClickable(false);
        m = findViewById(0x7f09006a);
        l.setOnCheckedChangeListener(this);
        f = findViewById(0x7f090069);
        f();
        o = new ad(this);
        y = e().getInteger(0x10e0000);
        c = new uk.co.senab.photoview.b(b);
        c.a(false);
        c.a(new l(this));
        u = com.gtp.go.weather.sharephoto.d.n.a(getApplicationContext());
        if (!u)
        {
            e.setVisibility(8);
            bundle = new IntentFilter("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_USER_DATA");
            v = new t(this);
            registerReceiver(v, bundle);
        }
        bundle = new m(this);
        e.setOnTouchListener(bundle);
        f.setOnTouchListener(bundle);
        q = new p(this);
        q.a();
        q.a(new com.gtp.go.weather.sharephoto.n(this));
        b();
        bundle = getIntent();
        if (bundle != null)
        {
            long l1 = bundle.getLongExtra("extra_photo_id", -1L);
            r = l1;
            if (l1 != -1L)
            {
                t = bundle.getBooleanExtra("extra_photo_isuploaded", true);
                a = bundle.getIntExtra("extra_enter_type", 1);
                a(false);
                g();
                return;
            }
        }
        finish();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        r();
        I.a();
        if (x != null && !x.isRecycled())
        {
            x.recycle();
            x = null;
        }
        if (w != null && !w.isRecycled())
        {
            w.recycle();
            w = null;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        q();
_L4:
        g(false);
        return;
_L2:
        if (i1 == 1)
        {
            adapterview = new Intent(this, com/gtp/go/weather/sharephoto/PhotoReportActivity);
            adapterview.putExtra("photo_id", r);
            startActivity(adapterview);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
