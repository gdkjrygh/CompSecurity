// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Dialog;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.goweather.livewallpaper.b.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.gau.go.launcherex.gowidget.weather.view.ad;
import com.go.weatherex.framework.fragment.a;
import java.io.IOException;

// Referenced classes of package com.go.weatherex.setting:
//            ak, al, ba

public class aj extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private TextView a;
    private View b;
    private View c;
    private CheckBox d;
    private al e;
    private boolean f;
    private View g;
    private CheckBox h;
    private VerticalStretchLayout i;
    private TextView j;
    private ImageView k;
    private boolean l;
    private int m;
    private int n;
    private SharedPreferences o;
    private Dialog p;
    private e q;
    private com.gau.go.launcherex.gowidget.c.h r;
    private final BroadcastReceiver s = new ak(this);

    public aj()
    {
        l = false;
    }

    static void a(aj aj1)
    {
        aj1.l();
    }

    static void a(aj aj1, boolean flag)
    {
        aj1.a(flag);
    }

    private void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        q.u(i1);
        q.a(WeatherContentProvider.g, "setting_key", "dynamic_bg_switch", "setting_value", i1);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            j.setTextColor(m);
            j.setClickable(flag);
            j.setEnabled(flag);
            return;
        } else
        {
            j.setTextColor(n);
            j.setClickable(flag);
            j.setEnabled(flag);
            return;
        }
    }

    private void c()
    {
        Intent intent = new Intent("android.service.wallpaper.LIVE_WALLPAPER_CHOOSER");
        try
        {
            startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity(), 0x7f0803bd, 0).show();
        }
        if (com.gau.go.launcherex.goweather.livewallpaper.b.h.a(getActivity().getApplicationContext()))
        {
            h.setChecked(true);
        } else
        {
            h.setChecked(false);
        }
        b(h.isChecked());
        if (h.isChecked())
        {
            i.b();
            return;
        } else
        {
            i.a();
            return;
        }
    }

    private void d()
    {
        WallpaperManager wallpapermanager;
        wallpapermanager = WallpaperManager.getInstance(getActivity().getApplicationContext());
        if (wallpapermanager == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        WallpaperInfo wallpaperinfo = wallpapermanager.getWallpaperInfo();
        if (wallpaperinfo == null || !getActivity().getApplicationContext().getPackageName().equals(wallpaperinfo.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        wallpapermanager.clear();
        return;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return;
    }

    private boolean j()
    {
        return q.a().l == 1;
    }

    private void k()
    {
label0:
        {
            if (!getActivity().isFinishing())
            {
                if (p == null)
                {
                    break label0;
                }
                if (!p.isShowing())
                {
                    p.show();
                }
            }
            return;
        }
        p = ad.a(getActivity());
        p.show();
    }

    private void l()
    {
        if (!getActivity().isFinishing() && p != null && p.isShowing())
        {
            p.dismiss();
            p = null;
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

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        m = getResources().getColor(0x7f0a0086);
        n = getResources().getColor(0x7f0a0088);
        r = new com.gau.go.launcherex.gowidget.c.h();
        o = GoWidgetApplication.c(getActivity().getApplicationContext()).a();
        e = new al(this);
        q = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).f();
        a = (TextView)c(0x7f090202);
        a.setText(0x7f08038d);
        b = c(0x7f090226);
        b.setOnClickListener(this);
        c = c(0x7f09036d);
        c.setOnClickListener(this);
        d = (CheckBox)c(0x7f09036e);
        d.setOnCheckedChangeListener(this);
        g = c(0x7f09036f);
        k = (ImageView)g.findViewById(0x7f090370);
        h = (CheckBox)g.findViewById(0x7f090371);
        j = (TextView)c(0x7f090373);
        i = (VerticalStretchLayout)c(0x7f090372);
        h.setOnCheckedChangeListener(this);
        j.setOnClickListener(this);
        g.setOnClickListener(this);
        boolean flag;
        if (o.getInt("key_new_feature_live_wallpaper", 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (l)
        {
            k.setVisibility(0);
        }
        f = j();
        d.setChecked(f);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_LOADING_FINISH");
        getActivity().registerReceiver(s, bundle);
        b();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.equals(d))
        {
            if (f != flag)
            {
                f = flag;
                e.removeMessages(1);
                if (f)
                {
                    compoundbutton = Message.obtain();
                    compoundbutton.what = 1;
                    compoundbutton.arg1 = 1;
                    e.sendMessageDelayed(compoundbutton, 500L);
                } else
                {
                    compoundbutton = Message.obtain();
                    compoundbutton.what = 1;
                    compoundbutton.arg1 = 2;
                    e.sendMessageDelayed(compoundbutton, 500L);
                }
                k();
            }
        } else
        if (compoundbutton.equals(h))
        {
            b(flag);
            if (flag)
            {
                i.d();
                if (!com.gau.go.launcherex.goweather.livewallpaper.b.h.a(getActivity().getApplicationContext()))
                {
                    c();
                }
            } else
            {
                i.c();
                d();
            }
            if (l)
            {
                k.setVisibility(8);
                compoundbutton = o.edit();
                compoundbutton.putInt("key_new_feature_live_wallpaper", 0);
                compoundbutton.commit();
                return;
            }
        }
    }

    public void onClick(View view)
    {
        if (!r.a(hashCode()))
        {
            if (view.equals(b))
            {
                h();
                return;
            }
            if (view.equals(c))
            {
                e.removeMessages(1);
                d.toggle();
                return;
            }
            if (view.equals(j))
            {
                a(com/go/weatherex/setting/ba, null);
                return;
            }
            if (view.equals(g))
            {
                h.toggle();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03008e, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().unregisterReceiver(s);
    }

    public void onResume()
    {
        super.onResume();
        if (com.gau.go.launcherex.goweather.livewallpaper.b.h.a(getActivity().getApplicationContext()))
        {
            h.setChecked(true);
        } else
        {
            h.setChecked(false);
        }
        b(h.isChecked());
        if (h.isChecked())
        {
            i.b();
            return;
        } else
        {
            i.a();
            return;
        }
    }
}
