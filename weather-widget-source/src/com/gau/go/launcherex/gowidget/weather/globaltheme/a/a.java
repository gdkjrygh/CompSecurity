// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.globaltheme.a:
//            c

public class a
{

    private Context a;
    private boolean b;
    private SharedPreferences c;

    public a(Context context)
    {
        b = false;
        a = context;
        c = GoWidgetApplication.c(context).a();
    }

    static SharedPreferences a(a a1)
    {
        return a1.c;
    }

    private String a(Context context)
    {
        context = new StringBuffer();
        context.append("http://goadv.3g.cn/GoAdCenter/common").append("?");
        context.append("funid").append("=").append("1");
        context.append("&").append("rd").append("=").append(String.valueOf(System.currentTimeMillis()));
        return context.toString();
    }

    static JSONObject a(a a1, Context context)
    {
        return a1.b(context);
    }

    static boolean a(a a1, boolean flag)
    {
        a1.b = flag;
        return flag;
    }

    static Context b(a a1)
    {
        return a1.a;
    }

    static String b(a a1, Context context)
    {
        return a1.a(context);
    }

    private JSONObject b(Context context)
    {
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a a1 = new com.gau.go.launcherex.gowidget.weather.globaltheme.a.a.a();
        a1.a = 3;
        a1.c = 1;
        a1.b = w.v(context);
        a1.d = w.c(context);
        a1.e = w.d(context);
        JSONObject jsonobject;
        try
        {
            a1.f = Integer.valueOf(w.f(a)).intValue();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        a1.g = w.n(context);
        a1.h = w.k(context);
        a1.i = android.os.Build.VERSION.SDK_INT;
        a1.j = w.r(context);
        context = new JSONObject();
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("pversion", a1.a);
            jsonobject.put("aid", a1.b);
            jsonobject.put("cid", a1.c);
            jsonobject.put("cversion", a1.d);
            jsonobject.put("uid", a1.e);
            jsonobject.put("channel", a1.f);
            jsonobject.put("local", a1.g);
            jsonobject.put("lang", a1.h);
            jsonobject.put("sdk", a1.i);
            jsonobject.put("imsi", a1.j);
            context.put("phead", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public void a()
    {
        f f1 = GoWidgetApplication.b(a);
        boolean flag;
        if (f1.a(2) || f1.a(1) || f1.a(32) || f1.a(128))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !b)
        {
            b = true;
            (new c(this, null)).execute(new Object[0]);
        }
    }
}
