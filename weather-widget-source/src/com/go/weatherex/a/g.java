// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.content.Context;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.e.a;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class g
{

    public static String a(Context context, String s, String s1, int i, int j)
    {
        Object obj;
        c c1;
        obj = null;
        e e1 = new e(s, "POST");
        e1.a(s1.getBytes());
        f f1 = new f();
        if (i != 0)
        {
            e1.a(i);
        }
        if (j != 0)
        {
            e1.b(j);
        }
        c1 = d.a();
        s1 = obj;
        if (!c1.a(f1, context))
        {
            break MISSING_BLOCK_LABEL_99;
        }
        context = c1.a(s, e1, f1);
        s1 = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s1 = com.jiubang.goweather.e.a.a(context, "UTF-8");
_L2:
        c1.a();
        return s1;
        context;
        s1 = obj;
        if (com.gtp.a.a.b.c.a())
        {
            context.printStackTrace();
            s1 = obj;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static JSONObject a(Context context, String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "pver", "1");
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "version", w.e(context));
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "lang", w.k(context));
        int i;
        try
        {
            i = Integer.valueOf(w.f(context)).intValue();
        }
        catch (Exception exception)
        {
            try
            {
                exception.printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return jsonobject;
            }
            i = 0;
        }
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "channel", i);
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "androidid", w.v(context));
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "email", s1);
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "goId", com.gau.go.a.e.b(context));
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "code", s);
        com.gtp.go.weather.sharephoto.a.f.a(jsonobject, "pid", 4);
        return jsonobject;
    }

    public static String b(Context context, String s, String s1)
    {
        return a(context, s, s1, 0, 0);
    }
}
