// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.f;
import com.gau.go.launcherex.goweather.goplay.a.h;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay:
//            p

public class n
{

    private static n e;
    private final Context a;
    private final Map b = new HashMap();
    private final f c;
    private final h d;
    private final p f = new p(this, null);

    private n(Context context)
    {
        a = context.getApplicationContext();
        com.gau.go.a.e.a(a).a(com.gtp.a.a.b.c.a());
        c = new f(a);
        d = new h(a);
        context = new IntentFilter();
        context.addAction("android.intent.action.PACKAGE_ADDED");
        context.addDataScheme("package");
        a.registerReceiver(f, context);
    }

    public static n a(Context context)
    {
        if (e == null)
        {
            e = new n(context);
        }
        return e;
    }

    public static String a(int i)
    {
        switch (i)
        {
        default:
            return "100";

        case 2: // '\002'
            return "103";

        case 20: // '\024'
            return "102";

        case 32: // ' '
            return "105";

        case 31: // '\037'
            return "104";

        case 6: // '\006'
            return "102";

        case 35: // '#'
            return "108";

        case 36: // '$'
            return "109";

        case 34: // '"'
            return "101";

        case 33: // '!'
            return "100";

        case 1: // '\001'
            return "100";
        }
    }

    static void a(n n1, String s)
    {
        n1.b(s);
    }

    private void a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || b.get(s) != null)
        {
            return;
        } else
        {
            b.put(s, s1);
            return;
        }
    }

    private void b(String s)
    {
        s = (String)b.remove(s);
        if (s == null)
        {
            return;
        } else
        {
            com.gau.go.a.e.a(a).a(s);
            b("\u6210\u529F\u4E0B\u8F7D\u5B89\u88C5\u4E3B\u9898", s);
            return;
        }
    }

    private void b(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[\u64CD\u4F5C\uFF1A");
        stringbuilder.append(s);
        stringbuilder.append("] ");
        stringbuilder.append("[\u4E0A\u4F20\u4FE1\u606F\uFF1A");
        stringbuilder.append(s1);
        stringbuilder.append("]");
        s = stringbuilder.toString();
        com.gtp.a.a.b.c.a("ThemeStatisticsManager", s);
        com.gtp.a.a.a.a.a().a(s, "theme_statistics.txt");
    }

    private static String c(String s)
    {
        String s1 = "\u4ECE\u5929\u6C14\u4E3B\u754C\u9762\u8FDB\u5165\u5546\u5E97";
        if ("101".equals(s))
        {
            s1 = "\u4ECE\u5929\u6C14\u4E3B\u754C\u9762\u7684\u66F4\u591A\u83DC\u5355\u8FDB\u5165\u5546\u5E97";
        } else
        {
            if ("102".equals(s))
            {
                return "\u4ECEGOWidget\u8FDB\u5165\u5546\u5E97";
            }
            if ("103".equals(s))
            {
                return "\u4ECE\u7CFB\u7EDFWidget\u8FDB\u5165\u5546\u5E97";
            }
            if ("104".equals(s))
            {
                return "\u4ECEGOWidget\u7684\u5C0F\u661F\u661F\u8FDB\u5165\u5546\u5E97";
            }
            if ("105".equals(s))
            {
                return "\u4ECE\u7CFB\u7EDFWidget\u7684\u5C0F\u661F\u661F\u8FDB\u5165\u5546\u5E97";
            }
            if ("109".equals(s))
            {
                return "\u4ECE\u7CFB\u7EDFWidget\u4E00\u952E\u5207\u6362\u4E3B\u9898\u8FDB\u5165\u5546\u5E97";
            }
            if ("108".equals(s))
            {
                return "\u4ECEGOWidget\u4E00\u952E\u5207\u6362\u4E3B\u9898\u8FDB\u5165\u5546\u5E97";
            }
            if ("100".equals(s))
            {
                return "\u4ECE\u5929\u6C14\u4E3B\u754C\u9762\u8FDB\u5165\u5546\u5E97";
            }
        }
        return s1;
    }

    public void a()
    {
        c.a();
        c.b("click_vip");
        String s = c.b();
        com.gau.go.a.e.a(a).a(s);
        b("\u70B9\u51FBVIP\u5165\u53E3", s);
    }

    public void a(String s)
    {
        c.a();
        c.b("g001");
        c.e(s);
        String s1 = c.b();
        com.gau.go.a.e.a(a).a(s1);
        b(c(s), s1);
    }

    public void a(String s, int i, float f1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        d.a();
        d.d(s);
        d.b("j009");
        d.c(String.valueOf(i));
        d.i((new StringBuilder()).append(f1).append(":coin").toString());
        String s1 = d.b();
        com.gau.go.a.e.a(a).a(s1);
        if (i == 1)
        {
            s = "Fortumo\u6210\u529F\u8D2D\u4E70\u4E3B\u9898";
        } else
        {
            s = "\u70B9\u51FBFortumo\u8D2D\u4E70\u4E3B\u9898";
        }
        b(s, s1);
    }

    public void a(String s, long l, String s1, int i)
    {
        c.a();
        c.d(String.valueOf(l));
        c.g(s1);
        c.h(String.valueOf(i));
        c.b("b000");
        a(s, c.b());
    }

    public void a(String s, boolean flag)
    {
        c.a();
        c.d(s);
        Object obj = c;
        StringBuilder stringbuilder;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        ((f) (obj)).c(s);
        c.b("i000");
        obj = c.b();
        com.gau.go.a.e.a(a).a(((String) (obj)));
        stringbuilder = (new StringBuilder()).append("\u5E94\u7528\u4E3B\u9898");
        if (flag)
        {
            s = "\u6210\u529F";
        } else
        {
            s = "\u5931\u8D25";
        }
        b(stringbuilder.append(s).toString(), ((String) (obj)));
    }

    public void b(String s, int i, float f1)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        }
        d.a();
        d.d(s);
        d.b("j005");
        d.c(String.valueOf(i));
        d.i((new StringBuilder()).append(f1).append(":coin").toString());
        String s1 = d.b();
        com.gau.go.a.e.a(a).a(s1);
        if (i == 1)
        {
            s = "GooglePlay\u6210\u529F\u8D2D\u4E70\u4E3B\u9898";
        } else
        {
            s = "\u70B9\u51FBGooglePlay\u8D2D\u4E70\u4E3B\u9898";
        }
        b(s, s1);
    }
}
