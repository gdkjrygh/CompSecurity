// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.language;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.model.l;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.jiubang.core.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.gau.go.launcherex.gowidget.language:
//            g, h, b, i, 
//            j

public class e
{

    private static e m;
    BroadcastReceiver a;
    NotificationManager b;
    Notification c;
    private b d;
    private String e;
    private String f;
    private String g;
    private Locale h;
    private String i;
    private boolean j;
    private h k;
    private Context l;
    private boolean n;
    private g o;

    private e(Context context)
    {
        d = null;
        e = null;
        f = null;
        g = null;
        a = null;
        b = null;
        c = null;
        l = context;
        o = new g(this, null);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SETTING_USER_LANGUAGE");
        l.registerReceiver(o, intentfilter);
        k = new h(this, context.getContentResolver());
        d = new b(l.getResources());
        n = false;
        j = false;
        a(l.getContentResolver().query(WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('user_lang_code', 'user_lang_pkg')", null, null));
        o();
    }

    static Context a(e e1)
    {
        return e1.l;
    }

    public static e a(Context context)
    {
        com/gau/go/launcherex/gowidget/language/e;
        JVM INSTR monitorenter ;
        Context context1;
        if (m != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        context1 = context.getApplicationContext();
        if (context1 != null)
        {
            context = context1;
        }
        m = new e(context);
        context = m;
        com/gau/go/launcherex/gowidget/language/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a(Cursor cursor)
    {
        i = "default";
        e = "com.gau.go.launcherex.gowidget.weatherwidget";
        f = Locale.getDefault().getLanguage();
        g = Locale.getDefault().getCountry();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (cursor.getCount() <= 0) goto _L4; else goto _L3
_L3:
        int i1;
        int j1;
        i1 = cursor.getColumnIndex("setting_key");
        j1 = cursor.getColumnIndex("setting_value");
        cursor.moveToFirst();
_L7:
        String s1 = cursor.getString(i1);
        if (!s1.equals("user_lang_pkg")) goto _L6; else goto _L5
_L5:
        e = cursor.getString(j1);
_L9:
        boolean flag = cursor.moveToNext();
        if (flag) goto _L7; else goto _L4
_L4:
        cursor.close();
_L2:
        return;
_L6:
        if (!s1.equals("user_lang_code")) goto _L9; else goto _L8
_L8:
        i = cursor.getString(j1);
        i.length();
        JVM INSTR tableswitch 2 5: default 243
    //                   2 180
    //                   3 243
    //                   4 243
    //                   5 207;
           goto _L10 _L11 _L10 _L10 _L12
_L10:
        if (true) goto _L9; else goto _L13
_L13:
_L11:
        f = i;
        n();
          goto _L9
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        cursor.close();
        return;
_L12:
        String as[] = i.split("_");
        f = as[0];
        g = as[1];
          goto _L9
        as;
        cursor.close();
        throw as;
    }

    static void a(e e1, Cursor cursor)
    {
        e1.a(cursor);
    }

    private void a(u u1)
    {
        TypedArray typedarray = l.obtainStyledAttributes(0x1030068, new int[] {
            0x1010098
        });
        int i1 = typedarray.getColor(0, 0);
        typedarray.recycle();
        if ((0xffffff & i1) < 0x7fffff)
        {
            u1.C = "notification_style_default_white";
        } else
        {
            u1.C = "notification_style_default_black";
        }
        com.gau.go.launcherex.gowidget.weather.c.e.a(l).a("notification_style", u1.C);
    }

    private void a(String s1)
    {
        r();
        b = (NotificationManager)l.getSystemService("notification");
        c = new Notification();
        Object obj = new Intent("action_touch_language_check_update_notification");
        obj = PendingIntent.getBroadcast(l, 1, ((Intent) (obj)), 0x8000000);
        c.contentIntent = ((PendingIntent) (obj));
        obj = new Intent("action_delete_language_check_update_notification");
        obj = PendingIntent.getBroadcast(l, 2, ((Intent) (obj)), 0x8000000);
        c.deleteIntent = ((PendingIntent) (obj));
        c.icon = 0x7f020310;
        c.tickerText = s1;
        obj = new RemoteViews(l.getPackageName(), 0x7f0300d9);
        ((RemoteViews) (obj)).setImageViewResource(0x7f090473, 0x7f020310);
        u u1 = com.gau.go.launcherex.gowidget.weather.c.c.a(l).f().a();
        if (u1.C.equals("notification_style_default"))
        {
            a(u1);
        }
        int i1 = 0x106000b;
        Resources resources = l.getResources();
        if (u1.C.equals("notification_style_default_black"))
        {
            i1 = resources.getColor(0x7f0a005e);
        } else
        if (u1.C.equals("notification_style_default_white"))
        {
            i1 = resources.getColor(0x7f0a0061);
        }
        ((RemoteViews) (obj)).setTextColor(0x7f090478, i1);
        ((RemoteViews) (obj)).setTextColor(0x7f090477, i1);
        ((RemoteViews) (obj)).setTextViewText(0x7f090478, d.getString(0x7f08012b));
        ((RemoteViews) (obj)).setTextViewText(0x7f090477, s1);
        c.contentView = ((RemoteViews) (obj));
        b.notify("notification_tag_language_check_update", 5, c);
        obj = new Time();
        ((Time) (obj)).setToNow();
        try
        {
            s1 = GoWidgetApplication.c(l.getApplicationContext()).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            s1 = null;
        }
        if (s1 != null)
        {
            s1.edit().putLong("key_language_check_update_time", ((Time) (obj)).toMillis(true)).commit();
        }
    }

    public static void a(ArrayList arraylist, Context context)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            l l1 = (l)arraylist.next();
            String s1 = l1.d();
            if (TextUtils.isEmpty(s1) || s1.equals("com.gau.go.launcherex.gowidget.weatherwidget"))
            {
                l1.a = true;
            } else
            {
                l1.a = w.a(context, s1);
            }
        }

    }

    static void b(e e1)
    {
        e1.m();
    }

    private void b(String s1, String s2)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", s2);
        s2 = new ArrayList();
        s2.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(contentvalues).withSelection("setting_key='user_lang_pkg'", null).build());
        contentvalues.put("setting_value", s1);
        s2.add(ContentProviderOperation.newUpdate(WeatherContentProvider.g).withValues(contentvalues).withSelection("setting_key='user_lang_code'", null).build());
        k.a(2, null, "com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider", s2);
    }

