// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gtp.a.a.b.c;
import com.jiubang.core.b.a;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            w, r

public class q
{

    private static q a;
    private Context b;

    private q(Context context)
    {
        b = context;
    }

    static Context a(q q1)
    {
        return q1.b;
    }

    public static q a(Context context)
    {
        com/gau/go/launcherex/gowidget/statistics/q;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new q(context);
        }
        context = a;
        com/gau/go/launcherex/gowidget/statistics/q;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static String a(int i)
    {
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        default:
            return "4";

        case 0: // '\0'
            return "1";

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return "2";

        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 14: // '\016'
            return "3";
        }
    }

    private String a(Context context, com.gau.go.launcherex.gowidget.statistics.a.a a1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        Object obj = GoWidgetApplication.c(context.getApplicationContext()).a();
        stringbuffer.append("41").append("||");
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, com.gau.go.launcherex.gowidget.statistics.w.a(((android.content.SharedPreferences) (obj))));
        stringbuffer.append(a1.a()).append("||");
        stringbuffer.append(a1.b()).append("||");
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, a1.c());
        stringbuffer.append(a1.d()).append("||");
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, w.n(context));
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, w.f(context));
        stringbuffer.append(com.gau.go.launcherex.gowidget.statistics.w.e(context)).append("||");
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, com.gau.go.launcherex.gowidget.statistics.w.c(context));
        stringbuffer.append(a1.e()).append("||");
        stringbuffer.append(a1.f()).append("||");
        stringbuffer.append(a1.g()).append("||");
        String s = w.d(context);
        obj = s;
        if (s == null)
        {
            obj = "0000000000000000";
        }
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, ((String) (obj)));
        com.gau.go.launcherex.gowidget.statistics.w.a(stringbuffer, e.b(context));
        stringbuffer.append(a1.h()).append("||");
        stringbuffer.append(a1.i()).append("||");
        stringbuffer.append(a1.j()).append("||");
        stringbuffer.append(a1.k()).append("||");
        stringbuffer.append(w.w(context)).append("\r\n");
        context = stringbuffer.toString();
        a(a1, ((String) (context)));
        return context;
    }

    static String a(q q1, Context context, com.gau.go.launcherex.gowidget.statistics.a.a a1)
    {
        return q1.a(context, a1);
    }

    private void a(com.gau.go.launcherex.gowidget.statistics.a.a a1, String s)
    {
        String s1 = a1.c();
        switch (a1.a())
        {
        default:
            return;

        case 93: // ']'
            a(s1, s);
            return;

        case 109: // 'm'
            b(s1, s);
            return;

        case 117: // 'u'
            c(s1, s);
            return;

        case 183: 
            d(s1, s);
            break;
        }
    }

    private void a(String s, String s1)
    {
        if (s.equals("news001"))
        {
            com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011Widget\u5C0F\u661F\u661F\u663E\u793A: ").append(s1).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011Widget\u5C0F\u661F\u661F\u663E\u793A\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
        } else
        {
            if (s.equals("news002"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u9884\u8B66\u901A\u77E5\u680F\u6253\u5F00: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u9884\u8B66\u901A\u77E5\u680F\u6253\u5F00\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_shop"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762\u4E0A\u70B9\u51FB\u4E3B\u9898\u5546\u5E97\u56FE\u6807\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_clock"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762\u4E0A\u70B9\u51FB\u4E16\u754C\u65F6\u949F\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_wpcoin"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u4FA7\u8FB9\u680F\u56FE\u6807\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_citynam"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u57CE\u5E02\u540D\u79F0\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_adcity"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u6DFB\u52A0\u57CE\u5E02\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_vip"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F---\u70B9\u51FB\u9AD8\u7EA7\u529F\u80FD\u5165\u53E3\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_fucsetting"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F---\u70B9\u51FB\u529F\u80FD\u8BBE\u7F6E\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_msgc"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F---\u70B9\u51FB\u6D88\u606F\u4E2D\u5FC3\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_qa"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F----\u70B9\u51FB\u95EE\u9898\u53CD\u9988\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_fb"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F----\u70B9\u51FBfacebook\u5165\u53E3\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_sharepic"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u56FE\u7247\u5206\u4EAB\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_radio"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u96F7\u8FBE\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_rain"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u964D\u96E8\u6982\u7387\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("24_hour_weather"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u5C0F\u65F6\u5929\u6C14\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_moeweather"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u591A\u5929\u5929\u6C14\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_wind"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u98CE\u529B\u98CE\u5411\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("c000_gl"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762---\u70B9\u51FB\u751F\u6D3B\u5316\u6307\u6570\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("g001"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u8FDB\u5165\u4E3B\u754C\u9762\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("up_detail"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4E3B\u754C\u9762\u5F53\u524D\u5929\u6C14\u9875\u6253\u5F00tab\u83DC\u5355\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("ent_wp"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u4FA7\u8FB9\u680F\u6253\u5F00\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("sel_dau_city"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u9996\u6B21\u6DFB\u52A0\u57CE\u5E02, \u6DFB\u52A0\u5B9A\u4F4D\u7684\u57CE\u5E02\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("sel_oth_city"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u9996\u6B21\u6DFB\u52A0\u57CE\u5E02, \u6DFB\u52A0\u975E\u5B9A\u4F4D\u57CE\u5E02\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("widget_theme_ts_ap"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u5728\u4E3B\u9898\u5546\u5E97\u5E94\u7528widget\u4E3B\u9898\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("widget_theme_ad_ap"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u5728widget\u6DFB\u52A0\u754C\u9762\u5E94\u7528widget\u4E3B\u9898\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("cancel_my_flow_my_loc"))
            {
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u5220\u9664\u8FFD\u968F\u6211\u7684\u4F4D\u7F6E\u7684\u57CE\u5E02\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
        }
    }

    private void b(String s, String s1)
    {
        if (s.equals("f000"))
        {
            com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u5F39\u51FA\u8BC4\u5206\u5F39\u6846: ").append(s1).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u5F39\u51FA\u8BC4\u5206\u5F39\u6846\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
        } else
        {
            if (s.equals("score"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u8BC4\u5206\u6309\u94AE: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u8BC4\u5206\u6309\u94AE\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
            if (s.equals("cancel"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u53D6\u6D88\u8BC4\u5206\u6309\u94AE: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u53D6\u6D88\u8BC4\u5206\u6309\u94AE\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
                return;
            }
        }
    }

    private void c(String s, String s1)
    {
        if (s.equals("g001"))
        {
            com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u8FDB\u5165\u56FE\u7247\u5206\u4EAB: ").append(s1).toString());
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u70B9\u51FB\u8FDB\u5165\u56FE\u7247\u5206\u4EAB\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
        } else
        {
            if (s.equals("click_picture_well_chosen\240"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u7CBE\u9009\u56FE\u7247: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u7CBE\u9009\u56FE\u7247\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("click_picture_city"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u57CE\u5E02\u56FE\u7247: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u57CE\u5E02\u56FE\u7247\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("click_photo"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u62CD\u7167\u6309\u94AE: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u62CD\u7167\u6309\u94AE\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("click_picture_head"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u8FDB\u5165\u6211\u7684\u56FE\u7247: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u754C\u9762\u70B9\u51FB\u8FDB\u5165\u6211\u7684\u56FE\u7247\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("exellent_add"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u3001\u6216\u6211\u7684\u56FE\u7247\u4E2D\u70B9\u8D5E: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u3001\u6216\u6211\u7684\u56FE\u7247\u4E2D\u70B9\u8D5E\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("exellent_minus"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u3001\u6216\u6211\u7684\u56FE\u7247\u4E2D\u53D6\u6D88\u8D5E: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u3001\u6216\u6211\u7684\u56FE\u7247\u4E2D\u53D6\u6D88\u8D5E\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("click_fs"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u70B9\u51FB\u8FDB\u5165\u56FE\u7247\u8BE6\u60C5: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u7011\u5E03\u56FE\u7247\u70B9\u51FB\u8FDB\u5165\u56FE\u7247\u8BE6\u60C5\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("delete_click"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u6211\u7684\u56FE\u7247\u754C\u9762\u70B9\u51FB\u5220\u9664\u56FE\u7247: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u6211\u7684\u56FE\u7247\u754C\u9762\u70B9\u51FB\u5220\u9664\u56FE\u7247\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("delete_confirm"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u6211\u7684\u56FE\u7247\u754C\u9762\u70B9\u51FB\u786E\u8BA4\u5220\u9664\u56FE\u7247: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u6211\u7684\u56FE\u7247\u754C\u9762\u70B9\u51FB\u786E\u8BA4\u5220\u9664\u56FE\u7247\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("fs_exellent_add"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u70B9\u8D5E: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u70B9\u8D5E\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("fs_exellent_minus"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u53D6\u6D88\u8D5E: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u53D6\u6D88\u8D5E\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("fs_set_background"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u8BBE\u7F6E\u56FE\u7247\u80CC\u666F: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u56FE\u7247\u8BE6\u60C5\u754C\u9762\u8BBE\u7F6E\u56FE\u7247\u80CC\u666F\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("preview"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u8BBE\u7F6E\u80CC\u666F\u65F6\u6253\u5F00\u9884\u89C8\u5F00\u5173: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u8BBE\u7F6E\u80CC\u666F\u65F6\u6253\u5F00\u9884\u89C8\u5F00\u5173\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
            if (s.equals("share_photo"))
            {
                com.gtp.a.a.b.c.a("LH", (new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u62CD\u7167\u540E\u70B9\u51FB\u5206\u4EAB: ").append(s1).toString());
                com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u3010\u5B9E\u65F6\u7EDF\u8BA1\u6570\u636E\u3011\u62CD\u7167\u540E\u70B9\u51FB\u5206\u4EAB\uFF1A \r\n").append(s1).toString(), "photo_log.txt");
                return;
            }
        }
    }

    private void d(String s, String s1)
    {
        if (s.equals("a000"))
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("GO\u5E7F\u544A\u4E0B\u8F7D\u70B9\u51FB : \u70B9\u51FB\u63A8\u8350\u56FE\u6807\uFF08\u5E7F\u544A\uFF09\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
        } else
        if (s.equals("b000"))
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("GO\u5E7F\u544A\u4E0B\u8F7D\u5B89\u88C5 : \u7528\u6237\u5728\u5E94\u7528\u4E0B\u8F7D\u5B8C\u6210\u540E\uFF0C\u70B9\u51FB\u786E\u8BA4\u5B89\u88C5\uFF08\u6216\u8005\u81EA\u52A8\u5B89\u88C5\u6210\u529F\uFF09\uFF1A \r\n").append(s1).toString(), "statistics_log.txt");
            return;
        }
    }

    public void a(com.gau.go.launcherex.gowidget.statistics.a.a a1)
    {
        if (!TextUtils.isEmpty(a1.c()))
        {
            (new r(this, a1)).execute(new Void[0]);
        }
    }
}
