// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.app.Dialog;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.DynamicBackgroundView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.DynamicBgPreviewView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.DynamicbgDescriptionView;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a;
import com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.scroller.WeatherDetailScrollGroup;
import com.gau.go.launcherex.gowidget.weather.scroller.l;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.go.weatherex.themestore.detail.IndicatorView;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            c, d

public class InstalledAppBackgroundPreviewView
    implements l
{

    private Context a;
    private DynamicBackgroundActionReceiver b;
    private b c;
    private View d;
    private DynamicBgPreviewView e;
    private WeatherDetailScrollGroup f;
    private IndicatorView g;
    private d h;
    private FrameLayout i;
    private TextView j;
    private Dialog k;
    private a l;
    private DynamicBackgroundView m;
    private int n;
    private ImageView o;
    private final Runnable p = new com.gau.go.launcherex.goweather.goplay.c(this);
    private final Runnable q = new com.gau.go.launcherex.goweather.goplay.d(this);

    public InstalledAppBackgroundPreviewView(Context context)
    {
        n = 0;
        a = context;
    }

    static FrameLayout a(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.i;
    }

    static void a(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview, String s)
    {
        installedappbackgroundpreviewview.a(s);
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            l = new a(a);
            l.c(s);
            h.a(l);
            return;
        } else
        {
            e();
            h.a(-1);
            return;
        }
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            o.setVisibility(0);
            g.setVisibility(4);
            m.setVisibility(8);
            j.setVisibility(8);
            e.setVisibility(8);
            return;
        } else
        {
            o.setVisibility(8);
            g.setVisibility(0);
            m.setVisibility(0);
            j.setVisibility(0);
            e.setVisibility(0);
            return;
        }
    }

    static b b(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.c;
    }

    private void b()
    {
        if (c == null)
        {
            return;
        } else
        {
            d();
            i.post(p);
            return;
        }
    }

    static Context c(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.a;
    }

    private void c()
    {
        if (c == null)
        {
            return;
        } else
        {
            i.post(q);
            return;
        }
    }

    static ImageView d(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.o;
    }

    private void d()
    {
        k = ad.a(a);
        k.show();
    }

    private void e()
    {
        if (k != null && k.isShowing())
        {
            k.dismiss();
            k = null;
        }
    }

    static void e(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        installedappbackgroundpreviewview.e();
    }

    static IndicatorView f(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.g;
    }

    static d g(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.h;
    }

    static DynamicBgPreviewView h(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.e;
    }

    static TextView i(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.j;
    }

    static a j(InstalledAppBackgroundPreviewView installedappbackgroundpreviewview)
    {
        return installedappbackgroundpreviewview.l;
    }

    public View a(Context context, b b1)
    {
        a = context;
        c = b1;
        if (d == null)
        {
            d = LayoutInflater.from(a).inflate(0x7f0300bd, null);
            g = (IndicatorView)d.findViewById(0x7f090414);
            int i1 = a.getResources().getDimensionPixelSize(0x7f0c0029);
            g.a(i1);
            i = (FrameLayout)d.findViewById(0x7f090410);
            m = (DynamicBackgroundView)d.findViewById(0x7f090411);
            h = new d(a);
            h.a(m);
            j = (TextView)d.findViewById(0x7f09028f);
            e = (DynamicBgPreviewView)d.findViewById(0x7f090412);
            o = (ImageView)d.findViewById(0x7f090413);
            o.setClickable(true);
            f = e.a();
            f.a(this);
            f.a(true);
        }
        n = 0;
        f.a(n);
        if (c != null)
        {
            if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c.x()))
            {
                a(true);
                c();
            } else
            {
                if (b == null)
                {
                    context = new IntentFilter();
                    context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_PREVIEW_DONE");
                    context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE");
                    context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE");
                    context.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_THEME_PURCHASE_SUCCESS");
                    b = new DynamicBackgroundActionReceiver();
                    a.registerReceiver(b, context);
                }
                a(false);
                b();
            }
        }
        return d;
    }

    protected void a()
    {
        if (i != null)
        {
            i.removeCallbacks(p);
            i.removeCallbacks(q);
            i = null;
        }
        if (h != null)
        {
            h.a();
            h = null;
        }
        if (l != null)
        {
            l.a();
            l = null;
        }
        if (d != null)
        {
            d = null;
        }
        if (b != null)
        {
            a.unregisterReceiver(b);
        }
    }

    public void a(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
    }

    public void b(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        if (n == i1)
        {
            return;
        } else
        {
            weatherdetailscrollgroup.setTag(Boolean.valueOf(true));
            n = i1;
            g.c(n);
            e.a(n);
            return;
        }
    }

    public void c(WeatherDetailScrollGroup weatherdetailscrollgroup, int i1)
    {
        for (Object obj = weatherdetailscrollgroup.getTag(); obj == null || !((Boolean)obj).booleanValue();)
        {
            return;
        }

        DynamicbgDescriptionView dynamicbgdescriptionview = (DynamicbgDescriptionView)weatherdetailscrollgroup.getChildAt(i1);
        if (dynamicbgdescriptionview != null)
        {
            j.setText(dynamicbgdescriptionview.c());
            h.a(dynamicbgdescriptionview.a(), dynamicbgdescriptionview.b(), true);
        }
        weatherdetailscrollgroup.setTag(Boolean.valueOf(false));
    }

    private class DynamicBackgroundActionReceiver extends BroadcastReceiver
    {

        final InstalledAppBackgroundPreviewView a;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getAction();
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_PREVIEW_DONE".equals(context))
            {
                InstalledAppBackgroundPreviewView.e(a);
                context = intent.getParcelableArrayListExtra("extra_dynamicbackground_preview");
                if (context != null)
                {
                    int j1 = context.size();
                    if (j1 > 0)
                    {
                        InstalledAppBackgroundPreviewView.f(a).b(j1);
                        InstalledAppBackgroundPreviewView.f(a).c(0);
                        InstalledAppBackgroundPreviewView.g(a).a(0);
                        for (int i1 = 0; i1 < j1; i1++)
                        {
                            intent = (DescriptionBean)context.get(i1);
                            com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.h(a).a(intent.c(), intent.a());
                        }

                        intent = ((DynamicbgDescriptionView)com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.h(a).a().getChildAt(0)).c();
                        InstalledAppBackgroundPreviewView.i(a).setText(intent);
                        if (InstalledAppBackgroundPreviewView.j(a) != null)
                        {
                            InstalledAppBackgroundPreviewView.g(a).a(((DescriptionBean)context.get(0)).c(), ((DescriptionBean)context.get(0)).a(), true);
                        }
                    }
                }
                com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.a(a).setVisibility(0);
            } else
            if ("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_DONE".equals(context) || "com.gau.go.launcherex.gowidget.weatherwidget.ACTION_DYNAMICBACKGROUND_LOAD_ALL_SCRIPT_DONE".equals(context))
            {
                InstalledAppBackgroundPreviewView.e(a);
                if (com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.b(a) != null && !com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.b(a).u() && com.gau.go.launcherex.goweather.livewallpaper.b.h.a(com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.c(a).getApplicationContext()))
                {
                    Toast.makeText(com.gau.go.launcherex.goweather.goplay.InstalledAppBackgroundPreviewView.c(a), 0x7f0804c8, 1).show();
                    return;
                }
            }
        }

        public DynamicBackgroundActionReceiver()
        {
            a = InstalledAppBackgroundPreviewView.this;
            super();
        }
    }

}
