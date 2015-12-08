// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.o;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            u, b

public class v extends a
{

    private String a;
    private f b;
    private l c;
    private Context d;
    private SharedPreferences e;

    public v(Context context)
    {
        d = context.getApplicationContext();
        b = new f();
        e = GoWidgetApplication.c(d.getApplicationContext()).a();
    }

    private void a(List list)
    {
        if (list == null)
        {
            return;
        }
        JSONArray jsonarray = new JSONArray();
        jsonarray.put("none");
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = ((d)list.next()).i();
            if (obj != null)
            {
                obj = ((b) (obj)).d();
                if (obj != null)
                {
                    obj = ((com.gtp.go.weather.sharephoto.b.a) (obj)).d();
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        jsonarray.put(obj);
                    }
                }
            }
        } while (true);
        list = e.edit();
        list.putString("key_receive_apk_award_packagenames", jsonarray.toString());
        list.commit();
        com.gtp.a.a.b.c.a("GetMyAwardTask", (new StringBuilder()).append("AwardPackageNames: ").append(jsonarray.toString()).toString());
    }

    private void b(List list)
    {
        com.gtp.go.weather.sharephoto.b.a.c.a(d, null, null);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (d)list.next();
            com.gtp.go.weather.sharephoto.b.a.c.a(d, ((d) (obj)));
            obj = ((d) (obj)).i();
            if (obj != null)
            {
                com.gtp.go.weather.sharephoto.award.u.a(((b) (obj)).d());
                long l1 = ((b) (obj)).b();
                com.gtp.go.weather.sharephoto.b.a.b.a(d, "user_award_id=?", new String[] {
                    String.valueOf(l1)
                });
                com.gtp.go.weather.sharephoto.b.a.b.a(d, ((b) (obj)));
                obj = ((b) (obj)).d();
                if (obj != null)
                {
                    com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(((com.gtp.go.weather.sharephoto.b.a) (obj)).c(), true, d);
                }
            }
        } while (true);
    }

    private List c()
    {
        Object obj2;
        Object obj3;
        obj2 = null;
        obj3 = null;
        a = g.b(d).a();
        if (!TextUtils.isEmpty(a)) goto _L2; else goto _L1
_L1:
        Object obj1 = obj3;
_L4:
        return ((List) (obj1));
_L2:
        Object obj;
        e e1 = new e("http://gows.goforandroid.com/goweatherexSns/award/userAwardList", 15000, 15000);
        e1.a("rd", w.c());
        e1.a("POST");
        ArrayList arraylist = new ArrayList();
        obj = com.gtp.go.weather.sharephoto.a.f.a(d);
        obj1 = obj3;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(new BasicNameValuePair("phead", ((JSONObject) (obj)).toString()));
        arraylist.add(new BasicNameValuePair("userId", a));
        e1.a(arraylist);
        com.jiubang.goweather.b.c c1 = com.jiubang.goweather.b.d.a(true);
        try
        {
            obj = e1.i();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception.printStackTrace();
            }
            unsupportedencodingexception = null;
        }
        obj1 = obj3;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        com.gtp.a.a.b.c.a("GetMyAwardTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj))).toString());
        com.gtp.a.a.b.c.a("GetMyAwardTask", (new StringBuilder()).append("postParams: ").append(arraylist.toString()).toString());
        obj = c1.b(((String) (obj)), e1, b);
        b.b(((String) (obj)));
        com.gtp.a.a.b.c.a("GetMyAwardTask", (new StringBuilder()).append("resultText: ").append(((String) (obj))).toString());
        obj1 = obj3;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new JSONObject(((String) (obj)));
        c = l.a(((JSONObject) (obj1)).getJSONObject("head"));
        obj = obj2;
        try
        {
            if (c.a == 1)
            {
                obj = com.gtp.go.weather.sharephoto.b.a.c.a(((JSONObject) (obj1)).getJSONArray("userAwardList"));
            }
        }
        catch (JSONException jsonexception)
        {
            unsupportedencodingexception = obj2;
            if (com.gtp.a.a.b.c.a())
            {
                jsonexception.printStackTrace();
                unsupportedencodingexception = obj2;
            }
        }
        obj1 = obj;
        if (obj != null)
        {
            c(((List) (obj)));
            b(((List) (obj)));
            return ((List) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(List list)
    {
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            d d1 = (d)iterator.next();
            String s = d1.f();
            if (!TextUtils.isEmpty(s))
            {
                list = com.gau.go.launcherex.gowidget.c.g.a(s);
                list = new File((new StringBuilder()).append(com.gtp.go.weather.sharephoto.award.b.b).append(File.separator).append(list).append(".png").toString());
                list = new File(com.gtp.a.a.c.c.a(), list.getPath());
                if (!list.exists())
                {
                    int i = 3;
                    int j;
                    boolean flag;
                    do
                    {
                        flag = com.jiubang.goweather.e.a.a(list, s);
                        j = i - 1;
                        if (flag)
                        {
                            break;
                        }
                        i = j;
                    } while (j > 0);
                    if (!flag)
                    {
                        list = null;
                    }
                    com.gtp.a.a.b.c.a("GetMyAwardTask", (new StringBuilder()).append("downloadApkAwardImage picUrl...").append(s).toString());
                }
                if (list != null)
                {
                    d1.c(list.getAbsolutePath());
                }
            }
        } while (true);
    }

    protected void a()
    {
        a(c());
    }
}
