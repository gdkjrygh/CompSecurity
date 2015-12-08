// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.g;
import com.gau.go.launcherex.gowidget.statistics.i;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.goweather.c:
//            v

public class t extends AsyncTask
{

    private int a;
    private e b;
    private volatile boolean c;
    private v d;
    private com.gau.go.launcherex.gowidget.weather.model.t e;
    private Context f;

    private void a(String s, f f1)
    {
        s = new JSONObject(s);
        JSONObject jsonobject = s.getJSONObject("head");
        int j = jsonobject.optInt("result", -1);
        if (j == 0)
        {
            f1.b(11);
            f1.c(0);
        }
        f1.e(jsonobject.optInt("costTime", 0));
        if (j == 1)
        {
            JSONArray jsonarray = s.getJSONArray("cities");
            if (jsonarray != null)
            {
                int l = jsonarray.length();
                for (int k = 0; k < l; k++)
                {
                    Object obj = jsonarray.getJSONObject(k);
                    String s1 = ((JSONObject) (obj)).getString("city");
                    String s2 = ((JSONObject) (obj)).getString("cityId");
                    String s3 = ((JSONObject) (obj)).getString("state");
                    String s4 = ((JSONObject) (obj)).getString("country");
                    obj = ((JSONObject) (obj)).getString("timeZone");
                    String s5 = (new StringBuilder()).append(s1).append(", ").append(s3).append(", (").append(s4).append(")").toString();
                    e.a().add(new CityBean(s2, s1, s3, s4, ((String) (obj)), s5));
                }

            }
            s = s.getString("more");
            if (!s.equalsIgnoreCase("NULL"))
            {
                e.a(s);
                e.a(true);
            } else
            {
                e.a(null);
                e.a(false);
            }
            f1.b(1);
        }
    }

    private f b()
    {
        Object obj;
        Object obj1;
        f f1;
        f1 = new f();
        obj1 = null;
        try
        {
            obj = b.i();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            f1.b(11);
            f1.c(4);
            f1.a(unsupportedencodingexception);
            obj = obj1;
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception.printStackTrace();
                obj = obj1;
            }
            continue; /* Loop/switch isn't completed */
        }
_L8:
        f1.d(3);
        obj1 = com.jiubang.goweather.b.d.a();
        if (c || TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        if (((c) (obj1)).a(f1, f)) goto _L4; else goto _L3
_L3:
        f1.b(11);
        f1.c(3);
_L2:
        if (!c)
        {
            (new g(f)).b(((String) (obj)), f1);
        }
        return f1;
_L4:
        f1.a(SystemClock.elapsedRealtime());
        obj1 = ((c) (obj1)).b(((String) (obj)), b, f1);
        f1.b(SystemClock.elapsedRealtime());
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L2; else goto _L5
_L5:
        if (!c)
        {
            f1.b(((String) (obj1)));
            f1.c(SystemClock.elapsedRealtime());
            a(((String) (obj1)), f1);
            f1.d(SystemClock.elapsedRealtime());
        }
        if (f1.h() != 0L) goto _L2; else goto _L6
_L6:
        f1.c(0L);
        break; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        f1.b(11);
        f1.c(10);
        f1.a(jsonexception);
        if (com.gtp.a.a.b.c.a())
        {
            jsonexception.printStackTrace();
        }
        if (f1.h() != 0L) goto _L2; else goto _L6
        Exception exception;
        exception;
        if (f1.h() == 0L)
        {
            f1.c(0L);
        }
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected transient f a(Object aobj[])
    {
        return b();
    }

    public void a()
    {
        c = true;
        d = null;
    }

    protected void a(f f1)
    {
label0:
        {
label1:
            {
                super.onPostExecute(f1);
                if (!c && d != null)
                {
                    switch (f1.c())
                    {
                    default:
                        i.a(f).a(f1);
                        d.b();
                        break;

                    case 1: // '\001'
                        break label1;

                    case 11: // '\013'
                        break label0;
                    }
                }
                return;
            }
            i.a(f).a(f1);
            d.a(e, a);
            return;
        }
        int j = f1.e();
        if (j == 0)
        {
            i.a(f).a(f1);
            d.c();
            return;
        }
        if (j == 3)
        {
            d.a();
            return;
        } else
        {
            i.a(f).a(f1);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((f)obj);
    }
}
