// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.c.g;
import com.gtp.a.a.a.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            s, t

class v extends BroadcastReceiver
{

    final s a;

    private v(s s1)
    {
        a = s1;
        super();
    }

    v(s s1, t t)
    {
        this(s1);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            if (com.gau.go.launcherex.gowidget.statistics.s.a(a) && g.a(s.b(a)))
            {
                com.gtp.a.a.a.a.a().a("\u7F51\u7EDC\u8FDE\u63A5\u6062\u590D", "statistics_log.txt");
                s.c(a);
                com.gau.go.launcherex.gowidget.statistics.s.a(a, false);
                return;
            }
            break MISSING_BLOCK_LABEL_235;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_upload"))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        com.gtp.a.a.a.a.a().a("\u6536\u5230\u5F00\u59CB\u4E0A\u4F20\u5E7F\u64AD", "statistics_log.txt");
        if (g.a(s.b(a)))
        {
            s.c(a);
            return;
        }
        try
        {
            com.gtp.a.a.a.a.a().a("\u65E0\u7F51\u7EDC\uFF0C\u7B49\u5F85\u7F51\u7EDC\u94FE\u63A5", "statistics_log.txt");
            com.gau.go.launcherex.gowidget.statistics.s.a(a, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            long l = s.d(a);
            if (System.currentTimeMillis() < l)
            {
                com.gtp.a.a.a.a.a().a("\u65F6\u95F4\u88AB\u5F80\u540E\u8C03\u4E86\uFF0C\u9A6C\u4E0A\u542F\u52A8\u4E00\u6B21\u4E0A\u4F20", "statistics_log.txt");
                com.gau.go.launcherex.gowidget.statistics.s.a(a, 0L);
                s.c(a);
                return;
            }
            break MISSING_BLOCK_LABEL_235;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.statistics.action_load_ad"))
        {
            s.e(a);
            s.f(a);
            return;
        }
        if (context.equals("com.gau.go.launcherex.gowidget.weatherwidget.seven.action_ad_try"))
        {
            com.gau.go.launcherex.gowidget.statistics.s.g(a);
            s.h(a);
        }
    }
}
