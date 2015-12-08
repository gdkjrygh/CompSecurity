// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.scriptengine.parser.i;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.DynamicBackgroundView;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.common.b;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.x;

// Referenced classes of package com.go.weatherex.home.a:
//            h, b, e, f

public class a extends com.go.weatherex.framework.fragment.a
    implements com.go.weatherex.common.a, com.go.weatherex.home.a.h
{

    private DynamicBackgroundView a;
    private int b;
    private boolean c;
    private boolean d;
    private com.gau.go.launcherex.gowidget.weather.util.f e;
    private e f;
    private g g;
    private int h;
    private int i;
    private int j;
    private int k;
    private WeatherBean l;
    private i m;
    private int n;
    private int o;
    private boolean p;
    private com.go.weatherex.home.a.f q;
    private b r;
    private com.go.weatherex.home.a.e s;
    private final BroadcastReceiver t = new com.go.weatherex.home.a.b(this);

    public a()
    {
        a = null;
        b = -1;
        d = true;
        h = 6;
        i = 0;
        j = 18;
        k = 0;
        l = null;
        n = 0;
        o = 255;
        p = false;
    }

    public static Bundle a(String s1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s1);
        bundle.putBoolean("EXTRA_BG_LOADING_IMMEDIATELY_", flag);
        return bundle;
    }

    static DynamicBackgroundView a(a a1)
    {
        return a1.a;
    }

    static WeatherBean a(a a1, WeatherBean weatherbean)
    {
        a1.l = weatherbean;
        return weatherbean;
    }

    private String a(int i1, boolean flag)
    {
        return com.gau.go.launcherex.gowidget.scriptengine.parser.i.a(i1, flag, b());
    }

    private void a(int i1)
    {
        Toast.makeText(getActivity(), i1, 0).show();
    }

    private void a(int i1, int j1)
    {
        while (b == 1 || (i1 != h || j1 != i) && (i1 != j || j1 != k) || l == null) 
        {
            return;
        }
        b(b, true);
    }

    private void a(int i1, boolean flag, boolean flag1)
    {
        Object obj = null;
        if (a.getWidth() != 0 && a.getHeight() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(m.a()))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        if (!com.gtp.go.weather.sharephoto.d.h.b(x.a)) goto _L4; else goto _L3
_L3:
        if (s != null) goto _L1; else goto _L5
_L5:
        obj = new com.go.weatherex.home.a.e();
        s = ((com.go.weatherex.home.a.e) (obj));
_L7:
        Object obj1;
        boolean flag2 = b();
        obj1 = obj;
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b == i1 && d == flag2)
        {
            obj1 = obj;
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        b = i1;
        d = flag2;
        String s1 = a(b, c);
        obj = m.a(s1);
        if (obj == null)
        {
            a(0x7f0801e8);
            obj1 = obj;
            if (n < 3)
            {
                n = n + 1;
                m.b(s1);
                obj1 = obj;
            }
        } else
        {
            n = 0;
            obj1 = obj;
        }
        if (obj1 == null) goto _L1; else goto _L6
_L6:
        if (flag1)
        {
            q.a(((z) (obj1)), a.getWidth(), a.getHeight());
            return;
        } else
        {
            a(q.b(((z) (obj1)), a.getWidth(), a.getHeight()), ((z) (obj1)));
            return;
        }
_L4:
        m.d(getActivity().getPackageName());
        s = null;
          goto _L7
        s = null;
          goto _L7
    }

    static void a(a a1, int i1, int j1)
    {
        a1.a(i1, j1);
    }

    static void a(a a1, int i1, boolean flag)
    {
        a1.b(i1, flag);
    }

    private void a(com.jiubang.core.a.i i1, z z1)
    {
        boolean flag1 = false;
        if (isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (!(z1 instanceof com.go.weatherex.home.a.e))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (i1 == null)
        {
            z1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE");
            getActivity().sendBroadcast(z1);
            flag = flag1;
        }
_L4:
        if (c != flag)
        {
            c = flag;
        }
        if (i1 != null)
        {
            a.a(i1, c);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = flag1;
        if (!getActivity().getPackageName().equals(z1.a()))
        {
            flag = true;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    static boolean a(a a1, boolean flag)
    {
        a1.c = flag;
        return flag;
    }

    static g b(a a1)
    {
        return a1.g;
    }

    private void b(int i1, boolean flag)
    {
        a(i1, flag, true);
    }

    private boolean b()
    {
        if (l == null)
        {
            return d;
        }
        String s1 = l.l.j();
        String s2 = l.l.k();
        if (GoWidgetApplication.b(getActivity().getApplicationContext()).b() && g.d())
        {
            int i1 = l.l.n();
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2, g.b(i1));
        } else
        {
            return com.gau.go.launcherex.gowidget.weather.util.r.a(s1, s2);
        }
    }

    static WeatherBean c(a a1)
    {
        return a1.l;
    }

    private void c()
    {
        String s1;
        Object obj;
        boolean flag;
        if (f.a().l == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        obj = getArguments();
        s1 = null;
        if (obj != null)
        {
            s1 = ((Bundle) (obj)).getString("cityId");
            ((Bundle) (obj)).getBoolean("EXTRA_BG_LOADING_IMMEDIATELY_", false);
        }
        obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        l = e.a(((String) (obj)));
        b = 1;
        if (l != null)
        {
            b = l.l.d();
            d();
        }
    }

    static int d(a a1)
    {
        return a1.b;
    }

    private void d()
    {
        String s1;
        String s2;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s2 = l.l.j();
        s1 = l.l.k();
        if (!com.gau.go.launcherex.gowidget.weather.util.r.a(s2) || !com.gau.go.launcherex.gowidget.weather.util.r.a(s1))
        {
            break MISSING_BLOCK_LABEL_106;
        }
        String as1[] = s2.split(":");
        h = Integer.parseInt(as1[0]);
        i = Integer.parseInt(as1[1]);
        String as[] = s1.split(":");
        j = Integer.parseInt(as[0]);
        k = Integer.parseInt(as[1]);
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
        h = 6;
        i = 0;
        j = 18;
        k = 0;
        return;
    }

    static com.gau.go.launcherex.gowidget.weather.util.f e(a a1)
    {
        return a1.e;
    }

    static void f(a a1)
    {
        a1.d();
    }

    static e g(a a1)
    {
        return a1.f;
    }

    static boolean h(a a1)
    {
        return a1.c;
    }

    static i i(a a1)
    {
        return a1.m;
    }

    public void a(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2, boolean flag, boolean flag1)
    {
        if (flag1)
        {
            a(b, true, false);
        }
    }

    public void a(com.jiubang.core.a.i i1, z z1, int j1, int k1)
    {
        a(i1, z1);
    }

    protected void b(int i1, Object obj)
    {
        super.b(i1, obj);
        i1;
        JVM INSTR tableswitch 3 14: default 68
    //                   3 169
    //                   4 68
    //                   5 68
    //                   6 69
    //                   7 68
    //                   8 68
    //                   9 81
    //                   10 68
    //                   11 68
    //                   12 125
    //                   13 238
    //                   14 278;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L1 _L4 _L1 _L1 _L5 _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_238;
_L1:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_278;
_L8:
        return;
_L3:
        p = ((Boolean)obj).booleanValue();
        return;
_L4:
        if (!p)
        {
            o = (int)((1.0F - ((Float)obj).floatValue()) * 255F);
            a.a(o);
            a.d();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        obj = (String)obj;
        l = e.a(((String) (obj)));
        d();
        if (l != null)
        {
            b(l.l.d(), false);
            return;
        }
        if (true) goto _L8; else goto _L2
_L2:
        if (!p)
        {
            if (o != 0)
            {
                a.a((int)((1.0F - ((Float)obj).floatValue()) * 255F));
            }
        } else
        {
            a.a((int)((1.0F - ((Float)obj).floatValue()) * (float)o));
        }
        a.d();
        return;
        if (((Boolean)obj).booleanValue())
        {
            a.a(0);
        } else
        {
            a.a(o);
        }
        a.d();
        return;
        i1 = ((Integer)obj).intValue();
        a.scrollTo(a.getScrollX(), -i1);
        return;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        q = new com.go.weatherex.home.a.f(getActivity());
        q.a(this);
        r = new b(a, this);
        bundle = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext());
        m = bundle.d();
        e = bundle.h();
        f = bundle.f();
        g = bundle.g();
        bundle = new IntentFilter();
        bundle.addAction("android.intent.action.TIME_TICK");
        bundle.addAction("android.intent.action.TIME_SET");
        bundle.addAction("android.intent.action.TIMEZONE_CHANGED");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_BACKGROUND_CHANGE_FINISH");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_WORLD_CLOCK");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_CHANGE_DYNAMIC_BG");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_ONE_RELOAD_DONE");
        getActivity().registerReceiver(t, bundle);
        c();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            9, 12, 3, 6, 13, 14
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = new DynamicBackgroundView(getActivity());
        a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        a.setId(0x7f090022);
        return a;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (t != null)
        {
            getActivity().unregisterReceiver(t);
        }
        r.a();
        a.a();
    }

    public void onStart()
    {
        super.onStart();
        a.c();
    }

    public void onStop()
    {
        super.onStop();
        a.b();
    }
}
