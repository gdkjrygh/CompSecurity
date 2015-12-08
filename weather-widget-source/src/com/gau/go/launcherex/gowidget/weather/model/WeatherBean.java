// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.model;

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.gau.go.launcherex.goweather.a.e;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.model:
//            z, NowBean, ForecastBean, HourlyBean, 
//            PollenIndexBean, AlarmBean, GoLifeBean, c, 
//            q

public class WeatherBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    String a;
    String b;
    String c;
    String d;
    String e;
    int f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public final ArrayList k;
    public NowBean l;
    public Map m;
    private int n;
    private int o;

    public WeatherBean()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        m = new HashMap();
        l = new NowBean();
    }

    private WeatherBean(Parcel parcel)
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k = new ArrayList();
        m = new HashMap();
        try
        {
            a = parcel.readString();
            b = parcel.readString();
            c = parcel.readString();
            n = parcel.readInt();
            f = parcel.readInt();
            g = new ArrayList();
            parcel.readList(g, com/gau/go/launcherex/gowidget/weather/model/ForecastBean.getClassLoader());
            h = new ArrayList();
            parcel.readList(h, com/gau/go/launcherex/gowidget/weather/model/HourlyBean.getClassLoader());
            i = new ArrayList();
            parcel.readList(i, com/gau/go/launcherex/gowidget/weather/model/PollenIndexBean.getClassLoader());
            j = new ArrayList();
            parcel.readList(j, com/gau/go/launcherex/gowidget/weather/model/AlarmBean.getClassLoader());
            parcel.readList(k, com/gau/go/launcherex/gowidget/weather/model/GoLifeBean.getClassLoader());
            l = (NowBean)parcel.readParcelable(com/gau/go/launcherex/gowidget/weather/model/NowBean.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            g = new ArrayList();
        }
        h = new ArrayList();
        i = new ArrayList();
        j = new ArrayList();
        k.clear();
        l = new NowBean();
    }

    WeatherBean(Parcel parcel, z z1)
    {
        this(parcel);
    }

    public static c d(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        c c1 = new c();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (s.equals("alert_id"))
            {
                c1.c(cursor.getInt(i1));
            } else
            if (s.equals("cityId"))
            {
                c1.g(cursor.getString(i1));
            } else
            if (s.equals("publish_time"))
            {
                c1.a(cursor.getString(i1));
            } else
            if (s.equals("exp_time"))
            {
                c1.b(cursor.getString(i1));
            } else
            if (s.equals("type"))
            {
                c1.c(cursor.getString(i1));
            } else
            if (s.equals("description"))
            {
                c1.d(cursor.getString(i1));
            } else
            if (s.equals("phenomena"))
            {
                c1.e(cursor.getString(i1));
            } else
            if (s.equals("level"))
            {
                c1.b(cursor.getInt(i1));
            } else
            if (s.equals("message"))
            {
                c1.f(cursor.getString(i1));
            } else
            if (s.equals("tz_offset"))
            {
                c1.a(cursor.getInt(i1));
            } else
            if (s.equals("has_read"))
            {
                boolean flag;
                if (cursor.getInt(i1) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                c1.c(flag);
            }
            i1++;
        }
        return c1;
    }

    public WeatherBean a(a a1, String s)
    {
        boolean flag = false;
        if (l == null)
        {
            l = new NowBean();
        }
        b = s;
        a = a1.e();
        c = a1.d();
        s = a1.b();
        if (!TextUtils.isEmpty(s))
        {
            d = s;
        }
        s = a1.c();
        if (!TextUtils.isEmpty(s))
        {
            e = s;
        }
        l.a(a1);
        g.clear();
        int i2 = a1.r();
        for (int i1 = 0; i1 < i2; i1++)
        {
            s = a1.c(i1);
            if (s != null)
            {
                ForecastBean forecastbean = new ForecastBean();
                forecastbean.a(s);
                g.add(forecastbean);
            }
        }

        h.clear();
        i2 = a1.s();
        for (int j1 = 0; j1 < i2; j1++)
        {
            s = a1.d(j1);
            if (s != null)
            {
                HourlyBean hourlybean = new HourlyBean();
                hourlybean.a(s);
                h.add(hourlybean);
            }
        }

        k.clear();
        k.addAll(GoLifeBean.c(a1.a()));
        i();
        int l2 = a1.v();
        for (int k1 = 0; k1 < l2; k1++)
        {
            s = a1.g(k1);
            if (s == null)
            {
                continue;
            }
            PollenIndexBean pollenindexbean = new PollenIndexBean();
            int k2 = a1.u();
            i2 = k2;
            if (k2 == -10000)
            {
                i2 = 0;
            }
            pollenindexbean.a(s, i2);
            i.add(pollenindexbean);
        }

        i2 = a1.t();
        for (int l1 = ((flag) ? 1 : 0); l1 < i2; l1++)
        {
            s = a1.e(l1);
            int j2 = s.i();
            c c1 = new c();
            c1.a(s);
            m.put(Integer.valueOf(j2), c1);
        }

        return this;
    }

    public String a()
    {
        return d;
    }

    public void a(int i1)
    {
        n = i1;
    }

    public void a(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (s.equals("cityName"))
            {
                e(cursor.getString(i1));
            } else
            if (s.equals("cityId"))
            {
                c(cursor.getString(i1));
            } else
            if (s.equals("nowDesp"))
            {
                l.c(cursor.getString(i1));
            } else
            if (s.equals("nowTempValue"))
            {
                l.b(cursor.getFloat(i1));
            } else
            if (s.equals("lowTempValue"))
            {
                l.d(cursor.getFloat(i1));
            } else
            if (s.equals("highTempValue"))
            {
                l.c(cursor.getFloat(i1));
            } else
            if (s.equals("windType"))
            {
                l.g(cursor.getInt(i1));
            } else
            if (s.equals("windDirection"))
            {
                l.a(cursor.getString(i1));
            } else
            if (s.equals("windStrengthValue"))
            {
                l.a(cursor.getFloat(i1));
            } else
            if (s.equals("humidityValue"))
            {
                l.d(cursor.getInt(i1));
            } else
            if (s.equals("type"))
            {
                l.e(cursor.getInt(i1));
            } else
            if (s.equals("updateTime"))
            {
                l.a(cursor.getLong(i1));
            } else
            if (s.equals("visibilityValue"))
            {
                l.e(cursor.getFloat(i1));
            } else
            if (s.equals("barometerValue"))
            {
                l.f(cursor.getFloat(i1));
            } else
            if (s.equals("dewpointValue"))
            {
                l.g(cursor.getFloat(i1));
            } else
            if (s.equals("uvIndexValue"))
            {
                l.h(cursor.getFloat(i1));
            } else
            if (s.equals("sunrise"))
            {
                l.d(cursor.getString(i1));
            } else
            if (s.equals("sunset"))
            {
                l.e(cursor.getString(i1));
            } else
            if (s.equals("sequence"))
            {
                e(cursor.getInt(i1));
            } else
            if (s.equals("city_my_location"))
            {
                a(cursor.getInt(i1));
            } else
            if (s.equals("tz_offset"))
            {
                l.h(cursor.getInt(i1));
            } else
            if (s.equals("feelslikeValue"))
            {
                l.j(cursor.getFloat(i1));
            } else
            if (s.equals("pop"))
            {
                l.i(cursor.getInt(i1));
            } else
            if (s.equals("state"))
            {
                a(cursor.getString(i1));
            } else
            if (s.equals("country"))
            {
                b(cursor.getString(i1));
            } else
            if (s.equals("_id"))
            {
                b(cursor.getInt(i1));
            } else
            if (s.equals("oldCityId"))
            {
                d(cursor.getString(i1));
            } else
            if (s.equals("timestamp"))
            {
                l.b(cursor.getLong(i1));
            } else
            if (s.equals("rainFall"))
            {
                l.i(cursor.getFloat(i1));
            } else
            if (s.equals("aqi"))
            {
                l.k(cursor.getInt(i1));
            } else
            if (s.equals("qualityType"))
            {
                l.l(cursor.getInt(i1));
            } else
            if (s.equals("pm25"))
            {
                l.m(cursor.getInt(i1));
            } else
            if (s.equals("pm10"))
            {
                l.n(cursor.getInt(i1));
            } else
            if (s.equals("so2"))
            {
                l.o(cursor.getInt(i1));
            } else
            if (s.equals("no2"))
            {
                l.p(cursor.getInt(i1));
            } else
            if (s.equals("latitude"))
            {
                l.l(cursor.getFloat(i1));
            } else
            if (s.equals("longitude"))
            {
                l.k(cursor.getFloat(i1));
            } else
            if (s.equals("hasRadar"))
            {
                l.q(cursor.getInt(i1));
            } else
            if (s.equals("hasSatellite"))
            {
                l.r(cursor.getInt(i1));
            } else
            if (s.equals("northeast"))
            {
                l.a(com.gau.go.launcherex.goweather.a.e.a(cursor.getString(i1)));
            } else
            if (s.equals("southwest"))
            {
                l.b(com.gau.go.launcherex.goweather.a.e.a(cursor.getString(i1)));
            } else
            if (s.equals("golife"))
            {
                k.clear();
                k.addAll(GoLifeBean.c(cursor.getString(i1)));
            } else
            if (s.equals("radar_map_url"))
            {
                l.f(cursor.getString(i1));
            }
            i1++;
        }
    }

    public void a(String s)
    {
        d = s;
    }

    public String b()
    {
        return e;
    }

    public void b(int i1)
    {
        o = i1;
    }

    public void b(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        HourlyBean hourlybean = k();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (s.equals("date_long"))
            {
                hourlybean.a(cursor.getString(i1));
            } else
            if (s.equals("hour"))
            {
                hourlybean.a(cursor.getInt(i1));
            } else
            if (s.equals("tempValue"))
            {
                hourlybean.a(cursor.getFloat(i1));
            } else
            if (s.equals("type"))
            {
                hourlybean.c(cursor.getInt(i1));
            } else
            if (s.equals("windType"))
            {
                hourlybean.d(cursor.getInt(i1));
            } else
            if (s.equals("windStrengthValue"))
            {
                hourlybean.b(cursor.getFloat(i1));
            } else
            if (s.equals("status"))
            {
                hourlybean.d(cursor.getString(i1));
            } else
            if (s.equals("windDirection"))
            {
                hourlybean.b(cursor.getString(i1));
            } else
            if (s.equals("pop"))
            {
                hourlybean.e(cursor.getInt(i1));
            }
            i1++;
        }
    }

    public void b(String s)
    {
        e = s;
    }

    public String c()
    {
        return a;
    }

    public void c(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        ForecastBean forecastbean = l();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (s.equals("lowTempValue"))
            {
                forecastbean.a(cursor.getFloat(i1));
            } else
            if (s.equals("highTempValue"))
            {
                forecastbean.b(cursor.getFloat(i1));
            } else
            if (s.equals("weekDate"))
            {
                forecastbean.f(cursor.getString(i1));
            } else
            if (s.equals("type"))
            {
                forecastbean.c(cursor.getInt(i1));
            } else
            if (s.equals("windType"))
            {
                forecastbean.d(cursor.getInt(i1));
            } else
            if (s.equals("status"))
            {
                forecastbean.d(cursor.getString(i1));
            } else
            if (s.equals("windDir"))
            {
                forecastbean.g(cursor.getString(i1));
            } else
            if (s.equals("windStrengthValue"))
            {
                forecastbean.c(cursor.getFloat(i1));
            } else
            if (s.equals("status_day"))
            {
                forecastbean.a(cursor.getString(i1));
            } else
            if (s.equals("status_night"))
            {
                forecastbean.b(cursor.getString(i1));
            } else
            if (s.equals("date_long"))
            {
                forecastbean.c(cursor.getString(i1));
            } else
            if (s.equals("pop"))
            {
                forecastbean.e(cursor.getInt(i1));
            }
            i1++;
        }
    }

    public void c(String s)
    {
        a = s;
    }

    public boolean c(int i1)
    {
        Iterator iterator = m.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((c)((java.util.Map.Entry)iterator.next()).getValue()).k() == i1)
            {
                flag = true;
            }
        } while (true);
        return flag;
    }

    public c d(int i1)
    {
        return (c)m.get(Integer.valueOf(i1));
    }

    public String d()
    {
        return c;
    }

    public void d(String s)
    {
        b = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return n;
    }

    public void e(int i1)
    {
        f = i1;
    }

    public void e(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        PollenIndexBean pollenindexbean = m();
        int i1 = 0;
        while (i1 < j1) 
        {
            String s = as[i1];
            if (s.equals("date_time"))
            {
                pollenindexbean.a(cursor.getLong(i1), l.n());
            } else
            if (s.equals("pollen_index"))
            {
                pollenindexbean.a(cursor.getFloat(i1));
            }
            i1++;
        }
    }

    public void e(String s)
    {
        c = s;
    }

    public void f()
    {
        l.e = 1;
        l.f = "--";
        l.g = -10000L;
        l.k = -10000F;
        l.l = -10000F;
        l.j = -10000F;
        l.m = "--";
        l.n = "--";
        l.o = -10000F;
        l.d = -10000;
        l.a = -10000F;
        l.b = -10000F;
        l.c = -10000F;
        l.r = -10000F;
        l.p = "--";
        l.q = "--";
        l.s = -10000;
        l.f("");
    }

    public void f(Cursor cursor)
    {
        int j1 = cursor.getColumnCount();
        String as[] = cursor.getColumnNames();
        int i1 = 0;
        do
        {
            if (i1 < j1)
            {
                q q1 = new q();
                Object obj = as[i1];
                long l1;
                if (((String) (obj)).equals("date_time"))
                {
                    l1 = cursor.getLong(i1);
                } else
                if (((String) (obj)).equals("name"))
                {
                    q1.a(cursor.getString(i1));
                    l1 = 0L;
                } else
                if (((String) (obj)).equals("type"))
                {
                    q1.a(cursor.getInt(i1));
                    l1 = 0L;
                } else
                {
                    if (((String) (obj)).equals("url"))
                    {
                        q1.b(cursor.getString(i1));
                    }
                    l1 = 0L;
                }
                obj = i.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    PollenIndexBean pollenindexbean = (PollenIndexBean)((Iterator) (obj)).next();
                    if (pollenindexbean.a() != l1)
                    {
                        continue;
                    }
                    pollenindexbean.a(q1);
                    break;
                } while (true);
                i1++;
                continue;
            }
            return;
        } while (true);
    }

    public void g()
    {
        g.clear();
    }

    public void h()
    {
        h.clear();
    }

    public void i()
    {
        i.clear();
    }

    public void j()
    {
        j.clear();
    }

    public HourlyBean k()
    {
        HourlyBean hourlybean = new HourlyBean();
        h.add(hourlybean);
        return hourlybean;
    }

    public ForecastBean l()
    {
        ForecastBean forecastbean = new ForecastBean();
        g.add(forecastbean);
        return forecastbean;
    }

    public PollenIndexBean m()
    {
        PollenIndexBean pollenindexbean = new PollenIndexBean();
        i.add(pollenindexbean);
        return pollenindexbean;
    }

    public Map n()
    {
        return m;
    }

    public int o()
    {
        return m.size();
    }

    public boolean p()
    {
        Iterator iterator = m.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((c)((java.util.Map.Entry)iterator.next()).getValue()).b())
            {
                flag = true;
            }
        } while (true);
        return flag;
    }

    public int q()
    {
        return f;
    }

    public boolean r()
    {
        return l.F != 0 || l.G != 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeInt(n);
        parcel.writeInt(f);
        parcel.writeList(g);
        parcel.writeList(h);
        parcel.writeList(i);
        parcel.writeList(j);
        parcel.writeList(k);
        parcel.writeParcelable(l, 0);
    }

}
