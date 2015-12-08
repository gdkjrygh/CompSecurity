// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.service.error.a;

import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.service.error.model.LocationErrorBean;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.b.g;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.gau.go.launcherex.gowidget.service.error.a:
//            a

class b extends AsyncTask
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    protected transient Void a(LocationErrorBean alocationerrorbean[])
    {
        Object obj = alocationerrorbean[0];
        alocationerrorbean = new e("http://goweatherexmg.3g.cn/goweatherexms/feedBack/gps");
        g.a(com.gau.go.launcherex.gowidget.service.error.a.a.a(a), alocationerrorbean);
        alocationerrorbean.a("POST");
        f f1 = new f();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("date", com.gau.go.launcherex.gowidget.service.error.a.a.b(a)));
        arraylist.add(new BasicNameValuePair("publishCityId", ((LocationErrorBean) (obj)).a()));
        arraylist.add(new BasicNameValuePair("publishCity", ((LocationErrorBean) (obj)).b()));
        arraylist.add(new BasicNameValuePair("publishState", ((LocationErrorBean) (obj)).c()));
        arraylist.add(new BasicNameValuePair("publishCountry", ((LocationErrorBean) (obj)).d()));
        arraylist.add(new BasicNameValuePair("latlng", (new StringBuilder()).append(((LocationErrorBean) (obj)).e()).append(",").append(((LocationErrorBean) (obj)).f()).toString()));
        arraylist.add(new BasicNameValuePair("feedBackCity", ((LocationErrorBean) (obj)).g()));
        arraylist.add(new BasicNameValuePair("url", ((LocationErrorBean) (obj)).h()));
        alocationerrorbean.a(arraylist);
        obj = d.a(true);
        try
        {
            ((c) (obj)).b(alocationerrorbean.i(), alocationerrorbean, f1);
        }
        // Misplaced declaration of an exception variable
        catch (LocationErrorBean alocationerrorbean[])
        {
            alocationerrorbean.printStackTrace();
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((LocationErrorBean[])aobj);
    }
}
