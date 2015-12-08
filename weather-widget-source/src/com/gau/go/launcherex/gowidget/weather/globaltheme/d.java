// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.SparseArray;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gau.go.launcherex.gowidget.weather.util.n;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.x;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme:
//            e

public class d
{

    private com.gau.go.launcherex.gowidget.weather.globaltheme.c.a a;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.c.b b;
    private Context c;
    private e d;
    private com.gau.go.launcherex.gowidget.weather.globaltheme.e e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;

    public d(Context context)
    {
        e = null;
        g = false;
        h = false;
        i = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context can't be null");
        } else
        {
            c = context;
            e = new com.gau.go.launcherex.gowidget.weather.globaltheme.e(context.getContentResolver(), this);
            d = com.gau.go.launcherex.gowidget.language.e.a(c);
            f = 0;
            return;
        }
    }

    public static String a(Context context, int l)
    {
        Object obj = context.getContentResolver();
        l;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 119
    //                   1 46
    //                   2 125
    //                   3 113;
           goto _L1 _L2 _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_125;
_L1:
        throw new IllegalArgumentException("bad type");
_L3:
        context = "app_theme";
_L6:
        obj = ((ContentResolver) (obj)).query(WeatherContentProvider.g, new String[] {
            "setting_value"
        }, "setting_key=?", new String[] {
            context
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                context = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("setting_value"));
            } else
            {
                context = "";
            }
            ((Cursor) (obj)).close();
            return context;
        } else
        {
            return "";
        }
_L5:
        context = "key_live_wallpaper_theme";
          goto _L6
_L2:
        context = "app_widget_theme";
          goto _L6
        context = "go_widget_theme";
          goto _L6
    }

    static void a(d d1, int l, b b1)
    {
        d1.i(l, b1);
    }

    private void a(ArrayList arraylist)
    {
        Object obj = GoWidgetApplication.c(c.getApplicationContext()).a().getString("key_receive_apk_award_packagenames", "");
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = new JSONArray(((String) (obj)))) == null) goto _L1; else goto _L3
_L3:
        if (((JSONArray) (obj)).length() < 1) goto _L1; else goto _L4
_L4:
        int i1;
        i1 = ((JSONArray) (obj)).length();
        arraylist = arraylist.iterator();
_L7:
        if (!arraylist.hasNext()) goto _L1; else goto _L5
_L5:
        b b1;
        b1 = (b)arraylist.next();
        b1.a(false);
        int l = 0;
_L8:
        if (l >= i1) goto _L7; else goto _L6
