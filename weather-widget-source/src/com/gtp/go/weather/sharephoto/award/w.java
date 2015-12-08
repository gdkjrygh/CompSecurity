// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.k;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.o;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class w extends a
{

    private f a;
    private l b;
    private Context c;

    public w(Context context)
    {
        c = context.getApplicationContext();
        a = new f();
    }

    protected void a()
    {
        Object obj = g.b(c).a();
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        Object obj2;
        Object obj3;
        obj1 = new e("http://gows.goforandroid.com/goweatherexSns/prompt/promptList");
        ((e) (obj1)).a("rd", com.gau.go.launcherex.gowidget.statistics.w.c());
        ((e) (obj1)).a("POST");
        obj2 = new ArrayList();
        obj3 = com.gtp.go.weather.sharephoto.a.f.a(c);
        if (obj3 == null) goto _L1; else goto _L3
_L3:
        ((List) (obj2)).add(new BasicNameValuePair("phead", ((JSONObject) (obj3)).toString()));
        ((List) (obj2)).add(new BasicNameValuePair("userId", ((String) (obj))));
        ((e) (obj1)).a(((List) (obj2)));
        obj3 = d.a(true);
        k k1;
        try
        {
            obj = ((e) (obj1)).i();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (com.gtp.a.a.b.c.a())
            {
                ((UnsupportedEncodingException) (obj)).printStackTrace();
            }
            obj = null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L4
_L4:
        com.gtp.a.a.b.c.a("GetPromptTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj))).toString());
        com.gtp.a.a.b.c.a("GetPromptTask", (new StringBuilder()).append("postParams: ").append(obj2.toString()).toString());
        obj = ((com.jiubang.goweather.b.c) (obj3)).b(((String) (obj)), ((e) (obj1)), a);
        a.b(((String) (obj)));
        com.gtp.a.a.b.c.a("GetPromptTask", (new StringBuilder()).append("resultText: ").append(((String) (obj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L5
_L5:
        obj = new JSONObject(((String) (obj)));
        b = l.a(((JSONObject) (obj)).getJSONObject("head"));
        if (b.a != 1)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        obj = k.a(((JSONObject) (obj)).getJSONArray("prompts"));
_L6:
        if (obj != null)
        {
            obj1 = k.a(c, null, null, null);
            k.a(c, null, null);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                obj2 = (k)((Iterator) (obj)).next();
                obj3 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj3)).hasNext())
                    {
                        break;
                    }
                    k1 = (k)((Iterator) (obj3)).next();
                    if (k1.b() != ((k) (obj2)).b())
                    {
                        continue;
                    }
                    ((k) (obj2)).a(k1.a());
                    break;
                } while (true);
                k.a(c, ((k) (obj2)));
            }
        }
          goto _L1
        obj;
        if (com.gtp.a.a.b.c.a())
        {
            ((JSONException) (obj)).printStackTrace();
        }
        obj = null;
          goto _L6
    }
}
