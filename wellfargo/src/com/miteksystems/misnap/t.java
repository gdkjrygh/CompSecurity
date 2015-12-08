// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.miteksystems.misnap:
//            a, u, ad, ae, 
//            af, ag, ah, ai, 
//            aj, ak, v, MiSnap, 
//            MiSnapAPI, i, w, q, 
//            x, y, aa, ab, 
//            k, b, j, r, 
//            MitekAnalyzer, ac, z

public final class t extends RelativeLayout
    implements a
{

    static boolean a = false;
    private boolean A;
    private MiSnap B;
    private AlertDialog C;
    private int D;
    private Handler E;
    private MitekAnalyzer F;
    private final Paint G;
    private float H;
    private float I;
    private int J;
    private int K;
    private double L;
    private double M;
    private Path N;
    private List O;
    private List P;
    private ConcurrentHashMap Q;
    private boolean R;
    private boolean S;
    private Point T;
    private TextView U;
    private Bitmap V;
    private ImageView W;
    private ImageView Z;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private Runnable aE;
    private Runnable aF;
    private int aG;
    private Runnable aH;
    private Point aI;
    private ImageView aa;
    private ImageView ab;
    private ImageView ac;
    private ImageView ad;
    private b ae;
    private b af;
    private b ag;
    private b ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private float al;
    private float am;
    private float an;
    private long ao;
    private long ap;
    private Animation aq;
    private Animation ar;
    private Animation as;
    private Matrix at;
    private float au[];
    private RelativeLayout av;
    private RelativeLayout aw;
    private Button ax;
    private Button ay;
    private boolean az;
    Drawable b;
    ImageButton c;
    ImageButton d;
    ImageButton e;
    ImageButton f;
    ImageButton g;
    TextView h;
    Resources i;
    Handler j;
    r k;
    i l;
    Runnable m;
    Runnable n;
    Runnable o;
    Runnable p;
    Runnable q;
    final Runnable r;
    Runnable s;
    private float t;
    private float u;
    private boolean v;
    private Matrix w;
    private int x;
    private int y[];
    private long z;

    private t(MiSnap misnap, Handler handler, r r1, i i1)
    {
        super(misnap, null, 0);
        t = 0.0F;
        u = 0.0F;
        v = false;
        w = new Matrix();
        x = 0;
        y = (new int[] {
            R.drawable.gauge_fill_00, R.drawable.gauge_fill_05, R.drawable.gauge_fill_10, R.drawable.gauge_fill_15, R.drawable.gauge_fill_20, R.drawable.gauge_fill_25, R.drawable.gauge_fill_30, R.drawable.gauge_fill_35, R.drawable.gauge_fill_40, R.drawable.gauge_fill_45, 
            R.drawable.gauge_fill_50, R.drawable.gauge_fill_55, R.drawable.gauge_fill_60, R.drawable.gauge_fill_65, R.drawable.gauge_fill_70, R.drawable.gauge_fill_75, R.drawable.gauge_fill_80, R.drawable.gauge_fill_85, R.drawable.gauge_fill_90, R.drawable.gauge_fill_95, 
            R.drawable.gauge_fill_100
        });
        z = 0L;
        A = false;
        D = 0;
        L = 0.0D;
        M = 0.0D;
        O = new ArrayList();
        R = false;
        S = true;
        T = new Point();
        V = null;
        W = null;
        Z = null;
        aa = null;
        ab = null;
        ac = null;
        ad = null;
        al = 0.0F;
        am = 0.0F;
        an = 0.0F;
        ao = 0L;
        ap = 0L;
        at = new Matrix();
        au = new float[2];
        az = true;
        aA = false;
        aB = false;
        aC = false;
        aD = false;
        i = null;
        k = null;
        l = null;
        m = new u(this);
        n = new ad(this);
        o = new ae(this);
        p = new af(this);
        aE = new ag(this);
        q = new ah(this);
        r = new ai(this);
        aF = new aj(this);
        aG = 0;
        aH = new ak(this);
        s = new v(this);
        aI = null;
        B = misnap;
        a = false;
        j = handler;
        k = r1;
        l = i1;
        int j1;
        boolean flag;
        if (B.a.n().toLowerCase(Locale.US).contains("license"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aB = flag;
        i1 = getResources();
        if (i1 == null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        handler = i1.getAssets();
        r1 = i1.getDisplayMetrics();
        i1 = new Configuration(i1.getConfiguration());
        if (B == null || B.a == null || B.a.x() == null)
        {
            break MISSING_BLOCK_LABEL_1390;
        }
        i1.locale = new Locale(B.a.x().toLowerCase());
        i = new Resources(handler, r1, i1);
_L1:
        N = new Path();
        Q = new ConcurrentHashMap();
        G = new Paint(1);
        G.setDither(true);
        G.setStyle(android.graphics.Paint.Style.STROKE);
        G.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        G.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        G.setPathEffect(new CornerPathEffect(B.a.q()));
        G.setAntiAlias(true);
        G.setStrokeWidth(B.a.p());
        j1 = B.a.r();
        G.setColor(j1 | 0xff000000);
        View.inflate(misnap, R.layout.lib_overlay, this);
        g = (ImageButton)findViewById(R.id.overlay_flash_toggle);
        c = (ImageButton)findViewById(R.id.misnap_overlay_mitek_logo);
        c.setAlpha(192);
        l.a(c);
        d = (ImageButton)findViewById(R.id.misnap_overlay_help_button);
        d.setOnClickListener(new w(this));
        U = (TextView)findViewById(R.id.misnap_check_text);
        int k1;
        if (B.a.ay())
        {
            if (B.a.ak())
            {
                misnap = B.getString(R.string.misnap_check_front_text);
            } else
            {
                misnap = B.a.Z();
            }
            U.setText(misnap);
        } else
        if (B.a.az())
        {
            if (B.a.al())
            {
                misnap = B.getString(R.string.misnap_check_back_text);
            } else
            {
                misnap = B.a.Y();
            }
            U.setText(misnap);
        }
        e = (ImageButton)findViewById(R.id.misnap_overlay_capture_button);
        f = (ImageButton)findViewById(R.id.overlay_cancel_button);
        b = i.getDrawable(R.drawable.misnap_doc_center);
        Z = (ImageView)findViewById(R.id.misnap_overlay_gauge);
        Z.setVisibility(4);
        aa = (ImageView)findViewById(R.id.misnap_balloon);
        aa.setVisibility(4);
        W = (ImageView)findViewById(R.id.misnap_bug);
        W.setVisibility(4);
        ac = (ImageView)findViewById(R.id.misnap_tutorial_overlay);
        ad = (ImageView)findViewById(R.id.misnap_vignette);
        y();
        ab = (ImageView)findViewById(R.id.misnap_ghost_image);
        aq = AnimationUtils.loadAnimation(B, R.anim.fadeout);
        ar = AnimationUtils.loadAnimation(B, R.anim.fadein);
        z();
        as = AnimationUtils.loadAnimation(B, R.anim.misnap_balloon_animation);
        h = (TextView)findViewById(R.id.misnap_overlay_test_text);
        if (q.a)
        {
            h.setVisibility(0);
        }
        setWillNotDraw(false);
        E = new Handler();
        k1 = B.e();
        if (aB)
        {
            if (k1 == 3)
            {
                k1 = R.drawable.icon_flash_on;
            } else
            {
                k1 = R.drawable.icon_flash_off;
            }
        } else
        if (k1 == 2)
        {
            k1 = R.drawable.icon_flash_on;
        } else
        {
            k1 = R.drawable.icon_flash_off;
        }
        g.setImageResource(k1);
        av = (RelativeLayout)findViewById(R.id.dialog_help_buttons);
        aw = (RelativeLayout)findViewById(R.id.rl_dialog_help);
        aw.setVisibility(4);
        ax = (Button)findViewById(R.id.btn_try_again);
        if (!B.a.b())
        {
            ax.setText(R.string.dialog_mitek_manual_capture);
            l.a(ax, R.string.dialog_mitek_manual_capture);
        }
        ax.setOnClickListener(new x(this));
        ay = (Button)findViewById(R.id.btn_cancel);
        ay.setOnClickListener(new y(this));
        postInvalidate();
        E.postDelayed(n, 1800L);
        return;
        try
        {
            i = B.getApplicationContext().getResources();
        }
        // Misplaced declaration of an exception variable
        catch (Handler handler)
        {
            i = B.getApplicationContext().getResources();
        }
          goto _L1
    }

    private t(MiSnap misnap, Handler handler, r r1, i i1, byte byte0)
    {
        this(misnap, handler, r1, i1);
    }

    t(MiSnap misnap, Handler handler, r r1, i i1, char c1)
    {
        this(misnap, handler, r1, i1, (byte)0);
    }

    static int A(t t1)
    {
        return t1.w();
    }

    private String A()
    {
        String s1 = null;
        String s2 = B.a.n();
        int i1;
        if (s2.startsWith("REMITTANCE"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_remittance);
            } else
            {
                s1 = i.getString(R.string.ghost_image_remittance_manual);
            }
        } else
        if (s2.startsWith("CheckBack"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_check);
            } else
            {
                s1 = i.getString(R.string.ghost_image_check_manual);
            }
        } else
        if (s2.startsWith("CheckFront") || s2.startsWith("ACH"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_check);
            } else
            {
                s1 = i.getString(R.string.ghost_image_check_manual);
            }
        } else
        if (s2.equals("BALANCE_TRANSFER"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_remittance);
            } else
            {
                s1 = i.getString(R.string.ghost_image_remittance_manual);
            }
        } else
        if (s2.startsWith("DRIVER_LICENSE"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_drivers_license);
            } else
            {
                s1 = i.getString(R.string.ghost_image_drivers_license_manual);
            }
        } else
        if (s2.startsWith("AUTO_INSURANCE"))
        {
            s1 = i.getString(R.string.ghost_image_insurance_card);
        } else
        if (s2.startsWith("VIN"))
        {
            s1 = i.getString(R.string.ghost_image_vin_manual);
        } else
        if (s2.startsWith("W2"))
        {
            if (B.a.b())
            {
                s1 = i.getString(R.string.ghost_image_w2);
            } else
            {
                s1 = i.getString(R.string.ghost_image_w2_manual);
            }
        }
        i1 = B.a.T();
        if (i1 == 0)
        {
            return s1;
        } else
        {
            return i.getString(i1);
        }
    }

    static RelativeLayout B(t t1)
    {
        return t1.aw;
    }

    private void B()
    {
        while (!B.a.y() || ab.isShown() || aj) 
        {
            return;
        }
        ab.startAnimation(ar);
        ar.setAnimationListener(new aa(this));
    }

    static RelativeLayout C(t t1)
    {
        return t1.av;
    }

    private void C()
    {
        if (ab.isShown() && !aj)
        {
            ab.startAnimation(aq);
            aq.setAnimationListener(new ab(this));
        }
    }

    static int D(t t1)
    {
        return t1.d(48);
    }

    static ImageView E(t t1)
    {
        return t1.ac;
    }

    static Button F(t t1)
    {
        return t1.ay;
    }

    static Button G(t t1)
    {
        return t1.ax;
    }

    static void H(t t1)
    {
        t1.x();
    }

    static void I(t t1)
    {
        t1.b(false);
        t1.j.sendEmptyMessage(8);
    }

    static String J(t t1)
    {
        if (t1.x == R.drawable.error_more_light)
        {
            return t1.B.getString(R.string.more_light);
        }
        if (t1.x == R.drawable.error_center)
        {
            return t1.B.getString(R.string.hold_center);
        }
        if (t1.x == R.drawable.error_getcloser)
        {
            return t1.B.getString(R.string.get_close);
        }
        if (t1.x == R.drawable.error_hold_steady)
        {
            return t1.B.getString(R.string.hold_steady);
        } else
        {
            return null;
        }
    }

    static boolean K(t t1)
    {
        return t1.v;
    }

    static void L(t t1)
    {
        t1.ap = 0L;
    }

    private static float a(float f1, float f2)
    {
        return 0.5F * f2 + 0.5F * f1;
    }

    private int a(String s1)
    {
        return i.getIdentifier(s1, "drawable", getContext().getPackageName());
    }

    static List a(t t1, List list, float f1)
    {
        list = b(list);
        t1.T = t1.c(list);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return list;
            }
            Point point = (Point)iterator.next();
            int i1 = point.x;
            int j1 = t1.T.x;
            int k1 = point.y;
            int l1 = t1.T.y;
            point.x = (int)((float)(i1 - j1) * f1 + (float)t1.T.x);
            point.y = (int)((float)(k1 - l1) * f1 + (float)t1.T.y);
        } while (true);
    }

    static void a(t t1, int i1)
    {
        t1.x = i1;
    }

    static void a(t t1, List list)
    {
        t1.P = list;
    }

    static void a(t t1, boolean flag)
    {
        t1.aD = flag;
    }

    private void a(List list)
    {
        N.reset();
        if (list == null || list.size() <= 3)
        {
            N.moveTo(0.0F, 0.0F);
            N.lineTo(0.0F, 0.0F);
            return;
        }
        N.moveTo(((Point)list.get(0)).x, ((Point)list.get(0)).y);
        int i1 = 1;
        do
        {
            if (i1 >= list.size())
            {
                N.close();
                return;
            }
            N.lineTo(((Point)list.get(i1)).x, ((Point)list.get(i1)).y);
            i1++;
        } while (true);
    }

    static boolean a(t t1)
    {
        return t1.r();
    }

    static b b(t t1)
    {
        return t1.ae;
    }

    private static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        do
        {
            if (i1 >= 4)
            {
                return arraylist;
            }
            Point point = (Point)list.get(i1);
            arraylist.add(new Point(point.x, point.y));
            i1++;
        } while (true);
    }

    static void b(t t1, int i1)
    {
        t1.D = i1;
    }

    static void b(t t1, boolean flag)
    {
        t1.c(flag);
    }

    private Point c(List list)
    {
        if (aI == null)
        {
            aI = new Point();
        }
        Point point = aI;
        int i1 = ((Point)list.get(0)).x;
        int j1 = ((Point)list.get(1)).x;
        int k1 = ((Point)list.get(2)).x;
        point.x = ((Point)list.get(3)).x + (i1 + j1 + k1) >> 2;
        point = aI;
        i1 = ((Point)list.get(0)).y;
        j1 = ((Point)list.get(1)).y;
        k1 = ((Point)list.get(2)).y;
        point.y = ((Point)list.get(3)).y + (i1 + j1 + k1) >> 2;
        return aI;
    }

    private void c(int i1)
    {
        Q.putIfAbsent(Integer.valueOf(i1), new AtomicInteger(0));
        ((AtomicInteger)Q.get(Integer.valueOf(i1))).incrementAndGet();
    }

    static void c(t t1)
    {
        if (t1.A && !t1.v() && !t1.r() && t1.B != null && t1.B.b != null && !t1.ak)
        {
            t1.ak = true;
            t1.ae = null;
            t1.af = null;
            t1.ag = null;
            t1.ah = null;
            t1.B.b.i();
        }
    }

    static void c(t t1, boolean flag)
    {
        t1.aj = flag;
    }

    private void c(boolean flag)
    {
        if (d != null)
        {
            d.setClickable(flag);
        }
        if (f != null)
        {
            f.setClickable(flag);
        }
        if (e != null)
        {
            e.setClickable(flag);
        }
        if (g != null && 8 != g.getVisibility())
        {
            g.setClickable(flag);
        }
        if (!flag)
        {
            l.a(d);
            l.a(g);
            l.a(f);
            l.a(e);
            l.a(ab);
            return;
        } else
        {
            l.b(d);
            l.b(g);
            l.b(f);
            l.b(e);
            l.b(ab);
            return;
        }
    }

    private int d(int i1)
    {
        return (int)TypedValue.applyDimension(1, i1, getResources().getDisplayMetrics());
    }

    static void d(t t1)
    {
        t1.az = false;
    }

    static void d(t t1, boolean flag)
    {
        t1.ai = flag;
    }

    static MitekAnalyzer e(t t1)
    {
        return t1.F;
    }

    static void f(t t1)
    {
        t1.v = true;
    }

    static b g(t t1)
    {
        return t1.af;
    }

    static b h(t t1)
    {
        return t1.ag;
    }

    static ImageView i(t t1)
    {
        return t1.Z;
    }

    static b j(t t1)
    {
        return t1.ah;
    }

    static boolean k(t t1)
    {
        return t1.A;
    }

    static boolean l(t t1)
    {
        return t1.az;
    }

    static Handler m(t t1)
    {
        return t1.E;
    }

    static MiSnap n(t t1)
    {
        return t1.B;
    }

    static ConcurrentHashMap o(t t1)
    {
        return t1.Q;
    }

    static ImageView p(t t1)
    {
        return t1.ab;
    }

    static boolean q(t t1)
    {
        return t1.aj;
    }

    static long r(t t1)
    {
        return t1.z;
    }

    private boolean r()
    {
        return ae != null && ae.a();
    }

    static Runnable s(t t1)
    {
        return t1.aF;
    }

    private boolean s()
    {
        return af != null && af.a();
    }

    static void t(t t1)
    {
        t1.R = true;
    }

    private boolean t()
    {
        return ag != null && ag.a();
    }

    static List u(t t1)
    {
        return t1.O;
    }

    private boolean u()
    {
        return ah != null && ah.a();
    }

    static void v(t t1)
    {
        if (!t1.t())
        {
            t1.v = false;
            t1.Z.setVisibility(0);
            t1.ag = com.miteksystems.misnap.j.a().e(t1.Z);
            t1.ag.b();
            t1.E.postDelayed(t1.aE, 750L);
        }
    }

    private boolean v()
    {
        return ai || s() || t() && u();
    }

    private int w()
    {
        if (S)
        {
            S = false;
            return B.a.L() * 1000;
        } else
        {
            return B.a.k() * 1000;
        }
    }

    static int w(t t1)
    {
        return t1.D;
    }

    static ImageView x(t t1)
    {
        return t1.aa;
    }

    private void x()
    {
        this;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            k.a();
        }
        b(false);
        if (!aD) goto _L2; else goto _L1
