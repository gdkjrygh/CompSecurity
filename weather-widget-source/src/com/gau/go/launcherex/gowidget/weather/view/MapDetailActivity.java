// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.a.a.c;
import com.gau.go.launcherex.goweather.a.b;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ab, ac

public class MapDetailActivity extends BaseFragmentActivity
    implements android.view.View.OnClickListener, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
{

    private GoogleMap a;
    private ViewGroup b;
    private ImageView c;
    private ac d;
    private ac e;
    private View f;
    private View g;
    private TextView h;
    private TileOverlay i;
    private TileProvider j;
    private TileOverlayOptions k;
    private LatLng l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private b r;
    private String s;
    private String t;
    private com.go.weatherex.map.b u;
    private boolean v;
    private BroadcastReceiver w;

    public MapDetailActivity()
    {
        m = 0;
        n = false;
        o = false;
        p = false;
        v = false;
        w = new ab(this);
    }

    private void a(int i1)
    {
        int j1 = m;
        if (m == i1) goto _L2; else goto _L1
_L1:
        m = i1;
        m;
        JVM INSTR tableswitch 1 3: default 48
    //                   1 58
    //                   2 109
    //                   3 163;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new IllegalArgumentException("viewState is illegal");
_L4:
        c.setSelected(true);
        d.b(false);
        e.b(false);
        m();
        if (i != null)
        {
            i.remove();
        }
_L8:
        if (j1 != 0)
        {
            k();
        }
_L2:
        return;
_L5:
        c.setSelected(false);
        d.b(true);
        e.b(false);
        if (i != null)
        {
            i.remove();
        }
        l();
        com.gau.go.launcherex.gowidget.statistics.w.a("maps_tab_radar", getApplicationContext());
        continue; /* Loop/switch isn't completed */
_L6:
        c.setSelected(false);
        d.b(false);
        e.b(true);
        m();
        if (j == null)
        {
            j = new c();
            k = (new TileOverlayOptions()).tileProvider(j);
        }
        i = a.addTileOverlay(k);
        com.gau.go.launcherex.gowidget.statistics.w.a("map_tab_satellite", getApplicationContext());
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(Intent intent)
    {
        boolean flag1 = true;
        if (intent == null)
        {
            return;
        }
        t = intent.getStringExtra("radar_map_url");
        q = GoWidgetApplication.b(getApplicationContext()).b();
        n = intent.getBooleanExtra("has_radar_data", false);
        o = intent.getBooleanExtra("has_satellite_data", false);
        Object obj = GoWidgetApplication.c(getApplicationContext()).a();
        int i1;
        int j1;
        boolean flag;
        if (q)
        {
            i1 = ((SharedPreferences) (obj)).getInt("key_maps_select_type", 1);
        } else
        {
            i1 = 1;
        }
        if (i1 == 2 && !n)
        {
            j1 = 1;
        } else
        {
            j1 = i1;
            if (i1 == 3)
            {
                j1 = i1;
                if (!o)
                {
                    j1 = 1;
                }
            }
        }
        a(j1);
        v = true;
        if (n)
        {
            d.a(0);
        } else
        {
            d.a(8);
        }
        if (o)
        {
            e.a(0);
        } else
        {
            e.a(8);
        }
        obj = e;
        if (!q)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ac) (obj)).a(flag);
        obj = d;
        if (!q)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((ac) (obj)).a(flag);
        s = intent.getStringExtra("city_name");
        h.setText(s);
        l = new LatLng(intent.getDoubleExtra("city_latitude", 0.0D), intent.getDoubleExtra("city_longitude", 0.0D));
        a.moveCamera(CameraUpdateFactory.newLatLngZoom(l, 7F));
    }

    public static void a(Intent intent, String s1, double d1, double d2, boolean flag, boolean flag1, 
            String s2)
    {
        intent.putExtra("city_name", s1);
        intent.putExtra("city_latitude", d1);
        intent.putExtra("city_longitude", d2);
        intent.putExtra("has_radar_data", flag);
        intent.putExtra("has_satellite_data", flag1);
        intent.putExtra("radar_map_url", s2);
    }

    static boolean a(MapDetailActivity mapdetailactivity)
    {
        return mapdetailactivity.q;
    }

    static boolean a(MapDetailActivity mapdetailactivity, boolean flag)
    {
        mapdetailactivity.q = flag;
        return flag;
    }

    private boolean a(CameraPosition cameraposition)
    {
        boolean flag;
        if (cameraposition.zoom > 8.5F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        return p;
    }

    static ac b(MapDetailActivity mapdetailactivity)
    {
        return mapdetailactivity.e;
    }

    private void b(int i1)
    {
        if (g.getVisibility() != i1)
        {
            g.setVisibility(i1);
            if (v)
            {
                r.a(g, i1);
                return;
            }
        }
    }

    static ac c(MapDetailActivity mapdetailactivity)
    {
        return mapdetailactivity.d;
    }

    private void c(int i1)
    {
        if (b.getVisibility() == i1)
        {
            return;
        } else
        {
            b.setVisibility(i1);
            r.b(b, i1);
            return;
        }
    }

    private void g()
    {
        if (!n && !o)
        {
            c(4);
            b(4);
        } else
        {
            c(0);
            if (m == 2)
            {
                b(0);
                return;
            }
        }
    }

    private boolean h()
    {
        a = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(0x7f0900d3)).getMap();
        return a != null;
    }

    private void i()
    {
        UiSettings uisettings = a.getUiSettings();
        uisettings.setZoomControlsEnabled(false);
        uisettings.setMyLocationButtonEnabled(false);
        uisettings.setAllGesturesEnabled(true);
        uisettings.setRotateGesturesEnabled(true);
        uisettings.setTiltGesturesEnabled(false);
        uisettings.setCompassEnabled(true);
        a.setMapType(4);
        int i1 = b_().getDimensionPixelSize(0x7f0c00ef);
        a.setPadding(0, i1 + 10, 0, 0);
        a.setOnCameraChangeListener(this);
    }

    private void j()
    {
        Intent intent = new Intent(this, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", 5);
        intent.putExtra("recommend_enterance", 13);
        startActivity(intent);
    }

    private void k()
    {
        if (m == 2)
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("key_maps_select_type", Integer.valueOf(m));
            getContentResolver().update(WeatherContentProvider.o, contentvalues, null, null);
            return;
        }
    }

    private void l()
    {
        b(0);
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        if (u == null)
        {
            u = com.go.weatherex.map.b.a(t);
            fragmenttransaction.replace(0x7f090425, u, com/go/weatherex/map/b.getName());
        } else
        {
            fragmenttransaction.setCustomAnimations(0x7f04000b, 0x7f04000d);
            fragmenttransaction.show(u);
        }
        fragmenttransaction.commit();
        getSupportFragmentManager().executePendingTransactions();
    }

    private void m()
    {
        b(4);
        if (u != null && u.isVisible())
        {
            FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
            fragmenttransaction.setCustomAnimations(0x7f04000b, 0x7f04000d);
            fragmenttransaction.hide(u);
            fragmenttransaction.commit();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        com.gtp.a.a.b.c.a("MapDetailActivity", (new StringBuilder()).append("onCameraChange: ").append(cameraposition.toString()).append(", time: ").append(System.currentTimeMillis()).toString());
        if (a(cameraposition))
        {
            c(4);
            b(4);
            return;
        } else
        {
            g();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            a(1);
        } else
        {
            if (view.equals(d.a))
            {
                if (q)
                {
                    a(2);
                    return;
                } else
                {
                    j();
                    return;
                }
            }
            if (view.equals(e.a))
            {
                if (q)
                {
                    a(3);
                    return;
                } else
                {
                    j();
                    return;
                }
            }
            if (view.equals(f))
            {
                finish();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        r = new b();
        setContentView(0x7f0300c6);
        b = (ViewGroup)findViewById(0x7f0901f2);
        b.setVisibility(8);
        c = (ImageView)findViewById(0x7f0901f4);
        d = new ac();
        d.a = b.findViewById(0x7f0901f8);
        d.b = (ImageView)b.findViewById(0x7f0901f9);
        d.c = (ImageView)b.findViewById(0x7f0901fa);
        e = new ac();
        e.a = b.findViewById(0x7f0901f5);
        e.b = (ImageView)b.findViewById(0x7f0901f6);
        e.c = (ImageView)b.findViewById(0x7f0901f7);
        f = findViewById(0x7f090226);
        g = findViewById(0x7f0902e9);
        h = (TextView)findViewById(0x7f090202);
        f.setOnClickListener(this);
        c.setOnClickListener(this);
        d.a(this);
        e.a(this);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.goweather.ACTION_UPDATE_DATA");
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.PURCHASE_CHANGE");
        registerReceiver(w, bundle);
        if (h())
        {
            i();
            a(getIntent());
        } else
        {
            finish();
        }
        com.gau.go.launcherex.gowidget.statistics.w.a("maps_tab_map_detail", getApplicationContext());
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(w);
        if (i != null)
        {
            i.clearTileCache();
            i.remove();
        }
    }

    public void onLanguageChanged(Resources resources)
    {
        super.onLanguageChanged(resources);
        switch (m)
        {
        default:
            throw new IllegalArgumentException("viewState is illegal");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        a(intent);
    }
}
