// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import a.a.a.a.a.a.d;
import a.a.a.a.a.h;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.model.FeedbackBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.g;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            c, w, d

class f extends AsyncTask
{

    final com.gau.go.launcherex.gowidget.statistics.c a;

    private f(com.gau.go.launcherex.gowidget.statistics.c c1)
    {
        a = c1;
        super();
    }

    f(com.gau.go.launcherex.gowidget.statistics.c c1, com.gau.go.launcherex.gowidget.statistics.d d1)
    {
        this(c1);
    }

    protected transient Void a(FeedbackBean afeedbackbean[])
    {
        FeedbackBean feedbackbean;
        feedbackbean = afeedbackbean[0];
        afeedbackbean = feedbackbean.e();
        if (!TextUtils.isEmpty(afeedbackbean)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        obj = c.a(a).getContentResolver().query(WeatherContentProvider.a, new String[] {
            "cityJsonString"
        }, "cityId=?", new String[] {
            afeedbackbean
        }, "_id");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_494;
        }
        if (((Cursor) (obj)).getCount() != 1 || !((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        afeedbackbean = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cityJsonString"));
_L12:
        ((Cursor) (obj)).close();
_L11:
        if (TextUtils.isEmpty(afeedbackbean)) goto _L1; else goto _L5
_L5:
        Object obj1 = c.a(a).getFileStreamPath("network_time_and_status_statistics_email.txt");
        if (obj1 == null || !((File) (obj1)).exists()) goto _L1; else goto _L6
_L6:
        obj = new e("http://goweatherexmg.3g.cn/goweatherexms/feedBack/weather");
        g.a(c.a(a), ((e) (obj)));
        ((e) (obj)).a("rd", com.gau.go.launcherex.gowidget.statistics.w.c());
        ((e) (obj)).a("POST");
        com.jiubang.goweather.b.f f1 = new com.jiubang.goweather.b.f();
        h h1 = new h(a.a.a.a.a.e.b);
        int i;
        int j;
        try
        {
            String s1 = com.gau.go.a.e.b(c.a(a));
            c.a("LJL", (new StringBuilder()).append("goid:").append(s1).toString());
            h1.a("userId", new a.a.a.a.a.a.e(s1));
            h1.a("content", new a.a.a.a.a.a.e(feedbackbean.c(), Charset.forName("UTF-8")));
            h1.a("problemType", new a.a.a.a.a.a.e(String.valueOf(feedbackbean.d())));
            h1.a("feedbackWeather", new a.a.a.a.a.a.e(afeedbackbean, Charset.forName("UTF-8")));
        }
        // Misplaced declaration of an exception variable
        catch (FeedbackBean afeedbackbean[])
        {
            if (c.a())
            {
                afeedbackbean.printStackTrace();
            }
        }
        h1.a("clientStatistics", new d(((File) (obj1))));
        ((e) (obj)).a(h1);
        obj1 = com.jiubang.goweather.b.d.a(true);
        try
        {
            afeedbackbean = ((e) (obj)).i();
        }
        // Misplaced declaration of an exception variable
        catch (FeedbackBean afeedbackbean[])
        {
            if (c.a())
            {
                afeedbackbean.printStackTrace();
            }
            afeedbackbean = null;
        }
        if (TextUtils.isEmpty(afeedbackbean)) goto _L1; else goto _L7
_L7:
        i = 3;
_L10:
        String s = ((com.jiubang.goweather.b.c) (obj1)).b(afeedbackbean, ((e) (obj)), f1);
        if (s == null)
        {
            s = "";
        } else
        {
            s = s.trim();
        }
        c.a("LJL", (new StringBuilder()).append("resultText:").append(s).toString());
        j = i - 1;
        if ("OK".equalsIgnoreCase(s)) goto _L1; else goto _L8
_L8:
        i = j;
        if (j > 0) goto _L10; else goto _L9
_L9:
        return null;
        afeedbackbean;
        if (c.a())
        {
            afeedbackbean.printStackTrace();
        }
        ((Cursor) (obj)).close();
        afeedbackbean = null;
          goto _L11
        afeedbackbean;
        ((Cursor) (obj)).close();
        throw afeedbackbean;
_L4:
        afeedbackbean = null;
          goto _L12
        afeedbackbean = null;
          goto _L11
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((FeedbackBean[])aobj);
    }
}