_L1:
        if (aw != null)
        {
            aw.setVisibility(4);
        }
        aD = false;
        j.sendEmptyMessage(2);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        B.a(R.string.uxp_timeout_help_end);
        if (!aA)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        j.obtainMessage(10).sendToTarget();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        j.obtainMessage(2).sendToTarget();
          goto _L3
    }

    static AlertDialog y(t t1)
    {
        return t1.C;
    }

    private void y()
    {
        if (B.a.b() && B.a.u() || !B.a.b() && B.a.v())
        {
            String s1 = B.a.n();
            getContext().getPackageName();
            int i1;
            int j1;
            if (s1.startsWith("REMITTANCE"))
            {
                i1 = a("mitek_vignette_remittance");
            } else
            if (s1.startsWith("CheckBack"))
            {
                i1 = a("mitek_vignette_checkback");
            } else
            if (s1.startsWith("CheckFront") || s1.startsWith("ACH"))
            {
                i1 = a("mitek_vignette_checkfront");
            } else
            if (s1.equals("BALANCE_TRANSFER"))
            {
                i1 = a("mitek_vignette_balance_transfer");
            } else
            if (s1.startsWith("DRIVER_LICENSE"))
            {
                i1 = a("mitek_vignette_driver_license");
            } else
            if (s1.equals("BUSINESS_CARD"))
            {
                i1 = a("mitek_vignette_business_card");
            } else
            if (s1.startsWith("AUTO_INSURANCE"))
            {
                i1 = a("mitek_vignette_auto_insurance");
            } else
            if (s1.startsWith("VIN"))
            {
                i1 = a("mitek_vignette_vin");
            } else
            if (s1.startsWith("W2"))
            {
                i1 = a("mitek_vignette_w2");
            } else
            {
                i1 = 0;
            }
            j1 = i1;
            if (i1 == 0)
            {
                j1 = a("mitek_vignette");
            }
            if (j1 != 0)
            {
                ad.setBackgroundResource(j1);
                ad.setVisibility(0);
            }
            return;
        } else
        {
            ad.setVisibility(4);
            return;
        }
    }

    static Runnable z(t t1)
    {
        return t1.aH;
    }

    private void z()
    {
        if (B.a.y() || B.a.B())
        {
            String s1 = B.a.n();
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)ab.getLayoutParams();
            int j1 = d(40);
            int i1;
            if (s1.startsWith("REMITTANCE"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_remittance;
                } else
                {
                    i1 = R.drawable.manual_ghost_remittance;
                }
                j1 = d(50);
            } else
            if (s1.startsWith("CheckBack"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_checkback;
                } else
                {
                    i1 = R.drawable.manual_ghost_checkback;
                }
                j1 = d(60);
            } else
            if (s1.startsWith("CheckFront") || s1.startsWith("ACH"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_checkfront;
                } else
                {
                    i1 = R.drawable.manual_ghost_checkfront;
                }
                j1 = d(60);
            } else
            if (s1.equals("BALANCE_TRANSFER"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_balance_transfer;
                } else
                {
                    i1 = R.drawable.manual_ghost_balance_transfer;
                }
                j1 = d(50);
            } else
            if (s1.startsWith("DRIVER_LICENSE"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_driver_license_landscape;
                } else
                {
                    i1 = R.drawable.manual_ghost_driver_license_landscape;
                }
            } else
            if (s1.equals("BUSINESS_CARD"))
            {
                i1 = R.drawable.ghost_business_card;
            } else
            if (s1.startsWith("AUTO_INSURANCE"))
            {
                i1 = R.drawable.ghost_auto_insurance_card;
            } else
            if (s1.startsWith("VIN"))
            {
                i1 = R.drawable.manual_ghost_vin;
            } else
            if (s1.startsWith("W2"))
            {
                if (B.a.b())
                {
                    i1 = R.drawable.ghost_w2;
                } else
                {
                    i1 = R.drawable.manual_ghost_w2;
                }
            } else
            {
                i1 = R.drawable.ghost_check_blank;
                j1 = d(60);
            }
            if (ab.getId() != i1)
            {
                ab.setImageDrawable(i.getDrawable(i1));
            }
            marginlayoutparams.topMargin = j1;
            marginlayoutparams.bottomMargin = j1;
            ab.setLayoutParams(marginlayoutparams);
            s1 = A();
            if (s1 != null)
            {
                ab.setContentDescription(s1);
            }
            if (B.a.b())
            {
                B();
            }
        }
    }

    public final int a(MitekAnalyzer mitekanalyzer)
    {
        int i1;
        boolean flag;
        if (!B.a.b())
        {
            return 0;
        }
        if (F == null)
        {
            F = mitekanalyzer;
        }
        if (!F.d())
        {
            c(0);
        } else
        if (F.l() != null && F.l().size() == 5 && !v())
        {
            boolean flag1 = F.a();
            if (!F.b() && !F.c())
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            if (!flag1)
            {
                c(1);
            }
            if (i1 == 0)
            {
                c(2);
            }
            if (flag1 && i1 != 0 && !F.e())
            {
                c(3);
            }
        }
        if (!B.p && (!aB && B.a.F() != 0 || aB && 3 == B.a.F()))
        {
            long l1 = System.currentTimeMillis();
            float f1;
            if (ao == 0L)
            {
                ao = l1;
            } else
            if (!F.a(B.a.E()) && l1 - ao > (long)B.a.D())
            {
                if (B.b.e())
                {
                    B.b.b(true);
                    g.setImageResource(R.drawable.icon_flash_on);
                    B.a(R.string.uxp_flash_auto_on);
                    j.sendEmptyMessage(13);
                }
                B.p = true;
                Q.clear();
            }
        }
        mitekanalyzer = F.l();
        if (mitekanalyzer != null && mitekanalyzer.size() == 5)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        f1 = 0.0F;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        f1 = Math.max((float)F.g() / (float)F.m() - 0.05F, (float)F.h() / (float)F.n() - 0.05F);
        L = (double)H / (double)J;
        M = (double)I / (double)K;
        if (O.size() != 0) goto _L4; else goto _L3
_L3:
        mitekanalyzer = mitekanalyzer.iterator();
_L9:
        if (mitekanalyzer.hasNext()) goto _L6; else goto _L5
_L5:
        T = c(O);
_L2:
        t = a(f1, t);
        u = t * t;
        Point point;
        if ((double)u > 0.94999999999999996D)
        {
            u = 1.0F;
        } else
        if (u < 0.0F)
        {
            u = 0.0F;
        }
        if (q.a)
        {
            if (aG != 0)
            {
                aG = aG - 1;
            } else
            {
                mitekanalyzer = new StringBuilder();
                if (q.c || 1.0F < al)
                {
                    long l2 = System.nanoTime();
                    am = (float)(int)((float)l2 - an) + am;
                    float f2 = am / al;
                    mitekanalyzer.append((new StringBuilder("FPS=")).append(String.format("%.02f", new Object[] {
                        Float.valueOf(1E+09F / f2)
                    })).toString());
                    al = al + 1.0F;
                    an = l2;
                }
                if (q.d)
                {
                    mitekanalyzer.append((new StringBuilder(String.valueOf(System.getProperty("line.separator")))).append("Light (target ").append(B.a.E() / 100).append("): ").append(String.format("%.01f", new Object[] {
                        Float.valueOf((float)F.j() / 100F)
                    })).toString());
                }
                if (q.e || q.f)
                {
                    mitekanalyzer.append(System.getProperty("line.separator"));
                }
                if (q.e)
                {
                    mitekanalyzer.append((new StringBuilder("Fill %: ")).append(String.format("%.01f", new Object[] {
                        Float.valueOf((float)F.g() / 10F)
                    })).toString());
                }
                if (q.e || q.f)
                {
                    mitekanalyzer.append("\t");
                }
                if (q.f)
                {
                    mitekanalyzer.append((new StringBuilder("Horiz Fill %: ")).append(String.format("%.01f", new Object[] {
                        Float.valueOf((float)F.h() / 10F)
                    })).toString());
                }
                if (q.e || q.f)
                {
                    mitekanalyzer.append((new StringBuilder(String.valueOf(System.getProperty("line.separator")))).append("MetricAvg: ").append(String.format("%.01f", new Object[] {
                        Float.valueOf(u)
                    })).toString());
                }
                h.setText(mitekanalyzer);
            }
        }
        f1 = (float)B.a.z() / 1000F;
        if ((float)B.a.j() * f1 < (float)F.g())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f1 * (float)B.a.s() < (float)F.h())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (az || i1 == 0 && !flag) goto _L8; else goto _L7
