// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.goplay.a;

import android.content.Context;

// Referenced classes of package com.gau.go.launcherex.goweather.goplay.a:
//            a

public class d extends a
{

    public d(Context context, String s)
    {
        super(context, "103", s);
    }

    public void a()
    {
        m = "0";
        j = "0";
        k = "1";
        r = "0";
        s = "0";
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        stringbuilder.append("||");
        stringbuilder.append(c);
        stringbuilder.append("||");
        stringbuilder.append(d);
        stringbuilder.append("||");
        stringbuilder.append(q);
        stringbuilder.append("||");
        b = a("%Y-%m-%d %H:%M:%S");
        stringbuilder.append(b);
        stringbuilder.append("||");
        stringbuilder.append(e);
        stringbuilder.append("||");
        stringbuilder.append(f);
        stringbuilder.append("||");
        stringbuilder.append(g);
        stringbuilder.append("||");
        stringbuilder.append(h);
        stringbuilder.append("||");
        stringbuilder.append(w);
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append("");
        stringbuilder.append("||");
        stringbuilder.append(i);
        stringbuilder.append("||");
        stringbuilder.append(m);
        stringbuilder.append("||");
        stringbuilder.append(j);
        stringbuilder.append("||");
        stringbuilder.append(k);
        stringbuilder.append("||");
        stringbuilder.append(n);
        stringbuilder.append("||");
        stringbuilder.append(o);
        stringbuilder.append("||");
        stringbuilder.append(p);
        stringbuilder.append("||");
        stringbuilder.append(r);
        stringbuilder.append("||");
        stringbuilder.append(x);
        stringbuilder.append("||");
        stringbuilder.append(s);
        return stringbuilder.toString();
    }
}
