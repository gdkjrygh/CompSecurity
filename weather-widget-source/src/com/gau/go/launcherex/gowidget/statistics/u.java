// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.os.AsyncTask;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a.d;
import com.go.weatherex.h.b;
import com.gtp.a.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            s, w, h

class u extends AsyncTask
{

    final s a;

    u(s s1)
    {
        a = s1;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        (new b(com.gau.go.launcherex.gowidget.statistics.s.b(a))).a();
        long l = System.currentTimeMillis();
        long l1 = com.gau.go.launcherex.gowidget.statistics.s.d(a);
        if (l1 == 0L || l - l1 >= 0x1b77400L || l - l1 <= 0L)
        {
            com.gtp.a.a.a.a.a().a("\u5F00\u542F\u7EBF\u7A0B\u542F\u52A8\u4E0A\u4F20", "statistics_log.txt");
            boolean flag = com.gau.go.launcherex.gowidget.statistics.h.a(com.gau.go.launcherex.gowidget.statistics.w.a(com.gau.go.launcherex.gowidget.statistics.s.b(a)), com.gau.go.launcherex.gowidget.statistics.s.b(a));
            avoid = String.valueOf(2);
            String s1 = com.gau.go.launcherex.gowidget.statistics.w.f(com.gau.go.launcherex.gowidget.statistics.s.b(a));
            StringBuffer stringbuffer = new StringBuffer();
            Object obj = GoWidgetApplication.b(com.gau.go.launcherex.gowidget.statistics.s.b(a).getApplicationContext());
            StringBuffer stringbuffer1;
            if (((f) (obj)).a(32))
            {
                stringbuffer.append(4);
            } else
            if (((f) (obj)).a(1))
            {
                stringbuffer.append(1);
            } else
            if (((f) (obj)).a(2) && ((f) (obj)).a(64))
            {
                stringbuffer.append(2).append(",").append(3);
            } else
            if (((f) (obj)).a(2) && !((f) (obj)).a(64))
            {
                stringbuffer.append(2);
            } else
            if (!((f) (obj)).a(2) && ((f) (obj)).a(64))
            {
                stringbuffer.append(3);
            } else
            if (((f) (obj)).e())
            {
                stringbuffer.append(0);
            }
            obj = String.valueOf(-1);
            e.a(com.gau.go.launcherex.gowidget.statistics.s.b(a)).a(avoid, s1, stringbuffer.toString(), false, ((String) (obj)), true);
            stringbuffer1 = new StringBuffer();
            stringbuffer1.append("\u57FA\u7840\u7EDF\u8BA1(upLoadBasicInfoStaticData) ");
            stringbuffer1.append("[\u4EA7\u54C1id:").append(avoid).append("] ");
            stringbuffer1.append("[\u4EA7\u54C1\u6E20\u9053:").append(s1).append("] ");
            stringbuffer1.append("[\u662F\u5426\u4ED8\u8D39\u7528\u6237:").append(stringbuffer).append("] ");
            stringbuffer1.append("[\u662F\u5426\u9700\u8981root\u4FE1\u606F:").append(false).append("] ");
            stringbuffer1.append("[key:").append(((String) (obj))).append("] ");
            stringbuffer1.append("[\u662F\u5426\u65B0\u7528\u6237:").append(true).append("] ");
            com.gtp.a.a.a.a.a().a(stringbuffer1.toString(), "base_statistics.txt");
            if (flag)
            {
                com.gtp.a.a.a.a.a().a("\u4E0A\u4F20\u6210\u529F\uFF0C\u6E05\u9664\u672C\u6B21\u6570\u636E", "statistics_log.txt");
                com.gau.go.launcherex.gowidget.statistics.w.b(com.gau.go.launcherex.gowidget.statistics.s.b(a).getApplicationContext());
                com.gau.go.launcherex.gowidget.statistics.s.a(a, l);
                d.a(com.gau.go.launcherex.gowidget.statistics.s.b(a));
                l = 0x1b77400L;
            } else
            {
                com.gtp.a.a.a.a.a().a("\u4E0A\u4F20\u4E0D\u6210\u529F\uFF0C\u672C\u6B21\u6570\u636E\u4FDD\u7559", "statistics_log.txt");
                l = 0x124f80L;
            }
        } else
        {
            l = 0x1b77400L - (l - l1);
        }
        com.gau.go.launcherex.gowidget.statistics.s.b(a, l);
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
