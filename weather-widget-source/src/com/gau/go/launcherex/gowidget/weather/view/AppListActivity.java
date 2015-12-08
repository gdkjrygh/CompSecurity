// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.globalview.b;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.setting.cc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            k, o, j, l

public class AppListActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private ListView a;
    private l b;
    private List c;
    private View d;
    private o e;
    private int f;
    private TextView g;
    private View h;
    private String i;

    public AppListActivity()
    {
        i = "";
    }

    static l a(AppListActivity applistactivity, l l)
    {
        applistactivity.b = l;
        return l;
    }

    private void a()
    {
        Object obj = new Intent("android.intent.action.MAIN", null);
        ((Intent) (obj)).addCategory("android.intent.category.LAUNCHER");
        try
        {
            obj = getPackageManager().queryIntentActivities(((Intent) (obj)), 32);
        }
        catch (RuntimeException runtimeexception)
        {
            runtimeexception.printStackTrace();
            runtimeexception = null;
        }
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
                if (!getPackageName().equals(resolveinfo.activityInfo.packageName) && resolveinfo.activityInfo.exported)
                {
                    c.add(resolveinfo);
                }
            } while (true);
        }
    }

    private void a(int l)
    {
        String s = "";
        if (f != 1) goto _L2; else goto _L1
_L1:
        s = getString(0x7f080455);
_L4:
        b b1 = new b(this);
        b1.b(s);
        b1.a(((ResolveInfo)c.get(l)).activityInfo.loadLabel(getPackageManager()).toString());
        b1.d(0x7f0803b6);
        b1.a(new k(this, l));
        b1.a();
        return;
_L2:
        if (f == 2)
        {
            s = getString(0x7f080454);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int l, Object obj, int i1)
    {
        Object obj1 = (ResolveInfo)obj;
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        obj = (new StringBuilder()).append(((ResolveInfo) (obj1)).activityInfo.packageName).append("#").append(((ResolveInfo) (obj1)).activityInfo.name).toString();
        obj1 = ((ResolveInfo) (obj1)).activityInfo.loadLabel(getPackageManager()).toString();
        f;
        JVM INSTR tableswitch 1 2: default 92
    //                   1 117
    //                   2 168;
           goto _L3 _L4 _L5
_L3:
        setResult(-1, new Intent());
        finish();
        overridePendingTransition(0x7f04001e, 0x7f040009);
        return;
_L4:
        Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.action_calendar_binding_app");
        intent.putExtra("extra_calendar_binding_app", ((String) (obj)));
        intent.putExtra("app_name", ((String) (obj1)));
        intent.putExtra("app_package_name", ((String) (obj)));
        getApplicationContext().sendBroadcast(intent);
        continue; /* Loop/switch isn't completed */
_L5:
        Intent intent1 = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.action_clock_binding_app");
        intent1.putExtra("extra_clock_binding_app", ((String) (obj)));
        intent1.putExtra("app_name", ((String) (obj1)));
        intent1.putExtra("app_package_name", ((String) (obj)));
        getApplicationContext().sendBroadcast(intent1);
        if (true) goto _L3; else goto _L2
_L2:
        Toast.makeText(this, getString(0x7f080456), 0).show();
        return;
    }

    private void a(ResolveInfo resolveinfo)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", (new StringBuilder()).append(resolveinfo.activityInfo.packageName).append("#").append(resolveinfo.activityInfo.name).toString());
        e.a(2, resolveinfo, WeatherContentProvider.g, contentvalues, "setting_key='widgt_clock'", null);
    }

    static void a(AppListActivity applistactivity)
    {
        applistactivity.a();
    }

    static void a(AppListActivity applistactivity, int l)
    {
        applistactivity.a(l);
    }

    static void a(AppListActivity applistactivity, int l, Object obj, int i1)
    {
        applistactivity.a(l, obj, i1);
    }

    static void a(AppListActivity applistactivity, ResolveInfo resolveinfo)
    {
        applistactivity.b(resolveinfo);
    }

    static List b(AppListActivity applistactivity)
    {
        return applistactivity.c;
    }

    private void b(ResolveInfo resolveinfo)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("setting_value", (new StringBuilder()).append(resolveinfo.activityInfo.packageName).append("#").append(resolveinfo.activityInfo.name).toString());
        e.a(1, resolveinfo, WeatherContentProvider.g, contentvalues, "setting_key='widgt_calendar'", null);
    }

    static void b(AppListActivity applistactivity, ResolveInfo resolveinfo)
    {
        applistactivity.a(resolveinfo);
    }

    static l c(AppListActivity applistactivity)
    {
        return applistactivity.b;
    }

    static View d(AppListActivity applistactivity)
    {
        return applistactivity.d;
    }

    static ListView e(AppListActivity applistactivity)
    {
        return applistactivity.a;
    }

    static int f(AppListActivity applistactivity)
    {
        return applistactivity.f;
    }

    static String g(AppListActivity applistactivity)
    {
        return applistactivity.i;
    }

    protected void c()
    {
    }

    protected void d()
    {
    }

    public void onClick(View view)
    {
        if (view.equals(h))
        {
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001c);
        getWindow().clearFlags(0x8000000);
        f = getIntent().getIntExtra("calendar_clock_binding_app", 0);
        i = getIntent().getStringExtra("app_widget");
        if (i == null)
        {
            i = "";
        }
        if (f == 0)
        {
            finish();
        }
        g = (TextView)findViewById(0x7f09011a);
        if (f != 1) goto _L2; else goto _L1
_L1:
        g.setText(getString(0x7f08043d));
_L4:
        h = findViewById(0x7f090060);
        h.setOnClickListener(this);
        e = new o(getContentResolver(), this);
        d = findViewById(0x7f09011c);
        d.setVisibility(0);
        a = (ListView)findViewById(0x7f09011b);
        c = new ArrayList();
        (new Handler()).postDelayed(new j(this), 100L);
        return;
_L2:
        if (f == 2)
        {
            g.setText(getString(0x7f08043c));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (c != null && !c.isEmpty())
        {
            c.clear();
            c = null;
        }
    }

    public boolean onKeyDown(int l, KeyEvent keyevent)
    {
        if (l == 4 && keyevent.getRepeatCount() == 0)
        {
            setResult(-1, new Intent(this, com/go/weatherex/setting/cc));
            finish();
        }
        return false;
    }
}