_L7:
        if ((ab.isShown() || !Z.isShown() && !B.a.y()) && !v())
        {
            if (B.a.y())
            {
                C();
            }
            if (!s())
            {
                Z.setVisibility(0);
                af = com.miteksystems.misnap.j.a().c(Z);
                af.b();
                E.postDelayed(p, 1250L);
            }
        } else
        {
            ap = 0L;
        }
_L14:
        postInvalidate();
        return 1;
_L6:
        point = (Point)mitekanalyzer.next();
        O.add(new Point((int)((double)point.x * L), (int)((double)point.y * M)));
          goto _L9
_L4:
        i1 = 0;
        while (i1 < 4) 
        {
            point = (Point)mitekanalyzer.get(i1);
            if (point.x != 0 && point.y != 0)
            {
                ((Point)O.get(i1)).x = (int)a((float)((double)point.x * L), ((Point)O.get(i1)).x);
                ((Point)O.get(i1)).y = (int)a((float)((double)point.y * M), ((Point)O.get(i1)).y);
            }
            i1++;
        }
          goto _L5
_L8:
        long l3;
        if (u <= 0.1F)
        {
            v = false;
        } else
        if (!ab.isShown() && u > 0.1F)
        {
            v = true;
        }
        l3 = System.currentTimeMillis();
        if (ap == 0L) goto _L11; else goto _L10
