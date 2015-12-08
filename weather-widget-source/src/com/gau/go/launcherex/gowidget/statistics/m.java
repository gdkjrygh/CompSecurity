// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gau.go.launcherex.gowidget.c.g;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            i, j

class m extends BroadcastReceiver
{

    final i a;

    private m(i j)
    {
        a = j;
        super();
    }

    m(i j, j j1)
    {
        this(j);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if (context.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            if (com.gau.go.launcherex.gowidget.statistics.i.a(a) && g.a(i.b(a)))
            {
                com.gtp.a.a.a.a.a().a("\u7F51\u7EDC\u8FDE\u63A5\u6062\u590D", "statistics_log.txt");
                c.a("CYN", "\u7F51\u7EDC\u8FDE\u63A5\u6062\u590D");
                com.gau.go.launcherex.gowidget.statistics.i.c(a);
                com.gau.go.launcherex.gowidget.statistics.i.a(a, false);
                return;
            }
            break MISSING_BLOCK_LABEL_224;
        }
        if (!context.equals("com.gau.go.launcherex.gowidget.weatherwidget.statistics.network_time_and_status_upload"))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        com.gtp.a.a.a.a.a().a("\u6536\u5230\u5F00\u59CB\u4E0A\u4F20\u5E7F\u64AD", "statistics_log.txt");
        c.a("CYN", "\u6536\u5230\u5F00\u59CB\u4E0A\u4F20\u5E7F\u64AD");
        if (!g.a(i.b(a)))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        com.gau.go.launcherex.gowidget.statistics.i.c(a);
_L1:
        i.d(a);
        return;
        try
        {
            com.gtp.a.a.a.a.a().a("\u65E0\u7F51\u7EDC\uFF0C\u7B49\u5F85\u7F51\u7EDC\u94FE\u63A5", "statistics_log.txt");
            c.a("CYN", "\u65E0\u7F51\u7EDC\uFF0C\u7B49\u5F85\u7F51\u7EDC\u94FE\u63A5");
            com.gau.go.launcherex.gowidget.statistics.i.a(a, true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
          goto _L1
        if (context.equals("android.intent.action.TIME_SET") || context.equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            long l = i.e(a);
            if (System.currentTimeMillis() < l)
            {
                com.gtp.a.a.a.a.a().a("\u65F6\u95F4\u88AB\u5F80\u540E\u8C03\u4E86\uFF0C\u9A6C\u4E0A\u542F\u52A8\u4E00\u6B21\u4E0A\u4F20", "statistics_log.txt");
                c.a("CYN", "\u65F6\u95F4\u88AB\u5F80\u540E\u8C03\u4E86\uFF0C\u9A6C\u4E0A\u542F\u52A8\u4E00\u6B21\u4E0A\u4F20");
                com.gau.go.launcherex.gowidget.statistics.i.a(a, 0L);
                com.gau.go.launcherex.gowidget.statistics.i.c(a);
            }
        }
    }
}
