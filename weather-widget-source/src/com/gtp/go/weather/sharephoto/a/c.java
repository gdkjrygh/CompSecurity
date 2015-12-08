// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.go.weather.sharephoto.b.o;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.a:
//            a, f, d, e, 
//            g

class c extends AsyncTask
{

    final a a;
    private String b;
    private String c;
    private boolean d;

    public c(a a1, boolean flag, String s, String s1)
    {
        a = a1;
        super();
        b = null;
        c = null;
        d = flag;
        b = s;
        c = s1;
    }

    protected transient o a(Object aobj[])
    {
        Object obj1 = null;
        String s;
        Object obj;
        o o1;
        int i;
        if (!TextUtils.isEmpty(b))
        {
            s = b;
        } else
        {
            s = null;
        }
        o1 = new o();
        aobj = f.a(com.gtp.go.weather.sharephoto.a.a.a(a));
        obj = "";
        if (aobj != null)
        {
            obj = ((JSONObject) (aobj)).toString();
        }
        com.gtp.a.a.b.c.a("login", (new StringBuilder()).append("pheadData --> ").append(((String) (obj))).toString());
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        aobj = "";
        if (!TextUtils.isEmpty(s))
        {
            aobj = com.gtp.go.weather.sharephoto.a.a.a(a, 2, s, com.gtp.go.weather.sharephoto.a.a.a(a)).toString();
        } else
        if (!TextUtils.isEmpty(c))
        {
            aobj = com.gtp.go.weather.sharephoto.a.a.a(a, 1, c, com.gtp.go.weather.sharephoto.a.a.a(a)).toString();
        }
        com.gtp.a.a.b.c.a("login", (new StringBuilder()).append("userInfo --> ").append(((String) (aobj))).toString());
        com.gtp.a.a.b.c.a("login", (new StringBuilder()).append("url --> ").append("http://gows.goforandroid.com/goweatherexSns/registry/user").toString());
        aobj = f.a(com.gtp.go.weather.sharephoto.a.a.a(a), "http://gows.goforandroid.com/goweatherexSns/registry/user", 0, 0, ((String) (obj)), ((String) (aobj)));
        com.gtp.a.a.b.c.a("login", (new StringBuilder()).append("result --> ").append(((String) (aobj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (aobj)))) goto _L1; else goto _L3
_L3:
        obj = new JSONObject(((String) (aobj)));
        aobj = obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        aobj = ((JSONObject) (obj)).optJSONObject("head");
        if (aobj == null) goto _L5; else goto _L4
_L4:
        i = ((JSONObject) (aobj)).optInt("result", 0);
_L13:
        if (i != 1) goto _L7; else goto _L6
_L6:
        aobj = ((JSONObject) (obj)).optJSONObject("user");
        if (aobj == null) goto _L9; else goto _L8
_L8:
        aobj = ((JSONObject) (aobj)).optString("userId");
_L14:
        com.gtp.a.a.b.c.a("login", (new StringBuilder()).append("userId = ").append(((String) (aobj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (aobj))) || ((String) (aobj)).equals("0")) goto _L7; else goto _L10
_L10:
        o1.a(((String) (aobj)));
        o1.a(System.currentTimeMillis());
        o1.b(s);
        obj = new ContentValues();
        ((ContentValues) (obj)).put("user_id", ((String) (aobj)));
        if (TextUtils.isEmpty(s)) goto _L12; else goto _L11
_L11:
        ((ContentValues) (obj)).put("user_gmail", s);
_L16:
        com.gtp.go.weather.sharephoto.a.a.a(a).getContentResolver().insert(WeatherContentProvider.v, ((ContentValues) (obj)));
_L7:
        return o1;
_L5:
        i = -1;
          goto _L13
_L9:
        aobj = "";
          goto _L14
_L12:
        if (TextUtils.isEmpty(c)) goto _L16; else goto _L15
_L15:
        ((ContentValues) (obj)).put("go_id", c);
          goto _L16
        aobj;
        if (com.gtp.a.a.b.c.a())
        {
            ((JSONException) (aobj)).printStackTrace();
        }
          goto _L7
    }

    protected void a(o o1)
    {
        super.onPostExecute(o1);
        if (o1 == null || TextUtils.isEmpty(o1.a())) goto _L2; else goto _L1
_L1:
        if (com.gtp.go.weather.sharephoto.a.a.b(a) == null) goto _L4; else goto _L3
_L3:
        com.gtp.go.weather.sharephoto.a.a.b(a).a(o1);
_L6:
        com.gtp.go.weather.sharephoto.a.a.c(a);
        com.gtp.go.weather.sharephoto.a.a.d(a);
_L2:
        if (d && com.gtp.go.weather.sharephoto.a.a.e(a) != null)
        {
            Object obj = com.gtp.go.weather.sharephoto.a.a.e(a);
            o o2;
            boolean flag;
            if (o1 != null)
            {
                if (!TextUtils.isEmpty(o1.a()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            ((e) (obj)).a(flag);
        }
        com.gtp.go.weather.sharephoto.a.a.a(a, false);
        return;
_L4:
        if (!TextUtils.isEmpty(o1.a()))
        {
            obj = g.a(com.gtp.go.weather.sharephoto.a.a.a(a));
            o2 = ((g) (obj)).b();
            o2.a(o1.a());
            o2.b(o1.b());
            o2.c(o1.d());
            ((g) (obj)).b(o1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((o)obj);
    }
}