_L10:
        if (l3 - ap <= (long)B.a.A() || v() || ab.isShown() || aj || i1 != 0 || flag) goto _L13; else goto _L12
_L12:
        ap = l3;
        v = false;
        if (Z.isShown() && !ai)
        {
            Z.startAnimation(aq);
            aq.setAnimationListener(new ac(this));
        }
        if (B.a.y())
        {
            B();
        }
          goto _L14
_L13:
        if (!ab.isShown() && !aj) goto _L14; else goto _L11
_L11:
        ap = l3;
          goto _L14
    }

    final void a(int i1)
    {
        if (i1 == 1 && c != null)
        {
            c.setVisibility(4);
        }
    }

    final void a(int i1, int j1)
    {
        J = i1;
        K = j1;
    }

    final void a(boolean flag)
    {
        if (flag)
        {
            g.setVisibility(0);
            g.setClickable(true);
            return;
        } else
        {
            d.setLayoutParams(g.getLayoutParams());
            g.setClickable(false);
            g.setVisibility(8);
            return;
        }
    }

    final boolean a()
    {
        return A;
    }

    final void b()
    {
        B.l();
        A = true;
        E.removeCallbacks(aH);
        E.removeCallbacks(r);
        if (C != null)
        {
            Log.w("MiSnapUI", "auto-dismissing tutorial due to snapshotGood() call");
            C.dismiss();
        }
        k();
        if (B.a.b())
        {
            aa.clearAnimation();
            P = b(O);
            z = System.currentTimeMillis();
            E.post(aF);
            if (!u())
            {
                Z.setVisibility(0);
                ah = com.miteksystems.misnap.j.a().d(Z);
                ah.b();
                E.postDelayed(q, 400L);
            }
        } else
        {
            C();
        }
        v = false;
        if (!r())
        {
            W.setVisibility(0);
            E.postDelayed(m, 1600L);
            if (B.a.o())
            {
                ae = com.miteksystems.misnap.j.a().a(W);
            } else
            {
                ae = com.miteksystems.misnap.j.a().b(W);
            }
            ae.b();
        }
    }

    final void b(int i1)
    {
        String s1;
        int j1;
        j1 = 0xff000000;
        j();
        if (A || aw.isShown())
        {
            return;
        }
        B.h();
        b(true);
        c(false);
        s1 = null;
        i1;
        JVM INSTR tableswitch 0 3: default 76
    //                   0 132
    //                   1 1098
    //                   2 429
    //                   3 1098;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = j1;
_L8:
        aw.setBackgroundColor(i1);
        aw.setVisibility(0);
        av.setVisibility(0);
        if (k != null)
        {
            k.a(s1);
        }
        B.a(R.string.uxp_timeout_help_begin);
        postInvalidate();
        return;
_L2:
        aA = true;
        i1 = 0xff000000 | B.a.W();
        int k1 = B.a.R();
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.failover_check_tutorial_pic);
            if (k1 == 0)
            {
                s1 = i.getString(R.string.help_failover_check);
            } else
            {
                s1 = i.getString(k1);
            }
            l.a(ac, s1);
        } else
        {
            ac.setImageResource(R.drawable.failover_tutorial_pic);
            if (k1 == 0)
            {
                s1 = i.getString(R.string.help_failover_document);
            } else
            {
                s1 = i.getString(k1);
            }
            l.a(ac, s1);
        }
        if (B.a.au())
        {
            ay.setVisibility(8);
        } else
        {
            ay.setVisibility(0);
            ay.setText(B.a.ae());
            l.a(ay, B.a.ae());
        }
        if (B.a.as())
        {
            ax.setText(R.string.dialog_mitek_capture);
            l.a(ax, R.string.dialog_mitek_capture);
        } else
        {
            ax.setText(B.a.af());
            l.a(ax, B.a.af());
        }
          goto _L5
