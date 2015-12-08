// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.a.a.c;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.util.List;

// Referenced classes of package com.go.weatherex.home.current:
//            aa, n, m, w

public class l extends aa
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, android.view.View.OnClickListener, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener, com.google.android.gms.maps.GoogleMap.OnMapClickListener
{

    private View b;
    private ViewGroup c;
    private ImageView d;
    private n e;
    private n f;
    private MapView g;
    private GoogleMap h;
    private int i;
    private boolean j;
    private TileOverlay k;
    private TileProvider l;
    private TileOverlayOptions m;
    private boolean n;
    private boolean o;
    private WeatherBean p;
    private String q;
    private SharedPreferences r;
    private TextView s;
    private View t;
    private Context u;
    private TextView v;

    public l(a a1, int i1)
    {
        super(a1, i1);
        i = 0;
        n = false;
        o = false;
        u = a.getActivity();
        b = a1.i().a(0x7f030040, null);
        b.setClickable(true);
        v = (TextView)f(0x7f090202);
        a.a(v, 4, true);
        c = (ViewGroup)f(0x7f0901f2);
        c.setVisibility(4);
        d = (ImageView)f(0x7f0901f4);
        e = new n(this, null);
        e.a = c.findViewById(0x7f0901f8);
        e.b = (ImageView)c.findViewById(0x7f0901f9);
        e.c = (ImageView)c.findViewById(0x7f0901fa);
        f = new n(this, null);
        f.a = c.findViewById(0x7f0901f5);
        f.b = (ImageView)c.findViewById(0x7f0901f6);
        f.c = (ImageView)c.findViewById(0x7f0901f7);
        t = f(0x7f0901f1);
        t.setVisibility(4);
        s = (TextView)f(0x7f0901fb);
        s.setVisibility(8);
        g = (MapView)f(0x7f0901f0);
        r = GoWidgetApplication.c(n()).a();
        r.registerOnSharedPreferenceChangeListener(this);
        s();
    }

    static WeatherBean a(l l1)
    {
        return l1.p;
    }

    static GoogleMap b(l l1)
    {
        return l1.h;
    }

    private void b(String s1)
    {
        boolean flag1 = true;
        p = com.gau.go.launcherex.gowidget.weather.util.f.a(n()).a(s1);
        if (p != null)
        {
            boolean flag;
            if (p.l.y() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
            if (p.l.x() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            n = flag;
        }
    }

    private View f(int i1)
    {
        return b.findViewById(i1);
    }

    private void g(int i1)
    {
        if (i1 != 2) goto _L2; else goto _L1
_L1:
        int j1 = i;
        i = i1;
        p();
        r();
        w.a("maps_tab_radar", n());
        i = j1;
_L12:
        return;
_L2:
        int k1 = i;
        if (i == i1) goto _L4; else goto _L3
_L3:
        i = i1;
        i;
        JVM INSTR tableswitch 1 3: default 88
    //                   1 98
    //                   2 136
    //                   3 145;
           goto _L5 _L6 _L7 _L8
_L7:
        break; /* Loop/switch isn't completed */
_L5:
        throw new IllegalArgumentException("viewState is illegal");
_L6:
        d.setSelected(true);
        e.b(false);
        f.b(false);
        if (k != null)
        {
            k.remove();
        }
_L10:
        if (k1 != 0)
        {
            p();
            return;
        }
          goto _L4
_L8:
        d.setSelected(false);
        e.b(false);
        f.b(true);
        if (l == null)
        {
            l = new c();
            m = (new TileOverlayOptions()).tileProvider(l);
        }
        k = h.addTileOverlay(m);
        if (true) goto _L10; else goto _L9
_L9:
_L4:
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void m()
    {
        h = g.getMap();
        UiSettings uisettings = h.getUiSettings();
        uisettings.setZoomControlsEnabled(false);
        uisettings.setMyLocationButtonEnabled(false);
        uisettings.setAllGesturesEnabled(false);
        uisettings.setRotateGesturesEnabled(false);
        uisettings.setTiltGesturesEnabled(false);
        uisettings.setCompassEnabled(false);
        h.setMapType(4);
        h.setOnCameraChangeListener(this);
        h.setOnMapClickListener(this);
    }

    private Context n()
    {
        return u.getApplicationContext();
    }

    private void o()
    {
        if (p == null)
        {
            return;
        }
        if (n)
        {
            e.a(0);
        } else
        {
            e.a(8);
        }
        if (o)
        {
            f.a(0);
        } else
        {
            f.a(8);
        }
        g.post(new m(this));
    }

    private void p()
    {
        android.content.SharedPreferences.Editor editor = GoWidgetApplication.c(n()).a().edit();
        editor.putInt("key_maps_select_type", i);
        editor.commit();
    }

    private void q()
    {
        Intent intent = new Intent(a.getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", 5);
        intent.putExtra("recommend_enterance", 13);
        a.startActivity(intent);
    }

    private void r()
    {
        if (p == null)
        {
            return;
        } else
        {
            ((com.go.weatherex.home.current.w)a).f(p.c());
            return;
        }
    }

    private void s()
    {
        v.setText(u.getString(0x7f0802e0));
    }

    public void a(String s1)
    {
        boolean flag2 = false;
        boolean flag = true;
        if (!GoWidgetApplication.a)
        {
            s.setVisibility(0);
            s.setText(0x7f080301);
            return;
        }
        q = s1;
        d.setOnClickListener(this);
        e.a(this);
        f.a(this);
        g.onCreate(null);
        g.onResume();
        m();
        t.setVisibility(0);
        b(s1);
        j = GoWidgetApplication.b(n()).b();
        s1 = f;
        int i1;
        int j1;
        boolean flag1;
        if (!j)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1.a(flag1);
        s1 = e;
        flag1 = flag2;
        if (!j)
        {
            flag1 = true;
        }
        s1.a(flag1);
        if (j)
        {
            j1 = r.getInt("key_maps_select_type", 1);
        } else
        {
            j1 = 1;
        }
        if (j1 != 2 || n) goto _L2; else goto _L1
_L1:
        i1 = 1;
_L4:
        if (i1 == 2)
        {
            i1 = ((flag) ? 1 : 0);
        }
        g(i1);
        o();
        return;
_L2:
        i1 = j1;
        if (j1 == 3)
        {
            i1 = j1;
            if (!o)
            {
                i1 = 1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(List list, com.gau.go.launcherex.gowidget.weather.util.w w1)
    {
        if (w1.a == 1)
        {
            b(q);
            o();
        }
    }

    public void c()
    {
        boolean flag1 = true;
        j = GoWidgetApplication.b(n()).b();
        n n1 = f;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n1.a(flag);
        n1 = e;
        if (!j)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        n1.a(flag);
    }

    public View f()
    {
        return b;
    }

    public void g()
    {
    }

    public void h()
    {
        s();
    }

    public void i()
    {
        com.gtp.a.a.b.c.a("BriefCardMap", "destroy");
        if (k != null)
        {
            k.clearTileCache();
            k.remove();
        }
        g.onDestroy();
        r.unregisterOnSharedPreferenceChangeListener(this);
    }

    public void j()
    {
        super.j();
        com.gtp.a.a.b.c.a("BriefCardMap", "onResume");
        g.onResume();
    }

    public void k()
    {
        super.k();
        com.gtp.a.a.b.c.a("BriefCardMap", "onPause");
        g.onPause();
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        if (c.getVisibility() != 0)
        {
            c.setVisibility(0);
        }
    }

    public void onClick(View view)
    {
        if (view.equals(d))
        {
            g(1);
        } else
        {
            if (view.equals(e.a))
            {
                if (j)
                {
                    g(2);
                    return;
                } else
                {
                    q();
                    return;
                }
            }
            if (view.equals(f.a))
            {
                if (j)
                {
                    g(3);
                    return;
                } else
                {
                    q();
                    return;
                }
            }
        }
    }

    public void onMapClick(LatLng latlng)
    {
        p();
        r();
        l();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s1)
    {
        int i1;
label0:
        {
            if (s1.equals("key_maps_select_type"))
            {
                i1 = sharedpreferences.getInt("key_maps_select_type", i);
                if (i1 != 2)
                {
                    break label0;
                }
            }
            return;
        }
        g(i1);
    }
}
