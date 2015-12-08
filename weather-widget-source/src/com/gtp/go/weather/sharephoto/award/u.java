// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gtp.a.a.c.c;
import com.gtp.go.weather.sharephoto.b.b;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.b.l;
import com.gtp.go.weather.sharephoto.b.n;
import com.gtp.go.weather.sharephoto.b.o;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            b

public class u extends a
{

    private String a;
    private d b;
    private f c;
    private l d;
    private Context e;

    public u(Context context, d d1)
    {
        e = context.getApplicationContext();
        c = new f();
        b = d1;
    }

    public static void a(com.gtp.go.weather.sharephoto.b.a a1)
    {
        if (a1 != null)
        {
            String s = a1.a();
            if (!TextUtils.isEmpty(s))
            {
                Object obj = g.a(s);
                obj = new File((new StringBuilder()).append(com.gtp.go.weather.sharephoto.award.b.a).append(File.separator).append(((String) (obj))).append(".png").toString());
                obj = new File(com.gtp.a.a.c.c.a(), ((File) (obj)).getPath());
                if (!((File) (obj)).exists())
                {
                    int i = 3;
                    int j;
                    boolean flag;
                    do
                    {
                        flag = com.jiubang.goweather.e.a.a(((File) (obj)), s);
                        j = i - 1;
                        if (flag)
                        {
                            break;
                        }
                        i = j;
                    } while (j > 0);
                    if (!flag)
                    {
                        obj = null;
                    }
                    com.gtp.a.a.b.c.a("GetAwardTask", (new StringBuilder()).append("downloadApkAwardImage picUrl...").append(s).toString());
                }
                if (obj != null)
                {
                    com.gtp.a.a.b.c.a("GetAwardTask", (new StringBuilder()).append("downloadApkAwardImage picPath...").append(((File) (obj)).getAbsolutePath()).toString());
                    a1.b(((File) (obj)).getAbsolutePath());
                    return;
                }
            }
        }
    }

    private void a(List list)
    {
        long l1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); com.gtp.go.weather.sharephoto.b.a.b.a(e, "user_award_id=?", new String[] {
    String.valueOf(l1)
}))
        {
            b b2 = (b)iterator.next();
            b2.b(b.a());
            l1 = b2.b();
        }

        b b1;
        for (list = list.iterator(); list.hasNext(); com.gtp.go.weather.sharephoto.b.a.b.a(e, b1))
        {
            b1 = (b)list.next();
            b1.b(b.a());
        }

    }

    private void b(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            if (b1.c() == 1)
            {
                a(b1.d());
            }
        } while (true);
    }

    private List d()
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        Object obj = e.getPackageManager();
        Object obj1 = new Intent("com.gau.go.weatherex.theme.systemwidget");
        ((Intent) (obj1)).addCategory("android.intent.category.DEFAULT");
        obj1 = ((PackageManager) (obj)).queryIntentActivities(((Intent) (obj1)), 0);
        int i1 = ((List) (obj1)).size();
        for (int i = 0; i < i1; i++)
        {
            arraylist.add(((ResolveInfo)((List) (obj1)).get(i)).activityInfo.packageName);
        }

        obj1 = new Intent("com.gau.go.weatherex.theme.livewallpaper");
        ((Intent) (obj1)).addCategory("android.intent.category.DEFAULT");
        obj1 = ((PackageManager) (obj)).queryIntentActivities(((Intent) (obj1)), 0);
        i1 = ((List) (obj1)).size();
        for (int j = 0; j < i1; j++)
        {
            arraylist.add(((ResolveInfo)((List) (obj1)).get(j)).activityInfo.packageName);
        }

        obj1 = new Intent("com.gau.go.weatherex.theme.apptheme");
        ((Intent) (obj1)).addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(((Intent) (obj1)), 0);
        i1 = ((List) (obj)).size();
        for (int k = ((flag) ? 1 : 0); k < i1; k++)
        {
            arraylist.add(((ResolveInfo)((List) (obj)).get(k)).activityInfo.packageName);
        }

        return arraylist;
    }

    protected void a()
    {
        Object obj1;
        obj1 = null;
        a = com.gtp.go.weather.sharephoto.a.g.b(e).a();
        if (!TextUtils.isEmpty(a)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj2;
        ArrayList arraylist;
        obj2 = new e("http://gows.goforandroid.com/goweatherexSns/award/awardList", 15000, 15000);
        ((e) (obj2)).a("rd", w.c());
        ((e) (obj2)).a("POST");
        arraylist = new ArrayList();
        obj = com.gtp.go.weather.sharephoto.a.f.a(e);
        if (obj == null) goto _L1; else goto _L3
_L3:
        arraylist.add(new BasicNameValuePair("phead", ((JSONObject) (obj)).toString()));
        arraylist.add(new BasicNameValuePair("userId", a));
        arraylist.add(new BasicNameValuePair("userAwardId", String.valueOf(b.a())));
        obj = new n();
        ((n) (obj)).a(d());
        ((n) (obj)).a(1);
        arraylist.add(new BasicNameValuePair("usedAward", ((n) (obj)).a().toString()));
        ((e) (obj2)).a(arraylist);
        com.jiubang.goweather.b.c c1 = com.jiubang.goweather.b.d.a(true);
        try
        {
            obj = ((e) (obj2)).i();
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            if (com.gtp.a.a.b.c.a())
            {
                unsupportedencodingexception.printStackTrace();
            }
            unsupportedencodingexception = null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L4
_L4:
        com.gtp.a.a.b.c.a("GetAwardTask", (new StringBuilder()).append("completeURL: ").append(((String) (obj))).toString());
        com.gtp.a.a.b.c.a("GetAwardTask", (new StringBuilder()).append("postParams: ").append(arraylist.toString()).toString());
        obj = c1.b(((String) (obj)), ((e) (obj2)), c);
        c.b(((String) (obj)));
        com.gtp.a.a.b.c.a("GetAwardTask", (new StringBuilder()).append("resultText: ").append(((String) (obj))).toString());
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L5
_L5:
        obj2 = new JSONObject(((String) (obj)));
        d = l.a(((JSONObject) (obj2)).getJSONObject("head"));
        obj = obj1;
        if (d.a == 1)
        {
            obj = com.gtp.go.weather.sharephoto.b.a.b.a(((JSONObject) (obj2)).getJSONArray("awardList"));
        }
_L7:
        if (obj != null)
        {
            b(((List) (obj)));
            a(((List) (obj)));
        }
        com.gtp.a.a.b.c.a("GetAwardTask", "task end...");
        return;
        JSONException jsonexception;
        jsonexception;
        unsupportedencodingexception = obj1;
        if (com.gtp.a.a.b.c.a())
        {
            jsonexception.printStackTrace();
            unsupportedencodingexception = obj1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean a(a a1)
    {
        if (a1 instanceof u)
        {
            u u1 = (u)a1;
            if (b.a() == u1.c().a())
            {
                return true;
            }
        }
        return super.a(a1);
    }

    public d c()
    {
        return b;
    }
}