    public static void b(ArrayList arraylist, Context context)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            l l1 = (l)arraylist.next();
            if (l1.d().equals(""))
            {
                l1.b = false;
            } else
            if (l1.a)
            {
                l1.b = w.a(context, l1.d(), l1.c());
            } else
            {
                l1.b = false;
            }
        }

    }

    static void c(e e1)
    {
        e1.s();
    }

    public static void c(ArrayList arraylist, Context context)
    {
        a(arraylist, context);
        b(arraylist, context);
    }

    static void d(e e1)
    {
        e1.o();
    }

    static void e(e e1)
    {
        e1.p();
    }

    public static void f()
    {
        com/gau/go/launcherex/gowidget/language/e;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            m.q();
            m = null;
        }
        com/gau/go/launcherex/gowidget/language/e;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean l()
    {
        boolean flag1 = true;
        SharedPreferences sharedpreferences;
        boolean flag;
        try
        {
            sharedpreferences = GoWidgetApplication.c(l.getApplicationContext()).a();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            exception = null;
        }
        flag = flag1;
        if (sharedpreferences != null)
        {
            Time time = new Time();
            time.setToNow();
            flag = flag1;
            if (time.toMillis(true) - sharedpreferences.getLong("key_language_check_update_time", 0L) > 0x240c8400L)
            {
                flag = false;
            }
        }
        return flag;
    }

    private void m()
    {
        if (b != null)
        {
            b.cancel("notification_tag_language_check_update", 5);
        }
    }

    private void n()
    {
        if (f.equals("zh") && g.equals("CN"))
        {
            g = "PRC";
        } else
        if (f.equals("pt") && g.equals("BR"))
        {
            g = "DEF_BR";
            return;
        }
    }

    private void o()
    {
        d.a(null, null);
        j = false;
        if (TextUtils.isEmpty(i) || i.equals("default"))
        {
            HashMap hashmap = h();
            Object obj1 = (String)hashmap.get(d());
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = (String)hashmap.get(b());
            }
            if (obj != null)
            {
                e = ((String) (obj));
            } else
            {
                e = "com.gau.go.launcherex.gowidget.weatherwidget";
            }
        }
        if (TextUtils.isEmpty(e) || e.equals("com.gau.go.launcherex.gowidget.weatherwidget")) goto _L2; else goto _L1
