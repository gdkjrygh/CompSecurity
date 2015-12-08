// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.billing.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.goweather.goplay.n;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.googleplay.IabHelper;
import com.gau.go.launcherex.gowidget.googleplay.IabResult;
import com.gau.go.launcherex.gowidget.googleplay.Inventory;
import com.gau.go.launcherex.gowidget.googleplay.Purchase;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.a;
import com.gau.go.launcherex.gowidget.weather.globalview.y;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.google.android.gms.ads.InterstitialAd;
import com.gtp.go.weather.billing.a.c;
import com.gtp.go.weather.sharephoto.award.k;
import com.jiubang.commerce.ad.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gtp.go.weather.billing.view:
//            e, f, g, k, 
//            c, h, i, a, 
//            j, b, d

public class PayActivity extends Activity
    implements com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabPurchaseFinishedListener, com.gau.go.launcherex.gowidget.googleplay.IabHelper.OnIabSetupFinishedListener, com.gau.go.launcherex.gowidget.googleplay.IabHelper.QueryInventoryFinishedListener
{

    private View a;
    private LinearLayout b;
    private View c;
    private TextView d;
    private TextView e;
    private IabHelper f;
    private ArrayList g;
    private HashMap h;
    private ArrayList i;
    private a j;
    private boolean k;
    private boolean l;
    private ArrayList m;
    private Map n;
    private ConnectivityManager o;
    private String p;
    private boolean q;
    private String r;
    private boolean s;
    private boolean t;
    private y u;
    private b v;
    private b w;
    private f x;

    public PayActivity()
    {
        k = false;
        l = false;
        p = null;
        q = false;
        r = "";
        s = false;
        t = false;
    }

    private View a(int i1, int j1)
    {
        View view2;
        switch (i1)
        {
        case 3: // '\003'
        case 4: // '\004'
        default:
            return null;

        case 5: // '\005'
            View view = a(((Context) (this)), 0x7f08023f, 0x7f0203ad, j1);
            view.setOnClickListener(new com.gtp.go.weather.billing.view.e(this));
            return view;

        case 2: // '\002'
            View view1 = a(((Context) (this)), 0x7f080240, 0x7f0203ae, j1);
            view1.setOnClickListener(new com.gtp.go.weather.billing.view.f(this));
            return view1;

        case 6: // '\006'
            view2 = a(((Context) (this)), 0x7f080342, 0x7f0203ac, j1);
            break;
        }
        view2.setOnClickListener(new g(this));
        return view2;
    }

    private View a(Context context, int i1, int j1, int k1)
    {
        context = getLayoutInflater().inflate(0x7f0300dc, null);
        TextView textview = (TextView)context.findViewById(0x7f090415);
        textview.setText(i1);
        textview.setCompoundDrawablesWithIntrinsicBounds(j1, 0, 0, 0);
        context.findViewById(0x7f090482).setVisibility(8);
        return context;
    }

    private View a(Context context, NativeAd nativead)
    {
        nativead = new RelativeLayout(getBaseContext());
        nativead.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutparams.leftMargin = com.gau.go.launcherex.gowidget.weather.util.r.a(4, 3F);
        layoutparams.rightMargin = com.gau.go.launcherex.gowidget.weather.util.r.a(4, 3F);
        layoutparams.topMargin = com.gau.go.launcherex.gowidget.weather.util.r.a(4, 3F);
        layoutparams.bottomMargin = com.gau.go.launcherex.gowidget.weather.util.r.a(4, 3F);
        if (com.gtp.go.weather.billing.view.k.a().g() != null)
        {
            context = com.gtp.go.weather.billing.view.k.a().g();
            String s1 = (new e("f000", "", "682", "", "", "", "")).b();
            com.gau.go.a.e.a(GoWidgetApplication.b()).a(s1);
        } else
        if (com.gtp.go.weather.billing.view.k.a().f() != null)
        {
            context = com.gtp.go.weather.billing.view.k.a().f();
            String s2 = (new e("f000", "", "682", "", "", "", "")).b();
            com.gau.go.a.e.a(GoWidgetApplication.b()).a(s2);
        } else
        {
            context = null;
        }
        if (context != null)
        {
            ViewGroup viewgroup = (ViewGroup)context.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeAllViews();
            }
            nativead.addView(context, layoutparams);
        }
        return nativead;
    }

    private View a(a a1, int i1)
    {
        View view = getLayoutInflater().inflate(0x7f0300dc, null);
        TextView textview = (TextView)view.findViewById(0x7f090415);
        textview.setText(String.format(getString(0x7f080343), new Object[] {
            (new StringBuilder()).append("$").append(a1.b()).toString()
        }));
        textview.setCompoundDrawablesWithIntrinsicBounds(0x7f0203ab, 0, 0, 0);
        if (i1 == 0)
        {
            view.findViewById(0x7f090482).setVisibility(8);
        }
        view.setOnClickListener(new com.gtp.go.weather.billing.view.c(this, a1));
        return view;
    }

    static a a(PayActivity payactivity, a a1)
    {
        payactivity.j = a1;
        return a1;
    }

    static b a(PayActivity payactivity, b b1)
    {
        payactivity.w = b1;
        return b1;
    }

    private String a(a a1)
    {
        float f1;
        if (a1 != null)
        {
            float f2 = g() - (float)a1.b();
            f1 = f2;
            if (f2 <= 0.0F)
            {
                f1 = h();
            }
        } else
        {
            f1 = g();
        }
        for (a1 = h.entrySet().iterator(); a1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)a1.next();
            if (f1 == ((Float)entry.getValue()).floatValue())
            {
                return (String)entry.getKey();
            }
        }

        return "";
    }

    static String a(PayActivity payactivity)
    {
        return payactivity.p;
    }

    static String a(PayActivity payactivity, String s1)
    {
        return payactivity.a(s1);
    }

    private String a(String s1)
    {
        Object obj;
label0:
        {
            if (!s1.contains("%lang%"))
            {
                obj = s1;
                if (!s1.contains("%region%"))
                {
                    break label0;
                }
            }
            obj = Locale.getDefault();
            obj = s1.replace("%lang%", ((Locale) (obj)).getLanguage().toLowerCase(Locale.US)).replace("%region%", ((Locale) (obj)).getCountry().toLowerCase(Locale.US));
        }
        return ((String) (obj));
    }

    static void a(PayActivity payactivity, String s1, boolean flag, boolean flag1)
    {
        payactivity.a(s1, flag, flag1);
    }

    private void a(String s1, boolean flag, boolean flag1)
    {
        if (t)
        {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getString(0x7f08032e)).setIcon(0x108008a).setMessage(s1).setPositiveButton(0x104000a, new h(this, flag1));
        if (flag)
        {
            builder.setNegativeButton(0x7f08032f, new i(this, flag1));
        }
        builder.create().show();
    }

    private void a(String as[])
    {
        int i1;
        int k1;
        int l1;
        b.removeAllViews();
        if (b.getChildCount() != 0)
        {
            break MISSING_BLOCK_LABEL_301;
        }
        l1 = as.length;
        k1 = 0;
        i1 = 0;
_L3:
        if (k1 >= l1) goto _L2; else goto _L1
_L1:
        String s1 = as[k1];
        int i2 = Integer.parseInt(s1);
        Object obj = a(i2, i1);
        NumberFormatException numberformatexception;
        int j1;
        if (obj != null)
        {
            b.addView(((View) (obj)));
            j1 = i1 + 1;
        } else
        {
            j1 = i1;
        }
        i1 = j1;
        if (5 != i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (i == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = i.iterator();
        i1 = j1;
        do
        {
            View view;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                view = a((a)((Iterator) (obj)).next(), i1);
            } while (view == null);
            b.addView(view);
            i1++;
        } while (true);
        numberformatexception;
        numberformatexception.printStackTrace();
        k1++;
          goto _L3
_L2:
        if (com.gtp.go.weather.billing.view.k.a().g() != null || com.gtp.go.weather.billing.view.k.a().f() != null)
        {
            as = a(((Context) (this)), com.gtp.go.weather.billing.view.k.a().b());
            numberformatexception = new android.widget.LinearLayout.LayoutParams(-1, -2);
            if (as != null)
            {
                as.setLayoutParams(numberformatexception);
                numberformatexception = (ViewGroup)as.getParent();
                if (numberformatexception != null)
                {
                    numberformatexception.removeAllViews();
                }
                b.addView(as);
                if (v != null && v.g() != null && v.d().a() != null)
                {
                    b(this, v.g(), (com.jiubang.commerce.ad.i.a.b)v.d().a().get(0), "682");
                }
            }
        }
        Log.i("wss", "\u663E\u793A\u4ED8\u8D39\u6846");
        b.setVisibility(0);
        c.setVisibility(8);
        return;
    }

    static boolean a(PayActivity payactivity, boolean flag)
    {
        payactivity.q = flag;
        return flag;
    }

    static b b(PayActivity payactivity, b b1)
    {
        payactivity.v = b1;
        return b1;
    }

    private void b(a a1)
    {
        if (j != null)
        {
            a1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USED_COUPON_ID");
            a1.putExtra("extra_used_coupon_id", j.a());
            sendBroadcast(a1);
        }
    }

    static void b(PayActivity payactivity)
    {
        payactivity.d();
    }

    private void c()
    {
        k k1 = new k(this);
        k1.a(new com.gtp.go.weather.billing.view.a(this, k1));
        com.gtp.go.weather.sharephoto.award.k.a(this, p);
    }

    static void c(PayActivity payactivity)
    {
        payactivity.i();
    }

    private void d()
    {
        m = new ArrayList();
        n = com.gtp.go.weather.billing.a.c.a(p, getApplicationContext());
        if (n != null && n.size() > 0)
        {
            String s1 = (String)n.get(com.gau.go.launcherex.gowidget.statistics.w.n(getApplicationContext()));
            Object obj = s1;
            if (s1 == null)
            {
                obj = (String)n.get("others");
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                if (((String) (obj)).contains("#"))
                {
                    obj = ((String) (obj)).split("#");
                    int j1 = obj.length;
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        m.add(obj[i1]);
                    }

                } else
                {
                    m.add(obj);
                }
            }
        }
        String s2;
        for (Iterator iterator = m.iterator(); iterator.hasNext(); com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("readPayWays.payWay = ").append(s2).toString()))
        {
            s2 = (String)iterator.next();
        }

        if (m.contains(String.valueOf(5)))
        {
            f();
        }
        if (m.contains(String.valueOf(6)))
        {
            e();
        }
    }

    static boolean d(PayActivity payactivity)
    {
        return payactivity.k();
    }

    private void e()
    {
    }

    static boolean e(PayActivity payactivity)
    {
        return payactivity.q;
    }

    static IabHelper f(PayActivity payactivity)
    {
        return payactivity.f;
    }

    private void f()
    {
        g = new ArrayList();
        h = new HashMap();
        String as[] = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(getApplicationContext(), p, "inapp_price_key");
        int ai[] = com.gau.go.launcherex.gowidget.weather.globaltheme.a.e(getApplicationContext(), p, "inapp_price_value");
        if (as != null && ai != null && as.length == ai.length)
        {
            for (int i1 = 0; i1 < ai.length; i1++)
            {
                if (!TextUtils.isEmpty(as[i1]) && ai[i1] > 0)
                {
                    g.add(as[i1]);
                    float f1 = Float.valueOf(ai[i1]).floatValue() / 100F;
                    com.gtp.a.a.b.c.a("theme_pay", (new StringBuilder()).append("priceKeys[i] ").append(as[i1]).append(" | priceValue = ").append(f1).toString());
                    h.put(as[i1], Float.valueOf(f1));
                }
            }

        }
        Intent intent = getIntent();
        if (intent != null)
        {
            Object obj = intent.getStringArrayListExtra("extra_coupon_ids_arraylist");
            if (obj != null)
            {
                i = new ArrayList();
                float f2 = g();
                obj = ((ArrayList) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    String s1 = (String)((Iterator) (obj)).next();
                    int j1 = intent.getIntExtra(s1, -1);
                    if (j1 != -1)
                    {
                        a a1 = new a();
                        a1.a(s1);
                        a1.a(j1);
                        if ((float)j1 < f2)
                        {
                            i.add(a1);
                        }
                    }
                } while (true);
            }
        }
        f = new IabHelper(this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjMLLCo3hpiezV/bPOi83lz3DktmKGQpvsxjE10fF1h+L62vnazigqi+P6m4NFO+jOFT5RX0VPM9SzM6vCGOo9Xjjuk219queZr9SQUKoytfMTsgrtcI1YGDy9maP1owggij0hxWfaBsP4375zP+R89Pzz0R9Ap2tmLLlfIzRZPwqPcnONlQ/8ZqfdxWwCiOOOLHQJ4k1aN6jUPx8ipKWFxo7ORI0TmqgiJvhsFJuBr6QCqoN2BF6QgOfz6fMac1e+EaeJD3/pzUsuzzvvEnh70aoq+6mqZyZmyJb4840OddTGUHX8z3Qeoa/Dti+YQiXtSO3T2ANuF9pzkyBIAQQLwIDAQAB");
        f.enableDebugLogging(com.gtp.a.a.b.c.a());
    }

    private float g()
    {
        float f2;
        if (g != null)
        {
            Iterator iterator = g.iterator();
            float f1 = -1F;
            do
            {
                f2 = f1;
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (Float)h.get(obj);
                if (((Float) (obj)).floatValue() > f1)
                {
                    f1 = ((Float) (obj)).floatValue();
                }
            } while (true);
        } else
        {
            f2 = -1F;
        }
        return f2;
    }

    static void g(PayActivity payactivity)
    {
        payactivity.l();
    }

    private float h()
    {
        float f2;
        if (g != null)
        {
            Iterator iterator = g.iterator();
            float f1 = 3.402823E+38F;
            do
            {
                f2 = f1;
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (Float)h.get(obj);
                if (((Float) (obj)).floatValue() < f1)
                {
                    f1 = ((Float) (obj)).floatValue();
                }
            } while (true);
        } else
        {
            f2 = 3.402823E+38F;
        }
        return f2;
    }

    static String h(PayActivity payactivity)
    {
        return payactivity.r;
    }

    private void i()
    {
        if (m == null || m.size() <= 0) goto _L2; else goto _L1
_L1:
        String as[];
        int i1;
        as = new String[m.size()];
        m.toArray(as);
        int k1 = as.length;
        i1 = k1;
        if (i != null)
        {
            i1 = k1 + i.size();
        }
        if (i1 <= 1) goto _L4; else goto _L3
_L3:
        e.setText(0x7f08023e);
        a(as);
_L6:
        return;
_L4:
        if (as.length != 1) goto _L6; else goto _L5
_L5:
        e.setText(0x7f08033f);
        int j1;
        try
        {
            j1 = Integer.parseInt(as[0]);
        }
        catch (Exception exception)
        {
            j1 = 5;
        }
        switch (j1)
        {
        default:
            return;

        case 5: // '\005'
            if (!k)
            {
                if (!l)
                {
                    if (!q && f != null)
                    {
                        q = true;
                        f.startSetup(this);
                    }
                    l = true;
                    return;
                }
            } else
            {
                p();
                return;
            }
            break;

        case 6: // '\006'
            n();
            return;
        }
        if (true) goto _L6; else goto _L2
_L2:
        Log.i("wss", "gotoPay_finish");
        finish();
        return;
    }

    static void i(PayActivity payactivity)
    {
        payactivity.j();
    }

    private void j()
    {
        c.setVisibility(0);
        b.setVisibility(8);
    }

    static void j(PayActivity payactivity)
    {
        payactivity.m();
    }

    static LinearLayout k(PayActivity payactivity)
    {
        return payactivity.b;
    }

    private boolean k()
    {
        NetworkInfo networkinfo = o.getActiveNetworkInfo();
        return networkinfo != null && networkinfo.isConnected();
    }

    static View l(PayActivity payactivity)
    {
        return payactivity.a;
    }

    private void l()
    {
        Toast.makeText(getApplicationContext(), 0x7f080344, 1).show();
    }

    private void m()
    {
        Intent intent;
        intent = new Intent();
        intent.setClassName(p, "com.gau.go.weatherex.framework.billing.PayActivity");
        intent.putExtra("theme_request_code", 1);
        startActivityForResult(intent, 363);
_L1:
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        if (com.gtp.a.a.b.c.a())
        {
            activitynotfoundexception.printStackTrace();
            return;
        }
          goto _L1
    }

    static void m(PayActivity payactivity)
    {
        payactivity.o();
    }

    private void n()
    {
        Intent intent;
        intent = new Intent();
        intent.setClassName(p, "com.gau.go.weatherex.framework.billing.PayActivity");
        intent.putExtra("theme_request_code", 2);
        startActivityForResult(intent, 370);
_L2:
        com.gau.go.launcherex.goweather.goplay.n.a(this).a(p, 0, 0.0F);
        return;
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
        if (com.gtp.a.a.b.c.a())
        {
            activitynotfoundexception.printStackTrace();
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void n(PayActivity payactivity)
    {
        payactivity.n();
    }

    static b o(PayActivity payactivity)
    {
        return payactivity.w;
    }

    private void o()
    {
        Intent intent = new Intent(this, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        try
        {
            startActivityForResult(intent, 369);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    static b p(PayActivity payactivity)
    {
        return payactivity.v;
    }

    private void p()
    {
        if (!com.gau.go.launcherex.gowidget.statistics.w.s(getApplicationContext()))
        {
            a(getString(0x7f080331), true, false);
        } else
        if (!l)
        {
            f.queryInventoryAsync(true, g, this);
            l = true;
            com.gau.go.launcherex.goweather.goplay.n.a(this).b(p, 0, g());
            return;
        }
    }

    private void q()
    {
        com.jiubang.commerce.ad.h.c c1 = new com.jiubang.commerce.ad.h.c(this, 684, "", new j(this));
        c1.b(false);
        c1.c(true);
        c1.d(false);
        c1.e(false);
        c1.a(1);
        com.jiubang.commerce.ad.a.a(c1.a());
    }

    private void r()
    {
        com.jiubang.commerce.ad.a.a((new com.jiubang.commerce.ad.h.c(this, 682, null, new com.gtp.go.weather.billing.view.b(this))).a(1).b(true).c(true).e(false).a());
    }

    private void s()
    {
        if (com.gtp.go.weather.billing.view.k.a().c() != null)
        {
            if (w != null && w.g() != null && w.d().a() != null)
            {
                b(this, w.g(), (com.jiubang.commerce.ad.i.a.b)w.d().a().get(0), "684");
                com.gtp.go.weather.billing.view.k.a().a(this);
            }
        } else
        if (com.gtp.go.weather.billing.view.k.a().e() != null)
        {
            if (w != null && w.g() != null && w.d().a() != null)
            {
                b(this, w.g(), (com.jiubang.commerce.ad.i.a.b)w.d().a().get(0), "684");
                com.gtp.go.weather.billing.view.k.a().e().show();
                return;
            }
        } else
        {
            finish();
            return;
        }
    }

    public void a()
    {
        a.setVisibility(4);
        if (!t)
        {
            if (u == null)
            {
                u = new y(this);
                u.setCancelable(false);
                u.b(0x7f08032a);
                u.c(0x7f08032b);
                u.a(new d(this));
            }
            if (!u.isShowing() && !isFinishing())
            {
                u.show();
                return;
            }
        }
    }

    public void b()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
        intent.putExtra("extra_purchase_theme_package_name", p);
        sendBroadcast(intent);
    }

    public void finish()
    {
        com.gtp.go.weather.billing.view.k.a().h();
        super.finish();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        byte byte0 = -1;
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 101: // 'e'
            f.logDebug((new StringBuilder()).append("onActivityResult(").append(i1).append(",").append(j1).append(",").append(intent).toString());
            if (!f.handleActivityResult(i1, j1, intent))
            {
                super.onActivityResult(i1, j1, intent);
                s();
                return;
            } else
            {
                f.logDebug("onActivityResult handled by IABUtil.");
                return;
            }

        case 363: 
        case 370: 
            if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.j(p, getApplicationContext()))
            {
                a();
                b();
                return;
            }
            i1 = byte0;
            if (intent != null)
            {
                i1 = intent.getIntExtra("theme_request_code", -1);
            }
            if (i1 == 1 && !q && f != null)
            {
                q = true;
                f.startSetup(this);
            }
            s();
            return;

        case 369: 
            s();
            return;
        }
    }

    public void onBackPressed()
    {
        if (com.gtp.go.weather.billing.view.k.a().c() == null) goto _L2; else goto _L1
_L1:
        if (w != null && w.g() != null && w.d().a() != null)
        {
            b(this, w.g(), (com.jiubang.commerce.ad.i.a.b)w.d().a().get(0), "684");
            String s1 = (new e("f000", "", "684", "", "11", "", "")).b();
            com.gau.go.a.e.a(GoWidgetApplication.b()).a(s1);
            com.gtp.go.weather.billing.view.k.a().a(this);
        }
_L4:
        super.onBackPressed();
        return;
_L2:
        if (com.gtp.go.weather.billing.view.k.a().e() != null)
        {
            if (w != null && w.g() != null && w.d().a() != null)
            {
                b(this, w.g(), (com.jiubang.commerce.ad.i.a.b)w.d().a().get(0), "684");
                String s2 = (new e("f000", "", "684", "", "8", "", "")).b();
                com.gau.go.a.e.a(GoWidgetApplication.b()).a(s2);
                com.gtp.go.weather.billing.view.k.a().e().show();
            }
        } else
        {
            finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t = false;
        x = com.gau.go.launcherex.gowidget.weather.d.f.a(getApplicationContext());
        if (x != null && !x.b())
        {
            q();
            r();
        }
        bundle = getIntent();
        if (bundle != null)
        {
            p = bundle.getStringExtra("extra_package_name");
            r = bundle.getStringExtra("theme_pay_type");
            s = bundle.getBooleanExtra("key_isApkAward", false);
            if (r == null)
            {
                r = "";
            }
        }
        if (!TextUtils.isEmpty(p))
        {
            o = (ConnectivityManager)getSystemService("connectivity");
            setContentView(0x7f0300de);
            a = findViewById(0x7f090290);
            b = (LinearLayout)findViewById(0x7f09022c);
            c = findViewById(0x7f090224);
            d = (TextView)findViewById(0x7f090424);
            e = (TextView)findViewById(0x7f090061);
            if (s)
            {
                c();
                return;
            } else
            {
                d();
                i();
                return;
            }
        } else
        {
            finish();
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        t = true;
        q = false;
        if (f != null && k)
        {
            f.dispose();
            k = false;
            f = null;
        }
    }

    public void onIabPurchaseFinished(IabResult iabresult, Purchase purchase)
    {
        l = false;
        if (iabresult.isFailure())
        {
            f.logDebug((new StringBuilder()).append("Error purchasing: ").append(iabresult).toString());
            f.logDebug("purchase failture");
            Log.i("wss", "onIabPurchaseFinished_finish");
            finish();
        } else
        if (g.contains(purchase.getSku()))
        {
            f.logDebug((new StringBuilder()).append("Success purchasing: ").append(iabresult).toString());
            f.logDebug("purchase success");
            a();
            com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(p, true, getApplicationContext());
            b();
            b(j);
            iabresult = (Float)h.get(purchase.getSku());
            float f1;
            if (iabresult != null)
            {
                f1 = iabresult.floatValue();
            } else
            {
                f1 = 0.0F;
            }
            com.gau.go.launcherex.goweather.goplay.n.a(this).b(p, 1, f1);
            return;
        }
    }

    public void onIabSetupFinished(IabResult iabresult)
    {
        if (!iabresult.isSuccess())
        {
            l = false;
            f.logDebug((new StringBuilder()).append("Problem setting up In-app Billing: ").append(iabresult).toString());
            a(getString(0x7f080330), true, true);
        } else
        {
            f.logDebug((new StringBuilder()).append("IAB is fully set up!: ").append(iabresult).toString());
            k = true;
            l = true;
            f.queryInventoryAsync(true, g, this);
        }
        q = false;
    }

    protected void onPause()
    {
        super.onPause();
    }

    public void onQueryInventoryFinished(IabResult iabresult, Inventory inventory)
    {
        if (iabresult.isFailure())
        {
            l = false;
            f.logDebug("onQueryInventoryFinished-->result.isFailure(");
            return;
        }
        iabresult = g.iterator();
        boolean flag = false;
        do
        {
            if (!iabresult.hasNext())
            {
                break;
            }
            boolean flag1 = inventory.hasPurchase((String)iabresult.next());
            flag = flag1;
            if (!flag1)
            {
                continue;
            }
            flag = flag1;
            break;
        } while (true);
        f.logDebug((new StringBuilder()).append("onQueryInventoryFinished-->result isPremium\uFF1A").append(flag).toString());
        if (flag)
        {
            l = false;
            a();
            com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(p, true, getApplicationContext());
            b();
            return;
        } else
        {
            iabresult = a(j);
            f.launchPurchaseFlow(this, iabresult, 101, this, null);
            l = true;
            com.gau.go.launcherex.goweather.goplay.n.a(this).b(p, 0, ((Float)h.get(iabresult)).floatValue());
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
    }
}
