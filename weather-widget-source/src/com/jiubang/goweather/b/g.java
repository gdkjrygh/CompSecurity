// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;

import android.content.Context;
import com.gau.go.launcherex.gowidget.language.e;
import com.jiubang.goweather.e.a;
import java.util.Date;

// Referenced classes of package com.jiubang.goweather.b:
//            e

public class g
{

    public static com.jiubang.goweather.b.e a(Context context, com.jiubang.goweather.b.e e1)
    {
        Object obj;
        String s1;
label0:
        {
            obj = e.a(context);
            s1 = ((e) (obj)).b();
            String s = ((e) (obj)).e();
            if (s != null)
            {
                obj = s;
                if (!"".endsWith(s))
                {
                    break label0;
                }
            }
            obj = "ZZ";
        }
        return a(context, e1, (new StringBuilder()).append(s1).append("_").append(((String) (obj))).toString());
    }

    public static com.jiubang.goweather.b.e a(Context context, com.jiubang.goweather.b.e e1, String s)
    {
        e1.b("date", a());
        e1.a("lang", s);
        e1.a("sys", android.os.Build.VERSION.RELEASE);
        e1.a("ps", "2.0");
        e1.a("chan", "100");
        e1.a("cliVersion", com.jiubang.goweather.e.a.c(context));
        e1.a("cliId", com.gau.go.a.e.b(context));
        return e1;
    }

    public static String a()
    {
        return Long.toString((new Date()).getTime());
    }
}
