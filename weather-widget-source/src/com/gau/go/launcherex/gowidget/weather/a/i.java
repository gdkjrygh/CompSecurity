// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.a;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.g;
import com.gau.go.launcherex.gowidget.weather.a.a.a;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.a:
//            j, f, h, g

class i extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.weather.a.f a;

    private i(com.gau.go.launcherex.gowidget.weather.a.f f1)
    {
        a = f1;
        super();
    }

    i(com.gau.go.launcherex.gowidget.weather.a.f f1, com.gau.go.launcherex.gowidget.weather.a.g g1)
    {
        this(f1);
    }

    private j a(e e1)
    {
        com.jiubang.goweather.b.c c1;
        j j1;
        j1 = new j();
        j1.b.b = 2;
        c1 = null;
        String s = e1.i();
_L2:
        if (TextUtils.isEmpty(s))
        {
            return j1;
        }
        break; /* Loop/switch isn't completed */
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        j1.a.b(11);
        j1.a.c(4);
        j1.a.a(unsupportedencodingexception);
        s = c1;
        if (c.a())
        {
            unsupportedencodingexception.printStackTrace();
            s = c1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        j1.a.d(3);
        c1 = d.a();
        if (c1.a(j1.a, a.a)) goto _L4; else goto _L3
_L3:
        j1.a.b(11);
        j1.a.c(3);
_L9:
        j1.a.c();
        JVM INSTR lookupswitch 2: default 168
    //                   1: 388
    //                   11: 400;
           goto _L5 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_400;
_L10:
        (new g(a.a)).b(s, j1.a);
        return j1;
_L4:
        j1.a.a(SystemClock.elapsedRealtime());
        e1 = c1.b(s, e1, j1.a);
        j1.a.b(SystemClock.elapsedRealtime());
        if (TextUtils.isEmpty(e1)) goto _L9; else goto _L8
_L8:
        j1.a.b(e1);
        j1.a.c(SystemClock.elapsedRealtime());
        a(((String) (e1)), j1);
        j1.a.d(SystemClock.elapsedRealtime());
        if (j1.a.h() == 0L)
        {
            j1.a.c(0L);
        }
          goto _L9
        e1;
        j1.a.b(11);
        j1.a.c(10);
        j1.a.a(e1);
        if (c.a())
        {
            e1.printStackTrace();
        }
        if (j1.a.h() == 0L)
        {
            j1.a.c(0L);
        }
          goto _L9
        e1;
        if (j1.a.h() == 0L)
        {
            j1.a.c(0L);
        }
        throw e1;
_L6:
        j1.b.b = 1;
          goto _L10
        int k = j1.a.e();
        if (k == 0)
        {
            j1.b.b = 1;
        } else
        if (k == 6 || k == 12)
        {
            j1.b.b = 3;
        } else
        if (k == 3)
        {
            j1.b.b = 2;
        } else
        {
            j1.b.b = 1;
        }
          goto _L10
    }

    private void a(String s, j j1)
    {
        a a1 = j1.b;
        s = new JSONObject(s);
        JSONObject jsonobject = s.getJSONObject("head");
        int k = jsonobject.optInt("result", -1);
        if (k == 0)
        {
            j1.a.b(11);
            j1.a.c(0);
        }
        int i1 = jsonobject.optInt("costTime", 0);
        j1.a.e(i1);
        if (k == 1)
        {
            JSONArray jsonarray = s.getJSONArray("cities");
            if (jsonarray != null)
            {
                int k1 = jsonarray.length();
                for (int l = 0; l < k1; l++)
                {
                    Object obj = jsonarray.getJSONObject(l);
                    String s1 = ((JSONObject) (obj)).getString("city");
                    String s2 = ((JSONObject) (obj)).getString("cityId");
                    String s3 = ((JSONObject) (obj)).getString("state");
                    String s4 = ((JSONObject) (obj)).getString("country");
                    obj = ((JSONObject) (obj)).getString("timeZone");
                    String s5 = (new StringBuilder()).append(s1).append(", ").append(s3).append(", (").append(s4).append(")").toString();
                    a1.a.add(new CityBean(s2, s1, s3, s4, ((String) (obj)), s5));
                }

            }
            s = s.getString("more");
            if (!TextUtils.isEmpty(s) && !s.equalsIgnoreCase("NULL"))
            {
                a1.a(true);
                a1.a(s);
            } else
            {
                a1.a(null);
                a1.a(false);
            }
            j1.a.b(1);
        }
    }

    protected transient j a(e ae[])
    {
        return a(ae[0]);
    }

    protected void a(j j1)
    {
        if (j1.b.b == 1 && j1.b.a.isEmpty())
        {
            (new h(a, null)).execute(new String[] {
                a.b
            });
        }
        j1.b.c = a.b;
        a.b = null;
        if (isCancelled())
        {
            return;
        } else
        {
            a.a(j1.b);
            com.gau.go.launcherex.gowidget.statistics.i.a(a.a).a(j1.a);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((e[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((j)obj);
    }
}
