// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.a;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.e.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class f
{

    public static String a(Context context, String s, int i, int j, String s1, String s2)
    {
        e e1 = null;
        Object obj2 = null;
        Object obj1 = null;
        Object obj = s1;
        if (i == 1)
        {
            try
            {
                obj = com.gau.go.launcherex.gowidget.c.f.a(s1, "UTF-8", "ISO-8859-1");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
                obj = null;
            }
        }
        s1 = e1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        e1 = new e(s, "POST");
        s1 = new ArrayList();
        s1.add(new BasicNameValuePair("handle", (new StringBuilder()).append(i).append("").toString()));
        s1.add(new BasicNameValuePair("phead", ((String) (obj))));
        s1.add(new BasicNameValuePair("userInfo", s2));
        s1.add(new BasicNameValuePair("shandle", (new StringBuilder()).append(j).append("").toString()));
        e1.a(s1);
        obj = new com.jiubang.goweather.b.f();
        s2 = d.a();
        s1 = obj1;
        if (!s2.a(((com.jiubang.goweather.b.f) (obj)), context))
        {
            break MISSING_BLOCK_LABEL_254;
        }
        s = s2.a(s, e1, ((com.jiubang.goweather.b.f) (obj)));
        s1 = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        context = obj2;
        s = com.jiubang.goweather.e.a.a(s, "ISO-8859-1");
        s1 = s;
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        context = s;
        s1 = com.gau.go.launcherex.gowidget.c.f.b(s, "ISO-8859-1", "UTF-8");
_L4:
        s2.a();
_L2:
        return s1;
        s;
        s1 = context;
        if (com.gtp.a.a.b.c.a())
        {
            s.printStackTrace();
            s1 = context;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static JSONObject a(Context context)
    {
        return a(context, w.m(context));
    }

    public static JSONObject a(Context context, String s)
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "pversion", 3);
        a(jsonobject, "aid", w.v(context));
        a(jsonobject, "goid", com.gau.go.a.e.b(context));
        a(jsonobject, "uid", w.d(context));
        a(jsonobject, "cid", 1);
        a(jsonobject, "cversionname", w.c(context));
        int i = Integer.valueOf(w.f(context)).intValue();
_L1:
        a(jsonobject, "channel", i);
        a(jsonobject, "local", s);
        a(jsonobject, "lang", w.l(context));
        a(jsonobject, "sdk", android.os.Build.VERSION.SDK_INT);
        a(jsonobject, "imsi", w.r(context));
        a(jsonobject, "dpi", w.x(context));
        a(jsonobject, "cversion", 1);
        if (w.h(context))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a(jsonobject, "official", i);
        Exception exception;
        if (w.s(context))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        try
        {
            a(jsonobject, "hasmarket", i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
        exception;
        exception.printStackTrace();
        i = 0;
          goto _L1
    }

    public static final void a(JSONObject jsonobject, String s, int i)
    {
        if (jsonobject != null && !TextUtils.isEmpty(s))
        {
            jsonobject.put(s, i);
        }
    }

    public static final void a(JSONObject jsonobject, String s, String s1)
    {
        if (jsonobject != null && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            jsonobject.put(s, s1);
        }
    }
}