_L4:
        i1 = 0xff000000 | B.a.X();
        if (B.a.b() && !aA)
        {
            int l1 = B.a.Q();
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.check_tutorial_pic);
                if (l1 == 0)
                {
                    s1 = i.getString(R.string.help_check);
                } else
                {
                    s1 = i.getString(l1);
                }
                l.a(ac, s1);
            } else
            {
                ac.setImageResource(R.drawable.tutorial_pic);
                if (l1 == 0)
                {
                    s1 = i.getString(R.string.help_document);
                } else
                {
                    s1 = i.getString(l1);
                }
                l.a(ac, s1);
            }
            if (B.a.ao())
            {
                ay.setVisibility(8);
            } else
            {
                ay.setVisibility(0);
                if (B.a.am())
                {
                    ay.setText(R.string.dialog_mitek_cancel);
                    l.a(ay, R.string.dialog_mitek_cancel);
                } else
                {
                    ay.setText(B.a.aa());
                    l.a(ay, B.a.aa());
                }
            }
            if (B.a.an())
            {
                ax.setText(R.string.dialog_mitek_capture);
                l.a(ax, R.string.dialog_mitek_capture);
            } else
            {
                ax.setText(B.a.ab());
                l.a(ax, B.a.ab());
            }
        } else
        {
            int i2 = B.a.S();
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.manual_check_tutorial_pic);
                if (i2 == 0)
                {
                    s1 = i.getString(R.string.help_manual_check);
                } else
                {
                    s1 = i.getString(i2);
                }
                l.a(ac, s1);
            } else
            {
                ac.setImageResource(R.drawable.manual_tutorial_pic);
                if (i2 == 0)
                {
                    s1 = i.getString(R.string.help_manual_document);
                } else
                {
                    s1 = i.getString(i2);
                }
                l.a(ac, s1);
            }
            if (B.a.ax())
            {
                ay.setVisibility(8);
            } else
            {
                ay.setVisibility(0);
                if (B.a.av())
                {
                    ay.setText(R.string.dialog_mitek_cancel);
                    l.a(ay, R.string.dialog_mitek_cancel);
                } else
                {
                    ay.setText(B.a.ag());
                    l.a(ay, B.a.ag());
                }
            }
            if (B.a.aw())
            {
                ax.setText(R.string.dialog_mitek_manual_capture);
                l.a(ax, R.string.dialog_mitek_manual_capture);
            } else
            {
                ax.setText(B.a.ah());
                l.a(ax, B.a.ah());
            }
        }
          goto _L5
