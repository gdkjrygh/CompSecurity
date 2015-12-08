// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.recommendvip;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.gau.go.a.e;
import com.gau.go.a.f.c;
import com.gau.go.launcherex.goweather.goplay.a.d;
import com.gau.go.launcherex.gowidget.billing.l;
import com.gau.go.launcherex.gowidget.billing.n;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.googleplay.Purchase;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.statistics.o;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.scroller.AnimViewScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.a;
import com.gau.go.launcherex.gowidget.weather.view.Indicator;
import com.gau.go.launcherex.gowidget.weather.view.ViewPage;
import com.gau.go.launcherex.gowidget.weather.view.i;
import com.go.weatherex.i.b;
import com.google.analytics.tracking.android.EasyTracker;
import com.jiubang.golauncher.purchase.sevendaypurchase.SevenDayPurchaseGoogleActivity;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.recommendvip:
//            b, h, e, c, 
//            d, f, g, a

public class RecommendVipActivity extends GoWeatherEXActivity
    implements android.content.DialogInterface.OnDismissListener, android.view.View.OnClickListener, n, com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabPurchaseFinishedListener, a
{

    private l a;
    private LayoutInflater b;
    private int c;
    private int d;
    private Handler e;
    private g f;
    private Dialog g;
    private h h;
    private o i;
    private int j;
    private int k;
    private AnimViewScrollGroup l;
    private f m;
    private Dialog n;
    private boolean o;
    private int p;
    private Button q;
    private Indicator r;
    private RelativeLayout s;
    private Runnable t;

    public RecommendVipActivity()
    {
        t = new com.go.weatherex.recommendvip.b(this);
    }

    static AnimViewScrollGroup a(RecommendVipActivity recommendvipactivity)
    {
        return recommendvipactivity.l;
    }

    private void a(Intent intent)
    {
        boolean flag = m.b();
        if (intent != null)
        {
            j = intent.getIntExtra("recommend_enterance", -1);
            if (j != -1 && !flag)
            {
                i.a(new com.gau.go.launcherex.gowidget.statistics.n(j, 1, 0, 0, 0, 0));
            }
        }
    }

    private void a(ViewPage viewpage)
    {
        if (viewpage.d() == 7)
        {
            l.addView(viewpage, 0);
            return;
        } else
        {
            l.addView(viewpage);
            return;
        }
    }

    static void a(RecommendVipActivity recommendvipactivity, String s1, String s2)
    {
        recommendvipactivity.b(s1, s2);
    }

    private void a(String s1, String s2)
    {
        if (h == null)
        {
            Object obj = b.inflate(0x7f0300dd, null);
            h = new h(this, null);
            h.a = (TextView)((View) (obj)).findViewById(0x7f090061);
            h.b = (TextView)((View) (obj)).findViewById(0x7f090424);
            g = new Dialog(this, 0x7f07000f);
            g.setOnDismissListener(this);
            g.setContentView(((View) (obj)));
            obj = g.getWindow().getAttributes();
            obj.height = -1;
            obj.width = -1;
        }
        if (!TextUtils.isEmpty(s1))
        {
            h.a.setText(s1);
        }
        h.b.setText(s2);
        if (!isFinishing() && !g.isShowing())
        {
            g.show();
        }
    }

    private void a(boolean flag)
    {
        Intent intent = new Intent(GoWidgetApplication.b(), com/jiubang/golauncher/purchase/sevendaypurchase/SevenDayPurchaseGoogleActivity);
        intent.setFlags(0x10000000);
        intent.putExtra("isfromcheckpay", flag);
        startActivityForResult(intent, 4);
    }

    static int b(RecommendVipActivity recommendvipactivity)
    {
        return recommendvipactivity.d;
    }

    private void b()
    {
        f();
    }

    static void b(RecommendVipActivity recommendvipactivity, String s1, String s2)
    {
        recommendvipactivity.a(s1, s2);
    }

    private void b(String s1, String s2)
    {
        if (Looper.getMainLooper().getThread() != Thread.currentThread())
        {
            runOnUiThread(new com.go.weatherex.recommendvip.e(this, s1, s2));
            return;
        } else
        {
            a(s1, s2);
            return;
        }
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
            if (m.a(s1, true))
            {
                m.b(s1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static Dialog c(RecommendVipActivity recommendvipactivity)
    {
        return recommendvipactivity.n;
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
            if (m.a(s1, true))
            {
                m.b(s1);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static void d(RecommendVipActivity recommendvipactivity)
    {
        recommendvipactivity.h();
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
            if (m.a(s1, true))
            {
                m.b(s1);
                g();
            }
            return true;
        } else
        {
            return false;
        }
    }

    static f e(RecommendVipActivity recommendvipactivity)
    {
        return recommendvipactivity.m;
    }

    private void f()
    {
        s = (RelativeLayout)findViewById(0x7f0904d5);
        r = (Indicator)findViewById(0x7f0900a0);
        r.a(0x7f02002c, 0x7f02002b);
        q = (Button)findViewById(0x7f0904d6);
        q.setOnClickListener(this);
        if (com.go.weatherex.i.b.b())
        {
            s.setBackgroundColor(Color.parseColor("#febe89"));
            q.setBackgroundResource(0x7f02004b);
        }
        l = (AnimViewScrollGroup)findViewById(0x7f09009e);
        l.a(true);
        i i1 = new i(this);
        a(i1.a(this, 9));
        a(i1.a(this, 10));
        a(i1.a(this, 11));
        a(i1.a(this, 12));
        a(i1.a(this, 13));
        l.a();
        l.a(this);
        d = 0;
        r.a(l.getChildCount());
        r.c(com.gau.go.a.f.c.a(10F));
        r.b(d);
        ((ViewPage)l.getChildAt(d)).a();
        c = d;
        l.a(d);
    }

    static void f(RecommendVipActivity recommendvipactivity)
    {
        recommendvipactivity.g();
    }

    static Dialog g(RecommendVipActivity recommendvipactivity)
    {
        return recommendvipactivity.g;
    }

    private void g()
    {
        if (n == null)
        {
            View view = b.inflate(0x7f030039, null, false);
            Button button = (Button)view.findViewById(0x7f0901b9);
            n = new Dialog(this, 0x7f07000f);
            n.setContentView(view);
            button.setOnClickListener(new com.go.weatherex.recommendvip.c(this));
            n.setOnKeyListener(new com.go.weatherex.recommendvip.d(this));
        }
        if (!isFinishing() && !n.isShowing())
        {
            n.show();
        }
    }

    private void h()
    {
        if (g != null && g.isShowing() && !isFinishing())
        {
            if (Looper.getMainLooper().getThread() != Thread.currentThread())
            {
                runOnUiThread(new com.go.weatherex.recommendvip.f(this));
            } else
            if (!isFinishing())
            {
                g.dismiss();
                return;
            }
        }
    }

    private String i()
    {
        switch (p)
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

    public void a()
    {
        h();
        com.gau.go.launcherex.gowidget.billing.l.a(this, getString(0x7f080330));
        o = false;
    }

    public void a(int i1)
    {
        e.removeCallbacks(t);
    }

    public void a(int i1, int j1)
    {
        r.b(i1);
    }

    public void a(ArrayList arraylist)
    {
        boolean flag1 = true;
        if (!b(arraylist)) goto _L2; else goto _L1
_L1:
        boolean flag;
        o = false;
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
                o = false;
            }
        } else
        {
            o = false;
        }
        h();
        return;
_L2:
        flag = flag1;
        switch (p)
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
        if (c != i1)
        {
            ((ViewPage)l.getChildAt(c)).b();
        }
        ViewPage viewpage = (ViewPage)l.getChildAt(i1);
        if (d != i1)
        {
            d = i1;
            c = i1;
            viewpage.a();
        }
        e.postDelayed(t, viewpage.c());
    }

    public void finish()
    {
        Log.i("wss", "RecommendVipActivity_finish");
        super.finish();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        Log.i("wss", "RecommendVipActivity_onActivityResult");
        if (k != 1) goto _L2; else goto _L1
_L1:
        i1;
        JVM INSTR tableswitch 909 909: default 36
    //                   909 37;
           goto _L3 _L4
_L3:
        return;
_L4:
        if (j1 == -1)
        {
            b(null, getString(0x7f08033c));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        IabHelper iabhelper = a.a();
        if (iabhelper != null && !iabhelper.handleActivityResult(i1, j1, intent))
        {
            super.onActivityResult(i1, j1, intent);
        }
        Log.i("wss", "RecommendVipActivity_onActivityResult0");
        Log.i("wss", (new StringBuilder()).append("mProductManager.isProVersion() = ").append(m.b()).toString());
        if (i1 == 4 && m.b())
        {
            Log.i("wss", "RecommendVipActivity_onActivityResult1");
            finish();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0904d6)
        {
            Log.i("wss", "RecommendVipActivity_onclick");
            a(false);
            view = new d(getApplicationContext(), "428");
            view.b("pri_a000");
            if (com.go.weatherex.i.b.a())
            {
                view.e("1");
            } else
            {
                view.e("2");
            }
            view = view.b();
            com.gau.go.a.e.a(getApplicationContext()).a(view);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().clearFlags(0x8000000);
        getWindow().setFormat(-3);
        b = getLayoutInflater();
        m = com.gau.go.launcherex.gowidget.weather.c.c.a(getApplicationContext()).e();
        a = new l(getApplicationContext());
        i = new o(getApplicationContext());
        f = new g(this, null);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PRODUCT_THEME_VIP_PURCHASE_STATE_CHANGE_ACTION");
        registerReceiver(f, bundle);
        e = new com.go.weatherex.recommendvip.a(this);
        a(getIntent());
        setContentView(0x7f0300ee);
        b();
        bundle = new d(getApplicationContext(), "428");
        bundle.b("pri_f000");
        if (com.go.weatherex.i.b.a())
        {
            bundle.e("1");
        } else
        {
            bundle.e("2");
        }
        bundle = bundle.b();
        com.gau.go.a.e.a(getApplicationContext()).a(bundle);
    }

    protected void onDestroy()
    {
        Log.i("wss", "RecommendVipActivity_onDestroy");
        super.onDestroy();
        e.removeCallbacks(t);
        unregisterReceiver(f);
        a.b();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (dialoginterface.equals(g) && h.b.getText().toString().equals(getString(0x7f08033b)))
        {
            e.removeMessages(1);
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
        h();
        o = false;
        return;
_L2:
        if (a.a(purchase.getSku()))
        {
            iabhelper.logDebug((new StringBuilder()).append("Success purchasing: ").append(iabresult).toString());
            iabhelper.logDebug("purchase success");
            iabresult = purchase.getSku();
            m.a(iabresult, true);
            m.b(iabresult);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onNewIntent(Intent intent)
    {
        a(intent);
    }

    protected void onPause()
    {
        super.onPause();
        e.removeCallbacks(t);
    }

    protected void onResume()
    {
        super.onResume();
        h();
        e.removeCallbacks(t);
        if (d != -1 && l != null)
        {
            ViewPage viewpage = (ViewPage)l.getChildAt(d);
            if (viewpage != null)
            {
                e.postDelayed(t, viewpage.c());
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
