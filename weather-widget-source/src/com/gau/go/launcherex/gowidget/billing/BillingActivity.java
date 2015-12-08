// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.a.f.c;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.googleplay.Purchase;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.language.b;
import com.gau.go.launcherex.gowidget.statistics.n;
import com.gau.go.launcherex.gowidget.statistics.o;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.scroller.AnimViewScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.a;
import com.gau.go.launcherex.gowidget.weather.view.AgreementActivity;
import com.gau.go.launcherex.gowidget.weather.view.Indicator;
import com.gau.go.launcherex.gowidget.weather.view.ViewPage;
import com.gau.go.launcherex.gowidget.weather.view.WeatherDetailActivity;
import com.gau.go.launcherex.gowidget.weather.view.at;
import com.gau.go.launcherex.gowidget.weather.view.i;
import com.google.analytics.tracking.android.EasyTracker;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.gau.go.launcherex.gowidget.billing:
//            n, b, j, o, 
//            e, c, d, f, 
//            l, i, h, a

public class BillingActivity extends GoWeatherEXActivity
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.gau.go.launcherex.gowidget.billing.n, com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabPurchaseFinishedListener, a
{

    private View A;
    private at B;
    private View C;
    private ImageButton D;
    private Animation E;
    private Animation F;
    private int G;
    private ListView H;
    private Dialog I;
    private View J;
    private LinearLayout K;
    private View L;
    private ViewStub M;
    private ViewStub N;
    private Runnable O;
    private l a;
    private View b;
    private View c;
    private View d;
    private Indicator e;
    private TextView f;
    private LayoutInflater g;
    private int h;
    private int i;
    private Handler j;
    private h k;
    private Dialog l;
    private j m;
    private SharedPreferences n;
    private Intent o;
    private ConcurrentLinkedQueue p;
    private o q;
    private int r;
    private int s;
    private AnimViewScrollGroup t;
    private f u;
    private Dialog v;
    private int w;
    private boolean x;
    private com.gau.go.launcherex.gowidget.billing.o y;
    private boolean z;

    public BillingActivity()
    {
        n = null;
        o = null;
        p = new ConcurrentLinkedQueue();
        w = -1;
        I = null;
        O = new com.gau.go.launcherex.gowidget.billing.b(this);
    }

    static AnimViewScrollGroup a(BillingActivity billingactivity)
    {
        return billingactivity.t;
    }

    private void a(Intent intent)
    {
        boolean flag = u.b();
        if (intent != null)
        {
            z = intent.getBooleanExtra("extra_goto_main_activity", false);
            w = intent.getIntExtra("recommend_type", -1);
            r = intent.getIntExtra("recommend_enterance", -1);
            if (r != -1 && !flag)
            {
                q.a(new n(r, 1, 0, 0, 0, 0));
            }
        }
    }

    static void a(BillingActivity billingactivity, String s1, String s2)
    {
        billingactivity.b(s1, s2);
    }

    static void a(BillingActivity billingactivity, boolean flag)
    {
        billingactivity.a(flag);
    }

    private void a(ViewPage viewpage)
    {
        if (viewpage.d() == 7)
        {
            t.addView(viewpage, 0);
            return;
        } else
        {
            t.addView(viewpage);
            return;
        }
    }

    private void a(String s1, String s2)
    {
        if (m == null)
        {
            Object obj = g.inflate(0x7f0300dd, null);
            m = new j(this, null);
            m.a = (TextView)((View) (obj)).findViewById(0x7f090061);
            m.b = (TextView)((View) (obj)).findViewById(0x7f090424);
            l = new Dialog(this, 0x7f07000f);
            l.setOnDismissListener(this);
            l.setContentView(((View) (obj)));
            obj = l.getWindow().getAttributes();
            obj.height = -1;
            obj.width = -1;
        }
        if (!TextUtils.isEmpty(s1))
        {
            m.a.setText(s1);
        }
        m.b.setText(s2);
        if (!isFinishing() && !l.isShowing())
        {
            l.show();
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            if (I == null)
            {
                k();
            }
            if (!I.isShowing())
            {
                I.show();
            }
        } else
        if (I != null && I.isShowing())
        {
            I.dismiss();
            return;
        }
    }

    static int b(BillingActivity billingactivity)
    {
        return billingactivity.i;
    }

    private void b()
    {
        b = findViewById(0x7f0900a1);
        c = findViewById(0x7f0900a2);
        d = findViewById(0x7f0900a6);
        A = findViewById(0x7f090409);
        D = (ImageButton)findViewById(0x7f09009f);
        L = findViewById(0x7f0900a5);
        i i1;
        if (y.b())
        {
            D.setVisibility(0);
        } else
        {
            D.setVisibility(8);
        }
        if (u.b())
        {
            b.setVisibility(8);
        } else
        {
            L.setVisibility(4);
            if (y.a())
            {
                d.setVisibility(0);
            } else
            {
                d.setVisibility(8);
            }
        }
        e = (Indicator)findViewById(0x7f0900a0);
        f = (TextView)findViewById(0x7f090071);
        f.getPaint().setFlags(8);
        t = (AnimViewScrollGroup)findViewById(0x7f09009e);
        t.a(true);
        e = (Indicator)findViewById(0x7f0900a0);
        e.a(0x7f02002c, 0x7f02002b);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        D.setOnClickListener(this);
        f.setOnClickListener(this);
        i1 = new i(this);
        if (!u.a(8))
        {
            a(i1.a(this, 0));
        }
        if (GoWidgetApplication.a && com.gau.go.launcherex.gowidget.weather.util.f.a(getApplicationContext()).j())
        {
            a(i1.a(this, 8));
        }
        a(i1.a(this, 2));
        a(i1.a(this, 1));
        a(i1.a(this, 4));
        a(i1.a(this, 3));
        a(i1.a(this, 5));
        a(i1.a(this, 6));
        t.a();
        t.a(this);
        e.a(t.getChildCount());
        e.c(com.gau.go.a.f.c.a(10F));
        e.b(0);
        if (w != -1)
        {
            i = d(w);
        } else
        {
            i = 0;
        }
        ((ViewPage)t.getChildAt(i)).a();
        h = i;
        t.a(i);
    }

    static void b(BillingActivity billingactivity, String s1, String s2)
    {
        billingactivity.a(s1, s2);
    }

    static void b(BillingActivity billingactivity, boolean flag)
    {
        billingactivity.b(flag);
    }

    private void b(String s1, String s2)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runOnUiThread(new e(this, s1, s2));
            return;
        } else
        {
            a(s1, s2);
            return;
        }
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            if (M != null)
            {
                A = M.inflate();
                M = null;
                b();
            }
            A.setVisibility(0);
            A.startAnimation(E);
            if (C != null)
            {
                C.setVisibility(8);
                C.startAnimation(F);
            }
            return;
        }
        if (N != null && N.getParent() != null)
        {
            C = N.inflate();
            N = null;
            B = new at(this, C);
            B.a(this);
            B.a(false);
            B.a(u.c(), u.b());
        }
        if (A != null)
        {
            A.setVisibility(8);
            A.startAnimation(F);
        }
        C.setVisibility(0);
        C.startAnimation(E);
    }

    private boolean b(ArrayList arraylist)
    {
        String s1 = "";
        if (arraylist.contains("go_weather_ex_premium_pack_vip"))
        {
            s1 = "go_weather_ex_premium_pack_vip";
        } else
        if (arraylist.contains("go_weather_ex_premium_pack_vip_promo"))
        {
            s1 = "go_weather_ex_premium_pack_vip_promo";
        }
        if (!"".equals(s1))
        {
            if (u.a(s1, true))
            {
                u.b(s1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static Dialog c(BillingActivity billingactivity)
    {
        return billingactivity.v;
    }

    private boolean c(ArrayList arraylist)
    {
        String s1 = "";
        if (arraylist.contains("go_weather_ex_premium_pack_theme_vip"))
        {
            s1 = "go_weather_ex_premium_pack_theme_vip";
        } else
        if (arraylist.contains("go_weather_ex_premium_pack_theme_vip_promo"))
        {
            s1 = "go_weather_ex_premium_pack_theme_vip_promo";
        }
        if (!"".equals(s1))
        {
            if (u.a(s1, true))
            {
                u.b(s1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    private int d(int i1)
    {
        int j1 = h(i1);
        int k1 = t.getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            if (((ViewPage)t.getChildAt(i1)).d() == j1)
            {
                return i1;
            }
        }

        return 0;
    }

    static void d(BillingActivity billingactivity)
    {
        billingactivity.g();
    }

    private boolean d(ArrayList arraylist)
    {
        String s1 = "";
        if (arraylist.contains("com.gau.go.launcherex.gowidget.weatherwidge.billingpay1"))
        {
            s1 = "com.gau.go.launcherex.gowidget.weatherwidge.billingpay1";
        } else
        if (arraylist.contains("go_weather_ex_premium_pack_promotions"))
        {
            s1 = "go_weather_ex_premium_pack_promotions";
        }
        if (!"".equals(s1))
        {
            if (u.a(s1, true))
            {
                u.b(s1);
                f();
            }
            return true;
        } else
        {
            return false;
        }
    }

    static f e(BillingActivity billingactivity)
    {
        return billingactivity.u;
    }

    private void e(int i1)
    {
        if (!x)
        {
            x = true;
            G = 1;
            s = i1;
            q.a(new n(r, 0, 0, s, 1, 0));
            h();
        }
    }

    static int f(BillingActivity billingactivity)
    {
        return billingactivity.s;
    }

    private void f()
    {
        if (v == null)
        {
            View view = g.inflate(0x7f030039, null, false);
            Button button = (Button)view.findViewById(0x7f0901b9);
            v = new Dialog(this, 0x7f07000f);
            v.setContentView(view);
            button.setOnClickListener(new com.gau.go.launcherex.gowidget.billing.c(this));
            v.setOnKeyListener(new d(this));
        }
        if (!isFinishing() && !v.isShowing())
        {
            v.show();
        }
    }

    private void f(int i1)
    {
        if (!x)
        {
            x = true;
            G = 2;
            s = i1;
            q.a(new n(r, 0, 0, s, 1, 0));
            h();
        }
    }

    static int g(BillingActivity billingactivity)
    {
        return billingactivity.r;
    }

    private void g()
    {
        if (l != null && l.isShowing() && !isFinishing())
        {
            if (Looper.getMainLooper().getThread() != Thread.currentThread())
            {
                runOnUiThread(new com.gau.go.launcherex.gowidget.billing.f(this));
            } else
            if (!isFinishing())
            {
                l.dismiss();
                return;
            }
        }
    }

    private void g(int i1)
    {
        if (!x)
        {
            x = true;
            G = 3;
            s = i1;
            q.a(new n(r, 0, 0, s, 1, 0));
            h();
        }
    }

    private int h(int i1)
    {
        switch (i1)
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 4: // '\004'
            return 5;

        case 3: // '\003'
            return 4;

        case 2: // '\002'
            return 3;

        case 5: // '\005'
            return 8;
        }
    }

    static o h(BillingActivity billingactivity)
    {
        return billingactivity.q;
    }

    private void h()
    {
        b(getString(0x7f080322), getString(0x7f08033b));
        a.a(this);
    }

    static View i(BillingActivity billingactivity)
    {
        return billingactivity.b;
    }

    private String i()
    {
        switch (G)
        {
        default:
            return "";

        case 1: // '\001'
            return "com.gau.go.launcherex.gowidget.weatherwidge.billingpay1";

        case 3: // '\003'
            return "go_weather_ex_premium_pack_theme_vip";

        case 2: // '\002'
            return "go_weather_ex_premium_pack_vip";
        }
    }

    private void j()
    {
        Intent intent = getIntent();
        intent.setClass(this, com/gau/go/launcherex/gowidget/weather/view/WeatherDetailActivity);
        startActivity(intent);
        finish();
    }

    static void j(BillingActivity billingactivity)
    {
        billingactivity.f();
    }

    static at k(BillingActivity billingactivity)
    {
        return billingactivity.B;
    }

    private void k()
    {
        J = g.inflate(0x7f03011d, null);
        K = (LinearLayout)J.findViewById(0x7f090558);
        float f1;
        Window window;
        DisplayMetrics displaymetrics;
        android.view.WindowManager.LayoutParams layoutparams;
        if (y.a())
        {
            K.setBackgroundResource(0x7f0205ed);
        } else
        {
            K.setBackgroundResource(0x7f0205ee);
        }
        H = (ListView)J.findViewById(0x7f090559);
        H.setOnItemClickListener(this);
        H.setAdapter(new com.gau.go.launcherex.gowidget.billing.i(this));
        I = new Dialog(this, 0x7f07001c);
        I.setContentView(J);
        I.setCanceledOnTouchOutside(true);
        window = I.getWindow();
        window.clearFlags(0x8000000);
        window.setGravity(49);
        displaymetrics = e().getDisplayMetrics();
        f1 = displaymetrics.density;
        layoutparams = window.getAttributes();
        layoutparams.x = 0;
        layoutparams.y = Math.max(displaymetrics.widthPixels, displaymetrics.heightPixels) - (int)(f1 * 361F);
        layoutparams.width = -1;
        layoutparams.height = -2;
        if (y.a())
        {
            window.setWindowAnimations(0x7f070015);
            return;
        } else
        {
            window.setWindowAnimations(0x7f070016);
            return;
        }
    }

    static View l(BillingActivity billingactivity)
    {
        return billingactivity.C;
    }

    static Dialog m(BillingActivity billingactivity)
    {
        return billingactivity.l;
    }

    static LayoutInflater n(BillingActivity billingactivity)
    {
        return billingactivity.g;
    }

    public void a()
    {
        g();
        com.gau.go.launcherex.gowidget.billing.l.a(this, getString(0x7f080330));
        x = false;
    }

    public void a(int i1)
    {
        j.removeCallbacks(O);
    }

    public void a(int i1, int j1)
    {
        e.b(i1);
    }

    public void a(ArrayList arraylist)
    {
        boolean flag1 = true;
        if (!b(arraylist)) goto _L2; else goto _L1
_L1:
        boolean flag;
        x = false;
        flag = false;
_L4:
        if (flag)
        {
            arraylist = i();
            if (!"".equals(arraylist))
            {
                a.a().launchPurchaseFlow(this, arraylist, 100, this);
            } else
            {
                x = false;
            }
        } else
        {
            x = false;
        }
        g();
        return;
_L2:
        flag = flag1;
        switch (G)
        {
        default:
            flag = false;
            break;

        case 1: // '\001'
            flag = flag1;
            if (d(arraylist))
            {
                flag = false;
            }
            break;

        case 3: // '\003'
            flag = flag1;
            if (c(arraylist))
            {
                flag = false;
            }
            break;

        case 2: // '\002'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b(int i1)
    {
        if (h != i1)
        {
            ((ViewPage)t.getChildAt(h)).b();
        }
        ViewPage viewpage = (ViewPage)t.getChildAt(i1);
        if (i != i1)
        {
            i = i1;
            h = i1;
            viewpage.a();
        }
        j.postDelayed(O, viewpage.c());
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        if (s != 1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 909 909: default 28
    //                   909 29;
           goto _L3 _L4
_L3:
        return;
_L4:
        if (j1 == -1)
        {
            b(((String) (null)), getString(0x7f08033c));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        IabHelper iabhelper = a.a();
        if (iabhelper != null && !iabhelper.handleActivityResult(i1, j1, intent))
        {
            super.onActivityResult(i1, j1, intent);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        if (!view.equals(c)) goto _L2; else goto _L1
_L1:
        if (!y.b() || u.c() || u.d()) goto _L4; else goto _L3
_L3:
        q.a(new n(r, 0, 0, 5, 1, 0));
        a(true);
_L6:
        return;
_L4:
        e(2);
        return;
_L2:
        if (!view.equals(d))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.gau.go.launcherex.gowidget.c.g.a(this))
        {
            Toast.makeText(this, 0x7f0801d0, 0).show();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (view.equals(f))
        {
            startActivity(new Intent(this, com/gau/go/launcherex/gowidget/weather/view/AgreementActivity));
            return;
        }
        if (view.equals(D))
        {
            b(false);
            return;
        }
        if (B != null)
        {
            if (view.equals(B.a))
            {
                b(true);
                return;
            }
            if (view.equals(B.b) || view.equals(B.d))
            {
                g(3);
                return;
            }
            if (view.equals(B.c))
            {
                f(4);
                return;
            }
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300b7);
        M = (ViewStub)findViewById(0x7f090408);
        N = (ViewStub)findViewById(0x7f09040a);
        getWindow().clearFlags(0x8000000);
        getWindow().setFormat(-3);
        g = getLayoutInflater();
        u = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).e();
        a = new l(getApplicationContext());
        y = new com.gau.go.launcherex.gowidget.billing.o(this);
        n = GoWidgetApplication.c(getApplicationContext()).a();
        q = new o(getApplicationContext());
        E = new AlphaAnimation(0.0F, 1.0F);
        E.setDuration(250L);
        F = new AlphaAnimation(1.0F, 0.0F);
        F.setDuration(250L);
        k = new h(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        registerReceiver(k, bundle);
        j = new com.gau.go.launcherex.gowidget.billing.a(this);
        a(getIntent());
        if (w == 6)
        {
            b(false);
            return;
        } else
        {
            b(true);
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        j.removeCallbacks(O);
        unregisterReceiver(k);
        a.b();
        if (B != null)
        {
            B.a();
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (dialoginterface.equals(l) && m.b.getText().toString().equals(getString(0x7f08033b)))
        {
            j.removeMessages(1);
        }
    }

    public void onIabPurchaseFinished(IabResult iabresult, Purchase purchase)
    {
        IabHelper iabhelper = a.a();
        if (!iabresult.isFailure()) goto _L2; else goto _L1
_L1:
        iabhelper.logDebug((new StringBuilder()).append("Error onIabPurchaseFinished: ").append(iabresult).toString());
        iabhelper.logDebug("purchase failture");
_L4:
        g();
        x = false;
        return;
_L2:
        if (a.a(purchase.getSku()))
        {
            iabhelper.logDebug((new StringBuilder()).append("Success purchasing: ").append(iabresult).toString());
            iabhelper.logDebug("purchase success");
            iabresult = purchase.getSku();
            u.a(iabresult, true);
            u.b(iabresult);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (I.isShowing())
        {
            I.dismiss();
        }
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            e(50);
            return;

        case 1: // '\001'
            g(51);
            return;

        case 2: // '\002'
            f(52);
            break;
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && z)
        {
            j();
        }
        return super.onKeyDown(i1, keyevent);
    }

    protected void onNewIntent(Intent intent)
    {
        a(intent);
    }

    protected void onPause()
    {
        super.onPause();
        j.removeCallbacks(O);
    }

    protected void onResume()
    {
        super.onResume();
        g();
        j.removeCallbacks(O);
        if (i != -1 && t != null)
        {
            ViewPage viewpage = (ViewPage)t.getChildAt(i);
            if (viewpage != null)
            {
                j.postDelayed(O, viewpage.c());
            }
        }
    }

    protected void onStart()
    {
        super.onStart();
        EasyTracker.getInstance().activityStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        EasyTracker.getInstance().activityStop(this);
    }
}