_L6:
        if (!b1.x().equals(((JSONArray) (obj)).getString(l)))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        b1.a(true);
          goto _L7
        arraylist;
        if (com.gtp.a.a.b.c.a())
        {
            arraylist.printStackTrace();
            return;
        }
          goto _L1
        l++;
          goto _L8
    }

    public static String b(Context context, int l)
    {
        Object obj = context.getContentResolver().query(WeatherContentProvider.u, new String[] {
            "theme_package_name"
        }, "widget_id=?", new String[] {
            String.valueOf(l)
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                context = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("theme_package_name"));
            } else
            {
                context = "";
            }
            ((Cursor) (obj)).close();
        } else
        {
            context = "";
        }
        obj = context;
        if (TextUtils.isEmpty(context))
        {
            obj = "app_widget_theme_default_transparent";
        }
        return ((String) (obj));
    }

    static void b(d d1, int l, b b1)
    {
        d1.h(l, b1);
    }

    public static String c(Context context, int l)
    {
        Object obj = context.getContentResolver().query(WeatherContentProvider.l, new String[] {
            "widget_theme"
        }, "go_widget_id=?", new String[] {
            String.valueOf(l)
        }, null);
        if (obj != null)
        {
            if (((Cursor) (obj)).moveToFirst())
            {
                context = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("widget_theme"));
            } else
            {
                context = "";
            }
            ((Cursor) (obj)).close();
        } else
        {
            context = "";
        }
        obj = context;
        if (TextUtils.isEmpty(context))
        {
            obj = "app_widget_theme_default_transparent";
        }
        return ((String) (obj));
    }

    static void c(d d1, int l, b b1)
    {
        d1.j(l, b1);
    }

    private void d(int l, b b1)
    {
        SparseArray sparsearray = new SparseArray(1);
        sparsearray.put(l, b1);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", b1.x());
        e.a(1, sparsearray, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
            "app_widget_theme"
        });
    }

    static void d(d d1, int l, b b1)
    {
        d1.k(l, b1);
    }

    private void e(int l, b b1)
    {
        SparseArray sparsearray = new SparseArray(1);
        sparsearray.put(l, b1);
        Object obj = b1.x();
        b1 = ((b) (obj));
        if ("app_theme".equals(obj))
        {
            b1 = "com.gau.go.launcherex.gowidget.weatherwidget";
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("setting_value", b1);
        e.a(1, sparsearray, WeatherContentProvider.g, ((ContentValues) (obj)), "setting_key=?", new String[] {
            "key_live_wallpaper_theme"
        });
    }

    private ArrayList f()
    {
        ArrayList arraylist = new ArrayList();
        com.gau.go.launcherex.gowidget.language.b b1 = null;
        if (d != null)
        {
            b1 = d.a();
        }
        Object obj = b1;
        if (b1 == null)
        {
            obj = c.getResources();
        }
        arraylist.add(com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(((Resources) (obj))));
        if (com.gtp.go.weather.sharephoto.d.h.b(x.a))
        {
            arraylist.add(com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c));
        }
        arraylist.addAll(com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c, ((Resources) (obj))));
        for (Iterator iterator = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.b(c, ((Resources) (obj))).iterator(); iterator.hasNext();)
        {
            b b2 = (b)iterator.next();
            b b4 = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(b2.x(), arraylist);
            if (b4 != null)
            {
                b4.p(true);
            } else
            {
                arraylist.add(b2);
            }
        }

        b b3;
        int l;
        for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); b3.d(l))
        {
            b3 = (b)iterator1.next();
            l = f + 1;
            f = l;
        }

        a(arraylist);
        return arraylist;
    }

    private void f(int l, b b1)
    {
        SparseArray sparsearray = new SparseArray(1);
        sparsearray.put(l, b1);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", b1.x());
        e.a(1, sparsearray, WeatherContentProvider.g, contentvalues, "setting_key=?", new String[] {
            "app_theme"
        });
    }

    private void g(int l, b b1)
    {
        SparseArray sparsearray = new SparseArray(1);
        sparsearray.put(l, b1);
        ArrayList arraylist = new ArrayList();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", b1.x());
        arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(contentvalues).withSelection("setting_key=?", new String[] {
            "go_widget_theme"
        }).build());
        contentvalues = new ContentValues();
        contentvalues.put("widget_theme", b1.x());
        arraylist.add(ContentProviderOperation.newUpdate(WeatherContentProvider.i).withValues(contentvalues).build());
        e.a(1, sparsearray, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", arraylist);
    }

    private void h(int l, b b1)
    {
        if (a != null)
        {
            a.a(l, b1);
        }
    }

    private void i(int l, b b1)
    {
        switch (l)
        {
        case 2: // '\002'
        default:
            return;

        case 3: // '\003'
            Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_LIVE_WALLPAPER_THEME_CHANGE");
            intent.putExtra("extra_wallpaper_theme_package", b1.x());
            c.sendBroadcast(intent);
            return;

        case 1: // '\001'
            Intent intent1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APP_THEME_CHANGE");
            intent1.putExtra("extra_app_theme_package", b1.x());
            c.sendBroadcast(intent1);
            return;

        case 0: // '\0'
            Intent intent2 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_APPWIDGET_THEME_CHANGE");
            intent2.putExtra("extra_app_widget_theme_package", b1.x());
            c.sendBroadcast(intent2);
            return;
        }
    }

    private void j(int l, b b1)
    {
        if (b != null)
        {
            b.a(l, b1);
        }
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_APPWIDGET_THEME_CHANGE");
        intent.putExtra("extra_widget_id", l);
        intent.putExtra("extra_widget_theme_package", b1.x());
        c.sendBroadcast(intent);
    }

    private void k(int l, b b1)
    {
        if (b != null)
        {
            b.b(l, b1);
        }
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_ONE_GOWIDGET_THEME_CHANGE");
        intent.putExtra("extra_widget_id", l);
        intent.putExtra("extra_widget_theme_package", b1.x());
        c.sendBroadcast(intent);
    }

    public b a(String s)
    {
        com.gau.go.launcherex.gowidget.language.b b1 = null;
        if (d != null)
        {
            b1 = d.a();
        }
        Object obj = b1;
        if (b1 == null)
        {
            obj = c.getResources();
        }
        s = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c, s, ((Resources) (obj)));
        if (s != null)
        {
            int l = f + 1;
            f = l;
            s.d(l);
        }
        return s;
    }

    public void a()
    {
        a = null;
    }

    public void a(int l, b b1)
    {
        switch (l)
        {
        default:
            return;

        case 1: // '\001'
            f(l, b1);
            return;

        case 0: // '\0'
            d(l, b1);
            return;

        case 2: // '\002'
            g(l, b1);
            return;

        case 3: // '\003'
            e(l, b1);
            break;
        }
    }

    public void a(com.gau.go.launcherex.gowidget.weather.globaltheme.c.b b1)
    {
        b = b1;
    }

    public ArrayList b()
    {
        ArrayList arraylist = f();
        String s = a(c, 1);
        if (TextUtils.isEmpty(s))
        {
            s = "com.gau.go.launcherex.gowidget.weatherwidget";
        }
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            b1.a(3);
            if (b1.x().equals(s))
            {
                b1.m(true);
            } else
            {
                b1.m(false);
            }
        }

        return arraylist;
    }

    public void b(int l, b b1)
    {
        if (b1 == null || l == 0)
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("theme_package_name", b1.x());
            com.gau.go.launcherex.gowidget.weather.globaltheme.e e1 = e;
            android.net.Uri uri = WeatherContentProvider.u;
            e1.a(2, ((Object) (new Object[] {
                Integer.valueOf(l), b1
            })), uri, contentvalues, "widget_id=?", new String[] {
                String.valueOf(l)
            });
            return;
        }
    }

    public ArrayList c()
    {
        ArrayList arraylist = f();
        String s = a(c, 3);
        if (TextUtils.isEmpty(s))
        {
            s = "com.gau.go.launcherex.gowidget.weatherwidget";
        }
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            b b1 = (b)iterator.next();
            b1.a(4);
            if (b1.x().equals(s))
            {
                b1.m(true);
            } else
            {
                b1.m(false);
            }
        }

        return arraylist;
    }

    public void c(int l, b b1)
    {
        if (b1 == null || l == 0)
        {
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("widget_theme", b1.x());
            com.gau.go.launcherex.gowidget.weather.globaltheme.e e1 = e;
            android.net.Uri uri = WeatherContentProvider.l;
            e1.a(3, ((Object) (new Object[] {
                Integer.valueOf(l), b1
            })), uri, contentvalues, "go_widget_id=?", new String[] {
                String.valueOf(l)
            });
            return;
        }
    }

    public ArrayList d()
    {
        ArrayList arraylist = new ArrayList();
        com.gau.go.launcherex.gowidget.language.b b1 = null;
        if (d != null)
        {
            b1 = d.a();
        }
        Object obj = b1;
        if (b1 == null)
        {
            obj = c.getResources();
        }
        for (Iterator iterator = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.c(c, ((Resources) (obj))).iterator(); iterator.hasNext(); arraylist.add(obj))
        {
            obj = (b)iterator.next();
            int l = f + 1;
            f = l;
            ((b) (obj)).d(l);
            ((b) (obj)).a(n.a(c, ((b) (obj)).x()));
        }

        a(arraylist);
        for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); ((b)iterator1.next()).a(2)) { }
        return arraylist;
    }

    public ArrayList e()
    {
        ArrayList arraylist = new ArrayList();
        com.gau.go.launcherex.gowidget.language.b b1 = null;
        if (d != null)
        {
            b1 = d.a();
        }
        Object obj = b1;
        if (b1 == null)
        {
            obj = c.getResources();
        }
        String as[] = c.getResources().getStringArray(0x7f0d0019);
        for (int l = 0; l < as.length; l++)
        {
            Object obj1 = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(c, as[l]);
            obj1 = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(((Resources) (obj)), as[l], ((String) (obj1)));
            int j1 = f + 1;
            f = j1;
            ((b) (obj1)).d(j1);
            arraylist.add(obj1);
        }

        for (Iterator iterator = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.d(c, ((Resources) (obj))).iterator(); iterator.hasNext(); arraylist.add(obj))
        {
            obj = (b)iterator.next();
            int i1 = f + 1;
            f = i1;
            ((b) (obj)).d(i1);
        }

        a(arraylist);
        for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); ((b)iterator1.next()).a(1)) { }
        return arraylist;
    }
}
