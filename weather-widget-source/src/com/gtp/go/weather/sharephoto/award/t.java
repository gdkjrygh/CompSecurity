// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.g;
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

public class t extends a
{

    private String a;
    private long b;
    private long c;
    private f d;
    private l e;
    private boolean f;
    private Context g;

    public t(Context context, long l1, long l2)
    {
        f = false;
        g = context.getApplicationContext();
        d = new f();
        b = l1;
        c = l2;
    }

    protected void a()
    {
        a = com.gtp.go.weather.sharephoto.a.g.b(g).a();
        if (!TextUtils.isEmpty(a))
        {
            e e1 = new e("http://gows.goforandroid.com/goweatherexSns/award/awardReply", 15000, 15000);
            e1.a("rd", w.c());
            e1.a("POST");
            ArrayList arraylist = new ArrayList();
            Object obj = com.gtp.go.weather.sharephoto.a.f.a(g);
            if (obj != null)
            {
                arraylist.add(new BasicNameValuePair("phead", ((JSONObject) (obj)).toString()));
                arraylist.add(new BasicNameValuePair("userId", a));
                arraylist.add(new BasicNameValuePair("userAwardId", String.valueOf(b)));
                arraylist.add(new BasicNameValuePair("awardId", String.valueOf(c)));
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
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    com.gtp.a.a.b.c.a("AwardReplyTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj))).toString());
                    com.gtp.a.a.b.c.a("AwardReplyTask", (new StringBuilder()).append("postParams: ").append(arraylist.toString()).toString());
                    obj = c1.b(((String) (obj)), e1, d);
                    d.b(((String) (obj)));
                    com.gtp.a.a.b.c.a("AwardReplyTask", (new StringBuilder()).append("resultText: ").append(((String) (obj))).toString());
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        try
                        {
                            e = l.a((new JSONObject(((String) (obj)))).getJSONObject("head"));
                        }
                        catch (JSONException jsonexception)
                        {
                            if (com.gtp.a.a.b.c.a())
                            {
                                jsonexception.printStackTrace();
                            }
                        }
                        if (e != null && e.a == 1)
                        {
                            com.gtp.a.a.b.c.a("AwardReplyTask", "\u9886\u53D6\u5956\u54C1\u6210\u529F!");
                            obj = new ContentValues();
                            ((ContentValues) (obj)).put("is_receive", Integer.valueOf(1));
                            ((ContentValues) (obj)).put("award_id", Long.valueOf(c));
                            long l1 = b;
                            com.gtp.go.weather.sharephoto.b.a.c.a(g, ((ContentValues) (obj)), "user_award_id=?", new String[] {
                                String.valueOf(l1)
                            });
                            f = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean c()
    {
        return f;
    }

    public long d()
    {
        return b;
    }

    public long e()
    {
        return c;
    }
}
