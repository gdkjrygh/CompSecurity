// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.setting:
//            ai, af, ah, ag, 
//            ae

public class ad extends a
    implements android.view.View.OnClickListener
{

    private TextView a;
    private View b;
    private View c;
    private TextView d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private boolean k;
    private ProgressDialog l;
    private boolean m;
    private SharedPreferences n;
    private h o;
    private final ai p = new ai(this, null);

    public ad()
    {
        k = false;
    }

    static void a(ad ad1, String s)
    {
        ad1.a(s);
    }

    static void a(ad ad1, String s, String s1)
    {
        ad1.a(s, s1);
    }

    private void a(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        try
        {
            s.setPackage("com.android.vending");
            startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Toast.makeText(getActivity().getApplicationContext(), 0x7f0801df, 0).show();
        }
    }

    private void a(String s, String s1)
    {
        b b1 = new b(getActivity());
        b1.b(0x7f080267);
        b1.d(0x7f080266);
        b1.b(s);
        b1.a(new af(this, s1));
        b1.a();
    }

    static boolean a(ad ad1)
    {
        return ad1.m;
    }

    static boolean a(ad ad1, boolean flag)
    {
        ad1.k = flag;
        return flag;
    }

    static ProgressDialog b(ad ad1)
    {
        return ad1.l;
    }

    static void b(ad ad1, String s)
    {
        ad1.b(s);
    }

    private void b(String s)
    {
        String s1;
        if (s.length() > 2)
        {
            s1 = s.substring(s.lastIndexOf("/") + 1);
        } else
        {
            s1 = s;
        }
        com.gau.go.launcherex.gowidget.download.b.a(getActivity(), s1, s, 1L, getActivity().getPackageName());
    }

    static boolean c(ad ad1)
    {
        return ad1.k;
    }

    static SharedPreferences d(ad ad1)
    {
        return ad1.n;
    }

    static View e(ad ad1)
    {
        return ad1.e;
    }

    static void f(ad ad1)
    {
        ad1.n();
    }

    private void j()
    {
        if (com.gau.go.launcherex.gowidget.c.g.a(getActivity()))
        {
            (new ah(this, null)).execute(new String[0]);
            return;
        } else
        {
            m();
            return;
        }
    }

    private void k()
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", getString(0x7f0801dc));
        String s;
        if (w.p(getActivity().getApplicationContext()))
        {
            s = (new StringBuilder()).append("@GO\u5929\u6C14EX ").append(getResources().getString(0x7f0801e1)).toString();
        } else
        {
            s = (new StringBuilder()).append("@GO Weather EX ").append(getResources().getString(0x7f0801e1)).toString();
        }
        intent.putExtra("android.intent.extra.TEXT", s);
        try
        {
            startActivity(Intent.createChooser(intent, getString(0x7f0801dd)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity().getApplicationContext(), 0x7f0801de, 0).show();
        }
    }

    private void l()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://3g.cn"));
        try
        {
            startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity().getApplicationContext(), 0x7f0801e0, 0).show();
        }
    }

    private void m()
    {
        b b1 = new b(getActivity());
        b1.b(0x7f080276);
        b1.d(0x7f080278);
        b1.c(0x7f080277);
        b1.a(new ag(this));
        b1.a();
    }

    private void n()
    {
        if (GoWidgetApplication.b(getActivity().getApplicationContext()).b())
        {
            f.setVisibility(8);
            return;
        } else
        {
            f.setVisibility(0);
            return;
        }
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        a(a, 4, true);
    }

    public String c()
    {
        String s = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionName;
        String s1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        s1 = s;
        if (s.length() > 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s1 = "";
        return s1;
        Exception exception;
        exception;
        s = "";
_L2:
        exception.printStackTrace();
        return s;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int d()
    {
        int i1;
        try
        {
            i1 = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionCode;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return 1;
        }
        return i1;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        o = new h();
        a = (TextView)c(0x7f090202);
        a.setText(0x7f08038d);
        b = c(0x7f090226);
        b.setOnClickListener(this);
        c = c(0x7f090303);
        c.setOnClickListener(this);
        d = (TextView)c(0x7f090305);
        d.setText((new StringBuilder()).append(c()).append(" ").append(getText(0x7f080449)).toString());
        e = c(0x7f090306);
        n = GoWidgetApplication.c(getActivity().getApplicationContext()).a();
        if (n.getBoolean("key_has_new_version", false))
        {
            e.setVisibility(0);
        }
        f = c(0x7f090307);
        f.setOnClickListener(this);
        n();
        g = c(0x7f09030c);
        g.setOnClickListener(this);
        h = c(0x7f090308);
        h.setOnClickListener(this);
        i = c(0x7f09030b);
        if (n.getBoolean("key_about_rate_go_weather_ex_new", true))
        {
            i.setVisibility(0);
        }
        j = c(0x7f09030f);
        j.setOnClickListener(this);
        l = new ProgressDialog(getActivity());
        l.requestWindowFeature(1);
        l.setCancelable(true);
        l.setMessage(getString(0x7f080265));
        l.setOnCancelListener(new ae(this));
        b();
    }

    public void onClick(View view)
    {
        if (!o.a(hashCode()))
        {
            if (view.equals(b))
            {
                h();
                return;
            }
            if (view.equals(c))
            {
                j();
                return;
            }
            if (view.equals(h))
            {
                a((new StringBuilder()).append("market://details?id=").append(getActivity().getPackageName()).toString());
                view = n.edit();
                view.putBoolean("key_about_rate_go_weather_ex_new", false);
                view.commit();
                i.setVisibility(8);
                return;
            }
            if (view.equals(g))
            {
                k();
                return;
            }
            if (view.equals(j))
            {
                l();
                return;
            }
            if (view.equals(f))
            {
                a(com/go/weatherex/a/a, ((Bundle) (null)));
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030088, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        m = true;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b(p);
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a(p);
    }
}