_L1:
        if (!w.a(l, e)) goto _L4; else goto _L3
_L3:
        obj = l.createPackageContext(e, 3).getResources();
        if (obj != null);
        try
        {
            d.a(e, ((Resources) (obj)));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
        }
_L2:
        h = new Locale(f, g);
        obj = d.getConfiguration();
        obj1 = d.getDisplayMetrics();
        obj.locale = h;
        obj.orientation = 1;
        d.updateConfiguration(((Configuration) (obj)), ((android.util.DisplayMetrics) (obj1)));
        return;
_L4:
        n = true;
        if (!i.equals("default"))
        {
            a("default", "com.gau.go.launcherex.gowidget.weatherwidget");
        }
        j = true;
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void p()
    {
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_USER_LANGUAGE_CHANGED");
        l.sendBroadcast(intent);
    }

    private void q()
    {
        if (d != null)
        {
            d.a();
            d = null;
        }
        if (o != null && l != null)
        {
            l.unregisterReceiver(o);
        }
    }

    private void r()
    {
        if (a == null)
        {
            IntentFilter intentfilter = new IntentFilter("action_touch_language_check_update_notification");
            a = new i(this);
            l.registerReceiver(a, intentfilter);
        }
    }

    private void s()
    {
        if (a != null)
        {
            l.unregisterReceiver(a);
            a = null;
        }
    }

    public b a()
    {
        return d;
    }

    public void a(TextView textview, AttributeSet attributeset)
    {
        if (d != null)
        {
            int i1 = attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "text", 0);
            if (i1 > 0)
            {
                textview.setText(i1);
            }
            i1 = attributeset.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "hint", 0);
            if (i1 > 0)
            {
                textview.setHint(i1);
            }
        }
    }

    public void a(j j1)
    {
        k.a(0, j1, WeatherContentProvider.g, new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('user_lang_code', 'user_lang_pkg')", null, null);
    }

    public void a(String s1, String s2)
    {
        e = s2;
        i = s1;
        i();
        if ("com.gau.go.launcherex.gowidget.weatherwidget".equals(GoWidgetApplication.a(l)))
        {
            b(s1, s2);
            k();
        }
    }

    public String b()
    {
        return f;
    }

    public String c()
    {
        return i;
    }

    public String d()
    {
        return (new StringBuilder()).append(f).append("_").append(g).toString();
    }

    public String e()
    {
        return g;
    }

    public ArrayList g()
    {
        String as[] = l.getResources().getStringArray(0x7f0d002d);
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < as.length; i1++)
        {
            arraylist.add(new l(as[i1]));
        }

        c(arraylist, l);
        return arraylist;
    }

    public HashMap h()
    {
        String as[] = l.getResources().getStringArray(0x7f0d002d);
        HashMap hashmap = new HashMap();
        for (int i1 = 0; i1 < as.length; i1++)
        {
            l l1 = new l(as[i1]);
            if (!l1.b().equals(""))
            {
                hashmap.put(l1.b(), l1.d());
            }
        }

        return hashmap;
    }

    public void i()
    {
        this;
        JVM INSTR monitorenter ;
        f = Locale.getDefault().getLanguage();
        g = Locale.getDefault().getCountry();
        i.length();
        JVM INSTR tableswitch 2 5: default 114
    //                   2 67
    //                   3 60
    //                   4 60
    //                   5 87;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_87;
_L4:
        o();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = i;
        n();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        String as[] = i.split("_");
        f = as[0];
        g = as[1];
          goto _L4
    }

    public void j()
    {
        if (!l() && n)
        {
            a(d.getString(0x7f08012a));
        }
    }

    public void k()
    {
        a a1 = GoWidgetApplication.c(l.getApplicationContext());
        Object obj = null;
        if (a1 != null)
        {
            obj = a1.a();
        }
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putLong("key_synchro_featured_theme_data_time", 0L);
            ((android.content.SharedPreferences.Editor) (obj)).putLong("last_check_new_theme_time", 0L);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
    }
}
