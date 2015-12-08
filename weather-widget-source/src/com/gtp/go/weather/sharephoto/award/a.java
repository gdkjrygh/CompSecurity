// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.o;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends com.gau.go.launcherex.gowidget.weather.service.a.a
{

    private String a;
    private String b;
    private f c;
    private l d;
    private boolean e;
    private Context f;

    public a(Context context, String s)
    {
        e = false;
        f = context.getApplicationContext();
        c = new f();
        b = s;
    }

    private boolean a(String s)
    {
        return com.gau.go.launcherex.gowidget.weather.d.a.a(g.a((new StringBuilder()).append(a).append("sns").append(b).toString()).getBytes(), 0).replace("\n", "").equals(s);
    }

    protected void a()
    {
        a = com.gtp.go.weather.sharephoto.a.g.b(f).a();
        if (!TextUtils.isEmpty(a)) goto _L2; else goto _L1
_L1:
        d = new l();
        d.a = 1;
        e = false;
_L4:
        return;
_L2:
        boolean flag;
        e e1 = new e("http://gows.goforandroid.com/goweatherexSns/award/awardVerify", 6000, 6000);
        e1.a("rd", w.c());
        e1.a("POST");
        ArrayList arraylist = new ArrayList();
        Object obj = com.gtp.go.weather.sharephoto.a.f.a(f);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(new BasicNameValuePair("phead", ((JSONObject) (obj)).toString()));
        arraylist.add(new BasicNameValuePair("userId", a));
        arraylist.add(new BasicNameValuePair("apkName", String.valueOf(b)));
        e1.a(arraylist);
        com.jiubang.goweather.b.c c1 = com.jiubang.goweather.b.d.a(true);
        Object obj1 = null;
        try
        {
            obj = e1.i();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            obj = obj1;
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception.printStackTrace();
                obj = obj1;
            }
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        com.gtp.a.a.b.c.a("ApkAwardVerifyTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj))).toString());
        com.gtp.a.a.b.c.a("ApkAwardVerifyTask", (new StringBuilder()).append("postParams: ").append(arraylist.toString()).toString());
        obj = c1.b(((String) (obj)), e1, c);
        c.b(((String) (obj)));
        com.gtp.a.a.b.c.a("ApkAwardVerifyTask", (new StringBuilder()).append("resultText: ").append(((String) (obj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new JSONObject(((String) (obj)));
        d = l.a(((JSONObject) (obj)).getJSONObject("head"));
        if (d.a != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((JSONObject) (obj)).getInt("canUse") == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        obj = ((JSONObject) (obj)).getString("key");
        if (e && a(((String) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            e = flag;
            com.gtp.a.a.b.c.a("ApkAwardVerifyTask", (new StringBuilder()).append("mCanUse: ").append(e).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (com.gtp.a.a.b.c.a())
        {
            ((JSONException) (obj)).printStackTrace();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean c()
    {
        return e;
    }

    public String d()
    {
        return b;
    }

    public int e()
    {
        if (d != null)
        {
            return d.a;
        } else
        {
            return -1;
        }
    }
}