_L3:
        i1 = 0xff000000 | B.a.U();
        int j2 = B.a.Q();
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.check_tutorial_pic);
            if (j2 == 0)
            {
                s1 = i.getString(R.string.help_check);
            } else
            {
                s1 = i.getString(j2);
            }
            l.a(ac, s1);
        } else
        {
            ac.setImageResource(R.drawable.tutorial_pic);
            if (j2 == 0)
            {
                s1 = i.getString(R.string.help_document);
            } else
            {
                s1 = i.getString(j2);
            }
            l.a(ac, s1);
        }
        if (!B.a.ar()) goto _L7; else goto _L6
_L6:
        ay.setVisibility(8);
_L9:
        if (B.a.aq())
        {
            ax.setText(R.string.dialog_mitek_try_again);
            l.a(ax, R.string.dialog_mitek_try_again);
        } else
        {
            ax.setText(B.a.ad());
            l.a(ax, B.a.ad());
        }
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        ay.setVisibility(0);
        if (B.a.ap())
        {
            ay.setText(R.string.dialog_mitek_cancel);
            l.a(ay, R.string.dialog_mitek_cancel);
        } else
        {
            ay.setText(B.a.ac());
            l.a(ay, B.a.ac());
        }
          goto _L9
    }

    final void b(boolean flag)
    {
        if (ay != null)
        {
            ay.setClickable(flag);
        }
        if (ax != null)
        {
            ax.setClickable(flag);
        }
        if (!flag)
        {
            l.a(ay);
            l.a(ax);
            return;
        } else
        {
            l.b(ay);
            l.b(ax);
            return;
        }
    }

    final void c()
    {
        float f1 = H / 2.0F - (float)(aa.getWidth() / 2);
        if (v)
        {
            f1 = (float)(((double)(u * (float)(Z.getRight() - Z.getLeft())) * 0.55000000000000004D + (double)Z.getLeft()) - (double)(aa.getWidth() / 2));
            b.setVisible(false, false);
        }
        aa.setVisibility(0);
        aa.setImageResource(x);
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)aa.getLayoutParams();
        marginlayoutparams.leftMargin = (int)f1;
        aa.setLayoutParams(marginlayoutparams);
        as.setAnimationListener(new z(this));
        aa.setAnimation(as);
        aa.startAnimation(as);
        Q.clear();
    }

    public final int d()
    {
        return D;
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        canvas.rotate(B.j(), getWidth() / 2, getHeight() / 2);
        at = canvas.getMatrix();
        canvas.save();
        canvas.setMatrix(at);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float af1[] = au;
        af1[0] = motionevent.getX();
        af1[1] = motionevent.getY();
        if (B.k())
        {
            motionevent.setLocation(af1[0], af1[1]);
        } else
        {
            motionevent.setLocation((float)getWidth() - af1[0], (float)getHeight() - af1[1]);
        }
        return super.dispatchTouchEvent(motionevent);
    }

    public final void e()
    {
        y();
        if (B.a.B())
        {
            ab.setVisibility(0);
            return;
        } else
        {
            ab.setVisibility(4);
            return;
        }
    }

    public final boolean f()
    {
        return aw.isShown();
    }

    public final boolean g()
    {
        return aA;
    }

    final void h()
    {
        c(false);
        if (k != null)
        {
            k.a();
        }
        int i1;
        if (B.a.b())
        {
            if (B.a.aA())
            {
                ac.setImageResource(R.drawable.check_tutorial_first_time_user_pic);
                i1 = R.string.misnap_tutorial_check;
            } else
            {
                ac.setImageResource(R.drawable.tutorial_first_time_user_pic);
                i1 = R.string.misnap_tutorial_document;
            }
        } else
        if (B.a.aA())
        {
            ac.setImageResource(R.drawable.manual_check_tutorial_first_time_user_pic);
            i1 = R.string.help_failover_check;
        } else
        {
            ac.setImageResource(R.drawable.manual_tutorial_first_time_user_pic);
            i1 = R.string.help_failover_document;
        }
        if (k != null)
        {
            Object obj;
            if (k.b.P() == 0)
            {
                obj = i.getString(i1);
            } else
            {
                obj = i.getString(k.b.P());
            }
            k.a(((String) (obj)));
            l.a(ac, ((String) (obj)));
        }
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(0, 0, 0, 0);
        ac.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        av.setVisibility(8);
        aw.setBackgroundColor(B.a.V() | 0xff000000);
        aw.setVisibility(0);
        E.postDelayed(s, B.a.M());
        a = true;
    }

    final void i()
    {
        aw.setVisibility(4);
        av.setVisibility(4);
        c(true);
        if (!B.a.b())
        {
            j.sendEmptyMessage(12);
        } else
        {
            j.sendEmptyMessage(15);
        }
        MiSnap.q = true;
    }

    final void j()
    {
        E.removeCallbacks(r);
        E.removeCallbacks(aH);
        aa.setVisibility(4);
    }

    final void k()
    {
        c(false);
        if (d != null)
        {
            d.setVisibility(4);
        }
        if (f != null)
        {
            f.setVisibility(4);
        }
        if (g != null)
        {
            g.setVisibility(4);
        }
        if (e != null)
        {
            e.setVisibility(4);
        }
    }

    final void l()
    {
        if (B.a.k() != 0 && B.a.b())
        {
            E.postDelayed(aH, w());
        }
        if (!a)
        {
            if (aw != null)
            {
                aw.setVisibility(4);
            }
            c(true);
        }
    }

    final void m()
    {
        if (B.a.b() && B.a.I())
        {
            E.postDelayed(r, B.a.J());
        }
    }

    final void n()
    {
        z();
        e.setVisibility(0);
        e.setClickable(true);
        if (E != null)
        {
            E.removeCallbacks(r);
        }
        Z.setVisibility(4);
        v = false;
        t = 0.0F;
        if (B.a.B())
        {
            ab.setAlpha(B.a.C());
            ab.setVisibility(0);
        } else
        {
            ab.setVisibility(4);
        }
        if (!a)
        {
            if (aw != null)
            {
                aw.setVisibility(4);
            }
            c(true);
        }
    }

    public final void o()
    {
        if (k != null)
        {
            String s1 = A();
            if (s1 != null)
            {
                k.a(s1);
            }
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        H = getWidth();
        I = getHeight();
        if (V == null)
        {
            int i1 = (int)Math.min(H / 10F, 100F);
            b.setBounds(0, 0, i1, i1);
            V = Bitmap.createBitmap(i1, i1, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas1 = new Canvas(V);
            b.draw(canvas1);
        }
        if (F != null)
        {
            if (R)
            {
                a(P);
                canvas.drawPath(N, G);
            }
            if (v)
            {
                w.reset();
                w.postTranslate(T.x - V.getWidth() / 2, T.y - V.getHeight() / 2);
                canvas.drawBitmap(V, w, G);
            }
            if (v && !v())
            {
                int j1 = (int)(u * 20F);
                Z.setImageResource(y[j1]);
                return;
            }
        }
    }

    final void p()
    {
        postInvalidate();
        if (F != null)
        {
            F.i = true;
            E.postDelayed(o, B.a.w());
        }
    }

    final void q()
    {
        a = false;
        synchronized (B.g)
        {
            E.removeCallbacks(aH);
            E.removeCallbacks(r);
            E.removeCallbacks(m);
            E.removeCallbacks(p);
            E.removeCallbacks(aE);
            E.removeCallbacks(q);
            E.removeCallbacks(n);
            E.removeCallbacks(aF);
            E.removeCallbacks(s);
        }
        if (ab != null)
        {
            ab.setImageDrawable(null);
            ab.destroyDrawingCache();
        }
        if (aa != null)
        {
            aa.setImageDrawable(null);
            aa.destroyDrawingCache();
        }
        if (b != null)
        {
            b.setCallback(null);
            b = null;
        }
        if (W != null)
        {
            W.setImageDrawable(null);
            W.destroyDrawingCache();
        }
        if (ad != null)
        {
            ad.setBackgroundResource(0);
            ad.destroyDrawingCache();
        }
        if (ac != null)
        {
            ac.setImageResource(0);
            ac.destroyDrawingCache();
        }
        if (aa != null)
        {
            aa.setImageResource(0);
            aa.destroyDrawingCache();
        }
        if (Z != null)
        {
            Z.setImageResource(0);
            Z.destroyDrawingCache();
        }
        if (g != null)
        {
            g.setImageResource(0);
            g.destroyDrawingCache();
        }
        if (e != null)
        {
            e.setBackgroundResource(0);
        }
        if (f != null)
        {
            f.setBackgroundResource(0);
        }
        if (d != null)
        {
            d.setBackgroundResource(0);
        }
        if (ax != null)
        {
            ax.setBackgroundResource(0);
        }
    }

}
