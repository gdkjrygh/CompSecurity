// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.a.a;

import android.content.Context;
import com.gau.go.a.e;
import com.gau.go.launcherex.gowidget.billing.p;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.a.a;

// Referenced classes of package com.gtp.go.weather.a.a:
//            a

public class b
{

    private static b a;
    private Context b;

    private b(Context context)
    {
        b = context;
    }

    public static b a(Context context)
    {
        com/gtp/go/weather/a/a/b;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new b(context);
        }
        context = a;
        com/gtp/go/weather/a/a/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a(com.gtp.go.weather.a.a.a a1)
    {
        e e1 = e.a(b);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(41);
        stringbuilder.append("||");
        stringbuilder.append(w.v(b));
        stringbuilder.append("||");
        stringbuilder.append(com.gau.go.a.f.e.a());
        stringbuilder.append("||");
        stringbuilder.append(173);
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append(a1.a());
        stringbuilder.append("||");
        stringbuilder.append(1);
        stringbuilder.append("||");
        stringbuilder.append(p.a(b));
        stringbuilder.append("||");
        stringbuilder.append(w.f(b));
        stringbuilder.append("||");
        stringbuilder.append(w.e(b));
        stringbuilder.append("||");
        stringbuilder.append(w.c(b));
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append(0);
        stringbuilder.append("||");
        stringbuilder.append(e.b(b));
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append(a1.b());
        com.gtp.a.a.a.a.a().a(stringbuilder.toString(), "photo_upload.txt");
        e1.a(stringbuilder.toString());
    }
}
