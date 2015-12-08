// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.weather.globaltheme.d;
import com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.g;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.themestore.ac;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            e, d, g, f, 
//            c, ab

public class b extends a
    implements android.view.View.OnClickListener, com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.b
{

    private int a;
    private int b;
    private int c;
    private int d;
    private TextView e;
    private View f;
    private View g;
    private TextView h;
    private TextView i;
    private View j;
    private f k;
    private d l;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.view.a.a m;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.b.b n;
    private com.go.weatherex.setting.g o;
    private com.go.weatherex.setting.g p;
    private com.go.weatherex.setting.d q;
    private e r;
    private String s;
    private int t;
    private t u;
    private Activity v;
    private final h w = new h();

    public b()
    {
        s = "--";
        t = -1;
    }

    static int a(b b1, int i1)
    {
        b1.t = i1;
        return i1;
    }

    static e a(b b1, e e1)
    {
        b1.r = e1;
        return e1;
    }

    static com.go.weatherex.setting.g a(b b1)
    {
        return b1.o;
    }

    static String a(b b1, String s1)
    {
        b1.s = s1;
        return s1;
    }

    private void a(Cursor cursor)
    {
        e ae[] = new e[cursor.getCount()];
        int l1 = cursor.getColumnCount();
        cursor.moveToFirst();
        int i1 = 0;
        e e2 = null;
        e e1;
        do
        {
            ae[i1] = new e(this, null);
            int j1 = 0;
            while (j1 < l1) 
            {
                String s1 = cursor.getColumnName(j1);
                if ("cityName".equals(s1))
                {
                    ae[i1].a = cursor.getString(j1);
                } else
                if ("cityId".equals(s1))
                {
                    ae[i1].b = cursor.getString(j1);
                } else
                if ("city_my_location".equals(s1))
                {
                    ae[i1].c = cursor.getInt(j1);
                }
                j1++;
            }
            if (ae[i1].b.equals(s))
            {
                if (t == ae[i1].c || t != 1 && ae[i1].c != 1)
                {
                    ae[i1].d = true;
                    r = ae[i1];
                }
            } else
            {
                ae[i1].d = false;
            }
            e1 = e2;
            if (ae[i1].c == 3)
            {
                e2 = new e(this, null);
                e2.b = ae[i1].b;
                e2.a = ae[i1].a;
                e2.c = 1;
                ae[i1].c = 2;
                e1 = e2;
                if (e2.b.equals(s))
                {
                    e1 = e2;
                    if (e2.c == t)
                    {
                        e2.d = true;
                        r = e2;
                        e1 = e2;
                    }
                }
            }
            i1++;
            e2 = e1;
        } while (cursor.moveToNext());
        if (e1 != null)
        {
            int k1 = ae.length;
            cursor = new e[k1 + 1];
            i1 = 0;
            while (i1 <= k1) 
            {
                if (i1 < k1)
                {
                    cursor[i1] = ae[i1];
                } else
                if (i1 == k1)
                {
                    cursor[i1] = e1;
                }
                i1++;
            }
            q = new com.go.weatherex.setting.d(this, cursor);
        } else
        {
            q = new com.go.weatherex.setting.d(this, ae);
        }
        if (r == null && ae[0] != null)
        {
            cursor = ae[0];
            cursor.d = true;
            r = cursor;
        }
        if (r != null)
        {
            h.setText(r.a());
        } else
        {
            h.setText("--");
        }
        a(true);
    }

    static void a(b b1, Cursor cursor)
    {
        b1.a(cursor);
    }

    static void a(b b1, boolean flag)
    {
        b1.a(flag);
    }

    private void a(boolean flag)
    {
        g.setEnabled(flag);
        h.setEnabled(flag);
        i.setEnabled(flag);
        if (flag)
        {
            i.setTextColor(a);
            h.setTextColor(a);
            h.setCompoundDrawablesWithIntrinsicBounds(0, 0, c, 0);
            return;
        } else
        {
            i.setTextColor(b);
            h.setTextColor(b);
            h.setCompoundDrawablesWithIntrinsicBounds(0, 0, d, 0);
            return;
        }
    }

    static com.go.weatherex.setting.g b(b b1)
    {
        return b1.p;
    }

    static Activity c(b b1)
    {
        return b1.v;
    }

    private void c()
    {
        if (n != null)
        {
            l.a(3, n);
        }
    }

    static com.go.weatherex.setting.d d(b b1)
    {
        return b1.q;
    }

    private void d()
    {
        ArrayList arraylist = new ArrayList();
        if (r != null && (!s.equals(r.b) || t != r.c))
        {
            Object obj;
            if (r.b == null)
            {
                obj = "--";
            } else
            {
                obj = r.b;
            }
            s = ((String) (obj));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", r.b);
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_city_id"
            }).build());
            ((ContentValues) (obj)).clear();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(r.c));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_city_flag"
            }).build());
        }
        if (n != null)
        {
            obj = o;
            int i1;
            if (n.g())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            obj.a = i1;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(o.a));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_dynamic_effect_on"
            }).build());
        }
        k.a(17, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
    }

    static e e(b b1)
    {
        return b1.r;
    }

    static TextView f(b b1)
    {
        return b1.h;
    }

    private void j()
    {
        k.a(2, null, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "city_my_location"
        }, null, null, "sequence");
    }

    private void k()
    {
        k.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "key_live_wallpaper_city_id"
        }, "_id");
    }

    private void l()
    {
        SparseArray sparsearray = new SparseArray();
        sparsearray.append(3, "key_live_wallpaper_dynamic_effect_on");
        sparsearray.append(5, "key_live_wallpaper_weather_info_description_on");
        sparsearray.append(6, "key_live_wallpaper_weather_info_wind_on");
        sparsearray.append(7, "key_live_wallpaper_weather_info_hight_low_temperature_on");
        sparsearray.append(8, "key_live_wallpaper_weather_info_position");
        sparsearray.append(9, "key_live_wallpaper_weather_info_show_moment");
        sparsearray.append(16, "key_live_wallpaper_weather_info_font_size");
        sparsearray.append(4, "key_live_wallpaper_show_weather_info_on");
        sparsearray.append(18, "key_live_wallpaper_city_flag");
        int j1 = sparsearray.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = sparsearray.keyAt(i1);
            String s1 = (String)sparsearray.valueAt(i1);
            k.a(k1, null, WeatherContentProvider.g, new String[] {
                "setting_value"
            }, "setting_key=?", new String[] {
                s1
            }, "_id");
        }

    }

    private void m()
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        CharSequence acharsequence[] = q.b();
        int j1 = acharsequence.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = acharsequence[i1].toString();
            a1.c = Integer.valueOf(i1);
            boolean flag1;
            if (q.c() == i1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.b = flag1;
            arraylist.add(a1);
            i1++;
        }
        t t1 = n();
        t1.a(0x7f0803e1);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (j1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new c(this));
        t1.a();
    }

    private t n()
    {
        if (u == null)
        {
            u = new t(getActivity());
        }
        return u;
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.b.b b1)
    {
        if (b1 != null)
        {
            n = b1;
            a(2, b1);
        }
    }

    protected boolean a()
    {
        return super.a();
    }

    public void b()
    {
        d();
        c();
        h();
    }

    protected void b(int i1, Object obj)
    {
        i1;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!w.a((obj = (com.gau.go.launcherex.gowidget.weather.globaltheme.b.b)obj).hashCode()))
        {
            m.a(((com.gau.go.launcherex.gowidget.weather.globaltheme.b.b) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a(new int[] {
            1
        });
        ac.a(getActivity().getApplicationContext());
        l = new d(getActivity().getApplicationContext());
        w.a(800L);
        m = new g(getActivity());
        m.a();
        m.a(this);
        m.a(false);
        m.b(false);
        k = new f(this, getActivity().getContentResolver());
        o = new com.go.weatherex.setting.g(this, null);
        p = new com.go.weatherex.setting.g(this, null);
        a = getResources().getColor(0x7f0a0086);
        b = getResources().getColor(0x7f0a0088);
        c = 0x7f020425;
        d = 0x7f020425;
        e = (TextView)c(0x7f090202);
        e.setText(0x7f08038d);
        f = c(0x7f090226);
        g = c(0x7f0902ff);
        h = (TextView)g.findViewById(0x7f090231);
        i = (TextView)g.findViewById(0x7f090300);
        j = c(0x7f090302);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        j.setOnClickListener(this);
        bundle = getActivity().getSupportFragmentManager().beginTransaction();
        ab ab1 = com.go.weatherex.setting.ab.a(getActivity(), 4);
        ab1.b(getActivity());
        bundle.add(0x7f090301, ab1, com/go/weatherex/setting/ab.getName());
        bundle.commit();
        a(false);
        k();
        l();
        j();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        v = activity;
    }

    public void onClick(View view)
    {
        if (view.equals(f))
        {
            h();
        } else
        {
            if (view.equals(g))
            {
                m();
                return;
            }
            if (view.equals(j))
            {
                b();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030087, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (l != null)
        {
            l.a();
        }
        if (ac.a())
        {
            ac.l();
        }
        if (m != null)
        {
            m.b();
        }
    }

    public void onPause()
    {
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStop()
    {
        super.onStop();
    }
}
