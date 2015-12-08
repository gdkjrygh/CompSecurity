// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.weather.e.b;
import com.gau.go.launcherex.gowidget.weather.e.f;
import com.gau.go.launcherex.gowidget.weather.e.g;
import com.gau.go.launcherex.gowidget.weather.e.j;
import com.gau.go.launcherex.gowidget.weather.e.o;
import com.gau.go.launcherex.gowidget.weather.e.p;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.model.WidgetSettingBean;
import com.gau.go.launcherex.gowidget.weather.model.c;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.service:
//            f, WeatherService, m, b

public class l extends com.gau.go.launcherex.gowidget.weather.service.f
{

    final WeatherService a;

    public l(WeatherService weatherservice)
    {
        a = weatherservice;
        super();
    }

    private void a(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.a, com.gau.go.launcherex.gowidget.weather.e.b.a(), null, null, "sequence");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        if (contentresolver.moveToFirst())
        {
            do
            {
                WeatherBean weatherbean = new WeatherBean();
                weatherbean.a(contentresolver);
                map.put(weatherbean.c(), weatherbean);
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    private void b(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.e, j.a(), null, null, "cityId");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (contentresolver.moveToFirst())
        {
            int i = contentresolver.getColumnIndex("cityId");
            do
            {
                WeatherBean weatherbean = (WeatherBean)map.get(contentresolver.getString(i));
                if (weatherbean != null)
                {
                    weatherbean.b(contentresolver);
                }
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    private void c(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.b, g.a(), null, null, "cityId");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (contentresolver.moveToFirst())
        {
            int i = contentresolver.getColumnIndex("cityId");
            do
            {
                WeatherBean weatherbean = (WeatherBean)map.get(contentresolver.getString(i));
                if (weatherbean != null)
                {
                    weatherbean.c(contentresolver);
                }
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    private void d(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.H, o.a(), null, null, "cityId");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (contentresolver.moveToFirst())
        {
            int i = contentresolver.getColumnIndex("cityId");
            do
            {
                WeatherBean weatherbean = (WeatherBean)map.get(contentresolver.getString(i));
                if (weatherbean != null)
                {
                    weatherbean.e(contentresolver);
                }
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    private void e(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.I, p.a(), null, null, "cityId");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (contentresolver.moveToFirst())
        {
            int i = contentresolver.getColumnIndex("cityId");
            do
            {
                WeatherBean weatherbean = (WeatherBean)map.get(contentresolver.getString(i));
                if (weatherbean != null)
                {
                    weatherbean.f(contentresolver);
                }
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    private void f(ContentResolver contentresolver, Map map)
    {
        contentresolver = contentresolver.query(WeatherContentProvider.k, com.gau.go.launcherex.gowidget.weather.e.f.a(), null, null, "cityId");
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (contentresolver.moveToFirst())
        {
            do
            {
                c c1 = WeatherBean.d(contentresolver);
                WeatherBean weatherbean = (WeatherBean)map.get(c1.j());
                if (weatherbean != null)
                {
                    c1.a(r.c(c1.d()));
                    weatherbean.m.put(Integer.valueOf(c1.k()), c1);
                }
            } while (contentresolver.moveToNext());
        }
        contentresolver.close();
        return;
        contentresolver;
        contentresolver.printStackTrace();
        return;
    }

    public String a(int i)
    {
        String s = null;
        Object obj = null;
        Cursor cursor = a.getContentResolver().query(WeatherContentProvider.l, new String[] {
            "city_id"
        }, "go_widget_id=?", new String[] {
            String.valueOf(i)
        }, null);
        if (cursor != null)
        {
            s = obj;
            if (cursor.moveToFirst())
            {
                s = cursor.getString(0);
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return s;
            }
        }
        return s;
    }

    public String a(String s)
    {
        Object obj1 = null;
        Object obj = null;
        String s1 = obj1;
        if (!TextUtils.isEmpty(s))
        {
            Cursor cursor = a.getContentResolver().query(WeatherContentProvider.g, new String[] {
                "setting_value"
            }, "setting_key=?", new String[] {
                s
            }, null);
            s1 = obj1;
            if (cursor != null)
            {
                s = obj;
                if (cursor.moveToFirst())
                {
                    s = cursor.getString(0);
                }
                try
                {
                    cursor.close();
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                    return s;
                }
                s1 = s;
            }
        }
        return s1;
    }

    public List a()
    {
        Object obj = new HashMap();
        ContentResolver contentresolver = a.getContentResolver();
        a(contentresolver, ((Map) (obj)));
        if (!((Map) (obj)).isEmpty())
        {
            b(contentresolver, ((Map) (obj)));
            c(contentresolver, ((Map) (obj)));
            d(contentresolver, ((Map) (obj)));
            e(contentresolver, ((Map) (obj)));
            f(contentresolver, ((Map) (obj)));
        }
        obj = new ArrayList(((Map) (obj)).values());
        Collections.sort(((List) (obj)), new m(this));
        return ((List) (obj));
    }

    public void a(int i, int k)
    {
        ContentResolver contentresolver = a.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("go_widget_type", Integer.valueOf(k));
        contentvalues.put("go_widget_id", Integer.valueOf(i));
        contentvalues.put("city_id", "");
        contentresolver.insert(WeatherContentProvider.l, contentvalues);
        Object obj = contentresolver.query(WeatherContentProvider.l, new String[] {
            "go_widget_id"
        }, "go_widget_type=?", new String[] {
            String.valueOf(k)
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                i = ((Cursor) (obj)).getCount();
            } else
            {
                i = 0;
            }
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        } else
        {
            i = 0;
        }
        contentvalues.clear();
        k;
        JVM INSTR tableswitch 0 5: default 164
    //                   0 226
    //                   1 219
    //                   2 205
    //                   3 212
    //                   4 240
    //                   5 233;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        obj = null;
_L9:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            contentvalues.put(((String) (obj)), Integer.valueOf(i));
            contentresolver.update(WeatherContentProvider.o, contentvalues, null, null);
        }
        return;
_L4:
        obj = "count_gowidget_11";
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "count_gowidget_21";
        continue; /* Loop/switch isn't completed */
_L3:
        obj = "count_gowidget_41";
        continue; /* Loop/switch isn't completed */
_L2:
        obj = "count_gowidget_42";
        continue; /* Loop/switch isn't completed */
_L7:
        obj = "count_gowidget_41_style2";
        continue; /* Loop/switch isn't completed */
_L6:
        obj = "count_gowidget_days_41";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(int i, int k, String s)
    {
        ContentResolver contentresolver = a.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("go_widget_type", Integer.valueOf(i));
        contentvalues.put("go_widget_id", String.valueOf(k));
        contentvalues.put("city_id", s);
        if (contentresolver.update(WeatherContentProvider.l, contentvalues, "go_widget_id=?", new String[] {
    String.valueOf(k)
}) < 1)
        {
            contentresolver.insert(WeatherContentProvider.l, contentvalues);
        }
    }

    public void a(com.gau.go.launcherex.gowidget.weather.service.b b1)
    {
        WeatherService.a(a).put(b1.hashCode(), b1);
    }

    public WidgetSettingBean b()
    {
        WidgetSettingBean widgetsettingbean = new WidgetSettingBean();
        Object obj = a.getContentResolver();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("setting_key").append(" in ('").append("tempUnit").append("', '").append("windUnit").append("', '").append("dateStyle").append("', '").append("widgt_clock").append("', '").append("widgt_calendar").append("', '").append("isCycle").append("', '").append("dynamic_icon_gowidget").append("', '").append("world_clock").append("', '").append("auto_location").append("', '").append("festival").append("', '").append("calendarType").append("', '").append("widget_theme_switcher").append("', '").append("')");
        obj = ((ContentResolver) (obj)).query(WeatherContentProvider.g, com.gau.go.launcherex.gowidget.weather.e.c.a(), stringbuilder.toString(), null, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                widgetsettingbean.a(((Cursor) (obj)));
            }
            try
            {
                ((Cursor) (obj)).close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return widgetsettingbean;
            }
        }
        return widgetsettingbean;
    }

    public void b(int i)
    {
        a.getContentResolver().delete(WeatherContentProvider.l, "go_widget_id=?", new String[] {
            String.valueOf(i)
        });
    }

    public void b(com.gau.go.launcherex.gowidget.weather.service.b b1)
    {
        if (WeatherService.a(a).indexOfKey(b1.hashCode()) != -1)
        {
            WeatherService.a(a).remove(b1.hashCode());
        }
        if (WeatherService.a(a).size() == 0)
        {
            a.stopSelf();
        }
    }

    public WeatherBean c()
    {
        WeatherBean weatherbean = null;
        Object obj = null;
        Cursor cursor = a.getContentResolver().query(WeatherContentProvider.a, com.gau.go.launcherex.gowidget.weather.e.b.a(), "city_my_location!=?", new String[] {
            String.valueOf(1)
        }, null);
        if (cursor != null)
        {
            weatherbean = obj;
            if (cursor.moveToFirst())
            {
                weatherbean = new WeatherBean();
                weatherbean.a(cursor);
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return weatherbean;
            }
        }
        return weatherbean;
    }

    public boolean d()
    {
        boolean flag = false;
        boolean flag1 = false;
        Cursor cursor = a.getContentResolver().query(WeatherContentProvider.j, null, null, null, null);
        if (cursor != null)
        {
            flag = flag1;
            if (cursor.moveToFirst())
            {
                if (cursor.getInt(0) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return flag;
            }
        }
        return flag;
    }

    public boolean e()
    {
        boolean flag = false;
        boolean flag1 = false;
        Cursor cursor = a.getContentResolver().query(WeatherContentProvider.o, new String[] {
            "flag_new_theme"
        }, null, null, null);
        if (cursor != null)
        {
            flag = flag1;
            if (cursor.moveToFirst())
            {
                if (cursor.getInt(0) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            try
            {
                cursor.close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return flag;
            }
        }
        return flag;
    }
}
