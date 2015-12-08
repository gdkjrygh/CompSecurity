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
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globalview.i;
import com.gau.go.launcherex.gowidget.weather.globalview.t;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.view.VerticalStretchLayout;
import com.go.weatherex.framework.fragment.a;
import com.gtp.a.a.b.c;
import java.util.ArrayList;

// Referenced classes of package com.go.weatherex.setting:
//            bi, bh, bj, bb, 
//            bg, bk, bc, bd, 
//            be, bf

public class ba extends a
    implements android.view.View.OnClickListener, android.widget.CompoundButton.OnCheckedChangeListener
{

    private TextView A;
    private bj B;
    private bk C;
    private bk D;
    private bh E;
    private bi F;
    private String G;
    private int H;
    private final int I[] = {
        0x7f0803e5, 0x7f0803e7, 0x7f0803e6
    };
    private final int J[] = {
        0x7f0803e9, 0x7f0803ea, 0x7f0803eb
    };
    private final int K[] = {
        0x7f0803ed, 0x7f0803ee, 0x7f0803ef
    };
    private final int L[] = {
        0x7f0803f4, 0x7f0803f3, 0x7f0803f2
    };
    private long M;
    private t N;
    private i O;
    private Activity P;
    private LayoutInflater a;
    private TextView b;
    private View c;
    private int d;
    private int e;
    private int f;
    private int g;
    private View h;
    private TextView i;
    private TextView j;
    private View k;
    private CheckBox l;
    private TextView m;
    private View n;
    private CheckBox o;
    private TextView p;
    private VerticalStretchLayout q;
    private TextView r;
    private View s;
    private TextView t;
    private TextView u;
    private View v;
    private TextView w;
    private TextView x;
    private View y;
    private TextView z;

    public ba()
    {
        G = "--";
        H = -1;
    }

    static int a(ba ba1, int i1)
    {
        ba1.H = i1;
        return i1;
    }

    static long a(ba ba1, long l1)
    {
        ba1.M = l1;
        return l1;
    }

    static bi a(ba ba1, bi bi1)
    {
        ba1.F = bi1;
        return bi1;
    }

    static bk a(ba ba1)
    {
        return ba1.C;
    }

    static String a(ba ba1, String s1)
    {
        ba1.G = s1;
        return s1;
    }

    private void a(Cursor cursor)
    {
        bi abi[] = new bi[cursor.getCount()];
        int l1 = cursor.getColumnCount();
        cursor.moveToFirst();
        int i1 = 0;
        bi bi2 = null;
        bi bi1;
        do
        {
            abi[i1] = new bi(this, null);
            int j1 = 0;
            while (j1 < l1) 
            {
                String s1 = cursor.getColumnName(j1);
                if ("cityName".equals(s1))
                {
                    abi[i1].a = cursor.getString(j1);
                } else
                if ("cityId".equals(s1))
                {
                    abi[i1].b = cursor.getString(j1);
                } else
                if ("city_my_location".equals(s1))
                {
                    abi[i1].c = cursor.getInt(j1);
                }
                j1++;
            }
            if (abi[i1].b.equals(G))
            {
                if (H == abi[i1].c || H != 1 && abi[i1].c != 1)
                {
                    abi[i1].d = true;
                    F = abi[i1];
                }
            } else
            {
                abi[i1].d = false;
            }
            bi1 = bi2;
            if (abi[i1].c == 3)
            {
                bi2 = new bi(this, null);
                bi2.b = abi[i1].b;
                bi2.a = abi[i1].a;
                bi2.c = 1;
                abi[i1].c = 2;
                bi1 = bi2;
                if (bi2.b.equals(G))
                {
                    bi1 = bi2;
                    if (bi2.c == H)
                    {
                        bi2.d = true;
                        F = bi2;
                        bi1 = bi2;
                    }
                }
            }
            i1++;
            bi2 = bi1;
        } while (cursor.moveToNext());
        if (bi1 != null)
        {
            int k1 = abi.length;
            cursor = new bi[k1 + 1];
            i1 = 0;
            while (i1 <= k1) 
            {
                if (i1 < k1)
                {
                    cursor[i1] = abi[i1];
                } else
                if (i1 == k1)
                {
                    cursor[i1] = bi1;
                }
                i1++;
            }
            E = new bh(this, cursor);
        } else
        {
            E = new bh(this, abi);
        }
        if (F == null && abi[0] != null)
        {
            cursor = abi[0];
            cursor.d = true;
            F = cursor;
        }
        if (F != null)
        {
            i.setText(F.a());
        } else
        {
            i.setText("--");
        }
        a(true);
    }

    static void a(ba ba1, Cursor cursor)
    {
        ba1.a(cursor);
    }

    static void a(ba ba1, boolean flag)
    {
        ba1.a(flag);
    }

    private void a(boolean flag)
    {
        h.setEnabled(flag);
        i.setEnabled(flag);
        j.setEnabled(flag);
        if (flag)
        {
            j.setTextColor(d);
            i.setTextColor(d);
            i.setCompoundDrawablesWithIntrinsicBounds(0, 0, f, 0);
            return;
        } else
        {
            j.setTextColor(e);
            i.setTextColor(e);
            i.setCompoundDrawablesWithIntrinsicBounds(0, 0, g, 0);
            return;
        }
    }

    static bk b(ba ba1)
    {
        return ba1.D;
    }

    private void b()
    {
        B.a(2, null, WeatherContentProvider.a, new String[] {
            "cityName", "cityId", "city_my_location"
        }, null, null, "sequence");
    }

    static void b(ba ba1, boolean flag)
    {
        ba1.b(flag);
    }

    private void b(boolean flag)
    {
        k.setEnabled(flag);
        l.setEnabled(flag);
        if (flag)
        {
            m.setTextColor(d);
            return;
        } else
        {
            m.setTextColor(e);
            return;
        }
    }

    static CheckBox c(ba ba1)
    {
        return ba1.l;
    }

    private void c()
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        CharSequence acharsequence[] = E.b();
        int j1 = acharsequence.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
            a1.a = acharsequence[i1].toString();
            a1.c = Integer.valueOf(i1);
            boolean flag1;
            if (E.c() == i1)
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
        t t1 = d();
        t1.a(0x7f0803e1);
        t1.a(arraylist);
        i1 = ((flag) ? 1 : 0);
        if (j1 > 4)
        {
            i1 = 4;
        }
        t1.b(i1);
        t1.a(new bb(this));
        t1.a();
    }

    static void c(ba ba1, boolean flag)
    {
        ba1.c(flag);
    }

    private void c(boolean flag)
    {
        n.setEnabled(flag);
        o.setEnabled(flag);
        if (flag)
        {
            p.setTextColor(d);
            return;
        } else
        {
            p.setTextColor(e);
            return;
        }
    }

    static TextView d(ba ba1)
    {
        return ba1.u;
    }

    private t d()
    {
        if (N == null)
        {
            N = new t(getActivity());
        }
        return N;
    }

    static void d(ba ba1, boolean flag)
    {
        ba1.d(flag);
    }

    private void d(boolean flag)
    {
        r.setEnabled(flag);
        if (flag)
        {
            r.setTextColor(d);
            r.setCompoundDrawablesWithIntrinsicBounds(0, 0, f, 0);
            return;
        } else
        {
            r.setTextColor(e);
            r.setCompoundDrawablesWithIntrinsicBounds(0, 0, g, 0);
            return;
        }
    }

    static TextView e(ba ba1)
    {
        return ba1.w;
    }

    static void e(ba ba1, boolean flag)
    {
        ba1.e(flag);
    }

    private void e(boolean flag)
    {
        s.setEnabled(flag);
        if (flag)
        {
            t.setTextColor(d);
            u.setTextColor(d);
            u.setCompoundDrawablesWithIntrinsicBounds(0, 0, f, 0);
            return;
        } else
        {
            t.setTextColor(e);
            u.setTextColor(e);
            u.setCompoundDrawablesWithIntrinsicBounds(0, 0, g, 0);
            return;
        }
    }

    static TextView f(ba ba1)
    {
        return ba1.z;
    }

    static void f(ba ba1, boolean flag)
    {
        ba1.f(flag);
    }

    private void f(boolean flag)
    {
        v.setEnabled(flag);
        if (flag)
        {
            x.setTextColor(d);
            w.setTextColor(d);
            w.setCompoundDrawablesWithIntrinsicBounds(0, 0, f, 0);
            return;
        } else
        {
            x.setTextColor(e);
            w.setTextColor(e);
            w.setCompoundDrawablesWithIntrinsicBounds(0, 0, g, 0);
            return;
        }
    }

    static CheckBox g(ba ba1)
    {
        return ba1.o;
    }

    static void g(ba ba1, boolean flag)
    {
        ba1.g(flag);
    }

    private void g(boolean flag)
    {
        y.setEnabled(flag);
        if (flag)
        {
            A.setTextColor(d);
            z.setTextColor(d);
            z.setCompoundDrawablesWithIntrinsicBounds(0, 0, f, 0);
            return;
        } else
        {
            A.setTextColor(e);
            z.setTextColor(e);
            z.setCompoundDrawablesWithIntrinsicBounds(0, 0, g, 0);
            return;
        }
    }

    static VerticalStretchLayout h(ba ba1)
    {
        return ba1.q;
    }

    static long i(ba ba1)
    {
        return ba1.M;
    }

    static Activity j(ba ba1)
    {
        return ba1.P;
    }

    private i j()
    {
        if (O == null)
        {
            O = new i(getActivity());
        }
        return O;
    }

    static bh k(ba ba1)
    {
        return ba1.E;
    }

    private void k()
    {
        B.a(1, null, WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            "key_live_wallpaper_city_id"
        }, "_id");
    }

    static bi l(ba ba1)
    {
        return ba1.F;
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
            B.a(k1, null, WeatherContentProvider.g, new String[] {
                "setting_value"
            }, "setting_key=?", new String[] {
                s1
            }, "_id");
        }

    }

    static TextView m(ba ba1)
    {
        return ba1.i;
    }

    private void m()
    {
        ArrayList arraylist;
        int j1;
        int k1;
        arraylist = new ArrayList();
        k1 = I.length;
        j1 = 0;
_L5:
        bg bg1;
        if (j1 >= k1)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        bg1 = new bg(this, null);
        bg1.a = I[j1];
        I[j1];
        JVM INSTR tableswitch 2131231717 2131231719: default 80
    //                   2131231717 137
    //                   2131231718 151
    //                   2131231719 165;
           goto _L1 _L2 _L3 _L4
_L1:
        com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.c = bg1;
        a1.a = getString(bg1.a);
        boolean flag;
        if (bg1.c == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a1.b = flag;
        arraylist.add(a1);
        j1++;
        if (true) goto _L5; else goto _L2
_L2:
        bg1.c = D.c;
          goto _L1
_L3:
        bg1.c = D.d;
          goto _L1
_L4:
        bg1.c = D.e;
          goto _L1
        i i1 = j();
        i1.a(0x7f0803e4);
        i1.a(arraylist);
        i1.a(new bc(this));
        i1.a();
        return;
    }

    private void n()
    {
        ArrayList arraylist;
        int i1;
        byte byte1;
        int j1;
        byte1 = 4;
        arraylist = new ArrayList();
        j1 = J.length;
        i1 = 0;
_L6:
        bg bg1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        bg1 = new bg(this, null);
        bg1.a = J[i1];
        J[i1];
        JVM INSTR tableswitch 2131231721 2131231723: default 84
    //                   2131231721 132
    //                   2131231722 159
    //                   2131231723 186;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_186;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.c = bg1;
        a1.a = getString(bg1.a);
        a1.b = bg1.b;
        arraylist.add(a1);
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        bg1.c = 1;
        if (D.f == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
_L3:
        bg1.c = 2;
        if (D.f == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        bg1.c = 3;
        if (D.f == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        t t1 = d();
        t1.a(0x7f0803e8);
        t1.a(arraylist);
        byte byte0;
        if (j1 > 4)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        t1.b(byte0);
        t1.a(new bd(this));
        t1.a();
        return;
    }

    private void o()
    {
        ArrayList arraylist;
        int i1;
        byte byte1;
        int j1;
        byte1 = 4;
        arraylist = new ArrayList();
        j1 = K.length;
        i1 = 0;
_L6:
        bg bg1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        bg1 = new bg(this, null);
        bg1.a = K[i1];
        K[i1];
        JVM INSTR tableswitch 2131231725 2131231727: default 84
    //                   2131231725 132
    //                   2131231726 159
    //                   2131231727 186;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_186;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.c = bg1;
        a1.a = getString(bg1.a);
        a1.b = bg1.b;
        arraylist.add(a1);
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        bg1.c = 1;
        if (D.g == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
_L3:
        bg1.c = 2;
        if (D.g == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        bg1.c = 3;
        if (D.g == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        t t1 = d();
        t1.a(0x7f0803ec);
        t1.a(arraylist);
        byte byte0;
        if (j1 > 4)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        t1.b(byte0);
        t1.a(new be(this));
        t1.a();
        return;
    }

    private void p()
    {
        ArrayList arraylist;
        int i1;
        byte byte1;
        int j1;
        byte1 = 4;
        arraylist = new ArrayList();
        j1 = L.length;
        i1 = 0;
_L6:
        bg bg1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        bg1 = new bg(this, null);
        bg1.a = L[i1];
        L[i1];
        JVM INSTR tableswitch 2131231730 2131231732: default 84
    //                   2131231730 186
    //                   2131231731 159
    //                   2131231732 132;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_186;
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L7:
        com.gau.go.launcherex.gowidget.weather.globalview.a a1 = new com.gau.go.launcherex.gowidget.weather.globalview.a();
        a1.c = bg1;
        a1.a = getString(bg1.a);
        a1.b = bg1.b;
        arraylist.add(a1);
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        bg1.c = 1;
        if (D.h == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
_L3:
        bg1.c = 2;
        if (D.h == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        bg1.c = 3;
        if (D.h == bg1.c)
        {
            bg1.b = true;
        }
          goto _L7
        t t1 = d();
        t1.a(0x7f0803f1);
        t1.a(arraylist);
        byte byte0;
        if (j1 > 4)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        t1.b(byte0);
        t1.a(new bf(this));
        t1.a();
        return;
    }

    private void q()
    {
        M = System.currentTimeMillis();
        ArrayList arraylist = new ArrayList();
        if (F != null && (!G.equals(F.b) || H != F.c))
        {
            Object obj;
            if (F.b == null)
            {
                obj = "--";
            } else
            {
                obj = F.b;
            }
            G = ((String) (obj));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", F.b);
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_city_id"
            }).build());
            ((ContentValues) (obj)).clear();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(F.c));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_city_flag"
            }).build());
        }
        if (D.a != C.a)
        {
            C.a = D.a;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.a));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_dynamic_effect_on"
            }).build());
        }
        if (D.b != C.b)
        {
            C.b = D.b;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.b));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_show_weather_info_on"
            }).build());
        }
        if (D.c != C.c)
        {
            C.c = D.c;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.c));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_description_on"
            }).build());
        }
        if (D.e != C.e)
        {
            C.e = D.e;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.e));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_hight_low_temperature_on"
            }).build());
        }
        if (D.d != C.d)
        {
            C.d = D.d;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.d));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_wind_on"
            }).build());
        }
        if (D.f != C.f)
        {
            C.f = D.f;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.f));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_position"
            }).build());
        }
        if (D.g != C.g)
        {
            C.g = D.g;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.g));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_show_moment"
            }).build());
        }
        if (D.h != C.h)
        {
            C.h = D.h;
            obj = new ContentValues();
            ((ContentValues) (obj)).put("setting_value", Integer.valueOf(D.h));
            arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(((ContentValues) (obj))).withSelection("setting_key=?", new String[] {
                "key_live_wallpaper_weather_info_font_size"
            }).build());
        }
        M = System.currentTimeMillis() - M;
        com.gtp.a.a.b.c.a("LJL", (new StringBuilder()).append("mTime:").append(M).toString());
        M = System.currentTimeMillis();
        B.a(17, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
    }

    protected boolean a()
    {
        return super.a();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        B = new bj(this, getActivity().getContentResolver());
        a = getActivity().getLayoutInflater();
        C = new bk(this, null);
        D = new bk(this, null);
        d = getResources().getColor(0x7f0a0086);
        e = getResources().getColor(0x7f0a0088);
        f = 0x7f020425;
        g = 0x7f020425;
        b = (TextView)c(0x7f090202);
        b.setText(0x7f08038d);
        c = c(0x7f090226);
        h = c(0x7f0902ff);
        i = (TextView)h.findViewById(0x7f090231);
        j = (TextView)h.findViewById(0x7f090300);
        k = c(0x7f090312);
        l = (CheckBox)k.findViewById(0x7f090314);
        m = (TextView)k.findViewById(0x7f090313);
        n = c(0x7f090315);
        o = (CheckBox)n.findViewById(0x7f090317);
        p = (TextView)n.findViewById(0x7f090316);
        q = (VerticalStretchLayout)c(0x7f090318);
        r = (TextView)c(0x7f090319);
        s = c(0x7f09031a);
        u = (TextView)s.findViewById(0x7f09031c);
        t = (TextView)s.findViewById(0x7f09031b);
        v = c(0x7f09031d);
        w = (TextView)v.findViewById(0x7f09031f);
        x = (TextView)v.findViewById(0x7f09031e);
        y = c(0x7f090320);
        A = (TextView)y.findViewById(0x7f090321);
        z = (TextView)y.findViewById(0x7f090322);
        c.setOnClickListener(this);
        h.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnCheckedChangeListener(this);
        n.setOnClickListener(this);
        o.setOnCheckedChangeListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        v.setOnClickListener(this);
        y.setOnClickListener(this);
        a(false);
        b(false);
        c(false);
        d(false);
        e(false);
        f(false);
        g(false);
        k();
        l();
        b();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        P = activity;
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        boolean flag1 = true;
        int i1 = 1;
        if (compoundbutton.equals(l))
        {
            compoundbutton = D;
            if (!l.isChecked())
            {
                i1 = 0;
            }
            compoundbutton.a = i1;
        } else
        if (compoundbutton.equals(o))
        {
            int j1;
            if (o.isChecked())
            {
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 0;
            }
            if (D.b != j1)
            {
                D.b = j1;
                flag = o.isChecked();
                d(flag);
                e(flag);
                f(flag);
                g(flag);
                if (flag)
                {
                    q.d();
                    return;
                } else
                {
                    q.c();
                    return;
                }
            }
        }
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            h();
        } else
        {
            if (view.equals(h))
            {
                c();
                return;
            }
            if (view.equals(k))
            {
                l.toggle();
                return;
            }
            if (view.equals(n))
            {
                o.toggle();
                return;
            }
            if (view.equals(r))
            {
                m();
                return;
            }
            if (view.equals(s))
            {
                n();
                return;
            }
            if (view.equals(v))
            {
                o();
                return;
            }
            if (view.equals(y))
            {
                p();
                return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030089, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        if (getActivity().isFinishing())
        {
            q();
        }
    }

    public void onResume()
    {
        super.onResume();
    }

    public void onStop()
    {
        super.onStop();
        q();
    }
}
